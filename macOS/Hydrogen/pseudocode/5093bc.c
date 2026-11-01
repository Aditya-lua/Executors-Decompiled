
dword * FUN_005093bc(void)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  long lVar4;
  uint uVar5;
  uint uVar6;
  byte *pbVar7;
  undefined8 uVar8;
  dword *pdVar9;
  undefined *puVar10;
  undefined8 in_x3;
  byte *pbVar11;
  long lVar12;
  undefined8 *extraout_x8;
  undefined *puVar13;
  byte *pbVar14;
  byte *pbVar15;
  dword *pdVar16;
  dword *pdVar17;
  long lVar18;
  undefined *puVar19;
  undefined1 (*pauVar20) [16];
  undefined *puVar21;
  byte *pbVar22;
  byte *pbVar23;
  byte *pbVar24;
  code *pcVar25;
  uint uVar26;
  code *pcVar27;
  ulong uVar28;
  uint uVar29;
  byte *pbVar30;
  byte bVar31;
  byte bVar32;
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined8 uVar35;
  ulong uVar36;
  ulong uVar37;
  ulong uVar38;
  byte bVar39;
  undefined1 auVar40 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  char acStack_bc [4];
  undefined4 uStack_b8;
  byte bStack_b2;
  byte bStack_b1;
  
  puVar10 = &UNK_009e8d60;
  uVar8 = func_0x007a1f00();
  if (in_stack_00000008 != 0) {
    puVar10 = (undefined *)0x1;
    func_0x00187bd4(in_stack_00000010);
  }
  auVar40 = __Unwind_Resume(uVar8);
  uVar8 = 0;
  uVar28 = (long)puVar10 * 0x10;
  if (((ulong)puVar10 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar28)) {
__ZN40__LT_str_u20_as_u20_core__fmt__Debug_GT_3fmt17ha0e805b04319c80fE:
    auVar40 = func_0x007a1f00(uVar8,uVar28,in_x3);
    pbVar23 = *(byte **)(auVar40._0_8_ + 8);
    pbVar7 = *(byte **)(auVar40._0_8_ + 0x10);
    uVar8 = *auVar40._8_8_;
    lVar18 = auVar40._8_8_[1];
    pcVar27 = *(code **)(lVar18 + 0x20);
    uVar28 = (*pcVar27)(uVar8,0x22);
    if ((uVar28 & 1) == 0) {
      if (pbVar7 == (byte *)0x0) {
        pbVar14 = (byte *)0x0;
        pbVar24 = (byte *)0x0;
      }
      else {
        pbVar24 = (byte *)0x0;
        pbVar11 = pbVar23;
        pbVar15 = pbVar7;
        pbVar30 = (byte *)0x0;
        do {
          while( true ) {
            pbVar22 = (byte *)0x0;
            pbVar1 = pbVar11 + (long)pbVar15;
            while( true ) {
              bVar31 = pbVar11[(long)pbVar22];
              if (((bVar31 - 0x7f < 0xffffffa1) || (bVar31 == 0x22)) || (bVar31 == 0x5c)) break;
              pbVar22 = pbVar22 + 1;
              if (pbVar15 == pbVar22) {
                pbVar14 = pbVar15 + (long)pbVar30;
                goto code_r0x0046accc;
              }
            }
            pbVar14 = pbVar30 + (long)pbVar22;
            pbVar15 = pbVar11 + (long)pbVar22;
            uVar26 = (uint)*pbVar15;
            if ((char)*pbVar15 < '\0') break;
            pbVar11 = pbVar15 + 1;
code_r0x0046ab60:
            func_0x004623d8(acStack_bc,uVar26,&UNK_00010001);
            if ((acStack_bc[0] != -0x80) && ((byte)(bStack_b1 - bStack_b2) != '\x01')) {
              if (pbVar14 < pbVar24) goto code_r0x0046ad84;
              if (pbVar24 != (byte *)0x0) {
                if (pbVar24 < pbVar7) {
                  if (-0x41 < (char)pbVar23[(long)pbVar24]) goto code_r0x0046abc0;
                }
                else if (pbVar24 == pbVar7) goto code_r0x0046abc0;
                goto code_r0x0046ad84;
              }
code_r0x0046abc0:
              if (pbVar14 != (byte *)0x0) {
                if (pbVar14 < pbVar7) {
                  if ((char)(pbVar23 + (long)pbVar30)[(long)pbVar22] < -0x40) goto code_r0x0046ad84;
                }
                else if (pbVar14 != pbVar7) {
code_r0x0046ad84:
                  func_0x007a297c(pbVar23,pbVar7,pbVar24,pbVar30 + (long)pbVar22,&UNK_009e06f8);
                  goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
                }
              }
              pcVar25 = *(code **)(lVar18 + 0x18);
              uVar28 = (*pcVar25)(uVar8,pbVar23 + (long)pbVar24,
                                  pbVar22 + ((long)pbVar30 - (long)pbVar24));
              if ((uVar28 & 1) != 0) goto code_r0x0046ad50;
              if (acStack_bc[0] == -0x80) {
                uVar28 = (*pcVar27)(uVar8,uStack_b8);
              }
              else {
                uVar28 = (*pcVar25)(uVar8,acStack_bc + bStack_b2,(ulong)bStack_b1 - (ulong)bStack_b2
                                   );
              }
              if ((uVar28 & 1) != 0) goto code_r0x0046ad50;
              if (uVar26 < 0x80) {
                lVar12 = 1;
              }
              else if (uVar26 < 0x800) {
                lVar12 = 2;
              }
              else {
                lVar12 = 3;
                if (0xffff < uVar26) {
                  lVar12 = 4;
                }
              }
              pbVar24 = pbVar30 + (long)pbVar22 + lVar12;
            }
            lVar12 = 3;
            if (0xffff < uVar26) {
              lVar12 = 4;
            }
            lVar4 = 2;
            if (0x7ff < uVar26) {
              lVar4 = lVar12;
            }
            lVar12 = 1;
            if (0x7f < uVar26) {
              lVar12 = lVar4;
            }
            pbVar14 = pbVar30 + (long)pbVar22 + lVar12;
            pbVar15 = pbVar1 + -(long)pbVar11;
            pbVar30 = pbVar14;
            if (pbVar15 == (byte *)0x0) goto code_r0x0046accc;
          }
          uVar6 = pbVar15[1] & 0x3f;
          if (uVar26 < 0xe0) {
            uVar26 = uVar6 | (uVar26 & 0x1f) << 6;
            pbVar11 = pbVar15 + 2;
            goto code_r0x0046ab60;
          }
          pbVar2 = pbVar11 + (long)pbVar22;
          uVar6 = pbVar15[2] & 0x3f | uVar6 << 6;
          if (uVar26 < 0xf0) {
            uVar26 = uVar6 | (uVar26 & 0x1f) << 0xc;
            pbVar11 = pbVar2 + 3;
            goto code_r0x0046ab60;
          }
          pbVar11 = pbVar2 + 4;
          uVar26 = pbVar2[3] & 0x3f | uVar6 << 6 | (uVar26 & 7) << 0x12;
          if (uVar26 != 0x110000) goto code_r0x0046ab60;
          pbVar15 = pbVar1 + -(long)pbVar11;
          pbVar30 = pbVar14;
        } while (pbVar15 != (byte *)0x0);
code_r0x0046accc:
        if (pbVar14 < pbVar24) goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
        if (pbVar24 != (byte *)0x0) {
          if (pbVar24 < pbVar7) {
            if ((char)pbVar23[(long)pbVar24] < -0x40)
            goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
          }
          else if (pbVar24 != pbVar7) goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
        }
        if (pbVar14 != (byte *)0x0) {
          if (pbVar14 < pbVar7) {
            if ((char)pbVar23[(long)pbVar14] < -0x40)
            goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
          }
          else if (pbVar14 != pbVar7) {
__ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E:
            auVar40 = func_0x007a297c(pbVar23,pbVar7,pbVar24,pbVar14,&UNK_009e0710);
            pbVar23 = auVar40._8_8_;
            pbVar7 = auVar40._0_8_;
            uVar26 = *(uint *)(pbVar24 + 0x10);
            if ((uVar26 & 0x18000000) != 0) {
              if ((uVar26 >> 0x1c & 1) == 0) {
                if (pbVar23 < (byte *)0x20) {
                  if (pbVar23 == (byte *)0x0) {
                    uVar28 = 0;
                  }
                  else {
                    if ((byte *)0x7 < pbVar23) {
                      pbVar14 = (byte *)((ulong)pbVar23 & 0x18);
                      uVar8 = *(undefined8 *)pbVar7;
                      bVar31 = -(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1;
                      bVar32 = -(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1;
                      auVar40._0_8_ = CONCAT71(0,-(-0x41 < (char)((ulong)uVar8 >> 0x20)) & 1);
                      auVar40[8] = -(-0x41 < (char)((ulong)uVar8 >> 0x28)) & 1;
                      auVar40._9_7_ = 0;
                      uVar28 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                      uVar36 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                      uVar37 = (ulong)(-(-0x41 < (char)uVar8) & 1);
                      uVar38 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
                      if (pbVar14 != (byte *)0x8) {
                        uVar8 = *(undefined8 *)(pbVar7 + 8);
                        bVar39 = -(-0x41 < (char)((ulong)uVar8 >> 0x28));
                        bVar31 = bVar31 + (-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1U);
                        bVar32 = bVar32 + (-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1U);
                        auVar40._0_8_ =
                             auVar40._0_8_ +
                             ((ulong)((uint6)CONCAT14(bVar39,(uint)CONCAT12(bVar39,(ushort)(byte)-(
                                                  -0x41 < (char)((ulong)uVar8 >> 0x20)))) &
                                     0xffff0000ffff) & 0xffffff01);
                        auVar40._8_8_ = (ulong)auVar40[8] + ((ulong)bVar39 & 0xffffff01);
                        uVar28 = uVar28 + (-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                        uVar36 = uVar36 + (-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                        uVar37 = uVar37 + (-(-0x41 < (char)uVar8) & 1);
                        uVar38 = uVar38 + (-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
                        if (pbVar14 != (byte *)0x10) {
                          uVar8 = *(undefined8 *)(pbVar7 + 0x10);
                          bVar39 = -(-0x41 < (char)((ulong)uVar8 >> 0x28));
                          bVar31 = bVar31 + (-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1U);
                          bVar32 = bVar32 + (-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1U);
                          auVar40._0_8_ =
                               auVar40._0_8_ +
                               ((ulong)((uint6)CONCAT14(bVar39,(uint)CONCAT12(bVar39,(ushort)(byte)-
                                                  (-0x41 < (char)((ulong)uVar8 >> 0x20)))) &
                                       0xffff0000ffff) & 0xffffff01);
                          auVar40._8_8_ = auVar40._8_8_ + ((ulong)bVar39 & 0xffffff01);
                          uVar28 = uVar28 + (-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                          uVar36 = uVar36 + (-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                          uVar37 = uVar37 + (-(-0x41 < (char)uVar8) & 1);
                          uVar38 = uVar38 + (-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
                        }
                      }
                      uVar28 = uVar37 + auVar40._0_8_ + uVar28 + bVar31 +
                               uVar38 + auVar40._8_8_ + uVar36 + bVar32;
                      goto code_r0x00468ca4;
                    }
                    uVar28 = 0;
                    pbVar14 = (byte *)0x0;
                    do {
                      if (-0x41 < (char)pbVar7[(long)pbVar14]) {
                        uVar28 = uVar28 + 1;
                      }
                      pbVar14 = pbVar14 + 1;
code_r0x00468ca4:
                    } while (pbVar23 != pbVar14);
                  }
                }
                else {
                  uVar28 = func_0x0046bd58(pbVar7,pbVar23);
                }
              }
              else {
                uVar28 = (ulong)*(ushort *)(pbVar24 + 0x16);
                if (uVar28 == 0) {
                  pbVar23 = (byte *)0x0;
                  uVar36 = 0;
                }
                else {
                  pbVar14 = pbVar7 + (long)pbVar23;
                  pbVar23 = (byte *)0x0;
                  uVar36 = uVar28;
                  pbVar11 = pbVar7;
                  do {
                    if (pbVar11 == pbVar14) break;
                    bVar31 = *pbVar11;
                    pbVar15 = pbVar11 + 3;
                    if (0xef < bVar31) {
                      pbVar15 = pbVar11 + 4;
                    }
                    pbVar30 = pbVar11 + 2;
                    if (0xdf < bVar31) {
                      pbVar30 = pbVar15;
                    }
                    pbVar15 = pbVar11 + 1;
                    if (((int)(char)bVar31 & 0x80000000U) != 0) {
                      pbVar15 = pbVar30;
                    }
                    pbVar23 = pbVar15 + ((long)pbVar23 - (long)pbVar11);
                    uVar36 = uVar36 - 1;
                    pbVar11 = pbVar15;
                  } while (uVar36 != 0);
                }
                uVar28 = uVar28 - uVar36;
              }
              if (uVar28 < *(ushort *)(pbVar24 + 0x14)) {
                uVar5 = (uint)*(ushort *)(pbVar24 + 0x14) - (int)uVar28;
                uVar29 = uVar26 >> 0x1d & 3;
                uVar6 = uVar5 >> 1 & 0x7fff;
                if (uVar29 != 2) {
                  uVar6 = 0;
                }
                uVar3 = 0;
                if (uVar29 != 0) {
                  uVar3 = uVar5;
                }
                if (uVar29 < 2) {
                  uVar6 = uVar3;
                }
                uVar29 = 0;
                uVar8 = *(undefined8 *)pbVar24;
                lVar18 = *(long *)(pbVar24 + 8);
                do {
                  if ((uVar6 & 0xffff) <= (uVar29 & 0xffff)) {
                    uVar28 = (**(code **)(lVar18 + 0x18))(uVar8,pbVar7,pbVar23);
                    if ((uVar28 & 1) == 0) {
                      uVar29 = 0;
                      do {
                        if ((uVar5 - uVar6 & 0xffff) <= (uVar29 & 0xffff)) {
                          return (dword *)0x0;
                        }
                        uVar29 = uVar29 + 1;
                        uVar28 = (**(code **)(lVar18 + 0x20))(uVar8,uVar26 & 0x1fffff);
                      } while ((uVar28 & 1) == 0);
                      return (dword *)0x1;
                    }
                    break;
                  }
                  uVar29 = uVar29 + 1;
                  uVar28 = (**(code **)(lVar18 + 0x20))(uVar8,uVar26 & 0x1fffff);
                } while ((uVar28 & 1) == 0);
                return (dword *)((long)&MACH_HEADER.magic + 1);
              }
            }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            pdVar9 = (dword *)(**(code **)(*(long *)(pbVar24 + 8) + 0x18))
                                        (*(undefined8 *)pbVar24,pbVar7,pbVar23);
            return pdVar9;
          }
        }
      }
      uVar28 = (**(code **)(lVar18 + 0x18))
                         (uVar8,pbVar23 + (long)pbVar24,(long)pbVar14 - (long)pbVar24);
      if ((uVar28 & 1) == 0) {
        pdVar9 = (dword *)(*pcVar27)(uVar8,0x22);
        return pdVar9;
      }
    }
code_r0x0046ad50:
    return (dword *)((long)&MACH_HEADER.magic + 1);
  }
  if (uVar28 == 0) {
    puVar13 = (undefined *)0x0;
    pdVar9 = &MACH_HEADER.cpusubtype;
    if ((undefined *)0x1 < puVar10) goto LAB_00509468;
LAB_0050948c:
    pdVar17 = pdVar9;
    if (puVar10 == (undefined *)0x0) goto LAB_005094f8;
  }
  else {
    uVar8 = 8;
    pdVar9 = (dword *)func_0x00187bd0(uVar28,8);
    if (pdVar9 == (dword *)0x0)
    goto __ZN40__LT_str_u20_as_u20_core__fmt__Debug_GT_3fmt17ha0e805b04319c80fE;
    puVar13 = puVar10;
    if (puVar10 < (undefined *)0x2) goto LAB_0050948c;
LAB_00509468:
    if (puVar10 < (undefined *)0x9) {
      uVar28 = 1;
      pdVar17 = pdVar9;
    }
    else {
      puVar19 = (undefined *)((ulong)(puVar10 + -1) & 0xfffffffffffffff8);
      pdVar17 = pdVar9 + (long)puVar19 * 4;
      uVar28 = (ulong)puVar19 | 1;
      auVar33._8_8_ = 0;
      auVar33._0_8_ = auVar40._8_8_;
      auVar34[8] = auVar40[0];
      auVar34._0_8_ = auVar40._0_8_;
      auVar34[9] = auVar40[1];
      auVar34[10] = auVar40[2];
      auVar34[0xb] = auVar40[3];
      auVar34[0xc] = auVar40[4];
      auVar34[0xd] = auVar40[5];
      auVar34[0xe] = auVar40[6];
      auVar34[0xf] = auVar40[7];
      auVar34 = NEON_ext(auVar34,auVar33,8,1);
      pauVar20 = (undefined1 (*) [16])(pdVar9 + 0x10);
      puVar21 = puVar19;
      do {
        pauVar20[-4] = auVar40;
        uVar35 = auVar34._8_8_;
        *(undefined8 *)(pauVar20[-3] + 8) = uVar35;
        uVar8 = auVar34._0_8_;
        *(undefined8 *)pauVar20[-3] = uVar8;
        pauVar20[-2] = auVar40;
        *(undefined8 *)(pauVar20[-1] + 8) = uVar35;
        *(undefined8 *)pauVar20[-1] = uVar8;
        *pauVar20 = auVar40;
        *(undefined8 *)(pauVar20[1] + 8) = uVar35;
        *(undefined8 *)pauVar20[1] = uVar8;
        pauVar20[2] = auVar40;
        *(undefined8 *)(pauVar20[3] + 8) = uVar35;
        *(undefined8 *)pauVar20[3] = uVar8;
        pauVar20 = pauVar20 + 8;
        puVar21 = puVar21 + -8;
      } while (puVar21 != (undefined *)0x0);
      if (puVar10 + -1 == puVar19) goto LAB_005094f4;
    }
    lVar18 = (long)puVar10 - uVar28;
    pdVar16 = pdVar17;
    do {
      *(undefined1 (*) [16])pdVar16 = auVar40;
      lVar18 = lVar18 + -1;
      pdVar17 = pdVar16 + 4;
      pdVar16 = pdVar16 + 4;
    } while (lVar18 != 0);
  }
LAB_005094f4:
  *(undefined1 (*) [16])pdVar17 = auVar40;
LAB_005094f8:
  *extraout_x8 = puVar13;
  extraout_x8[1] = pdVar9;
  extraout_x8[2] = puVar10;
  return pdVar9;
}

