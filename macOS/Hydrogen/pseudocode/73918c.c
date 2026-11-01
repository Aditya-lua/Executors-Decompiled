
/* WARNING: Possible PIC construction at 0x007391c4: Changing call to branch */

long FUN_0073918c(void)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  byte in_w8;
  long lVar8;
  long unaff_x19;
  byte unaff_w20;
  long lVar9;
  long unaff_x29;
  ulong in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  ulong in_stack_00000080;
  
  if (*(long *)(unaff_x19 + 0x68) == 0) {
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
    *(byte *)(unaff_x19 + 0x74) = (in_w8 & 1) << 2 | unaff_w20 & 0xfb;
    iVar3 = *(int *)(in_stack_00000078 + 0x7ec) + 1;
    *(int *)(in_stack_00000078 + 0x7ec) = iVar3;
    *(int *)(unaff_x19 + 0x70) = iVar3;
    if ((in_stack_00000068 & 0x100000000) == 0) goto SUB_007395bc;
    lVar4 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
    lVar4 = func_0x00740a58(in_stack_00000078 + lVar4 * 0x20);
    if (lVar4 == 0) {
      bVar1 = false;
    }
    else {
      bVar1 = false;
      lVar9 = 0;
      do {
        lVar5 = func_0x00156654(lVar4);
        iVar3 = _strcmp(*(undefined8 *)(lVar5 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
        if (iVar3 == 0) {
          if (*(long *)(lVar5 + 0x60) == 0) {
            if (*(long *)(unaff_x19 + 0x60) == 0) goto LAB_0073927c;
          }
          else if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar3 = func_0x0077e6f8(), iVar3 != 0)) {
LAB_0073927c:
            lVar6 = *(long *)(lVar5 + 0x58);
            if ((lVar6 != 0) &&
               ((((lVar7 = *(long *)(unaff_x19 + 0x58), lVar7 != 0 &&
                  ((*(byte *)(lVar5 + 0x74) >> 1 & 1) != 0)) &&
                 ((*(byte *)(unaff_x19 + 0x74) >> 1 & 1) == 0)) &&
                ((in_stack_00000080 & 0x100000000) == 0)))) {
              lVar8 = _strchr(lVar6 + 1,0x2f);
              if (lVar8 == 0) {
                lVar8 = _strlen(lVar6);
              }
              else {
                lVar8 = lVar8 - lVar6;
              }
              iVar3 = func_0x0077e76c(lVar6,lVar7,lVar8);
              if (iVar3 != 0) {
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
        if (lVar9 == 0) {
          iVar3 = _strcmp(*(undefined8 *)(lVar5 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
          if (iVar3 == 0) {
            if (*(long *)(lVar5 + 0x60) == 0) {
              bVar2 = *(long *)(unaff_x19 + 0x60) == 0;
LAB_007392c8:
              if (bVar2 || bVar1) {
LAB_007392d4:
                if (*(long *)(lVar5 + 0x58) == 0) {
                  if (*(long *)(unaff_x19 + 0x58) == 0) goto LAB_0073930c;
                }
                else if (((*(long *)(unaff_x19 + 0x58) != 0) &&
                         (iVar3 = func_0x0077e6f8(), iVar3 != 0)) &&
                        ((*(long *)(lVar5 + 0x58) != 0) != (*(long *)(unaff_x19 + 0x58) == 0))) {
LAB_0073930c:
                  if (((*(byte *)(unaff_x19 + 0x74) >> 2 & 1) != 0) ||
                     ((*(byte *)(lVar5 + 0x74) >> 2 & 1) == 0)) {
                    bVar1 = true;
                    lVar9 = lVar4;
                    goto LAB_007391f0;
                  }
                  goto LAB_00739500;
                }
              }
            }
            else {
              if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar3 = func_0x0077e6f8(), iVar3 != 0)) {
                bVar2 = ((*(byte *)(unaff_x19 + 0x74) ^ *(byte *)(lVar5 + 0x74)) & 1) == 0;
                goto LAB_007392c8;
              }
              if (bVar1) goto LAB_007392d4;
            }
            lVar9 = 0;
            bVar1 = false;
          }
          else {
            lVar9 = 0;
          }
        }
LAB_007391f0:
        lVar4 = func_0x006f4058(lVar4);
      } while (lVar4 != 0);
      if (lVar9 != 0) {
        lVar4 = func_0x00156654(lVar9);
        *(undefined4 *)(unaff_x19 + 0x70) = *(undefined4 *)(lVar4 + 0x70);
        func_0x0075e5fc(lVar9);
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x60));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x50));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x58));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x40));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x48));
        (*pcRam0000000000a2b5f0)(lVar4);
      }
    }
    lVar4 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
    func_0x0075e474(in_stack_00000078 + lVar4 * 0x20);
    if (((in_stack_00000070 != 0) && ((*(byte *)(in_stack_00000078 + 0x7f0) & 1) != 0)) &&
       ((*(char *)(in_stack_00000070 + 0xa1d) < '\0' &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   in_stack_00000070 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + in_stack_00000070 + 0x18) + 8))))))) {
      func_0x0073cab8(in_stack_00000070,"%s cookie %s=\"%s\" for domain %s, path %s, expire %ld");
    }
    if (!bVar1) {
      *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + 1;
    }
    lVar4 = *(long *)(unaff_x19 + 0x68);
    if ((lVar4 != 0) && (lVar4 < *(long *)(in_stack_00000078 + 0x7e0))) {
      *(long *)(in_stack_00000078 + 0x7e0) = lVar4;
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x19;
  }
  in_stack_00000078 = ___stack_chk_fail();
SUB_007395bc:
  lVar9 = _time(0);
  lVar4 = lVar9;
  if (*(long *)(in_stack_00000078 + 0x7e0) <= lVar9 ||
      *(long *)(in_stack_00000078 + 0x7e0) == 0x7fffffffffffffff) {
    lVar5 = 0;
    *(undefined8 *)(in_stack_00000078 + 0x7e0) = 0x7fffffffffffffff;
    do {
      lVar6 = func_0x00740a58(in_stack_00000078 + lVar5 * 0x20);
      lVar4 = 0;
      if (lVar6 != 0) {
        do {
          lVar4 = func_0x00156654(lVar6);
          lVar7 = func_0x006f4058(lVar6);
          lVar8 = *(long *)(lVar4 + 0x68);
          if (lVar8 == 0 || lVar9 <= lVar8) {
            lVar4 = lVar7;
            if ((lVar8 != 0) && (lVar8 < *(long *)(in_stack_00000078 + 0x7e0))) {
              *(long *)(in_stack_00000078 + 0x7e0) = lVar8;
            }
          }
          else {
            func_0x0075e5fc(lVar6);
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x60));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x50));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x58));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x40));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x48));
            lVar4 = (*pcRam0000000000a2b5f0)(lVar4);
            *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + -1;
          }
          lVar6 = lVar7;
        } while (lVar7 != 0);
      }
      lVar5 = lVar5 + 1;
    } while (lVar5 != 0x3f);
  }
  return lVar4;
}

