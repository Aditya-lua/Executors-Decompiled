
/* WARNING: Possible PIC construction at 0x007391c4: Changing call to branch */

long FUN_00739000(void)

{
  byte bVar1;
  bool bVar2;
  bool in_ZR;
  bool bVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long unaff_x19;
  long lVar10;
  long unaff_x25;
  long unaff_x29;
  long in_stack_00000060;
  ulong in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  ulong in_stack_00000080;
  
  if (in_ZR && unaff_x25 != 0) {
    lVar5 = (*pcRam0000000000a2b600)();
    *(long *)(unaff_x19 + 0x60) = lVar5;
    if (lVar5 != 0) goto LAB_00739024;
    goto LAB_00739500;
  }
LAB_00739024:
  if ((in_stack_00000060 == 0) || (*(long *)(unaff_x19 + 0x50) != 0)) {
LAB_00739148:
    if (*(long *)(unaff_x19 + 0x40) == 0) goto LAB_00739500;
    *(char *)(in_stack_00000070 + 0x1c0) = *(char *)(in_stack_00000070 + 0x1c0) + '\x01';
    bVar1 = *(byte *)(unaff_x19 + 0x74);
    if (((bVar1 & 0x12) == 0x10) ||
       ((((bVar1 >> 5 & 1) != 0 &&
         (((((bVar1 >> 1 & 1) == 0 || (*(long *)(unaff_x19 + 0x50) == 0)) ||
           (iVar4 = _strcmp(*(long *)(unaff_x19 + 0x50),"/"), (bVar1 & 1) != 0)) || (iVar4 != 0))))
        || (((*(byte *)(in_stack_00000078 + 0x7f0) & 3) == 2 && (*(long *)(unaff_x19 + 0x68) == 0)))
        ))) goto LAB_00739500;
    *(byte *)(unaff_x19 + 0x74) = (*(byte *)(in_stack_00000078 + 0x7f0) & 1) << 2 | bVar1 & 0xfb;
    iVar4 = *(int *)(in_stack_00000078 + 0x7ec) + 1;
    *(int *)(in_stack_00000078 + 0x7ec) = iVar4;
    *(int *)(unaff_x19 + 0x70) = iVar4;
    if ((in_stack_00000068 & 0x100000000) == 0) goto code_r0x007395bc;
    lVar5 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
    lVar5 = func_0x00740a58(in_stack_00000078 + lVar5 * 0x20);
    if (lVar5 == 0) {
      bVar2 = false;
    }
    else {
      bVar2 = false;
      lVar10 = 0;
      do {
        lVar6 = func_0x00156654(lVar5);
        iVar4 = _strcmp(*(undefined8 *)(lVar6 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
        if (iVar4 == 0) {
          if (*(long *)(lVar6 + 0x60) == 0) {
            if (*(long *)(unaff_x19 + 0x60) == 0) goto code_r0x0073927c;
          }
          else if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar4 = func_0x0077e6f8(), iVar4 != 0)) {
code_r0x0073927c:
            lVar7 = *(long *)(lVar6 + 0x58);
            if (((lVar7 != 0) &&
                (((lVar8 = *(long *)(unaff_x19 + 0x58), lVar8 != 0 &&
                  ((*(byte *)(lVar6 + 0x74) >> 1 & 1) != 0)) &&
                 ((*(byte *)(unaff_x19 + 0x74) >> 1 & 1) == 0)))) &&
               ((in_stack_00000080 & 0x100000000) == 0)) {
              lVar9 = _strchr(lVar7 + 1,0x2f);
              if (lVar9 == 0) {
                lVar9 = _strlen(lVar7);
              }
              else {
                lVar9 = lVar9 - lVar7;
              }
              iVar4 = func_0x0077e76c(lVar7,lVar8,lVar9);
              if (iVar4 != 0) {
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
        if (lVar10 == 0) {
          iVar4 = _strcmp(*(undefined8 *)(lVar6 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
          if (iVar4 == 0) {
            if (*(long *)(lVar6 + 0x60) == 0) {
              bVar3 = *(long *)(unaff_x19 + 0x60) == 0;
code_r0x007392c8:
              if (bVar3 || bVar2) {
code_r0x007392d4:
                if (*(long *)(lVar6 + 0x58) == 0) {
                  if (*(long *)(unaff_x19 + 0x58) == 0) goto code_r0x0073930c;
                }
                else if (((*(long *)(unaff_x19 + 0x58) != 0) &&
                         (iVar4 = func_0x0077e6f8(), iVar4 != 0)) &&
                        ((*(long *)(lVar6 + 0x58) != 0) != (*(long *)(unaff_x19 + 0x58) == 0))) {
code_r0x0073930c:
                  if (((*(byte *)(unaff_x19 + 0x74) >> 2 & 1) != 0) ||
                     ((*(byte *)(lVar6 + 0x74) >> 2 & 1) == 0)) {
                    bVar2 = true;
                    lVar10 = lVar5;
                    goto code_r0x007391f0;
                  }
                  goto LAB_00739500;
                }
              }
            }
            else {
              if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar4 = func_0x0077e6f8(), iVar4 != 0)) {
                bVar3 = ((*(byte *)(unaff_x19 + 0x74) ^ *(byte *)(lVar6 + 0x74)) & 1) == 0;
                goto code_r0x007392c8;
              }
              if (bVar2) goto code_r0x007392d4;
            }
            lVar10 = 0;
            bVar2 = false;
          }
          else {
            lVar10 = 0;
          }
        }
code_r0x007391f0:
        lVar5 = func_0x006f4058(lVar5);
      } while (lVar5 != 0);
      if (lVar10 != 0) {
        lVar5 = func_0x00156654(lVar10);
        *(undefined4 *)(unaff_x19 + 0x70) = *(undefined4 *)(lVar5 + 0x70);
        func_0x0075e5fc(lVar10);
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar5 + 0x60));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar5 + 0x50));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar5 + 0x58));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar5 + 0x40));
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar5 + 0x48));
        (*pcRam0000000000a2b5f0)(lVar5);
      }
    }
    lVar5 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
    func_0x0075e474(in_stack_00000078 + lVar5 * 0x20);
    if (((in_stack_00000070 != 0) && ((*(byte *)(in_stack_00000078 + 0x7f0) & 1) != 0)) &&
       ((*(char *)(in_stack_00000070 + 0xa1d) < '\0' &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   in_stack_00000070 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + in_stack_00000070 + 0x18) + 8))))))) {
      func_0x0073cab8(in_stack_00000070,"%s cookie %s=\"%s\" for domain %s, path %s, expire %ld");
    }
    if (!bVar2) {
      *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + 1;
    }
    lVar5 = *(long *)(unaff_x19 + 0x68);
    if ((lVar5 != 0) && (lVar5 < *(long *)(in_stack_00000078 + 0x7e0))) {
      *(long *)(in_stack_00000078 + 0x7e0) = lVar5;
    }
  }
  else {
    lVar5 = _strchr(in_stack_00000060,0x3f);
    if (lVar5 == 0) {
      lVar5 = _strrchr(in_stack_00000060,0x2f);
    }
    else {
      lVar5 = func_0x0073abd0(in_stack_00000060,0x2f,lVar5 - in_stack_00000060);
    }
    if (lVar5 == 0) goto LAB_00739148;
    lVar5 = func_0x0077e93c(in_stack_00000060,(lVar5 - in_stack_00000060) + 1);
    *(long *)(unaff_x19 + 0x50) = lVar5;
    if (lVar5 != 0) {
      lVar5 = func_0x0073a3d0();
      *(long *)(unaff_x19 + 0x58) = lVar5;
      if (lVar5 != 0) goto LAB_00739148;
    }
LAB_00739500:
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x60));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x50));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x58));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x40));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x48));
    (*pcRam0000000000a2b5f0)();
    unaff_x19 = 0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x19;
  }
  in_stack_00000078 = ___stack_chk_fail();
code_r0x007395bc:
  lVar10 = _time(0);
  lVar5 = lVar10;
  if (*(long *)(in_stack_00000078 + 0x7e0) <= lVar10 ||
      *(long *)(in_stack_00000078 + 0x7e0) == 0x7fffffffffffffff) {
    lVar6 = 0;
    *(undefined8 *)(in_stack_00000078 + 0x7e0) = 0x7fffffffffffffff;
    do {
      lVar7 = func_0x00740a58(in_stack_00000078 + lVar6 * 0x20);
      lVar5 = 0;
      if (lVar7 != 0) {
        do {
          lVar5 = func_0x00156654(lVar7);
          lVar8 = func_0x006f4058(lVar7);
          lVar9 = *(long *)(lVar5 + 0x68);
          if (lVar9 == 0 || lVar10 <= lVar9) {
            lVar5 = lVar8;
            if ((lVar9 != 0) && (lVar9 < *(long *)(in_stack_00000078 + 0x7e0))) {
              *(long *)(in_stack_00000078 + 0x7e0) = lVar9;
            }
          }
          else {
            func_0x0075e5fc(lVar7);
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar5 + 0x60));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar5 + 0x50));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar5 + 0x58));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar5 + 0x40));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar5 + 0x48));
            lVar5 = (*pcRam0000000000a2b5f0)(lVar5);
            *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + -1;
          }
          lVar7 = lVar8;
        } while (lVar8 != 0);
      }
      lVar6 = lVar6 + 1;
    } while (lVar6 != 0x3f);
  }
  return lVar5;
}

