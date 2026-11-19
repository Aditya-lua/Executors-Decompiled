/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0dda4
 */

/* std::type_info::~type_info() */

void __thiscall std::type_info::~type_info(type_info *this)

{
  ~type_info(this);
  operator_delete(this,0x10);
  return;
}

