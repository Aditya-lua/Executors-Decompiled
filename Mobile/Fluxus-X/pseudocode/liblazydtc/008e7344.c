/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e7344
 */

/* cpr::Authentication::~Authentication() */

void __thiscall cpr::Authentication::~Authentication(Authentication *this)

{
                    /* try { // try from 008e7354 to 008e7357 has its CatchHandler @ 008e737c */
  util::secureStringClear((basic_string_conflict *)this);
  if (((byte)*this & 1) == 0) {
    return;
  }
  operator_delete(*(void **)(this + 0x10));
  return;
}

