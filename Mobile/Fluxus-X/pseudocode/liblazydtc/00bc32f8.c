/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc32f8
 */

/* std::experimental::bad_optional_access::~bad_optional_access() */

void __thiscall
std::experimental::bad_optional_access::~bad_optional_access(bad_optional_access *this)

{
  domain_error::~domain_error((domain_error *)this);
  return;
}

