/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008247c0
 */

/* WARNING: Type propagation algorithm not settling */

void FUN_008247c0(long param_1)

{
  byte bVar1;
  void *pvVar2;
  long lVar3;
  __shared_weak_count *this;
  void *pvVar4;
  void *pvVar5;
  
  if ((*(byte *)(param_1 + 0xe0) & 1) == 0) {
    bVar1 = *(byte *)(param_1 + 200);
  }
  else {
    operator_delete(*(void **)(param_1 + 0xf0),*(ulong *)(param_1 + 0xe0) & 0xfffffffffffffffe);
    bVar1 = *(byte *)(param_1 + 200);
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = *(byte *)(param_1 + 0xb0);
  }
  else {
    operator_delete(*(void **)(param_1 + 0xd8),*(ulong *)(param_1 + 200) & 0xfffffffffffffffe);
    bVar1 = *(byte *)(param_1 + 0xb0);
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = *(byte *)(param_1 + 0x98);
  }
  else {
    operator_delete(*(void **)(param_1 + 0xc0),*(ulong *)(param_1 + 0xb0) & 0xfffffffffffffffe);
    bVar1 = *(byte *)(param_1 + 0x98);
  }
  if ((bVar1 & 1) == 0) {
    pvVar5 = *(void **)(param_1 + 0x78);
  }
  else {
    operator_delete(*(void **)(param_1 + 0xa8),*(ulong *)(param_1 + 0x98) & 0xfffffffffffffffe);
    pvVar5 = *(void **)(param_1 + 0x78);
  }
  if (pvVar5 != (void *)0x0) {
    pvVar4 = *(void **)(param_1 + 0x80);
    pvVar2 = pvVar5;
    if (pvVar5 != pvVar4) {
      do {
        pvVar4 = (void *)((long)pvVar4 + -0x78);
        FUN_008271dc(pvVar4);
      } while (pvVar4 != pvVar5);
      pvVar2 = *(void **)(param_1 + 0x78);
    }
    *(void **)(param_1 + 0x80) = pvVar5;
    operator_delete(pvVar2,*(long *)(param_1 + 0x88) - (long)pvVar2);
  }
  *(undefined ***)(param_1 + 0x48) = &PTR_LAB_00c489d0;
  if ((*(byte *)(param_1 + 0x50) & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x60),*(ulong *)(param_1 + 0x50) & 0xfffffffffffffffe);
  }
  FUN_00827168(param_1 + 0x30,*(undefined8 *)(param_1 + 0x38));
  if ((*(byte *)(param_1 + 0x18) & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x28),*(ulong *)(param_1 + 0x18) & 0xfffffffffffffffe);
  }
  this = *(__shared_weak_count **)(param_1 + 8);
  if ((this == (__shared_weak_count *)0x0) ||
     (lVar3 = FUN_00c2bd10(0xffffffffffffffff,this + 8), lVar3 != 0)) {
    return;
  }
  (**(code **)(*(long *)this + 0x10))(this);
  std::__ndk1::__shared_weak_count::__release_weak(this);
  return;
}

