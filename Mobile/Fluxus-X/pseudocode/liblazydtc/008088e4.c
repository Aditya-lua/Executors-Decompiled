/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008088e4
 */

void FUN_008088e4(undefined8 *param_1)

{
  undefined8 *puVar1;
  void *pvVar2;
  long lVar3;
  __shared_weak_count *this;
  
  puVar1 = (void *)param_1[2];
  while (puVar1 != (void *)0x0) {
    this = (__shared_weak_count *)puVar1[4];
    pvVar2 = (void *)*puVar1;
    if ((this != (__shared_weak_count *)0x0) &&
       (lVar3 = FUN_00c2bd10(0xffffffffffffffff,this + 8), lVar3 == 0)) {
      (**(code **)(*(long *)this + 0x10))(this);
      std::__ndk1::__shared_weak_count::__release_weak(this);
    }
    operator_delete(puVar1,0x28);
    puVar1 = pvVar2;
  }
  pvVar2 = (void *)*param_1;
  *param_1 = 0;
  if (pvVar2 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar2,param_1[1] << 3);
  return;
}

