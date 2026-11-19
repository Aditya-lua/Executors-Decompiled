/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb690
 */

/* std::__ndk1::locale::id::__get() */

long __thiscall std::__ndk1::locale::id::__get(id *this)

{
  id *local_30;
  undefined1 **local_28;
  undefined1 *local_8;
  
  local_8 = (undefined1 *)&local_30;
  if (*(long *)this != -1) {
    local_28 = &local_8;
    local_30 = this;
    __call_once((ulong *)this,&local_28,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  return (long)*(int *)(this + 8) + -1;
}

