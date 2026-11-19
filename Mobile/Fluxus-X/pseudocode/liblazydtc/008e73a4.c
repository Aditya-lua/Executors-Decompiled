/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e73a4
 */

/* cpr::Authentication::GetAuthString() const */

Authentication * __thiscall cpr::Authentication::GetAuthString(Authentication *this)

{
  if (((byte)*this & 1) == 0) {
    return this + 1;
  }
  return *(Authentication **)(this + 0x10);
}

