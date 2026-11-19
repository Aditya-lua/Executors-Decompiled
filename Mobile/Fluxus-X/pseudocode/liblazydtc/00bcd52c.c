/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd52c
 */

/* std::__ndk1::__thread_struct::~__thread_struct() */

void __thiscall std::__ndk1::__thread_struct::~__thread_struct(__thread_struct *this)

{
  void *pvVar1;
  
  pvVar1 = *(void **)this;
  if (pvVar1 == (void *)0x0) {
    return;
  }
  FUN_00bcd424(pvVar1);
  operator_delete(pvVar1,0x30);
  return;
}

