
undefined8 FUN_0051ae0c(void)

{
  long lVar1;
  undefined1 uVar2;
  undefined8 uVar3;
  uint in_w8;
  long unaff_x19;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined1 in_stack_00000038;
  undefined1 uStack0000000000000039;
  
  lVar1 = 0xdb;
  if ((in_w8 & 0x1e) == 0xc) {
    lVar1 = 0xdc;
  }
  uVar2 = *(undefined1 *)(unaff_x19 + lVar1);
  if (in_stack_00000008 == -0x8000000000000000) {
    func_0x0045cd08(&uStack0000000000000020,in_stack_00000010);
    in_stack_00000008 = uStack0000000000000020;
    in_stack_00000010 = in_stack_00000028;
  }
  else {
    in_stack_00000030 = in_stack_00000018;
  }
  uStack0000000000000020 = in_stack_00000008;
  in_stack_00000028 = in_stack_00000010;
  in_stack_00000038 = (in_w8 & 0xfffffffd) != 0xc;
  uStack0000000000000039 = uVar2;
  uVar3 = func_0x0051e748(&uStack0000000000000020);
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008,1);
  }
  return uVar3;
}

