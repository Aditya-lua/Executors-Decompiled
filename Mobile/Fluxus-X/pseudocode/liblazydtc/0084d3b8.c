/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084d3b8
 */

void FUN_0084d3b8(long *param_1,ulong param_2)

{
  undefined8 *puVar1;
  void *pvVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  undefined8 *puVar6;
  ulong uVar7;
  void *__src;
  undefined8 *puVar8;
  void *__dest;
  long lVar9;
  
  puVar8 = (undefined8 *)param_1[1];
  lVar4 = param_1[2];
  if ((ulong)((lVar4 - (long)puVar8 >> 3) * -0x5555555555555555) < param_2) {
    lVar9 = (long)puVar8 - *param_1;
    uVar3 = param_2 + (lVar9 >> 3) * -0x5555555555555555;
    if (0xaaaaaaaaaaaaaaa < uVar3) {
      FUN_0084d528();
LAB_0084d524:
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
    lVar5 = lVar4 - *param_1 >> 3;
    uVar7 = lVar5 * 0x5555555555555556;
    if (uVar7 <= uVar3) {
      uVar7 = uVar3;
    }
    if (0x555555555555554 < (ulong)(lVar5 * -0x5555555555555555)) {
      uVar7 = 0xaaaaaaaaaaaaaaa;
    }
    if (uVar7 == 0) {
      pvVar2 = (void *)0x0;
    }
    else {
      if (0xaaaaaaaaaaaaaaa < uVar7) goto LAB_0084d524;
      pvVar2 = operator_new(uVar7 * 0x18);
    }
    lVar5 = param_2 * 0x18;
    puVar1 = (undefined8 *)((long)pvVar2 + lVar9);
    puVar6 = puVar1;
    do {
      *puVar6 = 0;
      puVar6[1] = 0;
      lVar5 = lVar5 + -0x18;
      *(undefined1 *)(puVar6 + 2) = 0;
      puVar6 = puVar6 + 3;
    } while (lVar5 != 0);
    __src = (void *)*param_1;
    __dest = (void *)((long)puVar1 - ((long)puVar8 - (long)__src));
    memcpy(__dest,__src,(long)puVar8 - (long)__src);
    *param_1 = (long)__dest;
    param_1[1] = (long)(puVar1 + param_2 * 3);
    param_1[2] = (long)((long)pvVar2 + uVar7 * 0x18);
    if (__src != (void *)0x0) {
      operator_delete(__src,lVar4 - (long)__src);
      return;
    }
  }
  else {
    puVar6 = puVar8;
    if (param_2 != 0) {
      puVar6 = puVar8 + param_2 * 3;
      lVar4 = param_2 * 0x18;
      do {
        *puVar8 = 0;
        puVar8[1] = 0;
        lVar4 = lVar4 + -0x18;
        *(undefined1 *)(puVar8 + 2) = 0;
        puVar8 = puVar8 + 3;
      } while (lVar4 != 0);
    }
    param_1[1] = (long)puVar6;
  }
  return;
}

