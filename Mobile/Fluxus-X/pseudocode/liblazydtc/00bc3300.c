/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3300
 */

/* std::experimental::bad_optional_access::~bad_optional_access() */

void __thiscall
std::experimental::bad_optional_access::~bad_optional_access(bad_optional_access *this)

{
  ~bad_optional_access(this);
  operator_delete(this,0x10);
  return;
}

