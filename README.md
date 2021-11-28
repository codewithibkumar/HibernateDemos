# HibernateDemos

## Hibernate
Hibernate is an ORM (object relation mapping) tool.
It is used to map object into relation (table).

## Hibernate Configuration

<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
	"http://hibernate.org/dtd/hibernate-configuration-3.0.dtd">
	
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/hiberdb</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">pass</property>
        <property name="hibernate.connection.pool_size">1</property>
                <property name="hibernate.show_sql">true</property>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</property>
        <property name="hbm2ddl.auto">create</property> 

	<mapping class="com.hibernate.Student"></mapping>
        
    </session-factory>
</hibernate-configuration>
