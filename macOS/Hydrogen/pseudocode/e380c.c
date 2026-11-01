
void FUN_000e380c(void)

{
  int *piVar1;
  int iVar2;
  int iVar3;
  bool bVar4;
  int iVar5;
  undefined8 *puVar6;
  uint in_w8;
  long lVar7;
  short sVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long unaff_x19;
  long unaff_x20;
  byte *unaff_x21;
  byte *unaff_x22;
  byte *pbVar12;
  byte *unaff_x24;
  long lVar13;
  long unaff_x25;
  long unaff_x26;
  float *unaff_x27;
  int *unaff_x28;
  float fVar14;
  float fVar15;
  undefined8 uVar16;
  float fVar17;
  float fVar18;
  float unaff_s8;
  undefined8 unaff_d9;
  undefined8 unaff_d10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  undefined8 in_stack_00000008;
  undefined4 *in_stack_00000018;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  int iStack0000000000000048;
  int iStack000000000000004c;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  
  do {
    if (((in_w8 == 0x30) && ((unaff_x24[1] | 0x20) == 0x78)) &&
       (iVar5 = _sscanf(unaff_x24 + 2,"%X"), iVar5 == 1)) {
      if (unaff_x24 == unaff_x22) {
        fVar14 = 0.0;
      }
      else {
        fVar14 = (float)func_0x00106300(*(undefined4 *)
                                         (&UNK_00003d38 + *(long *)(unaff_x25 + 0x4c0)),0x7f7fffff,
                                        0xbf800000,
                                        *(undefined8 *)
                                         (&UNK_00003d30 + *(long *)(unaff_x25 + 0x4c0)),unaff_x22,
                                        unaff_x24,0);
        fVar14 = (float)(int)(fVar14 + 0.99999);
      }
      pbVar12 = unaff_x24 + 10;
      fVar17 = 3.4028235e+38;
      fVar15 = (float)func_0x00106300(*(undefined4 *)(&UNK_00003d38 + *(long *)(unaff_x25 + 0x4c0)),
                                      0x7f7fffff,0xbf800000,
                                      *(undefined8 *)(&UNK_00003d30 + *(long *)(unaff_x25 + 0x4c0)),
                                      unaff_x24,pbVar12,0);
      fVar18 = unaff_s12 + fVar14;
      fVar14 = unaff_s12 + fVar14 + (float)(int)(fVar15 + 0.99999);
      fVar17 = unaff_s13 + fVar17;
      *unaff_x27 = fVar18;
      unaff_x27[1] = unaff_s14;
      unaff_x27[2] = fVar14;
      unaff_x27[3] = fVar17;
      lVar13 = *(long *)(unaff_x25 + 0x4c0);
      lVar7 = *(long *)(lVar13 + 0x4000);
      if (fVar18 < *(float *)(lVar7 + 0x248)) {
        fVar18 = *(float *)(lVar7 + 0x248);
      }
      if (fVar18 - *(float *)(&UNK_0000394c + lVar13) <= *(float *)(lVar13 + 0xe40)) {
        if (*(float *)(lVar7 + 0x254) <= fVar17) {
          fVar17 = *(float *)(lVar7 + 0x254);
        }
        if (*(float *)(lVar7 + 0x250) <= fVar14) {
          fVar14 = *(float *)(lVar7 + 0x250);
        }
        fVar18 = unaff_s14;
        if (unaff_s14 < *(float *)(lVar7 + 0x24c)) {
          fVar18 = *(float *)(lVar7 + 0x24c);
        }
        fVar15 = *(float *)(lVar13 + 0xe44);
        if (fVar18 - *(float *)(&UNK_00003950 + lVar13) <= fVar15) {
          fVar17 = fVar17 + *(float *)(&UNK_00003950 + lVar13);
          bVar4 = false;
          if ((*(float *)(lVar13 + 0xe40) < *(float *)(&UNK_0000394c + lVar13) + fVar14) &&
             (bVar4 = false, !NAN(fVar15) && !NAN(fVar17))) {
            bVar4 = fVar15 < fVar17;
          }
          if ((bVar4) && (in_stack_00000038._4_4_ != 0)) {
            piVar1 = (int *)(lVar13 + unaff_x19);
            if ((*(char *)((long)piVar1 + 0x1d3) == '\0') ||
               (*(char *)((long)piVar1 + 0x1d2) != '\0')) {
              if (((piVar1[2] & 1U) != 0) &&
                 ((((uint)piVar1[2] >> 7 & 1) != 0 || (*(long *)(&UNK_00004008 + lVar13) == lVar7)))
                 ) {
                iVar5 = *piVar1;
                if ((*(long *)(&UNK_00004b18 + lVar13) != 0) &&
                   ((((lVar9 = *(long *)(*(long *)(&UNK_00004b18 + lVar13) + 0x388), lVar9 != 0 &&
                      (*(char *)(lVar9 + 0xbf) != '\0')) &&
                     (lVar11 = *(long *)(lVar7 + 0x388), lVar9 != lVar11)) &&
                    (((*(byte *)(lVar9 + 0x17) >> 3 & 1) != 0 &&
                     (*(long *)(lVar11 + 0x388) != lVar9)))))) {
                  do {
                    if (lVar11 == lVar9) goto code_r0x000e3a00;
                    lVar11 = *(long *)(lVar11 + 0x380);
                  } while (lVar11 != 0);
                  if ((*(byte *)((long)piVar1 + 5) & 1) == 0) goto LAB_000e37f8;
                }
code_r0x000e3a00:
                if (((((uint)piVar1[1] >> 2 & 1) == 0) &&
                    ((iVar5 != *(int *)(lVar7 + 0x84) || (*(char *)(lVar7 + 0xc0) == '\0')))) &&
                   ((((uint)piVar1[1] >> 9 & 1) == 0 ||
                    ((iVar5 == 0 || (*(int *)(&UNK_00004054 + lVar13) == iVar5))))))
                goto code_r0x000e3a54;
              }
            }
            else if (((*(byte *)(piVar1 + 1) >> 2 & 1) == 0) &&
                    ((piVar1[0x5e] != 0 && (piVar1[0x5e] == *piVar1)))) {
code_r0x000e3a54:
              *(int *)(&UNK_00004980 + lVar13) = in_stack_00000038._4_4_;
              *(undefined2 *)(&UNK_0000606d + lVar13) = 2;
              lVar7 = **(long **)(&UNK_00004b10 + lVar13);
              puVar6 = *(undefined8 **)(lVar7 + 0x40);
              if (puVar6 == (undefined8 *)0x0) {
                puVar6 = (undefined8 *)(*pcRam0000000000a28da0)(200,uRam0000000000a33a18);
                lVar9 = *(long *)(unaff_x25 + 0x4c0);
                if (lVar9 != 0) {
                  lVar10 = (long)*(short *)(&UNK_000060d8 + lVar9);
                  lVar11 = lVar9 + lVar10 * 8;
                  if (*(int *)(&UNK_000060dc + lVar11) == *(int *)(&UNK_00003f58 + lVar9)) {
                    sVar8 = *(short *)(&UNK_000060e0 + lVar11) + 1;
                  }
                  else {
                    iVar5 = (*(short *)(&UNK_000060d8 + lVar9) + 1) % 6;
                    *(short *)(&UNK_000060d8 + lVar9) = (short)iVar5;
                    lVar10 = (long)iVar5;
                    lVar11 = lVar9 + (long)iVar5 * 8;
                    *(int *)(&UNK_000060dc + lVar11) = *(int *)(&UNK_00003f58 + lVar9);
                    *(undefined4 *)(&UNK_000060e0 + lVar11) = 0;
                    sVar8 = 1;
                  }
                  *(short *)(&UNK_000060e0 + lVar9 + lVar10 * 8) = sVar8;
                  *(int *)(&UNK_000060d0 + lVar9) = *(int *)(&UNK_000060d0 + lVar9) + 1;
                }
                puVar6[0x18] = 0;
                puVar6[0x15] = 0;
                puVar6[0x14] = 0;
                puVar6[0x17] = 0;
                puVar6[0x16] = 0;
                puVar6[0x11] = 0;
                puVar6[0x10] = 0;
                puVar6[0x13] = 0;
                puVar6[0x12] = 0;
                puVar6[0xd] = 0;
                puVar6[0xc] = 0;
                puVar6[0xf] = 0;
                puVar6[0xe] = 0;
                puVar6[9] = 0;
                puVar6[8] = 0;
                puVar6[0xb] = 0;
                puVar6[10] = 0;
                puVar6[5] = 0;
                puVar6[4] = 0;
                puVar6[7] = 0;
                puVar6[6] = 0;
                puVar6[1] = 0;
                *puVar6 = 0;
                puVar6[3] = 0;
                puVar6[2] = 0;
                puVar6[7] = &UNK_00003d40 + lVar13;
                puVar6[8] = "##Foreground";
                *(undefined8 **)(lVar7 + 0x40) = puVar6;
                if (*(int *)(lVar7 + 0x34) != *(int *)(&UNK_00003f58 + lVar13))
                goto code_r0x000e3b8c;
              }
              else if (*(int *)(lVar7 + 0x34) != *(int *)(&UNK_00003f58 + lVar13)) {
code_r0x000e3b8c:
                func_0x000ef410();
                func_0x000f0b5c(puVar6,*(undefined8 *)(*(long *)(lVar13 + 0x38) + 8));
                uVar16 = *(undefined8 *)(lVar7 + 4);
                uStack0000000000000070 =
                     CONCAT44((float)((ulong)uVar16 >> 0x20) +
                              (float)((ulong)*(undefined8 *)(lVar7 + 0xc) >> 0x20),
                              (float)uVar16 + (float)*(undefined8 *)(lVar7 + 0xc));
                func_0x000f0930(puVar6,(undefined8 *)(lVar7 + 4),&uStack0000000000000070,0);
                *(undefined4 *)(lVar7 + 0x34) = *(undefined4 *)(&UNK_00003f58 + lVar13);
              }
              uStack0000000000000070 =
                   CONCAT44((float)((ulong)*(undefined8 *)(piVar1 + 3) >> 0x20) +
                            (float)((ulong)unaff_d9 >> 0x20),
                            (float)*(undefined8 *)(piVar1 + 3) + (float)unaff_d9);
              uStack0000000000000068 =
                   CONCAT44((float)((ulong)*(undefined8 *)(piVar1 + 5) >> 0x20) +
                            (float)((ulong)unaff_d10 >> 0x20),
                            (float)*(undefined8 *)(piVar1 + 5) + (float)unaff_d10);
              func_0x000f3af4(0,0x3f800000,puVar6,&uStack0000000000000070,&uStack0000000000000068,
                              0xff00ff00,0);
              if ((*(char *)(lVar13 + 0x78) != '\0') && (unaff_s11 < (float)piVar1[0x151])) {
                func_0x000e6248(0,"in ItemAdd()");
                iVar5 = func_0x000d7798(*(undefined4 *)(&UNK_00006070 + lVar13),0,0);
                if (iVar5 != 0) {
                  (&UNK_0000606e)[lVar13] = 1;
                }
              }
            }
          }
        }
      }
    }
    else {
      pbVar12 = unaff_x24;
    }
LAB_000e37f8:
    unaff_x24 = pbVar12 + 1;
    if (unaff_x21 < pbVar12 + 1) {
code_r0x000e3678:
      do {
        lVar7 = unaff_x20;
        if (iStack000000000000004c <= unaff_x20) {
          do {
            iVar5 = func_0x000bb10c(&uStack0000000000000040);
            if (iVar5 == 0) {
              *in_stack_00000018 = in_stack_00000008._4_4_;
              lVar7 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
              if (*(float *)(lVar7 + 0x98) <= *(float *)(lVar7 + 0x90)) {
                fVar17 = *(float *)(lVar7 + 0x5c);
                fVar14 = fVar17;
                if (fVar17 < *(float *)(&UNK_00003938 + *(long *)(unaff_x25 + 0x4c0))) {
                  fVar14 = *(float *)(&UNK_00003938 + *(long *)(unaff_x25 + 0x4c0));
                }
                fVar18 = *(float *)(lVar7 + 0x11c) - fVar14;
                *(float *)(lVar7 + 0xa0) =
                     (float)(int)(*(float *)(lVar7 + 0x90) +
                                 ((((fVar18 + ((fVar14 + *(float *)(lVar7 + 0x11c) +
                                                         *(float *)(lVar7 + 0x144)) - fVar18)) -
                                   *(float *)(lVar7 + 0x2c)) - *(float *)(lVar7 + 0x6c)) -
                                 *(float *)(lVar7 + 0x7c)));
                *(undefined4 *)(lVar7 + 0xa8) = 0x3f800000;
                fVar18 = 0.0;
                if (0.0 < fVar17 - fVar14) {
                  fVar18 = fVar17 - fVar14;
                }
                *(float *)(lVar7 + 0xb0) = fVar18;
              }
              func_0x000d0b80();
              func_0x000cea90();
              func_0x000ba9f0(&uStack0000000000000040);
              return;
            }
            lVar7 = (long)iStack0000000000000048;
          } while (iStack000000000000004c <= iStack0000000000000048);
        }
        lVar13 = 0xa334c8;
        if (*(long *)(&UNK_00006048 + unaff_x26) != 0) {
          lVar13 = *(long *)(&UNK_00006048 + unaff_x26);
        }
        unaff_x20 = lVar7 + 1;
        if (unaff_x20 < *unaff_x28) {
          iVar5 = *(int *)(*(long *)(&UNK_00006058 + unaff_x26) + unaff_x20 * 4) + -1;
        }
        else {
          iVar5 = unaff_x28[4];
        }
        unaff_x22 = (byte *)(lVar13 + *(int *)(*(long *)(&UNK_00006058 + unaff_x26) + lVar7 * 4));
        func_0x0010adb8(unaff_x22,lVar13 + iVar5);
        unaff_s12 = *unaff_x27;
        unaff_s13 = unaff_x27[1];
        lVar9 = *(long *)(unaff_x25 + 0x4c0);
        piVar1 = (int *)(lVar9 + unaff_x19);
        lVar7 = *(long *)(lVar9 + 0x4000);
        if ((*(char *)((long)piVar1 + 0x1d3) == '\0') || (*(char *)((long)piVar1 + 0x1d2) != '\0'))
        {
          if (((piVar1[2] & 1U) == 0) ||
             ((((uint)piVar1[2] >> 7 & 1) == 0 && (*(long *)(&UNK_00004008 + lVar9) != lVar7))))
          goto code_r0x000e3678;
          iVar2 = *piVar1;
          iVar3 = *(int *)(&UNK_00004064 + lVar9);
          if ((iVar3 != 0 && iVar3 != iVar2) &&
             (((&UNK_00004071)[lVar9] == '\0' && (iVar3 != *(int *)(lVar7 + 0x84)))))
          goto code_r0x000e3678;
          if (((*(long *)(&UNK_00004b18 + lVar9) != 0) &&
              (((lVar11 = *(long *)(*(long *)(&UNK_00004b18 + lVar9) + 0x388), lVar11 != 0 &&
                (*(char *)(lVar11 + 0xbf) != '\0')) &&
               (lVar10 = *(long *)(lVar7 + 0x388), lVar11 != lVar10)))) &&
             (((*(byte *)(lVar11 + 0x17) & 0xc) != 0 && (*(long *)(lVar10 + 0x388) != lVar11)))) {
            do {
              if (lVar10 == lVar11) goto code_r0x000e3794;
              lVar10 = *(long *)(lVar10 + 0x380);
            } while (lVar10 != 0);
            if ((*(byte *)((long)piVar1 + 5) & 1) == 0) goto code_r0x000e3678;
          }
code_r0x000e3794:
          if (((((uint)piVar1[1] >> 2 & 1) != 0) ||
              ((iVar2 == *(int *)(lVar7 + 0x84) && (*(char *)(lVar7 + 0xc0) != '\0')))) ||
             ((((uint)piVar1[1] >> 9 & 1) != 0 &&
              ((iVar2 != 0 && (*(int *)(&UNK_00004054 + lVar9) != iVar2)))))) goto code_r0x000e3678;
        }
        else if (((*(byte *)(piVar1 + 1) >> 2 & 1) != 0) ||
                (piVar1[0x5e] == 0 || piVar1[0x5e] != *piVar1)) goto code_r0x000e3678;
        unaff_x21 = (byte *)(lVar13 + iVar5 + -10);
      } while (unaff_x21 < unaff_x22);
      unaff_s14 = unaff_s13 + unaff_s8;
      unaff_x24 = unaff_x22;
    }
    in_stack_00000038._4_4_ = 0;
    in_w8 = (uint)*unaff_x24;
  } while( true );
}

