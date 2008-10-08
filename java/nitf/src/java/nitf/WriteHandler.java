package nitf;

/**
 * The WriteHandler class is essentially an interface for writing to an
 * IOHandle, but is an abstract class because under the covers it sets up some
 * native code that will facilitate the callback to your write method.
 */
public abstract class WriteHandler extends DestructibleObject
{

    /**
     * Default constructor
     */
    public WriteHandler()
    {
        construct();
    }

    private native void construct();

    protected native void destructMemory();

    /**
     * Write to the given IOHandle. This is user-defined.
     * 
     * @param io
     * @throws NITFException
     */
    public abstract void write(IOHandle io) throws NITFException;

}
