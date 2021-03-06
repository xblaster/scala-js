package java.lang

class StringBuilder(private var content: String) extends CharSequence
                                                    with Appendable
                                                    with java.io.Serializable {
  def this() = this("")
  def this(initialCapacity: Int) = this("")
  def this(csq: CharSequence) = this(csq.toString)

  def append(s: String): StringBuilder = {
    content += s
    this
  }

  def append(b: Boolean): StringBuilder = append(b.toString())
  def append(c: Char): StringBuilder = append(c.toString())
  def append(b: Byte): StringBuilder = append(b.toString())
  def append(s: Short): StringBuilder = append(s.toString())
  def append(i: Int): StringBuilder = append(i.toString())
  def append(lng: Long): StringBuilder = append(lng.toString())
  def append(f: Float): StringBuilder = append(f.toString())
  def append(d: Double): StringBuilder = append(d.toString())

  def append(obj: AnyRef): StringBuilder = append(obj.toString())

  def append(csq: CharSequence): StringBuilder = append(csq.toString())
  def append(csq: CharSequence, start: Int, end: Int): StringBuilder =
    append(csq.subSequence(start, end).toString())

  override def toString() = content

  def length() = content.length()

  def charAt(index: Int) = content.charAt(index)
  def codePointAt(index: Int) = content.codePointAt(index)

  def subSequence(start: Int, end: Int): CharSequence = substring(start, end)
  def substring(start: Int): String = content.substring(start)
  def substring(start: Int, end: Int): String = content.substring(start, end)
}
