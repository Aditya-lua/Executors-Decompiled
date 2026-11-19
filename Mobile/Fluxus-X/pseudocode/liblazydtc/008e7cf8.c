/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e7cf8
 */

/* cpr::Cookie::GetExpires() const */

undefined8 __thiscall cpr::Cookie::GetExpires(Cookie *this)

{
  return *(undefined8 *)(this + 0x70);
}

