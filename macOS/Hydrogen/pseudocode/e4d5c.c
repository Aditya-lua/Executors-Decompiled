
/* WARNING: Possible PIC construction at 0x000e52d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000e52ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x000e52d4) */
/* WARNING: Removing unreachable block (ram,0x000e52f0) */
/* WARNING: Removing unreachable block (ram,0x000e532c) */
/* WARNING: Removing unreachable block (ram,0x000e5354) */
/* WARNING: Removing unreachable block (ram,0x000e535c) */
/* WARNING: Removing unreachable block (ram,0x000e5364) */
/* WARNING: Removing unreachable block (ram,0x000e5490) */
/* WARNING: Removing unreachable block (ram,0x000e53ac) */
/* WARNING: Removing unreachable block (ram,0x000e5410) */
/* WARNING: Removing unreachable block (ram,0x000e5420) */
/* WARNING: Removing unreachable block (ram,0x000e5430) */
/* WARNING: Removing unreachable block (ram,0x000e5454) */
/* WARNING: Removing unreachable block (ram,0x000e5464) */
/* WARNING: Removing unreachable block (ram,0x000e547c) */
/* WARNING: Removing unreachable block (ram,0x000e5308) */

void FUN_000e4d5c(void)

{
  undefined1 *puVar1;
  int *piVar2;
  byte bVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  uint uVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  ulong unaff_x19;
  long lVar11;
  long unaff_x20;
  uint unaff_w22;
  char *unaff_x23;
  ulong uVar12;
  long unaff_x24;
  long lVar13;
  long lVar14;
  long unaff_x27;
  long unaff_x29;
  char *pcStack0000000000000000;
  int in_stack_00000040;
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
  char cStack00000000000000a0;
  
  do {
    pcStack0000000000000000 = *(char **)(unaff_x19 + 0x28);
    if (pcStack0000000000000000 == (char *)0x0) {
      pcStack0000000000000000 = *(char **)(unaff_x19 + 0x10);
      func_0x000b875c(unaff_x29 + -0x84,0x14,"0x%p");
      pcStack0000000000000000 = (char *)((ulong)*(uint *)(unaff_x19 + 0x20) / 3);
      func_0x000b875c(&cStack00000000000000a0,300,
                      "DrawCmd:%5d tris, Tex %s, ClipRect (%4.0f,%4.0f)-(%4.0f,%4.0f)");
      pcStack0000000000000000 = &cStack00000000000000a0;
      iVar4 = func_0x001227f4(((long)(unaff_x19 - *(long *)(unaff_x24 + 8)) >> 3) *
                              0x6db6db6db6db6db7,"%s");
      iVar5 = func_0x000c2648(0);
      if (iVar5 != 0) {
        if (*unaff_x23 == '\0') {
          if ((unaff_x23[1] != '\0') && (unaff_x20 != 0)) {
            func_0x000e6400();
          }
        }
        else if (unaff_x20 != 0) {
          func_0x000e6400();
        }
      }
      if (iVar4 != 0) {
        if (*(int *)(in_stack_00000048 + 0x10) < 1) {
          lVar14 = 0;
        }
        else {
          lVar14 = *(long *)(in_stack_00000048 + 0x18);
        }
        uVar6 = *(uint *)(unaff_x19 + 0x1c);
        lVar13 = *(long *)(in_stack_00000048 + 0x28) +
                 (ulong)*(uint *)(unaff_x19 + 0x18) * (ulong)unaff_w22;
        pcStack0000000000000000 = (char *)(ulong)*(uint *)(unaff_x19 + 0x20);
        uVar7 = *(uint *)(unaff_x19 + 0x20) + uVar6;
        if (uVar6 < uVar7) {
          do {
            uVar6 = uVar6 + 3;
          } while (uVar6 < uVar7);
        }
        func_0x000b875c(&cStack00000000000000a0,300,
                        "Mesh: ElemCount: %d, VtxOffset: +%d, IdxOffset: +%d, Area: ~%0.f px");
        uStack0000000000000060 = 0;
        func_0x0010f27c(&cStack00000000000000a0,0,0,&uStack0000000000000060);
        bVar3 = func_0x000c2648(0);
        if ((bVar3 & unaff_x20 != 0) != 0) {
          func_0x000e6400();
        }
        in_stack_00000080 = 0;
        _iStack0000000000000068 = 0;
        uStack0000000000000060 = 0;
        in_stack_00000078 = 0;
        in_stack_00000070 = 0;
        func_0x000bab98(0xbf800000,&uStack0000000000000060,(ulong)*(uint *)(unaff_x19 + 0x20) / 3);
        while (iVar4 = func_0x000bb10c(&uStack0000000000000060), iVar4 != 0) {
          uVar12 = _iStack0000000000000068 & 0xffffffff;
          if (iStack0000000000000068 < iStack000000000000006c) {
            uVar6 = *(int *)(unaff_x19 + 0x1c) + iStack0000000000000068 * 3;
            do {
              in_stack_00000090 = 0;
              in_stack_00000098 = 0;
              lVar11 = (long)(int)uVar6;
              uVar7 = uVar6;
              if (lVar14 != 0) {
                uVar7 = (uint)*(ushort *)(lVar14 + lVar11 * 2);
              }
              in_stack_00000088 = *(undefined8 *)(lVar13 + (long)(int)uVar7 * (long)(int)unaff_w22);
              pcStack0000000000000000 = "Vert:";
              iVar4 = func_0x000b875c(&cStack00000000000000a0,300);
              uVar8 = lVar11 + 1;
              if (lVar14 != 0) {
                uVar8 = (ulong)*(ushort *)(lVar14 + uVar8 * 2);
              }
              puVar1 = &cStack00000000000000a0 + iVar4;
              in_stack_00000090 = *(undefined8 *)(lVar13 + (long)(int)uVar8 * (long)(int)unaff_w22);
              pcStack0000000000000000 = "     ";
              iVar4 = func_0x000b875c(puVar1,300 - (long)iVar4);
              uVar8 = lVar11 + 2;
              if (lVar14 != 0) {
                uVar8 = (ulong)*(ushort *)(lVar14 + uVar8 * 2);
              }
              in_stack_00000098 = *(undefined8 *)(lVar13 + (long)(int)uVar8 * (long)(int)unaff_w22);
              pcStack0000000000000000 = "     ";
              func_0x000b875c(puVar1 + iVar4,unaff_x27 - (long)(puVar1 + iVar4));
              uStack0000000000000058 = 0;
              func_0x0010f27c(&cStack00000000000000a0,0,0,&uStack0000000000000058);
              if (unaff_x20 != 0) {
                lVar11 = *(long *)(lRam0000000000a334c0 + 0x4000);
                if (((&UNK_00004b7b)[lRam0000000000a334c0] == '\0') ||
                   ((&UNK_00004b7a)[lRam0000000000a334c0] != '\0')) {
                  if (((*(uint *)(&UNK_000049b0 + lRam0000000000a334c0) & 1) != 0) &&
                     (((*(uint *)(&UNK_000049b0 + lRam0000000000a334c0) >> 7 & 1) != 0 ||
                      (*(long *)(&UNK_00004008 + lRam0000000000a334c0) == lVar11)))) {
                    iVar4 = *(int *)(&UNK_000049a8 + lRam0000000000a334c0);
                    iVar5 = *(int *)(&UNK_00004064 + lRam0000000000a334c0);
                    if ((iVar5 == 0) ||
                       (((iVar5 == iVar4 || ((&UNK_00004071)[lRam0000000000a334c0] != '\0')) ||
                        (iVar5 == *(int *)(lVar11 + 0x84))))) {
                      if ((((*(long *)(&UNK_00004b18 + lRam0000000000a334c0) != 0) &&
                           (lVar9 = *(long *)(*(long *)(&UNK_00004b18 + lRam0000000000a334c0) +
                                             0x388), lVar9 != 0)) &&
                          ((*(char *)(lVar9 + 0xbf) != '\0' &&
                           ((lVar10 = *(long *)(lVar11 + 0x388), lVar9 != lVar10 &&
                            ((*(byte *)(lVar9 + 0x17) & 0xc) != 0)))))) &&
                         (*(long *)(lVar10 + 0x388) != lVar9)) {
                        do {
                          if (lVar10 == lVar9) goto code_r0x000e5258;
                          lVar10 = *(long *)(lVar10 + 0x380);
                        } while (lVar10 != 0);
                        if (((&UNK_000049ad)[lRam0000000000a334c0] & 1) == 0) goto code_r0x000e5038;
                      }
code_r0x000e5258:
                      if ((((*(uint *)(&UNK_000049ac + lRam0000000000a334c0) >> 2 & 1) == 0) &&
                          ((iVar4 != *(int *)(lVar11 + 0x84) || (*(char *)(lVar11 + 0xc0) == '\0')))
                          ) && (((*(uint *)(&UNK_000049ac + lRam0000000000a334c0) >> 9 & 1) == 0 ||
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
                  uVar7 = *(uint *)(unaff_x20 + 0x30);
                  *(uint *)(unaff_x20 + 0x30) = uVar7 & 0xfffffffe;
                  func_0x000f0ff4(0x3f800000);
                  *(uint *)(unaff_x20 + 0x30) = uVar7;
                }
              }
code_r0x000e5038:
              uVar6 = uVar6 + 3;
              uVar7 = (int)uVar12 + 1;
              uVar12 = (ulong)uVar7;
            } while ((int)uVar7 < iStack000000000000006c);
          }
        }
code_r0x00123710:
        lVar14 = lRam0000000000a334c0;
        lVar13 = *(long *)(lRam0000000000a334c0 + 0x4000);
        func_0x000d8674(0);
        uVar6 = *(int *)(lVar13 + 0x198) - 1;
        *(uint *)(lVar13 + 0x198) = uVar6;
        uVar7 = 1 << (ulong)(uVar6 & 0x1f);
        uVar6 = *(uint *)(lVar13 + 0x19c);
        if ((uVar6 & uVar7) != 0) {
          piVar2 = (int *)(&UNK_00004af0 + lVar14);
          if ((((&UNK_00004b78)[lVar14] != '\0') && (*(int *)(&UNK_00004bd0 + lVar14) == 0)) &&
             (*(long *)(&UNK_00004b18 + lVar14) == lVar13)) {
            lVar11 = *(long *)(&UNK_00004af8 + lVar14);
            iVar4 = *piVar2;
            iVar5 = func_0x000daf30();
            if (iVar5 != 0) {
              func_0x000daf68(&UNK_00004c08 + lVar14,lVar11 + (long)iVar4 * 0x18 + -0x18);
            }
          }
          *piVar2 = *piVar2 + -1;
          uVar6 = *(uint *)(lVar13 + 0x19c);
        }
        *(uint *)(lVar13 + 0x19c) = uVar6 & uVar7 - 1;
        *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
             *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
        return;
      }
    }
    else {
      func_0x0010b3a8("Callback %p, user_data %p");
    }
    unaff_x19 = unaff_x19 + 0x38;
    unaff_x24 = in_stack_00000048;
    if ((ulong)(*(long *)(in_stack_00000048 + 8) + (long)in_stack_00000040 * 0x38) <= unaff_x19)
    goto code_r0x00123710;
  } while( true );
}

