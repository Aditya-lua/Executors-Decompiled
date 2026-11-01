
void FUN_005115c8(void)

{
  char *pcVar1;
  byte *pbVar2;
  ulong uVar3;
  char cVar4;
  byte bVar5;
  uint uVar6;
  code *pcVar7;
  long lVar8;
  ulong *puVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  undefined *puVar13;
  long lVar14;
  long lVar15;
  uint uVar16;
  ulong uVar17;
  char *pcVar18;
  ulong uVar19;
  long *unaff_x20;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  undefined8 uVar23;
  ulong uVar24;
  undefined1 auVar25 [16];
  ulong uStack_110;
  ulong uStack_e8;
  ulong uStack_e0;
  ulong uStack_d8;
  ulong uStack_d0;
  ulong uStack_c8;
  ulong uStack_c0;
  ulong uStack_b8;
  ulong uStack_b0;
  ulong uStack_a8;
  ulong uStack_98;
  long lStack_88;
  ulong uStack_80;
  long lStack_78;
  ulong uStack_70;
  
  auVar25 = func_0x004af770();
  lVar15 = auVar25._8_8_;
  if (lVar15 < 0) {
    uVar23 = 0;
  }
  else {
    if (lVar15 == 0) {
      lVar8 = 1;
      _memcpy(1,auVar25._0_8_,0);
      lVar11 = *unaff_x20;
joined_r0x00511654:
      if (lVar11 != 0) {
        func_0x00187bd4();
      }
      *unaff_x20 = lVar15;
      unaff_x20[1] = lVar8;
      unaff_x20[2] = lVar15;
      return;
    }
    uVar23 = 1;
    lVar8 = func_0x00187bd0(lVar15,1);
    if (lVar8 != 0) {
      _memcpy(lVar8,auVar25._0_8_,lVar15);
      lVar11 = *unaff_x20;
      goto joined_r0x00511654;
    }
  }
  puVar9 = (ulong *)func_0x007a1f00(uVar23,lVar15,&UNK_009e95a8);
  uVar3 = puVar9[1];
  uVar22 = puVar9[2];
  uStack_e8 = 0;
  uStack_e0 = 1;
  uStack_d8 = 0;
  func_0x0046ce54(&uStack_d0,uVar3,uVar22,&UNK_008a6560,3);
  uStack_110 = uStack_c8;
  if (((uint)uStack_d0 & 1) != 0) {
    uStack_c0 = 0;
    uVar19 = 0;
    lVar8 = uStack_70 - 1;
    lVar15 = 0;
    if (uStack_c8 <= uStack_70) {
      lVar15 = uStack_70 - uStack_c8;
    }
    uVar12 = 1;
    uVar20 = uStack_a8;
    uVar21 = uStack_98;
joined_r0x00511750:
    uVar24 = uVar20 + lVar8;
    if (uVar21 == 0xffffffffffffffff) {
      if (uVar24 < uStack_80) {
code_r0x00511868:
        if ((uStack_b0 >> ((ulong)*(byte *)(lStack_88 + uVar24) & 0x3f) & 1) == 0) {
          uVar20 = uVar20 + uStack_70;
        }
        else {
          lVar14 = -uVar20;
          uVar21 = uStack_c8 + uVar20;
          lVar11 = lVar15;
          pcVar18 = (char *)(lStack_78 + uStack_c8);
          do {
            if (lVar11 == 0) {
              if (uStack_c8 - 1 < uStack_70) {
                uVar21 = uStack_c8;
                goto code_r0x005118c8;
              }
              if (uStack_c8 == 0) goto code_r0x00511904;
              uVar24 = uStack_c8 - 1;
              goto code_r0x00511e80;
            }
            if (uStack_80 <= uVar21) {
              uVar20 = uVar20 + uStack_c8;
              goto code_r0x00511e18;
            }
            cVar4 = *pcVar18;
            pcVar1 = (char *)(lStack_88 + uVar21);
            lVar14 = lVar14 + -1;
            uVar21 = uVar21 + 1;
            lVar11 = lVar11 + -1;
            pcVar18 = pcVar18 + 1;
          } while (cVar4 == *pcVar1);
          uVar20 = -lVar14;
        }
        goto LAB_00511858;
      }
    }
    else if (uVar24 < uStack_80) {
code_r0x0051177c:
      if ((uStack_b0 >> ((ulong)*(byte *)(lStack_88 + uVar24) & 0x3f) & 1) == 0) {
        uVar21 = 0;
        uVar10 = uVar20 + uStack_70;
      }
      else {
        uVar24 = uVar21;
        if (uVar21 <= uStack_c8) {
          uVar24 = uStack_c8;
        }
        uVar17 = uVar20 + uVar24;
        uVar10 = uVar17 - uStack_c8;
        lVar11 = 0;
        if (uVar24 <= uStack_70) {
          lVar11 = uStack_70 - uVar24;
        }
        pcVar18 = (char *)(lStack_78 + uVar24);
        do {
          if (lVar11 == 0) {
            uVar10 = uStack_c8;
            goto code_r0x005117e0;
          }
          if (uStack_80 <= uVar17) {
            uVar20 = uVar20 + uVar24;
code_r0x00511e18:
            uVar24 = uStack_80;
            if (uStack_80 <= uVar20) {
              uVar24 = uVar20;
            }
            puVar13 = &UNK_009e94b8;
            goto code_r0x00511e88;
          }
          cVar4 = *pcVar18;
          pcVar1 = (char *)(lStack_88 + uVar17);
          uVar10 = uVar10 + 1;
          uVar17 = uVar17 + 1;
          lVar11 = lVar11 + -1;
          pcVar18 = pcVar18 + 1;
        } while (cVar4 == *pcVar1);
        uVar21 = 0;
      }
      goto code_r0x00511768;
    }
code_r0x005119e8:
    uVar22 = uVar22 - uVar19;
    uStack_80 = uVar19;
    if (uStack_e8 - uStack_c0 < uVar22) goto code_r0x00511dec;
    goto code_r0x00511d84;
  }
  if (((uint)uStack_b8 >> 0x10 & 1) != 0) goto code_r0x00511a20;
  if (uStack_c8 == 0) {
code_r0x00511a14:
    uVar19 = uStack_c8;
    if (uStack_c8 == uStack_80) {
      if ((uStack_b8 & 1) == 0) {
code_r0x00511a20:
        uStack_c0 = 0;
        uStack_80 = 0;
        uVar19 = uStack_80;
        if (uStack_e8 < uVar22) {
code_r0x00511dec:
          func_0x007a5594(&uStack_e8,uStack_c0,uVar22,1,1);
          uStack_80 = uVar19;
          uStack_c0 = uStack_d8;
        }
code_r0x00511d84:
        _memcpy(uStack_e0 + uStack_c0,uVar3 + uStack_80,uVar22);
        uStack_c0 = uStack_c0 + uVar22;
        uStack_c8 = uStack_e0;
        uStack_d0 = uStack_e8;
        if (*puVar9 != 0) {
          func_0x00187bd4(uVar3,*puVar9,1);
        }
        puVar9[1] = uStack_c8;
        *puVar9 = uStack_d0;
        puVar9[2] = uStack_c0;
        return;
      }
    }
    else {
      pbVar2 = (byte *)(lStack_88 + uStack_c8);
      uVar6 = (uint)*pbVar2;
      if ((char)*pbVar2 < '\0') {
        if (uVar6 < 0xe0) {
          uVar6 = pbVar2[1] & 0x3f | (uVar6 & 0x1f) << 6;
        }
        else {
          uVar16 = pbVar2[2] & 0x3f | (pbVar2[1] & 0x3f) << 6;
          if (uVar6 < 0xf0) {
            uVar6 = uVar16 | (uVar6 & 0x1f) << 0xc;
          }
          else {
            uVar6 = pbVar2[3] & 0x3f | uVar16 << 6 | (uVar6 & 7) << 0x12;
          }
        }
      }
      if ((uStack_b8 & 1) == 0) {
        if (uVar6 < 0x80) {
          lVar15 = 1;
        }
        else if (uVar6 < 0x800) {
          lVar15 = 2;
        }
        else {
          lVar15 = 3;
          if (0xffff < uVar6) {
            lVar15 = 4;
          }
        }
        uStack_c8 = lVar15 + uStack_c8;
        if (uStack_c8 != 0) {
          if (uStack_c8 < uStack_80) {
            if (-0x41 < *(char *)(lStack_88 + uStack_c8)) goto LAB_00511af8;
          }
          else if (uStack_c8 == uStack_80) goto LAB_00511af8;
LAB_00511e58:
          uStack_110 = uStack_c8;
          goto code_r0x00511e5c;
        }
LAB_00511af8:
        uVar19 = uStack_80;
        if (uStack_c8 != uStack_80) {
          uVar19 = uStack_c8;
        }
      }
    }
    if (uVar19 == 0) {
      uVar20 = 0;
      uVar12 = 1;
      uVar21 = 0;
    }
    else {
      func_0x007a5594(&uStack_e8,0,uVar19,1,1);
      uVar20 = uStack_d8;
      uVar12 = uStack_e0;
      uVar21 = uStack_e8;
    }
    _memcpy(uVar12 + uVar20,uVar3,uVar19);
    uStack_d8 = uVar20 + uVar19;
    if (uVar21 == uStack_d8) {
      func_0x007a5594(&uStack_e8,uVar21,1,1,1);
      *(undefined1 *)(uStack_e0 + uStack_d8) = 10;
    }
    else {
      *(undefined1 *)(uVar12 + uStack_d8) = 10;
    }
    uStack_d8 = uStack_d8 + 1;
    uStack_110 = uVar19;
    if (uVar19 != 0) goto LAB_00511d44;
LAB_00511d60:
    do {
      do {
        if (uVar19 == uStack_80) {
          uVar22 = uVar22 - uStack_80;
          uVar19 = uStack_80;
          uStack_c0 = uStack_d8;
          if (uVar22 <= uStack_e8 - uStack_d8) goto code_r0x00511d84;
          goto code_r0x00511dec;
        }
        pbVar2 = (byte *)(lStack_88 + uVar19);
        bVar5 = *pbVar2;
        if ((char)bVar5 < '\0') {
          if (bVar5 < 0xe0) {
            uVar6 = pbVar2[1] & 0x3f | (bVar5 & 0x1f) << 6;
          }
          else {
            uVar16 = (uint)bVar5;
            uVar6 = pbVar2[2] & 0x3f | (pbVar2[1] & 0x3f) << 6;
            if (uVar16 < 0xf0) {
              uVar6 = uVar6 | (uVar16 & 0x1f) << 0xc;
            }
            else {
              uVar6 = pbVar2[3] & 0x3f | uVar6 << 6 | (uVar16 & 7) << 0x12;
            }
          }
          if (uVar6 < 0x80) goto LAB_00511bd4;
          if (uVar6 < 0x800) {
            uStack_c8 = uVar19 + 2;
          }
          else {
            lVar15 = 3;
            if (0xffff < uVar6) {
              lVar15 = 4;
            }
            uStack_c8 = lVar15 + uVar19;
          }
        }
        else {
LAB_00511bd4:
          uStack_c8 = uVar19 + 1;
        }
        if (uStack_c8 != 0) {
          if (uStack_c8 < uStack_80) {
            if (*(char *)(lStack_88 + uStack_c8) < -0x40) goto LAB_00511e58;
          }
          else if (uStack_c8 != uStack_80) goto LAB_00511e58;
        }
        uStack_110 = uStack_80;
        if (uStack_c8 != uStack_80) {
          uStack_110 = uStack_c8;
        }
        uVar20 = uStack_110 - uVar19;
        if (uStack_e8 - uStack_d8 < uVar20) {
          func_0x007a5594(&uStack_e8,uStack_d8,uVar20,1,1);
        }
        uVar24 = uStack_d8;
        uVar21 = uStack_e0;
        uVar12 = uStack_e8;
        _memcpy(uStack_e0 + uStack_d8,uVar3 + uVar19,uVar20);
        uStack_d8 = uVar24 + uVar20;
        if (uVar12 == uStack_d8) {
          func_0x007a5594(&uStack_e8,uVar12,1,1,1);
          *(undefined1 *)(uStack_e0 + uStack_d8) = 10;
        }
        else {
          *(undefined1 *)(uVar21 + uStack_d8) = 10;
        }
        uStack_d8 = uStack_d8 + 1;
        uVar19 = uStack_110;
      } while (uStack_110 == 0);
LAB_00511d44:
      uVar19 = uStack_110;
      if (uStack_110 < uStack_80) {
        if (*(char *)(lStack_88 + uStack_110) < -0x40) break;
        goto LAB_00511d60;
      }
    } while (uStack_110 == uStack_80);
  }
  else if (uStack_c8 < uStack_80) {
    if (-0x41 < *(char *)(lStack_88 + uStack_c8)) goto code_r0x00511a14;
  }
  else if (uStack_c8 == uStack_80) goto code_r0x00511a14;
code_r0x00511e5c:
  func_0x007a297c(lStack_88,uStack_80,uStack_110,uStack_80,&UNK_009e9578);
code_r0x00511e90:
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x511e94);
  (*pcVar7)();
  while( true ) {
    uVar24 = (uVar20 + uVar21) - 1;
    if (uStack_80 <= uVar24) {
      puVar13 = &UNK_009e94a0;
      goto code_r0x00511e88;
    }
    pcVar18 = (char *)(lStack_78 + -1 + uVar21);
    lVar11 = lStack_88 + uVar20 + uVar21;
    uVar21 = uVar21 - 1;
    if (*pcVar18 != *(char *)(lVar11 + -1)) break;
code_r0x005118c8:
    if (uVar21 == 0) goto code_r0x00511904;
  }
  uVar20 = uVar20 + uStack_b8;
LAB_00511858:
  uVar24 = uVar20 + lVar8;
  if (uStack_80 <= uVar24) goto code_r0x005119e8;
  goto code_r0x00511868;
code_r0x00511904:
  uVar21 = 0xffffffffffffffff;
  uVar24 = uVar20 - uVar19;
  if (uStack_e8 - uStack_c0 < uVar24) {
code_r0x00511984:
    func_0x007a5594(&uStack_e8,uStack_c0,uVar24,1,1);
    uVar12 = uStack_e0;
    uStack_c0 = uStack_d8;
  }
code_r0x00511920:
  uVar10 = uStack_e8;
  _memcpy(uVar12 + uStack_c0,uVar3 + uVar19,uVar24);
  uStack_d8 = uStack_c0 + uVar24;
  if (uVar10 == uStack_d8) {
    func_0x007a5594(&uStack_e8,uVar10,1,1,1);
    uVar12 = uStack_e0;
  }
  uVar19 = uVar20 + uStack_70;
  *(undefined1 *)(uVar12 + uStack_d8) = 10;
  uStack_c0 = uStack_d8 + 1;
  uStack_d8 = uStack_c0;
  uVar20 = uVar19;
  goto joined_r0x00511750;
  while (*(char *)(lStack_78 + uVar10) == *(char *)(lStack_88 + uVar24)) {
code_r0x005117e0:
    if (uVar10 <= uVar21) {
      uVar21 = 0;
      uVar24 = uVar20 - uVar19;
      if (uStack_e8 - uStack_c0 < uVar24) goto code_r0x00511984;
      goto code_r0x00511920;
    }
    uVar10 = uVar10 - 1;
    uVar24 = uVar10;
    if (uStack_70 <= uVar10) goto code_r0x00511e80;
    uVar24 = uVar10 + uVar20;
    if (uStack_80 <= uVar24) {
      puVar13 = &UNK_009e94a0;
      goto code_r0x00511e88;
    }
  }
  uVar10 = uVar20 + uStack_b8;
  uVar21 = uStack_70 - uStack_b8;
code_r0x00511768:
  uVar24 = uVar10 + lVar8;
  uVar20 = uVar10;
  if (uStack_80 <= uVar24) goto code_r0x005119e8;
  goto code_r0x0051177c;
code_r0x00511e80:
  puVar13 = &UNK_009e9488;
  uStack_80 = uStack_70;
code_r0x00511e88:
  func_0x007a2570(uVar24,uStack_80,puVar13);
  goto code_r0x00511e90;
}

