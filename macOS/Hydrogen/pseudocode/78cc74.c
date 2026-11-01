
int FUN_0078cc74(void)

{
  long lVar1;
  char in_NG;
  char in_OV;
  int iVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  uint uVar6;
  long lVar7;
  long lVar8;
  int in_w10;
  long unaff_x19;
  long unaff_x20;
  long lVar9;
  ulong uVar10;
  ulong unaff_x22;
  long *unaff_x23;
  long unaff_x24;
  long lVar11;
  int unaff_w28;
  long unaff_x29;
  undefined4 uStack0000000000000058;
  
  if (in_NG == in_OV && 0 < in_w10) {
    func_0x0073d364();
  }
  *unaff_x23 = 0;
  lVar7 = *(long *)(unaff_x19 + 0x18);
  if (lVar7 == 0) {
    if ((*(byte *)(unaff_x19 + 0xa1a) & 1) != 0) {
      uStack0000000000000058 = func_0x00741fb0();
      if (uStack0000000000000058 != 0) goto LAB_0078d210;
      lVar7 = *(long *)(unaff_x19 + 0x18);
      if (lVar7 != 0) goto code_r0x0078cca4;
      uStack0000000000000058 = 0;
    }
  }
  else {
code_r0x0078cca4:
    lVar7 = *(long *)(lVar7 + 1000);
    if (lVar7 != 0) {
      if ((*(byte *)(unaff_x19 + 0xa21) & 1) != 0) {
        uStack0000000000000058 = func_0x0078d2d4();
        if (uStack0000000000000058 != 0) goto LAB_0078d210;
        if ((unaff_x20 != 0) || (unaff_w28 != 0)) {
          func_0x0073c9e4();
          return 0x2b;
        }
        if (*(long *)(*(long *)(unaff_x19 + 0x18) + 1000) == 0) {
          func_0x0073c9e4();
          uStack0000000000000058 = 0x37;
          goto LAB_0078d210;
        }
        if (unaff_x22 == 0) {
          uStack0000000000000058 = 0;
          goto LAB_0078d210;
        }
        iVar2 = func_0x0076bb00();
        if (iVar2 == 0) {
          iVar2 = func_0x0078d2d4();
          if (iVar2 == 0) {
            iVar2 = func_0x00742068();
            goto code_r0x0078d15c;
          }
        }
        else {
          iVar2 = func_0x0078d2d4();
          if (iVar2 == 0) {
            iVar2 = func_0x0078dd70();
code_r0x0078d15c:
            if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
               (((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0 ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b5a0))))
            {
              func_0x0073d364();
            }
          }
        }
        uStack0000000000000058 = iVar2;
        goto LAB_0078d210;
      }
      if ((*(long *)(lVar7 + 0x40) == 0) &&
         (uVar3 = func_0x007298e4(lVar7 + 0x98), (uVar3 & 1) != 0)) {
        func_0x0076bb00();
        uStack0000000000000058 = func_0x0078d2d4();
        if ((uStack0000000000000058 != 0) || (lVar4 = func_0x0078d5dc(), lVar4 < 0))
        goto LAB_0078d210;
LAB_0078ce5c:
        lVar4 = lVar7 + 0x98;
        iVar2 = func_0x007298e4(lVar4);
        uVar3 = *(ulong *)(lVar7 + 0xf8);
        if (iVar2 == 0 || uVar3 < unaff_x22) {
          do {
            if (uVar3 < unaff_x22) {
              lVar5 = func_0x007298b8(lVar4);
              lVar9 = *(long *)(lVar7 + 0xf8);
              iVar2 = func_0x00729904(lVar4);
              if (iVar2 == 0) {
                lVar8 = unaff_x22 - lVar9;
                lVar11 = 0;
                lVar1 = *(long *)(lVar7 + 0x40);
                if (lVar8 <= *(long *)(lVar7 + 0x40)) {
                  lVar1 = lVar8;
                }
                lVar8 = lVar11;
                if (lVar1 != 0) {
                  uVar6 = *(uint *)(lVar7 + 0x48);
                  do {
                    *(byte *)(unaff_x29 + -0x51) =
                         *(byte *)(lVar7 + (ulong)uVar6 + 0x4c) ^
                         *(byte *)(unaff_x24 + lVar9 + lVar11);
                    lVar8 = func_0x00729948(lVar4,unaff_x29 + -0x51,1,&uStack0000000000000058);
                    if (lVar8 < 0) {
                      lVar9 = -1;
                      if ((lVar11 == 0) || (lVar8 = lVar11, uStack0000000000000058 != 0x51))
                      goto code_r0x0078cff4;
                      break;
                    }
                    uVar6 = *(int *)(lVar7 + 0x48) + 1U & 3;
                    *(uint *)(lVar7 + 0x48) = uVar6;
                    lVar11 = lVar11 + 1;
                    lVar8 = lVar1;
                  } while (lVar1 != lVar11);
                }
                lVar9 = lVar8;
                *(long *)(lVar7 + 0x40) = *(long *)(lVar7 + 0x40) - lVar9;
                if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
                   ((*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) == 0 ||
                    (0 < *(int *)(*(long *)(
                                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                           + unaff_x19 + 0x18) + 8))))) {
                  func_0x0073cab8();
                }
              }
              else {
                uStack0000000000000058 = 0x51;
                lVar9 = -1;
              }
code_r0x0078cff4:
              if ((lVar9 < 0) && (uStack0000000000000058 != 0x51)) break;
              lVar9 = func_0x007298b8(lVar4);
              *(long *)(lVar7 + 0xf8) = (lVar9 - lVar5) + *(long *)(lVar7 + 0xf8);
            }
            func_0x0076bb00();
            uStack0000000000000058 = func_0x0078d2d4();
            if (uStack0000000000000058 != 0) {
              if (uStack0000000000000058 == 0x51) {
                uVar10 = *(ulong *)(lVar7 + 0xf8);
                uVar3 = func_0x007298b8(lVar4);
                if (uVar3 < uVar10) {
                  lVar5 = *(long *)(lVar7 + 0xf8);
                  lVar4 = func_0x007298b8(lVar4);
                  lVar5 = lVar5 - lVar4;
                  *unaff_x23 = *unaff_x23 + lVar5;
                  *(long *)(lVar7 + 0xf8) = *(long *)(lVar7 + 0xf8) - lVar5;
                  uStack0000000000000058 = 0;
                }
                else {
                  if ((((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
                      ((*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) == 0 ||
                       (0 < *(int *)(*(long *)(
                                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                              + unaff_x19 + 0x18) + 8))))) &&
                     (0 < iRam0000000000a2b5a0)) {
                    func_0x0073d364();
                  }
                  uStack0000000000000058 = 0x51;
                }
              }
              break;
            }
            *unaff_x23 = *unaff_x23 + *(long *)(lVar7 + 0xf8);
            unaff_x24 = unaff_x24 + *(long *)(lVar7 + 0xf8);
            unaff_x22 = unaff_x22 - *(long *)(lVar7 + 0xf8);
            *(undefined8 *)(lVar7 + 0xf8) = 0;
            iVar2 = func_0x007298e4(lVar4);
            uVar3 = *(ulong *)(lVar7 + 0xf8);
          } while ((iVar2 == 0) || (uVar3 < unaff_x22));
        }
        if (unaff_x19 == 0) {
          return uStack0000000000000058;
        }
      }
      else {
        if (unaff_x22 < *(ulong *)(lVar7 + 0xf8)) {
          func_0x0073c9e4();
        }
        else {
          if ((long)unaff_x22 <= (long)(*(long *)(lVar7 + 0x40) + *(ulong *)(lVar7 + 0xf8)))
          goto LAB_0078ce5c;
          if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
          }
        }
        uStack0000000000000058 = 0x2b;
      }
      goto LAB_0078d210;
    }
  }
  func_0x0073c9e4();
  uStack0000000000000058 = 0x37;
LAB_0078d210:
  if ((int)*(undefined8 *)(unaff_x19 + 0xa1a) < 0) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b5a0 < 1) {
        return uStack0000000000000058;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b5a0 < 1) {
      return uStack0000000000000058;
    }
    func_0x0073d364();
  }
  return uStack0000000000000058;
}

