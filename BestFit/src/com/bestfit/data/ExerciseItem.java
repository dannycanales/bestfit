
package com.bestfit.data;

import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;

@PersistenceCapable
public class ExerciseItem implements IsSerializable, Serializable {

	@Persistent
	@PrimaryKey
	private String name;
	@Persistent
	private double burnRate;
	@NotPersistent
	private static final long serialVersionUID = 3881785407988537441L;

	public ExerciseItem() {
		super();
	}   

	public ExerciseItem(String _name, double _burnRate) {
		name = _name;
		burnRate = _burnRate;
	}
 
	public double getBurnRate30() {
		return burnRate;
	}

	public void setBurnRate30(double _burnRate) {
		burnRate = _burnRate;
	}   
	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		ExerciseItem item = (ExerciseItem)o;
		return name.equals(item.name);
	}

	public String toString() {
		return "[NAME:\"" + name + "\":(BURNRATE:" + burnRate + ")]";
	}
}
