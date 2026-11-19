/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc25f0
 */

/* std::exception_ptr::exception_ptr(std::exception_ptr const&) */

void __thiscall std::exception_ptr::exception_ptr(exception_ptr *this,exception_ptr *param_1)

{
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)param_1;
  *(undefined8 *)this = uVar1;
  __cxa_increment_exception_refcount(uVar1);
  return;
}

