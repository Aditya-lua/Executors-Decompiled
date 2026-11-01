
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0022eb64(undefined8 param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *unaff_x21;
  long in_stack_00000000;
  
  uVar2 = _UNK_0081e840;
  uVar1 = in_stack_00000000 + 0x7fffffffffffffff;
  if (4 < uVar1) {
    uVar1 = 1;
  }
  unaff_x21[1] = _UNK_0081e848;
  *unaff_x21 = uVar2;
  unaff_x21[2] = param_1;
  unaff_x21[3] = 1;
  *(char *)(unaff_x21 + 4) = (char)(0x300020201 >> ((uVar1 & 7) << 3));
  func_0x0022200c();
  func_0x00221b48();
  func_0x00187bd4();
  return;
}

