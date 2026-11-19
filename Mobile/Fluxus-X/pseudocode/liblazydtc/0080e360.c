/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080e360
 */

void FUN_0080e360(long param_1)

{
  long lVar1;
  void *pvVar2;
  __shared_weak_count *this;
  
  this = *(__shared_weak_count **)(param_1 + 0x58);
  if ((this == (__shared_weak_count *)0x0) ||
     (lVar1 = FUN_00c2bd10(0xffffffffffffffff,this + 8), lVar1 != 0)) {
    pvVar2 = *(void **)(param_1 + 0x38);
  }
  else {
    (**(code **)(*(long *)this + 0x10))(this);
    std::__ndk1::__shared_weak_count::__release_weak(this);
    pvVar2 = *(void **)(param_1 + 0x38);
  }
  if (pvVar2 == (void *)0x0) {
    return;
  }
  *(void **)(param_1 + 0x40) = pvVar2;
  operator_delete(pvVar2,*(long *)(param_1 + 0x48) - (long)pvVar2);
  return;
}

