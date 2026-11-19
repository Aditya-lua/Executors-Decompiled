/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008494c8
 */

void FUN_008494c8(long *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  void *__src;
  void *pvVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong uVar7;
  void *__dest;
  long lVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  puVar1 = (undefined8 *)param_1[1];
  if (puVar1 < (undefined8 *)param_1[2]) {
    uVar5 = param_2[1];
    uVar3 = *param_2;
    puVar9 = puVar1 + 6;
    puVar1[2] = param_2[2];
    puVar1[1] = uVar5;
    *puVar1 = uVar3;
    uVar5 = param_2[4];
    uVar3 = param_2[3];
    param_2[1] = 0;
    param_2[2] = 0;
    *param_2 = 0;
    puVar1[5] = param_2[5];
    puVar1[4] = uVar5;
    puVar1[3] = uVar3;
    param_2[4] = 0;
    param_2[5] = 0;
    param_2[3] = 0;
LAB_00849600:
    param_1[1] = (long)puVar9;
    return;
  }
  lVar8 = (long)puVar1 - *param_1;
  uVar6 = (lVar8 >> 4) * -0x5555555555555555 + 1;
  if (uVar6 < 0x555555555555556) {
    lVar4 = param_1[2] - *param_1 >> 4;
    uVar7 = lVar4 * 0x5555555555555556;
    if (uVar7 <= uVar6) {
      uVar7 = uVar6;
    }
    if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar4 * -0x5555555555555555)) {
      uVar7 = 0x555555555555555;
    }
    if (uVar7 < 0x555555555555556) {
      pvVar2 = operator_new(uVar7 * 0x30);
      uVar11 = param_2[1];
      uVar10 = *param_2;
      *param_2 = 0;
      param_2[1] = 0;
      puVar1 = (undefined8 *)((long)pvVar2 + lVar8);
      uVar3 = param_2[2];
      uVar13 = param_2[4];
      uVar12 = param_2[3];
      param_2[2] = 0;
      param_2[3] = 0;
      uVar5 = param_2[5];
      puVar9 = puVar1 + 6;
      param_2[4] = 0;
      param_2[5] = 0;
      __src = (void *)*param_1;
      lVar8 = param_1[1];
      puVar1[1] = uVar11;
      *puVar1 = uVar10;
      puVar1[2] = uVar3;
      puVar1[5] = uVar5;
      puVar1[4] = uVar13;
      puVar1[3] = uVar12;
      __dest = (void *)((long)puVar1 - (lVar8 - (long)__src));
      memcpy(__dest,__src,lVar8 - (long)__src);
      lVar8 = param_1[2];
      *param_1 = (long)__dest;
      param_1[1] = (long)puVar9;
      param_1[2] = (long)((long)pvVar2 + uVar7 * 0x30);
      if (__src != (void *)0x0) {
        operator_delete(__src,lVar8 - (long)__src);
      }
      goto LAB_00849600;
    }
  }
  else {
    FUN_008497dc();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

