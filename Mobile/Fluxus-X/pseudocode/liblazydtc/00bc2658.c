/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2658
 */

/* std::exception_ptr::__from_native_exception_pointer(void*) */

void __thiscall
std::exception_ptr::__from_native_exception_pointer(exception_ptr *this,void *param_1)

{
  undefined8 *in_x8;
  
  *in_x8 = this;
  __cxa_increment_exception_refcount();
  return;
}

