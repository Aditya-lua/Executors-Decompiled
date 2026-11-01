
void FUN_0052de8c(code *param_1)

{
  undefined1 auVar1 [16];
  byte bVar2;
  undefined8 uVar3;
  undefined1 uVar4;
  long in_x9;
  undefined1 *unaff_x19;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined1 auVar5 [16];
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  
  auVar1._8_8_ = unaff_x22;
  auVar1._0_8_ = unaff_x23;
  auVar5 = (*param_1)(in_x9 + 0x10);
  if (auVar5 == auVar1) {
    func_0x00525f7c(&uStack0000000000000018,8,0);
    uVar3 = func_0x0051ca70();
    *(undefined8 *)(unaff_x19 + 8) = uVar3;
    uVar4 = 1;
  }
  else {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    if (in_stack_00000028 == 0) {
      bVar2 = 0;
    }
    else {
      bVar2 = func_0x00515484(in_stack_00000020);
      bVar2 = bVar2 == 2 | bVar2;
    }
    uVar4 = 0;
    unaff_x19[1] = bVar2 & 1;
  }
  *unaff_x19 = uVar4;
  return;
}

