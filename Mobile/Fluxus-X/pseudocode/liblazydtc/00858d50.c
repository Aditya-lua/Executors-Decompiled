/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00858d50
 */

void FUN_00858d50(undefined8 *param_1,ulong param_2,undefined4 *param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined4 uVar3;
  long lVar4;
  void *__dest;
  int iVar5;
  uint uVar6;
  undefined4 *puVar7;
  undefined4 *puVar8;
  long lVar9;
  int *piVar10;
  undefined8 uVar11;
  ulong uVar12;
  undefined4 *puVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  char *pcVar18;
  undefined8 *puVar19;
  undefined4 uStack_c8;
  undefined4 uStack_c4;
  undefined4 uStack_c0;
  undefined4 uStack_bc;
  undefined4 uStack_b8;
  undefined8 uStack_b0;
  ulong uStack_a8;
  void *pvStack_a0;
  long lStack_98;
  undefined1 *puStack_90;
  code *pcStack_88;
  
  uVar12 = param_1[2];
  puVar13 = (undefined4 *)*param_1;
  if ((ulong)((long)(uVar12 - (long)puVar13) >> 2) < param_2) {
    if (puVar13 != (undefined4 *)0x0) {
      param_1[1] = puVar13;
      operator_delete(puVar13,uVar12 - (long)puVar13);
      uVar12 = 0;
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
    }
    if (param_2 >> 0x3e != 0) {
LAB_00858f28:
      lVar9 = FUN_0086f7b4();
      pcStack_88 = FUN_00858f2c;
      lVar4 = tpidr_el0;
      lStack_98 = *(long *)(lVar4 + 0x28);
      puStack_90 = (undefined1 *)((long)register0x00000008 + -0x30);
      piVar10 = (int *)FUN_00853538(lVar9 + 0x70,0,1);
      puVar19 = (undefined8 *)((ulong)&uStack_c8 | 4);
      while (*piVar10 - 0x11aU < 6 && (1 << (ulong)(*piVar10 - 0x11aU & 0x1f) & 0x23U) != 0) {
        if (*(char *)(lVar9 + 1) == '\x01') {
          uStack_c8 = *(undefined4 *)(lVar9 + 0x90);
          uStack_bc = (undefined4)*(undefined8 *)(lVar9 + 0x9c);
          uStack_b8 = (undefined4)((ulong)*(undefined8 *)(lVar9 + 0x9c) >> 0x20);
          uStack_c4 = (undefined4)*(undefined8 *)(lVar9 + 0x94);
          uStack_c0 = (undefined4)((ulong)*(undefined8 *)(lVar9 + 0x94) >> 0x20);
          FUN_0086e950(lVar9 + 0xf0,&uStack_c8);
        }
        if (*(int *)(lVar9 + 0x90) == 0x11a) {
          iVar5 = FUN_008521f4(lVar9 + 0x90);
          if ((iVar5 != 0) && (pcVar18 = *(char **)(lVar9 + 0xa8), *pcVar18 == '!')) {
            uVar6 = FUN_008521f4(lVar9 + 0x90);
            if (uVar6 == 0) {
LAB_00859158:
              uVar11 = *(undefined8 *)(lVar9 + 0x94);
              uStack_c8 = CONCAT31(uStack_c8._1_3_,*(undefined1 *)(lVar9 + 0x120));
              puVar19[1] = *(undefined8 *)(lVar9 + 0x9c);
              *puVar19 = uVar11;
            }
            else {
              uVar12 = (ulong)uVar6;
              while( true ) {
                uVar12 = uVar12 - 1;
                if ((4 < (byte)pcVar18[uVar12 & 0xffffffff] - 9) &&
                   ((byte)pcVar18[uVar12 & 0xffffffff] != 0x20)) break;
                if ((int)uVar12 == 0) goto LAB_00859158;
              }
              uVar11 = *(undefined8 *)(lVar9 + 0x94);
              uStack_c8 = CONCAT31(uStack_c8._1_3_,*(undefined1 *)(lVar9 + 0x120));
              puVar19[1] = *(undefined8 *)(lVar9 + 0x9c);
              *puVar19 = uVar11;
              if (uVar12 < 0xfffffffffffffff8) {
                if (uVar12 < 0x17) {
                  uStack_b0 = CONCAT71(uStack_b0._1_7_,(char)((int)uVar12 << 1));
                  __dest = (void *)((long)&uStack_b0 + 1);
                }
                else {
                  uVar14 = 0x1a;
                  if ((uVar12 | 7) != 0x17) {
                    uVar14 = (uVar12 | 7) + 1;
                  }
                  pvStack_a0 = operator_new(uVar14);
                  uStack_b0 = uVar14 | 1;
                  __dest = pvStack_a0;
                  uStack_a8 = uVar12;
                }
                if (uVar12 != 0) {
                  memmove(__dest,pcVar18 + 1,uVar12);
                }
                puVar1 = *(undefined8 **)(lVar9 + 0x110);
                puVar2 = *(undefined8 **)(lVar9 + 0x118);
                *(undefined1 *)((long)__dest + uVar12) = 0;
                if (puVar1 < puVar2) {
                  *(undefined4 *)(puVar1 + 2) = uStack_b8;
                  puVar1[1] = CONCAT44(uStack_bc,uStack_c0);
                  *puVar1 = CONCAT44(uStack_c4,uStack_c8);
                  puVar1[5] = pvStack_a0;
                  puVar1[4] = uStack_a8;
                  puVar1[3] = uStack_b0;
                  *(undefined8 **)(lVar9 + 0x110) = puVar1 + 6;
                }
                else {
                  uVar11 = FUN_008704f0(lVar9 + 0x108,&uStack_c8);
                  *(undefined8 *)(lVar9 + 0x110) = uVar11;
                  if ((uStack_b0 & 1) != 0) {
                    operator_delete(pvStack_a0,uStack_b0 & 0xfffffffffffffffe);
                  }
                }
                goto LAB_00858f9c;
              }
            }
            if (*(long *)(lVar4 + 0x28) == lStack_98) {
                    /* WARNING: Subroutine does not return */
              FUN_007fe124();
            }
            goto LAB_008591b8;
          }
        }
        else if (*(int *)(lVar9 + 0x90) == 0x11f) break;
LAB_00858f9c:
        piVar10 = (int *)FUN_00853538(lVar9 + 0x70,0,0);
      }
      if (*(long *)(lVar4 + 0x28) == lStack_98) {
        return;
      }
LAB_008591b8:
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    uVar14 = (long)uVar12 >> 1;
    if ((ulong)((long)uVar12 >> 1) <= param_2) {
      uVar14 = param_2;
    }
    if (0x7ffffffffffffffb < uVar12) {
      uVar14 = 0x3fffffffffffffff;
    }
    if (uVar14 >> 0x3e != 0) goto LAB_00858f28;
    puVar7 = operator_new(uVar14 * 4);
    uVar3 = *param_3;
    uVar12 = param_2 - 1 & 0x3fffffffffffffff;
    puVar13 = puVar7 + param_2;
    param_1[2] = puVar7 + uVar14;
    *param_1 = puVar7;
    if (6 < uVar12) {
      uVar12 = uVar12 + 1;
      puVar19 = (undefined8 *)(puVar7 + 4);
      uVar15 = uVar12 & 0x7ffffffffffffff8;
      uVar14 = uVar15;
      do {
        uVar14 = uVar14 - 8;
        puVar19[-1] = CONCAT44(uVar3,uVar3);
        puVar19[-2] = CONCAT44(uVar3,uVar3);
        puVar19[1] = CONCAT44(uVar3,uVar3);
        *puVar19 = CONCAT44(uVar3,uVar3);
        puVar19 = puVar19 + 4;
      } while (uVar14 != 0);
      puVar7 = puVar7 + uVar15;
      if (uVar12 == uVar15) goto LAB_00858f14;
    }
    do {
      puVar8 = puVar7 + 1;
      *puVar7 = uVar3;
      puVar7 = puVar8;
    } while (puVar8 != puVar13);
    goto LAB_00858f14;
  }
  puVar7 = (undefined4 *)param_1[1];
  uVar14 = (long)puVar7 - (long)puVar13 >> 2;
  uVar12 = uVar14;
  if (param_2 <= uVar14) {
    uVar12 = param_2;
  }
  if (uVar12 != 0) {
    uVar3 = *param_3;
    puVar8 = puVar13;
    uVar15 = uVar12;
    if (7 < uVar12) {
      uVar17 = uVar12 & 0xfffffffffffffff8;
      uVar15 = uVar12 & 7;
      puVar19 = (undefined8 *)(puVar13 + 4);
      uVar16 = uVar17;
      do {
        uVar16 = uVar16 - 8;
        puVar19[-1] = CONCAT44(uVar3,uVar3);
        puVar19[-2] = CONCAT44(uVar3,uVar3);
        puVar19[1] = CONCAT44(uVar3,uVar3);
        *puVar19 = CONCAT44(uVar3,uVar3);
        puVar19 = puVar19 + 4;
      } while (uVar16 != 0);
      puVar8 = puVar13 + uVar17;
      if (uVar12 == uVar17) goto LAB_00858ea0;
    }
    do {
      uVar15 = uVar15 - 1;
      *puVar8 = uVar3;
      puVar8 = puVar8 + 1;
    } while (uVar15 != 0);
  }
LAB_00858ea0:
  if (param_2 < uVar14 || param_2 - uVar14 == 0) {
    puVar13 = puVar13 + param_2;
LAB_00858f14:
    param_1[1] = puVar13;
    return;
  }
  uVar3 = *param_3;
  uVar12 = (param_2 * 4 - ((long)puVar7 - (long)puVar13)) - 4;
  puVar13 = puVar7;
  if (0x1b < uVar12) {
    uVar12 = (uVar12 >> 2) + 1;
    uVar16 = uVar12 & 0x7ffffffffffffff8;
    puVar19 = (undefined8 *)(puVar7 + 4);
    uVar15 = uVar16;
    do {
      uVar15 = uVar15 - 8;
      puVar19[-1] = CONCAT44(uVar3,uVar3);
      puVar19[-2] = CONCAT44(uVar3,uVar3);
      puVar19[1] = CONCAT44(uVar3,uVar3);
      *puVar19 = CONCAT44(uVar3,uVar3);
      puVar19 = puVar19 + 4;
    } while (uVar15 != 0);
    puVar13 = puVar7 + uVar16;
    if (uVar12 == uVar16) goto LAB_00858f08;
  }
  do {
    puVar8 = puVar13 + 1;
    *puVar13 = uVar3;
    puVar13 = puVar8;
  } while (puVar8 != puVar7 + (param_2 - uVar14));
LAB_00858f08:
  param_1[1] = puVar7 + (param_2 - uVar14);
  return;
}

