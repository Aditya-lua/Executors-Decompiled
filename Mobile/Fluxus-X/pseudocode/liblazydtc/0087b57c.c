/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087b57c
 */

void FUN_0087b57c(undefined8 *param_1,ulong param_2,undefined4 *param_3)

{
  undefined4 uVar1;
  void *pvVar2;
  undefined8 *puVar3;
  undefined4 *puVar5;
  undefined4 *puVar4;
  undefined4 *puVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  void *__src;
  ulong uVar11;
  size_t __n;
  
  puVar4 = (undefined4 *)param_1[1];
  if (param_2 <= (ulong)(param_1[2] - (long)puVar4 >> 2)) {
    puVar6 = puVar4;
    if (param_2 != 0) {
      uVar1 = *param_3;
      uVar7 = param_2 - 1 & 0x3fffffffffffffff;
      puVar6 = puVar4 + param_2;
      if (6 < uVar7) {
        uVar7 = uVar7 + 1;
        uVar11 = uVar7 & 0x7ffffffffffffff8;
        puVar3 = (undefined8 *)(puVar4 + 4);
        uVar9 = uVar11;
        do {
          uVar9 = uVar9 - 8;
          puVar3[-1] = CONCAT44(uVar1,uVar1);
          puVar3[-2] = CONCAT44(uVar1,uVar1);
          puVar3[1] = CONCAT44(uVar1,uVar1);
          *puVar3 = CONCAT44(uVar1,uVar1);
          puVar3 = puVar3 + 4;
        } while (uVar9 != 0);
        puVar4 = puVar4 + uVar11;
        if (uVar7 == uVar11) goto LAB_0087b668;
      }
      do {
        puVar5 = puVar4 + 1;
        *puVar4 = uVar1;
        puVar4 = puVar5;
      } while (puVar5 != puVar6);
    }
LAB_0087b668:
    param_1[1] = puVar6;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar4 - (long)__src;
  uVar7 = ((long)__n >> 2) + param_2;
  if (uVar7 >> 0x3e != 0) {
    FUN_0086f7b4();
LAB_0087b734:
                    /* WARNING: Subroutine does not return */
    FUN_007fe1b8();
  }
  uVar11 = param_1[2] - (long)__src;
  uVar9 = (long)uVar11 >> 1;
  if ((ulong)((long)uVar11 >> 1) <= uVar7) {
    uVar9 = uVar7;
  }
  if (0x7ffffffffffffffb < uVar11) {
    uVar9 = 0x3fffffffffffffff;
  }
  if (uVar9 == 0) {
    pvVar2 = (void *)0x0;
  }
  else {
    if (uVar9 >> 0x3e != 0) goto LAB_0087b734;
    pvVar2 = operator_new(uVar9 << 2);
  }
  puVar4 = (undefined4 *)((long)pvVar2 + __n);
  uVar7 = param_2 - 1 & 0x3fffffffffffffff;
  uVar1 = *param_3;
  puVar6 = puVar4;
  if (6 < uVar7) {
    uVar7 = uVar7 + 1;
    uVar8 = uVar7 & 0x7ffffffffffffff8;
    puVar3 = (undefined8 *)((long)pvVar2 + __n + 0x10);
    uVar10 = uVar8;
    do {
      uVar10 = uVar10 - 8;
      puVar3[-1] = CONCAT44(uVar1,uVar1);
      puVar3[-2] = CONCAT44(uVar1,uVar1);
      puVar3[1] = CONCAT44(uVar1,uVar1);
      *puVar3 = CONCAT44(uVar1,uVar1);
      puVar3 = puVar3 + 4;
    } while (uVar10 != 0);
    puVar6 = puVar4 + uVar8;
    if (uVar7 == uVar8) goto LAB_0087b6d4;
  }
  do {
    puVar5 = puVar6 + 1;
    *puVar6 = uVar1;
    puVar6 = puVar5;
  } while (puVar5 != puVar4 + param_2);
LAB_0087b6d4:
  memcpy(puVar4 + -((long)__n >> 2),__src,__n);
  *param_1 = puVar4 + -((long)__n >> 2);
  param_1[1] = puVar4 + param_2;
  param_1[2] = (void *)((long)pvVar2 + uVar9 * 4);
  if (__src == (void *)0x0) {
    return;
  }
  operator_delete(__src,uVar11);
  return;
}

