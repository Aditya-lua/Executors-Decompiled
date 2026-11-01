
/* WARNING: Possible PIC construction at 0x00763ea0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00763ea4) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00763df4(char *param_1)

{
  bool bVar1;
  uint uVar2;
  byte bVar3;
  undefined1 in_ZR;
  bool bVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  undefined8 uVar8;
  undefined1 uVar9;
  uint uVar10;
  ulong uVar11;
  uint in_w9;
  undefined1 uVar12;
  ulong uVar13;
  uint uVar14;
  code *unaff_x19;
  ulong unaff_x21;
  uint unaff_w22;
  long lVar15;
  char *pcVar16;
  byte *pbVar17;
  undefined1 *puVar18;
  undefined1 *puVar19;
  byte *pbVar20;
  long lVar21;
  uint uVar22;
  long unaff_x25;
  uint unaff_w26;
  uint uVar23;
  int unaff_w27;
  int unaff_w28;
  long unaff_x29;
  double dVar24;
  double unaff_d8;
  undefined1 auVar25 [16];
  undefined1 *in_stack_00000010;
  byte *in_stack_00000018;
  undefined1 *in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  char *pcStack0000000000000038;
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
  
code_r0x00763df4:
  if (!(bool)in_ZR) {
    param_1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  }
  uVar14 = 1;
  uVar13 = 0x10;
  uVar23 = 1;
  uVar22 = unaff_w26;
  pcStack0000000000000038 = param_1;
LAB_00763f80:
  if (unaff_w22 == 0xffffffff) {
    unaff_w22 = 1;
  }
  pbVar20 = in_stack_00000040;
  if (unaff_x21 != 0) {
    pbVar17 = in_stack_00000040;
    do {
      pbVar20 = pbVar17 + -1;
      *pbVar17 = pcStack0000000000000038[unaff_x21 & uVar13 - 1];
      uVar11 = 0;
      if (uVar13 != 0) {
        uVar11 = unaff_x21 / uVar13;
      }
      bVar4 = uVar13 <= unaff_x21;
      unaff_x21 = uVar11;
      pbVar17 = pbVar20;
    } while (bVar4);
  }
  uVar10 = 0;
  iVar6 = (int)in_stack_00000040 - (int)pbVar20;
  iVar5 = unaff_w27 - iVar6;
  iVar6 = unaff_w22 - iVar6;
  if ((in_w9 & uVar23) != 1) goto code_r0x00763ff0;
  if (0 < iVar6) goto code_r0x00763ff0;
  uVar10 = 0;
  *pbVar20 = 0x30;
  iVar5 = iVar5 + -1;
  pbVar20 = pbVar20 + -1;
code_r0x0076404c:
  iVar6 = iVar5 + -2;
  if ((uVar14 & uVar23) == 0) {
    iVar6 = iVar5;
  }
  uVar2 = uVar10;
  if ((uVar22 & 3) != 0) {
    uVar2 = 1;
  }
  iVar5 = iVar6 - uVar2;
  iVar7 = iVar5;
  if (((uVar22 & 0x104) == 0) && (iVar7 = iVar5 + -1, 0 < iVar5)) {
    unaff_w28 = (iVar6 + unaff_w28) - uVar2;
    do {
      iVar6 = (*unaff_x19)(0x20);
      if (iVar6 != 0) goto code_r0x0076451c;
      iVar6 = iVar5 + -1;
      bVar4 = 0 < iVar5;
      iVar5 = iVar6;
    } while (iVar6 != 0 && bVar4);
    iVar7 = -1;
  }
  if (uVar10 == 0) {
    if ((uVar22 >> 1 & 1) != 0) {
      uVar8 = 0x2b;
      goto code_r0x007640cc;
    }
    if ((uVar22 & 1) != 0) {
      uVar8 = 0x20;
      goto code_r0x007640cc;
    }
  }
  else {
    uVar8 = 0x2d;
code_r0x007640cc:
    iVar5 = (*unaff_x19)(uVar8);
    if (iVar5 != 0) goto code_r0x0076451c;
    unaff_w28 = unaff_w28 + 1;
  }
  if ((uVar14 & uVar23) != 0) {
    iVar5 = (*unaff_x19)(0x30);
    if (iVar5 == 0) {
      if ((uVar22 >> 0xc & 1) == 0) {
        uVar8 = 0x78;
      }
      else {
        uVar8 = 0x58;
      }
      iVar5 = (*unaff_x19)(uVar8);
      if (iVar5 == 0) {
        unaff_w28 = unaff_w28 + 2;
        goto code_r0x00764110;
      }
    }
code_r0x0076451c:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
      return;
    }
    auVar25 = ___stack_chk_fail();
code_r0x00764560:
    func_0x00762a38(auVar25._0_8_,auVar25._8_8_);
    return;
  }
code_r0x00764110:
  iVar5 = iVar7;
  if (((uVar22 & 0x104) == 0x100) && (iVar5 = iVar7 + -1, 0 < iVar7)) {
    unaff_w28 = unaff_w28 + iVar7;
    do {
      iVar5 = (*unaff_x19)(0x30);
      if (iVar5 != 0) goto code_r0x0076451c;
      iVar5 = iVar7 + -1;
      bVar4 = 0 < iVar7;
      iVar7 = iVar5;
    } while (iVar5 != 0 && bVar4);
    iVar5 = -1;
  }
  if (pbVar20 + 1 <= in_stack_00000040) {
    unaff_w28 = (in_stack_00000030._4_4_ + unaff_w28) - (int)pbVar20;
    lVar21 = in_stack_00000028 - (long)pbVar20;
    do {
      pbVar20 = pbVar20 + 1;
      iVar6 = (*unaff_x19)(*pbVar20);
      if (iVar6 != 0) goto code_r0x0076451c;
      lVar21 = lVar21 + -1;
    } while (lVar21 != 0);
  }
  if (((uVar22 >> 2 & 1) != 0) && (0 < iVar5)) {
    unaff_w28 = iVar5 + unaff_w28;
    iVar5 = iVar5 + 1;
    do {
      iVar6 = (*unaff_x19)(0x20);
      if (iVar6 != 0) goto code_r0x0076451c;
      iVar5 = iVar5 + -1;
    } while (1 < iVar5);
  }
code_r0x00763bd8:
  unaff_x25 = unaff_x25 + 1;
  if (unaff_x25 < in_stack_00000048._4_4_) {
    lVar21 = unaff_x25 * 0x20;
    lVar15 = *(long *)((long)register0x00000008 + lVar21 + 0x9d8);
    uVar22 = *(uint *)((long)register0x00000008 + lVar21 + 0x9c8);
    if (lVar15 != 0) goto code_r0x00763bfc;
    goto code_r0x00763c34;
  }
  goto code_r0x0076451c;
code_r0x00763bfc:
  pcVar16 = *(char **)((long)register0x00000008 + lVar21 + 0x9d0);
  iVar5 = unaff_w28 + (int)lVar15;
  do {
    if (*pcVar16 == '\0') goto code_r0x00763c2c;
    iVar6 = (*unaff_x19)();
    if (iVar6 != 0) goto code_r0x0076451c;
    pcVar16 = pcVar16 + 1;
    unaff_w28 = unaff_w28 + 1;
    lVar15 = lVar15 + -1;
  } while (lVar15 != 0);
  unaff_w28 = iVar5;
code_r0x00763c2c:
  if ((uVar22 >> 0x14 & 1) != 0) goto code_r0x00763bd8;
code_r0x00763c34:
  iVar5 = *(int *)((long)register0x00000008 + lVar21 + 0x9c0);
  unaff_w26 = uVar22;
  unaff_w27 = iVar5;
  if ((uVar22 >> 0xe & 1) != 0) {
    unaff_w27 = *(int *)(&uStack00000000000001c8 + (long)iVar5 * 0x10);
    if (unaff_w27 < 0) {
      iVar6 = 0x7fffffff;
      if (unaff_w27 != -0x80000000) {
        iVar6 = -unaff_w27;
      }
      unaff_w26 = uVar22 & 0xfffffeff | 4;
      unaff_w27 = iVar6;
    }
  }
  if ((uVar22 >> 0x10 & 1) == 0) {
    if ((unaff_w26 >> 0xf & 1) == 0) {
      unaff_w22 = 0xffffffff;
    }
    else {
      unaff_w22 = *(uint *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9c4);
    }
  }
  else {
    unaff_w22 = *(uint *)(&uStack00000000000001c8 +
                         (long)*(int *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9c4) * 0x10)
    ;
    if ((int)unaff_w22 < 0) {
      unaff_w22 = 0xffffffff;
    }
  }
  uVar13 = (ulong)*(uint *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9cc);
  uVar22 = unaff_w26;
  switch(*(undefined4 *)(&uStack00000000000001c0 + uVar13 * 0x10)) {
  case 0:
    break;
  case 1:
    unaff_x21 = *(ulong *)(&uStack00000000000001c8 + uVar13 * 0x10);
    if (unaff_x21 != 0) {
      in_w9 = 0;
      in_ZR = (unaff_w26 & 0x1000) == 0;
      param_1 = "0123456789abcdefghijklmnopqrstuvwxyz";
      goto code_r0x00763df4;
    }
    iVar6 = unaff_w27 + -5;
    iVar5 = iVar6;
    if (((unaff_w26 >> 2 & 1) != 0) && (iVar5 = unaff_w27 + -6, 5 < unaff_w27)) {
      unaff_w28 = iVar6 + unaff_w28;
      do {
        iVar5 = (*unaff_x19)(0x20);
        if (iVar5 != 0) goto code_r0x0076451c;
        iVar6 = iVar6 + -1;
      } while (0 < iVar6);
      iVar5 = -1;
    }
    iVar6 = (*unaff_x19)(0x28);
    if ((((iVar6 != 0) || (iVar6 = (*unaff_x19)(0x6e), iVar6 != 0)) ||
        (iVar6 = (*unaff_x19)(0x69), iVar6 != 0)) ||
       ((iVar6 = (*unaff_x19)(0x6c), iVar6 != 0 || (iVar6 = (*unaff_x19)(0x29), iVar6 != 0))))
    goto code_r0x0076451c;
    unaff_w28 = unaff_w28 + 5;
    if (((unaff_w26 >> 2 & 1) == 0) && (0 < iVar5)) {
      unaff_w28 = unaff_w28 + iVar5;
      iVar5 = iVar5 + 1;
      do {
        iVar6 = (*unaff_x19)(0x20);
        if (iVar6 != 0) goto code_r0x0076451c;
        iVar5 = iVar5 + -1;
      } while (1 < iVar5);
    }
    goto code_r0x00763bd8;
  case 2:
    if (((unaff_w26 >> 6 & 1) == 0) && ((unaff_w26 >> 5 & 1) == 0)) {
      if ((unaff_w26 >> 4 & 1) == 0) {
        **(int **)(&uStack00000000000001c8 + uVar13 * 0x10) = unaff_w28;
      }
      else {
        **(undefined2 **)(&uStack00000000000001c8 + uVar13 * 0x10) = (short)unaff_w28;
      }
    }
    else {
      **(long **)(&uStack00000000000001c8 + uVar13 * 0x10) = (long)unaff_w28;
    }
    goto code_r0x00763bd8;
  case 6:
  case 7:
  case 8:
    uVar22 = unaff_w26 | 0x200;
  case 3:
  case 4:
  case 5:
    unaff_x21 = *(ulong *)(&uStack00000000000001c8 + uVar13 * 0x10);
    if ((uVar22 >> 0x11 & 1) != 0) {
      iVar6 = unaff_w28;
      iVar5 = unaff_w27;
      if (((uVar22 >> 2 & 1) == 0) && (iVar5 = unaff_w27 + -1, 1 < unaff_w27)) {
        iVar6 = iVar5 + unaff_w28;
        do {
          iVar5 = (*unaff_x19)(0x20);
          if (iVar5 != 0) goto code_r0x0076451c;
          unaff_w27 = unaff_w27 + -1;
        } while (1 < unaff_w27);
        iVar5 = 0;
      }
      iVar7 = (*unaff_x19)((uint)unaff_x21 & 0xff);
      if (iVar7 != 0) goto code_r0x0076451c;
      unaff_w28 = iVar6 + 1;
      if (((uVar22 >> 2 & 1) != 0) && (1 < iVar5)) {
        unaff_w28 = iVar5 + iVar6;
        iVar5 = iVar5 + 1;
        do {
          iVar6 = (*unaff_x19)(0x20);
          if (iVar6 != 0) goto code_r0x0076451c;
          iVar5 = iVar5 + -1;
        } while (2 < iVar5);
      }
      goto code_r0x00763bd8;
    }
    if ((uVar22 >> 10 & 1) != 0) {
      uVar14 = 0;
      uVar23 = unaff_w26 >> 3 & 1;
      in_w9 = 1;
      uVar13 = 8;
      goto LAB_00763f80;
    }
    if ((uVar22 >> 0xb & 1) == 0) {
      uVar13 = -unaff_x21;
      if (-1 < (long)unaff_x21) {
        uVar13 = unaff_x21;
      }
      uVar10 = 0;
      if (-1 >= (long)unaff_x21) {
        uVar10 = (uint)((uVar22 & 0x200) == 0);
      }
      if ((uVar22 & 0x200) != 0) {
        uVar13 = unaff_x21;
      }
      if (unaff_w22 == 0xffffffff) {
        unaff_w22 = 1;
      }
      pbVar20 = in_stack_00000040;
      if (uVar13 != 0) {
        pbVar17 = in_stack_00000040;
        do {
          pbVar20 = pbVar17 + -1;
          *pbVar17 = (char)uVar13 + (char)(uVar13 / 10) * -10 | 0x30;
          bVar4 = 9 < uVar13;
          uVar13 = uVar13 / 10;
          pbVar17 = pbVar20;
        } while (bVar4);
      }
      uVar14 = 0;
      uVar23 = unaff_w26 >> 3 & 1;
      iVar6 = (int)in_stack_00000040 - (int)pbVar20;
      iVar5 = unaff_w27 - iVar6;
      iVar6 = unaff_w22 - iVar6;
code_r0x00763ff0:
      if (0 < iVar6) {
        iVar5 = iVar5 - iVar6;
        if (&bStack0000000000000078 <= pbVar20) {
          uVar11 = (ulong)(((unaff_w22 - (int)&bStack0000000000000078) + (int)pbVar20) - 0x145);
          uVar13 = (long)pbVar20 - (long)&bStack0000000000000078;
          if (uVar11 <= uVar13) {
            uVar13 = uVar11;
          }
          _memset((long)pbVar20 - uVar13,0x30,uVar13 + 1);
          pbVar20 = (byte *)(((long)pbVar20 - uVar13) + -1);
        }
      }
      goto code_r0x0076404c;
    }
    in_w9 = 0;
    pcStack0000000000000038 = "0123456789abcdefghijklmnopqrstuvwxyz";
    if ((uVar22 & 0x1000) != 0) {
      pcStack0000000000000038 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }
    uVar23 = unaff_w26 >> 3 & 1;
    uVar14 = 1;
    uVar13 = 0x10;
    goto LAB_00763f80;
  case 9:
    in_stack_00000058 = _UNK_008cd86b;
    uStack0000000000000050 = _UNK_008cd863;
    in_stack_00000068 = _UNK_008cd87b;
    in_stack_00000060 = _UNK_008cd873;
    lVar21 = _strlen(&uStack0000000000000050);
    if ((unaff_w26 & 0x2000) != 0) {
      unaff_w27 = iVar5;
    }
    if ((unaff_w26 >> 0xf & 1) != 0) {
      unaff_w22 = *(uint *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9c4);
    }
    puVar18 = in_stack_00000020;
    if ((unaff_w26 >> 2 & 1) != 0) {
      uStack0000000000000050._0_2_ = CONCAT11(0x2d,(undefined1)uStack0000000000000050);
      puVar18 = in_stack_00000010;
    }
    if ((unaff_w26 >> 1 & 1) != 0) {
      *puVar18 = 0x2b;
      puVar18 = puVar18 + 1;
    }
    if ((unaff_w26 & 1) != 0) {
      *puVar18 = 0x20;
      puVar18 = puVar18 + 1;
    }
    if ((unaff_w26 >> 3 & 1) == 0) {
      *puVar18 = 0;
    }
    else {
      *puVar18 = 0x23;
      puVar18[1] = 0;
      puVar18 = puVar18 + 1;
    }
    if (-1 < unaff_w27) {
      auVar25._8_8_ = 0x20 - lVar21;
      auVar25._0_8_ = puVar18;
      goto code_r0x00764560;
    }
    if (-1 < (int)unaff_w22) {
      for (dVar24 = *(double *)(&uStack00000000000001c8 + uVar13 * 0x10); unaff_d8 <= dVar24;
          dVar24 = dVar24 / unaff_d8) {
      }
      iVar5 = func_0x00764560(puVar18,0x20 - lVar21,".%d");
      puVar18 = puVar18 + iVar5;
    }
    puVar19 = puVar18;
    if ((unaff_w26 >> 5 & 1) != 0) {
      puVar19 = puVar18 + 1;
      *puVar18 = 0x6c;
    }
    if ((unaff_w26 >> 0x12 & 1) == 0) {
      uVar9 = 0x67;
      if ((unaff_w26 & 0x1000) != 0) {
        uVar9 = 0x47;
      }
      uVar22 = unaff_w26 & 0x80000;
      uVar12 = 0x66;
    }
    else {
      uVar22 = unaff_w26 & 0x1000;
      uVar9 = 0x45;
      uVar12 = 0x65;
    }
    if (uVar22 != 0) {
      uVar12 = uVar9;
    }
    *puVar19 = uVar12;
    puVar19[1] = 0;
    _snprintf(&bStack0000000000000078,0x146,&uStack0000000000000050);
    bVar3 = bStack0000000000000078;
    pbVar20 = in_stack_00000018;
    while (bVar3 != 0) {
      iVar5 = (*unaff_x19)(bVar3);
      if (iVar5 != 0) goto code_r0x0076451c;
      unaff_w28 = unaff_w28 + 1;
      bVar3 = *pbVar20;
      pbVar20 = pbVar20 + 1;
    }
  default:
    goto code_r0x00763bd8;
  }
  pcVar16 = *(char **)(&uStack00000000000001c8 + uVar13 * 0x10);
  if (pcVar16 == (char *)0x0) {
    if (unaff_w22 != 0xffffffff && (int)unaff_w22 < 5) {
      uVar13 = 0;
      pcVar16 = "";
      goto code_r0x00764424;
    }
    unaff_w26 = unaff_w26 & 0xfffffff7;
    uVar13 = 5;
    iVar6 = 5;
    pcVar16 = "(nil)";
    iVar5 = unaff_w27 + -5;
  }
  else {
    if (unaff_w22 == 0xffffffff) {
      if (*pcVar16 == '\0') {
        uVar13 = 0;
      }
      else {
        uVar13 = _strlen(pcVar16);
      }
    }
    else {
      uVar13 = (ulong)(int)unaff_w22;
    }
code_r0x00764424:
    uVar11 = uVar13;
    if (0x7ffffffe < uVar13) {
      uVar11 = 0x7fffffff;
    }
    iVar6 = (int)uVar11;
    if ((unaff_w26 >> 3 & 1) != 0) {
      iVar5 = (*unaff_x19)(0x22);
      if (iVar5 != 0) goto code_r0x0076451c;
      bVar4 = false;
      unaff_w28 = unaff_w28 + 1;
      iVar5 = unaff_w27 - iVar6;
      goto joined_r0x00764464;
    }
    iVar5 = unaff_w27 - iVar6;
  }
  bVar4 = true;
joined_r0x00764464:
  if ((unaff_w26 >> 2 & 1) == 0) {
    if (iVar5 < 1) {
      iVar5 = iVar5 + -1;
    }
    else {
      unaff_w28 = (unaff_w27 + unaff_w28) - iVar6;
      do {
        iVar6 = (*unaff_x19)(0x20);
        if (iVar6 != 0) goto code_r0x0076451c;
        iVar6 = iVar5 + -1;
        bVar1 = 0 < iVar5;
        iVar5 = iVar6;
      } while (iVar6 != 0 && bVar1);
      iVar5 = -1;
    }
  }
  if (uVar13 != 0) {
    iVar6 = unaff_w28 + (int)uVar13;
    do {
      if (*pcVar16 == '\0') goto code_r0x007644cc;
      iVar7 = (*unaff_x19)();
      if (iVar7 != 0) goto code_r0x0076451c;
      pcVar16 = pcVar16 + 1;
      unaff_w28 = unaff_w28 + 1;
      uVar13 = uVar13 - 1;
    } while (uVar13 != 0);
    unaff_w28 = iVar6;
  }
code_r0x007644cc:
  if (((unaff_w26 >> 2 & 1) != 0) && (0 < iVar5)) {
    unaff_w28 = iVar5 + unaff_w28;
    iVar5 = iVar5 + 1;
    do {
      iVar6 = (*unaff_x19)(0x20);
      if (iVar6 != 0) goto code_r0x0076451c;
      iVar5 = iVar5 + -1;
    } while (1 < iVar5);
  }
  if (!bVar4) {
    iVar5 = (*unaff_x19)(0x22);
    if (iVar5 != 0) goto code_r0x0076451c;
    unaff_w28 = unaff_w28 + 1;
  }
  goto code_r0x00763bd8;
}

