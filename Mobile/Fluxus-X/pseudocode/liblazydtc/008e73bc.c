/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e73bc
 */

/* cpr::Authentication::GetAuthMode() const */

undefined4 __thiscall cpr::Authentication::GetAuthMode(Authentication *this)

{
  return *(undefined4 *)(this + 0x18);
}

