/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00874c40
 */

void FUN_00874c40(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  void *__dest;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  ulong uVar5;
  void *__src;
  undefined8 *puVar6;
  ulong uVar7;
  size_t __n;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  puVar1 = (undefined8 *)param_1[1];
  if (puVar1 < (undefined8 *)param_1[2]) {
    uVar10 = param_2[1];
    uVar9 = *param_2;
    uVar8 = param_2[3];
    uVar3 = param_2[2];
    puVar6 = puVar1 + 5;
    puVar1[4] = param_2[4];
    puVar1[1] = uVar10;
    *puVar1 = uVar9;
    puVar1[3] = uVar8;
    puVar1[2] = uVar3;
LAB_00874d34:
    param_1[1] = puVar6;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar1 - (long)__src;
  uVar4 = ((long)__n >> 3) * -0x3333333333333333 + 1;
  if (uVar4 < 0x666666666666667) {
    uVar7 = (long)param_1[2] - (long)__src;
    lVar2 = (long)uVar7 >> 3;
    uVar5 = lVar2 * -0x6666666666666666;
    if (uVar5 <= uVar4) {
      uVar5 = uVar4;
    }
    if (0x333333333333332 < (ulong)(lVar2 * -0x3333333333333333)) {
      uVar5 = 0x666666666666666;
    }
    if (uVar5 < 0x666666666666667) {
      __dest = operator_new(uVar5 * 0x28);
      uVar8 = *param_2;
      uVar10 = param_2[3];
      uVar9 = param_2[2];
      puVar1 = (undefined8 *)((long)__dest + __n);
      uVar3 = param_2[4];
      puVar6 = puVar1 + 5;
      puVar1[1] = param_2[1];
      *puVar1 = uVar8;
      puVar1[3] = uVar10;
      puVar1[2] = uVar9;
      puVar1[4] = uVar3;
      memcpy(__dest,__src,__n);
      *param_1 = __dest;
      param_1[1] = puVar6;
      param_1[2] = (void *)((long)__dest + uVar5 * 0x28);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar7);
      }
      goto LAB_00874d34;
    }
  }
  else {
    FUN_008797a4();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

