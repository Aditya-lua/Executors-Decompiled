/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d9f4
 */

/* std::exception::~exception() */

void __thiscall std::exception::~exception(exception *this)

{
  bad_exception::~bad_exception((bad_exception *)this);
  operator_delete(this,8);
  return;
}

