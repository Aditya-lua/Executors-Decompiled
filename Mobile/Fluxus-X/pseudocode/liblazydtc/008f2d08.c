/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2d08
 */

/* cpr::Session::SetOption(cpr::Parameters&&) */

void __thiscall cpr::Session::SetOption(Session *this,Parameters *param_1)

{
  Session *pSVar1;
  void *pvVar2;
  void *pvVar3;
  void *pvVar4;
  
  pSVar1 = this + 0x50;
  pvVar2 = *(void **)pSVar1;
  this[0x48] = *(Session *)param_1;
  if (pvVar2 != (void *)0x0) {
    pvVar3 = *(void **)(this + 0x58);
    if (pvVar3 == pvVar2) {
      pvVar3 = pvVar2;
    }
    else {
      do {
        if ((*(byte *)((long)pvVar3 + -0x18) & 1) != 0) {
          operator_delete(*(void **)((long)pvVar3 + -8));
        }
        pvVar4 = (void *)((long)pvVar3 + -0x30);
        if ((*(byte *)((long)pvVar3 + -0x30) & 1) != 0) {
          operator_delete(*(void **)((long)pvVar3 + -0x20));
        }
        pvVar3 = pvVar4;
      } while (pvVar2 != pvVar4);
      pvVar3 = *(void **)pSVar1;
    }
    *(void **)(this + 0x58) = pvVar2;
    operator_delete(pvVar3);
    *(undefined8 *)pSVar1 = 0;
    *(undefined8 *)(this + 0x58) = 0;
    *(undefined8 *)(this + 0x60) = 0;
  }
  *(undefined8 *)(this + 0x50) = *(undefined8 *)(param_1 + 8);
  *(undefined8 *)(this + 0x58) = *(undefined8 *)(param_1 + 0x10);
  *(undefined8 *)(this + 0x60) = *(undefined8 *)(param_1 + 0x18);
  *(undefined8 *)(param_1 + 8) = 0;
  *(undefined8 *)(param_1 + 0x10) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  return;
}

