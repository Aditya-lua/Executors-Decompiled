/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0da8c
 */

/* std::bad_alloc::~bad_alloc() */

void __thiscall std::bad_alloc::~bad_alloc(bad_alloc *this)

{
  bad_exception::~bad_exception((bad_exception *)this);
  operator_delete(this,8);
  return;
}

