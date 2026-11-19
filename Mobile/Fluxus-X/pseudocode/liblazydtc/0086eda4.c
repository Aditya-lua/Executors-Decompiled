/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086eda4
 */

undefined8 * FUN_0086eda4(long *param_1,undefined8 *param_2,char *param_3)

{
  undefined8 *puVar1;
  long lVar2;
  void *pvVar3;
  size_t sVar4;
  void *pvVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  void *__dest;
  long lVar10;
  undefined8 uVar11;
  
  lVar2 = tpidr_el0;
  lVar6 = *(long *)(lVar2 + 0x28);
  lVar10 = param_1[1] - *param_1;
  uVar7 = (lVar10 >> 3) * -0x3333333333333333 + 1;
  if (uVar7 < 0x666666666666667) {
    lVar8 = param_1[2] - *param_1 >> 3;
    uVar9 = lVar8 * -0x6666666666666666;
    if (uVar9 <= uVar7) {
      uVar9 = uVar7;
    }
    if (0x333333333333332 < (ulong)(lVar8 * -0x3333333333333333)) {
      uVar9 = 0x666666666666666;
    }
    if (uVar9 == 0) {
      pvVar3 = (void *)0x0;
    }
    else {
      if (0x666666666666666 < uVar9) {
        if (*(long *)(lVar2 + 0x28) == lVar6) {
                    /* WARNING: Subroutine does not return */
          FUN_007fe1b8();
        }
        goto LAB_0086efb0;
      }
      pvVar3 = operator_new(uVar9 * 0x28);
    }
    puVar1 = (undefined8 *)((long)pvVar3 + lVar10);
    uVar11 = *param_2;
    puVar1[1] = param_2[1];
    *puVar1 = uVar11;
    sVar4 = strlen(param_3);
    if (sVar4 < 0xfffffffffffffff8) {
      if (sVar4 < 0x17) {
        pvVar5 = (void *)((long)puVar1 + 0x11);
        *(char *)(puVar1 + 2) = (char)((int)sVar4 << 1);
        if (sVar4 != 0) goto LAB_0086eed0;
      }
      else {
        uVar7 = 0x1a;
        if ((sVar4 | 7) != 0x17) {
          uVar7 = (sVar4 | 7) + 1;
        }
                    /* try { // try from 0086eeb8 to 0086eebf has its CatchHandler @ 0086ef8c */
        pvVar5 = operator_new(uVar7);
        puVar1[3] = sVar4;
        puVar1[4] = pvVar5;
        puVar1[2] = uVar7 | 1;
LAB_0086eed0:
        memmove(pvVar5,param_3,sVar4);
      }
      *(undefined1 *)((long)pvVar5 + sVar4) = 0;
      sVar4 = param_1[1] - *param_1;
      __dest = (void *)((long)puVar1 - sVar4);
      memcpy(__dest,(void *)*param_1,sVar4);
      pvVar5 = (void *)*param_1;
      lVar10 = param_1[2];
      *param_1 = (long)__dest;
      param_1[1] = (long)(puVar1 + 5);
      param_1[2] = (long)((long)pvVar3 + uVar9 * 0x28);
      if (pvVar5 != (void *)0x0) {
        operator_delete(pvVar5,lVar10 - (long)pvVar5);
      }
      if (*(long *)(lVar2 + 0x28) == lVar6) {
        return puVar1 + 5;
      }
      goto LAB_0086efb0;
    }
  }
  else {
    if (*(long *)(lVar2 + 0x28) != lVar6) goto LAB_0086efb0;
    FUN_0086ecc0();
  }
  if (*(long *)(lVar2 + 0x28) == lVar6) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0086ef74 to 0086ef77 has its CatchHandler @ 0086ef8c */
    FUN_007fe124();
  }
LAB_0086efb0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

