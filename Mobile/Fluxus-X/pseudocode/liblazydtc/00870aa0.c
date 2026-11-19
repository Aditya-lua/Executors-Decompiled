/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00870aa0
 */

void FUN_00870aa0(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  void *__dest;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  void *__src;
  undefined8 *puVar5;
  ulong uVar6;
  size_t __n;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  
  puVar1 = (undefined8 *)param_1[1];
  if (puVar1 < (undefined8 *)param_1[2]) {
    uVar10 = param_2[3];
    uVar9 = param_2[2];
    uVar8 = param_2[5];
    uVar7 = param_2[4];
    uVar11 = *param_2;
    puVar5 = puVar1 + 6;
    puVar1[1] = param_2[1];
    *puVar1 = uVar11;
    puVar1[3] = uVar10;
    puVar1[2] = uVar9;
    puVar1[5] = uVar8;
    puVar1[4] = uVar7;
LAB_00870b94:
    param_1[1] = puVar5;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar1 - (long)__src;
  uVar3 = ((long)__n >> 4) * -0x5555555555555555 + 1;
  if (uVar3 < 0x555555555555556) {
    uVar6 = (long)param_1[2] - (long)__src;
    lVar2 = (long)uVar6 >> 4;
    uVar4 = lVar2 * 0x5555555555555556;
    if (uVar4 <= uVar3) {
      uVar4 = uVar3;
    }
    if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar2 * -0x5555555555555555)) {
      uVar4 = 0x555555555555555;
    }
    if (uVar4 < 0x555555555555556) {
      __dest = operator_new(uVar4 * 0x30);
      uVar7 = *param_2;
      uVar9 = param_2[3];
      uVar8 = param_2[2];
      puVar1 = (undefined8 *)((long)__dest + __n);
      uVar11 = param_2[5];
      uVar10 = param_2[4];
      puVar5 = puVar1 + 6;
      puVar1[1] = param_2[1];
      *puVar1 = uVar7;
      puVar1[3] = uVar9;
      puVar1[2] = uVar8;
      puVar1[5] = uVar11;
      puVar1[4] = uVar10;
      memcpy(__dest,__src,__n);
      *param_1 = __dest;
      param_1[1] = puVar5;
      param_1[2] = (void *)((long)__dest + uVar4 * 0x30);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar6);
      }
      goto LAB_00870b94;
    }
  }
  else {
    FUN_0086f7f0();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

