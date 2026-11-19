/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084dba4
 */

void FUN_0084dba4(undefined8 *param_1)

{
  long lVar1;
  void *pvVar2;
  __shared_weak_count *this;
  
  pvVar2 = (void *)*param_1;
  *param_1 = 0;
  if (pvVar2 == (void *)0x0) {
    return;
  }
  if (((*(char *)(param_1 + 2) == '\x01') &&
      (this = *(__shared_weak_count **)((long)pvVar2 + 0x20), this != (__shared_weak_count *)0x0))
     && (lVar1 = FUN_00c2bd10(0xffffffffffffffff,this + 8), lVar1 == 0)) {
    (**(code **)(*(long *)this + 0x10))(this);
    std::__ndk1::__shared_weak_count::__release_weak(this);
  }
  operator_delete(pvVar2,0x28);
  return;
}

