
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0020b728(ulong param_1)

{
  undefined8 uVar1;
  ulong in_x9;
  undefined8 in_x10;
  long *unaff_x20;
  undefined8 *unaff_x21;
  
  unaff_x21[2] = in_x9 & 0xff | param_1 << 8 | param_1;
  unaff_x21[3] = &UNK_00829e98;
  unaff_x21[4] = in_x10;
  uVar1 = _UNK_00827990;
  unaff_x21[1] = _UNK_00827998;
  *unaff_x21 = uVar1;
  if ((*unaff_x20 != -0x8000000000000000) && (*unaff_x20 != 0)) {
    func_0x00187bd4();
  }
  return;
}

