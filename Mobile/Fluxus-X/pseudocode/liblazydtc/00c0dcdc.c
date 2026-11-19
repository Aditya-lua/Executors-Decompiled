/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0dcdc
 */

/* std::out_of_range::~out_of_range() */

void __thiscall std::out_of_range::~out_of_range(out_of_range *this)

{
  domain_error::~domain_error((domain_error *)this);
  operator_delete(this,0x10);
  return;
}

