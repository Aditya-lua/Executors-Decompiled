
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

undefined8 FUN_00749bfc(undefined8 param_1,undefined8 param_2,char *param_3,ulong param_4)

{
  bool bVar1;
  ulong *puVar2;
  char *pcVar3;
  byte bVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  int iVar7;
  int iVar8;
  uint uVar9;
  uint uVar10;
  long lVar11;
  undefined8 uVar12;
  char *pcVar13;
  undefined4 *puVar14;
  int *piVar15;
  undefined8 uVar16;
  char *pcVar17;
  undefined1 uVar18;
  uint uVar19;
  undefined4 uVar20;
  ulong uVar21;
  long lVar22;
  long lVar23;
  ulong uVar24;
  long lVar25;
  long lVar26;
  undefined8 *puVar27;
  char *pcVar28;
  char cVar29;
  undefined8 uVar30;
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar31;
  long lVar32;
  char *unaff_x21;
  undefined8 uVar33;
  undefined8 *unaff_x22;
  undefined8 uVar34;
  long unaff_x23;
  undefined8 uVar35;
  long unaff_x24;
  undefined1 *puVar36;
  long unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined8 *unaff_x29;
  undefined8 uVar37;
  undefined1 auVar38 [16];
  
code_r0x00749bfc:
  if ((int)unaff_x21 != 2) {
    pcVar17 = "Could not seek stream";
code_r0x00749e60:
    func_0x0073c9e4(unaff_x19,pcVar17);
    uVar12 = 0x1f;
    puVar27 = (undefined8 *)register0x00000008;
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
    param_4 = *(ulong *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                        + unaff_x19 + 0x40);
    param_3 = unaff_x21;
    lVar11 = (**(code **)(
                         "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                         + unaff_x19 + 0x38))((undefined1 *)((long)register0x00000008 + 0x18),1);
    if (unaff_x21 <= (char *)(lVar11 + -1)) {
      pcVar17 = "Failed to read data";
      goto code_r0x00749e60;
    }
    lVar23 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19);
    unaff_x25 = lVar11 + unaff_x25;
    puVar27 = (undefined8 *)register0x00000008;
  } while (unaff_x25 < lVar23);
code_r0x00749c5c:
  lVar23 = *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
                    unaff_x19 + 0x30);
  if (lVar23 < 1) goto LAB_00749c78;
  lVar26 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19);
  lVar11 = lVar23 - lVar26;
  *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
           unaff_x19 + 0x30) = lVar11;
  if (lVar11 != 0 && lVar26 <= lVar23) goto LAB_00749c78;
  if ((*(char *)((long)unaff_x22 + 3) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8(unaff_x19,"File already completely uploaded");
  }
  func_0x00783c98(unaff_x19);
  *(undefined4 *)(unaff_x23 + 0x10) = 2;
  unaff_x20 = *(long *)(unaff_x19 + 0x18);
  if (((((ulong)*(byte *)(unaff_x20 + 0x4f6) != 0) && (*(char *)((long)unaff_x22 + 3) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
    *puVar27 = *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(unaff_x20 + 0x4f6) * 8);
    puVar27[1] = "STOP";
    func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
  }
  uVar12 = 0;
  *(undefined1 *)(unaff_x20 + 0x4f6) = 0;
LAB_00749e6c:
  puVar6 = puVar27;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == unaff_x29[-9]) {
    return uVar12;
  }
  auVar38 = ___stack_chk_fail(uVar12);
  lVar11 = auVar38._8_8_;
  lVar23 = auVar38._0_8_;
  puVar6[-8] = unaff_x24;
  puVar6[-7] = unaff_x23;
  puVar6[-6] = unaff_x22;
  puVar6[-5] = unaff_x21;
  puVar6[-4] = unaff_x20;
  puVar6[-3] = unaff_x19;
  puVar6[-2] = unaff_x29;
  puVar6[-1] = &DAT_00749ef0;
  uVar19 = 0x41;
  if ((int)param_3 == 0) {
    uVar19 = 0x49;
  }
  uVar9 = (uint)param_4;
  uVar18 = (undefined1)param_4;
  if (*(byte *)(lVar11 + 0x4c0) != uVar19) {
    puVar6[-10] = (ulong)uVar19;
    uVar12 = func_0x0076e34c(lVar23,lVar11 + 1000,"TYPE %c");
    if ((int)uVar12 != 0) {
      return uVar12;
    }
    lVar26 = *(long *)(lVar23 + 0x18);
    if (((lVar23 != 0) && (bVar4 = *(byte *)(lVar26 + 0x4f6), bVar4 != uVar9)) &&
       (*(char *)(lVar23 + 0xa1d) < '\0')) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar23 + 0x18) == 0) {
        if (iRam0000000000a2b570 < 1) goto code_r0x0074a074;
      }
      else if (*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar23 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
      goto code_r0x0074a074;
      uVar12 = *(undefined8 *)(&UNK_00a1e570 + (param_4 & 0xffffffff) * 8);
      puVar6[-10] = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
      puVar6[-9] = uVar12;
      func_0x0073cfbc(lVar23,"[%s] -> [%s]");
    }
code_r0x0074a074:
    *(undefined1 *)(lVar26 + 0x4f6) = uVar18;
    *(char *)(lVar11 + 0x4c0) = (char)uVar19;
    return 0;
  }
  lVar11 = *(long *)(lVar23 + 0x18);
  if (((lVar23 != 0) && (bVar4 = *(byte *)(lVar11 + 0x4f6), bVar4 != uVar9)) &&
     (*(char *)(lVar23 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar23 + 0x18) == 0) {
      if (0 < iRam0000000000a2b570) goto code_r0x00749f6c;
    }
    else if (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar23 + 0x18) + 8) && 0 < iRam0000000000a2b570) {
code_r0x00749f6c:
      uVar12 = *(undefined8 *)(&UNK_00a1e570 + (param_4 & 0xffffffff) * 8);
      puVar6[-10] = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
      puVar6[-9] = uVar12;
      func_0x0073cfbc(lVar23,"[%s] -> [%s]");
    }
  }
  *(undefined1 *)(lVar11 + 0x4f6) = uVar18;
  switch(uVar9) {
  case 0x13:
    lVar11 = *(long *)(lVar23 + 0x18);
    uVar35 = puVar6[-8];
    uVar34 = puVar6[-7];
    puVar6[-4] = puVar6[-4];
    puVar6[-3] = puVar6[-3];
    puVar6[-2] = puVar6[-2];
    puVar6[-1] = puVar6[-1];
    if ((*(int *)(*(long *)(lVar23 + 0x1b0) + 0x10) == 1) && (*(long *)(lVar11 + 0x4a0) != 0)) {
      puVar6[-6] = *(long *)(lVar11 + 0x4a0);
      uVar12 = func_0x0076e34c(lVar23,lVar11 + 1000,"SIZE %s");
      if ((int)uVar12 != 0) {
        return uVar12;
      }
      lVar11 = *(long *)(lVar23 + 0x18);
      uVar24 = (ulong)*(byte *)(lVar11 + 0x4f6);
      if ((uVar24 != 0x17) && (*(char *)(lVar23 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0) {
          if (iRam0000000000a2b570 < 1) goto code_r0x0074a210;
        }
        else if (*(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar23 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
        goto code_r0x0074a210;
        puVar6[-6] = *(undefined8 *)(&UNK_00a1e570 + uVar24 * 8);
        puVar6[-5] = "SIZE";
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
code_r0x0074a210:
      *(undefined1 *)(lVar11 + 0x4f6) = 0x17;
      return 0;
    }
    puVar6[-4] = puVar6[-4];
    puVar6[-3] = puVar6[-3];
    puVar6[-2] = puVar6[-2];
    puVar6[-1] = puVar6[-1];
    if ((*(int *)(*(long *)(lVar23 + 0x1b0) + 0x10) != 0) && (*(long *)(lVar11 + 0x4a0) != 0)) {
      puVar6[-6] = 0;
      uVar12 = func_0x0076e34c(lVar23,lVar11 + 1000,"REST %d");
      if ((int)uVar12 != 0) {
        return uVar12;
      }
      lVar11 = *(long *)(lVar23 + 0x18);
      uVar24 = (ulong)*(byte *)(lVar11 + 0x4f6);
      if ((uVar24 != 0x1a) && (*(char *)(lVar23 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0) {
          if (iRam0000000000a2b570 < 1) goto code_r0x0074a310;
        }
        else if (*(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar23 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
        goto code_r0x0074a310;
        puVar6[-6] = *(undefined8 *)(&UNK_00a1e570 + uVar24 * 8);
        puVar6[-5] = "REST";
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
code_r0x0074a310:
      *(undefined1 *)(lVar11 + 0x4f6) = 0x1a;
      return 0;
    }
    puVar6[-6] = puVar6[-6];
    puVar6[-5] = puVar6[-5];
    puVar6[-4] = puVar6[-4];
    puVar6[-3] = puVar6[-3];
    puVar6[-2] = puVar6[-2];
    puVar6[-1] = puVar6[-1];
    lVar11 = *(long *)(lVar23 + 0x18);
    if (*(int *)(*(long *)(lVar23 + 0x1b0) + 0x10) != 0) {
      if (((ulong)*(byte *)(lVar11 + 0x4f6) != 0xd) && (*(char *)(lVar23 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0) {
          if (0 < iRam0000000000a2b570) goto code_r0x0074a3a4;
        }
        else if (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + lVar23 + 0x18) + 8) && 0 < iRam0000000000a2b570) {
code_r0x0074a3a4:
          puVar6[-8] = *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar11 + 0x4f6) * 8);
          puVar6[-7] = "RETR_PREQUOTE";
          func_0x0073cfbc(lVar23,"[%s] -> [%s]");
        }
      }
      *(undefined1 *)(lVar11 + 0x4f6) = 0xd;
      uVar12 = puVar6[-2];
      uVar37 = puVar6[-1];
      uVar16 = puVar6[-4];
      uVar30 = puVar6[-3];
      uVar33 = puVar6[-6];
      uVar31 = puVar6[-5];
      goto DAT_00747730;
    }
    uVar19 = (uint)*(undefined8 *)(lVar23 + 0xa1a);
    if ((uVar19 >> 0xf & 1) == 0) {
      if ((uVar19 >> 0x12 & 1) == 0) {
        puVar6[-6] = puVar6[-6];
        puVar6[-5] = puVar6[-5];
        puVar6[-4] = puVar6[-4];
        puVar6[-3] = puVar6[-3];
        puVar6[-2] = puVar6[-2];
        puVar6[-1] = puVar6[-1];
        uVar24 = *(ulong *)(lVar11 + 0x398);
        if ((uVar24 & 0x8800) == 0x800) {
          uVar24 = uVar24 | 0x8000;
          *(ulong *)(lVar11 + 0x398) = uVar24;
        }
        uVar21 = uVar24 >> 0xf & 1 ^ 1;
        puVar6[-8] = &UNK_008cd224 + (uVar21 | uVar21 << 2);
        uVar12 = func_0x0076e34c(lVar23,lVar11 + 1000,"%s");
        if ((int)uVar12 == 0) {
          *(uint *)(lVar11 + 0x4e8) = (uint)((uVar24 & 0x8000) == 0);
          lVar11 = *(long *)(lVar23 + 0x18);
          if (((((lVar23 != 0) && (bVar4 = *(byte *)(lVar11 + 0x4f6), bVar4 != 0x1e)) &&
               (*(char *)(lVar23 + 0xa1d) < '\0')) &&
              ((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + lVar23 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
            puVar6[-8] = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
            puVar6[-7] = "PASV";
            func_0x0073cfbc(lVar23,"[%s] -> [%s]");
          }
          *(undefined1 *)(lVar11 + 0x4f6) = 0x1e;
          if ((*(char *)(lVar23 + 0xa1d) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + lVar23 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + lVar23 + 0x18) + 8))))) {
            func_0x0073cab8(lVar23,"Connect data stream passively");
            return uVar12;
          }
        }
        return uVar12;
      }
      lVar26 = lVar11 + 1000;
      lVar11 = *(long *)(lVar11 + 0x4a0);
      if (lVar11 == 0) {
        pcVar17 = *(char **)(lVar23 + 0x7c0);
        if ((pcVar17 == (char *)0x0) && (pcVar17 = "LIST", ((&UNK_00001345)[lVar23] & 0x80) != 0)) {
          pcVar17 = "NLST";
        }
        puVar6[-8] = pcVar17;
        uVar12 = func_0x0076e34c(lVar23,lVar26,"PRET %s");
        iVar7 = (int)uVar12;
      }
      else if (((byte)(&UNK_00001346)[lVar23] >> 3 & 1) == 0) {
        puVar6[-8] = lVar11;
        uVar12 = func_0x0076e34c(lVar23,lVar26,"PRET RETR %s");
        iVar7 = (int)uVar12;
      }
      else {
        puVar6[-8] = lVar11;
        uVar12 = func_0x0076e34c(lVar23,lVar26,"PRET STOR %s");
        iVar7 = (int)uVar12;
      }
      if (iVar7 != 0) {
        return uVar12;
      }
      lVar11 = *(long *)(lVar23 + 0x18);
      uVar24 = (ulong)*(byte *)(lVar11 + 0x4f6);
      if ((((uVar24 != 0x1d) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
        puVar6[-8] = *(undefined8 *)(&UNK_00a1e570 + uVar24 * 8);
        puVar6[-7] = "PRET";
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
      *(undefined1 *)(lVar11 + 0x4f6) = 0x1d;
      return 0;
    }
    puVar6[-0xc] = unaff_x28;
    puVar6[-0xb] = unaff_x27;
    puVar6[-10] = unaff_x26;
    puVar6[-9] = unaff_x25;
    puVar6[-8] = uVar35;
    puVar6[-7] = uVar34;
    puVar6[-6] = puVar6[-6];
    puVar6[-5] = puVar6[-5];
    puVar6[-4] = puVar6[-4];
    puVar6[-3] = puVar6[-3];
    puVar6[-2] = puVar6[-2];
    puVar6[-1] = puVar6[-1];
    iVar7 = 0;
    puVar6[-0xf] = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    lVar11 = *(long *)(lVar23 + 0x18);
    *(undefined4 *)((long)puVar6 + -0x6ac) = 0xffffffff;
    *(undefined8 *)((long)puVar6 + -0x89) = 0;
    *(undefined8 *)((long)puVar6 + -0x91) = 0;
    puVar6[-0x15] = 0;
    puVar6[-0x16] = 0;
    puVar6[-0x13] = 0;
    puVar6[-0x14] = 0;
    pcVar17 = *(char **)(lVar23 + 0x800);
    puVar6[-0xd7] = 0;
    if ((pcVar17 == (char *)0x0) || (uVar24 = _strlen(pcVar17), uVar24 < 2)) {
      uVar19 = 0;
      uVar9 = 0;
LAB_0074a640:
      *(undefined4 *)(puVar6 + -0xd6) = 0x80;
      iVar8 = _getsockname(*(undefined4 *)(lVar11 + 0x238),puVar6 + -0x26,puVar6 + -0xd6);
      if (iVar8 != 0) goto code_r0x0074a65c;
      if (*(char *)((long)puVar6 + -0x12f) == '\x1e') {
        lVar26 = _inet_ntop(0x1e,puVar6 + -0x25,(undefined1 *)((long)puVar6 + -0x531),0x401);
      }
      else {
        lVar26 = _inet_ntop(*(char *)((long)puVar6 + -0x12f),(ulong)(puVar6 + -0x26) | 4,
                            (undefined1 *)((long)puVar6 + -0x531),0x401);
      }
      if (lVar26 == 0) goto code_r0x0074a760;
      bVar4 = 0;
code_r0x0074a6c0:
      puVar36 = (undefined1 *)((long)puVar6 + -0x531);
    }
    else {
      if (*pcVar17 == ':') {
        uVar24 = 0;
        pcVar28 = (char *)0x0;
        pcVar13 = pcVar17;
code_r0x0074a90c:
        lVar26 = _strchr(pcVar13,0x3a);
        pcVar17 = pcVar28;
        if (lVar26 == 0) {
          uVar9 = 0;
          uVar19 = 0;
        }
        else {
          _strtoul(lVar26 + 1,0,10);
          uVar9 = func_0x0078bbc8();
          lVar26 = _strchr(lVar26,0x2d);
          uVar19 = uVar9;
          if (lVar26 != 0) {
            _strtoul(lVar26 + 1,0,10);
            uVar10 = func_0x0078bbc8();
            uVar19 = 0;
            if (uVar9 <= uVar10) {
              uVar19 = uVar9;
            }
            bVar1 = uVar9 <= uVar10;
            uVar9 = 0;
            if (bVar1) {
              uVar9 = uVar10;
            }
          }
        }
joined_r0x0074a980:
        if (uVar24 == 0) goto LAB_0074a640;
      }
      else {
        if (*pcVar17 == '[') {
          pcVar28 = pcVar17 + 1;
          pcVar13 = (char *)_strchr(pcVar28,0x5d);
          if (pcVar13 == (char *)0x0) {
            uVar19 = 0;
            uVar9 = 0;
            goto LAB_0074a640;
          }
          uVar24 = (long)pcVar13 - (long)pcVar28;
          goto code_r0x0074a90c;
        }
        pcVar13 = (char *)_strchr(pcVar17,0x3a);
        if (pcVar13 != (char *)0x0) {
          uVar24 = (long)pcVar13 - (long)pcVar17;
          iVar8 = _inet_pton(0x1e,pcVar17,puVar6 + -0x25);
          pcVar28 = pcVar17;
          if (iVar8 != 1) goto code_r0x0074a90c;
          uVar9 = 0;
          uVar19 = uVar9;
          goto joined_r0x0074a980;
        }
        uVar9 = 0;
        uVar19 = 0;
      }
      if (0x31 < uVar24) goto code_r0x0074a760;
      puVar36 = (undefined1 *)((long)puVar6 + -0x663);
      ___memcpy_chk((undefined1 *)((long)puVar6 + -0x663),pcVar17,uVar24,0x32);
      puVar36[uVar24] = 0;
      uVar20 = **(undefined4 **)(lVar11 + 0x50);
      uVar12 = func_0x0075af24(*(undefined4 **)(lVar11 + 0x50) + 4);
      iVar8 = func_0x0075b008(uVar20,uVar12,*(undefined4 *)(lVar11 + 0x520),
                              (undefined1 *)((long)puVar6 + -0x663),
                              (undefined1 *)((long)puVar6 + -0x531),0x401);
      if (iVar8 != 0) {
        if (iVar8 != 1) {
          if (iVar8 != 2) goto LAB_0074a640;
          bVar4 = 1;
          goto code_r0x0074a6c0;
        }
        goto code_r0x0074a760;
      }
      bVar4 = 1;
    }
    iVar8 = func_0x0074f754(lVar23,puVar36,0,0,puVar6 + -0xd7);
    if (iVar8 == 1) {
      func_0x00728b3c(lVar23,puVar6 + -0xd7);
    }
    if (((long *)puVar6[-0xd7] != (long *)0x0) && (lVar26 = *(long *)puVar6[-0xd7], lVar26 != 0)) {
      goto code_r0x0074a704;
    }
    puVar6[-0xdc] = puVar36;
    pcVar17 = "failed to resolve the address provided to PORT: %s";
    goto code_r0x0074a758;
  case 0x14:
    puVar6[-8] = puVar6[-8];
    puVar6[-7] = puVar6[-7];
    puVar6[-6] = puVar6[-6];
    puVar6[-5] = puVar6[-5];
    puVar6[-4] = puVar6[-4];
    puVar6[-3] = puVar6[-3];
    puVar6[-2] = puVar6[-2];
    puVar6[-1] = puVar6[-1];
    lVar11 = *(long *)(lVar23 + 0x18);
    if ((*(char *)(lVar23 + 0x6bc) == '\x02') && (lVar26 = **(long **)(lVar23 + 0x1b0), lVar26 != 0)
       ) {
      puVar6[-9] = 0;
      uVar12 = func_0x00742734(lVar26,0,puVar6 + -9,0,3);
      if ((int)uVar12 != 0) {
        return uVar12;
      }
      pcVar17 = (char *)puVar6[-9];
      lVar26 = _strrchr(pcVar17,0x2f);
      if (lVar26 != 0) {
        lVar26 = lVar26 - (long)pcVar17;
        if (lVar26 == 0) {
          lVar26 = 1;
        }
        pcVar17[lVar26] = '\0';
        pcVar28 = *(char **)(lVar23 + 0x7c0);
        goto joined_r0x0074b00c;
      }
      (*pcRam0000000000a2b5f0)(pcVar17);
    }
    pcVar17 = (char *)0x0;
    pcVar28 = *(char **)(lVar23 + 0x7c0);
joined_r0x0074b00c:
    if ((pcVar28 == (char *)0x0) && (pcVar28 = "LIST", ((&UNK_00001345)[lVar23] & 0x80) != 0)) {
      pcVar28 = "NLST";
    }
    pcVar13 = "";
    if (pcVar17 != (char *)0x0) {
      pcVar13 = " ";
    }
    pcVar3 = "";
    if (pcVar17 != (char *)0x0) {
      pcVar3 = pcVar17;
    }
    puVar6[-0xb] = pcVar13;
    puVar6[-10] = pcVar3;
    puVar6[-0xc] = pcVar28;
    lVar26 = func_0x00764704("%s%s%s");
    (*pcRam0000000000a2b5f0)(pcVar17);
    if (lVar26 == 0) {
      uVar12 = 0x1b;
    }
    else {
      puVar6[-0xc] = lVar26;
      uVar12 = func_0x0076e34c(lVar23,lVar11 + 1000,"%s");
      (*pcRam0000000000a2b5f0)(lVar26);
      if ((int)uVar12 == 0) {
        lVar11 = *(long *)(lVar23 + 0x18);
        uVar24 = (ulong)*(byte *)(lVar11 + 0x4f6);
        if ((((uVar24 != 0x1f) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
            ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + lVar23 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
          puVar6[-0xc] = *(undefined8 *)(&UNK_00a1e570 + uVar24 * 8);
          puVar6[-0xb] = "LIST";
          func_0x0073cfbc(lVar23,"[%s] -> [%s]");
        }
        uVar12 = 0;
        *(undefined1 *)(lVar11 + 0x4f6) = 0x1f;
      }
    }
    return uVar12;
  case 0x15:
    uVar12 = puVar6[-2];
    uVar37 = puVar6[-1];
    uVar16 = puVar6[-4];
    uVar30 = puVar6[-3];
    uVar33 = puVar6[-6];
    uVar31 = puVar6[-5];
    uVar35 = puVar6[-8];
    uVar34 = puVar6[-7];
DAT_00747730:
    puVar6[-6] = uVar33;
    puVar6[-5] = uVar31;
    puVar6[-4] = uVar16;
    puVar6[-3] = uVar30;
    puVar6[-2] = uVar12;
    puVar6[-1] = uVar37;
    lVar26 = *(long *)(lVar23 + 0x1b0);
    lVar32 = *(long *)(lVar23 + 0x18);
    lVar11 = lVar32 + 1000;
    puVar27 = *(undefined8 **)(lVar23 + 0x6d0);
    *(undefined4 *)(lVar32 + 0x4e8) = 0;
    if (puVar27 != (undefined8 *)0x0) {
      pcVar28 = (char *)*puVar27;
      pcVar17 = pcVar28;
      if (*pcVar28 == '*') {
        pcVar17 = pcVar28 + 1;
      }
      *(uint *)(lVar32 + 0x4ec) = (uint)(*pcVar28 == '*');
      puVar6[-8] = pcVar17;
      uVar12 = func_0x0076e34c(lVar23,lVar11,"%s");
      if ((int)uVar12 != 0) {
        return uVar12;
      }
      lVar11 = *(long *)(lVar23 + 0x18);
      if (((((lVar23 != 0) && (bVar4 = *(byte *)(lVar11 + 0x4f6), bVar4 != 0xd)) &&
           (*(char *)(lVar23 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
        puVar6[-8] = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
        puVar6[-7] = _UNK_00a1e5d8;
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
      *(undefined1 *)(lVar11 + 0x4f6) = 0xd;
      return 0;
    }
    if (*(int *)(lVar26 + 0x10) != 0) {
      if (((lVar23 != 0) && (*(byte *)(lVar32 + 0x4f6) != 0)) &&
         ((*(char *)(lVar23 + 0xa1d) < '\0' &&
          (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      lVar23 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar23 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))))) {
        puVar6[-8] = *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar32 + 0x4f6) * 8);
        puVar6[-7] = "STOP";
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
      *(undefined1 *)(lVar32 + 0x4f6) = 0;
      return 0;
    }
    if (*(long *)(lVar32 + 0x4d8) == -1) {
      if (((*(byte *)(lVar23 + 0xa1e) >> 4 & 1) == 0) &&
         (((byte)(&UNK_00001345)[lVar23] >> 6 & 1) == 0)) {
        puVar6[-8] = *(undefined8 *)(lVar32 + 0x4a0);
        uVar12 = func_0x0076e34c(lVar23,lVar11,"SIZE %s");
        if ((int)uVar12 != 0) {
          return uVar12;
        }
        uVar12 = 0x18;
      }
      else {
        puVar6[-8] = *(undefined8 *)(lVar32 + 0x4a0);
        uVar12 = func_0x0076e34c(lVar23,lVar11,"RETR %s");
        if ((int)uVar12 != 0) {
          return uVar12;
        }
        uVar12 = 0x20;
      }
      func_0x007466c4(lVar23,uVar12);
      return 0;
    }
    func_0x00770554(lVar23,*(long *)(lVar32 + 0x4d8));
    lVar11 = *(long *)(lVar32 + 0x4d8);
    puVar6[-8] = uVar35;
    puVar6[-7] = uVar34;
    puVar6[-6] = puVar6[-6];
    puVar6[-5] = puVar6[-5];
    puVar6[-4] = puVar6[-4];
    puVar6[-3] = puVar6[-3];
    puVar6[-2] = puVar6[-2];
    puVar6[-1] = puVar6[-1];
    lVar26 = *(long *)(lVar23 + 0x1b0);
    lVar32 = *(long *)(lVar23 + 0x18);
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
      if (lVar32 == 0) {
        pcVar17 = "???";
      }
      else {
        pcVar17 = *(char **)(&UNK_00a1e570 + (ulong)*(byte *)(lVar32 + 0x4f6) * 8);
      }
      puVar6[-10] = pcVar17;
      func_0x0073cfbc(lVar23,"[%s] ftp_state_retr()");
      if (*(long *)(lVar23 + 0x6b0) != 0 && *(long *)(lVar23 + 0x6b0) < lVar11)
      goto code_r0x00749910;
    }
    else {
code_r0x00749750:
      if (*(long *)(lVar23 + 0x6b0) != 0 && *(long *)(lVar23 + 0x6b0) < lVar11) {
code_r0x00749910:
        func_0x0073c9e4(lVar23,"Maximum file size exceeded");
        return 0x3f;
      }
    }
    *(long *)(lVar26 + 0x18) = lVar11;
    lVar22 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + lVar23);
    if (lVar22 == 0) {
      puVar6[-10] = *(undefined8 *)(lVar32 + 0x4a0);
      uVar12 = func_0x0076e34c(lVar23,lVar32 + 1000,"RETR %s");
      if ((int)uVar12 != 0) {
        return uVar12;
      }
      lVar11 = *(long *)(lVar23 + 0x18);
      if (((((ulong)*(byte *)(lVar11 + 0x4f6) != 0x20) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar23 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
        puVar6[-10] = *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar11 + 0x4f6) * 8);
        puVar6[-9] = "RETR";
        func_0x0073cfbc(lVar23,"[%s] -> [%s]");
      }
      uVar18 = 0x20;
      goto code_r0x00749abc;
    }
    if (lVar11 == -1) {
      if ((*(char *)(lVar23 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    lVar23 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar23 + 0x18) + 8))))) {
        func_0x0073cab8(lVar23,"ftp server does not support SIZE");
        lVar25 = *(long *)(lVar26 + 0x18);
        goto joined_r0x00749820;
      }
    }
    else if (lVar22 < 0) {
      if (-lVar11 != lVar22 && lVar11 <= -lVar22) goto code_r0x00749948;
      *(long *)(lVar26 + 0x18) = -lVar22;
      *(long *)((long)&dylib_command_00001108.dylib.name.offset + lVar23) = lVar22 + lVar11;
    }
    else {
      lVar25 = lVar11 - lVar22;
      if (lVar11 < lVar22) {
code_r0x00749948:
        puVar6[-10] = lVar22;
        puVar6[-9] = lVar11;
        func_0x0073c9e4(lVar23,"Offset (%ld) was beyond file size (%ld)");
        return 0x24;
      }
      *(long *)(lVar26 + 0x18) = lVar25;
joined_r0x00749820:
      if (lVar25 == 0) {
        func_0x00783c98(lVar23);
        if ((*(char *)(lVar23 + 0xa1d) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      lVar23 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar23 + 0x18) + 8))))) {
          func_0x0073cab8(lVar23,"File already completely downloaded");
        }
        *(undefined4 *)(lVar26 + 0x10) = 2;
        lVar11 = *(long *)(lVar23 + 0x18);
        uVar24 = (ulong)*(byte *)(lVar11 + 0x4f6);
        if (((uVar24 != 0) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
           (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + lVar23 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + lVar23 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
          puVar6[-10] = *(undefined8 *)(&UNK_00a1e570 + uVar24 * 8);
          puVar6[-9] = "STOP";
          func_0x0073cfbc(lVar23,"[%s] -> [%s]");
        }
        *(undefined1 *)(lVar11 + 0x4f6) = 0;
        return 0;
      }
    }
    if ((*(char *)(lVar23 + 0xa1d) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  lVar23 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + lVar23 + 0x18) + 8))))) {
      puVar6[-10] = *(undefined8 *)((long)&dylib_command_00001108.dylib.name.offset + lVar23);
      func_0x0073cab8(lVar23,"Instructs server to resume from offset %ld");
    }
    puVar6[-10] = *(undefined8 *)((long)&dylib_command_00001108.dylib.name.offset + lVar23);
    uVar12 = func_0x0076e34c(lVar23,lVar32 + 1000,"REST %ld");
    if ((int)uVar12 != 0) {
      return uVar12;
    }
    lVar11 = *(long *)(lVar23 + 0x18);
    if (((((ulong)*(byte *)(lVar11 + 0x4f6) != 0x1b) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar23 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar23 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
      puVar6[-10] = *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar11 + 0x4f6) * 8);
      puVar6[-9] = "RETR_REST";
      func_0x0073cfbc(lVar23,"[%s] -> [%s]");
    }
    uVar18 = 0x1b;
code_r0x00749abc:
    *(undefined1 *)(lVar11 + 0x4f6) = uVar18;
    return 0;
  case 0x16:
    break;
  default:
    return 0;
  }
  uVar12 = puVar6[-6];
  unaff_x21 = (char *)puVar6[-5];
  uVar16 = puVar6[-8];
  uVar33 = puVar6[-7];
  puVar6[-4] = puVar6[-4];
  puVar6[-3] = puVar6[-3];
  puVar6[-2] = puVar6[-2];
  puVar6[-1] = puVar6[-1];
  lVar11 = *(long *)(lVar23 + 0x18);
  puVar27 = *(undefined8 **)(lVar23 + 0x6d0);
  *(undefined4 *)(lVar11 + 0x4e8) = 0;
  if (puVar27 != (undefined8 *)0x0) {
    pcVar28 = (char *)*puVar27;
    pcVar17 = pcVar28;
    if (*pcVar28 == '*') {
      pcVar17 = pcVar28 + 1;
    }
    *(uint *)(lVar11 + 0x4ec) = (uint)(*pcVar28 == '*');
    puVar6[-6] = pcVar17;
    uVar12 = func_0x0076e34c(lVar23,lVar11 + 1000,"%s");
    if ((int)uVar12 != 0) {
      return uVar12;
    }
    lVar11 = *(long *)(lVar23 + 0x18);
    uVar24 = (ulong)*(byte *)(lVar11 + 0x4f6);
    if ((uVar24 != 0xe) && (*(char *)(lVar23 + 0xa1d) < '\0')) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar23 + 0x18) == 0) {
        if (iRam0000000000a2b570 < 1) goto code_r0x0074b240;
      }
      else if (*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar23 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
      goto code_r0x0074b240;
      puVar6[-6] = *(undefined8 *)(&UNK_00a1e570 + uVar24 * 8);
      puVar6[-5] = "STOR_PREQUOTE";
      func_0x0073cfbc(lVar23,"[%s] -> [%s]");
    }
code_r0x0074b240:
    *(undefined1 *)(lVar11 + 0x4f6) = 0xe;
    return 0;
  }
  puVar6[-10] = unaff_x26;
  puVar6[-9] = unaff_x25;
  puVar6[-8] = uVar16;
  puVar6[-7] = uVar33;
  puVar6[-6] = uVar12;
  puVar6[-5] = unaff_x21;
  puVar6[-4] = puVar6[-4];
  puVar6[-3] = puVar6[-3];
  puVar6[-2] = puVar6[-2];
  puVar6[-1] = puVar6[-1];
  unaff_x29 = puVar6 + -2;
  auVar38 = (*(code *)PTR____chkstk_darwin_009b01d8)(lVar23,0);
  unaff_x19 = auVar38._0_8_;
  puVar5 = puVar6 + -0x20e;
  puVar27 = puVar6 + -0x20e;
  register0x00000008 = (BADSPACEBASE *)(puVar6 + -0x20e);
  puVar6[-0xb] = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  unaff_x24 = *(long *)(unaff_x19 + 0x18);
  unaff_x23 = *(long *)(unaff_x19 + 0x1b0);
  unaff_x20 = unaff_x24 + 1000;
  unaff_x22 = (undefined8 *)(unaff_x19 + 0xa1a);
  lVar23 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19);
  if (lVar23 != 0 && auVar38._8_4_ == 0) {
    if (lVar23 < 0) goto code_r0x00749d0c;
    goto code_r0x00749bc0;
  }
  if ((lVar23 < 1) || ((auVar38._8_8_ & 1) == 0)) {
    if (((uint)*unaff_x22 >> 0xd & 1) == 0) {
      param_3 = "STOR %s";
      puVar6[-0x20e] = *(undefined8 *)(unaff_x24 + 0x4a0);
      uVar12 = func_0x0076e34c(unaff_x19,unaff_x20);
      iVar7 = (int)uVar12;
      puVar5 = puVar6 + -0x20e;
    }
    else {
LAB_00749c78:
      param_3 = "APPE %s";
      *puVar27 = *(undefined8 *)(unaff_x24 + 0x4a0);
      uVar12 = func_0x0076e34c(unaff_x19,unaff_x20);
      iVar7 = (int)uVar12;
      puVar5 = puVar27;
    }
    puVar27 = puVar5;
    if (iVar7 == 0) {
      unaff_x20 = *(long *)(unaff_x19 + 0x18);
      if (((((ulong)*(byte *)(unaff_x20 + 0x4f6) != 0x21) && (*(char *)((long)unaff_x22 + 3) < '\0')
           ) && ((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0 ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570))
      {
        *puVar5 = *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(unaff_x20 + 0x4f6) * 8);
        puVar5[1] = "STOR";
        func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
      }
      uVar18 = 0x21;
      goto code_r0x00749d98;
    }
    goto LAB_00749e6c;
  }
code_r0x00749bc0:
  puVar27 = puVar6 + -0x20e;
  if (*(long *)(unaff_x19 + 0x218) == 0) goto code_r0x00749c5c;
  func_0x0076bad4(unaff_x19,1);
  param_3 = (char *)0x0;
  unaff_x21 = (char *)(**(code **)(unaff_x19 + 0x218))
                                (*(undefined8 *)(unaff_x19 + 0x2a8),
                                 *(undefined8 *)
                                  ((long)&dylib_command_00001108.dylib.name.offset + unaff_x19));
  func_0x0076bad4(unaff_x19,0);
  puVar27 = puVar6 + -0x20e;
  if ((int)unaff_x21 != 0) goto code_r0x00749bfc;
  goto code_r0x00749c5c;
code_r0x00749d0c:
  puVar6[-0x20e] = *(undefined8 *)(unaff_x24 + 0x4a0);
  param_3 = "SIZE %s";
  uVar12 = func_0x0076e34c(unaff_x19,unaff_x20);
  puVar27 = puVar6 + -0x20e;
  if ((int)uVar12 != 0) goto LAB_00749e6c;
  unaff_x20 = *(long *)(unaff_x19 + 0x18);
  if (((ulong)*(byte *)(unaff_x20 + 0x4f6) != 0x19) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b570 < 1) goto code_r0x00749d90;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto code_r0x00749d90;
    puVar6[-0x20e] = *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(unaff_x20 + 0x4f6) * 8);
    puVar6[-0x20d] = "STOR_SIZE";
    func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
  }
code_r0x00749d90:
  uVar18 = 0x19;
code_r0x00749d98:
  uVar12 = 0;
  *(undefined1 *)(unaff_x20 + 0x4f6) = uVar18;
  puVar27 = puVar5;
  goto LAB_00749e6c;
  while( true ) {
    puVar14 = (undefined4 *)___error();
    lVar26 = *(long *)(lVar26 + 0x28);
    if (lVar26 == 0) break;
code_r0x0074a704:
    iVar8 = func_0x0072d954(lVar23,lVar26,0,*(undefined1 *)(lVar11 + 0x52a),
                            (undefined1 *)((long)puVar6 + -0x6ac));
    if (iVar8 == 0) {
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
              pcVar17 = "???";
            }
            else {
              pcVar17 = *(char **)(&UNK_00a1e570 +
                                  (ulong)*(byte *)(*(long *)(lVar23 + 0x18) + 0x4f6) * 8);
            }
            puVar6[-0xdc] = pcVar17;
            func_0x0073cfbc(lVar23,"[%s] ftp_state_use_port(), opened socket");
          }
        }
      }
      puVar6[-0xd8] = lVar11 + 1000;
      ___memcpy_chk(puVar6 + -0x26,*(undefined8 *)(lVar26 + 0x20),*(undefined4 *)(lVar26 + 0x10),
                    0x80);
      *(undefined4 *)(puVar6 + -0xd6) = *(undefined4 *)(lVar26 + 0x10);
      if (uVar9 < uVar19) goto code_r0x0074ab18;
      uVar10 = uVar19;
      goto code_r0x0074ab3c;
    }
  }
code_r0x0074a72c:
  uVar12 = func_0x0077ea88(*puVar14,(undefined1 *)((long)puVar6 + -0x631),0x100);
  puVar6[-0xdc] = uVar12;
  pcVar17 = "socket failure: %s";
  goto code_r0x0074a758;
code_r0x0074adf0:
  do {
    if ((iVar7 != 0) || ((uVar24 & 0x10000) != 0)) {
      if ((iVar7 == 1) && (cVar29 != '\x02')) break;
      if ((cVar29 == '\x1e') || (cVar29 == '\x02')) {
        if (iVar7 == 0) {
          puVar6[-0xda] = puVar6 + -0x16;
          puVar6[-0xd9] = (ulong)(uVar19 | uVar9 << 8);
          uVar12 = 1;
          if (cVar29 != '\x02') {
            uVar12 = 2;
          }
          puVar6[-0xdc] = &UNK_008cd202;
          puVar6[-0xdb] = uVar12;
          uVar12 = func_0x0076e34c(lVar23,puVar6[-0xd8],"%s |%d|%s|%hu|");
          if ((int)uVar12 != 0) {
            uVar16 = func_0x0077e9f4();
            puVar6[-0xdc] = uVar16;
            pcVar17 = "Failure sending EPRT command: %s";
            goto code_r0x0074af00;
          }
          uVar20 = 0;
          goto code_r0x0074ad94;
        }
        if (iVar7 == 1) {
          lVar26 = 0;
          goto code_r0x0074ae40;
        }
      }
    }
    iVar7 = iVar7 + 1;
  } while (iVar7 != 2);
  uVar20 = 2;
code_r0x0074ad94:
  *(undefined4 *)(lVar11 + 0x4e8) = uVar20;
  func_0x007466c4(lVar23,0x1c);
  uVar12 = func_0x0072f958(lVar23,lVar11,1,(undefined1 *)((long)puVar6 + -0x6ac));
  if ((int)uVar12 == 0) {
    *(undefined4 *)((long)puVar6 + -0x6ac) = 0xffffffff;
  }
  goto code_r0x0074a764;
code_r0x0074ae40:
  cVar29 = *(char *)((long)puVar6 + lVar26 + -0xb0);
  if (cVar29 == '.') {
    cVar29 = ',';
  }
  else if (cVar29 == '\0') goto code_r0x0074ae50;
  *(char *)((long)puVar6 + lVar26 + -0x6a6) = cVar29;
  lVar26 = lVar26 + 1;
  goto code_r0x0074ae40;
code_r0x0074ae50:
  puVar36 = (undefined1 *)((long)puVar6 + -0x6a6) + lVar26;
  *puVar36 = 0;
  puVar6[-0xdc] = (ulong)uVar9;
  puVar6[-0xdb] = (ulong)uVar19;
  func_0x00764560(puVar36,0x14,",%d,%d");
  puVar6[-0xdc] = &UNK_008cd207;
  puVar6[-0xdb] = (undefined1 *)((long)puVar6 + -0x6a6);
  uVar12 = func_0x0076e34c(lVar23,puVar6[-0xd8],"%s %s");
  if ((int)uVar12 != 0) {
    uVar16 = func_0x0077e9f4();
    puVar6[-0xdc] = uVar16;
    pcVar17 = "Failure sending PORT command: %s";
code_r0x0074af00:
    func_0x0073c9e4(lVar23,pcVar17);
    goto code_r0x0074a764;
  }
  uVar20 = 1;
  goto code_r0x0074ad94;
code_r0x0074a65c:
  puVar14 = (undefined4 *)___error();
  uVar12 = func_0x0077ea88(*puVar14,(undefined1 *)((long)puVar6 + -0x631),0x100);
  puVar6[-0xdc] = uVar12;
  pcVar17 = "getsockname() failed: %s";
  goto code_r0x0074a758;
  while( true ) {
    piVar15 = (int *)___error();
    iVar8 = *piVar15;
    if ((bool)(bVar4 & iVar8 == 0x31)) {
      if (((lVar23 != 0) && (*(char *)(lVar23 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    lVar23 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar23 + 0x18) + 8))))) {
        uVar12 = func_0x0077ea88(0x31,(undefined1 *)((long)puVar6 + -0x631),0x100);
        puVar6[-0xdc] = uVar24;
        puVar6[-0xdb] = uVar12;
        func_0x0073cab8(lVar23,"bind(port=%hu) on non-local address failed: %s");
      }
      *(undefined4 *)(puVar6 + -0xd6) = 0x80;
      iVar8 = _getsockname(*(undefined4 *)(lVar11 + 0x238),puVar6 + -0x26,puVar6 + -0xd6);
      if (iVar8 != 0) goto code_r0x0074a65c;
      bVar4 = 0;
      uVar10 = uVar19;
    }
    else {
      if ((iVar8 != 0xd) && (iVar8 != 0x30)) {
        uVar12 = func_0x0077ea88(iVar8,(undefined1 *)((long)puVar6 + -0x631),0x100);
        puVar6[-0xdc] = uVar24;
        puVar6[-0xdb] = uVar12;
        pcVar17 = "bind(port=%hu) failed: %s";
        goto code_r0x0074a758;
      }
      uVar10 = (uVar10 & 0xffff) + 1;
    }
    if (uVar9 < (uVar10 & 0xffff)) break;
code_r0x0074ab3c:
    uVar24 = (ulong)(uVar10 & 0xffff);
    *(ushort *)((long)puVar6 + -0x12e) =
         (ushort)(uVar10 >> 8) & 0xff | (ushort)((uVar10 & 0xff00ff) << 8);
    iVar8 = _bind(*(undefined4 *)((long)puVar6 + -0x6ac),puVar6 + -0x26,
                  *(undefined4 *)(puVar6 + -0xd6));
    if (iVar8 == 0) {
      *(undefined4 *)(puVar6 + -0xd6) = 0x80;
      iVar8 = _getsockname(*(undefined4 *)((long)puVar6 + -0x6ac),puVar6 + -0x26,puVar6 + -0xd6);
      if (iVar8 != 0) goto code_r0x0074a65c;
      if (lVar23 == 0) {
        iVar8 = _listen(*(undefined4 *)((long)puVar6 + -0x6ac),1);
        if (iVar8 == 0) goto code_r0x0074ad5c;
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
                pcVar17 = "???";
              }
              else {
                pcVar17 = *(char **)(&UNK_00a1e570 +
                                    (ulong)*(byte *)(*(long *)(lVar23 + 0x18) + 0x4f6) * 8);
              }
              puVar6[-0xdc] = pcVar17;
              puVar6[-0xdb] = uVar24;
              func_0x0073cfbc(lVar23,"[%s] ftp_state_use_port(), socket bound to port %d");
            }
          }
        }
        iVar8 = _listen(*(undefined4 *)((long)puVar6 + -0x6ac),1);
        if (iVar8 == 0) {
          if ((*(char *)(lVar23 + 0xa1d) < '\0') &&
             (((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + lVar23 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + lVar23 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
            if (*(long *)(lVar23 + 0x18) == 0) {
              pcVar17 = "???";
            }
            else {
              pcVar17 = *(char **)(&UNK_00a1e570 +
                                  (ulong)*(byte *)(*(long *)(lVar23 + 0x18) + 0x4f6) * 8);
            }
            puVar6[-0xdc] = pcVar17;
            puVar6[-0xdb] = uVar24;
            func_0x0073cfbc(lVar23,"[%s] ftp_state_use_port(), listening on %d");
          }
code_r0x0074ad5c:
          func_0x0074ef88(lVar26,puVar6 + -0x16,0x2f);
          uVar24 = *(ulong *)(lVar11 + 0x398);
          if ((uVar24 & 0x10800) == 0x800) {
            uVar24 = uVar24 | 0x10000;
            *(ulong *)(lVar11 + 0x398) = uVar24;
          }
          cVar29 = *(char *)((long)puVar6 + -0x12f);
          uVar19 = (uint)(*(ushort *)((long)puVar6 + -0x12e) >> 8);
          uVar9 = *(ushort *)((long)puVar6 + -0x12e) & 0xff00ff;
          goto code_r0x0074adf0;
        }
      }
      puVar14 = (undefined4 *)___error();
      goto code_r0x0074a72c;
    }
  }
code_r0x0074ab18:
  pcVar17 = "bind() failed, we ran out of ports";
code_r0x0074a758:
  func_0x0073c9e4(lVar23,pcVar17);
code_r0x0074a760:
  uVar12 = 0x1e;
code_r0x0074a764:
  if (puVar6[-0xd7] != 0) {
    func_0x00750010(lVar23,puVar6 + -0xd7);
  }
  if ((int)uVar12 == 0) {
    if ((((*(byte *)(lVar11 + 0x39a) >> 1 & 1) == 0) || (-1 < *(char *)(lVar23 + 0xa1b))) ||
       (uVar24 = func_0x007315f4(lVar11,1), (uVar24 & 1) != 0)) {
      uVar12 = 0;
    }
    else {
      uVar12 = func_0x00794ee8(lVar23,lVar11,1);
    }
    *(ulong *)(*(long *)(lVar23 + 0x18) + 0x398) =
         *(ulong *)(*(long *)(lVar23 + 0x18) + 0x398) & 0xffffffffffffefff;
    func_0x007706e4(lVar23,10);
    iVar7 = 60000;
    if (*(int *)(lVar23 + 0x6b8) != 0) {
      iVar7 = *(int *)(lVar23 + 0x6b8);
    }
    func_0x00768170(lVar23,iVar7,0xd);
    uVar19 = *(uint *)((long)puVar6 + -0x6ac);
  }
  else {
    lVar26 = *(long *)(lVar23 + 0x18);
    if ((((lVar23 != 0) && (bVar4 = *(byte *)(lVar26 + 0x4f6), bVar4 != 0)) &&
        ((*(char *)(lVar23 + 0xa1d) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    lVar23 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar23 + 0x18) + 8))))))) && (0 < iRam0000000000a2b570)) {
      puVar6[-0xdc] = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
      puVar6[-0xdb] = "STOP";
      func_0x0073cfbc(lVar23,"[%s] -> [%s]");
    }
    *(undefined1 *)(lVar26 + 0x4f6) = 0;
    uVar19 = *(uint *)((long)puVar6 + -0x6ac);
  }
  uVar24 = (ulong)uVar19;
  if (uVar19 != 0xffffffff) {
    func_0x0072db20(lVar23,lVar11);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == puVar6[-0xf]) {
    return uVar12;
  }
  auVar38 = ___stack_chk_fail();
  puVar6[-0xe0] = lVar11;
  puVar6[-0xdf] = lVar23;
  puVar6[-0xde] = puVar6 + -2;
  puVar6[-0xdd] = &DAT_0074af20;
  puVar2 = (ulong *)(auVar38._0_8_ + 0xa1a);
  uVar21 = *puVar2;
  *puVar2 = uVar21 | 0x8000000;
  uVar12 = func_0x007738a0(auVar38._0_8_,4,auVar38._8_8_,uVar24);
  *puVar2 = *puVar2 & 0xfffffffff0000000 | *puVar2 & 0x7ffffff | uVar21 & 0x8000000;
  return uVar12;
}

