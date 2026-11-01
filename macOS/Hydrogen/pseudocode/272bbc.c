
void FUN_00272bbc(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  long unaff_x19;
  long *unaff_x20;
  undefined1 *unaff_x21;
  undefined1 auVar3 [16];
  undefined1 auStack_30 [16];
  
  if (param_1 == 0) {
    auVar3 = func_0x007a1f00();
    lVar2 = auVar3._0_8_;
    func_0x00469240(auStack_30,auVar3._8_8_,&UNK_0082cf7b,0x18);
    uVar1 = func_0x004653b0(auStack_30,&UNK_0082cf93,9,lVar2,&UNK_009cc698);
    uVar1 = func_0x004653b0(uVar1,&UNK_0082d080,4,lVar2 + 500,&UNK_009cc6b8);
    func_0x004653b0(uVar1,&UNK_0082cf9c,7,lVar2 + 500,&UNK_009cc6d8);
    func_0x00465564();
    return;
  }
  _memcpy();
  lVar2 = unaff_x19;
  do {
    *unaff_x21 = 0;
    lVar2 = lVar2 + -1;
    unaff_x21 = unaff_x21 + 1;
  } while (lVar2 != 0);
  *unaff_x20 = unaff_x19;
  unaff_x20[1] = param_1;
  unaff_x20[2] = unaff_x19;
  return;
}

