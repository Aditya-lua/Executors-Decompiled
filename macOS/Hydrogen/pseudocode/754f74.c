
ulong FUN_00754f74(void)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  long in_x4;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x22;
  long lVar8;
  byte *unaff_x27;
  uint *unaff_x28;
  undefined1 uStack0000000000000010;
  
  func_0x0074066c(&uStack0000000000000010,unaff_x20 + 1);
  uVar4 = func_0x0074075c(&uStack0000000000000010);
  if ((int)uVar4 != 0) {
    return uVar4;
  }
  func_0x007406b0(unaff_x19 + 0xc10);
  lVar5 = func_0x00740a58(&uStack0000000000000010);
  func_0x00156654(&uStack0000000000000010);
  lVar8 = *(long *)(unaff_x19 + 0x18);
  if ((((*(int *)(unaff_x19 + 0x13c) == 3) && (*(char *)(unaff_x19 + 0x139) != '\x14')) &&
      ((char)unaff_x27[3] < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  uVar3 = *(uint *)(unaff_x19 + 0x130);
  if ((lVar5 != 0) && ((int)uVar3 < 200)) {
    uVar4 = func_0x00757554();
    if ((int)uVar4 != 0) {
      in_x4 = 0;
      goto LAB_00756450;
    }
    lVar5 = 0;
    uVar3 = *(uint *)(unaff_x19 + 0x130);
  }
  if ((int)uVar3 < 100) {
    func_0x0073c9e4();
    in_x4 = 0;
    uVar4 = 1;
  }
  else {
    uVar1 = *unaff_x28;
    if (uVar3 < 200) {
      *unaff_x28 = uVar1 | 1;
      *(undefined4 *)(unaff_x19 + 0x124) = 0;
      if (uVar3 == 0x65) {
        if (*(char *)(unaff_x19 + 0x138) == '\v') {
          if (*(int *)(unaff_x19 + 0x13c) == 1) {
            uVar4 = func_0x0078bdd4();
            if ((int)uVar4 != 0) goto code_r0x0075642c;
            *unaff_x28 = *unaff_x28 & 0xfffffffe;
            if ((*unaff_x27 & 1) == 0) {
              uVar4 = 0;
            }
            else {
              uVar4 = 0;
              *(uint *)(unaff_x19 + 0x134) = *(uint *)(unaff_x19 + 0x134) & 0xfffffffe;
            }
          }
          else if (*(int *)(unaff_x19 + 0x13c) == 2) {
            if (((char)unaff_x27[3] < '\0') &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
            in_x4 = 0;
            *(undefined4 *)(unaff_x19 + 0x13c) = 3;
            *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) =
                 *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) & 0xffffffffffdfffff;
            *unaff_x28 = *unaff_x28 | 1;
            *(undefined4 *)(unaff_x19 + 0x124) = 0;
            *(undefined1 *)(unaff_x19 + 0x138) = 0x14;
            uVar4 = 1;
          }
          else {
            in_x4 = 0;
            uVar4 = 0;
            *unaff_x28 = uVar1 & 0xfffffffe;
          }
        }
        else {
          func_0x0073c9e4();
          in_x4 = 0;
          uVar4 = 8;
        }
      }
      else {
        if (((uVar3 == 100) && (lVar8 = func_0x00774da0(), lVar8 != 0)) &&
           (*(int *)(*(long *)(lVar8 + 0x10) + 0x30) != 0)) {
          *(undefined4 *)(*(long *)(lVar8 + 0x10) + 0x30) = 0;
          *(uint *)(unaff_x19 + 0x134) = *(uint *)(unaff_x19 + 0x134) & 0xffffffbf | 2;
          func_0x0076b9e4();
        }
        in_x4 = 0;
        uVar4 = 0;
      }
    }
    else {
      *unaff_x28 = uVar1 & 0xfffffffe;
      if (*(int *)(unaff_x19 + 0x13c) == 2) {
        *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) =
             *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) & 0xffffffffffdfffff;
        func_0x007692ac(*(undefined8 *)(unaff_x19 + 0xd0));
      }
      if ((((*(long *)(unaff_x19 + 0xe8) == -1) && ((*(byte *)((long)unaff_x28 + 1) >> 4 & 1) == 0))
          && ((*(byte *)(lVar8 + 0x398) >> 5 & 1) == 0)) &&
         (((*(char *)(unaff_x19 + 0x139) == '\v' &&
           ((*(byte *)(*(long *)(lVar8 + 0x3a0) + 0x96) >> 2 & 1) == 0)) && (unaff_x27[0x928] != 5))
         )) {
        if (((char)unaff_x27[3] < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        func_0x00734f74(lVar8,2);
      }
      iVar2 = *(int *)(unaff_x19 + 0x130);
      if (*(int *)(unaff_x19 + 0x13c) == 1) goto code_r0x00755d2c;
      if (((iVar2 < 400) || (((uint)*(undefined8 *)unaff_x27 >> 0x16 & 1) == 0)) ||
         ((*(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19) != 0 &&
          ((iVar2 == 0x1a0 && (unaff_x27[0x928] == 0)))))) {
code_r0x00755c34:
        uVar4 = func_0x00752aa8();
        if ((int)uVar4 == 0) {
          if (299 < *(int *)(unaff_x19 + 0x130)) {
            if (((((*(byte *)((long)unaff_x28 + 2) >> 2 & 1) == 0) &&
                 ((*(byte *)(lVar8 + 0x398) >> 5 & 1) == 0)) &&
                (uVar4 = func_0x00773f2c(), (uVar4 & 1) == 0)) &&
               ((unaff_x27[0x928] - 1 < 4 && (uVar4 = func_0x00771930(), (uVar4 & 1) == 0)))) {
              if ((*(int *)(unaff_x19 + 0x130) == 0x1a1) && (lVar6 = func_0x00774da0(), lVar6 != 0))
              {
                if (((*(long *)(unaff_x19 + 0x100) == 0) && (lVar6 = func_0x00774da0(), lVar6 != 0))
                   && (*(int *)(*(long *)(lVar6 + 0x10) + 0x30) == 1)) {
                  if (((char)unaff_x27[3] < '\0') &&
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
                  if (((char)unaff_x27[3] < '\0') &&
                     ((*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) == 0 ||
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + unaff_x19 + 0x18) + 8))))) {
                    func_0x0073cab8();
                  }
                  func_0x00734f74(lVar8,2);
                  func_0x00752e58();
                }
                *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) | 0x200;
                uVar7 = (*pcRam0000000000a2b600)
                                  (*(undefined8 *)
                                    (
                                    "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                                    + unaff_x19 + 0x28));
                *(undefined8 *)(unaff_x19 + 0x1a8) = uVar7;
                func_0x00771a28();
              }
              else {
                uVar3 = (uint)*(undefined8 *)unaff_x27;
                if ((uVar3 >> 0x17 & 1) == 0) {
                  if (((int)uVar3 < 0) &&
                     ((*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) == 0 ||
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + unaff_x19 + 0x18) + 8))))) {
                    func_0x0073cab8();
                  }
                  func_0x00734f74(lVar8,2);
                  uVar4 = func_0x00771a28();
                  if ((int)uVar4 != 0) goto code_r0x0075642c;
                }
                else {
                  if (((int)uVar3 < 0) &&
                     ((*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) == 0 ||
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + unaff_x19 + 0x18) + 8))))) {
                    func_0x0073cab8();
                  }
                  func_0x00757688();
                }
              }
            }
            iVar2 = func_0x00773f2c();
            if ((iVar2 != 0) && (uVar4 = func_0x00771930(), (uVar4 & 1) == 0)) {
              if (((char)unaff_x27[3] < '\0') &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x19 + 0x18) + 8))))) {
                func_0x0073cab8();
              }
              *(uint *)(unaff_x19 + 0x134) = *(uint *)(unaff_x19 + 0x134) | 2;
            }
          }
          uVar3 = *unaff_x28;
          if ((uVar3 >> 0x11 & 1) != 0) {
            uVar3 = uVar3 | 8;
            *unaff_x28 = uVar3;
          }
          if ((*(long *)(unaff_x19 + 0xf0) == 0) && (*(byte *)(unaff_x19 + 0x138) < 0x14)) {
            *unaff_x28 = uVar3 | 8;
          }
          uVar4 = func_0x007576e8();
          if ((int)uVar4 == 0) {
            uVar4 = func_0x00757894();
          }
        }
code_r0x0075642c:
        in_x4 = 0;
      }
      else {
        if (iVar2 == 0x197) {
          if ((*(byte *)(*(long *)(unaff_x19 + 0x18) + 0x398) >> 2 & 1) != 0) goto code_r0x00755c28;
        }
        else if ((iVar2 == 0x191) &&
                (*(long *)((long)&linkedit_data_command_00001318.cmd + unaff_x19) != 0)) {
code_r0x00755c28:
          if (-1 < (char)(&UNK_00001344)[unaff_x19]) goto code_r0x00755c34;
        }
code_r0x00755d2c:
        func_0x0073c9e4();
        in_x4 = 0;
        uVar4 = 0x16;
      }
    }
  }
  if (lVar5 != 0) {
    uVar3 = func_0x00757554();
    if ((uint)uVar4 != 0) {
      uVar3 = (uint)uVar4;
    }
    uVar4 = (ulong)uVar3;
  }
LAB_00756450:
  *unaff_x22 = *unaff_x22 + in_x4;
  func_0x00740678(&uStack0000000000000010);
  return uVar4;
}

