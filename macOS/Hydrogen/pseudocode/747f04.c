
/* WARNING: Possible PIC construction at 0x00747f5c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00747fb0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00747b84: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00747fb4) */
/* WARNING: Removing unreachable block (ram,0x00747f60) */
/* WARNING: Removing unreachable block (ram,0x00748080) */
/* WARNING: Removing unreachable block (ram,0x00748128) */
/* WARNING: Removing unreachable block (ram,0x007480a8) */
/* WARNING: Removing unreachable block (ram,0x007480b8) */
/* WARNING: Removing unreachable block (ram,0x007480c0) */
/* WARNING: Removing unreachable block (ram,0x007480c8) */
/* WARNING: Removing unreachable block (ram,0x007480d4) */
/* WARNING: Removing unreachable block (ram,0x007480e8) */
/* WARNING: Removing unreachable block (ram,0x00748150) */
/* WARNING: Removing unreachable block (ram,0x007480f4) */
/* WARNING: Removing unreachable block (ram,0x007481a0) */
/* WARNING: Removing unreachable block (ram,0x00748180) */
/* WARNING: Removing unreachable block (ram,0x00748168) */
/* WARNING: Removing unreachable block (ram,0x0074810c) */
/* WARNING: Removing unreachable block (ram,0x00747f78) */
/* WARNING: Removing unreachable block (ram,0x00747b88) */
/* WARNING: Recovered jumptable eliminated as dead code */
/* WARNING: Removing unreachable block (ram,0x00747944) */
/* WARNING: Removing unreachable block (ram,0x00747778) */
/* WARNING: Removing unreachable block (ram,0x00747790) */
/* WARNING: Removing unreachable block (ram,0x007477a0) */
/* WARNING: Removing unreachable block (ram,0x007477a4) */
/* WARNING: Removing unreachable block (ram,0x007477a8) */
/* WARNING: Removing unreachable block (ram,0x007477b4) */
/* WARNING: Removing unreachable block (ram,0x007477bc) */
/* WARNING: Removing unreachable block (ram,0x00747820) */
/* WARNING: Removing unreachable block (ram,0x00747810) */
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

undefined8 FUN_00747f04(void)

{
  bool bVar1;
  ulong *puVar2;
  char *pcVar3;
  byte bVar4;
  int iVar5;
  int iVar6;
  uint uVar7;
  uint uVar8;
  undefined8 uVar9;
  long lVar10;
  char *pcVar11;
  undefined4 *puVar12;
  int *piVar13;
  long lVar14;
  char *pcVar15;
  ulong uVar16;
  char cVar17;
  undefined1 uVar18;
  uint uVar19;
  undefined4 uVar20;
  ulong uVar21;
  long lVar22;
  long lVar23;
  undefined8 *puVar24;
  char *pcVar25;
  undefined8 uVar26;
  long unaff_x19;
  uint uVar27;
  long unaff_x20;
  undefined8 uVar28;
  char *unaff_x21;
  undefined8 uVar29;
  undefined8 *unaff_x22;
  long unaff_x23;
  long lVar30;
  long unaff_x24;
  undefined1 *puVar31;
  long unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined1 auVar34 [16];
  
  func_0x0073cab8();
  lVar14 = *(long *)(unaff_x19 + 0x18);
  if (((*(byte *)(unaff_x23 + 2) >> 1 & 1) != 0) && (*(long *)(lVar14 + 0x4a0) != 0)) {
    cVar17 = 'I';
    if (((&UNK_00001345)[unaff_x19] & 0x40) != 0) {
      cVar17 = 'A';
    }
    if (cVar17 != *(char *)(lVar14 + 0x4c0)) {
      *(undefined4 *)(*(long *)(unaff_x19 + 0x1b0) + 0x10) = 1;
      pcVar15 = (char *)(ulong)(*(uint *)(&UNK_00001344 + unaff_x19) >> 0xe & 1);
      uVar16 = 0x13;
      uVar33 = 0x747fb4;
      lVar30 = unaff_x19;
      do {
        *(long *)((long)register0x00000008 + -0x40) = unaff_x24;
        *(long *)((long)register0x00000008 + -0x38) = unaff_x23;
        *(undefined8 **)((long)register0x00000008 + -0x30) = unaff_x22;
        *(char **)((long)register0x00000008 + -0x28) = unaff_x21;
        *(long *)((long)register0x00000008 + -0x20) = unaff_x20;
        *(long *)((long)register0x00000008 + -0x18) = lVar30;
        *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
        *(undefined8 *)((long)register0x00000008 + -8) = uVar33;
        uVar19 = 0x41;
        if ((int)pcVar15 == 0) {
          uVar19 = 0x49;
        }
        uVar27 = (uint)uVar16;
        uVar18 = (undefined1)uVar16;
        if (*(byte *)(lVar14 + 0x4c0) != uVar19) {
          *(ulong *)((long)register0x00000008 + -0x50) = (ulong)uVar19;
          uVar33 = func_0x0076e34c(unaff_x19,lVar14 + 1000,"TYPE %c");
          if ((int)uVar33 != 0) {
            return uVar33;
          }
          lVar30 = *(long *)(unaff_x19 + 0x18);
          if (((unaff_x19 != 0) && (bVar4 = *(byte *)(lVar30 + 0x4f6), bVar4 != uVar27)) &&
             (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
            if (*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0) {
              if (iRam0000000000a2b570 < 1) goto LAB_0074a074;
            }
            else if (*(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
            goto LAB_0074a074;
            uVar33 = *(undefined8 *)(&UNK_00a1e570 + (uVar16 & 0xffffffff) * 8);
            *(undefined8 *)((long)register0x00000008 + -0x50) =
                 *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
            *(undefined8 *)((long)register0x00000008 + -0x48) = uVar33;
            func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
          }
LAB_0074a074:
          *(undefined1 *)(lVar30 + 0x4f6) = uVar18;
          *(char *)(lVar14 + 0x4c0) = (char)uVar19;
          return 0;
        }
        lVar14 = *(long *)(unaff_x19 + 0x18);
        if (((unaff_x19 != 0) && (bVar4 = *(byte *)(lVar14 + 0x4f6), bVar4 != uVar27)) &&
           (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
          if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0) {
            if (0 < iRam0000000000a2b570) goto code_r0x00749f6c;
          }
          else if (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x19 + 0x18) + 8) && 0 < iRam0000000000a2b570) {
code_r0x00749f6c:
            uVar33 = *(undefined8 *)(&UNK_00a1e570 + (uVar16 & 0xffffffff) * 8);
            *(undefined8 *)((long)register0x00000008 + -0x50) =
                 *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
            *(undefined8 *)((long)register0x00000008 + -0x48) = uVar33;
            func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
          }
        }
        *(undefined1 *)(lVar14 + 0x4f6) = uVar18;
        switch(uVar27) {
        case 0x13:
          lVar14 = *(long *)(unaff_x19 + 0x18);
          unaff_x29 = *(undefined1 **)((long)register0x00000008 + -0x10);
          uVar33 = *(undefined8 *)((long)register0x00000008 + -8);
          unaff_x20 = *(long *)((long)register0x00000008 + -0x20);
          lVar30 = *(long *)((long)register0x00000008 + -0x18);
          unaff_x22 = *(undefined8 **)((long)register0x00000008 + -0x30);
          unaff_x21 = *(char **)((long)register0x00000008 + -0x28);
          unaff_x24 = *(long *)((long)register0x00000008 + -0x40);
          unaff_x23 = *(long *)((long)register0x00000008 + -0x38);
          goto code_r0x0074a140;
        case 0x14:
          *(undefined8 *)((long)register0x00000008 + -0x40) =
               *(undefined8 *)((long)register0x00000008 + -0x40);
          *(undefined8 *)((long)register0x00000008 + -0x38) =
               *(undefined8 *)((long)register0x00000008 + -0x38);
          *(undefined8 *)((long)register0x00000008 + -0x30) =
               *(undefined8 *)((long)register0x00000008 + -0x30);
          *(undefined8 *)((long)register0x00000008 + -0x28) =
               *(undefined8 *)((long)register0x00000008 + -0x28);
          *(undefined8 *)((long)register0x00000008 + -0x20) =
               *(undefined8 *)((long)register0x00000008 + -0x20);
          *(undefined8 *)((long)register0x00000008 + -0x18) =
               *(undefined8 *)((long)register0x00000008 + -0x18);
          *(undefined8 *)((long)register0x00000008 + -0x10) =
               *(undefined8 *)((long)register0x00000008 + -0x10);
          *(undefined8 *)((long)register0x00000008 + -8) =
               *(undefined8 *)((long)register0x00000008 + -8);
          lVar14 = *(long *)(unaff_x19 + 0x18);
          if ((*(char *)(unaff_x19 + 0x6bc) == '\x02') &&
             (lVar30 = **(long **)(unaff_x19 + 0x1b0), lVar30 != 0)) {
            *(undefined8 *)((long)register0x00000008 + -0x48) = 0;
            uVar33 = func_0x00742734(lVar30,0,(undefined1 *)((long)register0x00000008 + -0x48),0,3);
            if ((int)uVar33 != 0) {
              return uVar33;
            }
            pcVar15 = *(char **)((long)register0x00000008 + -0x48);
            lVar30 = _strrchr(pcVar15,0x2f);
            if (lVar30 != 0) {
              lVar30 = lVar30 - (long)pcVar15;
              if (lVar30 == 0) {
                lVar30 = 1;
              }
              pcVar15[lVar30] = '\0';
              pcVar25 = *(char **)(unaff_x19 + 0x7c0);
              goto joined_r0x0074b00c;
            }
            (*pcRam0000000000a2b5f0)(pcVar15);
          }
          pcVar15 = (char *)0x0;
          pcVar25 = *(char **)(unaff_x19 + 0x7c0);
joined_r0x0074b00c:
          if ((pcVar25 == (char *)0x0) &&
             (pcVar25 = "LIST", ((&UNK_00001345)[unaff_x19] & 0x80) != 0)) {
            pcVar25 = "NLST";
          }
          pcVar11 = "";
          if (pcVar15 != (char *)0x0) {
            pcVar11 = " ";
          }
          pcVar3 = "";
          if (pcVar15 != (char *)0x0) {
            pcVar3 = pcVar15;
          }
          *(char **)((long)register0x00000008 + -0x58) = pcVar11;
          *(char **)((long)register0x00000008 + -0x50) = pcVar3;
          *(char **)((long)register0x00000008 + -0x60) = pcVar25;
          lVar30 = func_0x00764704("%s%s%s");
          (*pcRam0000000000a2b5f0)(pcVar15);
          if (lVar30 == 0) {
            uVar33 = 0x1b;
          }
          else {
            *(long *)((long)register0x00000008 + -0x60) = lVar30;
            uVar33 = func_0x0076e34c(unaff_x19,lVar14 + 1000,"%s");
            (*pcRam0000000000a2b5f0)(lVar30);
            if ((int)uVar33 == 0) {
              lVar14 = *(long *)(unaff_x19 + 0x18);
              uVar16 = (ulong)*(byte *)(lVar14 + 0x4f6);
              if ((((uVar16 != 0x1f) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
                  ((*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) == 0 ||
                   (0 < *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)
                 ) {
                *(undefined8 *)((long)register0x00000008 + -0x60) =
                     *(undefined8 *)(&UNK_00a1e570 + uVar16 * 8);
                *(char **)((long)register0x00000008 + -0x58) = "LIST";
                func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
              }
              uVar33 = 0;
              *(undefined1 *)(lVar14 + 0x4f6) = 0x1f;
            }
          }
          return uVar33;
        case 0x15:
          uVar33 = *(undefined8 *)((long)register0x00000008 + -0x10);
          uVar32 = *(undefined8 *)((long)register0x00000008 + -8);
          uVar9 = *(undefined8 *)((long)register0x00000008 + -0x20);
          uVar26 = *(undefined8 *)((long)register0x00000008 + -0x18);
          uVar29 = *(undefined8 *)((long)register0x00000008 + -0x30);
          uVar28 = *(undefined8 *)((long)register0x00000008 + -0x28);
          unaff_x24 = *(long *)((long)register0x00000008 + -0x40);
          unaff_x23 = *(long *)((long)register0x00000008 + -0x38);
          goto DAT_00747730;
        case 0x16:
          uVar33 = *(undefined8 *)((long)register0x00000008 + -0x30);
          unaff_x21 = *(char **)((long)register0x00000008 + -0x28);
          uVar9 = *(undefined8 *)((long)register0x00000008 + -0x40);
          uVar29 = *(undefined8 *)((long)register0x00000008 + -0x38);
          *(undefined8 *)((long)register0x00000008 + -0x20) =
               *(undefined8 *)((long)register0x00000008 + -0x20);
          *(undefined8 *)((long)register0x00000008 + -0x18) =
               *(undefined8 *)((long)register0x00000008 + -0x18);
          *(undefined8 *)((long)register0x00000008 + -0x10) =
               *(undefined8 *)((long)register0x00000008 + -0x10);
          *(undefined8 *)((long)register0x00000008 + -8) =
               *(undefined8 *)((long)register0x00000008 + -8);
          lVar14 = *(long *)(unaff_x19 + 0x18);
          puVar24 = *(undefined8 **)(unaff_x19 + 0x6d0);
          *(undefined4 *)(lVar14 + 0x4e8) = 0;
          if (puVar24 != (undefined8 *)0x0) {
            pcVar25 = (char *)*puVar24;
            pcVar15 = pcVar25;
            if (*pcVar25 == '*') {
              pcVar15 = pcVar25 + 1;
            }
            *(uint *)(lVar14 + 0x4ec) = (uint)(*pcVar25 == '*');
            *(char **)((long)register0x00000008 + -0x30) = pcVar15;
            uVar33 = func_0x0076e34c(unaff_x19,lVar14 + 1000,"%s");
            if ((int)uVar33 != 0) {
              return uVar33;
            }
            lVar14 = *(long *)(unaff_x19 + 0x18);
            uVar16 = (ulong)*(byte *)(lVar14 + 0x4f6);
            if ((uVar16 != 0xe) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0) {
                if (iRam0000000000a2b570 < 1) goto code_r0x0074b240;
              }
              else if (*(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
              goto code_r0x0074b240;
              *(undefined8 *)((long)register0x00000008 + -0x30) =
                   *(undefined8 *)(&UNK_00a1e570 + uVar16 * 8);
              *(char **)((long)register0x00000008 + -0x28) = "STOR_PREQUOTE";
              func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
            }
code_r0x0074b240:
            *(undefined1 *)(lVar14 + 0x4f6) = 0xe;
            return 0;
          }
          *(undefined8 *)((long)register0x00000008 + -0x50) = unaff_x26;
          *(long *)((long)register0x00000008 + -0x48) = unaff_x25;
          *(undefined8 *)((long)register0x00000008 + -0x40) = uVar9;
          *(undefined8 *)((long)register0x00000008 + -0x38) = uVar29;
          *(undefined8 *)((long)register0x00000008 + -0x30) = uVar33;
          *(char **)((long)register0x00000008 + -0x28) = unaff_x21;
          *(undefined8 *)((long)register0x00000008 + -0x20) =
               *(undefined8 *)((long)register0x00000008 + -0x20);
          *(undefined8 *)((long)register0x00000008 + -0x18) =
               *(undefined8 *)((long)register0x00000008 + -0x18);
          *(undefined8 *)((long)register0x00000008 + -0x10) =
               *(undefined8 *)((long)register0x00000008 + -0x10);
          *(undefined8 *)((long)register0x00000008 + -8) =
               *(undefined8 *)((long)register0x00000008 + -8);
          unaff_x29 = (undefined1 *)((long)register0x00000008 + -0x10);
          auVar34 = (*(code *)PTR____chkstk_darwin_009b01d8)(unaff_x19,0);
          lVar30 = auVar34._0_8_;
          *(undefined8 *)((long)register0x00000008 + -0x58) =
               *(undefined8 *)PTR____stack_chk_guard_009b01e8;
          unaff_x24 = *(long *)(lVar30 + 0x18);
          unaff_x23 = *(long *)(lVar30 + 0x1b0);
          unaff_x20 = unaff_x24 + 1000;
          unaff_x22 = (undefined8 *)(lVar30 + 0xa1a);
          lVar14 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + lVar30);
          if (lVar14 == 0 || auVar34._8_4_ != 0) {
            if ((0 < lVar14) && ((auVar34._8_8_ & 1) != 0)) goto code_r0x00749bc0;
            if (((uint)*unaff_x22 >> 0xd & 1) != 0) goto code_r0x00749c78;
            pcVar15 = "STOR %s";
            *(undefined8 *)((long)register0x00000008 + -0x1070) = *(undefined8 *)(unaff_x24 + 0x4a0)
            ;
            uVar9 = func_0x0076e34c(lVar30,unaff_x20);
            if ((int)uVar9 != 0) goto LAB_00749e6c;
FUN_00749c98:
            unaff_x20 = *(long *)(lVar30 + 0x18);
            if (((((ulong)*(byte *)(unaff_x20 + 0x4f6) != 0x21) &&
                 (*(char *)(lVar30 + 0xa1d) < '\0')) &&
                ((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + lVar30 + 0x18) == 0 ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + lVar30 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
              *(undefined8 *)((long)register0x00000008 + -0x1070) =
                   *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(unaff_x20 + 0x4f6) * 8);
              *(char **)((long)register0x00000008 + -0x1068) = "STOR";
              func_0x0073cfbc(lVar30,"[%s] -> [%s]");
            }
            uVar18 = 0x21;
LAB_00749d98:
            uVar9 = 0;
            *(undefined1 *)(unaff_x20 + 0x4f6) = uVar18;
          }
          else if (lVar14 < 0) {
            *(undefined8 *)((long)register0x00000008 + -0x1070) = *(undefined8 *)(unaff_x24 + 0x4a0)
            ;
            pcVar15 = "SIZE %s";
            uVar9 = func_0x0076e34c(lVar30,unaff_x20);
            if ((int)uVar9 == 0) {
              unaff_x20 = *(long *)(lVar30 + 0x18);
              if (((ulong)*(byte *)(unaff_x20 + 0x4f6) != 0x19) &&
                 (*(char *)(lVar30 + 0xa1d) < '\0')) {
                if (*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + lVar30 + 0x18) == 0) {
                  if (0 < iRam0000000000a2b570) goto code_r0x00749d68;
                }
                else if (0 < *(int *)(*(long *)(
                                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                               + lVar30 + 0x18) + 8) && 0 < iRam0000000000a2b570) {
code_r0x00749d68:
                  *(undefined8 *)((long)register0x00000008 + -0x1070) =
                       *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(unaff_x20 + 0x4f6) * 8);
                  *(char **)((long)register0x00000008 + -0x1068) = "STOR_SIZE";
                  func_0x0073cfbc(lVar30,"[%s] -> [%s]");
                }
              }
              uVar18 = 0x19;
              goto LAB_00749d98;
            }
          }
          else {
code_r0x00749bc0:
            if (*(long *)(lVar30 + 0x218) != 0) {
              func_0x0076bad4(lVar30,1);
              pcVar15 = (char *)0x0;
              unaff_x21 = (char *)(**(code **)(lVar30 + 0x218))
                                            (*(undefined8 *)(lVar30 + 0x2a8),
                                             *(undefined8 *)
                                              ((long)&dylib_command_00001108.dylib.name.offset +
                                              lVar30));
              func_0x0076bad4(lVar30,0);
              if ((int)unaff_x21 != 0) {
                if ((int)unaff_x21 != 2) {
                  pcVar25 = "Could not seek stream";
code_r0x00749e60:
                  func_0x0073c9e4(lVar30,pcVar25);
                  uVar9 = 0x1f;
                  goto LAB_00749e6c;
                }
                unaff_x25 = 0;
                lVar14 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + lVar30);
                do {
                  if (lVar14 - unaff_x25 < 0x1001) {
                    unaff_x21 = (char *)func_0x00093e00();
                  }
                  else {
                    unaff_x21 = "Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation";
                  }
                  uVar16 = *(ulong *)(
                                     "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                                     + lVar30 + 0x40);
                  pcVar15 = unaff_x21;
                  lVar10 = (**(code **)(
                                       "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                                       + lVar30 + 0x38))
                                     ((undefined1 *)((long)register0x00000008 + -0x1058),1);
                  if (unaff_x21 <= (char *)(lVar10 + -1)) {
                    pcVar25 = "Failed to read data";
                    goto code_r0x00749e60;
                  }
                  lVar14 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + lVar30);
                  unaff_x25 = lVar10 + unaff_x25;
                } while (unaff_x25 < lVar14);
              }
            }
            lVar14 = *(long *)(
                              "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                              + lVar30 + 0x30);
            if ((lVar14 < 1) ||
               (lVar23 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + lVar30),
               lVar10 = lVar14 - lVar23,
               *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                        + lVar30 + 0x30) = lVar10, lVar10 != 0 && lVar23 <= lVar14)) {
code_r0x00749c78:
              pcVar15 = "APPE %s";
              *(undefined8 *)((long)register0x00000008 + -0x1070) =
                   *(undefined8 *)(unaff_x24 + 0x4a0);
              uVar9 = func_0x0076e34c(lVar30,unaff_x20);
              if ((int)uVar9 == 0) goto FUN_00749c98;
            }
            else {
              if ((*(char *)(lVar30 + 0xa1d) < '\0') &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + lVar30 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + lVar30 + 0x18) + 8))))) {
                func_0x0073cab8(lVar30,"File already completely uploaded");
              }
              func_0x00783c98(lVar30);
              *(undefined4 *)(unaff_x23 + 0x10) = 2;
              unaff_x20 = *(long *)(lVar30 + 0x18);
              if ((((ulong)*(byte *)(unaff_x20 + 0x4f6) != 0) && (*(char *)(lVar30 + 0xa1d) < '\0'))
                 && (((*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar30 + 0x18) == 0 ||
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + lVar30 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))
                 ) {
                *(undefined8 *)((long)register0x00000008 + -0x1070) =
                     *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(unaff_x20 + 0x4f6) * 8);
                *(char **)((long)register0x00000008 + -0x1068) = "STOP";
                func_0x0073cfbc(lVar30,"[%s] -> [%s]");
              }
              uVar9 = 0;
              *(undefined1 *)(unaff_x20 + 0x4f6) = 0;
            }
          }
LAB_00749e6c:
          if (*(long *)PTR____stack_chk_guard_009b01e8 ==
              *(long *)((long)register0x00000008 + -0x58)) {
            return uVar9;
          }
          uVar33 = 0x749ef0;
          auVar34 = ___stack_chk_fail(uVar9);
          lVar14 = auVar34._8_8_;
          unaff_x19 = auVar34._0_8_;
          register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x1070);
          break;
        default:
          return 0;
        }
      } while( true );
    }
  }
  uVar33 = 0x747f60;
  lVar30 = unaff_x19;
code_r0x0074a140:
  *(long *)((long)register0x00000008 + -0x20) = unaff_x20;
  *(long *)((long)register0x00000008 + -0x18) = lVar30;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar33;
  if ((*(int *)(*(long *)(unaff_x19 + 0x1b0) + 0x10) == 1) && (*(long *)(lVar14 + 0x4a0) != 0)) {
    *(long *)((long)register0x00000008 + -0x30) = *(long *)(lVar14 + 0x4a0);
    uVar33 = func_0x0076e34c(unaff_x19,lVar14 + 1000,"SIZE %s");
    if ((int)uVar33 != 0) {
      return uVar33;
    }
    lVar14 = *(long *)(unaff_x19 + 0x18);
    uVar16 = (ulong)*(byte *)(lVar14 + 0x4f6);
    if ((uVar16 != 0x17) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) {
        if (iRam0000000000a2b570 < 1) goto code_r0x0074a210;
      }
      else if (*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
      goto code_r0x0074a210;
      *(undefined8 *)((long)register0x00000008 + -0x30) =
           *(undefined8 *)(&UNK_00a1e570 + uVar16 * 8);
      *(char **)((long)register0x00000008 + -0x28) = "SIZE";
      func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
    }
code_r0x0074a210:
    *(undefined1 *)(lVar14 + 0x4f6) = 0x17;
    return 0;
  }
  *(undefined8 *)((long)register0x00000008 + -0x20) =
       *(undefined8 *)((long)register0x00000008 + -0x20);
  *(undefined8 *)((long)register0x00000008 + -0x18) =
       *(undefined8 *)((long)register0x00000008 + -0x18);
  *(undefined8 *)((long)register0x00000008 + -0x10) =
       *(undefined8 *)((long)register0x00000008 + -0x10);
  *(undefined8 *)((long)register0x00000008 + -8) = *(undefined8 *)((long)register0x00000008 + -8);
  if ((*(int *)(*(long *)(unaff_x19 + 0x1b0) + 0x10) != 0) && (*(long *)(lVar14 + 0x4a0) != 0)) {
    *(undefined8 *)((long)register0x00000008 + -0x30) = 0;
    uVar33 = func_0x0076e34c(unaff_x19,lVar14 + 1000,"REST %d");
    if ((int)uVar33 != 0) {
      return uVar33;
    }
    lVar14 = *(long *)(unaff_x19 + 0x18);
    uVar16 = (ulong)*(byte *)(lVar14 + 0x4f6);
    if ((uVar16 != 0x1a) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) {
        if (iRam0000000000a2b570 < 1) goto code_r0x0074a310;
      }
      else if (*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
      goto code_r0x0074a310;
      *(undefined8 *)((long)register0x00000008 + -0x30) =
           *(undefined8 *)(&UNK_00a1e570 + uVar16 * 8);
      *(char **)((long)register0x00000008 + -0x28) = "REST";
      func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
    }
code_r0x0074a310:
    *(undefined1 *)(lVar14 + 0x4f6) = 0x1a;
    return 0;
  }
  *(undefined8 **)((long)register0x00000008 + -0x30) = unaff_x22;
  *(char **)((long)register0x00000008 + -0x28) = unaff_x21;
  *(undefined8 *)((long)register0x00000008 + -0x20) =
       *(undefined8 *)((long)register0x00000008 + -0x20);
  *(undefined8 *)((long)register0x00000008 + -0x18) =
       *(undefined8 *)((long)register0x00000008 + -0x18);
  *(undefined8 *)((long)register0x00000008 + -0x10) =
       *(undefined8 *)((long)register0x00000008 + -0x10);
  *(undefined8 *)((long)register0x00000008 + -8) = *(undefined8 *)((long)register0x00000008 + -8);
  lVar14 = *(long *)(unaff_x19 + 0x18);
  if (*(int *)(*(long *)(unaff_x19 + 0x1b0) + 0x10) == 0) {
    uVar19 = (uint)*(undefined8 *)(unaff_x19 + 0xa1a);
    if ((uVar19 >> 0xf & 1) == 0) {
      if ((uVar19 >> 0x12 & 1) != 0) {
        lVar30 = lVar14 + 1000;
        lVar14 = *(long *)(lVar14 + 0x4a0);
        if (lVar14 == 0) {
          pcVar15 = *(char **)(unaff_x19 + 0x7c0);
          if ((pcVar15 == (char *)0x0) &&
             (pcVar15 = "LIST", ((&UNK_00001345)[unaff_x19] & 0x80) != 0)) {
            pcVar15 = "NLST";
          }
          *(char **)((long)register0x00000008 + -0x40) = pcVar15;
          uVar33 = func_0x0076e34c(unaff_x19,lVar30,"PRET %s");
          iVar5 = (int)uVar33;
        }
        else if (((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) == 0) {
          *(long *)((long)register0x00000008 + -0x40) = lVar14;
          uVar33 = func_0x0076e34c(unaff_x19,lVar30,"PRET RETR %s");
          iVar5 = (int)uVar33;
        }
        else {
          *(long *)((long)register0x00000008 + -0x40) = lVar14;
          uVar33 = func_0x0076e34c(unaff_x19,lVar30,"PRET STOR %s");
          iVar5 = (int)uVar33;
        }
        if (iVar5 != 0) {
          return uVar33;
        }
        lVar14 = *(long *)(unaff_x19 + 0x18);
        uVar16 = (ulong)*(byte *)(lVar14 + 0x4f6);
        if ((((uVar16 != 0x1d) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
            ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
          *(undefined8 *)((long)register0x00000008 + -0x40) =
               *(undefined8 *)(&UNK_00a1e570 + uVar16 * 8);
          *(char **)((long)register0x00000008 + -0x38) = "PRET";
          func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
        }
        *(undefined1 *)(lVar14 + 0x4f6) = 0x1d;
        return 0;
      }
      *(undefined8 *)((long)register0x00000008 + -0x30) =
           *(undefined8 *)((long)register0x00000008 + -0x30);
      *(undefined8 *)((long)register0x00000008 + -0x28) =
           *(undefined8 *)((long)register0x00000008 + -0x28);
      *(undefined8 *)((long)register0x00000008 + -0x20) =
           *(undefined8 *)((long)register0x00000008 + -0x20);
      *(undefined8 *)((long)register0x00000008 + -0x18) =
           *(undefined8 *)((long)register0x00000008 + -0x18);
      *(undefined8 *)((long)register0x00000008 + -0x10) =
           *(undefined8 *)((long)register0x00000008 + -0x10);
      *(undefined8 *)((long)register0x00000008 + -8) =
           *(undefined8 *)((long)register0x00000008 + -8);
      uVar16 = *(ulong *)(lVar14 + 0x398);
      if ((uVar16 & 0x8800) == 0x800) {
        uVar16 = uVar16 | 0x8000;
        *(ulong *)(lVar14 + 0x398) = uVar16;
      }
      uVar21 = uVar16 >> 0xf & 1 ^ 1;
      *(undefined **)((long)register0x00000008 + -0x40) = &UNK_008cd224 + (uVar21 | uVar21 << 2);
      uVar33 = func_0x0076e34c(unaff_x19,lVar14 + 1000,"%s");
      if ((int)uVar33 == 0) {
        *(uint *)(lVar14 + 0x4e8) = (uint)((uVar16 & 0x8000) == 0);
        lVar14 = *(long *)(unaff_x19 + 0x18);
        if (((((unaff_x19 != 0) && (bVar4 = *(byte *)(lVar14 + 0x4f6), bVar4 != 0x1e)) &&
             (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
            ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
          *(undefined8 *)((long)register0x00000008 + -0x40) =
               *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
          *(char **)((long)register0x00000008 + -0x38) = "PASV";
          func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
        }
        *(undefined1 *)(lVar14 + 0x4f6) = 0x1e;
        if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8(unaff_x19,"Connect data stream passively");
          return uVar33;
        }
      }
      return uVar33;
    }
    *(undefined8 *)((long)register0x00000008 + -0x60) = unaff_x28;
    *(undefined8 *)((long)register0x00000008 + -0x58) = unaff_x27;
    *(undefined8 *)((long)register0x00000008 + -0x50) = unaff_x26;
    *(long *)((long)register0x00000008 + -0x48) = unaff_x25;
    *(long *)((long)register0x00000008 + -0x40) = unaff_x24;
    *(long *)((long)register0x00000008 + -0x38) = unaff_x23;
    *(undefined8 *)((long)register0x00000008 + -0x30) =
         *(undefined8 *)((long)register0x00000008 + -0x30);
    *(undefined8 *)((long)register0x00000008 + -0x28) =
         *(undefined8 *)((long)register0x00000008 + -0x28);
    *(undefined8 *)((long)register0x00000008 + -0x20) =
         *(undefined8 *)((long)register0x00000008 + -0x20);
    *(undefined8 *)((long)register0x00000008 + -0x18) =
         *(undefined8 *)((long)register0x00000008 + -0x18);
    *(undefined8 *)((long)register0x00000008 + -0x10) =
         *(undefined8 *)((long)register0x00000008 + -0x10);
    *(undefined8 *)((long)register0x00000008 + -8) = *(undefined8 *)((long)register0x00000008 + -8);
    iVar5 = 0;
    *(undefined8 *)((long)register0x00000008 + -0x78) =
         *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    lVar14 = *(long *)(unaff_x19 + 0x18);
    *(undefined4 *)((long)register0x00000008 + -0x6ac) = 0xffffffff;
    *(undefined8 *)((long)register0x00000008 + -0x89) = 0;
    *(undefined8 *)((long)register0x00000008 + -0x91) = 0;
    *(undefined8 *)((long)register0x00000008 + -0xa8) = 0;
    *(undefined8 *)((long)register0x00000008 + -0xb0) = 0;
    *(undefined8 *)((long)register0x00000008 + -0x98) = 0;
    *(undefined8 *)((long)register0x00000008 + -0xa0) = 0;
    pcVar15 = *(char **)(unaff_x19 + 0x800);
    *(undefined8 *)((long)register0x00000008 + -0x6b8) = 0;
    if ((pcVar15 == (char *)0x0) || (uVar16 = _strlen(pcVar15), uVar16 < 2)) {
      uVar19 = 0;
      uVar27 = 0;
code_r0x0074a640:
      *(undefined4 *)((long)register0x00000008 + -0x6b0) = 0x80;
      iVar6 = _getsockname(*(undefined4 *)(lVar14 + 0x238),
                           (undefined1 *)((long)register0x00000008 + -0x130),
                           (undefined1 *)((long)register0x00000008 + -0x6b0));
      if (iVar6 != 0) {
code_r0x0074a65c:
        puVar12 = (undefined4 *)___error();
        uVar33 = func_0x0077ea88(*puVar12,(undefined1 *)((long)register0x00000008 + -0x631),0x100);
        *(undefined8 *)((long)register0x00000008 + -0x6e0) = uVar33;
        pcVar15 = "getsockname() failed: %s";
        goto code_r0x0074a758;
      }
      if (*(char *)((long)register0x00000008 + -0x12f) == '\x1e') {
        lVar30 = _inet_ntop(0x1e,(undefined1 *)((long)register0x00000008 + -0x128),
                            (undefined1 *)((long)register0x00000008 + -0x531),0x401);
      }
      else {
        lVar30 = _inet_ntop(*(char *)((long)register0x00000008 + -0x12f),
                            (ulong)((long)register0x00000008 + -0x130) | 4,
                            (undefined1 *)((long)register0x00000008 + -0x531),0x401);
      }
      if (lVar30 != 0) {
        bVar4 = 0;
code_r0x0074a6c0:
        puVar31 = (undefined1 *)((long)register0x00000008 + -0x531);
code_r0x0074a6c4:
        iVar6 = func_0x0074f754(unaff_x19,puVar31,0,0,
                                (undefined1 *)((long)register0x00000008 + -0x6b8));
        if (iVar6 == 1) {
          func_0x00728b3c(unaff_x19,(undefined1 *)((long)register0x00000008 + -0x6b8));
        }
        if ((*(long **)((long)register0x00000008 + -0x6b8) == (long *)0x0) ||
           (lVar30 = **(long **)((long)register0x00000008 + -0x6b8), lVar30 == 0)) {
          *(undefined1 **)((long)register0x00000008 + -0x6e0) = puVar31;
          pcVar15 = "failed to resolve the address provided to PORT: %s";
        }
        else {
          do {
            iVar6 = func_0x0072d954(unaff_x19,lVar30,0,*(undefined1 *)(lVar14 + 0x52a),
                                    (undefined1 *)((long)register0x00000008 + -0x6ac));
            if (iVar6 == 0) {
              if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
                if (*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) == 0) {
                  if (0 < iRam0000000000a2b570) goto code_r0x0074aab4;
                }
                else {
                  bVar1 = *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8) < 1;
                  if ((!bVar1 && iRam0000000000a2b570 != 0) && (bVar1 || -1 < iRam0000000000a2b570))
                  {
code_r0x0074aab4:
                    if (*(long *)(unaff_x19 + 0x18) == 0) {
                      pcVar15 = "???";
                    }
                    else {
                      pcVar15 = *(char **)(&UNK_00a1e570 +
                                          (ulong)*(byte *)(*(long *)(unaff_x19 + 0x18) + 0x4f6) * 8)
                      ;
                    }
                    *(char **)((long)register0x00000008 + -0x6e0) = pcVar15;
                    func_0x0073cfbc(unaff_x19,"[%s] ftp_state_use_port(), opened socket");
                  }
                }
              }
              *(long *)((long)register0x00000008 + -0x6c0) = lVar14 + 1000;
              ___memcpy_chk((undefined1 *)((long)register0x00000008 + -0x130),
                            *(undefined8 *)(lVar30 + 0x20),*(undefined4 *)(lVar30 + 0x10),0x80);
              *(undefined4 *)((long)register0x00000008 + -0x6b0) = *(undefined4 *)(lVar30 + 0x10);
              if (uVar27 < uVar19) goto code_r0x0074ab18;
              uVar7 = uVar19;
              goto code_r0x0074ab3c;
            }
            puVar12 = (undefined4 *)___error();
            lVar30 = *(long *)(lVar30 + 0x28);
          } while (lVar30 != 0);
code_r0x0074a72c:
          uVar33 = func_0x0077ea88(*puVar12,(undefined1 *)((long)register0x00000008 + -0x631),0x100)
          ;
          *(undefined8 *)((long)register0x00000008 + -0x6e0) = uVar33;
          pcVar15 = "socket failure: %s";
        }
        goto code_r0x0074a758;
      }
    }
    else {
      if (*pcVar15 == ':') {
        uVar16 = 0;
        pcVar25 = (char *)0x0;
        pcVar11 = pcVar15;
code_r0x0074a90c:
        lVar30 = _strchr(pcVar11,0x3a);
        if (lVar30 == 0) {
          uVar19 = 0;
          uVar27 = 0;
        }
        else {
          _strtoul(lVar30 + 1,0,10);
          uVar7 = func_0x0078bbc8();
          lVar30 = _strchr(lVar30,0x2d);
          uVar27 = uVar7;
          uVar19 = uVar7;
          if (lVar30 != 0) {
            _strtoul(lVar30 + 1,0,10);
            uVar8 = func_0x0078bbc8();
            uVar19 = 0;
            if (uVar7 <= uVar8) {
              uVar19 = uVar7;
            }
            uVar27 = 0;
            if (uVar7 <= uVar8) {
              uVar27 = uVar8;
            }
          }
        }
joined_r0x0074a9e4:
        if (uVar16 == 0) goto code_r0x0074a640;
        pcVar15 = pcVar25;
      }
      else {
        if (*pcVar15 == '[') {
          pcVar25 = pcVar15 + 1;
          pcVar11 = (char *)_strchr(pcVar25,0x5d);
          if (pcVar11 == (char *)0x0) {
            uVar19 = 0;
            uVar27 = 0;
            goto code_r0x0074a640;
          }
          uVar16 = (long)pcVar11 - (long)pcVar25;
          goto code_r0x0074a90c;
        }
        pcVar11 = (char *)_strchr(pcVar15,0x3a);
        if (pcVar11 != (char *)0x0) {
          uVar16 = (long)pcVar11 - (long)pcVar15;
          iVar6 = _inet_pton(0x1e,pcVar15,(undefined1 *)((long)register0x00000008 + -0x128));
          pcVar25 = pcVar15;
          if (iVar6 != 1) goto code_r0x0074a90c;
          uVar19 = 0;
          uVar27 = 0;
          goto joined_r0x0074a9e4;
        }
        uVar27 = 0;
        uVar19 = 0;
      }
      if (uVar16 < 0x32) {
        puVar31 = (undefined1 *)((long)register0x00000008 + -0x663);
        ___memcpy_chk((undefined1 *)((long)register0x00000008 + -0x663),pcVar15,uVar16,0x32);
        puVar31[uVar16] = 0;
        uVar20 = **(undefined4 **)(lVar14 + 0x50);
        uVar33 = func_0x0075af24(*(undefined4 **)(lVar14 + 0x50) + 4);
        iVar6 = func_0x0075b008(uVar20,uVar33,*(undefined4 *)(lVar14 + 0x520),
                                (undefined1 *)((long)register0x00000008 + -0x663),
                                (undefined1 *)((long)register0x00000008 + -0x531),0x401);
        if (iVar6 == 0) {
          bVar4 = 1;
          goto code_r0x0074a6c4;
        }
        if (iVar6 != 1) {
          if (iVar6 != 2) goto code_r0x0074a640;
          bVar4 = 1;
          goto code_r0x0074a6c0;
        }
      }
    }
    goto code_r0x0074a760;
  }
  if (((ulong)*(byte *)(lVar14 + 0x4f6) != 0xd) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (0 < iRam0000000000a2b570) goto code_r0x0074a3a4;
    }
    else if (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8) && 0 < iRam0000000000a2b570) {
code_r0x0074a3a4:
      *(undefined8 *)((long)register0x00000008 + -0x40) =
           *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar14 + 0x4f6) * 8);
      *(char **)((long)register0x00000008 + -0x38) = "RETR_PREQUOTE";
      func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
    }
  }
  *(undefined1 *)(lVar14 + 0x4f6) = 0xd;
  uVar33 = *(undefined8 *)((long)register0x00000008 + -0x10);
  uVar32 = *(undefined8 *)((long)register0x00000008 + -8);
  uVar9 = *(undefined8 *)((long)register0x00000008 + -0x20);
  uVar26 = *(undefined8 *)((long)register0x00000008 + -0x18);
  uVar29 = *(undefined8 *)((long)register0x00000008 + -0x30);
  uVar28 = *(undefined8 *)((long)register0x00000008 + -0x28);
DAT_00747730:
  *(undefined8 *)((long)register0x00000008 + -0x30) = uVar29;
  *(undefined8 *)((long)register0x00000008 + -0x28) = uVar28;
  *(undefined8 *)((long)register0x00000008 + -0x20) = uVar9;
  *(undefined8 *)((long)register0x00000008 + -0x18) = uVar26;
  *(undefined8 *)((long)register0x00000008 + -0x10) = uVar33;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar32;
  lVar30 = *(long *)(unaff_x19 + 0x1b0);
  lVar10 = *(long *)(unaff_x19 + 0x18);
  lVar14 = lVar10 + 1000;
  puVar24 = *(undefined8 **)(unaff_x19 + 0x6d0);
  *(undefined4 *)(lVar10 + 0x4e8) = 0;
  if (puVar24 != (undefined8 *)0x0) {
    pcVar25 = (char *)*puVar24;
    pcVar15 = pcVar25;
    if (*pcVar25 == '*') {
      pcVar15 = pcVar25 + 1;
    }
    *(uint *)(lVar10 + 0x4ec) = (uint)(*pcVar25 == '*');
    *(char **)((long)register0x00000008 + -0x40) = pcVar15;
    uVar33 = func_0x0076e34c(unaff_x19,lVar14,"%s");
    if ((int)uVar33 != 0) {
      return uVar33;
    }
    lVar14 = *(long *)(unaff_x19 + 0x18);
    if (((((unaff_x19 != 0) && (bVar4 = *(byte *)(lVar14 + 0x4f6), bVar4 != 0xd)) &&
         (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
      *(undefined8 *)((long)register0x00000008 + -0x40) =
           *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
      *(undefined8 *)((long)register0x00000008 + -0x38) = _UNK_00a1e5d8;
      func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
    }
    *(undefined1 *)(lVar14 + 0x4f6) = 0xd;
    return 0;
  }
  if (*(int *)(lVar30 + 0x10) != 0) {
    if (((unaff_x19 != 0) && (*(byte *)(lVar10 + 0x4f6) != 0)) &&
       ((*(char *)(unaff_x19 + 0xa1d) < '\0' &&
        (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))))) {
      *(undefined8 *)((long)register0x00000008 + -0x40) =
           *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar10 + 0x4f6) * 8);
      *(char **)((long)register0x00000008 + -0x38) = "STOP";
      func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
    }
    *(undefined1 *)(lVar10 + 0x4f6) = 0;
    return 0;
  }
  if (*(long *)(lVar10 + 0x4d8) == -1) {
    if (((*(byte *)(unaff_x19 + 0xa1e) >> 4 & 1) == 0) &&
       (((byte)(&UNK_00001345)[unaff_x19] >> 6 & 1) == 0)) {
      *(undefined8 *)((long)register0x00000008 + -0x40) = *(undefined8 *)(lVar10 + 0x4a0);
      uVar33 = func_0x0076e34c(unaff_x19,lVar14,"SIZE %s");
      if ((int)uVar33 != 0) {
        return uVar33;
      }
      uVar33 = 0x18;
    }
    else {
      *(undefined8 *)((long)register0x00000008 + -0x40) = *(undefined8 *)(lVar10 + 0x4a0);
      uVar33 = func_0x0076e34c(unaff_x19,lVar14,"RETR %s");
      if ((int)uVar33 != 0) {
        return uVar33;
      }
      uVar33 = 0x20;
    }
    func_0x007466c4(unaff_x19,uVar33);
    return 0;
  }
  func_0x00770554(unaff_x19,*(long *)(lVar10 + 0x4d8));
  lVar14 = *(long *)(lVar10 + 0x4d8);
  *(long *)((long)register0x00000008 + -0x40) = unaff_x24;
  *(long *)((long)register0x00000008 + -0x38) = unaff_x23;
  *(undefined8 *)((long)register0x00000008 + -0x30) =
       *(undefined8 *)((long)register0x00000008 + -0x30);
  *(undefined8 *)((long)register0x00000008 + -0x28) =
       *(undefined8 *)((long)register0x00000008 + -0x28);
  *(undefined8 *)((long)register0x00000008 + -0x20) =
       *(undefined8 *)((long)register0x00000008 + -0x20);
  *(undefined8 *)((long)register0x00000008 + -0x18) =
       *(undefined8 *)((long)register0x00000008 + -0x18);
  *(undefined8 *)((long)register0x00000008 + -0x10) =
       *(undefined8 *)((long)register0x00000008 + -0x10);
  *(undefined8 *)((long)register0x00000008 + -8) = *(undefined8 *)((long)register0x00000008 + -8);
  lVar30 = *(long *)(unaff_x19 + 0x1b0);
  lVar10 = *(long *)(unaff_x19 + 0x18);
  if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (0 < iRam0000000000a2b570) goto code_r0x007497a0;
      goto code_r0x00749750;
    }
    if (*(int *)(*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto code_r0x00749750;
code_r0x007497a0:
    if (lVar10 == 0) {
      pcVar15 = "???";
    }
    else {
      pcVar15 = *(char **)(&UNK_00a1e570 + (ulong)*(byte *)(lVar10 + 0x4f6) * 8);
    }
    *(char **)((long)register0x00000008 + -0x50) = pcVar15;
    func_0x0073cfbc(unaff_x19,"[%s] ftp_state_retr()");
    if (*(long *)(unaff_x19 + 0x6b0) != 0 && *(long *)(unaff_x19 + 0x6b0) < lVar14)
    goto code_r0x00749910;
  }
  else {
code_r0x00749750:
    if (*(long *)(unaff_x19 + 0x6b0) != 0 && *(long *)(unaff_x19 + 0x6b0) < lVar14) {
code_r0x00749910:
      func_0x0073c9e4(unaff_x19,"Maximum file size exceeded");
      return 0x3f;
    }
  }
  *(long *)(lVar30 + 0x18) = lVar14;
  lVar23 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19);
  if (lVar23 == 0) {
    *(undefined8 *)((long)register0x00000008 + -0x50) = *(undefined8 *)(lVar10 + 0x4a0);
    uVar33 = func_0x0076e34c(unaff_x19,lVar10 + 1000,"RETR %s");
    if ((int)uVar33 != 0) {
      return uVar33;
    }
    lVar14 = *(long *)(unaff_x19 + 0x18);
    if (((((ulong)*(byte *)(lVar14 + 0x4f6) != 0x20) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
      *(undefined8 *)((long)register0x00000008 + -0x50) =
           *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar14 + 0x4f6) * 8);
      *(char **)((long)register0x00000008 + -0x48) = "RETR";
      func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
    }
    uVar18 = 0x20;
    goto code_r0x00749abc;
  }
  if (lVar14 == -1) {
    if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8(unaff_x19,"ftp server does not support SIZE");
      lVar22 = *(long *)(lVar30 + 0x18);
      goto joined_r0x00749820;
    }
  }
  else if (lVar23 < 0) {
    if (-lVar14 != lVar23 && lVar14 <= -lVar23) goto code_r0x00749948;
    *(long *)(lVar30 + 0x18) = -lVar23;
    *(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19) = lVar23 + lVar14;
  }
  else {
    lVar22 = lVar14 - lVar23;
    if (lVar14 < lVar23) {
code_r0x00749948:
      *(long *)((long)register0x00000008 + -0x50) = lVar23;
      *(long *)((long)register0x00000008 + -0x48) = lVar14;
      func_0x0073c9e4(unaff_x19,"Offset (%ld) was beyond file size (%ld)");
      return 0x24;
    }
    *(long *)(lVar30 + 0x18) = lVar22;
joined_r0x00749820:
    if (lVar22 == 0) {
      func_0x00783c98(unaff_x19);
      if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8(unaff_x19,"File already completely downloaded");
      }
      *(undefined4 *)(lVar30 + 0x10) = 2;
      lVar14 = *(long *)(unaff_x19 + 0x18);
      uVar16 = (ulong)*(byte *)(lVar14 + 0x4f6);
      if (((uVar16 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
        *(undefined8 *)((long)register0x00000008 + -0x50) =
             *(undefined8 *)(&UNK_00a1e570 + uVar16 * 8);
        *(char **)((long)register0x00000008 + -0x48) = "STOP";
        func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
      }
      *(undefined1 *)(lVar14 + 0x4f6) = 0;
      return 0;
    }
  }
  if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    *(undefined8 *)((long)register0x00000008 + -0x50) =
         *(undefined8 *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19);
    func_0x0073cab8(unaff_x19,"Instructs server to resume from offset %ld");
  }
  *(undefined8 *)((long)register0x00000008 + -0x50) =
       *(undefined8 *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19);
  uVar33 = func_0x0076e34c(unaff_x19,lVar10 + 1000,"REST %ld");
  if ((int)uVar33 != 0) {
    return uVar33;
  }
  lVar14 = *(long *)(unaff_x19 + 0x18);
  if (((((ulong)*(byte *)(lVar14 + 0x4f6) != 0x1b) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
    *(undefined8 *)((long)register0x00000008 + -0x50) =
         *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(lVar14 + 0x4f6) * 8);
    *(char **)((long)register0x00000008 + -0x48) = "RETR_REST";
    func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
  }
  uVar18 = 0x1b;
code_r0x00749abc:
  *(undefined1 *)(lVar14 + 0x4f6) = uVar18;
  return 0;
  while( true ) {
    piVar13 = (int *)___error();
    iVar6 = *piVar13;
    if ((bool)(bVar4 & iVar6 == 0x31)) {
      if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        uVar33 = func_0x0077ea88(0x31,(undefined1 *)((long)register0x00000008 + -0x631),0x100);
        *(ulong *)((long)register0x00000008 + -0x6e0) = uVar16;
        *(undefined8 *)((long)register0x00000008 + -0x6d8) = uVar33;
        func_0x0073cab8(unaff_x19,"bind(port=%hu) on non-local address failed: %s");
      }
      *(undefined4 *)((long)register0x00000008 + -0x6b0) = 0x80;
      iVar6 = _getsockname(*(undefined4 *)(lVar14 + 0x238),
                           (undefined1 *)((long)register0x00000008 + -0x130),
                           (undefined1 *)((long)register0x00000008 + -0x6b0));
      if (iVar6 != 0) goto code_r0x0074a65c;
      bVar4 = 0;
      uVar7 = uVar19;
    }
    else {
      if ((iVar6 != 0xd) && (iVar6 != 0x30)) {
        uVar33 = func_0x0077ea88(iVar6,(undefined1 *)((long)register0x00000008 + -0x631),0x100);
        *(ulong *)((long)register0x00000008 + -0x6e0) = uVar16;
        *(undefined8 *)((long)register0x00000008 + -0x6d8) = uVar33;
        pcVar15 = "bind(port=%hu) failed: %s";
        goto code_r0x0074a758;
      }
      uVar7 = (uVar7 & 0xffff) + 1;
    }
    if (uVar27 < (uVar7 & 0xffff)) break;
code_r0x0074ab3c:
    uVar16 = (ulong)(uVar7 & 0xffff);
    *(ushort *)((long)register0x00000008 + -0x12e) =
         (ushort)(uVar7 >> 8) & 0xff | (ushort)((uVar7 & 0xff00ff) << 8);
    iVar6 = _bind(*(undefined4 *)((long)register0x00000008 + -0x6ac),
                  (undefined1 *)((long)register0x00000008 + -0x130),
                  *(undefined4 *)((long)register0x00000008 + -0x6b0));
    if (iVar6 == 0) {
      *(undefined4 *)((long)register0x00000008 + -0x6b0) = 0x80;
      iVar6 = _getsockname(*(undefined4 *)((long)register0x00000008 + -0x6ac),
                           (undefined1 *)((long)register0x00000008 + -0x130),
                           (undefined1 *)((long)register0x00000008 + -0x6b0));
      if (iVar6 != 0) goto code_r0x0074a65c;
      if (unaff_x19 == 0) {
        iVar6 = _listen(*(undefined4 *)((long)register0x00000008 + -0x6ac),1);
        if (iVar6 == 0) goto code_r0x0074ad5c;
      }
      else {
        if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
          if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0) {
            if (0 < iRam0000000000a2b570) goto code_r0x0074ac8c;
          }
          else {
            bVar1 = *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8) < 1;
            if ((!bVar1 && iRam0000000000a2b570 != 0) && (bVar1 || -1 < iRam0000000000a2b570)) {
code_r0x0074ac8c:
              if (*(long *)(unaff_x19 + 0x18) == 0) {
                pcVar15 = "???";
              }
              else {
                pcVar15 = *(char **)(&UNK_00a1e570 +
                                    (ulong)*(byte *)(*(long *)(unaff_x19 + 0x18) + 0x4f6) * 8);
              }
              *(char **)((long)register0x00000008 + -0x6e0) = pcVar15;
              *(ulong *)((long)register0x00000008 + -0x6d8) = uVar16;
              func_0x0073cfbc(unaff_x19,"[%s] ftp_state_use_port(), socket bound to port %d");
            }
          }
        }
        iVar6 = _listen(*(undefined4 *)((long)register0x00000008 + -0x6ac),1);
        if (iVar6 == 0) {
          if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
             (((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
            if (*(long *)(unaff_x19 + 0x18) == 0) {
              pcVar15 = "???";
            }
            else {
              pcVar15 = *(char **)(&UNK_00a1e570 +
                                  (ulong)*(byte *)(*(long *)(unaff_x19 + 0x18) + 0x4f6) * 8);
            }
            *(char **)((long)register0x00000008 + -0x6e0) = pcVar15;
            *(ulong *)((long)register0x00000008 + -0x6d8) = uVar16;
            func_0x0073cfbc(unaff_x19,"[%s] ftp_state_use_port(), listening on %d");
          }
code_r0x0074ad5c:
          func_0x0074ef88(lVar30,(undefined1 *)((long)register0x00000008 + -0xb0),0x2f);
          uVar16 = *(ulong *)(lVar14 + 0x398);
          if ((uVar16 & 0x10800) == 0x800) {
            uVar16 = uVar16 | 0x10000;
            *(ulong *)(lVar14 + 0x398) = uVar16;
          }
          cVar17 = *(char *)((long)register0x00000008 + -0x12f);
          uVar19 = (uint)(*(ushort *)((long)register0x00000008 + -0x12e) >> 8);
          uVar27 = *(ushort *)((long)register0x00000008 + -0x12e) & 0xff00ff;
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
  func_0x0073c9e4(unaff_x19,pcVar15);
code_r0x0074a760:
  uVar33 = 0x1e;
  goto code_r0x0074a764;
code_r0x0074ae40:
  cVar17 = *(char *)((long)register0x00000008 + lVar30 + -0xb0);
  if (cVar17 == '.') {
    cVar17 = ',';
  }
  else if (cVar17 == '\0') goto code_r0x0074ae50;
  *(char *)((long)register0x00000008 + lVar30 + -0x6a6) = cVar17;
  lVar30 = lVar30 + 1;
  goto code_r0x0074ae40;
code_r0x0074ae50:
  puVar31 = (undefined1 *)((long)register0x00000008 + -0x6a6);
  puVar31[lVar30] = 0;
  *(ulong *)((long)register0x00000008 + -0x6e0) = (ulong)uVar27;
  *(ulong *)((long)register0x00000008 + -0x6d8) = (ulong)uVar19;
  func_0x00764560(puVar31 + lVar30,0x14,",%d,%d");
  *(undefined **)((long)register0x00000008 + -0x6e0) = &UNK_008cd207;
  *(undefined1 **)((long)register0x00000008 + -0x6d8) = puVar31;
  uVar33 = func_0x0076e34c(unaff_x19,*(undefined8 *)((long)register0x00000008 + -0x6c0),"%s %s");
  if ((int)uVar33 != 0) {
    uVar9 = func_0x0077e9f4();
    *(undefined8 *)((long)register0x00000008 + -0x6e0) = uVar9;
    pcVar15 = "Failure sending PORT command: %s";
code_r0x0074af00:
    func_0x0073c9e4(unaff_x19,pcVar15);
    goto code_r0x0074a764;
  }
  uVar20 = 1;
  goto code_r0x0074ad94;
code_r0x0074adf0:
  do {
    if ((iVar5 != 0) || ((uVar16 & 0x10000) != 0)) {
      if ((iVar5 == 1) && (cVar17 != '\x02')) break;
      if ((cVar17 == '\x1e') || (cVar17 == '\x02')) {
        if (iVar5 == 0) {
          *(undefined1 **)((long)register0x00000008 + -0x6d0) =
               (undefined1 *)((long)register0x00000008 + -0xb0);
          *(ulong *)((long)register0x00000008 + -0x6c8) = (ulong)(uVar19 | uVar27 << 8);
          uVar33 = 1;
          if (cVar17 != '\x02') {
            uVar33 = 2;
          }
          *(undefined **)((long)register0x00000008 + -0x6e0) = &UNK_008cd202;
          *(undefined8 *)((long)register0x00000008 + -0x6d8) = uVar33;
          uVar33 = func_0x0076e34c(unaff_x19,*(undefined8 *)((long)register0x00000008 + -0x6c0),
                                   "%s |%d|%s|%hu|");
          if ((int)uVar33 == 0) {
            uVar20 = 0;
            goto code_r0x0074ad94;
          }
          uVar9 = func_0x0077e9f4();
          *(undefined8 *)((long)register0x00000008 + -0x6e0) = uVar9;
          pcVar15 = "Failure sending EPRT command: %s";
          goto code_r0x0074af00;
        }
        if (iVar5 == 1) {
          lVar30 = 0;
          goto code_r0x0074ae40;
        }
      }
    }
    iVar5 = iVar5 + 1;
  } while (iVar5 != 2);
  uVar20 = 2;
code_r0x0074ad94:
  *(undefined4 *)(lVar14 + 0x4e8) = uVar20;
  func_0x007466c4(unaff_x19,0x1c);
  uVar33 = func_0x0072f958(unaff_x19,lVar14,1,(undefined1 *)((long)register0x00000008 + -0x6ac));
  if ((int)uVar33 == 0) {
    *(undefined4 *)((long)register0x00000008 + -0x6ac) = 0xffffffff;
  }
code_r0x0074a764:
  if (*(long *)((long)register0x00000008 + -0x6b8) != 0) {
    func_0x00750010(unaff_x19,(undefined1 *)((long)register0x00000008 + -0x6b8));
  }
  if ((int)uVar33 == 0) {
    if ((((*(byte *)(lVar14 + 0x39a) >> 1 & 1) == 0) || (-1 < *(char *)(unaff_x19 + 0xa1b))) ||
       (uVar16 = func_0x007315f4(lVar14,1), (uVar16 & 1) != 0)) {
      uVar33 = 0;
    }
    else {
      uVar33 = func_0x00794ee8(unaff_x19,lVar14,1);
    }
    *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) =
         *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) & 0xffffffffffffefff;
    func_0x007706e4(unaff_x19,10);
    iVar5 = 60000;
    if (*(int *)(unaff_x19 + 0x6b8) != 0) {
      iVar5 = *(int *)(unaff_x19 + 0x6b8);
    }
    func_0x00768170(unaff_x19,iVar5,0xd);
    uVar19 = *(uint *)((long)register0x00000008 + -0x6ac);
  }
  else {
    lVar30 = *(long *)(unaff_x19 + 0x18);
    if ((((unaff_x19 != 0) && (bVar4 = *(byte *)(lVar30 + 0x4f6), bVar4 != 0)) &&
        ((*(char *)(unaff_x19 + 0xa1d) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))))) && (0 < iRam0000000000a2b570)) {
      *(undefined8 *)((long)register0x00000008 + -0x6e0) =
           *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar4 * 8);
      *(char **)((long)register0x00000008 + -0x6d8) = "STOP";
      func_0x0073cfbc(unaff_x19,"[%s] -> [%s]");
    }
    *(undefined1 *)(lVar30 + 0x4f6) = 0;
    uVar19 = *(uint *)((long)register0x00000008 + -0x6ac);
  }
  uVar16 = (ulong)uVar19;
  if (uVar19 != 0xffffffff) {
    func_0x0072db20(unaff_x19,lVar14);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)((long)register0x00000008 + -0x78)) {
    return uVar33;
  }
  auVar34 = ___stack_chk_fail();
  *(long *)((long)register0x00000008 + -0x700) = lVar14;
  *(long *)((long)register0x00000008 + -0x6f8) = unaff_x19;
  *(undefined1 **)((long)register0x00000008 + -0x6f0) =
       (undefined1 *)((long)register0x00000008 + -0x10);
  *(undefined **)((long)register0x00000008 + -0x6e8) = &DAT_0074af20;
  puVar2 = (ulong *)(auVar34._0_8_ + 0xa1a);
  uVar21 = *puVar2;
  *puVar2 = uVar21 | 0x8000000;
  uVar33 = func_0x007738a0(auVar34._0_8_,4,auVar34._8_8_,uVar16);
  *puVar2 = *puVar2 & 0xfffffffff0000000 | *puVar2 & 0x7ffffff | uVar21 & 0x8000000;
  return uVar33;
}

