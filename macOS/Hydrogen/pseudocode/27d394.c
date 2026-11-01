
undefined1  [16] FUN_0027d394(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  
  auVar6 = __Unwind_Resume();
  lVar3 = auVar6._0_8_;
  lVar2 = func_0x002f7798();
  lVar4 = lVar3;
  if (lVar2 != 0) {
    if ((auVar6._8_8_ & 1) == 0) {
      lVar4 = func_0x0029bbb8();
      if (lVar4 != 0) {
        iVar1 = func_0x0029c160(lVar4,&UNK_00010001);
        if (iVar1 == 1) {
          lVar3 = func_0x002fc6a8(lVar2,lVar3,lVar4,0);
          func_0x0029bc0c(lVar4);
          iVar1 = (int)lVar3;
          goto joined_r0x0027d420;
        }
        func_0x0029bc0c(lVar4);
      }
    }
    else {
      iVar1 = func_0x002fd4fc(lVar2,lVar3,0);
joined_r0x0027d420:
      if ((iVar1 == 1) && (lVar4 = func_0x002d8dc0(), lVar4 != 0)) {
        iVar1 = func_0x002d94ec(lVar4,lVar2);
        if (iVar1 == 1) {
          uVar5 = 0;
          goto code_r0x0027d468;
        }
        func_0x002d8de8(lVar4);
        lVar3 = lVar4;
      }
    }
    func_0x002f7efc(lVar2);
    lVar4 = lVar3;
  }
  uVar5 = 1;
code_r0x0027d468:
  auVar6._8_8_ = lVar4;
  auVar6._0_8_ = uVar5;
  return auVar6;
}

