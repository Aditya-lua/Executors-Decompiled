
/* WARNING: Possible PIC construction at 0x007391c4: Changing call to branch */

long FUN_00738e74(void)

{
  uint uVar1;
  byte bVar2;
  bool bVar3;
  byte *pbVar4;
  bool in_ZR;
  bool bVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  uint uVar11;
  ulong uVar12;
  long lVar13;
  long unaff_x19;
  long unaff_x20;
  uint unaff_w22;
  long unaff_x23;
  long lVar14;
  byte *unaff_x27;
  byte *unaff_x28;
  long unaff_x29;
  ulong in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  
  if (((!in_ZR) || (iVar6 = func_0x0077ed9c(), iVar6 != 0)) || (in_stack_00000088 != unaff_x20)) {
LAB_00739500:
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x60));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x50));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x58));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x40));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x48));
    (*pcRam0000000000a2b5f0)();
    unaff_x19 = 0;
  }
  else {
    uVar12 = 4;
    uVar11 = 4;
    while (pbVar4 = unaff_x28, unaff_x27 != (byte *)0x0) {
      uVar11 = (uint)uVar12;
      uVar1 = uVar11 + 1;
      uVar12 = (ulong)uVar1;
      if (unaff_w22 != 9) break;
      lVar7 = _strcspn(pbVar4);
      unaff_w22 = (uint)pbVar4[lVar7];
      unaff_x28 = pbVar4 + lVar7 + 1;
      uVar11 = uVar1;
      unaff_x27 = pbVar4;
      if (uVar1 < 7) {
                    /* WARNING: Could not recover jumptable at 0x00738da8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        lVar7 = (*(code *)(&UNK_00738d34 + (ulong)*(byte *)(unaff_x23 + uVar12) * 4))();
        return lVar7;
      }
    }
    if (uVar11 != 6) {
      if (uVar11 == 5) {
        lVar7 = (*pcRam0000000000a2b600)("");
        *(long *)(unaff_x19 + 0x48) = lVar7;
        if (lVar7 != 0) goto LAB_00739160;
      }
      goto LAB_00739500;
    }
LAB_00739160:
    bVar2 = *(byte *)(unaff_x19 + 0x74);
    if (((bVar2 & 0x12) == 0x10) ||
       ((((bVar2 >> 5 & 1) != 0 &&
         ((((bVar2 >> 1 & 1) == 0 || (*(long *)(unaff_x19 + 0x50) == 0)) ||
          ((iVar6 = _strcmp(*(long *)(unaff_x19 + 0x50),"/"), (bVar2 & 1) != 0 || (iVar6 != 0))))))
        || (((*(byte *)(in_stack_00000078 + 0x7f0) & 3) == 2 && (*(long *)(unaff_x19 + 0x68) == 0)))
        ))) goto LAB_00739500;
    *(byte *)(unaff_x19 + 0x74) = (*(byte *)(in_stack_00000078 + 0x7f0) & 1) << 2 | bVar2 & 0xfb;
    iVar6 = *(int *)(in_stack_00000078 + 0x7ec) + 1;
    *(int *)(in_stack_00000078 + 0x7ec) = iVar6;
    *(int *)(unaff_x19 + 0x70) = iVar6;
    if ((in_stack_00000068 & 0x100000000) == 0) goto code_r0x007395bc;
    lVar7 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
    lVar7 = func_0x00740a58(in_stack_00000078 + lVar7 * 0x20);
    if (lVar7 == 0) {
      bVar3 = false;
    }
    else {
      bVar3 = false;
      lVar8 = 0;
      do {
        lVar14 = func_0x00156654(lVar7);
        iVar6 = _strcmp(*(undefined8 *)(lVar14 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
        if (iVar6 == 0) {
          if (*(long *)(lVar14 + 0x60) == 0) {
            if (*(long *)(unaff_x19 + 0x60) == 0) goto code_r0x0073927c;
          }
          else if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar6 = func_0x0077e6f8(), iVar6 != 0)) {
code_r0x0073927c:
            lVar9 = *(long *)(lVar14 + 0x58);
            if ((lVar9 != 0) &&
               ((((lVar10 = *(long *)(unaff_x19 + 0x58), lVar10 != 0 &&
                  ((*(byte *)(lVar14 + 0x74) >> 1 & 1) != 0)) &&
                 ((*(byte *)(unaff_x19 + 0x74) >> 1 & 1) == 0)) &&
                ((in_stack_00000080 & 0x100000000) == 0)))) {
              lVar13 = _strchr(lVar9 + 1,0x2f);
              if (lVar13 == 0) {
                lVar13 = _strlen(lVar9);
              }
              else {
                lVar13 = lVar13 - lVar9;
              }
              iVar6 = func_0x0077e76c(lVar9,lVar10,lVar13);
              if (iVar6 != 0) {
                if (((in_stack_00000070 != 0) && (*(char *)(in_stack_00000070 + 0xa1d) < '\0')) &&
                   ((*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + in_stack_00000070 + 0x18) == 0 ||
                    (0 < *(int *)(*(long *)(
                                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                           + in_stack_00000070 + 0x18) + 8))))) {
                  func_0x0073cab8(in_stack_00000070,
                                  "cookie \'%s\' for domain \'%s\' dropped, would overlay an existing cookie"
                                 );
                }
                goto LAB_00739500;
              }
            }
          }
        }
        if (lVar8 == 0) {
          iVar6 = _strcmp(*(undefined8 *)(lVar14 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
          if (iVar6 == 0) {
            if (*(long *)(lVar14 + 0x60) == 0) {
              bVar5 = *(long *)(unaff_x19 + 0x60) == 0;
code_r0x007392c8:
              if (bVar5 || bVar3) {
code_r0x007392d4:
                if (*(long *)(lVar14 + 0x58) == 0) {
                  if (*(long *)(unaff_x19 + 0x58) == 0) goto code_r0x0073930c;
                }
                else if (((*(long *)(unaff_x19 + 0x58) != 0) &&
                         (iVar6 = func_0x0077e6f8(), iVar6 != 0)) &&
                        ((*(long *)(lVar14 + 0x58) != 0) != (*(long *)(unaff_x19 + 0x58) == 0))) {
code_r0x0073930c:
                  if (((*(byte *)(unaff_x19 + 0x74) >> 2 & 1) != 0) ||
                     ((*(byte *)(lVar14 + 0x74) >> 2 & 1) == 0)) {
                    bVar3 = true;
                    lVar8 = lVar7;
                    goto code_r0x007391f0;
                  }
                  goto LAB_00739500;
                }
              }
            }
            else {
              if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar6 = func_0x0077e6f8(), iVar6 != 0)) {
                bVar5 = ((*(byte *)(unaff_x19 + 0x74) ^ *(byte *)(lVar14 + 0x74)) & 1) == 0;
                goto code_r0x007392c8;
              }
              if (bVar3) goto code_r0x007392d4;
            }
            lVar8 = 0;
            bVar3 = false;
          }
          else {
            lVar8 = 0;
          }
        }
code_r0x007391f0:
        lVar7 = func_0x006f4058(lVar7);
      } while (lVar7 != 0);
      if (lVar8 != 0) {
        lVar7 = func_0x00156654(lVar8);
        *(undefined4 *)(unaff_x19 + 0x70) = *(undefined4 *)(lVar7 + 0x70);
        func_0x0075e5fc(lVar8);
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x60));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x50));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x58));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x40));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x48));
        (*pcRam0000000000a2b5f0)(lVar7);
      }
    }
    lVar7 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
    func_0x0075e474(in_stack_00000078 + lVar7 * 0x20);
    if (((in_stack_00000070 != 0) && ((*(byte *)(in_stack_00000078 + 0x7f0) & 1) != 0)) &&
       ((*(char *)(in_stack_00000070 + 0xa1d) < '\0' &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   in_stack_00000070 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + in_stack_00000070 + 0x18) + 8))))))) {
      func_0x0073cab8(in_stack_00000070,"%s cookie %s=\"%s\" for domain %s, path %s, expire %ld");
    }
    if (!bVar3) {
      *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + 1;
    }
    lVar7 = *(long *)(unaff_x19 + 0x68);
    if ((lVar7 != 0) && (lVar7 < *(long *)(in_stack_00000078 + 0x7e0))) {
      *(long *)(in_stack_00000078 + 0x7e0) = lVar7;
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x19;
  }
  in_stack_00000078 = ___stack_chk_fail();
code_r0x007395bc:
  lVar8 = _time(0);
  lVar7 = lVar8;
  if (*(long *)(in_stack_00000078 + 0x7e0) <= lVar8 ||
      *(long *)(in_stack_00000078 + 0x7e0) == 0x7fffffffffffffff) {
    lVar14 = 0;
    *(undefined8 *)(in_stack_00000078 + 0x7e0) = 0x7fffffffffffffff;
    do {
      lVar9 = func_0x00740a58(in_stack_00000078 + lVar14 * 0x20);
      lVar7 = 0;
      if (lVar9 != 0) {
        do {
          lVar7 = func_0x00156654(lVar9);
          lVar10 = func_0x006f4058(lVar9);
          lVar13 = *(long *)(lVar7 + 0x68);
          if (lVar13 == 0 || lVar8 <= lVar13) {
            lVar7 = lVar10;
            if ((lVar13 != 0) && (lVar13 < *(long *)(in_stack_00000078 + 0x7e0))) {
              *(long *)(in_stack_00000078 + 0x7e0) = lVar13;
            }
          }
          else {
            func_0x0075e5fc(lVar9);
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x60));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x50));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x58));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x40));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x48));
            lVar7 = (*pcRam0000000000a2b5f0)(lVar7);
            *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + -1;
          }
          lVar9 = lVar10;
        } while (lVar10 != 0);
      }
      lVar14 = lVar14 + 1;
    } while (lVar14 != 0x3f);
  }
  return lVar7;
}

