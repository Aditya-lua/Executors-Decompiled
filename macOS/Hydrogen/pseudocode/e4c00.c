
/* WARNING: Possible PIC construction at 0x000e52d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000e52ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x000e52d4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000e4c00(ulong param_1)

{
  float fVar1;
  int *piVar2;
  byte bVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  char *in_x3;
  long lVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  float *pfVar11;
  double dVar12;
  long lVar13;
  uint uVar14;
  float *pfVar15;
  uint uVar16;
  float *pfVar17;
  int unaff_w19;
  float *pfVar18;
  long lVar19;
  long unaff_x20;
  undefined8 *puVar20;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long lVar21;
  long unaff_x29;
  float fVar22;
  undefined8 uVar23;
  float fVar24;
  float fVar25;
  float fVar26;
  undefined1 auVar27 [12];
  char *pcStack0000000000000000;
  ulong uStack0000000000000008;
  double dStack0000000000000010;
  double dStack0000000000000018;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  int iStack0000000000000068;
  int iStack000000000000006c;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 uStack0000000000000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined1 uStack00000000000001cc;
  
  dStack0000000000000010 = (double)(ulong)*(uint *)(unaff_x24 + 0x20);
  dStack0000000000000018 = (double)(ulong)*(uint *)(unaff_x24 + 0x10);
  pcStack0000000000000000 = in_x3;
  uStack0000000000000008 = param_1;
  uVar6 = func_0x001227f4();
  lVar8 = *(long *)(unaff_x20 + 0x4c0);
  lVar7 = *(long *)(lVar8 + 0x4000);
  *(undefined1 *)(lVar7 + 0xc0) = 1;
  if (*(long *)(lVar7 + 0x2a8) == unaff_x24) {
    if (*(char *)(lVar7 + 0xc3) == '\0') {
      *(float *)(lVar7 + 0x110) = *(float *)(&UNK_00003934 + lVar8) + *(float *)(lVar7 + 0x118);
      *(undefined4 *)(lVar7 + 0x114) = *(undefined4 *)(lVar7 + 0x11c);
      *(undefined8 *)(lVar7 + 0x138) = *(undefined8 *)(lVar7 + 0x140);
      *(undefined4 *)(lVar7 + 0x148) = *(undefined4 *)(lVar7 + 0x14c);
      *(undefined1 *)(lVar7 + 0x150) = 1;
    }
    in_stack_000000a8 = _UNK_0080c358;
    uStack00000000000000a0 = _UNK_0080c350;
    func_0x0010ae94(&uStack00000000000000a0,"CURRENTLY APPENDING");
    if ((uVar6 & 1) != 0) goto code_r0x00123710;
LAB_000e52f0:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
      return;
    }
    auVar27 = ___stack_chk_fail();
    if (auVar27._8_4_ == 0) {
      __Unwind_Resume(auVar27._0_8_);
    }
    lVar7 = func_0x0001753c(auVar27._0_8_);
    func_0x001237f8(1,2);
    iVar4 = func_0x001226d4("viewport0","Viewport #%d");
    if (iVar4 == 0) {
      return;
    }
    func_0x0010b3a8(
                   "Main Pos: (%.0f,%.0f), Size: (%.0f,%.0f)\nWorkArea Offset Left: %.0f Top: %.0f, Right: %.0f, Bottom: %.0f"
                   );
    func_0x0010b3a8("Flags: 0x%04X =%s%s%s");
    if (*(int *)(lVar7 + 0x58) != 0) {
      lVar8 = (long)*(int *)(lVar7 + 0x58) << 3;
      uVar23 = extraout_x1;
      puVar20 = *(undefined8 **)(lVar7 + 0x60);
      do {
        func_0x000e4b74(0,uVar23,*puVar20,"DrawList");
        lVar8 = lVar8 + -8;
        uVar23 = extraout_x1_00;
        puVar20 = puVar20 + 1;
      } while (lVar8 != 0);
    }
  }
  else {
    lVar7 = func_0x000c2e18(**(undefined8 **)(&UNK_00004b10 + lVar8),1,"##Foreground");
    if (unaff_x21 == 0) {
      if ((uVar6 & 1) == 0) goto LAB_000e52f0;
    }
    else {
      iVar4 = func_0x000c2648(0);
      if ((iVar4 != 0) && (lVar7 != 0)) {
        uVar23 = *(undefined8 *)(unaff_x21 + 0x28);
        uStack00000000000000a0 =
             CONCAT44((float)((ulong)uVar23 >> 0x20) +
                      (float)((ulong)*(undefined8 *)(unaff_x21 + 0x30) >> 0x20),
                      (float)uVar23 + (float)*(undefined8 *)(unaff_x21 + 0x30));
        func_0x000f3af4(0,0x3f800000,lVar7,(undefined8 *)(unaff_x21 + 0x28),&uStack00000000000000a0,
                        0xff00ffff,0);
      }
      if ((uVar6 & 1) == 0) goto LAB_000e52f0;
      if (*(char *)(unaff_x21 + 0xbf) == '\0') {
        func_0x0010afc0("Warning: owning Window is inactive. This DrawList is not being rendered!");
      }
    }
    if (0 < unaff_w19) {
      pfVar18 = *(float **)(unaff_x24 + 8);
      do {
        pcStack0000000000000000 = *(char **)(pfVar18 + 10);
        if (pcStack0000000000000000 == (char *)0x0) {
          pcStack0000000000000000 = *(char **)(pfVar18 + 4);
          func_0x000b875c(unaff_x29 + -0x84,0x14,"0x%p");
          pcStack0000000000000000 = (char *)((ulong)(uint)pfVar18[8] / 3);
          dStack0000000000000010 = (double)*pfVar18;
          dStack0000000000000018 = (double)pfVar18[1];
          uStack0000000000000008 = unaff_x29 - 0x84;
          func_0x000b875c(&uStack00000000000000a0,300,
                          "DrawCmd:%5d tris, Tex %s, ClipRect (%4.0f,%4.0f)-(%4.0f,%4.0f)");
          pcStack0000000000000000 = (char *)&uStack00000000000000a0;
          iVar4 = func_0x001227f4(((long)pfVar18 - *(long *)(unaff_x24 + 8) >> 3) *
                                  0x6db6db6db6db6db7,"%s");
          iVar5 = func_0x000c2648(0);
          if (iVar5 != 0) {
            if ((&UNK_00006095)[unaff_x23] == '\0') {
              if (((&UNK_00006096)[unaff_x23] != '\0') && (lVar7 != 0)) {
                func_0x000e6400(lVar7,unaff_x24,pfVar18,0,1);
              }
            }
            else if (lVar7 != 0) {
              func_0x000e6400(lVar7,unaff_x24,pfVar18,1,(&UNK_00006096)[unaff_x23]);
            }
          }
          if (iVar4 != 0) {
            if (*(int *)(unaff_x24 + 0x10) < 1) {
              lVar8 = 0;
            }
            else {
              lVar8 = *(long *)(unaff_x24 + 0x18);
            }
            uStack0000000000000008 = (ulong)(uint)pfVar18[6];
            fVar24 = pfVar18[7];
            dStack0000000000000010 = (double)(ulong)(uint)fVar24;
            lVar21 = *(long *)(unaff_x24 + 0x28) + uStack0000000000000008 * 0x14;
            pcStack0000000000000000 = (char *)(ulong)(uint)pfVar18[8];
            fVar22 = 0.0;
            fVar1 = (float)((int)pfVar18[8] + (int)fVar24);
            if ((uint)fVar24 < (uint)fVar1) {
              dVar12 = dStack0000000000000010;
              do {
                iVar4 = SUB84(dVar12,0);
                if (lVar8 == 0) {
                  uVar14 = iVar4 + 1;
                  uVar16 = iVar4 + 2;
                }
                else {
                  dVar12 = (double)(ulong)*(ushort *)(lVar8 + (long)dVar12 * 2);
                  uVar14 = (uint)*(ushort *)(lVar8 + (ulong)(iVar4 + 1) * 2);
                  uVar16 = (uint)*(ushort *)(lVar8 + (ulong)(iVar4 + 2) * 2);
                }
                pfVar17 = (float *)(lVar21 + (ulong)uVar16 * 0x14);
                fVar24 = pfVar17[1];
                pfVar15 = (float *)(lVar21 + (ulong)uVar14 * 0x14);
                fVar25 = pfVar15[1];
                pfVar11 = (float *)(lVar21 + (long)dVar12 * 0x14);
                fVar26 = pfVar11[1];
                dVar12 = (double)(ulong)(iVar4 + 3U);
                fVar22 = fVar22 + ABS(*pfVar15 * (fVar24 - fVar26) + (fVar25 - fVar24) * *pfVar11 +
                                      (fVar26 - fVar25) * *pfVar17) * 0.5;
              } while (iVar4 + 3U < (uint)fVar1);
            }
            dStack0000000000000018 = (double)fVar22;
            func_0x000b875c(&uStack00000000000000a0,300,
                            "Mesh: ElemCount: %d, VtxOffset: +%d, IdxOffset: +%d, Area: ~%0.f px");
            uStack0000000000000060 = 0;
            func_0x0010f27c(&uStack00000000000000a0,0,0,&uStack0000000000000060);
            bVar3 = func_0x000c2648(0);
            if ((bVar3 & lVar7 != 0) != 0) {
              func_0x000e6400(lVar7,unaff_x24,pfVar18,1,0);
            }
            in_stack_00000080 = 0;
            _iStack0000000000000068 = 0;
            uStack0000000000000060 = 0;
            in_stack_00000078 = 0;
            in_stack_00000070 = 0;
            func_0x000bab98(0xbf800000,&uStack0000000000000060,(ulong)(uint)pfVar18[8] / 3);
            while (iVar4 = func_0x000bb10c(&uStack0000000000000060), iVar4 != 0) {
              uVar6 = _iStack0000000000000068 & 0xffffffff;
              if (iStack0000000000000068 < iStack000000000000006c) {
                uVar14 = (int)pfVar18[7] + iStack0000000000000068 * 3;
                do {
                  in_stack_00000090 = 0;
                  in_stack_00000098 = 0;
                  lVar19 = (long)(int)uVar14;
                  uVar16 = uVar14;
                  if (lVar8 != 0) {
                    uVar16 = (uint)*(ushort *)(lVar8 + lVar19 * 2);
                  }
                  pfVar11 = (float *)(lVar21 + (long)(int)uVar16 * 0x14);
                  uStack0000000000000088 = *(undefined8 *)pfVar11;
                  dStack0000000000000010 = (double)*pfVar11;
                  dStack0000000000000018 = (double)pfVar11[1];
                  pcStack0000000000000000 = "Vert:";
                  uStack0000000000000008 = lVar19;
                  iVar4 = func_0x000b875c(&uStack00000000000000a0,300,
                                          "%s %04d: pos (%8.2f,%8.2f), uv (%.6f,%.6f), col %08X\n");
                  uStack0000000000000008 = lVar19 + 1;
                  if (lVar8 == 0) {
                    uVar9 = uStack0000000000000008;
                  }
                  else {
                    uVar9 = (ulong)*(ushort *)(lVar8 + uStack0000000000000008 * 2);
                  }
                  lVar10 = (long)&uStack00000000000000a0 + (long)iVar4;
                  pfVar11 = (float *)(lVar21 + (long)(int)uVar9 * 0x14);
                  in_stack_00000090 = *(undefined8 *)pfVar11;
                  dStack0000000000000010 = (double)*pfVar11;
                  dStack0000000000000018 = (double)pfVar11[1];
                  pcStack0000000000000000 = "     ";
                  iVar4 = func_0x000b875c(lVar10,300 - (long)iVar4,
                                          "%s %04d: pos (%8.2f,%8.2f), uv (%.6f,%.6f), col %08X\n");
                  uStack0000000000000008 = lVar19 + 2;
                  if (lVar8 == 0) {
                    uVar9 = uStack0000000000000008;
                  }
                  else {
                    uVar9 = (ulong)*(ushort *)(lVar8 + uStack0000000000000008 * 2);
                  }
                  lVar10 = lVar10 + iVar4;
                  pfVar11 = (float *)(lVar21 + (long)(int)uVar9 * 0x14);
                  in_stack_00000098 = *(undefined8 *)pfVar11;
                  dStack0000000000000010 = (double)*pfVar11;
                  dStack0000000000000018 = (double)pfVar11[1];
                  pcStack0000000000000000 = "     ";
                  func_0x000b875c(lVar10,&uStack00000000000001cc + -lVar10,
                                  "%s %04d: pos (%8.2f,%8.2f), uv (%.6f,%.6f), col %08X\n");
                  uStack0000000000000058 = 0;
                  func_0x0010f27c(&uStack00000000000000a0,0,0,&uStack0000000000000058);
                  if (lVar7 != 0) {
                    lVar19 = *(long *)(lRam0000000000a334c0 + 0x4000);
                    if (((&UNK_00004b7b)[lRam0000000000a334c0] == '\0') ||
                       ((&UNK_00004b7a)[lRam0000000000a334c0] != '\0')) {
                      if (((*(uint *)(&UNK_000049b0 + lRam0000000000a334c0) & 1) != 0) &&
                         (((*(uint *)(&UNK_000049b0 + lRam0000000000a334c0) >> 7 & 1) != 0 ||
                          (*(long *)(&UNK_00004008 + lRam0000000000a334c0) == lVar19)))) {
                        iVar4 = *(int *)(&UNK_000049a8 + lRam0000000000a334c0);
                        iVar5 = *(int *)(&UNK_00004064 + lRam0000000000a334c0);
                        if ((iVar5 == 0) ||
                           (((iVar5 == iVar4 || ((&UNK_00004071)[lRam0000000000a334c0] != '\0')) ||
                            (iVar5 == *(int *)(lVar19 + 0x84))))) {
                          if ((((*(long *)(&UNK_00004b18 + lRam0000000000a334c0) != 0) &&
                               (lVar10 = *(long *)(*(long *)(&UNK_00004b18 + lRam0000000000a334c0) +
                                                  0x388), lVar10 != 0)) &&
                              ((*(char *)(lVar10 + 0xbf) != '\0' &&
                               ((lVar13 = *(long *)(lVar19 + 0x388), lVar10 != lVar13 &&
                                ((*(byte *)(lVar10 + 0x17) & 0xc) != 0)))))) &&
                             (*(long *)(lVar13 + 0x388) != lVar10)) {
                            do {
                              if (lVar13 == lVar10) goto code_r0x000e5258;
                              lVar13 = *(long *)(lVar13 + 0x380);
                            } while (lVar13 != 0);
                            if (((&UNK_000049ad)[lRam0000000000a334c0] & 1) == 0)
                            goto code_r0x000e5038;
                          }
code_r0x000e5258:
                          if ((((*(uint *)(&UNK_000049ac + lRam0000000000a334c0) >> 2 & 1) == 0) &&
                              ((iVar4 != *(int *)(lVar19 + 0x84) ||
                               (*(char *)(lVar19 + 0xc0) == '\0')))) &&
                             (((*(uint *)(&UNK_000049ac + lRam0000000000a334c0) >> 9 & 1) == 0 ||
                              ((iVar4 == 0 ||
                               (*(int *)(&UNK_00004054 + lRam0000000000a334c0) == iVar4))))))
                          goto code_r0x000e52a0;
                        }
                      }
                    }
                    else if ((((byte)(&UNK_000049ac)[lRam0000000000a334c0] >> 2 & 1) == 0) &&
                            ((*(int *)(&UNK_00004b20 + lRam0000000000a334c0) != 0 &&
                             (*(int *)(&UNK_00004b20 + lRam0000000000a334c0) ==
                              *(int *)(&UNK_000049a8 + lRam0000000000a334c0))))) {
code_r0x000e52a0:
                      uVar16 = *(uint *)(lVar7 + 0x30);
                      *(uint *)(lVar7 + 0x30) = uVar16 & 0xfffffffe;
                      func_0x000f0ff4(0x3f800000,lVar7,&uStack0000000000000088,3,0xff00ffff,1);
                      *(uint *)(lVar7 + 0x30) = uVar16;
                    }
                  }
code_r0x000e5038:
                  uVar14 = uVar14 + 3;
                  uVar16 = (int)uVar6 + 1;
                  uVar6 = (ulong)uVar16;
                } while ((int)uVar16 < iStack000000000000006c);
              }
            }
            break;
          }
        }
        else {
          uStack0000000000000008 = *(ulong *)(pfVar18 + 0xc);
          func_0x0010b3a8("Callback %p, user_data %p");
        }
        pfVar18 = pfVar18 + 0xe;
      } while (pfVar18 < (float *)(*(long *)(unaff_x24 + 8) + (long)unaff_w19 * 0x38));
    }
  }
code_r0x00123710:
  lVar7 = lRam0000000000a334c0;
  lVar8 = *(long *)(lRam0000000000a334c0 + 0x4000);
  func_0x000d8674(0);
  uVar14 = *(int *)(lVar8 + 0x198) - 1;
  *(uint *)(lVar8 + 0x198) = uVar14;
  uVar16 = 1 << (ulong)(uVar14 & 0x1f);
  uVar14 = *(uint *)(lVar8 + 0x19c);
  if ((uVar14 & uVar16) != 0) {
    piVar2 = (int *)(&UNK_00004af0 + lVar7);
    if ((((&UNK_00004b78)[lVar7] != '\0') && (*(int *)(&UNK_00004bd0 + lVar7) == 0)) &&
       (*(long *)(&UNK_00004b18 + lVar7) == lVar8)) {
      lVar21 = *(long *)(&UNK_00004af8 + lVar7);
      iVar4 = *piVar2;
      iVar5 = func_0x000daf30();
      if (iVar5 != 0) {
        func_0x000daf68(&UNK_00004c08 + lVar7,lVar21 + (long)iVar4 * 0x18 + -0x18);
      }
    }
    *piVar2 = *piVar2 + -1;
    uVar14 = *(uint *)(lVar8 + 0x19c);
  }
  *(uint *)(lVar8 + 0x19c) = uVar14 & uVar16 - 1;
  *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  return;
}

