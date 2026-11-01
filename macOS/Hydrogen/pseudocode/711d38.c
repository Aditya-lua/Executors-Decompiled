
void FUN_00711d38(undefined8 param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long unaff_x19;
  
  if (*(int *)(*(long *)(unaff_x19 + 0x150) + -4) == 0) {
    uVar1 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x20);
    func_0x0070700c(uVar1,param_2);
    puVar2 = (undefined8 *)func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),8);
    *puVar2 = uVar1;
    func_0x00716770();
    return;
  }
  uVar1 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x20);
  func_0x0070700c(uVar1,param_2);
  return;
}

