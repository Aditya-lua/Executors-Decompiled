
undefined8 FUN_002963cc(void)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  uVar2 = func_0x00295e78();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  lVar3 = func_0x002c3e68();
  if (lVar3 == 0) {
    return 1;
  }
  func_0x002cafe0();
  lVar3 = func_0x002cb3a0();
  if (lVar3 != 0) {
    iVar1 = func_0x0027f658();
    if ((iVar1 == 0) || (iVar1 = func_0x0027ea28(), iVar1 < 1)) {
      func_0x0036e3d8(0);
    }
    else {
      iVar1 = func_0x00296004();
      func_0x0036e3d8(0);
      if (iVar1 != 0) {
        return 1;
      }
    }
  }
  return 0;
}

