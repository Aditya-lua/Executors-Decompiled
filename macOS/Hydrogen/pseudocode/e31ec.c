
/* WARNING: Possible PIC construction at 0x000e3cf0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x000e3cf4) */

void FUN_000e31ec(float param_1,float param_2,undefined8 param_3,undefined8 param_4)

{
  undefined4 *puVar1;
  uint uVar2;
  int iVar3;
  undefined2 *puVar4;
  bool bVar5;
  int iVar6;
  undefined8 *puVar7;
  uint in_w8;
  long *plVar8;
  long lVar9;
  undefined4 uVar10;
  long lVar11;
  short sVar12;
  undefined *puVar13;
  long lVar14;
  char *unaff_x21;
  char *unaff_x22;
  long lVar15;
  char *unaff_x23;
  char *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  float *unaff_x27;
  undefined8 unaff_x29;
  undefined *puVar16;
  float fVar17;
  float fVar18;
  float fVar19;
  ulong uVar20;
  undefined8 uVar21;
  ulong uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  float fVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  float fVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  float fVar31;
  float fVar32;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined2 *in_stack_00000010;
  float *in_stack_00000018;
  long in_stack_00000020;
  undefined8 *in_stack_00000028;
  int *in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  int iStack0000000000000048;
  int iStack000000000000004c;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  char *in_stack_000000e0;
  char *in_stack_000000e8;
  char *in_stack_000000f0;
  char *in_stack_000000f8;
  ulong in_stack_00000100;
  undefined *in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined *in_stack_00000118;
  undefined1 uStack0000000000000120;
  
  unaff_x27[0x11] = (float)(in_w8 | 2);
  unaff_x27[0x19] = 0.0;
  unaff_x27[0x1a] = param_1 * param_2;
  unaff_x27[0x13] = 5.60519e-45;
  iVar6 = func_0x000c9774("Dear ImGui Debug Log",param_4,0);
  if ((iVar6 == 0) ||
     (lVar9 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000), *(undefined1 *)(lVar9 + 0xc0) = 1,
     1 < *(short *)(lVar9 + 0xcc))) {
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000120;
    puVar13 = in_stack_00000108;
    uVar20 = in_stack_00000100;
    unaff_x21 = in_stack_000000f8;
    unaff_x22 = in_stack_000000f0;
    unaff_x23 = in_stack_000000e8;
    unaff_x24 = in_stack_000000e0;
    unaff_x29 = in_stack_00000110;
    puVar16 = in_stack_00000118;
    goto code_r0x000cea90;
  }
  in_stack_00000018 = unaff_x27 + 0x5a2;
  func_0x0010d344("All",in_stack_00000018,0x7f);
  func_0x000d9148("(except InputRouting which is spammy)");
  func_0x000e701c("ActiveId",1);
  func_0x000e701c("Clipper",0x10);
  func_0x000e701c("Focus",2);
  func_0x000e701c("IO",0x40);
  func_0x000e701c("Nav",8);
  func_0x000e701c("Popup",4);
  func_0x000e701c("InputRouting",0x80);
  iVar6 = func_0x0010beb8("Clear");
  if (iVar6 == 0) {
    lVar14 = *(long *)(unaff_x25 + 0x4c0);
    lVar9 = *(long *)(lVar14 + 0x4000);
    if (*(char *)(lVar9 + 0xc3) != '\0') goto code_r0x000e3378;
LAB_000e34c8:
    *(float *)(lVar9 + 0x110) = *(float *)(&UNK_00003934 + lVar14) + *(float *)(lVar9 + 0x118);
    *(undefined4 *)(lVar9 + 0x114) = *(undefined4 *)(lVar9 + 0x11c);
    *(undefined8 *)(lVar9 + 0x138) = *(undefined8 *)(lVar9 + 0x140);
    *(undefined4 *)(lVar9 + 0x148) = *(undefined4 *)(lVar9 + 0x14c);
    *(undefined1 *)(lVar9 + 0x150) = 1;
    iVar6 = func_0x0010beb8("Copy");
    lVar9 = *(long *)(unaff_x25 + 0x4c0);
  }
  else {
    lVar9 = *(long *)(&UNK_00006048 + unaff_x26);
    if (lVar9 != 0) {
      *(undefined8 *)(&UNK_00006040 + unaff_x26) = 0;
      lVar14 = *(long *)(unaff_x25 + 0x4c0);
      if (lVar14 != 0) {
        lVar11 = (long)*(short *)(&UNK_000060d8 + lVar14);
        lVar15 = lVar14 + lVar11 * 8;
        if (*(int *)(&UNK_000060dc + lVar15) == *(int *)(&UNK_00003f58 + lVar14)) {
          sVar12 = *(short *)(&UNK_000060e2 + lVar15) + 1;
        }
        else {
          iVar6 = (*(short *)(&UNK_000060d8 + lVar14) + 1) % 6;
          *(short *)(&UNK_000060d8 + lVar14) = (short)iVar6;
          lVar11 = (long)iVar6;
          lVar15 = lVar14 + (long)iVar6 * 8;
          *(int *)(&UNK_000060dc + lVar15) = *(int *)(&UNK_00003f58 + lVar14);
          *(undefined4 *)(&UNK_000060e0 + lVar15) = 0;
          sVar12 = 1;
        }
        *(short *)(&UNK_000060e2 + lVar14 + lVar11 * 8) = sVar12;
        *(int *)(&UNK_000060d4 + lVar14) = *(int *)(&UNK_000060d4 + lVar14) + 1;
      }
      (*pcRam0000000000a28da8)(lVar9,uRam0000000000a33a18);
      *(undefined8 *)(&UNK_00006048 + unaff_x26) = 0;
    }
    lVar9 = *(long *)(&UNK_00006058 + unaff_x26);
    if (lVar9 != 0) {
      *(undefined8 *)(&UNK_00006050 + unaff_x26) = 0;
      lVar14 = *(long *)(unaff_x25 + 0x4c0);
      if (lVar14 != 0) {
        lVar11 = (long)*(short *)(&UNK_000060d8 + lVar14);
        lVar15 = lVar14 + lVar11 * 8;
        if (*(int *)(&UNK_000060dc + lVar15) == *(int *)(&UNK_00003f58 + lVar14)) {
          sVar12 = *(short *)(&UNK_000060e2 + lVar15) + 1;
        }
        else {
          iVar6 = (*(short *)(&UNK_000060d8 + lVar14) + 1) % 6;
          *(short *)(&UNK_000060d8 + lVar14) = (short)iVar6;
          lVar11 = (long)iVar6;
          lVar15 = lVar14 + (long)iVar6 * 8;
          *(int *)(&UNK_000060dc + lVar15) = *(int *)(&UNK_00003f58 + lVar14);
          *(undefined4 *)(&UNK_000060e0 + lVar15) = 0;
          sVar12 = 1;
        }
        *(short *)(&UNK_000060e2 + lVar14 + lVar11 * 8) = sVar12;
        *(int *)(&UNK_000060d4 + lVar14) = *(int *)(&UNK_000060d4 + lVar14) + 1;
      }
      (*pcRam0000000000a28da8)(lVar9,uRam0000000000a33a18);
      *(undefined8 *)(&UNK_00006058 + unaff_x26) = 0;
    }
    *(undefined4 *)(&UNK_00006060 + unaff_x26) = 0;
    lVar14 = *(long *)(unaff_x25 + 0x4c0);
    lVar9 = *(long *)(lVar14 + 0x4000);
    if (*(char *)(lVar9 + 0xc3) == '\0') goto LAB_000e34c8;
code_r0x000e3378:
    iVar6 = func_0x0010beb8("Copy");
    lVar9 = *(long *)(unaff_x25 + 0x4c0);
  }
  if ((iVar6 != 0) && (*(code **)(lVar9 + 0xb0) != (code *)0x0)) {
    lVar14 = 0xa334c8;
    if (*(long *)(&UNK_00006048 + unaff_x26) != 0) {
      lVar14 = *(long *)(&UNK_00006048 + unaff_x26);
    }
    (**(code **)(lVar9 + 0xb0))(*(undefined8 *)(lVar9 + 0xb8),lVar14);
    lVar9 = *(long *)(unaff_x25 + 0x4c0);
  }
  uStack0000000000000040 = 0;
  plVar8 = *(long **)(lVar9 + 0x4000);
  *(undefined1 *)(plVar8 + 0x18) = 1;
  uVar2 = *(uint *)(plVar8[0x21] + (long)(int)plVar8[0x20] * 4 + -4);
  uVar2 = *(uint *)(&UNK_0080c404 + ((ulong)uVar2 & 0xff ^ 0xdc) * 4) ^ ~uVar2 >> 8;
  uVar2 = *(uint *)(&UNK_0080c404 + (ulong)(uVar2 & 0xff ^ 0x23) * 4) ^ uVar2 >> 8;
  uVar2 = *(uint *)(&UNK_0080c404 + (ulong)(uVar2 & 0xff ^ 0x6c) * 4) ^ uVar2 >> 8;
  uVar2 = *(uint *)(&UNK_0080c404 + (ulong)(uVar2 & 0xff ^ 0x6f) * 4) ^ uVar2 >> 8;
  uVar2 = *(uint *)(&UNK_0080c404 + (ulong)(uVar2 & 0xff ^ 0x67) * 4) ^ uVar2 >> 8 ^ 0xffffffff;
  uVar20 = (ulong)uVar2;
  if (*(uint *)(&UNK_0000404c + *plVar8) == uVar2) {
    func_0x000c167c(uVar20,0xb,"##log",0);
  }
  func_0x000d01b4("##log",uVar20,&uStack0000000000000040,1,0xc000);
  in_stack_00000008._4_4_ = *in_stack_00000018;
  *in_stack_00000018 = (float)((uint)in_stack_00000008._4_4_ & 0xffffffef);
  in_stack_00000060 = 0;
  _iStack0000000000000048 = 0;
  uStack0000000000000040 = 0;
  in_stack_00000058 = 0;
  in_stack_00000050 = 0;
  func_0x000bab98(0xbf800000,&uStack0000000000000040,*(int *)(&UNK_00006050 + unaff_x26));
  puVar13 = &UNK_000049a8;
  uVar29 = NEON_fmov(0xc0400000,4);
  uVar30 = NEON_fmov(0x40400000,4);
  while (iVar6 = func_0x000bb10c(&uStack0000000000000040), iVar6 != 0) {
    uVar20 = (ulong)iStack0000000000000048;
    uVar22 = uVar20;
    if (iStack0000000000000048 < iStack000000000000004c) {
      do {
        lVar9 = 0xa334c8;
        if (*(long *)(&UNK_00006048 + unaff_x26) != 0) {
          lVar9 = *(long *)(&UNK_00006048 + unaff_x26);
        }
        uVar20 = uVar22 + 1;
        if ((long)uVar20 < (long)*(int *)(&UNK_00006050 + unaff_x26)) {
          iVar6 = *(int *)(*(long *)(&UNK_00006058 + unaff_x26) + uVar20 * 4) + -1;
        }
        else {
          iVar6 = *(int *)(&UNK_00006060 + unaff_x26);
        }
        unaff_x22 = (char *)(lVar9 + *(int *)(*(long *)(&UNK_00006058 + unaff_x26) + uVar22 * 4));
        unaff_x23 = (char *)(lVar9 + iVar6);
        func_0x0010adb8(unaff_x22,unaff_x23);
        fVar17 = *unaff_x27;
        fVar31 = unaff_x27[1];
        lVar14 = *(long *)(unaff_x25 + 0x4c0);
        lVar9 = *(long *)(lVar14 + 0x4000);
        if (((&UNK_00004b7b)[lVar14] == '\0') || ((&UNK_00004b7a)[lVar14] != '\0')) {
          if (((*(uint *)(&UNK_000049b0 + lVar14) & 1) != 0) &&
             (((*(uint *)(&UNK_000049b0 + lVar14) >> 7 & 1) != 0 ||
              (*(long *)(&UNK_00004008 + lVar14) == lVar9)))) {
            iVar6 = *(int *)(&UNK_000049a8 + lVar14);
            iVar3 = *(int *)(&UNK_00004064 + lVar14);
            if ((iVar3 == 0 || iVar3 == iVar6) ||
               (((&UNK_00004071)[lVar14] != '\0' || (iVar3 == *(int *)(lVar9 + 0x84))))) {
              if ((*(long *)(&UNK_00004b18 + lVar14) != 0) &&
                 ((((lVar15 = *(long *)(*(long *)(&UNK_00004b18 + lVar14) + 0x388), lVar15 != 0 &&
                    (*(char *)(lVar15 + 0xbf) != '\0')) &&
                   (lVar11 = *(long *)(lVar9 + 0x388), lVar15 != lVar11)) &&
                  (((*(byte *)(lVar15 + 0x17) & 0xc) != 0 && (*(long *)(lVar11 + 0x388) != lVar15)))
                  ))) {
                do {
                  if (lVar11 == lVar15) goto code_r0x000e3794;
                  lVar11 = *(long *)(lVar11 + 0x380);
                } while (lVar11 != 0);
                if (((&UNK_000049ad)[lVar14] & 1) == 0) goto code_r0x000e3678;
              }
code_r0x000e3794:
              if ((((*(uint *)(&UNK_000049ac + lVar14) >> 2 & 1) == 0) &&
                  ((iVar6 != *(int *)(lVar9 + 0x84) || (*(char *)(lVar9 + 0xc0) == '\0')))) &&
                 (((*(uint *)(&UNK_000049ac + lVar14) >> 9 & 1) == 0 ||
                  ((iVar6 == 0 || (*(int *)(&UNK_00004054 + lVar14) == iVar6))))))
              goto code_r0x000e37dc;
            }
          }
        }
        else if ((((byte)(&UNK_000049ac)[lVar14] >> 2 & 1) == 0) &&
                (*(int *)(&UNK_00004b20 + lVar14) != 0 &&
                 *(int *)(&UNK_00004b20 + lVar14) == *(int *)(&UNK_000049a8 + lVar14))) {
code_r0x000e37dc:
          unaff_x21 = unaff_x23 + -10;
          if (unaff_x22 <= unaff_x21) {
            fVar32 = fVar31 + 0.0;
            unaff_x24 = unaff_x22;
            do {
              uStack0000000000000038._4_4_ = 0;
              if ((*unaff_x24 == '0') && ((byte)(unaff_x24[1] | 0x20U) == 0x78)) {
                in_stack_00000000 = (long)&uStack0000000000000038 + 4;
                iVar6 = _sscanf(unaff_x24 + 2,"%X");
                if (iVar6 != 1) goto code_r0x000e37f4;
                if (unaff_x24 == unaff_x22) {
                  fVar18 = 0.0;
                }
                else {
                  fVar18 = (float)func_0x00106300(*(undefined4 *)
                                                   (&UNK_00003d38 + *(long *)(unaff_x25 + 0x4c0)),
                                                  0x7f7fffff,0xbf800000,
                                                  *(undefined8 *)
                                                   (&UNK_00003d30 + *(long *)(unaff_x25 + 0x4c0)),
                                                  unaff_x22,unaff_x24,0);
                  fVar18 = (float)(int)(fVar18 + 0.99999);
                }
                unaff_x23 = unaff_x24 + 10;
                fVar25 = 3.4028235e+38;
                fVar19 = (float)func_0x00106300(*(undefined4 *)
                                                 (&UNK_00003d38 + *(long *)(unaff_x25 + 0x4c0)),
                                                0x7f7fffff,0xbf800000,
                                                *(undefined8 *)
                                                 (&UNK_00003d30 + *(long *)(unaff_x25 + 0x4c0)),
                                                unaff_x24,unaff_x23,0);
                fVar28 = fVar17 + fVar18;
                fVar18 = fVar17 + fVar18 + (float)(int)(fVar19 + 0.99999);
                fVar25 = fVar31 + fVar25;
                *unaff_x27 = fVar28;
                unaff_x27[1] = fVar32;
                unaff_x27[2] = fVar18;
                unaff_x27[3] = fVar25;
                lVar14 = *(long *)(unaff_x25 + 0x4c0);
                lVar9 = *(long *)(lVar14 + 0x4000);
                if (fVar28 < *(float *)(lVar9 + 0x248)) {
                  fVar28 = *(float *)(lVar9 + 0x248);
                }
                if (fVar28 - *(float *)(&UNK_0000394c + lVar14) <= *(float *)(lVar14 + 0xe40)) {
                  if (*(float *)(lVar9 + 0x254) <= fVar25) {
                    fVar25 = *(float *)(lVar9 + 0x254);
                  }
                  if (*(float *)(lVar9 + 0x250) <= fVar18) {
                    fVar18 = *(float *)(lVar9 + 0x250);
                  }
                  fVar28 = fVar32;
                  if (fVar32 < *(float *)(lVar9 + 0x24c)) {
                    fVar28 = *(float *)(lVar9 + 0x24c);
                  }
                  fVar19 = *(float *)(lVar14 + 0xe44);
                  if (fVar28 - *(float *)(&UNK_00003950 + lVar14) <= fVar19) {
                    fVar25 = fVar25 + *(float *)(&UNK_00003950 + lVar14);
                    bVar5 = false;
                    if ((*(float *)(lVar14 + 0xe40) < *(float *)(&UNK_0000394c + lVar14) + fVar18)
                       && (bVar5 = false, !NAN(fVar19) && !NAN(fVar25))) {
                      bVar5 = fVar19 < fVar25;
                    }
                    if ((bVar5) && (uStack0000000000000038._4_4_ != 0)) {
                      in_stack_00000030 = (int *)(&UNK_000049a8 + lVar14);
                      if (((&UNK_00004b7b)[lVar14] == '\0') || ((&UNK_00004b7a)[lVar14] != '\0')) {
                        if (((*(uint *)(&UNK_000049b0 + lVar14) & 1) != 0) &&
                           (((*(uint *)(&UNK_000049b0 + lVar14) >> 7 & 1) != 0 ||
                            (*(long *)(&UNK_00004008 + lVar14) == lVar9)))) {
                          iVar6 = *in_stack_00000030;
                          if (((*(long *)(&UNK_00004b18 + lVar14) != 0) &&
                              (((lVar15 = *(long *)(*(long *)(&UNK_00004b18 + lVar14) + 0x388),
                                lVar15 != 0 && (*(char *)(lVar15 + 0xbf) != '\0')) &&
                               (lVar11 = *(long *)(lVar9 + 0x388), lVar15 != lVar11)))) &&
                             (((*(byte *)(lVar15 + 0x17) >> 3 & 1) != 0 &&
                              (*(long *)(lVar11 + 0x388) != lVar15)))) {
                            do {
                              if (lVar11 == lVar15) goto code_r0x000e3a00;
                              lVar11 = *(long *)(lVar11 + 0x380);
                            } while (lVar11 != 0);
                            if (((&UNK_000049ad)[lVar14] & 1) == 0) goto code_r0x000e37f8;
                          }
code_r0x000e3a00:
                          if ((((*(uint *)(&UNK_000049ac + lVar14) >> 2 & 1) == 0) &&
                              ((iVar6 != *(int *)(lVar9 + 0x84) || (*(char *)(lVar9 + 0xc0) == '\0')
                               ))) && (((*(uint *)(&UNK_000049ac + lVar14) >> 9 & 1) == 0 ||
                                       ((iVar6 == 0 || (*(int *)(&UNK_00004054 + lVar14) == iVar6)))
                                       ))) goto code_r0x000e3a54;
                        }
                      }
                      else if ((((byte)(&UNK_000049ac)[lVar14] >> 2 & 1) == 0) &&
                              ((*(int *)(&UNK_00004b20 + lVar14) != 0 &&
                               (*(int *)(&UNK_00004b20 + lVar14) == *in_stack_00000030)))) {
code_r0x000e3a54:
                        in_stack_00000010 = (undefined2 *)(&UNK_0000606d + lVar14);
                        *(int *)(&UNK_00004980 + lVar14) = uStack0000000000000038._4_4_;
                        *in_stack_00000010 = 2;
                        in_stack_00000020 = **(long **)(&UNK_00004b10 + lVar14);
                        puVar7 = *(undefined8 **)(in_stack_00000020 + 0x40);
                        if (puVar7 == (undefined8 *)0x0) {
                          puVar7 = (undefined8 *)(*pcRam0000000000a28da0)(200,uRam0000000000a33a18);
                          lVar9 = *(long *)(unaff_x25 + 0x4c0);
                          if (lVar9 != 0) {
                            lVar11 = (long)*(short *)(&UNK_000060d8 + lVar9);
                            lVar15 = lVar9 + lVar11 * 8;
                            if (*(int *)(&UNK_000060dc + lVar15) == *(int *)(&UNK_00003f58 + lVar9))
                            {
                              sVar12 = *(short *)(&UNK_000060e0 + lVar15) + 1;
                            }
                            else {
                              iVar6 = (*(short *)(&UNK_000060d8 + lVar9) + 1) % 6;
                              *(short *)(&UNK_000060d8 + lVar9) = (short)iVar6;
                              lVar11 = (long)iVar6;
                              lVar15 = lVar9 + (long)iVar6 * 8;
                              *(int *)(&UNK_000060dc + lVar15) = *(int *)(&UNK_00003f58 + lVar9);
                              *(undefined4 *)(&UNK_000060e0 + lVar15) = 0;
                              sVar12 = 1;
                            }
                            *(short *)(&UNK_000060e0 + lVar9 + lVar11 * 8) = sVar12;
                            *(int *)(&UNK_000060d0 + lVar9) = *(int *)(&UNK_000060d0 + lVar9) + 1;
                          }
                          puVar7[0x18] = 0;
                          puVar7[0x15] = 0;
                          puVar7[0x14] = 0;
                          puVar7[0x17] = 0;
                          puVar7[0x16] = 0;
                          puVar7[0x11] = 0;
                          puVar7[0x10] = 0;
                          puVar7[0x13] = 0;
                          puVar7[0x12] = 0;
                          puVar7[0xd] = 0;
                          puVar7[0xc] = 0;
                          puVar7[0xf] = 0;
                          puVar7[0xe] = 0;
                          puVar7[9] = 0;
                          puVar7[8] = 0;
                          puVar7[0xb] = 0;
                          puVar7[10] = 0;
                          puVar7[5] = 0;
                          puVar7[4] = 0;
                          puVar7[7] = 0;
                          puVar7[6] = 0;
                          puVar7[1] = 0;
                          *puVar7 = 0;
                          puVar7[3] = 0;
                          puVar7[2] = 0;
                          puVar7[7] = &UNK_00003d40 + lVar14;
                          puVar7[8] = "##Foreground";
                          *(undefined8 **)(in_stack_00000020 + 0x40) = puVar7;
                          if (*(int *)(in_stack_00000020 + 0x34) != *(int *)(&UNK_00003f58 + lVar14)
                             ) goto code_r0x000e3b8c;
                        }
                        else if (*(int *)(in_stack_00000020 + 0x34) !=
                                 *(int *)(&UNK_00003f58 + lVar14)) {
code_r0x000e3b8c:
                          in_stack_00000028 = puVar7;
                          func_0x000ef410();
                          func_0x000f0b5c(in_stack_00000028,
                                          *(undefined8 *)(*(long *)(lVar14 + 0x38) + 8));
                          uVar21 = *(undefined8 *)(in_stack_00000020 + 4);
                          uStack0000000000000070 =
                               CONCAT44((float)((ulong)uVar21 >> 0x20) +
                                        (float)((ulong)*(undefined8 *)(in_stack_00000020 + 0xc) >>
                                               0x20),
                                        (float)uVar21 +
                                        (float)*(undefined8 *)(in_stack_00000020 + 0xc));
                          func_0x000f0930(in_stack_00000028,(undefined8 *)(in_stack_00000020 + 4),
                                          &uStack0000000000000070,0);
                          *(undefined4 *)(in_stack_00000020 + 0x34) =
                               *(undefined4 *)(&UNK_00003f58 + lVar14);
                          puVar7 = in_stack_00000028;
                        }
                        uStack0000000000000070 =
                             CONCAT44((float)((ulong)*(undefined8 *)(in_stack_00000030 + 3) >> 0x20)
                                      + (float)((ulong)uVar29 >> 0x20),
                                      (float)*(undefined8 *)(in_stack_00000030 + 3) + (float)uVar29)
                        ;
                        uStack0000000000000068 =
                             CONCAT44((float)((ulong)*(undefined8 *)(in_stack_00000030 + 5) >> 0x20)
                                      + (float)((ulong)uVar30 >> 0x20),
                                      (float)*(undefined8 *)(in_stack_00000030 + 5) + (float)uVar30)
                        ;
                        func_0x000f3af4(0,0x3f800000,puVar7,&uStack0000000000000070,
                                        &uStack0000000000000068,0xff00ff00,0);
                        if ((*(char *)(lVar14 + 0x78) != '\0') &&
                           (1.0 < (float)in_stack_00000030[0x151])) {
                          func_0x000e6248(0,"in ItemAdd()");
                          puVar4 = in_stack_00000010;
                          iVar6 = func_0x000d7798(*(undefined4 *)((long)in_stack_00000010 + 3),0,0);
                          if (iVar6 != 0) {
                            *(undefined1 *)((long)puVar4 + 1) = 1;
                          }
                        }
                      }
                    }
                  }
                }
              }
              else {
code_r0x000e37f4:
                unaff_x23 = unaff_x24;
              }
code_r0x000e37f8:
              unaff_x24 = unaff_x23 + 1;
            } while (unaff_x24 <= unaff_x21);
          }
        }
code_r0x000e3678:
        uVar22 = uVar20;
      } while ((long)uVar20 < (long)iStack000000000000004c);
    }
  }
  *in_stack_00000018 = in_stack_00000008._4_4_;
  lVar9 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
  if (*(float *)(lVar9 + 0x98) <= *(float *)(lVar9 + 0x90)) {
    fVar31 = *(float *)(lVar9 + 0x5c);
    fVar17 = fVar31;
    if (fVar31 < *(float *)(&UNK_00003938 + *(long *)(unaff_x25 + 0x4c0))) {
      fVar17 = *(float *)(&UNK_00003938 + *(long *)(unaff_x25 + 0x4c0));
    }
    fVar32 = *(float *)(lVar9 + 0x11c) - fVar17;
    *(float *)(lVar9 + 0xa0) =
         (float)(int)(*(float *)(lVar9 + 0x90) +
                     ((((fVar32 + ((fVar17 + *(float *)(lVar9 + 0x11c) + *(float *)(lVar9 + 0x144))
                                  - fVar32)) - *(float *)(lVar9 + 0x2c)) - *(float *)(lVar9 + 0x6c))
                     - *(float *)(lVar9 + 0x7c)));
    *(undefined4 *)(lVar9 + 0xa8) = 0x3f800000;
    fVar32 = 0.0;
    if (0.0 < fVar31 - fVar17) {
      fVar32 = fVar31 - fVar17;
    }
    *(float *)(lVar9 + 0xb0) = fVar32;
  }
  func_0x000d0b80();
  puVar16 = &UNK_000e3cf4;
code_r0x000cea90:
  lVar9 = lRam0000000000a334c0;
  *(char **)((long)register0x00000008 + -0x40) = unaff_x24;
  *(char **)((long)register0x00000008 + -0x38) = unaff_x23;
  *(char **)((long)register0x00000008 + -0x30) = unaff_x22;
  *(char **)((long)register0x00000008 + -0x28) = unaff_x21;
  *(ulong *)((long)register0x00000008 + -0x20) = uVar20;
  *(undefined **)((long)register0x00000008 + -0x18) = puVar13;
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar16;
  lVar14 = *(long *)(lRam0000000000a334c0 + 0x4000);
  if ((*(int *)(&UNK_00003fd0 + lRam0000000000a334c0) < 2) &&
     ((&UNK_00003f65)[lRam0000000000a334c0] != '\0')) {
    return;
  }
  lVar15 = lVar14;
  if (*(long *)(lVar14 + 0x1b8) != 0) {
    func_0x00135d60();
    lVar15 = *(long *)(lRam0000000000a334c0 + 0x4000);
  }
  *(undefined1 *)(lVar15 + 0xc0) = 1;
  func_0x000f0b24(*(undefined8 *)(lVar15 + 0x2a8));
  lVar11 = *(long *)(*(long *)(lVar15 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar15 + 0x2a8) + 0x58) * 0x10;
  uVar29 = *(undefined8 *)(lVar11 + -0x10);
  *(undefined8 *)(lVar15 + 0x250) = *(undefined8 *)(lVar11 + -8);
  *(undefined8 *)(lVar15 + 0x248) = uVar29;
  lVar15 = lRam0000000000a334c0;
  iVar6 = *(int *)(&UNK_00004aa0 + lRam0000000000a334c0);
  if (iVar6 != 0) {
    puVar1 = (undefined4 *)(&UNK_00004978 + lRam0000000000a334c0);
    *(int *)(&UNK_00004aa0 + lRam0000000000a334c0) = iVar6 + -1;
    if (iVar6 + -1 == 0) {
      uVar10 = 0;
    }
    else {
      uVar10 = *(undefined4 *)
                (*(long *)(&UNK_00004aa8 + lVar15) +
                (-(ulong)(iVar6 - 2U >> 0x1f) & 0xfffffff800000000 | (ulong)(iVar6 - 2U) << 3));
    }
    *puVar1 = uVar10;
  }
  if ((*(byte *)(lVar14 + 0x17) & 1) == 0) {
    func_0x000d2c88();
  }
  if (*(char *)(lVar14 + 0x151) != '\0') {
    lVar15 = *(long *)(lRam0000000000a334c0 + 0x4000);
    *(undefined1 *)(lVar15 + 0x151) = 0;
    uVar20 = *(ulong *)(lVar15 + 0x128);
    uVar22 = *(ulong *)(lVar15 + 0x110);
    *(ulong *)(lVar15 + 0x128) =
         uVar20 ^ (uVar20 ^ uVar22) &
                  ~CONCAT44(-(uint)((float)(uVar22 >> 0x20) <= (float)(uVar20 >> 0x20)),
                            -(uint)((float)uVar22 <= (float)uVar20));
  }
  iVar6 = *(int *)(&UNK_00003fd0 + lVar9);
  iVar3 = iVar6 + -1;
  lVar15 = *(long *)(&UNK_00003fd8 + lVar9) + (long)iVar3 * 0x68;
  uVar29 = *(undefined8 *)(lVar15 + 8);
  *(undefined8 *)(&UNK_000049b0 + lVar9) = *(undefined8 *)(lVar15 + 0x10);
  *(undefined8 *)(&UNK_000049a8 + lVar9) = uVar29;
  uVar30 = *(undefined8 *)(lVar15 + 0x30);
  uVar29 = *(undefined8 *)(lVar15 + 0x28);
  uVar23 = *(undefined8 *)(lVar15 + 0x40);
  uVar21 = *(undefined8 *)(lVar15 + 0x38);
  uVar24 = *(undefined8 *)(lVar15 + 0x44);
  uVar27 = *(undefined8 *)(lVar15 + 0x20);
  uVar26 = *(undefined8 *)(lVar15 + 0x18);
  *(undefined8 *)(&UNK_000049ec + lVar9) = *(undefined8 *)(lVar15 + 0x4c);
  *(undefined8 *)(&UNK_000049e4 + lVar9) = uVar24;
  *(undefined8 *)(&UNK_000049d0 + lVar9) = uVar30;
  *(undefined8 *)(&UNK_000049c8 + lVar9) = uVar29;
  *(undefined8 *)(&UNK_000049e0 + lVar9) = uVar23;
  *(undefined8 *)(&UNK_000049d8 + lVar9) = uVar21;
  *(undefined8 *)(&UNK_000049c0 + lVar9) = uVar27;
  *(undefined8 *)(&UNK_000049b8 + lVar9) = uVar26;
  uVar2 = *(uint *)(lVar14 + 0x14);
  if ((uVar2 >> 0x1c & 1) != 0) {
    *(int *)(&UNK_00004b00 + lVar9) = *(int *)(&UNK_00004b00 + lVar9) + -1;
  }
  if ((uVar2 >> 0x1a & 1) == 0) {
    *(int *)(&UNK_00003fd0 + lVar9) = iVar3;
    lVar14 = lRam0000000000a334c0;
  }
  else {
    *(int *)(&UNK_00004ae0 + lVar9) = *(int *)(&UNK_00004ae0 + lVar9) + -1;
    *(int *)(&UNK_00003fd0 + lVar9) = iVar3;
    lVar14 = lRam0000000000a334c0;
  }
  lRam0000000000a334c0 = lVar14;
  if (iVar3 == 0) {
    *(undefined8 *)(lVar14 + 0x4000) = 0;
  }
  else {
    plVar8 = *(long **)(*(long *)(&UNK_00003fd8 + lVar9) + (long)(iVar6 + -2) * 0x68);
    *(long **)(lVar14 + 0x4000) = plVar8;
    if (plVar8 != (long *)0x0) {
      if ((int)plVar8[0x38] == -1) {
        lVar9 = 0;
      }
      else {
        lVar9 = *(long *)(&UNK_00004e40 + lVar14) + (long)(int)plVar8[0x38] * 0x250;
      }
      *(long *)(&UNK_00004e18 + lVar14) = lVar9;
      fVar17 = *(float *)(&UNK_00003d3c + *plVar8) * *(float *)(plVar8 + 0x54);
      if (plVar8[0x6f] != 0) {
        fVar17 = fVar17 * *(float *)(plVar8[0x6f] + 0x2a0);
      }
      *(float *)(&UNK_00003d50 + lVar14) = fVar17;
      *(float *)(&UNK_00003d38 + lVar14) = fVar17;
      if (lVar9 == 0) {
        *(bool *)(plVar8 + 0x2e) = plVar8[0x37] == 0;
        return;
      }
      *(undefined1 *)(plVar8 + 0x2e) = 0;
      return;
    }
  }
  *(undefined8 *)(&UNK_00004e18 + lVar14) = 0;
  return;
}

