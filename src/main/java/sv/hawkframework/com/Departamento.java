package sv.hawkframework.com;

import sv.hawkframework.com.ORM.Annotations.DataModelAnnotations;
import sv.hawkframework.com.ORM.Annotations.PrimaryKey;

@DataModelAnnotations(tableName = "departamento")
public class Departamento {
	
	@PrimaryKey
	private Integer id;
	private String codigo;
	private String nombre;
	
	public Departamento() {
		
	}
	public Departamento(Integer id, String codigo, String nombre) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
