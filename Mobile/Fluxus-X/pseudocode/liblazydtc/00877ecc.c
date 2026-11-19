/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00877ecc
 */

void FUN_00877ecc(undefined8 *param_1,long param_2,undefined1 *param_3)

{
  ulong uVar1;
  uint *puVar2;
  uint uVar3;
  ulong uVar4;
  uint *puVar5;
  undefined4 *puVar6;
  int *piVar7;
  uint uVar8;
  uint uVar9;
  undefined1 uVar10;
  uint uVar11;
  ulong __n;
  int iVar12;
  long lVar13;
  undefined4 *puVar14;
  void *pvVar15;
  undefined8 uVar16;
  long lVar17;
  undefined4 *puVar18;
  ulong uVar19;
  int *piVar20;
  undefined4 *unaff_x19;
  undefined4 *puVar21;
  ulong uVar22;
  long lVar23;
  ulong uVar24;
  undefined4 *puVar25;
  size_t sVar26;
  ulong local_b8;
  long local_a0;
  void *local_88;
  undefined4 *local_78;
  undefined4 *local_70;
  undefined4 *local_68;
  
  if ((*(byte *)(param_2 + 0xf0) & 1) == 0) {
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  else {
    lVar13 = *(long *)(param_2 + 0x90);
    lVar17 = *(long *)(param_2 + 0x98);
    lVar23 = 0;
    if (lVar17 != lVar13) {
      lVar23 = LZCOUNT(lVar17 - lVar13 >> 3) * -2 + 0x7e;
    }
    FUN_0087a7a0(lVar13,lVar17,lVar23,1);
    puVar21 = *(undefined4 **)(param_2 + 0x30);
    __n = *(long *)(param_2 + 0x38) - (long)puVar21;
    if (__n == 0) {
      local_88 = (void *)0x0;
      local_a0 = 0;
      puVar14 = (undefined4 *)0x0;
      local_78 = (undefined4 *)0x0;
      local_70 = (undefined4 *)0x0;
      unaff_x19 = (undefined4 *)0x0;
      local_68 = (undefined4 *)0x0;
      puVar18 = (undefined4 *)0x0;
    }
    else {
      if ((long)__n < 0) {
LAB_008786e4:
        uVar16 = FUN_0086f7b4();
                    /* catch() { ... } // from try @ 0087811c with catch @ 008786e8 */
                    /* catch() { ... } // from try @ 0087836c with catch @ 0087870c
                       catch() { ... } // from try @ 0087840c with catch @ 0087870c */
        if (local_78 != (undefined4 *)0x0) {
          operator_delete(local_78,(long)local_70 - (long)local_78);
        }
        if (unaff_x19 != (undefined4 *)0x0) {
          operator_delete(unaff_x19,(long)local_68 - (long)unaff_x19);
        }
        operator_delete(local_88,local_b8);
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090(uVar16);
      }
      local_88 = operator_new(__n);
      memset(local_88,0,__n);
                    /* try { // try from 00877f58 to 00877f7f has its CatchHandler @ 008786f0 */
      unaff_x19 = operator_new(__n);
      local_68 = (undefined4 *)((long)unaff_x19 + __n);
      puVar14 = operator_new(__n);
      local_a0 = (long)local_88 + __n;
      uVar19 = 0;
      uVar22 = 0;
      local_70 = (undefined4 *)((long)puVar14 + __n);
      puVar18 = unaff_x19;
      local_78 = puVar14;
      do {
        uVar10 = *(undefined1 *)(puVar21 + uVar22);
        if (uVar19 < (ulong)(*(long *)(param_2 + 0x98) - *(long *)(param_2 + 0x90) >> 3)) {
          puVar2 = (uint *)(*(long *)(param_2 + 0x90) + uVar19 * 8);
          uVar8 = *puVar2;
          if (uVar22 == uVar8) {
            uVar8 = puVar2[1] + ~uVar8;
            uVar9 = -uVar8;
            if (-1 < (int)uVar8) {
              uVar9 = uVar8;
            }
            if (0x2aa9 < uVar9) {
              if (puVar18 < local_68) {
                *puVar18 = 0x10017;
                puVar21 = unaff_x19;
              }
              else {
                sVar26 = (long)puVar18 - (long)unaff_x19;
                uVar1 = ((long)sVar26 >> 2) + 1;
                if (uVar1 >> 0x3e != 0) {
                  FUN_0086f7b4();
                  goto LAB_008786cc;
                }
                uVar24 = (long)local_68 - (long)unaff_x19;
                uVar4 = (long)uVar24 >> 1;
                if ((ulong)((long)uVar24 >> 1) <= uVar1) {
                  uVar4 = uVar1;
                }
                if (0x7ffffffffffffffb < uVar24) {
                  uVar4 = 0x3fffffffffffffff;
                }
                if (uVar4 >> 0x3e != 0) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008786c4 to 008786cb has its CatchHandler @ 00878704 */
                  FUN_007fe1b8();
                }
                    /* try { // try from 0087806c to 0087806f has its CatchHandler @ 008786ec */
                pvVar15 = operator_new(uVar4 << 2);
                puVar18 = (undefined4 *)((long)pvVar15 + sVar26);
                local_68 = (undefined4 *)((long)pvVar15 + uVar4 * 4);
                puVar21 = puVar18 + -((long)sVar26 >> 2);
                *puVar18 = 0x10017;
                memcpy(puVar21,unaff_x19,sVar26);
                if (unaff_x19 != (undefined4 *)0x0) {
                  operator_delete(unaff_x19,uVar24);
                }
              }
              puVar25 = puVar18 + 1;
              if (puVar25 < local_68) {
                puVar18 = puVar18 + 2;
                *puVar25 = 0x43;
                unaff_x19 = puVar21;
              }
              else {
                sVar26 = (long)puVar25 - (long)puVar21;
                uVar1 = ((long)sVar26 >> 2) + 1;
                if (uVar1 >> 0x3e != 0) {
                  FUN_0086f7b4(uVar10);
                  goto LAB_008786d4;
                }
                uVar24 = (long)local_68 - (long)puVar21;
                uVar4 = (long)uVar24 >> 1;
                if ((ulong)((long)uVar24 >> 1) <= uVar1) {
                  uVar4 = uVar1;
                }
                if (0x7ffffffffffffffb < uVar24) {
                  uVar4 = 0x3fffffffffffffff;
                }
                if (uVar4 >> 0x3e != 0) {
LAB_008786cc:
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008786cc to 008786d3 has its CatchHandler @ 00878700 */
                  FUN_007fe1b8();
                }
                    /* try { // try from 0087811c to 0087811f has its CatchHandler @ 008786e8 */
                pvVar15 = operator_new(uVar4 << 2);
                puVar25 = (undefined4 *)((long)pvVar15 + sVar26);
                local_68 = (undefined4 *)((long)pvVar15 + uVar4 * 4);
                unaff_x19 = puVar25 + -((long)sVar26 >> 2);
                puVar18 = puVar25 + 1;
                *puVar25 = 0x43;
                memcpy(unaff_x19,puVar21,sVar26);
                if (puVar21 != (undefined4 *)0x0) {
                  operator_delete(puVar21,uVar24);
                }
              }
              lVar23 = *(long *)(param_2 + 0x48);
              if (puVar14 < local_70) {
                puVar25 = puVar14 + 1;
                *puVar14 = *(undefined4 *)(lVar23 + uVar22 * 4);
              }
              else {
                sVar26 = (long)puVar14 - (long)local_78;
                uVar1 = ((long)sVar26 >> 2) + 1;
                if (uVar1 >> 0x3e != 0) {
                  FUN_00879790(uVar10);
                  goto LAB_008786dc;
                }
                uVar24 = (long)local_70 - (long)local_78;
                uVar4 = (long)uVar24 >> 1;
                if ((ulong)((long)uVar24 >> 1) <= uVar1) {
                  uVar4 = uVar1;
                }
                if (0x7ffffffffffffffb < uVar24) {
                  uVar4 = 0x3fffffffffffffff;
                }
                if (uVar4 >> 0x3e != 0) {
LAB_008786d4:
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008786d4 to 008786e3 has its CatchHandler @ 00878708 */
                  FUN_007fe1b8();
                }
                    /* try { // try from 008781c8 to 008781cb has its CatchHandler @ 008786fc */
                pvVar15 = operator_new(uVar4 << 2);
                puVar21 = (undefined4 *)((long)pvVar15 + sVar26);
                local_70 = (undefined4 *)((long)pvVar15 + uVar4 * 4);
                puVar14 = puVar21 + -((long)sVar26 >> 2);
                puVar25 = puVar21 + 1;
                *puVar21 = *(undefined4 *)(lVar23 + uVar22 * 4);
                memcpy(puVar14,local_78,sVar26);
                if (local_78 == (undefined4 *)0x0) {
                  local_78 = puVar14;
                }
                else {
                  operator_delete(local_78,uVar24);
                  lVar23 = *(long *)(param_2 + 0x48);
                  local_78 = puVar14;
                }
              }
              if (puVar25 < local_70) {
                *puVar25 = *(undefined4 *)(lVar23 + uVar22 * 4);
              }
              else {
                sVar26 = (long)puVar25 - (long)local_78;
                uVar1 = ((long)sVar26 >> 2) + 1;
                if (uVar1 >> 0x3e != 0) {
                  FUN_00879790(uVar10);
                  local_b8 = __n;
                  goto LAB_008786e4;
                }
                uVar24 = (long)local_70 - (long)local_78;
                uVar4 = (long)uVar24 >> 1;
                if ((ulong)((long)uVar24 >> 1) <= uVar1) {
                  uVar4 = uVar1;
                }
                if (0x7ffffffffffffffb < uVar24) {
                  uVar4 = 0x3fffffffffffffff;
                }
                if (uVar4 >> 0x3e != 0) {
LAB_008786dc:
                    /* WARNING: Subroutine does not return */
                  FUN_007fe1b8();
                }
                    /* try { // try from 00878288 to 0087828b has its CatchHandler @ 008786fc */
                pvVar15 = operator_new(uVar4 << 2);
                puVar25 = (undefined4 *)((long)pvVar15 + sVar26);
                local_70 = (undefined4 *)((long)pvVar15 + uVar4 * 4);
                *puVar25 = *(undefined4 *)(lVar23 + uVar22 * 4);
                memcpy(puVar25 + -((long)sVar26 >> 2),local_78,sVar26);
                if (local_78 != (undefined4 *)0x0) {
                  operator_delete(local_78,uVar24);
                }
                local_78 = puVar25 + -((long)sVar26 >> 2);
              }
              puVar14 = puVar25 + 1;
            }
            uVar19 = uVar19 + 1;
          }
        }
        iVar12 = FUN_007feb1c(uVar10);
        if (0 < iVar12) {
          puVar21 = unaff_x19;
          do {
            sVar26 = (long)puVar18 - (long)puVar21;
            lVar13 = *(long *)(param_2 + 0x30);
            lVar23 = (long)sVar26 >> 2;
            *(int *)((long)local_88 + uVar22 * 4) = (int)lVar23;
            if (local_68 <= puVar18) {
              uVar1 = lVar23 + 1;
              if (uVar1 >> 0x3e == 0) {
                uVar24 = (long)local_68 - (long)puVar21;
                uVar4 = (long)uVar24 >> 1;
                if ((ulong)((long)uVar24 >> 1) <= uVar1) {
                  uVar4 = uVar1;
                }
                if (0x7ffffffffffffffb < uVar24) {
                  uVar4 = 0x3fffffffffffffff;
                }
                if (uVar4 >> 0x3e != 0) goto LAB_008786a8;
                    /* try { // try from 0087836c to 0087836f has its CatchHandler @ 0087870c */
                pvVar15 = operator_new(uVar4 << 2);
                puVar18 = (undefined4 *)((long)pvVar15 + sVar26);
                local_68 = (undefined4 *)((long)pvVar15 + uVar4 * 4);
                unaff_x19 = puVar18 + -lVar23;
                *puVar18 = *(undefined4 *)(lVar13 + uVar22 * 4);
                memcpy(unaff_x19,puVar21,sVar26);
                if (puVar21 != (undefined4 *)0x0) {
                  operator_delete(puVar21,uVar24);
                }
                goto LAB_008783b0;
              }
                    /* try { // try from 00878694 to 008786c3 has its CatchHandler @ 00878720 */
              FUN_0086f7b4();
LAB_008786a0:
              FUN_00879790();
LAB_008786a8:
                    /* WARNING: Subroutine does not return */
              FUN_007fe1b8();
            }
            *puVar18 = *(undefined4 *)(lVar13 + uVar22 * 4);
            unaff_x19 = puVar21;
LAB_008783b0:
            puVar18 = puVar18 + 1;
            lVar23 = *(long *)(param_2 + 0x48);
            if (puVar14 < local_70) {
              *puVar14 = *(undefined4 *)(lVar23 + uVar22 * 4);
            }
            else {
              sVar26 = (long)puVar14 - (long)local_78;
              uVar1 = ((long)sVar26 >> 2) + 1;
              if (uVar1 >> 0x3e != 0) goto LAB_008786a0;
              uVar24 = (long)local_70 - (long)local_78;
              uVar4 = (long)uVar24 >> 1;
              if ((ulong)((long)uVar24 >> 1) <= uVar1) {
                uVar4 = uVar1;
              }
              if (0x7ffffffffffffffb < uVar24) {
                uVar4 = 0x3fffffffffffffff;
              }
              if (uVar4 >> 0x3e != 0) {
                    /* WARNING: Subroutine does not return */
                FUN_007fe1b8();
              }
                    /* try { // try from 0087840c to 0087840f has its CatchHandler @ 0087870c */
              pvVar15 = operator_new(uVar4 << 2);
              puVar14 = (undefined4 *)((long)pvVar15 + sVar26);
              local_70 = (undefined4 *)((long)pvVar15 + uVar4 * 4);
              *puVar14 = *(undefined4 *)(lVar23 + uVar22 * 4);
              memcpy(puVar14 + -((long)sVar26 >> 2),local_78,sVar26);
              if (local_78 != (undefined4 *)0x0) {
                operator_delete(local_78,uVar24);
              }
              local_78 = puVar14 + -((long)sVar26 >> 2);
            }
            puVar14 = puVar14 + 1;
            iVar12 = iVar12 + -1;
            uVar22 = uVar22 + 1;
            puVar21 = unaff_x19;
          } while (iVar12 != 0);
        }
        puVar21 = *(undefined4 **)(param_2 + 0x30);
      } while (uVar22 < (ulong)(*(long *)(param_2 + 0x38) - (long)puVar21 >> 2));
    }
    puVar5 = *(uint **)(param_2 + 0x98);
    for (puVar2 = *(uint **)(param_2 + 0x90); puVar2 != puVar5; puVar2 = puVar2 + 2) {
      uVar9 = *(uint *)((long)local_88 + (ulong)*puVar2 * 4);
      iVar12 = *(int *)((long)local_88 + (ulong)puVar2[1] * 4) - uVar9;
      uVar11 = iVar12 - 1;
      uVar8 = uVar11;
      if ((int)uVar11 < 0) {
        uVar8 = 1 - iVar12;
      }
      if (0x7ffffe < uVar8) {
        param_1[1] = 0;
        param_1[2] = 0;
        *param_3 = 1;
        *param_1 = 0;
        puVar21 = unaff_x19;
        lVar23 = local_a0;
        puVar6 = local_78;
        puVar18 = local_70;
        puVar25 = local_68;
        goto joined_r0x0087868c;
      }
      uVar8 = puVar2[1] + ~*puVar2;
      uVar3 = -uVar8;
      if (-1 < (int)uVar8) {
        uVar3 = uVar8;
      }
      if (uVar3 < 0x2aaa) {
        *(short *)((long)unaff_x19 + (ulong)uVar9 * 4 + 2) = (short)uVar11;
      }
      else {
        unaff_x19[uVar9 - 1] = (uint)*(byte *)(unaff_x19 + (uVar9 - 1)) | iVar12 * 0x100;
        *(undefined2 *)((long)unaff_x19 + (ulong)uVar9 * 4 + 2) = 0xfffe;
      }
    }
    puVar25 = *(undefined4 **)(param_2 + 0x40);
    puVar6 = *(undefined4 **)(param_2 + 0x48);
    *(undefined4 **)(param_2 + 0x30) = unaff_x19;
    *(undefined4 **)(param_2 + 0x38) = puVar18;
    lVar23 = *(long *)(param_2 + 0x1a8);
    lVar13 = *(long *)(param_2 + 0x1b0);
    *(undefined4 **)(param_2 + 0x40) = local_68;
    *(undefined4 **)(param_2 + 0x48) = local_78;
    *(undefined4 **)(param_2 + 0x50) = puVar14;
    puVar18 = *(undefined4 **)(param_2 + 0x58);
    *(undefined4 **)(param_2 + 0x58) = local_70;
    for (; lVar23 != lVar13; lVar23 = lVar23 + 0x10) {
      uVar8 = *(uint *)(lVar23 + 8);
      if (uVar8 == *(uint *)(lVar23 + 0xc)) {
        iVar12 = *(int *)((long)local_88 + (ulong)uVar8 * 4);
      }
      else {
        iVar12 = *(int *)((long)local_88 + (ulong)(*(uint *)(lVar23 + 0xc) - 1) * 4) + 1;
      }
      *(int *)(lVar23 + 0xc) = iVar12;
      *(undefined4 *)(lVar23 + 8) = *(undefined4 *)((long)local_88 + (ulong)uVar8 * 4);
    }
    lVar13 = *(long *)(param_2 + 0x1e0);
    for (lVar23 = *(long *)(param_2 + 0x1d8); lVar23 != lVar13; lVar23 = lVar23 + 0x10) {
      uVar8 = *(uint *)(lVar23 + 8);
      if (uVar8 == *(uint *)(lVar23 + 0xc)) {
        iVar12 = *(int *)((long)local_88 + (ulong)uVar8 * 4);
      }
      else {
        iVar12 = *(int *)((long)local_88 + (ulong)(*(uint *)(lVar23 + 0xc) - 1) * 4) + 1;
      }
      *(int *)(lVar23 + 0xc) = iVar12;
      *(undefined4 *)(lVar23 + 8) = *(undefined4 *)((long)local_88 + (ulong)uVar8 * 4);
    }
    piVar7 = *(int **)(param_2 + 0xe0);
    for (piVar20 = *(int **)(param_2 + 0xd8); piVar20 != piVar7; piVar20 = piVar20 + 2) {
      if (*piVar20 == 0) {
        piVar20[1] = *(int *)((long)local_88 + (ulong)(uint)piVar20[1] * 4);
      }
    }
    *param_1 = local_88;
    param_1[1] = local_a0;
    lVar23 = 0;
    local_88 = (void *)0x0;
    param_1[2] = local_a0;
joined_r0x0087868c:
    if (puVar6 != (undefined4 *)0x0) {
      operator_delete(puVar6,(long)puVar18 - (long)puVar6);
    }
    if (puVar21 != (undefined4 *)0x0) {
      operator_delete(puVar21,(long)puVar25 - (long)puVar21);
    }
    if (local_88 != (void *)0x0) {
      operator_delete(local_88,lVar23 - (long)local_88);
      return;
    }
  }
  return;
}

