/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e8d34
 */

/* cpr::Cookies::begin() const */

undefined8 __thiscall cpr::Cookies::begin(Cookies *this)

{
  return *(undefined8 *)(this + 8);
}

