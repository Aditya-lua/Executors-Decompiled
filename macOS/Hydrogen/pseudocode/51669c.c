
long FUN_0051669c(code *param_1)

{
  undefined1 auVar1 [16];
  long in_x9;
  ulong in_x10;
  long lVar2;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined1 auVar3 [16];
  
  auVar1._8_8_ = unaff_x20;
  auVar1._0_8_ = unaff_x21;
  lVar2 = in_x9 + (in_x10 & 0xfffffffffffffff0) + 0x10;
  auVar3 = (*param_1)(lVar2);
  if (auVar3 != auVar1) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    lVar2 = 0;
  }
  return lVar2;
}

