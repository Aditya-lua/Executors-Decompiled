/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc32b0
 */

/* std::bad_optional_access::~bad_optional_access() */

void __thiscall std::bad_optional_access::~bad_optional_access(bad_optional_access *this)

{
  bad_exception::~bad_exception((bad_exception *)this);
  return;
}

