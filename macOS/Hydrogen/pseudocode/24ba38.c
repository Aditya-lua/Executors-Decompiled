
ulong FUN_0024ba38(ulong param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  undefined1 in_CY;
  ulong uVar1;
  ulong in_x9;
  long *in_x10;
  long in_x12;
  undefined1 auVar2 [16];
  
  while (!(bool)in_CY) {
    in_x12 = *in_x10 + in_x12;
    in_CY = 0xfffffffffffffffe < in_x9;
    in_x9 = in_x9 + 1;
    in_x10 = in_x10 + 3;
  }
  if (param_1 < (ulong)(in_x12 - *(long *)(param_2 + 0x80))) {
    func_0x00418c40(0x28,&UNK_0082a014,0x1e);
    uVar1 = 1;
  }
  else if ((*(byte *)(param_2 + 0x337) & 1) == 0) {
    auVar2 = func_0x002404e8(param_2 + 0x400,param_3,param_4,*(long *)(param_2 + 0x378) != 0);
    uVar1 = auVar2._0_8_;
    if (((uVar1 & 1) == 0) && (auVar2._8_8_ == 0)) {
      *(undefined1 *)(param_2 + 0x338) = 1;
    }
  }
  else {
    uVar1 = 0;
  }
  return uVar1;
}

