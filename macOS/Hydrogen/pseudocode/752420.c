
/* WARNING: Removing unreachable block (ram,0x00752758) */
/* WARNING: Removing unreachable block (ram,0x00752764) */

undefined8 FUN_00752420(undefined8 param_1)

{
  byte bVar1;
  undefined8 uVar2;
  int iVar3;
  uint uVar4;
  undefined8 uVar5;
  long lVar6;
  long unaff_x19;
  int unaff_w21;
  undefined8 *unaff_x23;
  int unaff_w24;
  undefined8 *unaff_x26;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  uVar5 = func_0x0078a0e4(param_1,0);
  if ((int)uVar5 != 0) {
    func_0x0077ea64();
    func_0x0073c9e4();
    goto LAB_00752460;
  }
  iVar3 = func_0x00789530(*unaff_x26,0,&uStack0000000000000028,0);
  if (iVar3 != 0) {
    uVar5 = func_0x00785304();
    return uVar5;
  }
  if ((unaff_w21 != 1) && (((uint)*unaff_x23 >> 0x1a & 1) == 0)) {
    uVar4 = (uint)*(ushort *)(unaff_x19 + 0xa0c);
    if ((*(ushort *)(unaff_x19 + 0xa0c) == 0) || (((byte)(&UNK_00001344)[unaff_x19] >> 6 & 1) == 0))
    {
      uVar5 = func_0x00789530(*unaff_x26,6,&uStack0000000000000020,1);
      uVar2 = uStack0000000000000020;
      if ((int)uVar5 == 0) {
        uVar4 = _atoi(uStack0000000000000020);
        (*pcRam0000000000a2b5f0)(uVar2);
        goto LAB_00752510;
      }
LAB_00752534:
      (*pcRam0000000000a2b5f0)(uStack0000000000000028);
LAB_00752460:
      uVar5 = func_0x00785304(uVar5);
      return uVar5;
    }
LAB_00752510:
    if (uVar4 == *(uint *)(&UNK_00001418 + unaff_x19)) {
      uVar5 = func_0x00789530(*unaff_x26,1,&uStack0000000000000018,0);
      if ((int)uVar5 != 0) goto LAB_00752534;
      lVar6 = func_0x007850e8(uStack0000000000000018);
      if ((lVar6 == 0) || (*(int *)(lVar6 + 0x94) == *(int *)(&UNK_00001428 + unaff_x19))) {
        (*pcRam0000000000a2b5f0)(uStack0000000000000018);
        goto LAB_00752754;
      }
      if ((*(char *)((long)unaff_x23 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      (*pcRam0000000000a2b5f0)(uStack0000000000000018);
    }
    else if ((*(char *)((long)unaff_x23 + 3) < '\0') &&
            ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
    (*pcRam0000000000a2b5f0)(*(undefined8 *)((long)&linkedit_data_command_00001318.cmd + unaff_x19))
    ;
    *(undefined8 *)((long)&linkedit_data_command_00001318.cmd + unaff_x19) = 0;
    (*pcRam0000000000a2b5f0)
              (*(undefined8 *)((long)&linkedit_data_command_00001318.dataoff + unaff_x19));
    *(undefined8 *)((long)&linkedit_data_command_00001318.dataoff + unaff_x19) = 0;
  }
LAB_00752754:
  uVar4 = *(uint *)(&UNK_00001344 + unaff_x19);
  if (unaff_w24 != 0) {
    uVar4 = uVar4 & 0xffffffbf;
    *(uint *)(&UNK_00001344 + unaff_x19) = uVar4;
  }
  if ((uVar4 >> 0x10 & 1) != 0) {
    (*pcRam0000000000a2b5f0)
              (*(undefined8 *)
                ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                unaff_x19 + 0x28));
    uVar4 = *(uint *)(&UNK_00001344 + unaff_x19);
  }
  *(undefined8 *)
   ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" + unaff_x19 + 0x28) =
       uStack0000000000000028;
  *(uint *)(&UNK_00001344 + unaff_x19) = uVar4 | 0x10000;
  func_0x007710b8(unaff_x19 + 0xe8);
  if ((*(char *)((long)unaff_x23 + 3) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  iVar3 = *(int *)(&UNK_00001350 + unaff_x19);
  if (iVar3 == 0x12f) {
    if (*(byte *)(unaff_x23 + 0x125) - 1 < 3) {
      if ((*(byte *)(unaff_x19 + 0xa15) >> 2 & 1) != 0) goto LAB_00752904;
    }
    else if (*(byte *)(unaff_x23 + 0x125) == 0) goto LAB_00752904;
    *(undefined1 *)(unaff_x23 + 0x125) = 0;
    if ((*(char *)((long)unaff_x23 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
  }
  else {
    if (iVar3 == 0x12e) {
      if (2 < *(byte *)(unaff_x23 + 0x125) - 1) goto LAB_00752904;
      bVar1 = *(byte *)(unaff_x19 + 0xa15) >> 1;
    }
    else {
      if ((iVar3 != 0x12d) || (2 < *(byte *)(unaff_x23 + 0x125) - 1)) goto LAB_00752904;
      bVar1 = *(byte *)(unaff_x19 + 0xa15);
    }
    if ((bVar1 & 1) == 0) {
      if ((*(char *)((long)unaff_x23 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      *(undefined1 *)(unaff_x23 + 0x125) = 0;
      func_0x00773f38();
    }
  }
LAB_00752904:
  func_0x007706e4();
  func_0x0077053c();
  return 0;
}

