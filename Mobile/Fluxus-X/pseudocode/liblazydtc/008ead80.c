/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ead80
 */

/* cpr::EncodedAuthentication::~EncodedAuthentication() */

void __thiscall cpr::EncodedAuthentication::~EncodedAuthentication(EncodedAuthentication *this)

{
  *(undefined ***)this = &PTR__EncodedAuthentication_00c4e7a8;
                    /* try { // try from 008eada4 to 008eadab has its CatchHandler @ 008eadd0 */
  util::secureStringClear((basic_string_conflict *)(this + 8));
  if (((byte)*(basic_string_conflict *)(this + 8) & 1) == 0) {
    return;
  }
  operator_delete(*(void **)(this + 0x18));
  return;
}

