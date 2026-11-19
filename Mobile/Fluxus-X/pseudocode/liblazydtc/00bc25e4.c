/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc25e4
 */

/* std::exception_ptr::~exception_ptr() */

void __thiscall std::exception_ptr::~exception_ptr(exception_ptr *this)

{
  __cxa_decrement_exception_refcount(*(undefined8 *)this);
  return;
}

