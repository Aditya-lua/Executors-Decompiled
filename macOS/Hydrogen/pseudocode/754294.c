
/* WARNING: Removing unreachable block (ram,0x007543d8) */

undefined8 FUN_00754294(void)

{
  uint *puVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  uint uVar5;
  uint uVar6;
  long unaff_x19;
  uint unaff_w20;
  undefined8 *unaff_x21;
  int unaff_w22;
  
  func_0x007600a8();
  uVar3 = func_0x007616ac();
  if ((int)uVar3 == 0) {
    uVar3 = func_0x00774c24();
    *(undefined8 *)
     ("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" + unaff_x19 + 0x30
     ) = uVar3;
    puVar1 = (uint *)(unaff_x19 + 0x1c1);
    if (((unaff_w22 == 4) || (unaff_w22 == 1)) &&
       (lVar4 = *(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19), lVar4 != 0))
    {
      if (lVar4 < 0) {
        *(undefined8 *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19) = 0;
      }
      else if (((*(byte *)(unaff_x19 + 0x1c3) >> 2 & 1) == 0) &&
              (uVar3 = func_0x00774c70(), (int)uVar3 != 0)) {
        func_0x0073c9e4();
        return uVar3;
      }
    }
    lVar4 = func_0x00782efc();
    if (lVar4 == 0) {
      lVar4 = func_0x00774c24();
      if (lVar4 < 0) {
        if ((int)unaff_w20 < 0xb) {
          func_0x0073c9e4();
          uVar3 = 0x19;
        }
        else {
          *puVar1 = *puVar1 & 0xffff0000 | *puVar1 & 0x7fff | (uint)(unaff_w20 < 0x14) << 0xf;
          uVar3 = 0;
          if (unaff_w20 < 0x14 != 0) {
            uVar3 = 0;
            *unaff_x21 = "Transfer-Encoding: chunked\r\n";
          }
        }
      }
      else {
        *puVar1 = *puVar1 & 0xffff7fff;
        uVar3 = 0;
      }
    }
    else {
      iVar2 = func_0x007537a0(lVar4,"Transfer-Encoding:",0x12,"chunked",7);
      uVar3 = 0;
      uVar6 = 0x8000;
      if (iVar2 == 0) {
        uVar6 = 0;
      }
      uVar5 = *puVar1 & 0xffff7fff;
      *puVar1 = uVar5 | uVar6;
      if ((0x13 < (int)unaff_w20) && (iVar2 != 0)) {
        if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
          uVar5 = *puVar1 & 0xffff7fff;
        }
        uVar3 = 0;
        *puVar1 = uVar5;
      }
    }
  }
  return uVar3;
}

