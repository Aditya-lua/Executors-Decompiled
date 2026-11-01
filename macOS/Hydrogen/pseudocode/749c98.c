
/* WARNING: Possible PIC construction at 0x00747b84: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00747b88) */
/* WARNING: Removing unreachable block (ram,0x00747778) */
/* WARNING: Removing unreachable block (ram,0x00747820) */
/* WARNING: Removing unreachable block (ram,0x00747790) */
/* WARNING: Removing unreachable block (ram,0x007477a0) */
/* WARNING: Removing unreachable block (ram,0x007477a4) */
/* WARNING: Removing unreachable block (ram,0x007477a8) */
/* WARNING: Removing unreachable block (ram,0x007477b4) */
/* WARNING: Removing unreachable block (ram,0x007477bc) */
/* WARNING: Removing unreachable block (ram,0x00747810) */
/* WARNING: Removing unreachable block (ram,0x00747944) */
/* WARNING: Removing unreachable block (ram,0x00747818) */
/* WARNING: Removing unreachable block (ram,0x00747968) */
/* WARNING: Removing unreachable block (ram,0x00747974) */
/* WARNING: Removing unreachable block (ram,0x0074797c) */
/* WARNING: Removing unreachable block (ram,0x00747984) */
/* WARNING: Removing unreachable block (ram,0x00747998) */
/* WARNING: Removing unreachable block (ram,0x007479a0) */
/* WARNING: Removing unreachable block (ram,0x007479c8) */
/* WARNING: Removing unreachable block (ram,0x00747a6c) */
/* WARNING: Removing unreachable block (ram,0x00747a88) */
/* WARNING: Removing unreachable block (ram,0x007479cc) */
/* WARNING: Removing unreachable block (ram,0x00747b0c) */
/* WARNING: Removing unreachable block (ram,0x00747b14) */
/* WARNING: Removing unreachable block (ram,0x00747b1c) */
/* WARNING: Removing unreachable block (ram,0x00747b38) */
/* WARNING: Removing unreachable block (ram,0x00747b98) */
/* WARNING: Removing unreachable block (ram,0x00747ba8) */
/* WARNING: Removing unreachable block (ram,0x00747bb4) */
/* WARNING: Removing unreachable block (ram,0x00747c4c) */
/* WARNING: Removing unreachable block (ram,0x00747c60) */
/* WARNING: Removing unreachable block (ram,0x00747bbc) */
/* WARNING: Removing unreachable block (ram,0x00747bd0) */
/* WARNING: Removing unreachable block (ram,0x00747bd4) */
/* WARNING: Removing unreachable block (ram,0x00747bd8) */
/* WARNING: Removing unreachable block (ram,0x00747c00) */
/* WARNING: Removing unreachable block (ram,0x00747b48) */
/* WARNING: Removing unreachable block (ram,0x00747b54) */
/* WARNING: Removing unreachable block (ram,0x00747b5c) */
/* WARNING: Removing unreachable block (ram,0x00747b74) */
/* WARNING: Removing unreachable block (ram,0x00747c1c) */
/* WARNING: Removing unreachable block (ram,0x00747b80) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00749c98(undefined8 param_1,undefined8 param_2,char *param_3,ulong param_4)

{
  bool bVar1;
  ulong *puVar2;
  char *pcVar3;
  byte bVar4;
  undefined1 *puVar5;
  int iVar6;
  int iVar7;
  uint uVar8;
  uint uVar9;
  long lVar10;
  char *pcVar11;
  undefined4 *puVar12;
  int *piVar13;
  undefined8 uVar14;
  char *pcVar15;
  undefined1 uVar16;
  uint uVar17;
  undefined4 uVar18;
  ulong uVar19;
  long lVar20;
  ulong uVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  undefined8 uVar25;
  undefined8 *puVar26;
  char *pcVar27;
  char cVar28;
  undefined8 uVar29;
  long unaff_x19;
  long lVar30;
  undefined8 uVar31;
  char *unaff_x21;
  undefined8 uVar32;
  undefined8 *unaff_x22;
  undefined8 uVar33;
  long unaff_x23;
  undefined8 uVar34;
  long unaff_x24;
  undefined1 *puVar35;
  long unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  undefined8 uVar36;
  undefined1 auVar37 [16];
  
code_r0x00749c98:
  lVar30 = *(long *)(unaff_x19 + 0x18);
  if (((((ulong)*(byte *)(lVar30 + 0x4f6) != 0x21) && (*(char *)((long)unaff_x22 + 3) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
    *(undefined8 *)register0x00000008 =
         *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar30 + 0x4f6) * 8);
    *(char **)((long)register0x00000008 + 8) = "STOR";
    func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
  }
  uVar16 = 0x21;
LAB_00749d98:
  uVar25 = 0;
  *(undefined1 *)(lVar30 + 0x4f6) = uVar16;
  puVar35 = (undefined1 *)register0x00000008;
LAB_00749e6c:
  puVar5 = puVar35;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return uVar25;
  }
  auVar37 = ___stack_chk_fail(uVar25);
  lVar10 = auVar37._8_8_;
  lVar23 = auVar37._0_8_;
  *(long *)(puVar5 + -0x40) = unaff_x24;
  *(long *)(puVar5 + -0x38) = unaff_x23;
  *(undefined8 **)(puVar5 + -0x30) = unaff_x22;
  *(char **)(puVar5 + -0x28) = unaff_x21;
  *(long *)(puVar5 + -0x20) = lVar30;
  *(long *)(puVar5 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar5 + -0x10) = unaff_x29;
  *(undefined8 *)(puVar5 + -8) = 0x749ef0;
  uVar17 = 0x41;
  if ((int)param_3 == 0) {
    uVar17 = 0x49;
  }
  uVar8 = (uint)param_4;
  uVar16 = (undefined1)param_4;
  if (*(byte *)(lVar10 + 0x4c0) != uVar17) {
    *(ulong *)(puVar5 + -0x50) = (ulong)uVar17;
    uVar25 = func_0x0076e34c(lVar23,lVar10 + 1000,"TYPE %c");
    if ((int)uVar25 != 0) {
      return uVar25;
    }
    lVar30 = *(long *)(lVar23 + 0x18);
    if (((lVar23 != 0) && (bVar4 = *(byte *)(lVar30 + 0x4f6), bVar4 != uVar8)) &&
       (*(char *)(lVar23 + 0xa1d) < '\0')) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar23 + 0x18) == 0) {
        if (iRam0000000000a2b570 < 1) goto LAB_0074a074;
      }
      else if (*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar23 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
      goto LAB_0074a074;
      uVar25 = *(undefined8 *)(&UNK_00a1e570 + (param_4 & 0xffffffff) * 8);
      *(undefined8 *)(puVar5 + -0x50) = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
      *(undefined8 *)(puVar5 + -0x48) = uVar25;
      func_0x0073cfbc(lVar23,"[%s] -> [%s]");
    }
LAB_0074a074:
    *(undefined1 *)(lVar30 + 0x4f6) = uVar16;
    *(char *)(lVar10 + 0x4c0) = (char)uVar17;
    return 0;
  }
  lVar30 = *(long *)(lVar23 + 0x18);
  if (((lVar23 != 0) && (bVar4 = *(byte *)(lVar30 + 0x4f6), bVar4 != uVar8)) &&
     (*(char *)(lVar23 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar23 + 0x18) == 0) {
      if (0 < iRam0000000000a2b570) goto code_r0x00749f6c;
    }
    else if (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar23 + 0x18) + 8) && 0 < iRam0000000000a2b570) {
code_r0x00749f6c:
      uVar25 = *(undefined8 *)(&UNK_00a1e570 + (param_4 & 0xffffffff) * 8);
      *(undefined8 *)(puVar5 + -0x50) = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
      *(undefined8 *)(puVar5 + -0x48) = uVar25;
      func_0x0073cfbc(lVar23,"[%s] -> [%s]");
    }
  }
  *(undefined1 *)(lVar30 + 0x4f6) = uVar16;
  switch(uVar8) {
  case 0x13:
    lVar30 = *(long *)(lVar23 + 0x18);
    uVar34 = *(undefined8 *)(puVar5 + -0x40);
    uVar33 = *(undefined8 *)(puVar5 + -0x38);
    *(undefined8 *)(puVar5 + -0x20) = *(undefined8 *)(puVar5 + -0x20);
    *(undefined8 *)(puVar5 + -0x18) = *(undefined8 *)(puVar5 + -0x18);
    *(undefined8 *)(puVar5 + -0x10) = *(undefined8 *)(puVar5 + -0x10);
    *(undefined8 *)(puVar5 + -8) = *(undefined8 *)(puVar5 + -8);
    if ((*(int *)(*(long *)(lVar23 + 0x1b0) + 0x10) == 1) && (*(long *)(lVar30 + 0x4a0) != 0)) {
      *(long *)(puVar5 + -0x30) = *(long *)(lVar30 + 0x4a0);
      uVar25 = func_0x0076e34c(lVar23,lVar30 + 1000,"SIZE %s");
      if ((int)uVar25 != 0) {
        return uVar25;
      }
      lVar30 = *(long *)(lVar23 + 0x18);
      uVar21 = (ulong)*(byte *)(lVar30 + 0x4f6);
      if ((uVar21 != 0x17) && (*(char *)(lVar23 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0) {
          if (iRam0000000000a2b570 < 1) goto code_r0x0074a210;
        }
        else if (*(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar23 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
        goto code_r0x0074a210;
        *(undefined8 *)(puVar5 + -0x30) = *(undefined8 *)(&UNK_00a1e570 + uVar21 * 8);
        *(char **)(puVar5 + -0x28) = "SIZE";
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
code_r0x0074a210:
      *(undefined1 *)(lVar30 + 0x4f6) = 0x17;
      return 0;
    }
    *(undefined8 *)(puVar5 + -0x20) = *(undefined8 *)(puVar5 + -0x20);
    *(undefined8 *)(puVar5 + -0x18) = *(undefined8 *)(puVar5 + -0x18);
    *(undefined8 *)(puVar5 + -0x10) = *(undefined8 *)(puVar5 + -0x10);
    *(undefined8 *)(puVar5 + -8) = *(undefined8 *)(puVar5 + -8);
    if ((*(int *)(*(long *)(lVar23 + 0x1b0) + 0x10) != 0) && (*(long *)(lVar30 + 0x4a0) != 0)) {
      *(undefined8 *)(puVar5 + -0x30) = 0;
      uVar25 = func_0x0076e34c(lVar23,lVar30 + 1000,"REST %d");
      if ((int)uVar25 != 0) {
        return uVar25;
      }
      lVar30 = *(long *)(lVar23 + 0x18);
      uVar21 = (ulong)*(byte *)(lVar30 + 0x4f6);
      if ((uVar21 != 0x1a) && (*(char *)(lVar23 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0) {
          if (iRam0000000000a2b570 < 1) goto code_r0x0074a310;
        }
        else if (*(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar23 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
        goto code_r0x0074a310;
        *(undefined8 *)(puVar5 + -0x30) = *(undefined8 *)(&UNK_00a1e570 + uVar21 * 8);
        *(char **)(puVar5 + -0x28) = "REST";
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
code_r0x0074a310:
      *(undefined1 *)(lVar30 + 0x4f6) = 0x1a;
      return 0;
    }
    *(undefined8 *)(puVar5 + -0x30) = *(undefined8 *)(puVar5 + -0x30);
    *(undefined8 *)(puVar5 + -0x28) = *(undefined8 *)(puVar5 + -0x28);
    *(undefined8 *)(puVar5 + -0x20) = *(undefined8 *)(puVar5 + -0x20);
    *(undefined8 *)(puVar5 + -0x18) = *(undefined8 *)(puVar5 + -0x18);
    *(undefined8 *)(puVar5 + -0x10) = *(undefined8 *)(puVar5 + -0x10);
    *(undefined8 *)(puVar5 + -8) = *(undefined8 *)(puVar5 + -8);
    lVar30 = *(long *)(lVar23 + 0x18);
    if (*(int *)(*(long *)(lVar23 + 0x1b0) + 0x10) != 0) {
      if (((ulong)*(byte *)(lVar30 + 0x4f6) != 0xd) && (*(char *)(lVar23 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0) {
          if (0 < iRam0000000000a2b570) goto code_r0x0074a3a4;
        }
        else if (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + lVar23 + 0x18) + 8) && 0 < iRam0000000000a2b570) {
code_r0x0074a3a4:
          *(undefined8 *)(puVar5 + -0x40) =
               *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar30 + 0x4f6) * 8);
          *(char **)(puVar5 + -0x38) = "RETR_PREQUOTE";
          func_0x0073cfbc(lVar23,"[%s] -> [%s]");
        }
      }
      *(undefined1 *)(lVar30 + 0x4f6) = 0xd;
      uVar25 = *(undefined8 *)(puVar5 + -0x10);
      uVar36 = *(undefined8 *)(puVar5 + -8);
      uVar14 = *(undefined8 *)(puVar5 + -0x20);
      uVar29 = *(undefined8 *)(puVar5 + -0x18);
      uVar32 = *(undefined8 *)(puVar5 + -0x30);
      uVar31 = *(undefined8 *)(puVar5 + -0x28);
      goto DAT_00747730;
    }
    uVar17 = (uint)*(undefined8 *)(lVar23 + 0xa1a);
    if ((uVar17 >> 0xf & 1) == 0) {
      if ((uVar17 >> 0x12 & 1) == 0) {
        *(undefined8 *)(puVar5 + -0x30) = *(undefined8 *)(puVar5 + -0x30);
        *(undefined8 *)(puVar5 + -0x28) = *(undefined8 *)(puVar5 + -0x28);
        *(undefined8 *)(puVar5 + -0x20) = *(undefined8 *)(puVar5 + -0x20);
        *(undefined8 *)(puVar5 + -0x18) = *(undefined8 *)(puVar5 + -0x18);
        *(undefined8 *)(puVar5 + -0x10) = *(undefined8 *)(puVar5 + -0x10);
        *(undefined8 *)(puVar5 + -8) = *(undefined8 *)(puVar5 + -8);
        uVar21 = *(ulong *)(lVar30 + 0x398);
        if ((uVar21 & 0x8800) == 0x800) {
          uVar21 = uVar21 | 0x8000;
          *(ulong *)(lVar30 + 0x398) = uVar21;
        }
        uVar19 = uVar21 >> 0xf & 1 ^ 1;
        *(undefined **)(puVar5 + -0x40) = &UNK_008cd224 + (uVar19 | uVar19 << 2);
        uVar25 = func_0x0076e34c(lVar23,lVar30 + 1000,"%s");
        if ((int)uVar25 == 0) {
          *(uint *)(lVar30 + 0x4e8) = (uint)((uVar21 & 0x8000) == 0);
          lVar30 = *(long *)(lVar23 + 0x18);
          if (((((lVar23 != 0) && (bVar4 = *(byte *)(lVar30 + 0x4f6), bVar4 != 0x1e)) &&
               (*(char *)(lVar23 + 0xa1d) < '\0')) &&
              ((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + lVar23 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
            *(undefined8 *)(puVar5 + -0x40) = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
            *(char **)(puVar5 + -0x38) = "PASV";
            func_0x0073cfbc(lVar23,"[%s] -> [%s]");
          }
          *(undefined1 *)(lVar30 + 0x4f6) = 0x1e;
          if ((*(char *)(lVar23 + 0xa1d) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + lVar23 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + lVar23 + 0x18) + 8))))) {
            func_0x0073cab8(lVar23,"Connect data stream passively");
            return uVar25;
          }
        }
        return uVar25;
      }
      lVar10 = lVar30 + 1000;
      lVar30 = *(long *)(lVar30 + 0x4a0);
      if (lVar30 == 0) {
        pcVar15 = *(char **)(lVar23 + 0x7c0);
        if ((pcVar15 == (char *)0x0) && (pcVar15 = "LIST", ((&UNK_00001345)[lVar23] & 0x80) != 0)) {
          pcVar15 = "NLST";
        }
        *(char **)(puVar5 + -0x40) = pcVar15;
        uVar25 = func_0x0076e34c(lVar23,lVar10,"PRET %s");
        iVar6 = (int)uVar25;
      }
      else if (((byte)(&UNK_00001346)[lVar23] >> 3 & 1) == 0) {
        *(long *)(puVar5 + -0x40) = lVar30;
        uVar25 = func_0x0076e34c(lVar23,lVar10,"PRET RETR %s");
        iVar6 = (int)uVar25;
      }
      else {
        *(long *)(puVar5 + -0x40) = lVar30;
        uVar25 = func_0x0076e34c(lVar23,lVar10,"PRET STOR %s");
        iVar6 = (int)uVar25;
      }
      if (iVar6 != 0) {
        return uVar25;
      }
      lVar30 = *(long *)(lVar23 + 0x18);
      uVar21 = (ulong)*(byte *)(lVar30 + 0x4f6);
      if ((((uVar21 != 0x1d) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
        *(undefined8 *)(puVar5 + -0x40) = *(undefined8 *)(&UNK_00a1e570 + uVar21 * 8);
        *(char **)(puVar5 + -0x38) = "PRET";
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
      *(undefined1 *)(lVar30 + 0x4f6) = 0x1d;
      return 0;
    }
    *(undefined8 *)(puVar5 + -0x60) = unaff_x28;
    *(undefined8 *)(puVar5 + -0x58) = unaff_x27;
    *(undefined8 *)(puVar5 + -0x50) = unaff_x26;
    *(long *)(puVar5 + -0x48) = unaff_x25;
    *(undefined8 *)(puVar5 + -0x40) = uVar34;
    *(undefined8 *)(puVar5 + -0x38) = uVar33;
    *(undefined8 *)(puVar5 + -0x30) = *(undefined8 *)(puVar5 + -0x30);
    *(undefined8 *)(puVar5 + -0x28) = *(undefined8 *)(puVar5 + -0x28);
    *(undefined8 *)(puVar5 + -0x20) = *(undefined8 *)(puVar5 + -0x20);
    *(undefined8 *)(puVar5 + -0x18) = *(undefined8 *)(puVar5 + -0x18);
    *(undefined8 *)(puVar5 + -0x10) = *(undefined8 *)(puVar5 + -0x10);
    *(undefined8 *)(puVar5 + -8) = *(undefined8 *)(puVar5 + -8);
    iVar6 = 0;
    *(undefined8 *)(puVar5 + -0x78) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    lVar30 = *(long *)(lVar23 + 0x18);
    *(undefined4 *)(puVar5 + -0x6ac) = 0xffffffff;
    *(undefined8 *)(puVar5 + -0x89) = 0;
    *(undefined8 *)(puVar5 + -0x91) = 0;
    *(undefined8 *)(puVar5 + -0xa8) = 0;
    *(undefined8 *)(puVar5 + -0xb0) = 0;
    *(undefined8 *)(puVar5 + -0x98) = 0;
    *(undefined8 *)(puVar5 + -0xa0) = 0;
    pcVar15 = *(char **)(lVar23 + 0x800);
    *(undefined8 *)(puVar5 + -0x6b8) = 0;
    if ((pcVar15 == (char *)0x0) || (uVar21 = _strlen(pcVar15), uVar21 < 2)) {
      uVar17 = 0;
      uVar8 = 0;
code_r0x0074a640:
      *(undefined4 *)(puVar5 + -0x6b0) = 0x80;
      iVar7 = _getsockname(*(undefined4 *)(lVar30 + 0x238),puVar5 + -0x130,puVar5 + -0x6b0);
      if (iVar7 != 0) goto code_r0x0074a65c;
      if (puVar5[-0x12f] == '\x1e') {
        lVar10 = _inet_ntop(0x1e,puVar5 + -0x128,puVar5 + -0x531,0x401);
      }
      else {
        lVar10 = _inet_ntop(puVar5[-0x12f],(ulong)(puVar5 + -0x130) | 4,puVar5 + -0x531,0x401);
      }
      if (lVar10 == 0) goto code_r0x0074a760;
      bVar4 = 0;
code_r0x0074a6c0:
      puVar35 = puVar5 + -0x531;
    }
    else {
      if (*pcVar15 == ':') {
        uVar21 = 0;
        pcVar27 = (char *)0x0;
        pcVar11 = pcVar15;
code_r0x0074a90c:
        lVar10 = _strchr(pcVar11,0x3a);
        pcVar15 = pcVar27;
        if (lVar10 == 0) {
          uVar8 = 0;
          uVar17 = 0;
        }
        else {
          _strtoul(lVar10 + 1,0,10);
          uVar8 = func_0x0078bbc8();
          lVar10 = _strchr(lVar10,0x2d);
          uVar17 = uVar8;
          if (lVar10 != 0) {
            _strtoul(lVar10 + 1,0,10);
            uVar9 = func_0x0078bbc8();
            uVar17 = 0;
            if (uVar8 <= uVar9) {
              uVar17 = uVar8;
            }
            bVar1 = uVar8 <= uVar9;
            uVar8 = 0;
            if (bVar1) {
              uVar8 = uVar9;
            }
          }
        }
joined_r0x0074a980:
        if (uVar21 == 0) goto code_r0x0074a640;
      }
      else {
        if (*pcVar15 == '[') {
          pcVar27 = pcVar15 + 1;
          pcVar11 = (char *)_strchr(pcVar27,0x5d);
          if (pcVar11 == (char *)0x0) {
            uVar17 = 0;
            uVar8 = 0;
            goto code_r0x0074a640;
          }
          uVar21 = (long)pcVar11 - (long)pcVar27;
          goto code_r0x0074a90c;
        }
        pcVar11 = (char *)_strchr(pcVar15,0x3a);
        if (pcVar11 != (char *)0x0) {
          uVar21 = (long)pcVar11 - (long)pcVar15;
          iVar7 = _inet_pton(0x1e,pcVar15,puVar5 + -0x128);
          pcVar27 = pcVar15;
          if (iVar7 != 1) goto code_r0x0074a90c;
          uVar8 = 0;
          uVar17 = uVar8;
          goto joined_r0x0074a980;
        }
        uVar8 = 0;
        uVar17 = 0;
      }
      if (0x31 < uVar21) goto code_r0x0074a760;
      puVar35 = puVar5 + -0x663;
      ___memcpy_chk(puVar5 + -0x663,pcVar15,uVar21,0x32);
      puVar35[uVar21] = 0;
      uVar18 = **(undefined4 **)(lVar30 + 0x50);
      uVar25 = func_0x0075af24(*(undefined4 **)(lVar30 + 0x50) + 4);
      iVar7 = func_0x0075b008(uVar18,uVar25,*(undefined4 *)(lVar30 + 0x520),puVar5 + -0x663,
                              puVar5 + -0x531,0x401);
      if (iVar7 != 0) {
        if (iVar7 != 1) {
          if (iVar7 != 2) goto code_r0x0074a640;
          bVar4 = 1;
          goto code_r0x0074a6c0;
        }
        goto code_r0x0074a760;
      }
      bVar4 = 1;
    }
    iVar7 = func_0x0074f754(lVar23,puVar35,0,0,puVar5 + -0x6b8);
    if (iVar7 == 1) {
      func_0x00728b3c(lVar23,puVar5 + -0x6b8);
    }
    if ((*(long **)(puVar5 + -0x6b8) != (long *)0x0) &&
       (lVar10 = **(long **)(puVar5 + -0x6b8), lVar10 != 0)) {
      goto code_r0x0074a704;
    }
    *(undefined1 **)(puVar5 + -0x6e0) = puVar35;
    pcVar15 = "failed to resolve the address provided to PORT: %s";
    goto code_r0x0074a758;
  case 0x14:
    *(undefined8 *)(puVar5 + -0x40) = *(undefined8 *)(puVar5 + -0x40);
    *(undefined8 *)(puVar5 + -0x38) = *(undefined8 *)(puVar5 + -0x38);
    *(undefined8 *)(puVar5 + -0x30) = *(undefined8 *)(puVar5 + -0x30);
    *(undefined8 *)(puVar5 + -0x28) = *(undefined8 *)(puVar5 + -0x28);
    *(undefined8 *)(puVar5 + -0x20) = *(undefined8 *)(puVar5 + -0x20);
    *(undefined8 *)(puVar5 + -0x18) = *(undefined8 *)(puVar5 + -0x18);
    *(undefined8 *)(puVar5 + -0x10) = *(undefined8 *)(puVar5 + -0x10);
    *(undefined8 *)(puVar5 + -8) = *(undefined8 *)(puVar5 + -8);
    lVar30 = *(long *)(lVar23 + 0x18);
    if ((*(char *)(lVar23 + 0x6bc) == '\x02') && (lVar10 = **(long **)(lVar23 + 0x1b0), lVar10 != 0)
       ) {
      *(undefined8 *)(puVar5 + -0x48) = 0;
      uVar25 = func_0x00742734(lVar10,0,puVar5 + -0x48,0,3);
      if ((int)uVar25 != 0) {
        return uVar25;
      }
      pcVar15 = *(char **)(puVar5 + -0x48);
      lVar10 = _strrchr(pcVar15,0x2f);
      if (lVar10 != 0) {
        lVar10 = lVar10 - (long)pcVar15;
        if (lVar10 == 0) {
          lVar10 = 1;
        }
        pcVar15[lVar10] = '\0';
        pcVar27 = *(char **)(lVar23 + 0x7c0);
        goto joined_r0x0074b00c;
      }
      (*pcRam0000000000a2b5f0)(pcVar15);
    }
    pcVar15 = (char *)0x0;
    pcVar27 = *(char **)(lVar23 + 0x7c0);
joined_r0x0074b00c:
    if ((pcVar27 == (char *)0x0) && (pcVar27 = "LIST", ((&UNK_00001345)[lVar23] & 0x80) != 0)) {
      pcVar27 = "NLST";
    }
    pcVar11 = "";
    if (pcVar15 != (char *)0x0) {
      pcVar11 = " ";
    }
    pcVar3 = "";
    if (pcVar15 != (char *)0x0) {
      pcVar3 = pcVar15;
    }
    *(char **)(puVar5 + -0x58) = pcVar11;
    *(char **)(puVar5 + -0x50) = pcVar3;
    *(char **)(puVar5 + -0x60) = pcVar27;
    lVar10 = func_0x00764704("%s%s%s");
    (*pcRam0000000000a2b5f0)(pcVar15);
    if (lVar10 == 0) {
      uVar25 = 0x1b;
    }
    else {
      *(long *)(puVar5 + -0x60) = lVar10;
      uVar25 = func_0x0076e34c(lVar23,lVar30 + 1000,"%s");
      (*pcRam0000000000a2b5f0)(lVar10);
      if ((int)uVar25 == 0) {
        lVar30 = *(long *)(lVar23 + 0x18);
        uVar21 = (ulong)*(byte *)(lVar30 + 0x4f6);
        if ((((uVar21 != 0x1f) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
            ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + lVar23 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
          *(undefined8 *)(puVar5 + -0x60) = *(undefined8 *)(&UNK_00a1e570 + uVar21 * 8);
          *(char **)(puVar5 + -0x58) = "LIST";
          func_0x0073cfbc(lVar23,"[%s] -> [%s]");
        }
        uVar25 = 0;
        *(undefined1 *)(lVar30 + 0x4f6) = 0x1f;
      }
    }
    return uVar25;
  case 0x15:
    uVar25 = *(undefined8 *)(puVar5 + -0x10);
    uVar36 = *(undefined8 *)(puVar5 + -8);
    uVar14 = *(undefined8 *)(puVar5 + -0x20);
    uVar29 = *(undefined8 *)(puVar5 + -0x18);
    uVar32 = *(undefined8 *)(puVar5 + -0x30);
    uVar31 = *(undefined8 *)(puVar5 + -0x28);
    uVar34 = *(undefined8 *)(puVar5 + -0x40);
    uVar33 = *(undefined8 *)(puVar5 + -0x38);
DAT_00747730:
    *(undefined8 *)(puVar5 + -0x30) = uVar32;
    *(undefined8 *)(puVar5 + -0x28) = uVar31;
    *(undefined8 *)(puVar5 + -0x20) = uVar14;
    *(undefined8 *)(puVar5 + -0x18) = uVar29;
    *(undefined8 *)(puVar5 + -0x10) = uVar25;
    *(undefined8 *)(puVar5 + -8) = uVar36;
    lVar10 = *(long *)(lVar23 + 0x1b0);
    lVar24 = *(long *)(lVar23 + 0x18);
    lVar30 = lVar24 + 1000;
    puVar26 = *(undefined8 **)(lVar23 + 0x6d0);
    *(undefined4 *)(lVar24 + 0x4e8) = 0;
    if (puVar26 != (undefined8 *)0x0) {
      pcVar27 = (char *)*puVar26;
      pcVar15 = pcVar27;
      if (*pcVar27 == '*') {
        pcVar15 = pcVar27 + 1;
      }
      *(uint *)(lVar24 + 0x4ec) = (uint)(*pcVar27 == '*');
      *(char **)(puVar5 + -0x40) = pcVar15;
      uVar25 = func_0x0076e34c(lVar23,lVar30,"%s");
      if ((int)uVar25 != 0) {
        return uVar25;
      }
      lVar30 = *(long *)(lVar23 + 0x18);
      if (((((lVar23 != 0) && (bVar4 = *(byte *)(lVar30 + 0x4f6), bVar4 != 0xd)) &&
           (*(char *)(lVar23 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
        *(undefined8 *)(puVar5 + -0x40) = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
        *(undefined8 *)(puVar5 + -0x38) = _UNK_00a1e5d8;
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
      *(undefined1 *)(lVar30 + 0x4f6) = 0xd;
      return 0;
    }
    if (*(int *)(lVar10 + 0x10) != 0) {
      if (((lVar23 != 0) && (*(byte *)(lVar24 + 0x4f6) != 0)) &&
         ((*(char *)(lVar23 + 0xa1d) < '\0' &&
          (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      lVar23 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar23 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))))) {
        *(undefined8 *)(puVar5 + -0x40) =
             *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar24 + 0x4f6) * 8);
        *(char **)(puVar5 + -0x38) = "STOP";
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
      *(undefined1 *)(lVar24 + 0x4f6) = 0;
      return 0;
    }
    if (*(long *)(lVar24 + 0x4d8) == -1) {
      if (((*(byte *)(lVar23 + 0xa1e) >> 4 & 1) == 0) &&
         (((byte)(&UNK_00001345)[lVar23] >> 6 & 1) == 0)) {
        *(undefined8 *)(puVar5 + -0x40) = *(undefined8 *)(lVar24 + 0x4a0);
        uVar25 = func_0x0076e34c(lVar23,lVar30,"SIZE %s");
        if ((int)uVar25 != 0) {
          return uVar25;
        }
        uVar25 = 0x18;
      }
      else {
        *(undefined8 *)(puVar5 + -0x40) = *(undefined8 *)(lVar24 + 0x4a0);
        uVar25 = func_0x0076e34c(lVar23,lVar30,"RETR %s");
        if ((int)uVar25 != 0) {
          return uVar25;
        }
        uVar25 = 0x20;
      }
      func_0x007466c4(lVar23,uVar25);
      return 0;
    }
    func_0x00770554(lVar23,*(long *)(lVar24 + 0x4d8));
    lVar30 = *(long *)(lVar24 + 0x4d8);
    *(undefined8 *)(puVar5 + -0x40) = uVar34;
    *(undefined8 *)(puVar5 + -0x38) = uVar33;
    *(undefined8 *)(puVar5 + -0x30) = *(undefined8 *)(puVar5 + -0x30);
    *(undefined8 *)(puVar5 + -0x28) = *(undefined8 *)(puVar5 + -0x28);
    *(undefined8 *)(puVar5 + -0x20) = *(undefined8 *)(puVar5 + -0x20);
    *(undefined8 *)(puVar5 + -0x18) = *(undefined8 *)(puVar5 + -0x18);
    *(undefined8 *)(puVar5 + -0x10) = *(undefined8 *)(puVar5 + -0x10);
    *(undefined8 *)(puVar5 + -8) = *(undefined8 *)(puVar5 + -8);
    lVar10 = *(long *)(lVar23 + 0x1b0);
    lVar24 = *(long *)(lVar23 + 0x18);
    if (*(char *)(lVar23 + 0xa1d) < '\0') {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar23 + 0x18) == 0) {
        if (0 < iRam0000000000a2b570) goto code_r0x007497a0;
        goto code_r0x00749750;
      }
      if (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + lVar23 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
      goto code_r0x00749750;
code_r0x007497a0:
      if (lVar24 == 0) {
        pcVar15 = "???";
      }
      else {
        pcVar15 = *(char **)(&UNK_00a1e570 + (ulong)*(byte *)(lVar24 + 0x4f6) * 8);
      }
      *(char **)(puVar5 + -0x50) = pcVar15;
      func_0x0073cfbc(lVar23,"[%s] ftp_state_retr()");
      if (*(long *)(lVar23 + 0x6b0) != 0 && *(long *)(lVar23 + 0x6b0) < lVar30)
      goto code_r0x00749910;
    }
    else {
code_r0x00749750:
      if (*(long *)(lVar23 + 0x6b0) != 0 && *(long *)(lVar23 + 0x6b0) < lVar30) {
code_r0x00749910:
        func_0x0073c9e4(lVar23,"Maximum file size exceeded");
        return 0x3f;
      }
    }
    *(long *)(lVar10 + 0x18) = lVar30;
    lVar20 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + lVar23);
    if (lVar20 == 0) {
      *(undefined8 *)(puVar5 + -0x50) = *(undefined8 *)(lVar24 + 0x4a0);
      uVar25 = func_0x0076e34c(lVar23,lVar24 + 1000,"RETR %s");
      if ((int)uVar25 != 0) {
        return uVar25;
      }
      lVar30 = *(long *)(lVar23 + 0x18);
      if (((((ulong)*(byte *)(lVar30 + 0x4f6) != 0x20) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
        *(undefined8 *)(puVar5 + -0x50) =
             *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar30 + 0x4f6) * 8);
        *(char **)(puVar5 + -0x48) = "RETR";
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
      uVar16 = 0x20;
      goto code_r0x00749abc;
    }
    if (lVar30 == -1) {
      if ((*(char *)(lVar23 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    lVar23 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar23 + 0x18) + 8))))) {
        func_0x0073cab8(lVar23,"ftp server does not support SIZE");
        lVar22 = *(long *)(lVar10 + 0x18);
        goto joined_r0x00749820;
      }
    }
    else if (lVar20 < 0) {
      if (-lVar30 != lVar20 && lVar30 <= -lVar20) goto code_r0x00749948;
      *(long *)(lVar10 + 0x18) = -lVar20;
      *(long *)((long)&dylib_command_00001108.dylib.name.offset + lVar23) = lVar20 + lVar30;
    }
    else {
      lVar22 = lVar30 - lVar20;
      if (lVar30 < lVar20) {
code_r0x00749948:
        *(long *)(puVar5 + -0x50) = lVar20;
        *(long *)(puVar5 + -0x48) = lVar30;
        func_0x0073c9e4(lVar23,"Offset (%ld) was beyond file size (%ld)");
        return 0x24;
      }
      *(long *)(lVar10 + 0x18) = lVar22;
joined_r0x00749820:
      if (lVar22 == 0) {
        func_0x00783c98(lVar23);
        if ((*(char *)(lVar23 + 0xa1d) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      lVar23 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar23 + 0x18) + 8))))) {
          func_0x0073cab8(lVar23,"File already completely downloaded");
        }
        *(undefined4 *)(lVar10 + 0x10) = 2;
        lVar30 = *(long *)(lVar23 + 0x18);
        uVar21 = (ulong)*(byte *)(lVar30 + 0x4f6);
        if (((uVar21 != 0) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
           (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + lVar23 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + lVar23 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
          *(undefined8 *)(puVar5 + -0x50) = *(undefined8 *)(&UNK_00a1e570 + uVar21 * 8);
          *(char **)(puVar5 + -0x48) = "STOP";
          func_0x0073cfbc(lVar23,"[%s] -> [%s]");
        }
        *(undefined1 *)(lVar30 + 0x4f6) = 0;
        return 0;
      }
    }
    if ((*(char *)(lVar23 + 0xa1d) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  lVar23 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + lVar23 + 0x18) + 8))))) {
      *(undefined8 *)(puVar5 + -0x50) =
           *(undefined8 *)((long)&dylib_command_00001108.dylib.name.offset + lVar23);
      func_0x0073cab8(lVar23,"Instructs server to resume from offset %ld");
    }
    *(undefined8 *)(puVar5 + -0x50) =
         *(undefined8 *)((long)&dylib_command_00001108.dylib.name.offset + lVar23);
    uVar25 = func_0x0076e34c(lVar23,lVar24 + 1000,"REST %ld");
    if ((int)uVar25 != 0) {
      return uVar25;
    }
    lVar30 = *(long *)(lVar23 + 0x18);
    if (((((ulong)*(byte *)(lVar30 + 0x4f6) != 0x1b) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar23 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
      *(undefined8 *)(puVar5 + -0x50) =
           *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar30 + 0x4f6) * 8);
      *(char **)(puVar5 + -0x48) = "RETR_REST";
      func_0x0073cfbc(lVar23,"[%s] -> [%s]");
    }
    uVar16 = 0x1b;
code_r0x00749abc:
    *(undefined1 *)(lVar30 + 0x4f6) = uVar16;
    return 0;
  case 0x16:
    break;
  default:
    return 0;
  }
  uVar25 = *(undefined8 *)(puVar5 + -0x30);
  unaff_x21 = *(char **)(puVar5 + -0x28);
  uVar14 = *(undefined8 *)(puVar5 + -0x40);
  uVar32 = *(undefined8 *)(puVar5 + -0x38);
  *(undefined8 *)(puVar5 + -0x20) = *(undefined8 *)(puVar5 + -0x20);
  *(undefined8 *)(puVar5 + -0x18) = *(undefined8 *)(puVar5 + -0x18);
  *(undefined8 *)(puVar5 + -0x10) = *(undefined8 *)(puVar5 + -0x10);
  *(undefined8 *)(puVar5 + -8) = *(undefined8 *)(puVar5 + -8);
  lVar30 = *(long *)(lVar23 + 0x18);
  puVar26 = *(undefined8 **)(lVar23 + 0x6d0);
  *(undefined4 *)(lVar30 + 0x4e8) = 0;
  if (puVar26 != (undefined8 *)0x0) {
    pcVar27 = (char *)*puVar26;
    pcVar15 = pcVar27;
    if (*pcVar27 == '*') {
      pcVar15 = pcVar27 + 1;
    }
    *(uint *)(lVar30 + 0x4ec) = (uint)(*pcVar27 == '*');
    *(char **)(puVar5 + -0x30) = pcVar15;
    uVar25 = func_0x0076e34c(lVar23,lVar30 + 1000,"%s");
    if ((int)uVar25 != 0) {
      return uVar25;
    }
    lVar30 = *(long *)(lVar23 + 0x18);
    uVar21 = (ulong)*(byte *)(lVar30 + 0x4f6);
    if ((uVar21 != 0xe) && (*(char *)(lVar23 + 0xa1d) < '\0')) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar23 + 0x18) == 0) {
        if (iRam0000000000a2b570 < 1) goto code_r0x0074b240;
      }
      else if (*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar23 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
      goto code_r0x0074b240;
      *(undefined8 *)(puVar5 + -0x30) = *(undefined8 *)(&UNK_00a1e570 + uVar21 * 8);
      *(char **)(puVar5 + -0x28) = "STOR_PREQUOTE";
      func_0x0073cfbc(lVar23,"[%s] -> [%s]");
    }
code_r0x0074b240:
    *(undefined1 *)(lVar30 + 0x4f6) = 0xe;
    return 0;
  }
  *(undefined8 *)(puVar5 + -0x50) = unaff_x26;
  *(long *)(puVar5 + -0x48) = unaff_x25;
  *(undefined8 *)(puVar5 + -0x40) = uVar14;
  *(undefined8 *)(puVar5 + -0x38) = uVar32;
  *(undefined8 *)(puVar5 + -0x30) = uVar25;
  *(char **)(puVar5 + -0x28) = unaff_x21;
  *(undefined8 *)(puVar5 + -0x20) = *(undefined8 *)(puVar5 + -0x20);
  *(undefined8 *)(puVar5 + -0x18) = *(undefined8 *)(puVar5 + -0x18);
  *(undefined8 *)(puVar5 + -0x10) = *(undefined8 *)(puVar5 + -0x10);
  *(undefined8 *)(puVar5 + -8) = *(undefined8 *)(puVar5 + -8);
  unaff_x29 = puVar5 + -0x10;
  auVar37 = (*(code *)PTR____chkstk_darwin_009b01d8)(lVar23,0);
  unaff_x19 = auVar37._0_8_;
  register0x00000008 = (BADSPACEBASE *)(puVar5 + -0x1070);
  *(undefined8 *)(puVar5 + -0x58) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  unaff_x24 = *(long *)(unaff_x19 + 0x18);
  unaff_x23 = *(long *)(unaff_x19 + 0x1b0);
  lVar30 = unaff_x24 + 1000;
  unaff_x22 = (undefined8 *)(unaff_x19 + 0xa1a);
  lVar23 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19);
  if (lVar23 == 0 || auVar37._8_4_ != 0) {
    if ((0 < lVar23) && ((auVar37._8_8_ & 1) != 0)) goto code_r0x00749bc0;
    if (((uint)*unaff_x22 >> 0xd & 1) != 0) goto code_r0x00749c78;
    param_3 = "STOR %s";
    *(undefined8 *)(puVar5 + -0x1070) = *(undefined8 *)(unaff_x24 + 0x4a0);
    uVar25 = func_0x0076e34c(unaff_x19,lVar30);
    iVar6 = (int)uVar25;
joined_r0x00749bb4:
    register0x00000008 = (BADSPACEBASE *)(puVar5 + -0x1070);
    puVar35 = (undefined1 *)register0x00000008;
    if (iVar6 == 0) goto code_r0x00749c98;
    goto LAB_00749e6c;
  }
  if (-1 < lVar23) {
code_r0x00749bc0:
    if (*(long *)(unaff_x19 + 0x218) != 0) {
      func_0x0076bad4(unaff_x19,1);
      param_3 = (char *)0x0;
      unaff_x21 = (char *)(**(code **)(unaff_x19 + 0x218))
                                    (*(undefined8 *)(unaff_x19 + 0x2a8),
                                     *(undefined8 *)
                                      ((long)&dylib_command_00001108.dylib.name.offset + unaff_x19))
      ;
      func_0x0076bad4(unaff_x19,0);
      if ((int)unaff_x21 != 0) {
        if ((int)unaff_x21 != 2) {
          pcVar15 = "Could not seek stream";
code_r0x00749e60:
          func_0x0073c9e4(unaff_x19,pcVar15);
          uVar25 = 0x1f;
          puVar35 = puVar5 + -0x1070;
          goto LAB_00749e6c;
        }
        unaff_x25 = 0;
        lVar23 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19);
        do {
          if (lVar23 - unaff_x25 < 0x1001) {
            unaff_x21 = (char *)func_0x00093e00();
          }
          else {
            unaff_x21 = "Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation";
          }
          param_4 = *(ulong *)(
                              "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                              + unaff_x19 + 0x40);
          param_3 = unaff_x21;
          lVar10 = (**(code **)(
                               "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                               + unaff_x19 + 0x38))(puVar5 + -0x1058,1);
          if (unaff_x21 <= (char *)(lVar10 + -1)) {
            pcVar15 = "Failed to read data";
            goto code_r0x00749e60;
          }
          lVar23 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19);
          unaff_x25 = lVar10 + unaff_x25;
        } while (unaff_x25 < lVar23);
      }
    }
    lVar23 = *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
                      unaff_x19 + 0x30);
    if ((lVar23 < 1) ||
       (lVar24 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19),
       lVar10 = lVar23 - lVar24,
       *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
                unaff_x19 + 0x30) = lVar10, lVar10 != 0 && lVar24 <= lVar23)) {
code_r0x00749c78:
      param_3 = "APPE %s";
      *(undefined8 *)(puVar5 + -0x1070) = *(undefined8 *)(unaff_x24 + 0x4a0);
      uVar25 = func_0x0076e34c(unaff_x19,lVar30);
      iVar6 = (int)uVar25;
      goto joined_r0x00749bb4;
    }
    if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8(unaff_x19,"File already completely uploaded");
    }
    func_0x00783c98(unaff_x19);
    *(undefined4 *)(unaff_x23 + 0x10) = 2;
    lVar30 = *(long *)(unaff_x19 + 0x18);
    if (((((ulong)*(byte *)(lVar30 + 0x4f6) != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
      *(undefined8 *)(puVar5 + -0x1070) =
           *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar30 + 0x4f6) * 8);
      *(char **)(puVar5 + -0x1068) = "STOP";
      func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
    }
    uVar25 = 0;
    *(undefined1 *)(lVar30 + 0x4f6) = 0;
    puVar35 = puVar5 + -0x1070;
    goto LAB_00749e6c;
  }
  *(undefined8 *)(puVar5 + -0x1070) = *(undefined8 *)(unaff_x24 + 0x4a0);
  param_3 = "SIZE %s";
  uVar25 = func_0x0076e34c(unaff_x19,lVar30);
  puVar35 = puVar5 + -0x1070;
  if ((int)uVar25 == 0) goto code_r0x00749d2c;
  goto LAB_00749e6c;
code_r0x00749d2c:
  lVar30 = *(long *)(unaff_x19 + 0x18);
  if (((ulong)*(byte *)(lVar30 + 0x4f6) != 0x19) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b570 < 1) goto code_r0x00749d90;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto code_r0x00749d90;
    *(undefined8 *)(puVar5 + -0x1070) =
         *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar30 + 0x4f6) * 8);
    *(char **)(puVar5 + -0x1068) = "STOR_SIZE";
    func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
  }
code_r0x00749d90:
  uVar16 = 0x19;
  goto LAB_00749d98;
  while( true ) {
    puVar12 = (undefined4 *)___error();
    lVar10 = *(long *)(lVar10 + 0x28);
    if (lVar10 == 0) break;
code_r0x0074a704:
    iVar7 = func_0x0072d954(lVar23,lVar10,0,*(undefined1 *)(lVar30 + 0x52a),puVar5 + -0x6ac);
    if (iVar7 == 0) {
      if ((lVar23 != 0) && (*(char *)(lVar23 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0) {
          if (0 < iRam0000000000a2b570) goto code_r0x0074aab4;
        }
        else {
          bVar1 = *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + lVar23 + 0x18) + 8) < 1;
          if ((!bVar1 && iRam0000000000a2b570 != 0) && (bVar1 || -1 < iRam0000000000a2b570)) {
code_r0x0074aab4:
            if (*(long *)(lVar23 + 0x18) == 0) {
              pcVar15 = "???";
            }
            else {
              pcVar15 = *(char **)(&UNK_00a1e570 +
                                  (ulong)*(byte *)(*(long *)(lVar23 + 0x18) + 0x4f6) * 8);
            }
            *(char **)(puVar5 + -0x6e0) = pcVar15;
            func_0x0073cfbc(lVar23,"[%s] ftp_state_use_port(), opened socket");
          }
        }
      }
      *(long *)(puVar5 + -0x6c0) = lVar30 + 1000;
      ___memcpy_chk(puVar5 + -0x130,*(undefined8 *)(lVar10 + 0x20),*(undefined4 *)(lVar10 + 0x10),
                    0x80);
      *(undefined4 *)(puVar5 + -0x6b0) = *(undefined4 *)(lVar10 + 0x10);
      if (uVar8 < uVar17) goto code_r0x0074ab18;
      uVar9 = uVar17;
      goto code_r0x0074ab3c;
    }
  }
code_r0x0074a72c:
  uVar25 = func_0x0077ea88(*puVar12,puVar5 + -0x631,0x100);
  *(undefined8 *)(puVar5 + -0x6e0) = uVar25;
  pcVar15 = "socket failure: %s";
  goto code_r0x0074a758;
code_r0x0074adf0:
  do {
    if ((iVar6 != 0) || ((uVar21 & 0x10000) != 0)) {
      if ((iVar6 == 1) && (cVar28 != '\x02')) break;
      if ((cVar28 == '\x1e') || (cVar28 == '\x02')) {
        if (iVar6 == 0) {
          *(undefined1 **)(puVar5 + -0x6d0) = puVar5 + -0xb0;
          *(ulong *)(puVar5 + -0x6c8) = (ulong)(uVar17 | uVar8 << 8);
          uVar25 = 1;
          if (cVar28 != '\x02') {
            uVar25 = 2;
          }
          *(undefined **)(puVar5 + -0x6e0) = &UNK_008cd202;
          *(undefined8 *)(puVar5 + -0x6d8) = uVar25;
          uVar25 = func_0x0076e34c(lVar23,*(undefined8 *)(puVar5 + -0x6c0),"%s |%d|%s|%hu|");
          if ((int)uVar25 != 0) {
            uVar14 = func_0x0077e9f4();
            *(undefined8 *)(puVar5 + -0x6e0) = uVar14;
            pcVar15 = "Failure sending EPRT command: %s";
            goto code_r0x0074af00;
          }
          uVar18 = 0;
          goto code_r0x0074ad94;
        }
        if (iVar6 == 1) {
          lVar10 = 0;
          goto code_r0x0074ae40;
        }
      }
    }
    iVar6 = iVar6 + 1;
  } while (iVar6 != 2);
  uVar18 = 2;
code_r0x0074ad94:
  *(undefined4 *)(lVar30 + 0x4e8) = uVar18;
  func_0x007466c4(lVar23,0x1c);
  uVar25 = func_0x0072f958(lVar23,lVar30,1,puVar5 + -0x6ac);
  if ((int)uVar25 == 0) {
    *(undefined4 *)(puVar5 + -0x6ac) = 0xffffffff;
  }
  goto code_r0x0074a764;
code_r0x0074ae40:
  cVar28 = puVar5[lVar10 + -0xb0];
  if (cVar28 == '.') {
    cVar28 = ',';
  }
  else if (cVar28 == '\0') goto code_r0x0074ae50;
  puVar5[lVar10 + -0x6a6] = cVar28;
  lVar10 = lVar10 + 1;
  goto code_r0x0074ae40;
code_r0x0074ae50:
  puVar35 = puVar5 + -0x6a6;
  puVar35[lVar10] = 0;
  *(ulong *)(puVar5 + -0x6e0) = (ulong)uVar8;
  *(ulong *)(puVar5 + -0x6d8) = (ulong)uVar17;
  func_0x00764560(puVar35 + lVar10,0x14,",%d,%d");
  *(undefined **)(puVar5 + -0x6e0) = &UNK_008cd207;
  *(undefined1 **)(puVar5 + -0x6d8) = puVar35;
  uVar25 = func_0x0076e34c(lVar23,*(undefined8 *)(puVar5 + -0x6c0),"%s %s");
  if ((int)uVar25 != 0) {
    uVar14 = func_0x0077e9f4();
    *(undefined8 *)(puVar5 + -0x6e0) = uVar14;
    pcVar15 = "Failure sending PORT command: %s";
code_r0x0074af00:
    func_0x0073c9e4(lVar23,pcVar15);
    goto code_r0x0074a764;
  }
  uVar18 = 1;
  goto code_r0x0074ad94;
code_r0x0074a65c:
  puVar12 = (undefined4 *)___error();
  uVar25 = func_0x0077ea88(*puVar12,puVar5 + -0x631,0x100);
  *(undefined8 *)(puVar5 + -0x6e0) = uVar25;
  pcVar15 = "getsockname() failed: %s";
  goto code_r0x0074a758;
  while( true ) {
    piVar13 = (int *)___error();
    iVar7 = *piVar13;
    if ((bool)(bVar4 & iVar7 == 0x31)) {
      if (((lVar23 != 0) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    lVar23 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar23 + 0x18) + 8))))) {
        uVar25 = func_0x0077ea88(0x31,puVar5 + -0x631,0x100);
        *(ulong *)(puVar5 + -0x6e0) = uVar21;
        *(undefined8 *)(puVar5 + -0x6d8) = uVar25;
        func_0x0073cab8(lVar23,"bind(port=%hu) on non-local address failed: %s");
      }
      *(undefined4 *)(puVar5 + -0x6b0) = 0x80;
      iVar7 = _getsockname(*(undefined4 *)(lVar30 + 0x238),puVar5 + -0x130,puVar5 + -0x6b0);
      if (iVar7 != 0) goto code_r0x0074a65c;
      bVar4 = 0;
      uVar9 = uVar17;
    }
    else {
      if ((iVar7 != 0xd) && (iVar7 != 0x30)) {
        uVar25 = func_0x0077ea88(iVar7,puVar5 + -0x631,0x100);
        *(ulong *)(puVar5 + -0x6e0) = uVar21;
        *(undefined8 *)(puVar5 + -0x6d8) = uVar25;
        pcVar15 = "bind(port=%hu) failed: %s";
        goto code_r0x0074a758;
      }
      uVar9 = (uVar9 & 0xffff) + 1;
    }
    if (uVar8 < (uVar9 & 0xffff)) break;
code_r0x0074ab3c:
    uVar21 = (ulong)(uVar9 & 0xffff);
    *(ushort *)(puVar5 + -0x12e) = (ushort)(uVar9 >> 8) & 0xff | (ushort)((uVar9 & 0xff00ff) << 8);
    iVar7 = _bind(*(undefined4 *)(puVar5 + -0x6ac),puVar5 + -0x130,*(undefined4 *)(puVar5 + -0x6b0))
    ;
    if (iVar7 == 0) {
      *(undefined4 *)(puVar5 + -0x6b0) = 0x80;
      iVar7 = _getsockname(*(undefined4 *)(puVar5 + -0x6ac),puVar5 + -0x130,puVar5 + -0x6b0);
      if (iVar7 != 0) goto code_r0x0074a65c;
      if (lVar23 == 0) {
        iVar7 = _listen(*(undefined4 *)(puVar5 + -0x6ac),1);
        if (iVar7 == 0) goto code_r0x0074ad5c;
      }
      else {
        if (*(char *)(lVar23 + 0xa1d) < '\0') {
          if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + lVar23 + 0x18) == 0) {
            if (0 < iRam0000000000a2b570) goto code_r0x0074ac8c;
          }
          else {
            bVar1 = *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + lVar23 + 0x18) + 8) < 1;
            if ((!bVar1 && iRam0000000000a2b570 != 0) && (bVar1 || -1 < iRam0000000000a2b570)) {
code_r0x0074ac8c:
              if (*(long *)(lVar23 + 0x18) == 0) {
                pcVar15 = "???";
              }
              else {
                pcVar15 = *(char **)(&UNK_00a1e570 +
                                    (ulong)*(byte *)(*(long *)(lVar23 + 0x18) + 0x4f6) * 8);
              }
              *(char **)(puVar5 + -0x6e0) = pcVar15;
              *(ulong *)(puVar5 + -0x6d8) = uVar21;
              func_0x0073cfbc(lVar23,"[%s] ftp_state_use_port(), socket bound to port %d");
            }
          }
        }
        iVar7 = _listen(*(undefined4 *)(puVar5 + -0x6ac),1);
        if (iVar7 == 0) {
          if ((*(char *)(lVar23 + 0xa1d) < '\0') &&
             (((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + lVar23 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + lVar23 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
            if (*(long *)(lVar23 + 0x18) == 0) {
              pcVar15 = "???";
            }
            else {
              pcVar15 = *(char **)(&UNK_00a1e570 +
                                  (ulong)*(byte *)(*(long *)(lVar23 + 0x18) + 0x4f6) * 8);
            }
            *(char **)(puVar5 + -0x6e0) = pcVar15;
            *(ulong *)(puVar5 + -0x6d8) = uVar21;
            func_0x0073cfbc(lVar23,"[%s] ftp_state_use_port(), listening on %d");
          }
code_r0x0074ad5c:
          func_0x0074ef88(lVar10,puVar5 + -0xb0,0x2f);
          uVar21 = *(ulong *)(lVar30 + 0x398);
          if ((uVar21 & 0x10800) == 0x800) {
            uVar21 = uVar21 | 0x10000;
            *(ulong *)(lVar30 + 0x398) = uVar21;
          }
          cVar28 = puVar5[-0x12f];
          uVar17 = (uint)(*(ushort *)(puVar5 + -0x12e) >> 8);
          uVar8 = *(ushort *)(puVar5 + -0x12e) & 0xff00ff;
          goto code_r0x0074adf0;
        }
      }
      puVar12 = (undefined4 *)___error();
      goto code_r0x0074a72c;
    }
  }
code_r0x0074ab18:
  pcVar15 = "bind() failed, we ran out of ports";
code_r0x0074a758:
  func_0x0073c9e4(lVar23,pcVar15);
code_r0x0074a760:
  uVar25 = 0x1e;
code_r0x0074a764:
  if (*(long *)(puVar5 + -0x6b8) != 0) {
    func_0x00750010(lVar23,puVar5 + -0x6b8);
  }
  if ((int)uVar25 == 0) {
    if ((((*(byte *)(lVar30 + 0x39a) >> 1 & 1) == 0) || (-1 < *(char *)(lVar23 + 0xa1b))) ||
       (uVar21 = func_0x007315f4(lVar30,1), (uVar21 & 1) != 0)) {
      uVar25 = 0;
    }
    else {
      uVar25 = func_0x00794ee8(lVar23,lVar30,1);
    }
    *(ulong *)(*(long *)(lVar23 + 0x18) + 0x398) =
         *(ulong *)(*(long *)(lVar23 + 0x18) + 0x398) & 0xffffffffffffefff;
    func_0x007706e4(lVar23,10);
    iVar6 = 60000;
    if (*(int *)(lVar23 + 0x6b8) != 0) {
      iVar6 = *(int *)(lVar23 + 0x6b8);
    }
    func_0x00768170(lVar23,iVar6,0xd);
    uVar17 = *(uint *)(puVar5 + -0x6ac);
  }
  else {
    lVar10 = *(long *)(lVar23 + 0x18);
    if ((((lVar23 != 0) && (bVar4 = *(byte *)(lVar10 + 0x4f6), bVar4 != 0)) &&
        ((*(char *)(lVar23 + 0xa1d) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    lVar23 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar23 + 0x18) + 8))))))) && (0 < iRam0000000000a2b570)) {
      *(undefined8 *)(puVar5 + -0x6e0) = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
      *(char **)(puVar5 + -0x6d8) = "STOP";
      func_0x0073cfbc(lVar23,"[%s] -> [%s]");
    }
    *(undefined1 *)(lVar10 + 0x4f6) = 0;
    uVar17 = *(uint *)(puVar5 + -0x6ac);
  }
  uVar21 = (ulong)uVar17;
  if (uVar17 != 0xffffffff) {
    func_0x0072db20(lVar23,lVar30);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar5 + -0x78)) {
    return uVar25;
  }
  auVar37 = ___stack_chk_fail();
  *(long *)(puVar5 + -0x700) = lVar30;
  *(long *)(puVar5 + -0x6f8) = lVar23;
  *(undefined1 **)(puVar5 + -0x6f0) = puVar5 + -0x10;
  *(undefined **)(puVar5 + -0x6e8) = &DAT_0074af20;
  puVar2 = (ulong *)(auVar37._0_8_ + 0xa1a);
  uVar19 = *puVar2;
  *puVar2 = uVar19 | 0x8000000;
  uVar25 = func_0x007738a0(auVar37._0_8_,4,auVar37._8_8_,uVar21);
  *puVar2 = *puVar2 & 0xfffffffff0000000 | *puVar2 & 0x7ffffff | uVar19 & 0x8000000;
  return uVar25;
}

