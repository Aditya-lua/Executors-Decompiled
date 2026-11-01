
void FUN_00211408(undefined8 param_1,long param_2)

{
  bool in_ZR;
  long lVar1;
  long unaff_x19;
  long lVar2;
  
  if ((!in_ZR) && (param_2 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x60),param_2,1);
  }
  func_0x0020848c();
  func_0x00209ea8(unaff_x19 + 0x80);
  if (*(long *)(unaff_x19 + 0x38) != -0x8000000000000000) {
    lVar2 = *(long *)(unaff_x19 + 0x48) + 1;
    lVar1 = *(long *)(unaff_x19 + 0x40);
    while (lVar2 = lVar2 + -1, lVar2 != 0) {
      func_0x0016af10(lVar1);
      lVar1 = lVar1 + 0x70;
    }
    if (*(long *)(unaff_x19 + 0x38) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x40),*(long *)(unaff_x19 + 0x38) * 0x70,8);
    }
  }
  func_0x00187bd4();
  return;
}

