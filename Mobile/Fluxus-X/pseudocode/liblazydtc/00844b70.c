/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00844b70
 */

void FUN_00844b70(long *param_1,ulong param_2,undefined8 *param_3)

{
  void *pvVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  ulong uVar6;
  void *__src;
  undefined8 *puVar7;
  undefined8 *puVar8;
  void *__dest;
  long lVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  
  puVar7 = (undefined8 *)param_1[1];
  lVar3 = param_1[2];
  if ((ulong)((lVar3 - (long)puVar7 >> 3) * -0x5555555555555555) < param_2) {
    lVar9 = (long)puVar7 - *param_1;
    uVar2 = param_2 + (lVar9 >> 3) * -0x5555555555555555;
    if (0xaaaaaaaaaaaaaaa < uVar2) {
      FUN_00844480();
LAB_00844cf8:
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
    lVar4 = lVar3 - *param_1 >> 3;
    uVar6 = lVar4 * 0x5555555555555556;
    if (uVar6 <= uVar2) {
      uVar6 = uVar2;
    }
    if (0x555555555555554 < (ulong)(lVar4 * -0x5555555555555555)) {
      uVar6 = 0xaaaaaaaaaaaaaaa;
    }
    if (uVar6 == 0) {
      pvVar1 = (void *)0x0;
    }
    else {
      if (0xaaaaaaaaaaaaaaa < uVar6) goto LAB_00844cf8;
      pvVar1 = operator_new(uVar6 * 0x18);
    }
    lVar4 = param_2 * 0x18;
    puVar8 = (undefined8 *)((long)pvVar1 + lVar9);
    puVar5 = puVar8;
    do {
      uVar11 = param_3[1];
      uVar10 = *param_3;
      lVar4 = lVar4 + -0x18;
      puVar5[2] = param_3[2];
      puVar5[1] = uVar11;
      *puVar5 = uVar10;
      puVar5 = puVar5 + 3;
    } while (lVar4 != 0);
    __src = (void *)*param_1;
    __dest = (void *)((long)puVar8 - ((long)puVar7 - (long)__src));
    memcpy(__dest,__src,(long)puVar7 - (long)__src);
    *param_1 = (long)__dest;
    param_1[1] = (long)(puVar8 + param_2 * 3);
    param_1[2] = (long)((long)pvVar1 + uVar6 * 0x18);
    if (__src != (void *)0x0) {
      operator_delete(__src,lVar3 - (long)__src);
      return;
    }
  }
  else {
    puVar8 = puVar7;
    if (param_2 != 0) {
      puVar8 = puVar7 + param_2 * 3;
      lVar3 = param_2 * 0x18;
      do {
        uVar11 = param_3[1];
        uVar10 = *param_3;
        lVar3 = lVar3 + -0x18;
        puVar7[2] = param_3[2];
        puVar7[1] = uVar11;
        *puVar7 = uVar10;
        puVar7 = puVar7 + 3;
      } while (lVar3 != 0);
    }
    param_1[1] = (long)puVar8;
  }
  return;
}

