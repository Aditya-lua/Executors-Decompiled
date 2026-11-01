
/* WARNING: Possible PIC construction at 0x000e52d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000e52ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x000e52d4) */

void FUN_000e4c68(void)

{
  int *piVar1;
  byte bVar2;
  int iVar3;
  int iVar4;
  undefined8 extraout_x1;
  undefined8 uVar5;
  undefined8 extraout_x1_00;
  uint uVar6;
  uint uVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  int unaff_w19;
  ulong uVar11;
  long lVar12;
  long unaff_x20;
  undefined8 *puVar13;
  long unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  ulong uVar14;
  long unaff_x24;
  long lVar15;
  long lVar16;
  long unaff_x29;
  undefined1 auVar17 [12];
  long in_stack_00000048;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  int iStack0000000000000068;
  int iStack000000000000006c;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined1 uStack00000000000001cc;
  
  iVar3 = func_0x000c2648(0);
  if ((iVar3 != 0) && (unaff_x20 != 0)) {
    uStack00000000000000a0 =
         CONCAT44((float)((ulong)*(undefined8 *)(unaff_x21 + 0x28) >> 0x20) +
                  (float)((ulong)*(undefined8 *)(unaff_x21 + 0x30) >> 0x20),
                  (float)*(undefined8 *)(unaff_x21 + 0x28) +
                  (float)*(undefined8 *)(unaff_x21 + 0x30));
    func_0x000f3af4(0,0x3f800000);
    unaff_x24 = in_stack_00000048;
  }
  if ((unaff_x22 & 1) == 0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
      return;
    }
    auVar17 = ___stack_chk_fail();
    if (auVar17._8_4_ == 0) {
      __Unwind_Resume(auVar17._0_8_);
    }
    lVar16 = func_0x0001753c(auVar17._0_8_);
    func_0x001237f8(1,2);
    iVar3 = func_0x001226d4("viewport0","Viewport #%d");
    if (iVar3 == 0) {
      return;
    }
    func_0x0010b3a8(
                   "Main Pos: (%.0f,%.0f), Size: (%.0f,%.0f)\nWorkArea Offset Left: %.0f Top: %.0f, Right: %.0f, Bottom: %.0f"
                   );
    func_0x0010b3a8("Flags: 0x%04X =%s%s%s");
    if (*(int *)(lVar16 + 0x58) != 0) {
      lVar15 = (long)*(int *)(lVar16 + 0x58) << 3;
      uVar5 = extraout_x1;
      puVar13 = *(undefined8 **)(lVar16 + 0x60);
      do {
        func_0x000e4b74(0,uVar5,*puVar13,"DrawList");
        lVar15 = lVar15 + -8;
        uVar5 = extraout_x1_00;
        puVar13 = puVar13 + 1;
      } while (lVar15 != 0);
    }
  }
  else {
    if (*(char *)(unaff_x21 + 0xbf) == '\0') {
      func_0x0010afc0("Warning: owning Window is inactive. This DrawList is not being rendered!");
      unaff_x24 = in_stack_00000048;
    }
    if (0 < unaff_w19) {
      uVar11 = *(ulong *)(unaff_x24 + 8);
      do {
        if (*(long *)(uVar11 + 0x28) == 0) {
          func_0x000b875c(unaff_x29 + -0x84,0x14,"0x%p");
          func_0x000b875c(&uStack00000000000000a0,300,
                          "DrawCmd:%5d tris, Tex %s, ClipRect (%4.0f,%4.0f)-(%4.0f,%4.0f)");
          iVar3 = func_0x001227f4(((long)(uVar11 - *(long *)(unaff_x24 + 8)) >> 3) *
                                  0x6db6db6db6db6db7,"%s");
          iVar4 = func_0x000c2648(0);
          if (iVar4 != 0) {
            if ((&UNK_00006095)[unaff_x23] == '\0') {
              if (((&UNK_00006096)[unaff_x23] != '\0') && (unaff_x20 != 0)) {
                func_0x000e6400();
              }
            }
            else if (unaff_x20 != 0) {
              func_0x000e6400();
            }
          }
          if (iVar3 != 0) {
            if (*(int *)(in_stack_00000048 + 0x10) < 1) {
              lVar16 = 0;
            }
            else {
              lVar16 = *(long *)(in_stack_00000048 + 0x18);
            }
            uVar6 = *(uint *)(uVar11 + 0x1c);
            lVar15 = *(long *)(in_stack_00000048 + 0x28) + (ulong)*(uint *)(uVar11 + 0x18) * 0x14;
            uVar7 = *(int *)(uVar11 + 0x20) + uVar6;
            if (uVar6 < uVar7) {
              do {
                uVar6 = uVar6 + 3;
              } while (uVar6 < uVar7);
            }
            func_0x000b875c(&uStack00000000000000a0,300,
                            "Mesh: ElemCount: %d, VtxOffset: +%d, IdxOffset: +%d, Area: ~%0.f px");
            uStack0000000000000060 = 0;
            func_0x0010f27c(&uStack00000000000000a0,0,0,&uStack0000000000000060);
            bVar2 = func_0x000c2648(0);
            if ((bVar2 & unaff_x20 != 0) != 0) {
              func_0x000e6400();
            }
            in_stack_00000080 = 0;
            _iStack0000000000000068 = 0;
            uStack0000000000000060 = 0;
            in_stack_00000078 = 0;
            in_stack_00000070 = 0;
            func_0x000bab98(0xbf800000,&uStack0000000000000060,(ulong)*(uint *)(uVar11 + 0x20) / 3);
            while (iVar3 = func_0x000bb10c(&uStack0000000000000060), iVar3 != 0) {
              uVar14 = _iStack0000000000000068 & 0xffffffff;
              if (iStack0000000000000068 < iStack000000000000006c) {
                uVar6 = *(int *)(uVar11 + 0x1c) + iStack0000000000000068 * 3;
                do {
                  in_stack_00000090 = 0;
                  in_stack_00000098 = 0;
                  lVar12 = (long)(int)uVar6;
                  uVar7 = uVar6;
                  if (lVar16 != 0) {
                    uVar7 = (uint)*(ushort *)(lVar16 + lVar12 * 2);
                  }
                  in_stack_00000088 = *(undefined8 *)(lVar15 + (long)(int)uVar7 * 0x14);
                  iVar3 = func_0x000b875c(&uStack00000000000000a0,300,
                                          "%s %04d: pos (%8.2f,%8.2f), uv (%.6f,%.6f), col %08X\n");
                  uVar8 = lVar12 + 1;
                  if (lVar16 != 0) {
                    uVar8 = (ulong)*(ushort *)(lVar16 + uVar8 * 2);
                  }
                  lVar9 = (long)&uStack00000000000000a0 + (long)iVar3;
                  in_stack_00000090 = *(undefined8 *)(lVar15 + (long)(int)uVar8 * 0x14);
                  iVar3 = func_0x000b875c(lVar9,300 - (long)iVar3,
                                          "%s %04d: pos (%8.2f,%8.2f), uv (%.6f,%.6f), col %08X\n");
                  uVar8 = lVar12 + 2;
                  if (lVar16 != 0) {
                    uVar8 = (ulong)*(ushort *)(lVar16 + uVar8 * 2);
                  }
                  lVar9 = lVar9 + iVar3;
                  in_stack_00000098 = *(undefined8 *)(lVar15 + (long)(int)uVar8 * 0x14);
                  func_0x000b875c(lVar9,&uStack00000000000001cc + -lVar9,
                                  "%s %04d: pos (%8.2f,%8.2f), uv (%.6f,%.6f), col %08X\n");
                  uStack0000000000000058 = 0;
                  func_0x0010f27c(&uStack00000000000000a0,0,0,&uStack0000000000000058);
                  if (unaff_x20 != 0) {
                    lVar12 = *(long *)(lRam0000000000a334c0 + 0x4000);
                    if (((&UNK_00004b7b)[lRam0000000000a334c0] == '\0') ||
                       ((&UNK_00004b7a)[lRam0000000000a334c0] != '\0')) {
                      if (((*(uint *)(&UNK_000049b0 + lRam0000000000a334c0) & 1) != 0) &&
                         (((*(uint *)(&UNK_000049b0 + lRam0000000000a334c0) >> 7 & 1) != 0 ||
                          (*(long *)(&UNK_00004008 + lRam0000000000a334c0) == lVar12)))) {
                        iVar3 = *(int *)(&UNK_000049a8 + lRam0000000000a334c0);
                        iVar4 = *(int *)(&UNK_00004064 + lRam0000000000a334c0);
                        if ((iVar4 == 0) ||
                           (((iVar4 == iVar3 || ((&UNK_00004071)[lRam0000000000a334c0] != '\0')) ||
                            (iVar4 == *(int *)(lVar12 + 0x84))))) {
                          if ((((*(long *)(&UNK_00004b18 + lRam0000000000a334c0) != 0) &&
                               (lVar9 = *(long *)(*(long *)(&UNK_00004b18 + lRam0000000000a334c0) +
                                                 0x388), lVar9 != 0)) &&
                              ((*(char *)(lVar9 + 0xbf) != '\0' &&
                               ((lVar10 = *(long *)(lVar12 + 0x388), lVar9 != lVar10 &&
                                ((*(byte *)(lVar9 + 0x17) & 0xc) != 0)))))) &&
                             (*(long *)(lVar10 + 0x388) != lVar9)) {
                            do {
                              if (lVar10 == lVar9) goto code_r0x000e5258;
                              lVar10 = *(long *)(lVar10 + 0x380);
                            } while (lVar10 != 0);
                            if (((&UNK_000049ad)[lRam0000000000a334c0] & 1) == 0)
                            goto code_r0x000e5038;
                          }
code_r0x000e5258:
                          if ((((*(uint *)(&UNK_000049ac + lRam0000000000a334c0) >> 2 & 1) == 0) &&
                              ((iVar3 != *(int *)(lVar12 + 0x84) ||
                               (*(char *)(lVar12 + 0xc0) == '\0')))) &&
                             (((*(uint *)(&UNK_000049ac + lRam0000000000a334c0) >> 9 & 1) == 0 ||
                              ((iVar3 == 0 ||
                               (*(int *)(&UNK_00004054 + lRam0000000000a334c0) == iVar3))))))
                          goto code_r0x000e52a0;
                        }
                      }
                    }
                    else if ((((byte)(&UNK_000049ac)[lRam0000000000a334c0] >> 2 & 1) == 0) &&
                            ((*(int *)(&UNK_00004b20 + lRam0000000000a334c0) != 0 &&
                             (*(int *)(&UNK_00004b20 + lRam0000000000a334c0) ==
                              *(int *)(&UNK_000049a8 + lRam0000000000a334c0))))) {
code_r0x000e52a0:
                      uVar7 = *(uint *)(unaff_x20 + 0x30);
                      *(uint *)(unaff_x20 + 0x30) = uVar7 & 0xfffffffe;
                      func_0x000f0ff4(0x3f800000);
                      *(uint *)(unaff_x20 + 0x30) = uVar7;
                    }
                  }
code_r0x000e5038:
                  uVar6 = uVar6 + 3;
                  uVar7 = (int)uVar14 + 1;
                  uVar14 = (ulong)uVar7;
                } while ((int)uVar7 < iStack000000000000006c);
              }
            }
            break;
          }
        }
        else {
          func_0x0010b3a8("Callback %p, user_data %p");
        }
        uVar11 = uVar11 + 0x38;
        unaff_x24 = in_stack_00000048;
      } while (uVar11 < (ulong)(*(long *)(in_stack_00000048 + 8) + (long)unaff_w19 * 0x38));
    }
  }
  lVar16 = lRam0000000000a334c0;
  lVar15 = *(long *)(lRam0000000000a334c0 + 0x4000);
  func_0x000d8674(0);
  uVar6 = *(int *)(lVar15 + 0x198) - 1;
  *(uint *)(lVar15 + 0x198) = uVar6;
  uVar7 = 1 << (ulong)(uVar6 & 0x1f);
  uVar6 = *(uint *)(lVar15 + 0x19c);
  if ((uVar6 & uVar7) != 0) {
    piVar1 = (int *)(&UNK_00004af0 + lVar16);
    if ((((&UNK_00004b78)[lVar16] != '\0') && (*(int *)(&UNK_00004bd0 + lVar16) == 0)) &&
       (*(long *)(&UNK_00004b18 + lVar16) == lVar15)) {
      lVar12 = *(long *)(&UNK_00004af8 + lVar16);
      iVar3 = *piVar1;
      iVar4 = func_0x000daf30();
      if (iVar4 != 0) {
        func_0x000daf68(&UNK_00004c08 + lVar16,lVar12 + (long)iVar3 * 0x18 + -0x18);
      }
    }
    *piVar1 = *piVar1 + -1;
    uVar6 = *(uint *)(lVar15 + 0x19c);
  }
  *(uint *)(lVar15 + 0x19c) = uVar6 & uVar7 - 1;
  *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  return;
}

