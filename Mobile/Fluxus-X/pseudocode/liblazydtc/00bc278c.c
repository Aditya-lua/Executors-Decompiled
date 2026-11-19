/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc278c
 */

/* std::__ndk1::bad_function_call::~bad_function_call() */

void __thiscall std::__ndk1::bad_function_call::~bad_function_call(bad_function_call *this)

{
  ~bad_function_call(this);
  operator_delete(this,8);
  return;
}

