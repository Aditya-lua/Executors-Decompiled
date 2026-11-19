/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084c9ec
 */

void FUN_0084c9ec(undefined8 *param_1)

{
  long lVar1;
  long lVar2;
  size_t __n;
  ulong uVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  void *pvVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 *__src;
  undefined8 *puVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  ulong uVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 *local_90;
  undefined8 *puStack_88;
  undefined8 *local_80;
  undefined8 *puStack_78;
  undefined8 *local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  puVar18 = (undefined8 *)param_1[1];
  puVar17 = (undefined8 *)param_1[2];
  lVar1 = 0;
  if (puVar17 != puVar18) {
    lVar1 = ((long)puVar17 - (long)puVar18 >> 3) * 0x2a + -1;
  }
  if ((ulong)(lVar1 - (param_1[5] + param_1[4])) < 0x2a) {
    puVar11 = (undefined8 *)*param_1;
    puVar10 = param_1 + 3;
    uVar13 = (long)*puVar10 - (long)puVar11;
    if ((ulong)((long)puVar17 - (long)puVar18) < uVar13) {
      if (puVar18 == puVar11) {
        local_90 = operator_new(0xfc0);
        FUN_0084c50c(param_1,&local_90);
        local_90 = *(undefined8 **)(param_1[2] + -8);
        param_1[2] = (undefined8 *)(param_1[2] + -8);
        FUN_0084cdb0(param_1,&local_90);
      }
      else {
        local_90 = operator_new(0xfc0);
        FUN_0084c68c(param_1,&local_90);
      }
      lVar1 = 0x15;
      if (param_1[2] - param_1[1] != 8) {
        lVar1 = param_1[4] + 0x2a;
      }
      param_1[4] = lVar1;
    }
    else {
      uVar13 = (long)uVar13 >> 2;
      if ((undefined8 *)*puVar10 == puVar11) {
        uVar13 = 1;
      }
      local_70 = puVar10;
      if (uVar13 >> 0x3d != 0) {
        if (*(long *)(lVar4 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_007fe1b8();
        }
        goto LAB_0084cdac;
      }
      puVar6 = operator_new(uVar13 * 8);
      puVar10 = puVar6 + uVar13;
      local_90 = puVar6;
      puStack_88 = puVar6;
      local_80 = puVar6;
      puStack_78 = puVar10;
                    /* try { // try from 0084cae4 to 0084caef has its CatchHandler @ 0084cd6c */
      pvVar7 = operator_new(0xfc0);
      puVar11 = puVar6;
      if (uVar13 == 0) {
                    /* try { // try from 0084caf8 to 0084caff has its CatchHandler @ 0084cd58 */
        puVar11 = operator_new(8);
        puVar10 = puVar11 + 1;
        operator_delete(puVar6,0);
        puVar18 = (undefined8 *)param_1[1];
        puVar17 = (undefined8 *)param_1[2];
      }
      puVar8 = puVar11 + 1;
      *puVar11 = pvVar7;
      __src = puVar11;
      puVar6 = puVar8;
      if (puVar18 != puVar17) {
        do {
          if (puVar6 == puVar10) {
            if (__src < puVar11 || (long)__src - (long)puVar11 == 0) {
              uVar3 = (long)puVar6 - (long)puVar11;
              uVar13 = (long)uVar3 >> 2;
              if (uVar3 == 0) {
                uVar13 = 1;
              }
              if (uVar13 >> 0x3d != 0) {
                local_90 = puVar11;
                puStack_88 = __src;
                local_80 = puVar6;
                puStack_78 = puVar10;
                if (*(long *)(lVar4 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0084cd40 to 0084cd43 has its CatchHandler @ 0084cd74 */
                  FUN_007fe1b8();
                }
                goto LAB_0084cdac;
              }
                    /* try { // try from 0084cbe8 to 0084cbeb has its CatchHandler @ 0084cd7c */
              puVar8 = operator_new(uVar13 << 3);
              uVar9 = uVar13 >> 2;
              lVar1 = (long)puVar6 - (long)__src;
              puVar17 = puVar8 + uVar9;
              puVar6 = puVar17;
              if (lVar1 != 0) {
                puVar6 = (undefined8 *)((long)puVar17 + lVar1);
                if ((lVar1 - 8U < 0x18) || ((long)puVar8 + (uVar9 * 8 - (long)__src) < 0x20)) {
                  puVar10 = puVar17;
                }
                else {
                  puVar14 = __src + 2;
                  puVar15 = puVar8 + uVar9 + 2;
                  uVar9 = (lVar1 - 8U >> 3) + 1;
                  uVar12 = uVar9 & 0x3ffffffffffffffc;
                  puVar10 = puVar17 + uVar12;
                  __src = __src + uVar12;
                  uVar16 = uVar12;
                  do {
                    puVar5 = puVar14 + -1;
                    uVar19 = puVar14[-2];
                    uVar21 = puVar14[1];
                    uVar20 = *puVar14;
                    uVar16 = uVar16 - 4;
                    puVar14 = puVar14 + 4;
                    puVar15[-1] = *puVar5;
                    puVar15[-2] = uVar19;
                    puVar15[1] = uVar21;
                    *puVar15 = uVar20;
                    puVar15 = puVar15 + 4;
                  } while (uVar16 != 0);
                  if (uVar9 == uVar12) goto LAB_0084cc40;
                }
                do {
                  puVar14 = puVar10 + 1;
                  *puVar10 = *__src;
                  puVar10 = puVar14;
                  __src = __src + 1;
                } while (puVar14 != puVar6);
              }
LAB_0084cc40:
              puVar10 = puVar8 + uVar13;
              operator_delete(puVar11,uVar3);
              puVar11 = puVar8;
              __src = puVar17;
            }
            else {
              __n = (long)puVar6 - (long)__src;
              lVar1 = ((long)__src - (long)puVar11 >> 3) + 1;
              puVar17 = __src + -((ulong)(lVar1 - (lVar1 >> 0x3f)) >> 1);
              if (__n != 0) {
                memmove(puVar17,__src,__n);
              }
              puVar6 = (undefined8 *)((long)puVar17 + __n);
              __src = puVar17;
            }
          }
          puVar17 = puVar18 + 1;
          puVar8 = puVar6 + 1;
          *puVar6 = *puVar18;
          puVar18 = puVar17;
          puVar6 = puVar8;
        } while (puVar17 != (undefined8 *)param_1[2]);
      }
      lVar2 = param_1[3];
      pvVar7 = (void *)*param_1;
      *param_1 = puVar11;
      param_1[1] = __src;
      param_1[2] = puVar8;
      param_1[3] = puVar10;
      lVar1 = 0x15;
      if ((long)puVar8 - (long)__src != 8) {
        lVar1 = param_1[4] + 0x2a;
      }
      param_1[4] = lVar1;
      if (pvVar7 != (void *)0x0) {
        operator_delete(pvVar7,lVar2 - (long)pvVar7);
      }
    }
  }
  else {
    param_1[4] = param_1[4] + 0x2a;
    local_90 = (undefined8 *)puVar17[-1];
    param_1[2] = puVar17 + -1;
    FUN_0084cdb0(param_1,&local_90);
  }
  if (*(long *)(lVar4 + 0x28) == local_68) {
    return;
  }
LAB_0084cdac:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

