/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb6f8
 */

/* std::__ndk1::locale::use_facet(std::__ndk1::locale::id&) const */

void __thiscall std::__ndk1::locale::use_facet(locale *this,id *param_1)

{
  long lVar1;
  long lVar2;
  id *local_38;
  id ***local_30;
  id **local_28;
  
  lVar2 = *(long *)this;
  local_38 = param_1;
  if (*(long *)param_1 != -1) {
    local_28 = &local_38;
    local_30 = &local_28;
    __call_once((ulong *)param_1,&local_30,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar1 = *(long *)(lVar2 + 0x10);
  if (((ulong)(*(long *)(lVar2 + 0x18) - lVar1 >> 3) <= (long)*(int *)(param_1 + 8) - 1U) ||
     (*(long *)(lVar1 + ((long)*(int *)(param_1 + 8) - 1U) * 8) == 0)) {
                    /* WARNING: Subroutine does not return */
    FUN_00bd8968();
  }
  return;
}

