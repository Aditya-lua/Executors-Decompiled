/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e8d44
 */

/* cpr::Cookies::cbegin() const */

undefined8 __thiscall cpr::Cookies::cbegin(Cookies *this)

{
  return *(undefined8 *)(this + 8);
}

