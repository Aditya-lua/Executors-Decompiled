/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0db7c
 */

/* std::logic_error::~logic_error() */

void __thiscall std::logic_error::~logic_error(logic_error *this)

{
  domain_error::~domain_error((domain_error *)this);
  operator_delete(this,0x10);
  return;
}

