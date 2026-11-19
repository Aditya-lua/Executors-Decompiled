/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00870bec
 */

void FUN_00870bec(undefined8 *param_1,undefined8 *param_2)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  void *pvVar4;
  void *__src;
  ulong uVar5;
  size_t __n;
  undefined8 *puVar6;
  
  puVar3 = (undefined8 *)param_1[1];
  if (puVar3 < (undefined8 *)param_1[2]) {
    puVar6 = puVar3 + 1;
    *puVar3 = *param_2;
LAB_00870cac:
    param_1[1] = puVar6;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar3 - (long)__src;
  uVar1 = ((long)__n >> 3) + 1;
  if (uVar1 >> 0x3d == 0) {
    uVar5 = (long)param_1[2] - (long)__src;
    uVar2 = (long)uVar5 >> 2;
    if ((ulong)((long)uVar5 >> 2) <= uVar1) {
      uVar2 = uVar1;
    }
    if (0x7ffffffffffffff7 < uVar5) {
      uVar2 = 0x1fffffffffffffff;
    }
    if (uVar2 >> 0x3d == 0) {
      pvVar4 = operator_new(uVar2 * 8);
      puVar3 = (undefined8 *)((long)pvVar4 + __n);
      puVar6 = puVar3 + 1;
      *puVar3 = *param_2;
      memcpy(puVar3 + -((long)__n >> 3),__src,__n);
      *param_1 = puVar3 + -((long)__n >> 3);
      param_1[1] = puVar6;
      param_1[2] = (void *)((long)pvVar4 + uVar2 * 8);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar5);
      }
      goto LAB_00870cac;
    }
  }
  else {
    FUN_00870cd0();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

