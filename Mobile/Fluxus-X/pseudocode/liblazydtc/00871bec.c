/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00871bec
 */

void FUN_00871bec(undefined8 *param_1,undefined8 *param_2)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  void *pvVar4;
  void *__src;
  ulong uVar5;
  size_t __n;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  
  puVar3 = (undefined8 *)param_1[1];
  if (puVar3 < (undefined8 *)param_1[2]) {
    uVar9 = *param_2;
    uVar8 = param_2[3];
    uVar7 = param_2[2];
    puVar6 = puVar3 + 4;
    puVar3[1] = param_2[1];
    *puVar3 = uVar9;
    puVar3[3] = uVar8;
    puVar3[2] = uVar7;
LAB_00871cb4:
    param_1[1] = puVar6;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar3 - (long)__src;
  uVar1 = ((long)__n >> 5) + 1;
  if (uVar1 >> 0x3b == 0) {
    uVar5 = (long)param_1[2] - (long)__src;
    uVar2 = (long)uVar5 >> 4;
    if ((ulong)((long)uVar5 >> 4) <= uVar1) {
      uVar2 = uVar1;
    }
    if (0x7fffffffffffffdf < uVar5) {
      uVar2 = 0x7ffffffffffffff;
    }
    if (uVar2 >> 0x3b == 0) {
      pvVar4 = operator_new(uVar2 * 0x20);
      puVar3 = (undefined8 *)((long)pvVar4 + __n);
      uVar7 = *param_2;
      uVar9 = param_2[3];
      uVar8 = param_2[2];
      puVar6 = puVar3 + 4;
      puVar3[1] = param_2[1];
      *puVar3 = uVar7;
      puVar3[3] = uVar9;
      puVar3[2] = uVar8;
      memcpy(puVar3 + ((long)__n >> 5) * -4,__src,__n);
      *param_1 = puVar3 + ((long)__n >> 5) * -4;
      param_1[1] = puVar6;
      param_1[2] = (void *)((long)pvVar4 + uVar2 * 0x20);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar5);
      }
      goto LAB_00871cb4;
    }
  }
  else {
    FUN_00871cd8();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

