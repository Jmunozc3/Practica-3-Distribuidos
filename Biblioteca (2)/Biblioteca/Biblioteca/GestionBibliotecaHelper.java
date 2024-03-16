package Biblioteca;


/**
* Biblioteca/GestionBibliotecaHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./Biblioteca.idl
* viernes 15 de marzo de 2024 20H06' CET
*/


// Define la interfaz para el sistema de gestión de la biblioteca
abstract public class GestionBibliotecaHelper
{
  private static String  _id = "IDL:Biblioteca/GestionBiblioteca:1.0";

  public static void insert (org.omg.CORBA.Any a, Biblioteca.GestionBiblioteca that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Biblioteca.GestionBiblioteca extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Biblioteca.GestionBibliotecaHelper.id (), "GestionBiblioteca");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Biblioteca.GestionBiblioteca read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GestionBibliotecaStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Biblioteca.GestionBiblioteca value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Biblioteca.GestionBiblioteca narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Biblioteca.GestionBiblioteca)
      return (Biblioteca.GestionBiblioteca)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Biblioteca._GestionBibliotecaStub stub = new Biblioteca._GestionBibliotecaStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Biblioteca.GestionBiblioteca unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Biblioteca.GestionBiblioteca)
      return (Biblioteca.GestionBiblioteca)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Biblioteca._GestionBibliotecaStub stub = new Biblioteca._GestionBibliotecaStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
