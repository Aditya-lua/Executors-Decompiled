/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb600
 */

/* std::__ndk1::locale::has_facet(std::__ndk1::locale::id&) const */

bool __thiscall std::__ndk1::locale::has_facet(locale *this,id *param_1)

{
  long lVar1;
  bool bVar2;
  long lVar3;
  id *local_38;
  id ***local_30;
  id **local_28;
  
  lVar3 = *(long *)this;
  if (*(long *)param_1 != -1) {
    local_28 = &local_38;
    local_30 = &local_28;
    local_38 = param_1;
    __call_once((ulong *)param_1,&local_30,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar1 = *(long *)(lVar3 + 0x10);
  if ((long)*(int *)(param_1 + 8) - 1U < (ulong)(*(long *)(lVar3 + 0x18) - lVar1 >> 3)) {
    bVar2 = *(long *)(lVar1 + ((long)*(int *)(param_1 + 8) - 1U) * 8) != 0;
  }
  else {
    bVar2 = false;
  }
  return bVar2;
}

