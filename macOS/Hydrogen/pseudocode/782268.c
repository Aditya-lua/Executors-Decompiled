
/* WARNING: Possible PIC construction at 0x007822e0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00782320: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00782364: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0078240c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00782368) */
/* WARNING: Removing unreachable block (ram,0x007823b0) */
/* WARNING: Removing unreachable block (ram,0x007823f0) */
/* WARNING: Removing unreachable block (ram,0x00782324) */
/* WARNING: Removing unreachable block (ram,0x00782348) */
/* WARNING: Removing unreachable block (ram,0x007822e4) */
/* WARNING: Removing unreachable block (ram,0x00782308) */
/* WARNING: Removing unreachable block (ram,0x007822e8) */
/* WARNING: Removing unreachable block (ram,0x0078236c) */
/* WARNING: Removing unreachable block (ram,0x00782410) */
/* WARNING: Removing unreachable block (ram,0x00782414) */
/* WARNING: Removing unreachable block (ram,0x00782388) */
/* WARNING: Removing unreachable block (ram,0x00781f4c) */
/* WARNING: Removing unreachable block (ram,0x00782434) */

undefined8 FUN_00782268(void)

{
  undefined1 *puVar1;
  undefined2 uVar2;
  ushort uVar3;
  uint uVar4;
  ulong *puVar5;
  int iVar6;
  long lVar7;
  char *pcVar8;
  undefined4 *puVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined4 *puVar12;
  long *extraout_x1;
  long *plVar13;
  char *pcVar14;
  char *pcVar15;
  short sVar16;
  undefined4 uVar17;
  uint uVar18;
  long unaff_x19;
  long lVar19;
  undefined4 *unaff_x20;
  char *pcVar20;
  ulong unaff_x22;
  undefined1 **unaff_x29;
  undefined *puVar21;
  undefined1 auVar22 [16];
  undefined1 auVar23 [12];
  long in_stack_00000000;
  undefined8 in_stack_00000028;
  long lStack0000000000000030;
  undefined1 uStack0000000000000038;
  ulong uStack_2b0;
  ulong uStack_2a8;
  undefined1 uStack_291;
  long lStack_290;
  undefined1 auStack_288 [256];
  long lStack_188;
  undefined1 *puStack_160;
  undefined *puStack_158;
  char *pcStack_150;
  ulong uStack_148;
  undefined1 auStack_138 [256];
  long lStack_38;
  undefined1 auStack_6 [6];
  
  lVar7 = _strlen(in_stack_00000028);
  lVar19 = 9;
  if ((unaff_x22 & 0x4000) != 0) {
    lVar19 = 0xc;
  }
  pcVar20 = (char *)(lVar7 + lVar19);
  lStack0000000000000030 = (long)pcVar20;
  if ((*(byte *)((long)unaff_x20 + 0xa1a) >> 5 & 1) == 0) {
    if ((*(byte *)((long)unaff_x20 + 0x1346) >> 3 & 1) == 0) {
      in_stack_00000000 = 0;
    }
    else {
      in_stack_00000000 = 0;
      if (*(long *)(unaff_x20 + 0x454) != -1) {
        in_stack_00000000 = *(long *)(unaff_x20 + 0x454);
      }
    }
    func_0x00764560(&uStack0000000000000038,0x40,"%ld");
    pcVar14 = pcVar20 + *(long *)(unaff_x19 + 0x150);
    iVar6 = *(int *)(unaff_x19 + 0x13c);
    pcVar15 = "tsize";
    plVar13 = &lStack0000000000000030;
    puVar21 = (undefined *)0x7822e4;
    puVar5 = (ulong *)register0x00000008;
    goto code_r0x00782c14;
  }
  pcVar15 = (char *)0x0;
  pcVar14 = pcVar20;
  pcVar8 = (char *)_sendto(*(undefined4 *)(unaff_x19 + 0x18),*(undefined8 *)(unaff_x19 + 0x150),
                           pcVar20,0,*(long *)(*(long *)(unaff_x20 + 6) + 0x50) + 0x10,
                           *(undefined4 *)(*(long *)(*(long *)(unaff_x20 + 6) + 0x50) + 0xc));
  if (pcVar8 != pcVar20) {
    puVar9 = (undefined4 *)___error();
    pcVar14 = "\f";
    in_stack_00000000 = func_0x0077ea88(*puVar9,&uStack0000000000000038,0x100);
    func_0x0073c9e4();
  }
  (*pcRam0000000000a2b5f0)(in_stack_00000028);
  if (*(undefined1 **)PTR____stack_chk_guard_009b01e8 == unaff_x29[-7]) {
    return 0;
  }
  auVar23 = ___stack_chk_fail(0);
  puVar9 = auVar23._0_8_;
  puVar1 = auStack_6 + -10;
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar19 = *(long *)(puVar9 + 4);
  switch(auVar23._8_4_) {
  case 3:
    uVar4 = (uint)(*(ushort *)(*(long *)(puVar9 + 0x52) + 2) >> 8) |
            (*(ushort *)(*(long *)(puVar9 + 0x52) + 2) & 0xff00ff) << 8;
    pcVar20 = (char *)(ulong)uVar4;
    uVar18 = *(ushort *)(puVar9 + 0x51) + 1;
    if (uVar4 == (uVar18 & 0xffff)) {
      puVar9[7] = 0;
    }
    else {
      if (*(ushort *)(puVar9 + 0x51) != uVar4) {
        if (((lVar19 == 0) || (-1 < *(char *)(lVar19 + 0xa1d))) ||
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      lVar19 + 0x18) != 0 &&
            (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + lVar19 + 0x18) + 8) < 1)))) goto code_r0x007827dc;
        uStack_148 = (ulong)uVar18 & 0xffff;
        pcStack_150 = pcVar20;
        func_0x0073cab8(lVar19,"Received unexpected DATA packet block %d, expecting block %d");
        uVar10 = 0;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
          return 0;
        }
        break;
      }
      if (((lVar19 != 0) && (*(char *)(lVar19 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    lVar19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar19 + 0x18) + 8))))) {
        pcStack_150 = pcVar20;
        func_0x0073cab8(lVar19,"Received last DATA packet block %d again.");
      }
    }
    *(short *)(puVar9 + 0x51) = (short)uVar4;
    **(undefined1 **)(puVar9 + 0x54) = 0;
    *(undefined1 *)(*(long *)(puVar9 + 0x54) + 1) = 4;
    uVar2 = *(undefined2 *)(puVar9 + 0x51);
    *(char *)(*(long *)(puVar9 + 0x54) + 2) = (char)((ushort)uVar2 >> 8);
    *(char *)(*(long *)(puVar9 + 0x54) + 3) = (char)uVar2;
    pcVar14 = "\f";
    pcVar15 = &UNK_00080000;
    lVar7 = _sendto(puVar9[6],*(undefined8 *)(puVar9 + 0x54),4,0x80000,puVar9 + 0x2c,puVar9[0x4c]);
    if (-1 < lVar7) {
      uVar17 = 3;
      if ((long)(int)puVar9[0x4f] + 4 <= (long)(int)puVar9[0x4d]) {
        uVar17 = 1;
      }
      goto code_r0x00782668;
    }
code_r0x00782788:
    puVar12 = (undefined4 *)___error();
    pcVar14 = "\f";
    pcStack_150 = (char *)func_0x0077ea88(*puVar12,auStack_138,0x100);
    func_0x0073c9e4(lVar19,"%s");
    uVar10 = 0x37;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
      return 0x37;
    }
    break;
  default:
    pcStack_150 = "tftp_rx: internal error";
    func_0x0073c9e4(lVar19,"%s");
    uVar10 = 0x47;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
      return 0x47;
    }
    break;
  case 5:
    **(undefined1 **)(puVar9 + 0x54) = 0;
    *(undefined1 *)(*(long *)(puVar9 + 0x54) + 1) = 5;
    uVar2 = *(undefined2 *)(puVar9 + 0x51);
    *(char *)(*(long *)(puVar9 + 0x54) + 2) = (char)((ushort)uVar2 >> 8);
    *(char *)(*(long *)(puVar9 + 0x54) + 3) = (char)uVar2;
    pcVar14 = "\f";
    pcVar15 = &UNK_00080000;
    _sendto(puVar9[6],*(undefined8 *)(puVar9 + 0x54),4,0x80000,puVar9 + 0x2c,puVar9[0x4c]);
code_r0x00782704:
    uVar10 = 0;
    *puVar9 = 3;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
      return 0;
    }
    break;
  case 6:
    *(undefined2 *)(puVar9 + 0x51) = 0;
    puVar9[7] = 0;
    **(undefined1 **)(puVar9 + 0x54) = 0;
    *(undefined1 *)(*(long *)(puVar9 + 0x54) + 1) = 4;
    uVar2 = *(undefined2 *)(puVar9 + 0x51);
    *(char *)(*(long *)(puVar9 + 0x54) + 2) = (char)((ushort)uVar2 >> 8);
    *(char *)(*(long *)(puVar9 + 0x54) + 3) = (char)uVar2;
    pcVar14 = "\f";
    pcVar15 = &UNK_00080000;
    lVar7 = _sendto(puVar9[6],*(undefined8 *)(puVar9 + 0x54),4,0x80000,puVar9 + 0x2c,puVar9[0x4c]);
    if (lVar7 < 0) goto code_r0x00782788;
    uVar17 = 1;
code_r0x00782668:
    *puVar9 = uVar17;
    uVar11 = _time(0);
    uVar10 = 0;
    *(undefined8 *)(puVar9 + 10) = uVar11;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
      return 0;
    }
    break;
  case 7:
    uVar18 = puVar9[7] + 1;
    puVar9[7] = uVar18;
    if (((lVar19 != 0) && (*(char *)(lVar19 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  lVar19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + lVar19 + 0x18) + 8))))) {
      pcStack_150 = (char *)((ulong)(*(ushort *)(puVar9 + 0x51) + 1) & 0xffff);
      uStack_148 = (ulong)uVar18;
      func_0x0073cab8(lVar19,"Timeout waiting for block %d ACK. Retries = %d");
      uVar18 = puVar9[7];
    }
    if ((int)puVar9[9] < (int)uVar18) {
      puVar9[2] = 0xffffff9d;
      goto code_r0x00782704;
    }
    pcVar14 = "\f";
    pcVar15 = &UNK_00080000;
    lVar7 = _sendto(puVar9[6],*(undefined8 *)(puVar9 + 0x54),4,0x80000,puVar9 + 0x2c,puVar9[0x4c]);
    if (lVar7 < 0) goto code_r0x00782788;
code_r0x007827dc:
    uVar10 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
      return 0;
    }
  }
  auVar22 = ___stack_chk_fail(uVar10);
  unaff_x20 = auVar22._0_8_;
  puVar5 = &uStack_2b0;
  puStack_158 = &DAT_00782858;
  unaff_x29 = &puStack_160;
  lStack_188 = *(long *)PTR____stack_chk_guard_009b01e8;
  unaff_x19 = *(long *)(unaff_x20 + 4);
  puStack_160 = puVar1;
  switch(auVar22._8_4_) {
  case 4:
    uVar18 = (uint)(*(ushort *)(*(long *)(unaff_x20 + 0x52) + 2) >> 8) |
             (*(ushort *)(*(long *)(unaff_x20 + 0x52) + 2) & 0xff00ff) << 8;
    uVar3 = *(ushort *)(unaff_x20 + 0x51);
    if ((uVar18 == uVar3) || ((uVar3 == 0 && (uVar18 == 0xffff)))) {
      uVar10 = _time(0);
      *(undefined8 *)(unaff_x20 + 10) = uVar10;
      sVar16 = *(short *)(unaff_x20 + 0x51) + 1;
      goto code_r0x00782978;
    }
    if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      uStack_2b0 = (ulong)uVar18;
      uStack_2a8 = (ulong)uVar3;
      func_0x0073cab8(unaff_x19,"Received ACK for block %d, expecting %d");
    }
    iVar6 = unaff_x20[7];
    unaff_x20[7] = iVar6 + 1;
    if (iVar6 < (int)unaff_x20[9]) {
      pcVar14 = (char *)((long)(int)unaff_x20[0x4e] + 4);
      pcVar15 = &UNK_00080000;
      lVar19 = _sendto(unaff_x20[6],*(undefined8 *)(unaff_x20 + 0x54),pcVar14,0x80000,
                       unaff_x20 + 0x2c,unaff_x20[0x4c]);
      if (lVar19 < 0) goto code_r0x00782bb8;
      goto code_r0x00782b18;
    }
    uStack_2b0 = (ulong)*(ushort *)(unaff_x20 + 0x51);
    pcVar8 = "tftp_tx: giving up waiting for block %d ack";
    goto code_r0x00782bec;
  case 5:
    unaff_x19 = 3;
    *unaff_x20 = 3;
    **(undefined1 **)(unaff_x20 + 0x54) = 0;
    *(undefined1 *)(*(long *)(unaff_x20 + 0x54) + 1) = 5;
    uVar2 = *(undefined2 *)(unaff_x20 + 0x51);
    *(char *)(*(long *)(unaff_x20 + 0x54) + 2) = (char)((ushort)uVar2 >> 8);
    *(char *)(*(long *)(unaff_x20 + 0x54) + 3) = (char)uVar2;
    pcVar14 = "\f";
    pcVar15 = &UNK_00080000;
    _sendto(unaff_x20[6],*(undefined8 *)(unaff_x20 + 0x54),4,0x80000,unaff_x20 + 0x2c,
            unaff_x20[0x4c]);
    uVar10 = 0;
    *unaff_x20 = 3;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_188) {
      return 0;
    }
    break;
  case 6:
    sVar16 = 1;
code_r0x00782978:
    *(short *)(unaff_x20 + 0x51) = sVar16;
    unaff_x20[7] = 0;
    **(undefined1 **)(unaff_x20 + 0x54) = 0;
    *(undefined1 *)(*(long *)(unaff_x20 + 0x54) + 1) = 3;
    uVar2 = *(undefined2 *)(unaff_x20 + 0x51);
    *(char *)(*(long *)(unaff_x20 + 0x54) + 2) = (char)((ushort)uVar2 >> 8);
    *(char *)(*(long *)(unaff_x20 + 0x54) + 3) = (char)uVar2;
    if (*(ushort *)(unaff_x20 + 0x51) < 2) {
      iVar6 = unaff_x20[0x4f];
    }
    else {
      iVar6 = unaff_x20[0x4f];
      if ((int)unaff_x20[0x4e] < iVar6) goto code_r0x00782a38;
    }
    lVar19 = 0;
    unaff_x20[0x4e] = 0;
    pcVar20 = (char *)(*(long *)(unaff_x20 + 0x54) + 4);
    do {
      pcVar14 = (char *)(long)(iVar6 - (int)lVar19);
      pcVar15 = (char *)&lStack_290;
      uVar10 = func_0x0077485c(unaff_x19,pcVar20,pcVar14,pcVar15,&uStack_291);
      if ((int)uVar10 != 0) goto code_r0x00782b1c;
      lVar19 = (long)(int)unaff_x20[0x4e] + (long)(int)lStack_290;
      unaff_x20[0x4e] = (int)lVar19;
      pcVar20 = pcVar20 + lStack_290;
      iVar6 = unaff_x20[0x4f];
    } while (lStack_290 != 0 && (int)lVar19 < iVar6);
    pcVar14 = (char *)(lVar19 + 4);
    pcVar15 = &UNK_00080000;
    lVar19 = _sendto(unaff_x20[6],*(undefined8 *)(unaff_x20 + 0x54),pcVar14,0x80000,unaff_x20 + 0x2c
                     ,unaff_x20[0x4c]);
    if (-1 < lVar19) {
      lVar19 = *(long *)(unaff_x19 + 0x100) + (long)(int)unaff_x20[0x4e];
      *(long *)(unaff_x19 + 0x100) = lVar19;
code_r0x00782b10:
      func_0x00770948(unaff_x19,lVar19);
      goto code_r0x00782b18;
    }
code_r0x00782bb8:
    puVar9 = (undefined4 *)___error();
    pcVar14 = "\f";
    uStack_2b0 = func_0x0077ea88(*puVar9,auStack_288,0x100);
    pcVar8 = "%s";
code_r0x00782bec:
    func_0x0073c9e4(unaff_x19,pcVar8);
    uVar10 = 0x37;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_188) {
      return 0x37;
    }
    break;
  case 7:
    uVar18 = unaff_x20[7] + 1;
    unaff_x20[7] = uVar18;
    if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      uStack_2b0 = (ulong)(*(ushort *)(unaff_x20 + 0x51) + 1) & 0xffff;
      uStack_2a8 = (ulong)uVar18;
      func_0x0073cab8(unaff_x19,"Timeout waiting for block %d ACK.  Retries = %d");
      uVar18 = unaff_x20[7];
    }
    if ((int)uVar18 <= (int)unaff_x20[9]) {
      pcVar14 = (char *)((long)(int)unaff_x20[0x4e] + 4);
      pcVar15 = &UNK_00080000;
      lVar19 = _sendto(unaff_x20[6],*(undefined8 *)(unaff_x20 + 0x54),pcVar14,0x80000,
                       unaff_x20 + 0x2c,unaff_x20[0x4c]);
      if (-1 < lVar19) {
        lVar19 = *(long *)(unaff_x19 + 0x100);
        goto code_r0x00782b10;
      }
      goto code_r0x00782bb8;
    }
    unaff_x20[2] = 0xffffff9d;
code_r0x00782a38:
    uVar10 = 0;
    *unaff_x20 = 3;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_188) {
      return 0;
    }
    break;
  default:
    uStack_2b0 = auVar22._8_8_;
    func_0x0073c9e4(unaff_x19,"tftp_tx: internal error, event: %i");
    unaff_x20 = puVar9;
code_r0x00782b18:
    uVar10 = 0;
code_r0x00782b1c:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_188) {
      return uVar10;
    }
  }
  puVar21 = &SUB_00782c14;
  iVar6 = ___stack_chk_fail(uVar10);
  plVar13 = extraout_x1;
code_r0x00782c14:
  *(ulong *)((long)puVar5 + -0x30) = unaff_x22;
  *(char **)((long)puVar5 + -0x28) = pcVar20;
  *(undefined4 **)((long)puVar5 + -0x20) = unaff_x20;
  *(long *)((long)puVar5 + -0x18) = unaff_x19;
  *(undefined1 ***)((long)puVar5 + -0x10) = unaff_x29;
  *(undefined **)((long)puVar5 + -8) = puVar21;
  lVar19 = _strlen(pcVar15);
  if ((ulong)(long)iVar6 < lVar19 + *plVar13 + 1U) {
    return 0x47;
  }
  _strcpy(pcVar14,pcVar15);
  lVar19 = _strlen(pcVar15);
  *plVar13 = lVar19 + *plVar13 + 1;
  return 0;
}

