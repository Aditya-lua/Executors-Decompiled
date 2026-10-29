/* 7ff70c845e60 FUN_7ff70c845e60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

bool FUN_7ff70c845e60(uint param_1,uint param_2,int param_3)

{
  byte bVar1;
  int iVar2;
  code *pcVar3;
  longlong lVar4;
  undefined1 uVar5;
  uint uVar6;
  int iVar7;
  undefined8 uVar8;
  int *piVar9;
  longlong lVar10;
  longlong lVar11;
  short sVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  longlong lVar16;
  short *psVar17;
  int iVar18;
  longlong lVar19;
  longlong lVar20;
  undefined *puVar21;
  short *psVar22;
  uint uVar23;
  bool bVar24;
  undefined1 auStack_98 [32];
  undefined *puStack_78;
  undefined *puStack_70;
  undefined *puStack_68;
  undefined *puStack_60;
  int iStack_4c;
  ulonglong uStack_48;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_98;
  uVar13 = param_2 | 0xd000;
  if ((param_2 & 0x3c00) != 0) {
    uVar13 = param_2;
  }
  uVar14 = param_1 & 0xffff0fff;
  if (uVar14 - 0x20f < 8) {
    uVar23 = 0x1000;
    if ((uVar14 != 0x20f) && (uVar14 != 0x213)) {
      uVar14 = (param_1 & 0xffff0ffb) - 0x210;
      uVar23 = 0;
      if (uVar14 < 3) {
        uVar23 = *(uint *)(&UNK_7ff70cb1d3f4 + (ulonglong)uVar14 * 4);
      }
    }
    param_1 = param_1 | uVar23;
    if (*(uint *)(_DAT_7ff70cc1a3c0 + 0x1dd8) == param_1) {
LAB_7ff70c845f01:
      pcVar3 = (code *)swi(3);
      uVar5 = (*pcVar3)();
      return (bool)uVar5;
    }
  }
  else if (*(uint *)(_DAT_7ff70cc1a3c0 + 0x1dd8) == param_1) goto LAB_7ff70c845f01;
  if (((uVar13 & 0x10000) != 0) && (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) == 0))
  goto LAB_7ff70c8464d6;
  if ((uVar13 & 0x2000) != 0) {
    bVar24 = true;
    if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 2) == 0) goto LAB_7ff70c8464d8;
    uVar14 = param_1 & 0xffff0fff;
    uVar23 = param_1 & 0xffff0fff;
    if (uVar23 - 0x20f < 8) {
      uVar6 = 0xffffefff;
      if ((uVar23 != 0x20f) && (uVar23 != 0x213)) {
        uVar15 = (param_1 & 0xffff0ffb) - 0x210;
        uVar6 = 0xffffffff;
        if (uVar15 < 3) {
          uVar6 = *(uint *)(&UNK_7ff70cb1d3e8 + (ulonglong)uVar15 * 4);
        }
      }
      param_1 = param_1 & uVar6;
LAB_7ff70c846041:
      puStack_60 = *(undefined **)(&UNK_7ff70cb1b940 + (ulonglong)uVar23 * 8);
    }
    else if (param_1 == 0 || (param_1 & 0xffff0fff) != 0) {
      if ((param_1 & 0xffff0fff) == 0) {
        puStack_60 = &UNK_7ff70cb86ac2;
      }
      else {
        if (uVar23 - 0x200 < 0x9b) goto LAB_7ff70c846041;
        puStack_60 = &UNK_7ff70cb84132;
      }
    }
    else {
      puStack_60 = &UNK_7ff70cb923a7;
    }
    puStack_68 = &UNK_7ff70cb8e054;
    if (-1 < (short)param_1) {
      puStack_68 = &UNK_7ff70cb923a7;
    }
    puStack_70 = &UNK_7ff70cb8e034;
    if ((param_1 & 0x4000) == 0) {
      puStack_70 = &UNK_7ff70cb923a7;
    }
    puStack_78 = &UNK_7ff70cb8e039;
    if ((param_1 & 0x2000) == 0) {
      puStack_78 = &UNK_7ff70cb923a7;
    }
    puVar21 = &UNK_7ff70cb8e05b;
    if ((param_1 & 0x1000) == 0) {
      puVar21 = &UNK_7ff70cb923a7;
    }
    lVar19 = _DAT_7ff70cc1a3c0 + 0x29c0;
    FUN_7ff70c802a20(lVar19,0x40,&UNK_7ff70cb823fb,puVar21);
    if (((uVar14 == 0) && (param_1 != 0)) && (lVar10 = FUN_7ff70cb12e80(lVar19), lVar10 != 0)) {
      *(undefined1 *)(lVar4 + 0x29bf + lVar10) = 0;
    }
    FUN_7ff70c800cf0(&UNK_7ff70cb90f5e,lVar19,uVar13,param_3);
    bVar24 = true;
    goto LAB_7ff70c8464d8;
  }
  if ((*(int *)(_DAT_7ff70cc1a3c0 + 0x14b4) == 0) ||
     (*(int *)(_DAT_7ff70cc1a3c0 + 0x14b4) == param_3)) goto LAB_7ff70c8460d5;
  if ((uVar13 & 0x400) == 0) {
    if ((((*(char *)(_DAT_7ff70cc1a3c0 + 0xb2) == '\x01') && ((param_1 & 0x5000) != 0x1000)) &&
        (((param_1 & 0x1000) == 0 || (*(char *)(_DAT_7ff70cc1a3c0 + 0x59) == '\0')))) &&
       (((param_1 & 0xffff0fff) != 0 &&
        ((*(uint *)(_DAT_7ff70cc1a3c0 + 0x1520 +
                   (longlong)((int)((param_1 & 0xffff0fff) - 0x200) >> 5) * 4) >> (param_1 & 0x1f) &
         1) != 0)))) {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 2) != 0) {
        uVar8 = FUN_7ff70c818e20();
        FUN_7ff70c800cf0(&UNK_7ff70cb90e30,uVar8,uVar13,param_3);
      }
    }
    else {
      if ((-1 < (short)uVar13) && (*(char *)(_DAT_7ff70cc1a3c0 + 0x1dd4) == '\x01')) {
        uVar14 = param_1 & 0xffff0fff;
        if (((param_1 & 0xffff0fff) == 0) && (uVar14 = param_1, POPCOUNT(param_1) == 1)) {
          uVar23 = 0;
          for (; (uVar14 & 1) == 0; uVar14 = uVar14 >> 1 | 0x80000000) {
            uVar23 = uVar23 + 1;
          }
          uVar14 = uVar23 + 0x28b;
          if ((uVar23 & 0x1c) != 0xc) {
            uVar14 = param_1;
          }
        }
        if (0xffffff87 < uVar14 - 0x278) goto LAB_7ff70c8464d6;
      }
LAB_7ff70c8460d5:
      if ((uVar13 & 0x20000) == 0) {
        piVar9 = (int *)(_DAT_7ff70cc1a3c0 + 0x1ddc);
        if ((uVar13 & 0x800) != 0) goto LAB_7ff70c8460f7;
LAB_7ff70c846179:
        if ((uVar13 & 0x400) != 0) {
          if ((param_3 == 0) || (iVar18 = 1, *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4) != param_3)) {
            iVar18 = 0xff;
          }
          goto LAB_7ff70c8461c9;
        }
        iVar18 = 0;
        if ((uVar13 & 0x9000) != 0x1000) goto LAB_7ff70c8461c9;
        iVar18 = 2;
        if ((uVar13 & 0x4000) == 0) {
          iVar18 = 0xfe;
        }
        bVar1 = *(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5);
      }
      else {
        piVar9 = (int *)(*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x3c0) + 0x10);
        if ((uVar13 & 0x800) == 0) goto LAB_7ff70c846179;
LAB_7ff70c8460f7:
        if ((((param_3 == 0) || (iVar18 = 1, *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4) != param_3)) &&
            (iVar18 = 0xff, *piVar9 != 0)) && (0 < (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fb8)))
        {
          lVar19 = 0;
          do {
            if (*(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1fc0) + lVar19 * 8) == *piVar9) {
              iVar18 = (int)lVar19 + 3;
              bVar1 = *(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5);
              goto joined_r0x7ff70c84629f;
            }
            lVar19 = lVar19 + 1;
          } while (*(int *)(_DAT_7ff70cc1a3c0 + 0x1fb8) != lVar19);
        }
LAB_7ff70c8461c9:
        bVar1 = *(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5);
      }
joined_r0x7ff70c84629f:
      if ((bVar1 & 2) != 0) {
        uVar14 = param_1 & 0xffff0fff;
        if (uVar14 - 0x20f < 8) {
          uVar23 = 0xffffefff;
          if ((uVar14 != 0x20f) && (uVar14 != 0x213)) {
            uVar6 = (param_1 & 0xffff0ffb) - 0x210;
            uVar23 = 0xffffffff;
            if (uVar6 < 3) {
              uVar23 = *(uint *)(&UNK_7ff70cb1d3e8 + (ulonglong)uVar6 * 4);
            }
          }
          uVar23 = uVar23 & param_1;
LAB_7ff70c84622c:
          puStack_60 = *(undefined **)(&UNK_7ff70cb1b940 + (ulonglong)uVar14 * 8);
        }
        else {
          uVar23 = param_1;
          if (param_1 == 0 || (param_1 & 0xffff0fff) != 0) {
            if ((param_1 & 0xffff0fff) == 0) {
              puStack_60 = &UNK_7ff70cb86ac2;
            }
            else {
              if (uVar14 - 0x200 < 0x9b) goto LAB_7ff70c84622c;
              puStack_60 = &UNK_7ff70cb84132;
            }
          }
          else {
            puStack_60 = &UNK_7ff70cb923a7;
          }
        }
        puStack_68 = &UNK_7ff70cb8e054;
        if (-1 < (short)uVar23) {
          puStack_68 = &UNK_7ff70cb923a7;
        }
        puStack_70 = &UNK_7ff70cb8e034;
        if ((uVar23 & 0x4000) == 0) {
          puStack_70 = &UNK_7ff70cb923a7;
        }
        puStack_78 = &UNK_7ff70cb8e039;
        if ((uVar23 & 0x2000) == 0) {
          puStack_78 = &UNK_7ff70cb923a7;
        }
        puVar21 = &UNK_7ff70cb8e05b;
        if ((uVar23 & 0x1000) == 0) {
          puVar21 = &UNK_7ff70cb923a7;
        }
        lVar19 = _DAT_7ff70cc1a3c0 + 0x29c0;
        FUN_7ff70c802a20(lVar19,0x40,&UNK_7ff70cb823fb,puVar21);
        if ((((param_1 & 0xffff0fff) == 0) && (uVar23 != 0)) &&
           (lVar10 = FUN_7ff70cb12e80(lVar19), lVar10 != 0)) {
          *(undefined1 *)(lVar4 + 0x29bf + lVar10) = 0;
        }
        puStack_78 = (undefined *)CONCAT44(puStack_78._4_4_,iVar18);
        FUN_7ff70c800cf0(&UNK_7ff70cb91353,lVar19,uVar13,param_3);
      }
      lVar19 = _DAT_7ff70cc1a3c0;
      if (iVar18 != 0xff) {
        uVar14 = param_1 & 0xf000;
        uVar13 = param_1 & 0xffff0fff;
        if (((param_1 & 0xffff0fff) == 0) && (uVar13 = uVar14, POPCOUNT(uVar14) == 1)) {
          uVar23 = 0;
          for (; (uVar13 & 1) == 0; uVar13 = uVar13 >> 1 | 0x80000000) {
            uVar23 = uVar23 + 1;
          }
          uVar13 = uVar23 + 0x28b;
          if ((uVar23 & 0x1c) != 0xc) {
            uVar13 = uVar14;
          }
        }
        psVar22 = (short *)(_DAT_7ff70cc1a3c0 + (longlong)(int)uVar13 * 2 + 0x1878);
        psVar17 = psVar22;
        do {
          if ((longlong)*psVar17 == -1) {
            iVar2 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1db0);
            if (iVar2 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1db4)) {
              if (iVar2 == 0) {
                iVar7 = 8;
              }
              else {
                iVar7 = iVar2 / 2 + iVar2;
              }
              iStack_4c = iVar2 + 1;
              if (iVar2 + 1 < iVar7) {
                iStack_4c = iVar7;
              }
              lVar10 = (*_DAT_7ff70cbe9460)((longlong)iStack_4c << 4,_DAT_7ff70cc1a3d0);
              lVar11 = _DAT_7ff70cc1a3c0;
              if (_DAT_7ff70cc1a3c0 != 0) {
                piVar9 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar16 * 8) == *piVar9) {
                  sVar12 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar16 * 8) + 1;
                }
                else {
                  iVar7 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                  *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar7;
                  lVar16 = (longlong)iVar7;
                  *(int *)(lVar11 + 0x2874 + lVar16 * 8) = *piVar9;
                  *(undefined4 *)(lVar11 + 0x2878 + lVar16 * 8) = 0;
                  sVar12 = 1;
                }
                *(short *)(lVar11 + 0x2878 + lVar16 * 8) = sVar12;
                *(int *)(lVar11 + 0x2868) = *(int *)(lVar11 + 0x2868) + 1;
              }
              if (*(longlong *)(lVar19 + 0x1db8) != 0) {
                FUN_7ff70cb12b60(lVar10,*(longlong *)(lVar19 + 0x1db8),
                                 (longlong)*(int *)(lVar19 + 0x1db0) << 4);
                lVar16 = _DAT_7ff70cc1a3c0;
                lVar11 = *(longlong *)(lVar19 + 0x1db8);
                if ((lVar11 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
                  piVar9 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                  lVar20 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar20 * 8) == *piVar9) {
                    sVar12 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar20 * 8) + 1;
                  }
                  else {
                    iVar7 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                    *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar7;
                    lVar20 = (longlong)iVar7;
                    *(int *)(lVar16 + 0x2874 + lVar20 * 8) = *piVar9;
                    *(undefined4 *)(lVar16 + 0x2878 + lVar20 * 8) = 0;
                    sVar12 = 1;
                  }
                  *(short *)(lVar16 + 0x287a + lVar20 * 8) = sVar12;
                  *(int *)(lVar16 + 0x286c) = *(int *)(lVar16 + 0x286c) + 1;
                }
                (*_DAT_7ff70cbe9468)(lVar11,_DAT_7ff70cc1a3d0);
              }
              *(longlong *)(lVar19 + 0x1db8) = lVar10;
              *(int *)(lVar19 + 0x1db4) = iStack_4c;
              iVar7 = *(int *)(lVar19 + 0x1db0);
            }
            else {
              lVar10 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1db8);
              iVar7 = iVar2;
            }
            lVar11 = (longlong)iVar7 * 0x10;
            *(undefined4 *)(lVar10 + lVar11) = 0xffff;
            *(undefined2 *)(lVar10 + 4 + lVar11) = 0xffff;
            *(undefined8 *)(lVar10 + 8 + lVar11) = 0xffffffffffffffff;
            *(int *)(lVar19 + 0x1db0) = *(int *)(lVar19 + 0x1db0) + 1;
            lVar19 = *(longlong *)(lVar19 + 0x1db8);
            lVar10 = (longlong)(short)iVar2 * 0x10;
            psVar17 = (short *)(lVar19 + lVar10);
            *(short *)(lVar19 + 2 + lVar10) = (short)uVar14;
            *(short *)(lVar19 + lVar10) = *psVar22;
            *psVar22 = (short)iVar2;
            bVar1 = *(byte *)((longlong)psVar17 + 5);
            goto joined_r0x7ff70c84670f;
          }
          lVar10 = (longlong)*psVar17 * 0x10;
          psVar17 = (short *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1db8) + lVar10);
        } while (uVar14 != *(ushort *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1db8) + 2 + lVar10));
        bVar1 = *(byte *)((longlong)psVar17 + 5);
joined_r0x7ff70c84670f:
        if (iVar18 < (int)(uint)bVar1) {
          *(int *)(psVar17 + 6) = param_3;
          *(char *)((longlong)psVar17 + 5) = (char)iVar18;
        }
        if (*(int *)(psVar17 + 4) == param_3) {
          bVar24 = true;
          if ((*(byte *)(lVar4 + 0x27b5) & 2) != 0) {
            FUN_7ff70c800cf0(&UNK_7ff70cb9107a);
            bVar24 = *(int *)(psVar17 + 4) == param_3;
          }
          goto LAB_7ff70c8464d8;
        }
      }
    }
  }
LAB_7ff70c8464d6:
  bVar24 = false;
LAB_7ff70c8464d8:
  if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_98)) {
    return bVar24;
  }
  FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_98);
  pcVar3 = (code *)swi(3);
  uVar5 = (*pcVar3)();
  return (bool)uVar5;
}


