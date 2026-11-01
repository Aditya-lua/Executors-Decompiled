
undefined1  [16] FUN_0027d3f8(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined1 auVar5 [16];
  
  lVar2 = func_0x002fc6a8();
  func_0x0029bc0c();
  if (((int)lVar2 == 1) && (lVar3 = func_0x002d8dc0(), lVar3 != 0)) {
    iVar1 = func_0x002d94ec();
    lVar2 = lVar3;
    if (iVar1 == 1) {
      uVar4 = 0;
      goto LAB_0027d468;
    }
    func_0x002d8de8(lVar3);
  }
  func_0x002f7efc();
  uVar4 = 1;
LAB_0027d468:
  auVar5._8_8_ = lVar2;
  auVar5._0_8_ = uVar4;
  return auVar5;
}

