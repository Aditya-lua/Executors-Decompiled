/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb4b6c
 */

void HUF_readDTableX2_wksp
               (uint *param_1,undefined8 param_2,undefined8 param_3,int *param_4,ulong param_5,
               undefined4 param_6)

{
  uint uVar1;
  undefined8 *puVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  byte bVar9;
  uint uVar10;
  uint uVar11;
  long lVar12;
  ulong uVar13;
  int *piVar14;
  ulong uVar15;
  long lVar16;
  uint uVar17;
  ulong uVar18;
  int iVar19;
  ulong uVar20;
  undefined8 uVar21;
  uint uVar22;
  undefined8 *puVar23;
  uint uVar24;
  int *piVar25;
  long lVar26;
  ulong uVar27;
  ulong uVar28;
  int iVar29;
  long lVar30;
  ulong uVar31;
  ulong uVar32;
  uint uVar33;
  uint *puVar34;
  int iVar35;
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  uint local_bc;
  uint local_78;
  uint local_74;
  long local_70;
  
  lVar12 = tpidr_el0;
  local_70 = *(long *)(lVar12 + 0x28);
  if (param_5 < 0x84c) {
    uVar13 = 0xffffffffffffffff;
    goto LAB_00bb50dc;
  }
  uVar6 = *param_1;
  uVar24 = uVar6 & 0xff;
  param_4[0xa2] = 0;
  param_4[0xa3] = 0;
  param_4[0xa0] = 0;
  param_4[0xa1] = 0;
  param_4[0xa6] = 0;
  param_4[0xa7] = 0;
  param_4[0xa4] = 0;
  param_4[0xa5] = 0;
  param_4[0xaa] = 0;
  param_4[0xab] = 0;
  param_4[0xa8] = 0;
  param_4[0xa9] = 0;
  param_4[0xae] = 0;
  param_4[0xaf] = 0;
  param_4[0xac] = 0;
  param_4[0xad] = 0;
  param_4[0xb2] = 0;
  param_4[0xb3] = 0;
  param_4[0xb0] = 0;
  param_4[0xb1] = 0;
  param_4[0xb6] = 0;
  param_4[0xb7] = 0;
  param_4[0xb4] = 0;
  param_4[0xb5] = 0;
  param_4[0x9e] = 0;
  param_4[0x9f] = 0;
  param_4[0x9c] = 0;
  param_4[0x9d] = 0;
  if (uVar24 < 0xd) {
    uVar13 = HUF_readStats_wksp(param_4 + 0xf8,0x100,param_4 + 0x9c,&local_78,&local_74,param_2,
                                param_3,param_4 + 0x138,0x36c,param_6);
    if (0xffffffffffffff88 < uVar13) goto LAB_00bb50dc;
    if (local_74 <= uVar24) {
      piVar14 = param_4 + 0xaa;
      uVar17 = local_74;
      iVar29 = -1;
      do {
        iVar19 = iVar29;
        uVar22 = uVar17;
        uVar17 = uVar22 - 1;
        iVar29 = iVar19 + 1;
      } while ((param_4 + 0x9c)[uVar22] == 0);
      uVar17 = uVar22 + 1;
      uVar18 = (ulong)uVar17;
      uVar3 = 0xb;
      if (0xb < local_74 || uVar24 != 0xc) {
        uVar3 = uVar24;
      }
      if (uVar17 < 2) {
        iVar29 = 0;
      }
      else {
        iVar29 = 0;
        piVar25 = param_4 + 0x9d;
        lVar26 = uVar18 - 1;
        do {
          iVar5 = *piVar25;
          lVar26 = lVar26 + -1;
          piVar25[0xe] = iVar29;
          piVar25 = piVar25 + 1;
          iVar29 = iVar5 + iVar29;
        } while (lVar26 != 0);
      }
      *piVar14 = iVar29;
      piVar14[uVar17] = iVar29;
      if (local_78 != 0) {
        uVar27 = 0;
        do {
          bVar9 = *(byte *)((long)(param_4 + 0xf8) + uVar27);
          uVar24 = piVar14[bVar9];
          *(char *)((long)param_4 + (ulong)uVar24 + 0x2e0) = (char)uVar27;
          uVar27 = uVar27 + 1;
          piVar14[bVar9] = uVar24 + 1;
        } while (local_78 != uVar27);
      }
      *piVar14 = 0;
      if (1 < uVar17) {
        iVar29 = 0;
        uVar24 = uVar3 - local_74;
        lVar26 = uVar18 - 1;
        piVar14 = param_4;
        do {
          piVar14[1] = iVar29;
          lVar26 = lVar26 + -1;
          uVar33 = uVar24 & 0x1f;
          uVar24 = uVar24 + 1;
          iVar29 = (piVar14[0x9d] << (ulong)uVar33) + iVar29;
          piVar14 = piVar14 + 1;
        } while (lVar26 != 0);
      }
      uVar24 = uVar3 - (iVar19 + 1);
      if (iVar19 + 2U < uVar24) {
        uVar20 = (ulong)(iVar19 + 2);
        uVar28 = uVar18 - 1;
        lVar30 = uVar20 * 0x34;
        uVar32 = uVar28 & 0xfffffffffffffff8;
        lVar26 = 0;
        uVar27 = uVar20;
        do {
          if (1 < uVar17) {
            uVar33 = (uint)uVar27;
            if (uVar28 < 8) {
              uVar15 = 1;
            }
            else {
              uVar15 = 1;
              if (0x1f < (lVar26 + uVar20) * 0x34) {
                piVar14 = param_4;
                uVar15 = uVar32;
                do {
                  uVar15 = uVar15 - 8;
                  auVar36._4_4_ = -uVar33;
                  auVar36._0_4_ = -uVar33;
                  auVar36._8_4_ = -uVar33;
                  auVar36._12_4_ = -uVar33;
                  auVar36 = NEON_ushl(*(undefined1 (*) [16])(piVar14 + 1),auVar36,4);
                  auVar37._4_4_ = -uVar33;
                  auVar37._0_4_ = -uVar33;
                  auVar37._8_4_ = -uVar33;
                  auVar37._12_4_ = -uVar33;
                  auVar37 = NEON_ushl(*(undefined1 (*) [16])(piVar14 + 5),auVar37,4);
                  *(long *)((long)piVar14 + lVar30 + 0xc) = auVar36._8_8_;
                  *(long *)((long)piVar14 + lVar30 + 4) = auVar36._0_8_;
                  *(long *)((long)piVar14 + lVar30 + 0x1c) = auVar37._8_8_;
                  *(long *)((long)piVar14 + lVar30 + 0x14) = auVar37._0_8_;
                  piVar14 = piVar14 + 8;
                } while (uVar15 != 0);
                uVar15 = uVar32 | 1;
                if (uVar28 == uVar32) goto LAB_00bb4d74;
              }
            }
            puVar34 = (uint *)(param_4 + uVar15);
            lVar16 = uVar18 - uVar15;
            do {
              lVar16 = lVar16 + -1;
              *(uint *)((long)puVar34 + lVar30) = *puVar34 >> (ulong)(uVar33 & 0x1f);
              puVar34 = puVar34 + 1;
            } while (lVar16 != 0);
          }
LAB_00bb4d74:
          uVar27 = uVar27 + 1;
          lVar26 = lVar26 + 1;
          lVar30 = lVar30 + 0x34;
        } while (uVar24 != (uint)uVar27);
      }
      if (0 < (int)uVar22) {
        local_bc = local_74 << 1 | 1;
        uVar27 = 1;
        uVar17 = local_74;
        uVar24 = local_bc - uVar3;
        do {
          uVar20 = uVar27 + 1;
          uVar33 = (local_74 + 1) - (int)uVar27;
          uVar11 = uVar24 - 1;
          lVar26 = (long)param_4[uVar27 + 0xa9];
          iVar29 = param_4[uVar27 + 0xaa];
          if (uVar11 == 0 || (int)uVar24 < 1) {
            uVar24 = 1;
          }
          if (uVar3 - uVar33 < iVar19 + 2U) {
            FUN_00bb91ac(param_1 + (ulong)(uint)param_4[uVar27] + 1,(long)param_4 + lVar26 + 0x2e0,
                         (long)param_4 + (long)iVar29 + 0x2e0,uVar33,uVar3,0,1);
          }
          else if (param_4[uVar27 + 0xa9] != iVar29) {
            uVar7 = param_4[uVar27];
            iVar5 = 1 << (ulong)(uVar3 - uVar33 & 0x1f);
            uVar1 = uVar33 + ((local_74 + 1) - uVar3);
            uVar4 = uVar1;
            if ((int)uVar1 < 2) {
              uVar4 = 1;
            }
            do {
              uVar27 = -(ulong)(uVar7 >> 0x1f) & 0xfffffffc00000000 | (ulong)uVar7 << 2;
              bVar9 = *(byte *)((long)param_4 + lVar26 + 0x2e0);
              puVar2 = (undefined8 *)((long)param_1 + uVar27 + 4);
              if (1 < (int)uVar1) {
                uVar10 = uVar33 * 0x10000 + 0x1000000 | (uint)bVar9;
                uVar21 = CONCAT44(uVar10,uVar10);
                if (iVar5 == 2) {
                  *puVar2 = uVar21;
                }
                else if (iVar5 == 4) {
                  *puVar2 = uVar21;
                  puVar2[1] = uVar21;
                }
                else {
                  uVar8 = param_4[(ulong)uVar33 * 0xd + (ulong)uVar4];
                  if (0 < (int)uVar8) {
                    if (uVar8 < 0x19) {
                      uVar32 = 0;
                    }
                    else {
                      puVar23 = (undefined8 *)((long)param_1 + uVar27 + 0x44);
                      uVar28 = ((ulong)uVar8 - 1 >> 3) + 1;
                      uVar31 = uVar28 & 0x3ffffffffffffffc;
                      uVar32 = uVar31 << 3;
                      uVar15 = uVar31;
                      do {
                        puVar23[-7] = CONCAT44(uVar10,uVar10);
                        puVar23[-8] = CONCAT44(uVar10,uVar10);
                        puVar23[-5] = CONCAT44(uVar10,uVar10);
                        puVar23[-6] = CONCAT44(uVar10,uVar10);
                        uVar15 = uVar15 - 4;
                        puVar23[-3] = CONCAT44(uVar10,uVar10);
                        puVar23[-4] = CONCAT44(uVar10,uVar10);
                        puVar23[-1] = CONCAT44(uVar10,uVar10);
                        puVar23[-2] = CONCAT44(uVar10,uVar10);
                        puVar23[1] = CONCAT44(uVar10,uVar10);
                        *puVar23 = CONCAT44(uVar10,uVar10);
                        puVar23[3] = CONCAT44(uVar10,uVar10);
                        puVar23[2] = CONCAT44(uVar10,uVar10);
                        puVar23[5] = CONCAT44(uVar10,uVar10);
                        puVar23[4] = CONCAT44(uVar10,uVar10);
                        puVar23[7] = CONCAT44(uVar10,uVar10);
                        puVar23[6] = CONCAT44(uVar10,uVar10);
                        puVar23 = puVar23 + 0x10;
                      } while (uVar15 != 0);
                      if (uVar28 == uVar31) goto LAB_00bb505c;
                    }
                    puVar23 = (undefined8 *)((long)param_1 + uVar27 + uVar32 * 4 + 0x14);
                    do {
                      uVar32 = uVar32 + 8;
                      puVar23[-2] = uVar21;
                      puVar23[-1] = uVar21;
                      *puVar23 = uVar21;
                      puVar23[1] = uVar21;
                      puVar23 = puVar23 + 4;
                    } while (uVar32 < uVar8);
                  }
                }
              }
LAB_00bb505c:
              if ((int)uVar4 <= (int)uVar22) {
                lVar30 = uVar18 - uVar24;
                piVar14 = param_4 + uVar24;
                iVar35 = local_bc - uVar24;
                do {
                  FUN_00bb91ac((long)puVar2 + (ulong)(uint)piVar14[(ulong)uVar17 * 0xd] * 4,
                               (long)param_4 + (long)piVar14[0xa9] + 0x2e0,
                               (long)param_4 + (long)piVar14[0xaa] + 0x2e0,iVar35,uVar3,bVar9,2);
                  lVar30 = lVar30 + -1;
                  piVar14 = piVar14 + 1;
                  iVar35 = iVar35 + -1;
                } while (lVar30 != 0);
              }
              lVar26 = lVar26 + 1;
              uVar7 = uVar7 + iVar5;
            } while (iVar29 != (int)lVar26);
          }
          local_bc = local_bc - 1;
          uVar17 = uVar17 - 1;
          uVar27 = uVar20;
          uVar24 = uVar11;
        } while (uVar20 != uVar18);
      }
      *(char *)param_1 = (char)uVar6;
      *(undefined1 *)((long)param_1 + 1) = 1;
      *(char *)((long)param_1 + 2) = (char)uVar3;
      *(char *)((long)param_1 + 3) = (char)(uVar6 >> 0x18);
      goto LAB_00bb50dc;
    }
  }
  uVar13 = 0xffffffffffffffd4;
LAB_00bb50dc:
  if (*(long *)(lVar12 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar13);
  }
  return;
}

