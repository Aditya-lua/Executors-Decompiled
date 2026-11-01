
undefined4 FUN_006e3d34(long param_1)

{
  long lVar1;
  ulong uVar2;
  int unaff_w21;
  undefined4 uStack000000000000000c;
  
  if ((*(byte *)(param_1 + 1) >> 2 & 1) != 0) {
    func_0x006f0ed4(param_1,param_1,param_1 + 0x68);
  }
  if (unaff_w21 < 1) {
    if (unaff_w21 < -9999) {
      uVar2 = func_0x006e60a0(param_1);
    }
    else {
      uVar2 = *(long *)(param_1 + 8) + (long)unaff_w21 * 0x10;
    }
  }
  else {
    uVar2 = *(long *)(param_1 + 0x10) + (ulong)(unaff_w21 - 1) * 0x10;
    if (*(ulong *)(param_1 + 8) <= uVar2) {
      lVar1 = __dyld_get_image_header(0);
      uVar2 = lVar1 + 0x4e8dd08;
    }
  }
  _strlen();
  func_0x006f6ef8(param_1);
  uStack000000000000000c = 5;
  func_0x007023c0(param_1,uVar2);
  lVar1 = *(long *)(param_1 + 8);
  *(long *)(param_1 + 8) = lVar1 + 0x10;
  return *(undefined4 *)(lVar1 + 0xc);
}

