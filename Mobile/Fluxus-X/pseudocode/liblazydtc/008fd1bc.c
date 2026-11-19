/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fd1bc
 */

/* cpr::Files::TEMPNAMEPLACEHOLDERVALUE(cpr::Files&&) */

Files * __thiscall cpr::Files::operator=(Files *this,Files *param_1)

{
  void *pvVar1;
  void *pvVar2;
  void *pvVar3;
  
  if (param_1 != this) {
    pvVar2 = *(void **)this;
    if (pvVar2 != (void *)0x0) {
      pvVar1 = *(void **)(this + 8);
      if (*(void **)(this + 8) == pvVar2) {
        pvVar1 = pvVar2;
      }
      else {
        do {
          if ((*(byte *)((long)pvVar1 + -0x18) & 1) != 0) {
            operator_delete(*(void **)((long)pvVar1 + -8));
          }
          pvVar3 = (void *)((long)pvVar1 + -0x30);
          if ((*(byte *)((long)pvVar1 + -0x30) & 1) != 0) {
            operator_delete(*(void **)((long)pvVar1 + -0x20));
          }
          pvVar1 = pvVar3;
        } while (pvVar2 != pvVar3);
        pvVar1 = *(void **)this;
      }
      *(void **)(this + 8) = pvVar2;
      operator_delete(pvVar1);
      *(undefined8 *)this = 0;
      *(undefined8 *)(this + 8) = 0;
      *(undefined8 *)(this + 0x10) = 0;
    }
    *(undefined8 *)this = *(undefined8 *)param_1;
    *(undefined8 *)(this + 8) = *(undefined8 *)(param_1 + 8);
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    *(undefined8 *)param_1 = 0;
    *(undefined8 *)(param_1 + 8) = 0;
    *(undefined8 *)(param_1 + 0x10) = 0;
  }
  return this;
}

