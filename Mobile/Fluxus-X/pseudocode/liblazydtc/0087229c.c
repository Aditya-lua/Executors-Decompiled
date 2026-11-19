/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087229c
 */

void FUN_0087229c(undefined8 *param_1,undefined8 *param_2)

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
  undefined8 uVar11;
  undefined8 uVar12;
  
  puVar1 = (undefined8 *)param_1[1];
  if (puVar1 < (undefined8 *)param_1[2]) {
    uVar12 = param_2[3];
    uVar11 = param_2[2];
    uVar8 = param_2[5];
    uVar3 = param_2[4];
    uVar10 = param_2[1];
    uVar9 = *param_2;
    puVar6 = puVar1 + 7;
    puVar1[6] = param_2[6];
    puVar1[3] = uVar12;
    puVar1[2] = uVar11;
    puVar1[5] = uVar8;
    puVar1[4] = uVar3;
    puVar1[1] = uVar10;
    *puVar1 = uVar9;
LAB_008723b8:
    param_1[1] = puVar6;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)puVar1 - (long)__src;
  uVar4 = ((long)__n >> 3) * 0x6db6db6db6db6db7 + 1;
  if (uVar4 < 0x492492492492493) {
    uVar7 = (long)param_1[2] - (long)__src;
    lVar2 = (long)uVar7 >> 3;
    uVar5 = lVar2 * -0x2492492492492492;
    if (uVar5 <= uVar4) {
      uVar5 = uVar4;
    }
    if (0x249249249249248 < (ulong)(lVar2 * 0x6db6db6db6db6db7)) {
      uVar5 = 0x492492492492492;
    }
    if (uVar5 < 0x492492492492493) {
      __dest = operator_new(uVar5 * 0x38);
      uVar8 = *param_2;
      uVar10 = param_2[3];
      uVar9 = param_2[2];
      puVar1 = (undefined8 *)((long)__dest + __n);
      uVar12 = param_2[5];
      uVar11 = param_2[4];
      uVar3 = param_2[6];
      puVar1[1] = param_2[1];
      *puVar1 = uVar8;
      puVar1[3] = uVar10;
      puVar1[2] = uVar9;
      puVar6 = puVar1 + 7;
      puVar1[5] = uVar12;
      puVar1[4] = uVar11;
      puVar1[6] = uVar3;
      memcpy(__dest,__src,__n);
      *param_1 = __dest;
      param_1[1] = puVar6;
      param_1[2] = (void *)((long)__dest + uVar5 * 0x38);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar7);
      }
      goto LAB_008723b8;
    }
  }
  else {
    FUN_008723dc();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

