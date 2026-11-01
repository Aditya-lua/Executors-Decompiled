
dword * FUN_00509268(ulong *param_1,dword *param_2,ulong param_3,ulong param_4,undefined8 param_5)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  long lVar4;
  uint uVar5;
  uint uVar6;
  undefined1 auVar7 [16];
  bool bVar8;
  byte *pbVar9;
  ulong uVar10;
  dword *pdVar11;
  undefined *puVar12;
  byte *pbVar13;
  long lVar14;
  undefined8 *extraout_x8;
  undefined *puVar15;
  byte *pbVar16;
  byte *pbVar17;
  dword *pdVar18;
  dword *pdVar19;
  long lVar20;
  undefined *puVar21;
  undefined1 (*pauVar22) [16];
  undefined *puVar23;
  byte *pbVar24;
  byte *pbVar25;
  ulong unaff_x20;
  byte *pbVar26;
  code *pcVar27;
  uint uVar28;
  code *pcVar29;
  undefined8 uVar30;
  uint uVar31;
  byte *pbVar32;
  byte bVar33;
  byte bVar34;
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined8 uVar38;
  ulong uVar39;
  ulong uVar40;
  ulong uVar41;
  byte bVar42;
  undefined1 auVar43 [16];
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  char acStack_bc [4];
  undefined4 uStack_b8;
  byte bStack_b2;
  byte bStack_b1;
  
  if (param_4 == 0) {
    *param_1 = 0;
    param_1[1] = 1;
    param_1[2] = 0;
    return param_2;
  }
  auVar43._8_8_ = 0;
  auVar43._0_8_ = param_3;
  auVar37._8_8_ = 0;
  auVar37._0_8_ = param_4;
  if (SUB168(auVar43 * auVar37,8) == 0) {
    unaff_x20 = param_3 * param_4;
    if ((long)unaff_x20 < 0) goto LAB_005093b8;
    if (unaff_x20 == 0) {
      in_stack_00000010 = 1;
      if (param_3 != 0) {
LAB_00509380:
        in_stack_00000018 = 0;
        uStack0000000000000008 = unaff_x20;
        func_0x007a5594(&uStack0000000000000008,0,param_3,1,1);
        goto LAB_005092d0;
      }
LAB_005092cc:
      in_stack_00000018 = 0;
      uStack0000000000000008 = unaff_x20;
LAB_005092d0:
      lVar20 = in_stack_00000018;
      uVar10 = in_stack_00000010;
      pdVar11 = (dword *)_memcpy(in_stack_00000010 + in_stack_00000018,param_2,param_3);
      param_3 = lVar20 + param_3;
      in_stack_00000018 = param_3;
      if (param_4 != 1) {
        do {
          pdVar11 = (dword *)_memcpy(uVar10 + param_3,uVar10,param_3);
          param_3 = param_3 << 1;
          bVar8 = 3 < param_4;
          param_4 = param_4 >> 1;
        } while (bVar8);
        in_stack_00000018 = param_3;
      }
      if (unaff_x20 - in_stack_00000018 != 0) {
        pdVar11 = (dword *)_memcpy(uVar10 + in_stack_00000018,uVar10,unaff_x20 - in_stack_00000018);
        in_stack_00000018 = unaff_x20;
      }
      param_1[1] = in_stack_00000010;
      *param_1 = uStack0000000000000008;
      param_1[2] = in_stack_00000018;
      return pdVar11;
    }
    uVar30 = 1;
    uVar10 = func_0x00187bd0(unaff_x20,1);
    if (uVar10 != 0) {
      in_stack_00000010 = uVar10;
      if (unaff_x20 < param_3) goto LAB_00509380;
      goto LAB_005092cc;
    }
  }
  else {
    func_0x007a23d8(&UNK_008a4abd,0x11,&UNK_009e8d90);
LAB_005093b8:
    uVar30 = 0;
  }
  puVar12 = &UNK_009e8d60;
  uVar30 = func_0x007a1f00(uVar30,unaff_x20);
  if (uStack0000000000000008 != 0) {
    puVar12 = (undefined *)0x1;
    func_0x00187bd4(in_stack_00000010);
  }
  auVar43 = __Unwind_Resume(uVar30);
  uVar30 = 0;
  uVar10 = (long)puVar12 * 0x10;
  if (((ulong)puVar12 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar10)) {
__ZN40__LT_str_u20_as_u20_core__fmt__Debug_GT_3fmt17ha0e805b04319c80fE:
    auVar43 = func_0x007a1f00(uVar30,uVar10,param_5);
    pbVar25 = *(byte **)(auVar43._0_8_ + 8);
    pbVar9 = *(byte **)(auVar43._0_8_ + 0x10);
    uVar30 = *auVar43._8_8_;
    lVar20 = auVar43._8_8_[1];
    pcVar29 = *(code **)(lVar20 + 0x20);
    uVar10 = (*pcVar29)(uVar30,0x22);
    if ((uVar10 & 1) == 0) {
      if (pbVar9 == (byte *)0x0) {
        pbVar16 = (byte *)0x0;
        pbVar26 = (byte *)0x0;
      }
      else {
        pbVar26 = (byte *)0x0;
        pbVar13 = pbVar25;
        pbVar17 = pbVar9;
        pbVar32 = (byte *)0x0;
        do {
          while( true ) {
            pbVar24 = (byte *)0x0;
            pbVar1 = pbVar13 + (long)pbVar17;
            while( true ) {
              bVar33 = pbVar13[(long)pbVar24];
              if (((bVar33 - 0x7f < 0xffffffa1) || (bVar33 == 0x22)) || (bVar33 == 0x5c)) break;
              pbVar24 = pbVar24 + 1;
              if (pbVar17 == pbVar24) {
                pbVar16 = pbVar17 + (long)pbVar32;
                goto code_r0x0046accc;
              }
            }
            pbVar16 = pbVar32 + (long)pbVar24;
            pbVar17 = pbVar13 + (long)pbVar24;
            uVar28 = (uint)*pbVar17;
            if ((char)*pbVar17 < '\0') break;
            pbVar13 = pbVar17 + 1;
code_r0x0046ab60:
            func_0x004623d8(acStack_bc,uVar28,&UNK_00010001);
            if ((acStack_bc[0] != -0x80) && ((byte)(bStack_b1 - bStack_b2) != '\x01')) {
              if (pbVar16 < pbVar26) goto code_r0x0046ad84;
              if (pbVar26 != (byte *)0x0) {
                if (pbVar26 < pbVar9) {
                  if (-0x41 < (char)pbVar25[(long)pbVar26]) goto code_r0x0046abc0;
                }
                else if (pbVar26 == pbVar9) goto code_r0x0046abc0;
                goto code_r0x0046ad84;
              }
code_r0x0046abc0:
              if (pbVar16 != (byte *)0x0) {
                if (pbVar16 < pbVar9) {
                  if ((char)(pbVar25 + (long)pbVar32)[(long)pbVar24] < -0x40) goto code_r0x0046ad84;
                }
                else if (pbVar16 != pbVar9) {
code_r0x0046ad84:
                  func_0x007a297c(pbVar25,pbVar9,pbVar26,pbVar32 + (long)pbVar24,&UNK_009e06f8);
                  goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
                }
              }
              pcVar27 = *(code **)(lVar20 + 0x18);
              uVar10 = (*pcVar27)(uVar30,pbVar25 + (long)pbVar26,
                                  pbVar24 + ((long)pbVar32 - (long)pbVar26));
              if ((uVar10 & 1) != 0) goto code_r0x0046ad50;
              if (acStack_bc[0] == -0x80) {
                uVar10 = (*pcVar29)(uVar30,uStack_b8);
              }
              else {
                uVar10 = (*pcVar27)(uVar30,acStack_bc + bStack_b2,
                                    (ulong)bStack_b1 - (ulong)bStack_b2);
              }
              if ((uVar10 & 1) != 0) goto code_r0x0046ad50;
              if (uVar28 < 0x80) {
                lVar14 = 1;
              }
              else if (uVar28 < 0x800) {
                lVar14 = 2;
              }
              else {
                lVar14 = 3;
                if (0xffff < uVar28) {
                  lVar14 = 4;
                }
              }
              pbVar26 = pbVar32 + (long)pbVar24 + lVar14;
            }
            lVar14 = 3;
            if (0xffff < uVar28) {
              lVar14 = 4;
            }
            lVar4 = 2;
            if (0x7ff < uVar28) {
              lVar4 = lVar14;
            }
            lVar14 = 1;
            if (0x7f < uVar28) {
              lVar14 = lVar4;
            }
            pbVar16 = pbVar32 + (long)pbVar24 + lVar14;
            pbVar17 = pbVar1 + -(long)pbVar13;
            pbVar32 = pbVar16;
            if (pbVar17 == (byte *)0x0) goto code_r0x0046accc;
          }
          uVar6 = pbVar17[1] & 0x3f;
          if (uVar28 < 0xe0) {
            uVar28 = uVar6 | (uVar28 & 0x1f) << 6;
            pbVar13 = pbVar17 + 2;
            goto code_r0x0046ab60;
          }
          pbVar2 = pbVar13 + (long)pbVar24;
          uVar6 = pbVar17[2] & 0x3f | uVar6 << 6;
          if (uVar28 < 0xf0) {
            uVar28 = uVar6 | (uVar28 & 0x1f) << 0xc;
            pbVar13 = pbVar2 + 3;
            goto code_r0x0046ab60;
          }
          pbVar13 = pbVar2 + 4;
          uVar28 = pbVar2[3] & 0x3f | uVar6 << 6 | (uVar28 & 7) << 0x12;
          if (uVar28 != 0x110000) goto code_r0x0046ab60;
          pbVar17 = pbVar1 + -(long)pbVar13;
          pbVar32 = pbVar16;
        } while (pbVar17 != (byte *)0x0);
code_r0x0046accc:
        if (pbVar16 < pbVar26) goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
        if (pbVar26 != (byte *)0x0) {
          if (pbVar26 < pbVar9) {
            if ((char)pbVar25[(long)pbVar26] < -0x40)
            goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
          }
          else if (pbVar26 != pbVar9) goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
        }
        if (pbVar16 != (byte *)0x0) {
          if (pbVar16 < pbVar9) {
            if ((char)pbVar25[(long)pbVar16] < -0x40)
            goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
          }
          else if (pbVar16 != pbVar9) {
__ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E:
            auVar43 = func_0x007a297c(pbVar25,pbVar9,pbVar26,pbVar16,&UNK_009e0710);
            pbVar25 = auVar43._8_8_;
            pbVar9 = auVar43._0_8_;
            uVar28 = *(uint *)(pbVar26 + 0x10);
            if ((uVar28 & 0x18000000) != 0) {
              if ((uVar28 >> 0x1c & 1) == 0) {
                if (pbVar25 < (byte *)0x20) {
                  if (pbVar25 == (byte *)0x0) {
                    uVar10 = 0;
                  }
                  else {
                    if ((byte *)0x7 < pbVar25) {
                      pbVar16 = (byte *)((ulong)pbVar25 & 0x18);
                      uVar30 = *(undefined8 *)pbVar9;
                      bVar33 = -(-0x41 < (char)((ulong)uVar30 >> 0x30)) & 1;
                      bVar34 = -(-0x41 < (char)((ulong)uVar30 >> 0x38)) & 1;
                      auVar35._0_8_ = CONCAT71(0,-(-0x41 < (char)((ulong)uVar30 >> 0x20)) & 1);
                      auVar35[8] = -(-0x41 < (char)((ulong)uVar30 >> 0x28)) & 1;
                      auVar35._9_7_ = 0;
                      uVar10 = (ulong)(-(-0x41 < (char)((ulong)uVar30 >> 0x10)) & 1);
                      uVar39 = (ulong)(-(-0x41 < (char)((ulong)uVar30 >> 0x18)) & 1);
                      uVar40 = (ulong)(-(-0x41 < (char)uVar30) & 1);
                      uVar41 = (ulong)(-(-0x41 < (char)((ulong)uVar30 >> 8)) & 1);
                      if (pbVar16 != (byte *)0x8) {
                        uVar30 = *(undefined8 *)(pbVar9 + 8);
                        bVar42 = -(-0x41 < (char)((ulong)uVar30 >> 0x28));
                        bVar33 = bVar33 + (-(-0x41 < (char)((ulong)uVar30 >> 0x30)) & 1U);
                        bVar34 = bVar34 + (-(-0x41 < (char)((ulong)uVar30 >> 0x38)) & 1U);
                        auVar35._0_8_ =
                             auVar35._0_8_ +
                             ((ulong)((uint6)CONCAT14(bVar42,(uint)CONCAT12(bVar42,(ushort)(byte)-(
                                                  -0x41 < (char)((ulong)uVar30 >> 0x20)))) &
                                     0xffff0000ffff) & 0xffffff01);
                        auVar35._8_8_ = (ulong)auVar35[8] + ((ulong)bVar42 & 0xffffff01);
                        uVar10 = uVar10 + (-(-0x41 < (char)((ulong)uVar30 >> 0x10)) & 1);
                        uVar39 = uVar39 + (-(-0x41 < (char)((ulong)uVar30 >> 0x18)) & 1);
                        uVar40 = uVar40 + (-(-0x41 < (char)uVar30) & 1);
                        uVar41 = uVar41 + (-(-0x41 < (char)((ulong)uVar30 >> 8)) & 1);
                        if (pbVar16 != (byte *)0x10) {
                          uVar30 = *(undefined8 *)(pbVar9 + 0x10);
                          bVar42 = -(-0x41 < (char)((ulong)uVar30 >> 0x28));
                          bVar33 = bVar33 + (-(-0x41 < (char)((ulong)uVar30 >> 0x30)) & 1U);
                          bVar34 = bVar34 + (-(-0x41 < (char)((ulong)uVar30 >> 0x38)) & 1U);
                          auVar35._0_8_ =
                               auVar35._0_8_ +
                               ((ulong)((uint6)CONCAT14(bVar42,(uint)CONCAT12(bVar42,(ushort)(byte)-
                                                  (-0x41 < (char)((ulong)uVar30 >> 0x20)))) &
                                       0xffff0000ffff) & 0xffffff01);
                          auVar35._8_8_ = auVar35._8_8_ + ((ulong)bVar42 & 0xffffff01);
                          uVar10 = uVar10 + (-(-0x41 < (char)((ulong)uVar30 >> 0x10)) & 1);
                          uVar39 = uVar39 + (-(-0x41 < (char)((ulong)uVar30 >> 0x18)) & 1);
                          uVar40 = uVar40 + (-(-0x41 < (char)uVar30) & 1);
                          uVar41 = uVar41 + (-(-0x41 < (char)((ulong)uVar30 >> 8)) & 1);
                        }
                      }
                      uVar10 = uVar40 + auVar35._0_8_ + uVar10 + bVar33 +
                               uVar41 + auVar35._8_8_ + uVar39 + bVar34;
                      goto code_r0x00468ca4;
                    }
                    uVar10 = 0;
                    pbVar16 = (byte *)0x0;
                    do {
                      if (-0x41 < (char)pbVar9[(long)pbVar16]) {
                        uVar10 = uVar10 + 1;
                      }
                      pbVar16 = pbVar16 + 1;
code_r0x00468ca4:
                    } while (pbVar25 != pbVar16);
                  }
                }
                else {
                  uVar10 = func_0x0046bd58(pbVar9,pbVar25);
                }
              }
              else {
                uVar10 = (ulong)*(ushort *)(pbVar26 + 0x16);
                if (uVar10 == 0) {
                  pbVar25 = (byte *)0x0;
                  uVar39 = 0;
                }
                else {
                  pbVar16 = pbVar9 + (long)pbVar25;
                  pbVar25 = (byte *)0x0;
                  uVar39 = uVar10;
                  pbVar13 = pbVar9;
                  do {
                    if (pbVar13 == pbVar16) break;
                    bVar33 = *pbVar13;
                    pbVar17 = pbVar13 + 3;
                    if (0xef < bVar33) {
                      pbVar17 = pbVar13 + 4;
                    }
                    pbVar32 = pbVar13 + 2;
                    if (0xdf < bVar33) {
                      pbVar32 = pbVar17;
                    }
                    pbVar17 = pbVar13 + 1;
                    if (((int)(char)bVar33 & 0x80000000U) != 0) {
                      pbVar17 = pbVar32;
                    }
                    pbVar25 = pbVar17 + ((long)pbVar25 - (long)pbVar13);
                    uVar39 = uVar39 - 1;
                    pbVar13 = pbVar17;
                  } while (uVar39 != 0);
                }
                uVar10 = uVar10 - uVar39;
              }
              if (uVar10 < *(ushort *)(pbVar26 + 0x14)) {
                uVar5 = (uint)*(ushort *)(pbVar26 + 0x14) - (int)uVar10;
                uVar31 = uVar28 >> 0x1d & 3;
                uVar6 = uVar5 >> 1 & 0x7fff;
                if (uVar31 != 2) {
                  uVar6 = 0;
                }
                uVar3 = 0;
                if (uVar31 != 0) {
                  uVar3 = uVar5;
                }
                if (uVar31 < 2) {
                  uVar6 = uVar3;
                }
                uVar31 = 0;
                uVar30 = *(undefined8 *)pbVar26;
                lVar20 = *(long *)(pbVar26 + 8);
                do {
                  if ((uVar6 & 0xffff) <= (uVar31 & 0xffff)) {
                    uVar10 = (**(code **)(lVar20 + 0x18))(uVar30,pbVar9,pbVar25);
                    if ((uVar10 & 1) == 0) {
                      uVar31 = 0;
                      do {
                        if ((uVar5 - uVar6 & 0xffff) <= (uVar31 & 0xffff)) {
                          return (dword *)0x0;
                        }
                        uVar31 = uVar31 + 1;
                        uVar10 = (**(code **)(lVar20 + 0x20))(uVar30,uVar28 & 0x1fffff);
                      } while ((uVar10 & 1) == 0);
                      return (dword *)0x1;
                    }
                    break;
                  }
                  uVar31 = uVar31 + 1;
                  uVar10 = (**(code **)(lVar20 + 0x20))(uVar30,uVar28 & 0x1fffff);
                } while ((uVar10 & 1) == 0);
                return (dword *)((long)&MACH_HEADER.magic + 1);
              }
            }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            pdVar11 = (dword *)(**(code **)(*(long *)(pbVar26 + 8) + 0x18))
                                         (*(undefined8 *)pbVar26,pbVar9,pbVar25);
            return pdVar11;
          }
        }
      }
      uVar10 = (**(code **)(lVar20 + 0x18))
                         (uVar30,pbVar25 + (long)pbVar26,(long)pbVar16 - (long)pbVar26);
      if ((uVar10 & 1) == 0) {
        pdVar11 = (dword *)(*pcVar29)(uVar30,0x22);
        return pdVar11;
      }
    }
code_r0x0046ad50:
    return (dword *)((long)&MACH_HEADER.magic + 1);
  }
  if (uVar10 == 0) {
    puVar15 = (undefined *)0x0;
    pdVar11 = &MACH_HEADER.cpusubtype;
    if ((undefined *)0x1 < puVar12) goto LAB_00509468;
LAB_0050948c:
    pdVar19 = pdVar11;
    if (puVar12 == (undefined *)0x0) goto LAB_005094f8;
  }
  else {
    uVar30 = 8;
    pdVar11 = (dword *)func_0x00187bd0(uVar10,8);
    if (pdVar11 == (dword *)0x0)
    goto __ZN40__LT_str_u20_as_u20_core__fmt__Debug_GT_3fmt17ha0e805b04319c80fE;
    puVar15 = puVar12;
    if (puVar12 < (undefined *)0x2) goto LAB_0050948c;
LAB_00509468:
    if (puVar12 < (undefined *)0x9) {
      uVar10 = 1;
      pdVar19 = pdVar11;
    }
    else {
      puVar21 = (undefined *)((ulong)(puVar12 + -1) & 0xfffffffffffffff8);
      pdVar19 = pdVar11 + (long)puVar21 * 4;
      uVar10 = (ulong)puVar21 | 1;
      auVar36._8_8_ = 0;
      auVar36._0_8_ = auVar43._8_8_;
      auVar7[8] = auVar43[0];
      auVar7._0_8_ = auVar43._0_8_;
      auVar7[9] = auVar43[1];
      auVar7[10] = auVar43[2];
      auVar7[0xb] = auVar43[3];
      auVar7[0xc] = auVar43[4];
      auVar7[0xd] = auVar43[5];
      auVar7[0xe] = auVar43[6];
      auVar7[0xf] = auVar43[7];
      auVar37 = NEON_ext(auVar7,auVar36,8,1);
      pauVar22 = (undefined1 (*) [16])(pdVar11 + 0x10);
      puVar23 = puVar21;
      do {
        pauVar22[-4] = auVar43;
        uVar38 = auVar37._8_8_;
        *(undefined8 *)(pauVar22[-3] + 8) = uVar38;
        uVar30 = auVar37._0_8_;
        *(undefined8 *)pauVar22[-3] = uVar30;
        pauVar22[-2] = auVar43;
        *(undefined8 *)(pauVar22[-1] + 8) = uVar38;
        *(undefined8 *)pauVar22[-1] = uVar30;
        *pauVar22 = auVar43;
        *(undefined8 *)(pauVar22[1] + 8) = uVar38;
        *(undefined8 *)pauVar22[1] = uVar30;
        pauVar22[2] = auVar43;
        *(undefined8 *)(pauVar22[3] + 8) = uVar38;
        *(undefined8 *)pauVar22[3] = uVar30;
        pauVar22 = pauVar22 + 8;
        puVar23 = puVar23 + -8;
      } while (puVar23 != (undefined *)0x0);
      if (puVar12 + -1 == puVar21) goto LAB_005094f4;
    }
    lVar20 = (long)puVar12 - uVar10;
    pdVar18 = pdVar19;
    do {
      *(undefined1 (*) [16])pdVar18 = auVar43;
      lVar20 = lVar20 + -1;
      pdVar19 = pdVar18 + 4;
      pdVar18 = pdVar18 + 4;
    } while (lVar20 != 0);
  }
LAB_005094f4:
  *(undefined1 (*) [16])pdVar19 = auVar43;
LAB_005094f8:
  *extraout_x8 = puVar15;
  extraout_x8[1] = pdVar11;
  extraout_x8[2] = puVar12;
  return pdVar11;
}

