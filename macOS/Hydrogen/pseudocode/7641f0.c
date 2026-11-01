
/* WARNING: Possible PIC construction at 0x00763ea0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00763ea4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_007641f0(void)

{
  bool bVar1;
  byte bVar2;
  ulong uVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  undefined8 uVar9;
  undefined1 uVar10;
  uint uVar11;
  ulong uVar12;
  uint uVar13;
  undefined1 uVar14;
  uint uVar15;
  code *unaff_x19;
  int unaff_w21;
  ulong uVar16;
  long lVar17;
  char *pcVar18;
  byte *pbVar19;
  undefined1 *puVar20;
  byte *pbVar21;
  undefined1 *puVar22;
  uint uVar23;
  long unaff_x25;
  uint uVar24;
  uint uVar25;
  int unaff_w28;
  long unaff_x29;
  double dVar26;
  double unaff_d8;
  undefined1 auVar27 [16];
  undefined1 *in_stack_00000010;
  byte *in_stack_00000018;
  undefined1 *in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  char *in_stack_00000038;
  byte *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  byte bStack0000000000000078;
  undefined1 uStack00000000000001c0;
  undefined1 uStack00000000000001c8;
  uint uStack_7ffffffc;
  long alStack_7ffffff8 [268435452];
  
  do {
    unaff_w28 = unaff_w21 + unaff_w28;
    iVar5 = unaff_w21 + 1;
    do {
      iVar6 = (*unaff_x19)(0x20);
      if (iVar6 != 0) goto LAB_0076451c;
      iVar5 = iVar5 + -1;
    } while (1 < iVar5);
LAB_00763bd8:
    unaff_x25 = unaff_x25 + 1;
    if (in_stack_00000048._4_4_ <= unaff_x25) {
LAB_0076451c:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
        return;
      }
      auVar27 = ___stack_chk_fail();
_curl_msnprintf:
      func_0x00762a38(auVar27._0_8_,auVar27._8_8_);
      return;
    }
    lVar8 = unaff_x25 * 0x20;
    lVar17 = *(long *)((long)register0x00000008 + lVar8 + 0x9d8);
    uVar24 = *(uint *)((long)register0x00000008 + lVar8 + 0x9c8);
    if (lVar17 != 0) {
      pcVar18 = *(char **)((long)register0x00000008 + lVar8 + 0x9d0);
      iVar5 = unaff_w28 + (int)lVar17;
      do {
        if (*pcVar18 == '\0') goto code_r0x00763c2c;
        iVar6 = (*unaff_x19)();
        if (iVar6 != 0) goto LAB_0076451c;
        pcVar18 = pcVar18 + 1;
        unaff_w28 = unaff_w28 + 1;
        lVar17 = lVar17 + -1;
      } while (lVar17 != 0);
      unaff_w28 = iVar5;
code_r0x00763c2c:
      if ((uVar24 >> 0x14 & 1) != 0) goto LAB_00763bd8;
    }
    iVar6 = *(int *)((long)register0x00000008 + lVar8 + 0x9c0);
    uVar23 = uVar24;
    iVar5 = iVar6;
    if ((uVar24 >> 0xe & 1) == 0) {
joined_r0x00763da0:
      uVar25 = uVar24 >> 0x10;
      uVar24 = uVar23;
      if ((uVar25 & 1) == 0) goto code_r0x00763c78;
code_r0x00763c48:
      iVar7 = *(int *)(&uStack00000000000001c8 +
                      (long)*(int *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9c4) * 0x10);
      if (iVar7 < 0) {
        iVar7 = -1;
      }
    }
    else {
      iVar5 = *(int *)(&uStack00000000000001c8 + (long)iVar6 * 0x10);
      if (iVar5 < 0) {
        iVar7 = 0x7fffffff;
        if (iVar5 != -0x80000000) {
          iVar7 = -iVar5;
        }
        uVar23 = uVar24 & 0xfffffeff | 4;
        iVar5 = iVar7;
        goto joined_r0x00763da0;
      }
      if ((uVar24 >> 0x10 & 1) != 0) goto code_r0x00763c48;
code_r0x00763c78:
      if ((uVar24 >> 0xf & 1) == 0) {
        iVar7 = -1;
      }
      else {
        iVar7 = *(int *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9c4);
      }
    }
    uVar16 = (ulong)*(uint *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9cc);
    uVar23 = uVar24;
    pbVar19 = in_stack_00000040;
    switch(*(undefined4 *)(&uStack00000000000001c0 + uVar16 * 0x10)) {
    case 0:
      pcVar18 = *(char **)(&uStack00000000000001c8 + uVar16 * 0x10);
      if (pcVar18 == (char *)0x0) {
        if (iVar7 != -1 && iVar7 < 5) {
          uVar16 = 0;
          pcVar18 = "";
          goto code_r0x00764424;
        }
        uVar24 = uVar24 & 0xfffffff7;
        uVar16 = 5;
        iVar7 = 5;
        pcVar18 = "(nil)";
        iVar6 = iVar5 + -5;
joined_r0x00764308:
        bVar4 = true;
      }
      else {
        if (iVar7 == -1) {
          if (*pcVar18 == '\0') {
            uVar16 = 0;
          }
          else {
            uVar16 = _strlen(pcVar18);
          }
        }
        else {
          uVar16 = (ulong)iVar7;
        }
code_r0x00764424:
        uVar12 = uVar16;
        if (0x7ffffffe < uVar16) {
          uVar12 = 0x7fffffff;
        }
        iVar7 = (int)uVar12;
        if ((uVar24 >> 3 & 1) == 0) {
          iVar6 = iVar5 - iVar7;
          goto joined_r0x00764308;
        }
        iVar6 = (*unaff_x19)(0x22);
        if (iVar6 != 0) goto LAB_0076451c;
        bVar4 = false;
        unaff_w28 = unaff_w28 + 1;
        iVar6 = iVar5 - iVar7;
      }
      if ((uVar24 >> 2 & 1) == 0) {
        if (iVar6 < 1) {
          iVar6 = iVar6 + -1;
        }
        else {
          unaff_w28 = (iVar5 + unaff_w28) - iVar7;
          do {
            iVar5 = (*unaff_x19)(0x20);
            if (iVar5 != 0) goto LAB_0076451c;
            iVar5 = iVar6 + -1;
            bVar1 = 0 < iVar6;
            iVar6 = iVar5;
          } while (iVar5 != 0 && bVar1);
          iVar6 = -1;
        }
      }
      if (uVar16 != 0) {
        iVar5 = unaff_w28 + (int)uVar16;
        do {
          if (*pcVar18 == '\0') goto code_r0x007644cc;
          iVar7 = (*unaff_x19)();
          if (iVar7 != 0) goto LAB_0076451c;
          pcVar18 = pcVar18 + 1;
          unaff_w28 = unaff_w28 + 1;
          uVar16 = uVar16 - 1;
        } while (uVar16 != 0);
        unaff_w28 = iVar5;
      }
code_r0x007644cc:
      if (((uVar24 >> 2 & 1) != 0) && (0 < iVar6)) {
        unaff_w28 = iVar6 + unaff_w28;
        iVar6 = iVar6 + 1;
        do {
          iVar5 = (*unaff_x19)(0x20);
          if (iVar5 != 0) goto LAB_0076451c;
          iVar6 = iVar6 + -1;
        } while (1 < iVar6);
      }
      if (!bVar4) {
        iVar5 = (*unaff_x19)(0x22);
        if (iVar5 != 0) goto LAB_0076451c;
        unaff_w28 = unaff_w28 + 1;
      }
      goto LAB_00763bd8;
    case 1:
      uVar16 = *(ulong *)(&uStack00000000000001c8 + uVar16 * 0x10);
      if (uVar16 != 0) {
        uVar13 = 0;
        in_stack_00000038 = "0123456789abcdefghijklmnopqrstuvwxyz";
        if ((uVar24 & 0x1000) != 0) {
          in_stack_00000038 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        uVar15 = 1;
        uVar12 = 0x10;
        uVar25 = 1;
        goto code_r0x00763f80;
      }
      iVar7 = iVar5 + -5;
      iVar6 = iVar7;
      if (((uVar24 >> 2 & 1) != 0) && (iVar6 = iVar5 + -6, 5 < iVar5)) {
        unaff_w28 = iVar7 + unaff_w28;
        do {
          iVar5 = (*unaff_x19)(0x20);
          if (iVar5 != 0) goto LAB_0076451c;
          iVar7 = iVar7 + -1;
        } while (0 < iVar7);
        iVar6 = -1;
      }
      iVar5 = (*unaff_x19)(0x28);
      if ((((iVar5 != 0) || (iVar5 = (*unaff_x19)(0x6e), iVar5 != 0)) ||
          (iVar5 = (*unaff_x19)(0x69), iVar5 != 0)) ||
         ((iVar5 = (*unaff_x19)(0x6c), iVar5 != 0 || (iVar5 = (*unaff_x19)(0x29), iVar5 != 0))))
      goto LAB_0076451c;
      unaff_w28 = unaff_w28 + 5;
      if (((uVar24 >> 2 & 1) == 0) && (0 < iVar6)) {
        unaff_w28 = unaff_w28 + iVar6;
        iVar6 = iVar6 + 1;
        do {
          iVar5 = (*unaff_x19)(0x20);
          if (iVar5 != 0) goto LAB_0076451c;
          iVar6 = iVar6 + -1;
        } while (1 < iVar6);
      }
      goto LAB_00763bd8;
    case 2:
      if (((uVar24 >> 6 & 1) == 0) && ((uVar24 >> 5 & 1) == 0)) {
        if ((uVar24 >> 4 & 1) == 0) {
          **(int **)(&uStack00000000000001c8 + uVar16 * 0x10) = unaff_w28;
        }
        else {
          **(undefined2 **)(&uStack00000000000001c8 + uVar16 * 0x10) = (short)unaff_w28;
        }
      }
      else {
        **(long **)(&uStack00000000000001c8 + uVar16 * 0x10) = (long)unaff_w28;
      }
      goto LAB_00763bd8;
    case 6:
    case 7:
    case 8:
      uVar23 = uVar24 | 0x200;
    case 3:
    case 4:
    case 5:
      uVar16 = *(ulong *)(&uStack00000000000001c8 + uVar16 * 0x10);
      if ((uVar23 >> 0x11 & 1) != 0) {
        iVar7 = unaff_w28;
        iVar6 = iVar5;
        if (((uVar23 >> 2 & 1) == 0) && (iVar6 = iVar5 + -1, 1 < iVar5)) {
          iVar7 = iVar6 + unaff_w28;
          do {
            iVar6 = (*unaff_x19)(0x20);
            if (iVar6 != 0) goto LAB_0076451c;
            iVar5 = iVar5 + -1;
          } while (1 < iVar5);
          iVar6 = 0;
        }
        iVar5 = (*unaff_x19)((uint)uVar16 & 0xff);
        if (iVar5 != 0) goto LAB_0076451c;
        unaff_w28 = iVar7 + 1;
        if (((uVar23 >> 2 & 1) != 0) && (1 < iVar6)) {
          unaff_w28 = iVar6 + iVar7;
          iVar6 = iVar6 + 1;
          do {
            iVar5 = (*unaff_x19)(0x20);
            if (iVar5 != 0) goto LAB_0076451c;
            iVar6 = iVar6 + -1;
          } while (2 < iVar6);
        }
        goto LAB_00763bd8;
      }
      if ((uVar23 >> 10 & 1) == 0) {
        if ((uVar23 >> 0xb & 1) != 0) {
          uVar13 = 0;
          in_stack_00000038 = "0123456789abcdefghijklmnopqrstuvwxyz";
          if ((uVar23 & 0x1000) != 0) {
            in_stack_00000038 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          }
          uVar25 = uVar24 >> 3 & 1;
          uVar15 = 1;
          uVar12 = 0x10;
          uVar24 = uVar23;
          goto code_r0x00763f80;
        }
        uVar12 = -uVar16;
        if (-1 < (long)uVar16) {
          uVar12 = uVar16;
        }
        uVar11 = 0;
        if (-1 >= (long)uVar16) {
          uVar11 = (uint)((uVar23 & 0x200) == 0);
        }
        if ((uVar23 & 0x200) != 0) {
          uVar12 = uVar16;
        }
        if (iVar7 == -1) {
          iVar7 = 1;
        }
        if (uVar12 != 0) {
          pbVar21 = in_stack_00000040;
          do {
            pbVar19 = pbVar21 + -1;
            *pbVar21 = (char)uVar12 + (char)(uVar12 / 10) * -10 | 0x30;
            bVar4 = 9 < uVar12;
            uVar12 = uVar12 / 10;
            pbVar21 = pbVar19;
          } while (bVar4);
        }
        uVar15 = 0;
        uVar25 = uVar24 >> 3 & 1;
        iVar6 = (int)in_stack_00000040 - (int)pbVar19;
        iVar5 = iVar5 - iVar6;
        iVar6 = iVar7 - iVar6;
        uVar24 = uVar23;
code_r0x00763ff0:
        pbVar21 = pbVar19;
        if (0 < iVar6) {
          iVar5 = iVar5 - iVar6;
          if (&bStack0000000000000078 <= pbVar19) {
            uVar12 = (ulong)(((iVar7 - (int)&bStack0000000000000078) + (int)pbVar19) - 0x145);
            uVar16 = (long)pbVar19 - (long)&bStack0000000000000078;
            if (uVar12 <= uVar16) {
              uVar16 = uVar12;
            }
            _memset((long)pbVar19 - uVar16,0x30,uVar16 + 1);
            pbVar21 = (byte *)(((long)pbVar19 - uVar16) + -1);
          }
        }
      }
      else {
        uVar15 = 0;
        uVar25 = uVar24 >> 3 & 1;
        uVar13 = 1;
        uVar12 = 8;
        uVar24 = uVar23;
code_r0x00763f80:
        if (iVar7 == -1) {
          iVar7 = 1;
        }
        if (uVar16 != 0) {
          pbVar21 = in_stack_00000040;
          do {
            pbVar19 = pbVar21 + -1;
            *pbVar21 = in_stack_00000038[uVar16 & uVar12 - 1];
            uVar3 = 0;
            if (uVar12 != 0) {
              uVar3 = uVar16 / uVar12;
            }
            bVar4 = uVar12 <= uVar16;
            uVar16 = uVar3;
            pbVar21 = pbVar19;
          } while (bVar4);
        }
        uVar11 = 0;
        iVar6 = (int)in_stack_00000040 - (int)pbVar19;
        iVar5 = iVar5 - iVar6;
        iVar6 = iVar7 - iVar6;
        if (((uVar13 & uVar25) != 1) || (0 < iVar6)) goto code_r0x00763ff0;
        uVar11 = 0;
        pbVar21 = pbVar19 + -1;
        *pbVar19 = 0x30;
        iVar5 = iVar5 + -1;
      }
      iVar6 = iVar5 + -2;
      if ((uVar15 & uVar25) == 0) {
        iVar6 = iVar5;
      }
      uVar23 = uVar11;
      if ((uVar24 & 3) != 0) {
        uVar23 = 1;
      }
      iVar5 = iVar6 - uVar23;
      iVar7 = iVar5;
      if (((uVar24 & 0x104) == 0) && (iVar7 = iVar5 + -1, 0 < iVar5)) {
        unaff_w28 = (iVar6 + unaff_w28) - uVar23;
        do {
          iVar6 = (*unaff_x19)(0x20);
          if (iVar6 != 0) goto LAB_0076451c;
          iVar6 = iVar5 + -1;
          bVar4 = 0 < iVar5;
          iVar5 = iVar6;
        } while (iVar6 != 0 && bVar4);
        iVar7 = -1;
      }
      if (uVar11 == 0) {
        if ((uVar24 >> 1 & 1) != 0) {
          uVar9 = 0x2b;
          goto code_r0x007640cc;
        }
        if ((uVar24 & 1) != 0) {
          uVar9 = 0x20;
          goto code_r0x007640cc;
        }
      }
      else {
        uVar9 = 0x2d;
code_r0x007640cc:
        iVar5 = (*unaff_x19)(uVar9);
        if (iVar5 != 0) goto LAB_0076451c;
        unaff_w28 = unaff_w28 + 1;
      }
      if ((uVar15 & uVar25) != 0) {
        iVar5 = (*unaff_x19)(0x30);
        if (iVar5 != 0) goto LAB_0076451c;
        if ((uVar24 >> 0xc & 1) == 0) {
          uVar9 = 0x78;
        }
        else {
          uVar9 = 0x58;
        }
        iVar5 = (*unaff_x19)(uVar9);
        if (iVar5 != 0) goto LAB_0076451c;
        unaff_w28 = unaff_w28 + 2;
      }
      unaff_w21 = iVar7;
      if (((uVar24 & 0x104) == 0x100) && (unaff_w21 = iVar7 + -1, 0 < iVar7)) {
        unaff_w28 = unaff_w28 + iVar7;
        do {
          iVar5 = (*unaff_x19)(0x30);
          if (iVar5 != 0) goto LAB_0076451c;
          iVar5 = iVar7 + -1;
          bVar4 = 0 < iVar7;
          iVar7 = iVar5;
        } while (iVar5 != 0 && bVar4);
        unaff_w21 = -1;
      }
      if (pbVar21 + 1 <= in_stack_00000040) {
        unaff_w28 = (in_stack_00000030._4_4_ + unaff_w28) - (int)pbVar21;
        lVar8 = in_stack_00000028 - (long)pbVar21;
        do {
          pbVar21 = pbVar21 + 1;
          iVar5 = (*unaff_x19)(*pbVar21);
          if (iVar5 != 0) goto LAB_0076451c;
          lVar8 = lVar8 + -1;
        } while (lVar8 != 0);
      }
      if (((uVar24 >> 2 & 1) == 0) || (unaff_w21 < 1)) goto LAB_00763bd8;
      break;
    case 9:
      in_stack_00000058 = _UNK_008cd86b;
      uStack0000000000000050 = _UNK_008cd863;
      in_stack_00000068 = _UNK_008cd87b;
      in_stack_00000060 = _UNK_008cd873;
      lVar8 = _strlen(&uStack0000000000000050);
      if ((uVar24 & 0x2000) != 0) {
        iVar5 = iVar6;
      }
      if ((uVar24 >> 0xf & 1) == 0) {
        if ((uVar24 >> 2 & 1) == 0) goto code_r0x00763e64;
code_r0x00764238:
        uStack0000000000000050._0_2_ = CONCAT11(0x2d,(undefined1)uStack0000000000000050);
        puVar22 = in_stack_00000010;
        puVar20 = in_stack_00000010;
        if ((uVar24 >> 1 & 1) != 0) goto code_r0x00764248;
code_r0x00763e68:
        puVar22 = puVar20;
        if ((uVar24 & 1) == 0) goto code_r0x00763e6c;
code_r0x00764254:
        puVar22 = puVar20 + 1;
        *puVar20 = 0x20;
        if ((uVar24 >> 3 & 1) != 0) goto code_r0x00764260;
code_r0x00763e70:
        *puVar22 = 0;
      }
      else {
        iVar7 = *(int *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9c4);
        if ((uVar24 >> 2 & 1) != 0) goto code_r0x00764238;
code_r0x00763e64:
        puVar22 = in_stack_00000020;
        puVar20 = in_stack_00000020;
        if ((uVar24 >> 1 & 1) == 0) goto code_r0x00763e68;
code_r0x00764248:
        puVar20 = puVar22 + 1;
        *puVar22 = 0x2b;
        puVar22 = puVar20;
        if ((uVar24 & 1) != 0) goto code_r0x00764254;
code_r0x00763e6c:
        if ((uVar24 >> 3 & 1) == 0) goto code_r0x00763e70;
code_r0x00764260:
        *puVar22 = 0x23;
        puVar22[1] = 0;
        puVar22 = puVar22 + 1;
      }
      if (-1 < iVar5) {
        auVar27._8_8_ = 0x20 - lVar8;
        auVar27._0_8_ = puVar22;
        goto _curl_msnprintf;
      }
      if (-1 < iVar7) {
        for (dVar26 = *(double *)(&uStack00000000000001c8 + uVar16 * 0x10); unaff_d8 <= dVar26;
            dVar26 = dVar26 / unaff_d8) {
        }
        iVar5 = func_0x00764560(puVar22,0x20 - lVar8,".%d");
        puVar22 = puVar22 + iVar5;
      }
      puVar20 = puVar22;
      if ((uVar24 >> 5 & 1) != 0) {
        puVar20 = puVar22 + 1;
        *puVar22 = 0x6c;
      }
      if ((uVar24 >> 0x12 & 1) == 0) {
        uVar10 = 0x67;
        if ((uVar24 & 0x1000) != 0) {
          uVar10 = 0x47;
        }
        uVar24 = uVar24 & 0x80000;
        uVar14 = 0x66;
      }
      else {
        uVar24 = uVar24 & 0x1000;
        uVar10 = 0x45;
        uVar14 = 0x65;
      }
      if (uVar24 != 0) {
        uVar14 = uVar10;
      }
      *puVar20 = uVar14;
      puVar20[1] = 0;
      _snprintf(&bStack0000000000000078,0x146,&uStack0000000000000050);
      bVar2 = bStack0000000000000078;
      pbVar19 = in_stack_00000018;
      while (bVar2 != 0) {
        iVar5 = (*unaff_x19)(bVar2);
        if (iVar5 != 0) goto LAB_0076451c;
        unaff_w28 = unaff_w28 + 1;
        bVar2 = *pbVar19;
        pbVar19 = pbVar19 + 1;
      }
    default:
      goto LAB_00763bd8;
    }
  } while( true );
}

