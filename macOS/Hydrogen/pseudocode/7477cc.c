
undefined8 FUN_007477cc(undefined8 param_1)

{
  byte bVar1;
  undefined8 uVar2;
  undefined8 in_x9;
  int in_w10;
  long unaff_x19;
  uint unaff_w20;
  long unaff_x21;
  long lVar3;
  undefined8 uStack0000000000000000;
  
  uStack0000000000000000 = param_1;
  if (in_w10 == 0x2a) {
    uStack0000000000000000 = in_x9;
  }
  *(uint *)(unaff_x21 + 0x4ec) = (uint)(in_w10 == 0x2a);
  uVar2 = func_0x0076e34c();
  if ((int)uVar2 != 0) {
    return uVar2;
  }
  lVar3 = *(long *)(unaff_x19 + 0x18);
  if ((((unaff_x19 != 0) && (bVar1 = *(byte *)(lVar3 + 0x4f6), bVar1 != unaff_w20)) &&
      (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
    uStack0000000000000000 = *(undefined8 *)(&UNK_00a1e570 + (ulong)bVar1 * 8);
    func_0x0073cfbc();
  }
  *(char *)(lVar3 + 0x4f6) = (char)unaff_w20;
  return 0;
}

