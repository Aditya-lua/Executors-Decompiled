
void FUN_0065e3a0(void)

{
  undefined1 uVar1;
  int iVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x22;
  undefined8 unaff_x23;
  
  iVar2 = _strcmp();
  if (iVar2 == 0) {
    func_0x0003eef0();
    *unaff_x20 = unaff_x23;
    uVar1 = 1;
  }
  else {
    if (unaff_x22 == (long *)0x0) {
      return;
    }
    uVar1 = (**(code **)(*unaff_x22 + 0x10))();
  }
  *(undefined1 *)(unaff_x19 + 0x20) = uVar1;
  return;
}

