
/* WARNING: Possible PIC construction at 0x005ac5f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ac6a4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ac714: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ac77c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005aa8e8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005aa9ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005aa9dc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ab27c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ab438: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ac544: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ac1ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ab178: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ab4a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005aa6c0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005aa640: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005aa72c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005aa75c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005aa730) */
/* WARNING: Removing unreachable block (ram,0x005aa734) */
/* WARNING: Removing unreachable block (ram,0x005aa644) */
/* WARNING: Removing unreachable block (ram,0x005aa6c4) */
/* WARNING: Removing unreachable block (ram,0x005aa6c8) */
/* WARNING: Removing unreachable block (ram,0x005aa6ec) */
/* WARNING: Removing unreachable block (ram,0x005ab4ac) */
/* WARNING: Removing unreachable block (ram,0x005ab17c) */
/* WARNING: Removing unreachable block (ram,0x005ab18c) */
/* WARNING: Removing unreachable block (ram,0x005ac1b0) */
/* WARNING: Removing unreachable block (ram,0x005ac1b4) */
/* WARNING: Removing unreachable block (ram,0x005ac1d8) */
/* WARNING: Removing unreachable block (ram,0x005ac548) */
/* WARNING: Removing unreachable block (ram,0x005ac568) */
/* WARNING: Removing unreachable block (ram,0x005ab43c) */
/* WARNING: Removing unreachable block (ram,0x005ab280) */
/* WARNING: Removing unreachable block (ram,0x005ab284) */
/* WARNING: Removing unreachable block (ram,0x005aa9b0) */
/* WARNING: Removing unreachable block (ram,0x005aa9b4) */
/* WARNING: Removing unreachable block (ram,0x005aa9e0) */
/* WARNING: Removing unreachable block (ram,0x005aa8ec) */
/* WARNING: Removing unreachable block (ram,0x005aa8f0) */
/* WARNING: Removing unreachable block (ram,0x005aa914) */
/* WARNING: Removing unreachable block (ram,0x005ac780) */
/* WARNING: Removing unreachable block (ram,0x005ac784) */
/* WARNING: Removing unreachable block (ram,0x005ac7a8) */
/* WARNING: Removing unreachable block (ram,0x005ac718) */
/* WARNING: Removing unreachable block (ram,0x005ac7ac) */
/* WARNING: Removing unreachable block (ram,0x005ac7b0) */
/* WARNING: Removing unreachable block (ram,0x005ac7e8) */
/* WARNING: Removing unreachable block (ram,0x005ac808) */
/* WARNING: Removing unreachable block (ram,0x005ac818) */
/* WARNING: Removing unreachable block (ram,0x005ac71c) */
/* WARNING: Removing unreachable block (ram,0x005ac6a8) */
/* WARNING: Removing unreachable block (ram,0x005ac6ac) */
/* WARNING: Removing unreachable block (ram,0x005ac5f4) */
/* WARNING: Removing unreachable block (ram,0x005ac5f8) */
/* WARNING: Removing unreachable block (ram,0x005ac5fc) */
/* WARNING: Removing unreachable block (ram,0x005ac618) */
/* WARNING: Removing unreachable block (ram,0x005ac628) */
/* WARNING: Removing unreachable block (ram,0x005aa760) */
/* WARNING: Removing unreachable block (ram,0x005aa764) */
/* WARNING: Removing unreachable block (ram,0x005aa768) */
/* WARNING: Removing unreachable block (ram,0x005aa78c) */
/* WARNING: Removing unreachable block (ram,0x005aa648) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong * FUN_005ad5fc(undefined8 param_1,undefined8 param_2)

{
  byte bVar1;
  bool bVar2;
  bool bVar3;
  bool bVar4;
  bool bVar5;
  bool bVar6;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 *puVar12;
  undefined1 *puVar13;
  int iVar14;
  ulong *puVar15;
  ulong uVar16;
  long *plVar17;
  long lVar18;
  undefined8 *puVar19;
  byte *pbVar20;
  long lVar21;
  long *plVar22;
  ulong *unaff_x19;
  ulong *puVar23;
  undefined8 *unaff_x20;
  undefined8 *puVar24;
  char *unaff_x21;
  ulong *unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  undefined *puVar25;
  char in_wzr;
  double dVar26;
  undefined1 auVar27 [16];
  ulong *in_stack_00000000;
  ulong *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 *in_stack_00000020;
  undefined *in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  auVar27._8_8_ = in_stack_00000010;
  auVar27._0_8_ = in_stack_00000018;
  func_0x007aff64(param_1,param_2,1000000000);
  unaff_x20[1] = unaff_x20[1] + 1;
  uVar16 = func_0x005a9a80();
  if ((uVar16 & 1) == 0) {
    unaff_x20[1] = unaff_x20[1] + -1;
    if (*unaff_x21 == '\x01') {
      *unaff_x21 = in_wzr;
    }
    else {
      func_0x007b05dc();
    }
    puVar24 = (undefined8 *)*unaff_x20;
    uVar16 = (**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aec7a,1);
    if ((((uVar16 & 1) == 0) &&
        (uVar16 = func_0x005a9610(*(undefined1 *)(unaff_x20 + 2),
                                  *(undefined1 *)((long)unaff_x20 + 0x11)), (uVar16 & 1) == 0)) &&
       (uVar16 = (**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aed93,6), (uVar16 & 1) == 0)) {
      puVar12 = &uStack0000000000000030;
code_r0x005ab01c:
      while( true ) {
        puVar15 = unaff_x19;
        puVar13 = puVar12 + -0xf0;
        *(undefined8 *)(puVar12 + -0x40) = unaff_x24;
        *(ulong **)(puVar12 + -0x38) = unaff_x23;
        *(ulong **)(puVar12 + -0x30) = in_stack_00000000;
        *(ulong **)(puVar12 + -0x28) = in_stack_00000008;
        *(long *)(puVar12 + -0x20) = auVar27._8_8_;
        *(long *)(puVar12 + -0x18) = auVar27._0_8_;
        *(undefined1 **)(puVar12 + -0x10) = in_stack_00000020;
        *(undefined **)(puVar12 + -8) = in_stack_00000028;
        in_stack_00000020 = puVar12 + -0x10;
        *(ulong **)(puVar12 + -0xe0) = puVar15;
        uVar16 = *puVar15;
        if (6 < (long)uVar16) break;
        if ((long)uVar16 < 5) {
          if (uVar16 == 2) {
            lVar18 = 8;
            goto code_r0x005ab2b8;
          }
          if (uVar16 != 3) goto code_r0x005ab370;
code_r0x005ab0ac:
          auVar27._8_8_ = puVar15 + 1;
          auVar27._0_8_ = unaff_x20;
          auVar7._8_8_ = puVar15 + 1;
          auVar7._0_8_ = unaff_x20;
          in_stack_00000000 = *(ulong **)(puVar12 + -0x30);
          in_stack_00000008 = *(ulong **)(puVar12 + -0x28);
          unaff_x24 = *(undefined8 *)(puVar12 + -0x40);
          unaff_x23 = *(ulong **)(puVar12 + -0x38);
          *(ulong **)(puVar12 + -0x30) = in_stack_00000000;
          *(ulong **)(puVar12 + -0x28) = in_stack_00000008;
          *(undefined8 *)(puVar12 + -0x20) = *(undefined8 *)(puVar12 + -0x20);
          *(undefined8 *)(puVar12 + -0x18) = *(undefined8 *)(puVar12 + -0x18);
          *(undefined8 *)(puVar12 + -0x10) = *(undefined8 *)(puVar12 + -0x10);
          *(undefined8 *)(puVar12 + -8) = *(undefined8 *)(puVar12 + -8);
          in_stack_00000020 = puVar12 + -0x10;
          unaff_x19 = (ulong *)puVar15[7];
          uVar16 = *unaff_x19;
          if (uVar16 < 2 || uVar16 == 7) {
code_r0x005ac710:
            in_stack_00000028 = &UNK_005ac718;
            puVar12 = puVar12 + -0x70;
            auVar27 = auVar7;
          }
          else {
            if (uVar16 == 0xb) {
              uVar16 = unaff_x19[1] ^ 0x8000000000000000;
              if (1 < uVar16) {
                uVar16 = 2;
              }
              if (uVar16 - 1 < 2) goto code_r0x005ac710;
            }
            uVar16 = (**(code **)(((undefined8 *)*unaff_x20)[1] + 0x18))
                               (*(undefined8 *)*unaff_x20,&UNK_008aec78,1);
            if ((uVar16 & 1) != 0) {
              return (ulong *)((long)&MACH_HEADER.magic + 1);
            }
            in_stack_00000028 = &UNK_005ac780;
            puVar12 = puVar12 + -0x70;
            in_stack_00000008 = (ulong *)((long)&MACH_HEADER.magic + 1);
            in_stack_00000000 = unaff_x19;
          }
        }
        else {
          if (uVar16 != 5) {
            if ((uVar16 != 6) || (puVar15[1] != 0x8000000000000002)) goto code_r0x005ab370;
            dVar26 = (double)puVar15[2];
            puVar24 = unaff_x20;
            if (ABS(dVar26) == INFINITY) {
              *(undefined8 *)(puVar12 + -0xe8) = 0;
              *(double *)(puVar12 + -0xf0) = dVar26;
              puVar23 = (ulong *)((long)&MACH_HEADER.magic + 1);
              uVar16 = (**(code **)(((undefined8 *)*unaff_x20)[1] + 0x18))
                                 (*(undefined8 *)*unaff_x20,&UNK_008aec78,1);
              if ((uVar16 & 1) != 0) {
                return puVar23;
              }
              *(ulong *)(puVar12 + -0xb0) =
                   *(ulong *)(puVar12 + -0xf0) & 0x8007ffffffffffff ^ 0x3ff0000000000000;
              *(undefined8 *)(puVar12 + -0xb8) = _UNK_0089eb38;
              *(undefined8 *)(puVar12 + -0xc0) = _UNK_0089eb30;
              *(undefined8 *)(puVar12 + -0x70) = 0;
              *(undefined8 *)(puVar12 + -0x78) = _UNK_0089eb38;
              *(undefined8 *)(puVar12 + -0x80) = _UNK_0089eb30;
              func_0x005c1d84(puVar12 + -0xd8,puVar12 + -0xc0,puVar12 + -0x80,3);
              puVar15 = (ulong *)(puVar12 + -0xd8);
              puVar25 = &UNK_005ab17c;
              puVar13 = puVar12 + -0xf0;
            }
            else {
              if (!NAN(dVar26)) goto code_r0x005ab370;
              puVar19 = (undefined8 *)*unaff_x20;
              puVar23 = (ulong *)((long)&MACH_HEADER.magic + 1);
              *(undefined **)(puVar12 + -0x80) = &UNK_009f1dd0;
              *(undefined8 *)(puVar12 + -0x78) = 1;
              *(undefined8 *)(puVar12 + -0x68) = 0;
              *(undefined8 *)(puVar12 + -0x60) = 0;
              *(undefined8 *)(puVar12 + -0x70) = 8;
              uVar16 = func_0x001ee828(*puVar19,puVar19[1],puVar12 + -0x80);
              if ((uVar16 & 1) != 0) {
                return puVar23;
              }
              *(undefined8 *)(puVar12 + -0xb0) = 0;
              *(undefined8 *)(puVar12 + -0xb8) = _UNK_0089eb38;
              *(undefined8 *)(puVar12 + -0xc0) = _UNK_0089eb30;
              *(undefined8 *)(puVar12 + -0x70) = 0;
              *(undefined8 *)(puVar12 + -0x78) = _UNK_0089eb38;
              *(undefined8 *)(puVar12 + -0x80) = _UNK_0089eb30;
              func_0x005c1d84(puVar12 + -0xd8,puVar12 + -0xc0,puVar12 + -0x80,3);
              puVar15 = (ulong *)(puVar12 + -0xd8);
              puVar25 = &UNK_005ab4ac;
            }
            goto code_r0x005aa890;
          }
          unaff_x24 = *(undefined8 *)(puVar12 + -0x40);
          *(ulong *)(puVar12 + -0x60) = unaff_x28;
          *(long *)(puVar12 + -0x58) = unaff_x27;
          *(ulong *)(puVar12 + -0x50) = unaff_x26;
          *(long *)(puVar12 + -0x48) = unaff_x25;
          *(undefined8 *)(puVar12 + -0x40) = unaff_x24;
          *(undefined8 *)(puVar12 + -0x38) = *(undefined8 *)(puVar12 + -0x38);
          *(undefined8 *)(puVar12 + -0x30) = *(undefined8 *)(puVar12 + -0x30);
          *(undefined8 *)(puVar12 + -0x28) = *(undefined8 *)(puVar12 + -0x28);
          *(undefined8 *)(puVar12 + -0x20) = *(undefined8 *)(puVar12 + -0x20);
          *(undefined8 *)(puVar12 + -0x18) = *(undefined8 *)(puVar12 + -0x18);
          *(undefined8 *)(puVar12 + -0x10) = *(undefined8 *)(puVar12 + -0x10);
          *(undefined8 *)(puVar12 + -8) = *(undefined8 *)(puVar12 + -8);
          in_stack_00000020 = puVar12 + -0x10;
          unaff_x19 = (ulong *)puVar15[2];
          auVar27._8_8_ = unaff_x19;
          auVar27._0_8_ = unaff_x20;
          auVar11._8_8_ = unaff_x19;
          auVar11._0_8_ = unaff_x20;
          auVar10._8_8_ = unaff_x19;
          auVar10._0_8_ = unaff_x20;
          auVar9._8_8_ = unaff_x19;
          auVar9._0_8_ = unaff_x20;
          unaff_x26 = puVar15[3];
          unaff_x27 = unaff_x26 * 0x80;
          if (unaff_x26 != 0) {
            lVar18 = 0;
            do {
              if (unaff_x27 == lVar18) {
                unaff_x28 = 1;
                goto code_r0x005aa52c;
              }
              plVar17 = (long *)((long)unaff_x19 + lVar18);
              lVar18 = lVar18 + 0x80;
            } while (*plVar17 == 0xc);
            func_0x005a4554(puVar12 + -0xb0,unaff_x19,unaff_x19 + unaff_x26 * 0x10,&UNK_009f1ca0);
            if (*(long *)(puVar12 + -0xa0) == 0) {
              unaff_x28 = 0;
            }
            else {
              lVar21 = *(long *)(puVar12 + -0xa0) << 3;
              lVar18 = -1;
              plVar17 = *(long **)(puVar12 + -0xa8);
              while (unaff_x28 = (ulong)(lVar21 == 0), lVar21 != 0) {
                plVar22 = (long *)*plVar17;
                if ((*plVar22 != 6) || (plVar22[1] != -0x7ffffffffffffffe)) break;
                lVar18 = lVar18 + 1;
                lVar21 = lVar21 + -8;
                plVar17 = plVar17 + 1;
                if (lVar18 != (long)((double)plVar22[2] + -1.0)) break;
              }
            }
            if (*(long *)(puVar12 + -0xb0) != 0) {
              func_0x00187bd4(*(undefined8 *)(puVar12 + -0xa8),*(long *)(puVar12 + -0xb0) << 3,8);
            }
code_r0x005aa52c:
            if (((int)unaff_x28 != 0) && (unaff_x26 < 4)) goto code_r0x005aa538;
            puVar24 = (undefined8 *)*unaff_x20;
            uVar16 = (**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aeca9,1);
            if ((uVar16 & 1) != 0) {
              return (ulong *)((long)&MACH_HEADER.magic + 1);
            }
code_r0x005aa5b0:
            uVar16 = (**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aec7a,1);
            if ((uVar16 & 1) != 0) {
              return (ulong *)((long)&MACH_HEADER.magic + 1);
            }
            lVar18 = unaff_x20[1];
            unaff_x20[1] = lVar18 + 1;
            if (unaff_x26 != 0) {
              unaff_x23 = (ulong *)&UNK_008aec7a;
              in_stack_00000000 = (ulong *)((long)&MACH_HEADER.magic + 1);
              goto code_r0x005aa630;
            }
            unaff_x20[1] = lVar18;
code_r0x005aa7ec:
            uVar16 = (**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aec7a,1);
            if ((uVar16 & 1) != 0) {
              return (ulong *)((long)&MACH_HEADER.magic + 1);
            }
            iVar14 = func_0x005a9610(*(undefined1 *)(unaff_x20 + 2),
                                     *(undefined1 *)((long)unaff_x20 + 0x11),unaff_x20,unaff_x20[1])
            ;
            if (iVar14 != 0) {
code_r0x005aa824:
              return (ulong *)((long)&MACH_HEADER.magic + 1);
            }
code_r0x005aa850:
            puVar15 = (ulong *)(**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aecaa,1);
            return puVar15;
          }
code_r0x005aa538:
          puVar15 = unaff_x19;
          lVar18 = unaff_x27;
          do {
            lVar21 = lVar18;
            if (lVar21 == 0) break;
            puVar23 = puVar15 + 8;
            puVar15 = puVar15 + 0x10;
            lVar18 = lVar21 + -0x80;
          } while (*puVar23 != 5);
          puVar24 = (undefined8 *)*unaff_x20;
          uVar16 = (**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aeca9,1);
          if ((uVar16 & 1) != 0) {
            return (ulong *)((long)&MACH_HEADER.magic + 1);
          }
          if (lVar21 != 0) {
            unaff_x28 = 1;
            goto code_r0x005aa5b0;
          }
          if (unaff_x26 == 0) goto code_r0x005aa850;
          uVar16 = (**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aec74,1);
          if ((uVar16 & 1) != 0) {
            return (ulong *)((long)&MACH_HEADER.magic + 1);
          }
          in_stack_00000000 = (ulong *)0x0;
          unaff_x20[1] = unaff_x20[1] + 1;
          unaff_x23 = (ulong *)&UNK_008aec74;
          unaff_x28 = 1;
code_r0x005aa630:
          in_stack_00000008 = (ulong *)((long)&MACH_HEADER.magic + 1);
          unaff_x25 = unaff_x26 - 1;
          if (unaff_x19 == (ulong *)0x0) {
            puVar24 = (undefined8 *)*unaff_x20;
            unaff_x20[1] = unaff_x20[1] + -1;
            if (in_stack_00000000 == (ulong *)0x0) {
              if (unaff_x26 != 0) {
                uVar16 = (**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aec74,1);
                if ((uVar16 & 1) != 0) {
                  return (ulong *)((long)&MACH_HEADER.magic + 1);
                }
              }
              goto code_r0x005aa850;
            }
            goto code_r0x005aa7ec;
          }
          if (((int)in_stack_00000000 != 0) &&
             (uVar16 = func_0x005a9610(*(undefined1 *)(unaff_x20 + 2),
                                       *(undefined1 *)((long)unaff_x20 + 0x11),unaff_x20,
                                       unaff_x20[1]), (uVar16 & 1) != 0)) goto code_r0x005aa824;
          if ((unaff_x25 == 0) && (*unaff_x19 == 0xc)) {
            if (unaff_x19[8] == 0xb) {
              in_stack_00000008 = (ulong *)((long)&MACH_HEADER.magic + 1);
              uVar16 = (**(code **)(((undefined8 *)*unaff_x20)[1] + 0x18))
                                 (*(undefined8 *)*unaff_x20,&UNK_008aec78,1);
              if ((uVar16 & 1) != 0) {
code_r0x005aa7d0:
                return (ulong *)((long)&MACH_HEADER.magic + 1);
              }
              in_stack_00000028 = &UNK_005aa6c4;
              puVar12 = puVar12 + -0xb0;
              unaff_x19 = unaff_x19 + 8;
              auVar27 = auVar9;
            }
            else {
              in_stack_00000028 = &UNK_005aa644;
              puVar12 = puVar12 + -0xb0;
              unaff_x19 = unaff_x19 + 8;
              auVar27 = auVar10;
            }
          }
          else if (((int)unaff_x28 == 0) && (*unaff_x19 != 0xc)) {
            in_stack_00000008 = (ulong *)((long)&MACH_HEADER.magic + 1);
            uVar16 = (**(code **)(((undefined8 *)*unaff_x20)[1] + 0x18))
                               (*(undefined8 *)*unaff_x20,&UNK_008aecab,1);
            if ((uVar16 & 1) != 0) goto code_r0x005aa7d0;
            in_stack_00000028 = &UNK_005aa730;
            puVar12 = puVar12 + -0xb0;
            auVar27 = auVar11;
          }
          else {
            in_stack_00000028 = &UNK_005aa760;
            puVar12 = puVar12 + -0xb0;
            unaff_x19 = unaff_x19 + 8;
          }
        }
      }
      if ((long)uVar16 < 9) {
        if (uVar16 == 7) {
          auVar27._8_8_ = puVar15 + 1;
          auVar27._0_8_ = unaff_x20;
          puVar23 = *(ulong **)(puVar12 + -0x30);
          in_stack_00000008 = *(ulong **)(puVar12 + -0x28);
          unaff_x24 = *(undefined8 *)(puVar12 + -0x40);
          unaff_x23 = *(ulong **)(puVar12 + -0x38);
          puVar13 = puVar12 + -0x80;
          *(ulong **)(puVar12 + -0x30) = puVar23;
          *(ulong **)(puVar12 + -0x28) = in_stack_00000008;
          *(undefined8 *)(puVar12 + -0x20) = *(undefined8 *)(puVar12 + -0x20);
          *(undefined8 *)(puVar12 + -0x18) = *(undefined8 *)(puVar12 + -0x18);
          *(undefined8 *)(puVar12 + -0x10) = *(undefined8 *)(puVar12 + -0x10);
          *(undefined8 *)(puVar12 + -8) = *(undefined8 *)(puVar12 + -8);
          in_stack_00000020 = puVar12 + -0x10;
          in_stack_00000000 = (ulong *)puVar15[1];
          uVar16 = *in_stack_00000000;
          if (uVar16 < 2 || uVar16 == 7) {
code_r0x005ac078:
            uVar16 = func_0x005ab01c(unaff_x20);
            if ((uVar16 & 1) != 0) {
              return (ulong *)((long)&MACH_HEADER.magic + 1);
            }
            unaff_x19 = (ulong *)puVar15[2];
            auVar27._8_8_ = unaff_x19;
            if ((*unaff_x19 == 6) && (-0x7ffffffffffffffc < (long)unaff_x19[1])) {
              pbVar20 = (byte *)unaff_x19[2];
              uVar16 = unaff_x19[3];
              if (uVar16 == 0) {
code_r0x005ac0dc:
                func_0x0046b8d0(puVar12 + -0x80);
                plVar17 = *(long **)(puVar12 + -0x78);
                if (*(int *)(puVar12 + -0x80) != 0) {
                  plVar17 = (long *)((long)&MACH_HEADER.magic + 1);
                }
                lVar18 = 0;
                if (*(int *)(puVar12 + -0x80) == 0) {
                  lVar18 = *(long *)(puVar12 + -0x70);
                }
                if (lVar18 == 3) {
                  if ((short)*plVar17 != 0x6e61 || *(char *)((long)plVar17 + 2) != 'd') {
code_r0x005ac214:
                    bVar2 = false;
code_r0x005ac218:
                    if (lVar18 != 6) {
                      if (lVar18 == 4) {
                        if ((int)*plVar17 == 0x65736c65) goto code_r0x005ac518;
                        bVar3 = false;
                        bVar5 = true;
                      }
                      else {
                        bVar3 = false;
                        bVar5 = false;
                      }
                      goto code_r0x005ac2a8;
                    }
                    if ((int)*plVar17 == 0x65736c65 && *(short *)((long)plVar17 + 4) == 0x6669)
                    goto code_r0x005ac518;
                    bVar3 = false;
                    bVar5 = false;
                    bVar6 = false;
                    bVar4 = true;
                    if (bVar2) goto code_r0x005ac2d8;
                    goto joined_r0x005ac378;
                  }
                }
                else {
                  if (lVar18 != 2) {
                    if (lVar18 != 5) goto code_r0x005ac214;
                    if ((int)*plVar17 == 0x61657262 && *(char *)((long)plVar17 + 4) == 'k')
                    goto code_r0x005ac518;
                    bVar2 = true;
                    goto code_r0x005ac218;
                  }
                  if ((short)*plVar17 == 0x6f64) goto code_r0x005ac518;
                  bVar2 = false;
                  bVar5 = false;
                  bVar3 = true;
code_r0x005ac2a8:
                  if ((lVar18 != 3) ||
                     ((short)*plVar17 != 0x6e65 || *(char *)((long)plVar17 + 2) != 'd')) {
                    bVar4 = false;
                    bVar6 = false;
                    if (bVar2) {
code_r0x005ac2d8:
                      if ((int)*plVar17 == 0x736c6166 && *(char *)((long)plVar17 + 4) == 'e')
                      goto code_r0x005ac518;
                      bVar6 = true;
                    }
                    if (lVar18 == 3) {
                      if ((short)*plVar17 != 0x6f66 || *(char *)((long)plVar17 + 2) != 'r') {
joined_r0x005ac378:
                        if (bVar3) {
                          if (((short)*plVar17 == 0x6669) || ((short)*plVar17 == 0x6e69))
                          goto code_r0x005ac518;
                          bVar2 = true;
                          if (bVar6) goto code_r0x005ac388;
                          bVar3 = false;
                        }
                        else {
                          bVar2 = false;
                          bVar3 = false;
                          if (bVar6) {
code_r0x005ac388:
                            if ((int)*plVar17 == 0x61636f6c && *(char *)((long)plVar17 + 4) == 'l')
                            goto code_r0x005ac518;
                            bVar3 = true;
                          }
                        }
                        if ((((((lVar18 != 3) ||
                               (((short)*plVar17 != 0x696e || *(char *)((long)plVar17 + 2) != 'l' &&
                                ((short)*plVar17 != 0x6f6e || *(char *)((long)plVar17 + 2) != 't')))
                               ) && ((!bVar2 || ((short)*plVar17 != 0x726f)))) &&
                             ((!bVar4 ||
                              (((int)*plVar17 != 0x65706572 ||
                                *(short *)((long)plVar17 + 4) != 0x7461 &&
                               ((int)*plVar17 != 0x75746572 ||
                                *(short *)((long)plVar17 + 4) != 0x6e72)))))) &&
                            ((!bVar5 ||
                             (((int)*plVar17 != 0x6e656874 && ((int)*plVar17 != 0x65757274)))))) &&
                           ((!bVar3 ||
                            (((int)*plVar17 != 0x69746e75 || *(char *)((long)plVar17 + 4) != 'l' &&
                             ((int)*plVar17 != 0x6c696877 || *(char *)((long)plVar17 + 4) != 'e'))))
                           )) {
                          puVar24 = (undefined8 *)*unaff_x20;
                          func_0x0046b8d0(puVar12 + -0x80,unaff_x19[2],unaff_x19[3]);
                          if (*(int *)(puVar12 + -0x80) != 1) {
                            *(undefined8 *)(puVar12 + -0x40) = *(undefined8 *)(puVar12 + -0x78);
                            *(undefined8 *)(puVar12 + -0x38) = *(undefined8 *)(puVar12 + -0x70);
                            *(undefined1 **)(puVar12 + -0x50) = puVar12 + -0x40;
                            *(undefined **)(puVar12 + -0x48) = &DAT_005d1a0c;
                            *(undefined **)(puVar12 + -0x80) = &UNK_009f2028;
                            *(undefined8 *)(puVar12 + -0x78) = 1;
                            *(undefined8 *)(puVar12 + -0x68) = 1;
                            *(undefined8 *)(puVar12 + -0x60) = 0;
                            *(undefined1 **)(puVar12 + -0x70) = puVar12 + -0x50;
                            puVar15 = (ulong *)func_0x0046849c(*puVar24,puVar24[1],puVar12 + -0x80);
                            return puVar15;
                          }
                          *(long *)(puVar12 + -0x38) =
                               SUB168(*(undefined1 (*) [16])(puVar12 + -0x78),8);
                          *(long *)(puVar12 + -0x40) =
                               SUB168(*(undefined1 (*) [16])(puVar12 + -0x78),0);
                          puVar25 = &DAT_005ac5c0;
                          auVar27 = func_0x007a2810(&UNK_008aeaf3,0x2b,puVar12 + -0x40,&UNK_009f1cd8
                                                    ,&UNK_009f2010);
                          goto code_r0x005ac5c0;
                        }
                      }
                    }
                    else if ((lVar18 != 8) || (*plVar17 != 0x6e6f6974636e7566))
                    goto joined_r0x005ac378;
                  }
                }
              }
              else {
                bVar1 = *pbVar20;
                if ((bVar1 - 0x41 < 0x1a) || (bVar1 == 0x5f || bVar1 - 0x61 < 0x1a)) {
                  do {
                    uVar16 = uVar16 - 1;
                    if (uVar16 == 0) goto code_r0x005ac0dc;
                    pbVar20 = pbVar20 + 1;
                    bVar1 = *pbVar20;
                  } while ((bVar1 - 0x30 < 10 || bVar1 - 0x41 < 0x1a) ||
                          (bVar1 == 0x5f || bVar1 - 0x61 < 0x1a));
                }
              }
            }
code_r0x005ac518:
            in_stack_00000008 = (ulong *)((long)&MACH_HEADER.magic + 1);
            uVar16 = (**(code **)(((undefined8 *)*unaff_x20)[1] + 0x18))
                               (*(undefined8 *)*unaff_x20,&UNK_008aecab,1);
            if ((uVar16 & 1) != 0) {
              return in_stack_00000008;
            }
            in_stack_00000028 = &UNK_005ac548;
            puVar12 = puVar12 + -0x80;
            in_stack_00000000 = puVar23;
          }
          else {
            if (uVar16 == 0xb) {
              uVar16 = in_stack_00000000[1] ^ 0x8000000000000000;
              if (1 < uVar16) {
                uVar16 = 2;
              }
              if (uVar16 - 1 < 2) goto code_r0x005ac078;
            }
            in_stack_00000008 = (ulong *)((long)&MACH_HEADER.magic + 1);
            uVar16 = (**(code **)(((undefined8 *)*unaff_x20)[1] + 0x18))
                               (*(undefined8 *)*unaff_x20,&UNK_008aec78,1);
            if ((uVar16 & 1) != 0) {
              return in_stack_00000008;
            }
            in_stack_00000028 = &UNK_005ac1b0;
            puVar12 = puVar12 + -0x80;
            unaff_x19 = in_stack_00000000;
          }
        }
        else {
          if (uVar16 != 8) goto code_r0x005ab370;
          in_stack_00000000 = (ulong *)*unaff_x20;
          in_stack_00000008 = puVar15 + 2;
          *(ulong **)(puVar12 + -0xc0) = in_stack_00000008;
          *(undefined **)(puVar12 + -0xb8) =
               &
               __ZN65__LT_ast__unary__UnaryOperation_u20_as_u20_core__fmt__Display_GT_3fmt17hb503ece737257cc6E
          ;
          auVar27._8_8_ = (undefined1 *)((long)&MACH_HEADER.magic + 1);
          auVar27._0_8_ = unaff_x20;
          *(undefined **)(puVar12 + -0x80) = &UNK_007fc120;
          *(undefined8 *)(puVar12 + -0x78) = 1;
          *(undefined8 *)(puVar12 + -0x68) = 1;
          *(undefined8 *)(puVar12 + -0x60) = 0;
          *(undefined1 **)(puVar12 + -0x70) = puVar12 + -0xc0;
          uVar16 = func_0x0046849c(*in_stack_00000000,in_stack_00000000[1],puVar12 + -0x80);
          if ((uVar16 & 1) != 0) {
            return (ulong *)((long)&MACH_HEADER.magic + 1);
          }
          unaff_x19 = (ulong *)puVar15[1];
          uVar16 = *unaff_x19;
          unaff_x23 = puVar15;
          if ((uVar16 == 9) && ((char)unaff_x19[3] != '\x05')) goto code_r0x005ab250;
          if ((char)*in_stack_00000008 == '\x01') {
            if (uVar16 == 8) {
              if ((char)unaff_x19[2] != '\x01') goto code_r0x005ab438;
            }
            else if ((((uVar16 != 6) || (unaff_x19[1] != 0x8000000000000002)) ||
                     (0x7fefffffffffffff < (unaff_x19[2] & 0x7fffffffffffffff))) ||
                    (-1 < (long)unaff_x19[2])) goto code_r0x005ab438;
code_r0x005ab250:
            auVar27._8_8_ = (undefined1 *)((long)&MACH_HEADER.magic + 1);
            uVar16 = (**(code **)(in_stack_00000000[1] + 0x18))(*in_stack_00000000,&UNK_008aec78,1);
            if ((uVar16 & 1) != 0) {
              return (ulong *)((long)&MACH_HEADER.magic + 1);
            }
            in_stack_00000028 = &UNK_005ab280;
            puVar12 = puVar12 + -0xf0;
            in_stack_00000008 = unaff_x19;
          }
          else {
code_r0x005ab438:
            in_stack_00000028 = &UNK_005ab43c;
            puVar12 = puVar12 + -0xf0;
          }
        }
        goto code_r0x005ab01c;
      }
      if (uVar16 != 9) {
        if (uVar16 == 10) {
          puVar24 = (undefined8 *)*unaff_x20;
          uVar16 = (**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aecc7,9);
          if (((uVar16 & 1) == 0) &&
             (uVar16 = func_0x005aa9fc(unaff_x20,puVar15[4]), (uVar16 & 1) == 0)) {
            uVar16 = (**(code **)(puVar24[1] + 0x18))(*puVar24,&UNK_008aec79,1);
            if ((uVar16 & 1) != 0) {
              return (ulong *)((long)&MACH_HEADER.magic + 1);
            }
            uVar16 = func_0x005aac3c(unaff_x20,puVar15 + 1);
            if ((uVar16 & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x005ab428. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              puVar15 = (ulong *)(**(code **)(((undefined8 *)*unaff_x20)[1] + 0x18))
                                           (*(undefined8 *)*unaff_x20,&UNK_008aecd0,3);
              return puVar15;
            }
          }
          return (ulong *)((long)&MACH_HEADER.magic + 1);
        }
        if (uVar16 != 0xb) {
code_r0x005ab370:
          puVar24 = (undefined8 *)*unaff_x20;
          *(undefined1 **)(puVar12 + -0xc0) = puVar12 + -0xe0;
          *(undefined **)(puVar12 + -0xb8) = &DAT_005adc18;
          *(undefined **)(puVar12 + -0x80) = &UNK_007fc120;
          *(undefined8 *)(puVar12 + -0x78) = 1;
          *(undefined8 *)(puVar12 + -0x68) = 1;
          *(undefined8 *)(puVar12 + -0x60) = 0;
          *(undefined1 **)(puVar12 + -0x70) = puVar12 + -0xc0;
          puVar15 = (ulong *)func_0x0046849c(*puVar24,puVar24[1],puVar12 + -0x80);
          return puVar15;
        }
        uVar16 = puVar15[1] ^ 0x8000000000000000;
        if (1 < uVar16) {
          uVar16 = 2;
        }
        if (uVar16 == 0) goto code_r0x005ab370;
        if (uVar16 == 2) goto code_r0x005ab0ac;
        lVar18 = 0x10;
code_r0x005ab2b8:
        auVar27._8_8_ = (char *)((long)puVar15 + lVar18);
        auVar27._0_8_ = unaff_x20;
        in_stack_00000020 = *(undefined1 **)(puVar12 + -0x10);
        puVar25 = *(undefined **)(puVar12 + -8);
        unaff_x19 = *(ulong **)(puVar12 + -0x20);
        puVar24 = *(undefined8 **)(puVar12 + -0x18);
        puVar23 = *(ulong **)(puVar12 + -0x30);
        in_stack_00000008 = *(ulong **)(puVar12 + -0x28);
        unaff_x24 = *(undefined8 *)(puVar12 + -0x40);
        unaff_x23 = *(ulong **)(puVar12 + -0x38);
        puVar13 = puVar12;
code_r0x005ac5c0:
        unaff_x20 = auVar27._0_8_;
        *(ulong **)(puVar13 + -0x30) = puVar23;
        *(ulong **)(puVar13 + -0x28) = in_stack_00000008;
        *(ulong **)(puVar13 + -0x20) = unaff_x19;
        *(undefined8 **)(puVar13 + -0x18) = puVar24;
        *(undefined1 **)(puVar13 + -0x10) = in_stack_00000020;
        *(undefined **)(puVar13 + -8) = puVar25;
        in_stack_00000020 = puVar13 + -0x10;
        unaff_x19 = *(ulong **)(auVar27._8_8_ + 0x18);
        uVar16 = *unaff_x19;
        in_stack_00000000 = puVar23;
        if (uVar16 < 2 || uVar16 == 7) {
code_r0x005ac5ec:
          in_stack_00000028 = &UNK_005ac5f4;
          puVar12 = puVar13 + -0x30;
        }
        else {
          if (uVar16 == 0xb) {
            uVar16 = unaff_x19[1] ^ 0x8000000000000000;
            if (1 < uVar16) {
              uVar16 = 2;
            }
            if (uVar16 - 1 < 2) goto code_r0x005ac5ec;
          }
          uVar16 = (**(code **)(((undefined8 *)*unaff_x20)[1] + 0x18))
                             (*(undefined8 *)*unaff_x20,&UNK_008aec78,1);
          if ((uVar16 & 1) != 0) {
            return (ulong *)((long)&MACH_HEADER.magic + 1);
          }
          in_stack_00000028 = &UNK_005ac6a8;
          puVar12 = puVar13 + -0x30;
          in_stack_00000008 = unaff_x19;
        }
        goto code_r0x005ab01c;
      }
      puVar15 = puVar15 + 1;
      in_stack_00000020 = *(undefined1 **)(puVar12 + -0x10);
      puVar25 = *(undefined **)(puVar12 + -8);
      puVar23 = *(ulong **)(puVar12 + -0x20);
      in_stack_00000000 = *(ulong **)(puVar12 + -0x30);
      in_stack_00000008 = *(ulong **)(puVar12 + -0x28);
      unaff_x24 = *(undefined8 *)(puVar12 + -0x40);
      unaff_x23 = *(ulong **)(puVar12 + -0x38);
      puVar13 = puVar12;
      puVar24 = *(undefined8 **)(puVar12 + -0x18);
code_r0x005aa890:
      auVar27._8_8_ = puVar15;
      auVar27._0_8_ = unaff_x20;
      *(ulong **)(puVar13 + -0x30) = in_stack_00000000;
      *(ulong **)(puVar13 + -0x28) = in_stack_00000008;
      *(ulong **)(puVar13 + -0x20) = puVar23;
      *(undefined8 **)(puVar13 + -0x18) = puVar24;
      *(undefined1 **)(puVar13 + -0x10) = in_stack_00000020;
      *(undefined **)(puVar13 + -8) = puVar25;
      in_stack_00000020 = puVar13 + -0x10;
      uVar16 = func_0x005c1e94(puVar15);
      unaff_x19 = (ulong *)*puVar15;
      if ((uVar16 & 1) == 0) {
        uVar16 = func_0x005ab01c(unaff_x20,unaff_x19);
        if ((uVar16 & 1) == 0) {
          in_stack_00000000 = (ulong *)*unaff_x20;
          *(ulong **)(puVar13 + -0x40) = puVar15 + 2;
          *(undefined **)(puVar13 + -0x38) =
               &
               __ZN67__LT_ast__binary__BinaryOperation_u20_as_u20_core__fmt__Display_GT_3fmt17hf60dec31652a6d56E
          ;
          *(undefined **)(puVar13 + -0x70) = &UNK_009f1df0;
          *(undefined8 *)(puVar13 + -0x68) = 2;
          *(undefined1 **)(puVar13 + -0x60) = puVar13 + -0x40;
          *(undefined8 *)(puVar13 + -0x58) = 1;
          *(undefined8 *)(puVar13 + -0x50) = 0;
          uVar16 = func_0x0046849c(*in_stack_00000000,in_stack_00000000[1],puVar13 + -0x70);
          if ((uVar16 & 1) == 0) {
            uVar16 = func_0x005c1fd8(puVar15);
            unaff_x19 = (ulong *)puVar15[1];
            auVar27._8_8_ = unaff_x19;
            auVar8._8_8_ = unaff_x19;
            auVar8._0_8_ = unaff_x20;
            if ((uVar16 & 1) == 0) {
              in_stack_00000028 = &UNK_005aa9e0;
              puVar12 = puVar13 + -0x70;
              in_stack_00000008 = (ulong *)((long)&MACH_HEADER.magic + 1);
              goto code_r0x005ab01c;
            }
            uVar16 = (**(code **)(in_stack_00000000[1] + 0x18))(*in_stack_00000000,&UNK_008aec78,1);
            if ((uVar16 & 1) == 0) {
              in_stack_00000028 = &UNK_005aa9b0;
              puVar12 = puVar13 + -0x70;
              in_stack_00000008 = (ulong *)((long)&MACH_HEADER.magic + 1);
              auVar27 = auVar8;
              goto code_r0x005ab01c;
            }
          }
        }
      }
      else {
        uVar16 = (**(code **)(((undefined8 *)*unaff_x20)[1] + 0x18))
                           (*(undefined8 *)*unaff_x20,&UNK_008aec78,1);
        if ((uVar16 & 1) == 0) {
          in_stack_00000028 = &UNK_005aa8ec;
          puVar12 = puVar13 + -0x70;
          in_stack_00000008 = (ulong *)((long)&MACH_HEADER.magic + 1);
          in_stack_00000000 = unaff_x19;
          goto code_r0x005ab01c;
        }
      }
      return (ulong *)((long)&MACH_HEADER.magic + 1);
    }
  }
  else if (*unaff_x21 == '\x01') {
    *unaff_x21 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  return (ulong *)((long)&MACH_HEADER.magic + 1);
}

