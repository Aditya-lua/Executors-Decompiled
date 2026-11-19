/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eade4
 */

/* cpr::EncodedAuthentication::~EncodedAuthentication() */

void __thiscall cpr::EncodedAuthentication::~EncodedAuthentication(EncodedAuthentication *this)

{
  *(undefined ***)this = &PTR__EncodedAuthentication_00c4e7a8;
                    /* try { // try from 008eae08 to 008eae0f has its CatchHandler @ 008eae30 */
  util::secureStringClear((basic_string_conflict *)(this + 8));
  if (((byte)*(basic_string_conflict *)(this + 8) & 1) != 0) {
    operator_delete(*(void **)(this + 0x18));
  }
  operator_delete(this);
  return;
}

