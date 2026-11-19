/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eae44
 */

/* cpr::EncodedAuthentication::GetAuthString() const */

EncodedAuthentication * __thiscall
cpr::EncodedAuthentication::GetAuthString(EncodedAuthentication *this)

{
  if (((byte)this[8] & 1) == 0) {
    return this + 9;
  }
  return *(EncodedAuthentication **)(this + 0x18);
}

