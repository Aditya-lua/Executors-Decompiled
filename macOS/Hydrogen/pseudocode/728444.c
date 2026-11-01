
/* WARNING: Possible PIC construction at 0x007283fc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00728400) */

long FUN_00728444(ulong param_1,ulong param_2,undefined8 param_3,undefined8 param_4,long param_5)

{
  long lVar1;
  byte bVar2;
  bool bVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  undefined *puVar7;
  undefined8 *puVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  byte *pbVar12;
  long lVar13;
  uint uVar14;
  ulong uVar15;
  long unaff_x19;
  uint unaff_w20;
  byte *unaff_x21;
  long unaff_x23;
  char *pcVar16;
  undefined8 unaff_x24;
  long unaff_x25;
  byte *pbVar17;
  undefined8 uVar18;
  byte *unaff_x26;
  byte *pbVar19;
  long unaff_x29;
  undefined1 auVar20 [12];
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined *in_stack_00000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  long lStack0000000000000058;
  long in_stack_00000060;
  undefined8 uStack0000000000000078;
  undefined1 uStack0000000000000080;
  
  lStack0000000000000058 = param_5;
  do {
    puVar7 = (undefined *)0x7fffffffffffffff;
    if ((long)in_stack_00000040 <= (long)param_1) {
      puVar7 = in_stack_00000040 + param_2;
    }
    *(undefined **)(unaff_x25 + 0x20) = puVar7;
    *(byte *)(unaff_x25 + 0x28) = in_stack_00000048._4_1_ & 1;
    pbVar12 = (byte *)(unaff_x25 + 0x30);
    func_0x0075e474(in_stack_00000018,unaff_x25);
    lVar13 = lStack0000000000000058;
    if (unaff_x19 != 0) {
      if (*(char *)(in_stack_00000060 + 3) < '\0') {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) != 0) {
          if (*(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8) < 1) goto LAB_00728500;
        }
        func_0x0073cab8();
        lVar13 = lStack0000000000000058;
      }
    }
LAB_00728500:
    do {
      do {
        bVar2 = *unaff_x26;
        if (bVar2 == 0x2c) {
          do {
            do {
              pbVar19 = unaff_x26;
              unaff_x26 = pbVar19 + 1;
              bVar2 = *unaff_x26;
            } while (bVar2 == 9);
          } while (bVar2 == 0x20);
          pbVar17 = (byte *)0x0;
          while ((0x3d < bVar2 || ((1L << ((ulong)bVar2 & 0x3f) & 0x2800000100000201U) == 0))) {
            bVar2 = (pbVar19 + (long)pbVar17)[2];
            pbVar17 = pbVar17 + 1;
          }
          uVar14 = (uint)lVar13;
          if ((pbVar17 != (byte *)0x0) &&
             (pbVar17 + 1 < (byte *)((long)&MACH_HEADER.cpusubtype + 3))) {
            lVar13 = 10;
            pbVar12 = pbVar17;
            ___memcpy_chk(unaff_x29 + -0x70,unaff_x26);
            pbVar17[unaff_x29 + -0x70] = 0;
            unaff_x26 = pbVar19 + (long)pbVar17 + 1;
            bVar2 = *unaff_x26;
            goto LAB_0072859c;
          }
LAB_00727f30:
          unaff_w20 = uVar14;
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
            return 0;
          }
          auVar20 = ___stack_chk_fail();
          in_stack_00000030._4_4_ = auVar20._8_4_;
          unaff_x23 = auVar20._0_8_;
          unaff_x21 = pbVar12;
code_r0x007285c8:
          lVar13 = func_0x00740a58(unaff_x23 + 8);
          if (lVar13 == 0) {
            return 0;
          }
          goto code_r0x00728614;
        }
LAB_0072859c:
        uVar14 = (uint)lVar13;
        if (((bVar2 < 0x3c) && ((1L << ((ulong)bVar2 & 0x3f) & 0x800000000002401U) != 0)) ||
           (bVar2 != 0x3d)) goto LAB_00727f30;
        iVar5 = func_0x007349f4(unaff_x29 + -0x70,unaff_x24);
        uVar14 = (uint)lVar13;
        if (unaff_x26[1] != 0x22) goto LAB_00727f30;
        pcVar16 = (char *)(unaff_x26 + 2);
        bVar2 = *pcVar16;
        pbVar19 = (byte *)pcVar16;
        if (bVar2 == 0) {
code_r0x0072804c:
          lStack0000000000000058 = (long)pbVar19 - (long)pcVar16;
code_r0x00728050:
          bVar4 = lStack0000000000000058 - 1U < 0x7ff;
          if (((!bVar4) && (pcVar16 = "", unaff_x19 != 0)) &&
             (pcVar16 = "", *(char *)(in_stack_00000060 + 3) < '\0')) {
            if ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) == 0) ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8))) {
              func_0x0073cab8();
            }
            pcVar16 = "";
          }
          bVar2 = *pbVar19;
          if (bVar2 == 0x3a) {
            pbVar17 = pbVar19 + 1;
            if (*pbVar17 - 0x30 < 10) goto code_r0x007280dc;
code_r0x0072814c:
            uStack0000000000000078 = pbVar17;
            goto code_r0x00728150;
          }
        }
        else {
          if (bVar2 != 0x3a) {
            if (bVar2 != 0x5b) {
              do {
                uVar14 = (uint)bVar2;
                if (((9 < uVar14 - 0x30 && 0x19 < uVar14 - 0x61) && (0x19 < uVar14 - 0x41)) &&
                   (1 < uVar14 - 0x2d)) break;
                pbVar19 = pbVar19 + 1;
                bVar2 = *pbVar19;
              } while (bVar2 != 0);
              goto code_r0x0072804c;
            }
            pbVar19 = unaff_x26 + 3;
            lVar11 = _strspn(pbVar19,"0123456789abcdefABCDEF:.");
            uVar14 = (uint)lVar13;
            if (pbVar19[lVar11] != 0x5d) goto LAB_00727f30;
            lStack0000000000000058 = lVar11 + 2;
            pbVar19 = pbVar19 + lVar11 + 1;
            goto code_r0x00728050;
          }
          lStack0000000000000058 = _strlen();
          bVar4 = true;
          pbVar17 = unaff_x26 + 3;
          pcVar16 = (char *)unaff_x21;
          if (9 < *pbVar17 - 0x30) goto code_r0x0072814c;
code_r0x007280dc:
          pbVar12 = (byte *)((long)&MACH_HEADER.cpusubtype + 2);
          lVar11 = _strtoul(pbVar17,&uStack0000000000000078);
          pbVar19 = uStack0000000000000078;
          if (lVar11 - 0x10000U < 0xffffffffffff0001) {
code_r0x00728150:
            pbVar19 = pbVar17;
            if (((unaff_x19 != 0) && (*(char *)(in_stack_00000060 + 3) < '\0')) &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
            bVar4 = false;
          }
          else {
            if (uStack0000000000000078 == pbVar17) goto code_r0x00728150;
            if (*uStack0000000000000078 != 0x22) goto code_r0x00728150;
            func_0x0078bbc8();
          }
          bVar2 = *pbVar19;
        }
        uVar14 = (uint)lVar13;
        if (bVar2 != 0x22) goto LAB_00727f30;
        bVar3 = false;
        in_stack_00000048._4_1_ = 0;
        pbVar19 = pbVar19 + 1;
        in_stack_00000040 = &UNK_00015180;
        while( true ) {
          pbVar17 = pbVar19 + 2;
          while( true ) {
            unaff_x26 = pbVar19 + 1;
            bVar2 = *pbVar19;
            if ((bVar2 != 9) && (bVar2 != 0x20)) break;
            pbVar17 = pbVar17 + 1;
            pbVar19 = unaff_x26;
          }
          if (bVar2 != 0x3b) break;
          bVar2 = *unaff_x26;
          if (bVar2 < 0xe && (1 << (ulong)(bVar2 & 0x1f) & 0x2401U) != 0) goto code_r0x007283d0;
          while ((bVar2 == 9 || (bVar2 == 0x20))) {
            unaff_x26 = unaff_x26 + 1;
            pbVar17 = pbVar17 + 1;
            bVar2 = *unaff_x26;
          }
          pbVar19 = (byte *)0x0;
          while ((0x3d < bVar2 || ((1L << ((ulong)bVar2 & 0x3f) & 0x2800000100000201U) == 0))) {
            bVar2 = *pbVar17;
            pbVar19 = pbVar19 + 1;
            pbVar17 = pbVar17 + 1;
          }
          if ((pbVar19 == (byte *)0x0) || ((byte *)((long)&MACH_HEADER.reserved + 3) < pbVar19)) {
            uStack0000000000000080 = 0;
          }
          else {
            lVar13 = 0x20;
            pbVar12 = pbVar19;
            ___memcpy_chk(&uStack0000000000000080,unaff_x26);
            (&uStack0000000000000080)[(long)pbVar19] = 0;
          }
          uVar14 = (uint)lVar13;
          for (pbVar19 = unaff_x26 + (long)pbVar19;
              (bVar2 = *pbVar19, bVar2 == 9 || (bVar2 == 0x20)); pbVar19 = pbVar19 + 1) {
            pbVar17 = pbVar17 + 1;
          }
          if (bVar2 != 0x3d) goto LAB_00727f30;
          uVar15 = (ulong)*pbVar17;
          if (*pbVar17 < 0x23) {
code_r0x007282d4:
                    /* WARNING: Could not find normalized switch variable to match jumptable */
            switch(uVar15) {
            case 0:
              goto LAB_00727f30;
            default:
              break;
            case 9:
            case 0x20:
              goto code_r0x007282e4;
            case 0x22:
              pbVar17 = pbVar17 + 1;
              goto code_r0x00728338;
            }
          }
code_r0x007282f0:
          pbVar19 = pbVar17;
          if (bVar3) {
code_r0x00728338:
            bVar2 = *pbVar17;
            pbVar19 = pbVar17;
            while ((pbVar19 = pbVar19 + 1, bVar2 != 0 && (bVar2 != 0x22))) {
              bVar2 = *pbVar19;
            }
            if (bVar2 == 0) goto LAB_00727f30;
            bVar3 = true;
          }
          else {
            while ((0x3b < (uint)uVar15 || ((1L << (uVar15 & 0x3f) & 0x800100100000201U) == 0))) {
              pbVar19 = pbVar19 + 1;
              uVar15 = (ulong)*pbVar19;
            }
            bVar3 = false;
          }
          pbVar12 = (byte *)((long)&MACH_HEADER.cpusubtype + 2);
          puVar7 = (undefined *)_strtoul(pbVar17,&uStack0000000000000078);
          if (uStack0000000000000078 != pbVar17 && puVar7 != (undefined *)0xffffffffffffffff) {
            iVar6 = func_0x0077e6f8("ma",&uStack0000000000000080);
            if (iVar6 == 0) {
              iVar6 = func_0x0077e6f8("persist",&uStack0000000000000080);
              in_stack_00000048._4_1_ =
                   (iVar6 != 0 && puVar7 == (undefined *)0x1) | in_stack_00000048._4_1_;
            }
            else {
              in_stack_00000040 = puVar7;
            }
          }
        }
        unaff_x26 = pbVar19;
code_r0x007283d0:
        bVar4 = (bool)(bVar4 ^ 1);
        if (iVar5 == 0) {
          bVar4 = true;
        }
        unaff_x24 = in_stack_00000038;
      } while (bVar4);
      if (in_stack_00000050 == 0) goto code_r0x007285c8;
      in_stack_00000050 = in_stack_00000050 + 1;
      unaff_x25 = func_0x007286e8();
      pbVar12 = (byte *)pcVar16;
      lVar13 = lStack0000000000000058;
    } while (unaff_x25 == 0);
    param_2 = _time(0);
    param_1 = param_2 ^ 0x7fffffffffffffff;
  } while( true );
code_r0x007282e4:
  pbVar17 = pbVar17 + 1;
  uVar15 = (ulong)*pbVar17;
  if (0x22 < *pbVar17) goto code_r0x007282f0;
  goto code_r0x007282d4;
code_r0x00728614:
  puVar8 = (undefined8 *)func_0x00156654(lVar13);
  lVar9 = func_0x006f4058(lVar13);
  lVar11 = lVar9;
  if ((*(int *)((long)puVar8 + 0xc) == in_stack_00000030._4_4_) &&
     (*(ushort *)(puVar8 + 1) == unaff_w20)) {
    uVar18 = *puVar8;
    lVar10 = _strlen(unaff_x21);
    lVar11 = _strlen(uVar18);
    if (lVar10 == 0) {
      if (lVar11 == 0) goto code_r0x0072868c;
    }
    else {
      lVar1 = lVar10 + -1;
      if (unaff_x21[lVar10 + -1] != 0x2e) {
        lVar1 = lVar10;
      }
      if (lVar1 == lVar11) {
code_r0x0072868c:
        lVar11 = func_0x0077e76c(unaff_x21,uVar18);
        if ((int)lVar11 != 0) {
          func_0x0075e5fc(lVar13);
          (*pcRam0000000000a2b5f0)(*puVar8);
          (*pcRam0000000000a2b5f0)(puVar8[2]);
          lVar11 = (*pcRam0000000000a2b5f0)(puVar8);
        }
      }
    }
  }
  lVar13 = lVar9;
  if (lVar9 == 0) {
    return lVar11;
  }
  goto code_r0x00728614;
}

