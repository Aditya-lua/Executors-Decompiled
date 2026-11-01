
void FUN_0061b128(long param_1)

{
  int iVar1;
  long lVar2;
  long in_x9;
  long *unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  
  while (param_1 = param_1 + -1, param_1 != 0) {
    *(undefined1 *)(in_x9 + param_1) = 0;
  }
  func_0x00611644();
  if ((int)unaff_x22 == 0) {
    lVar2 = 0;
  }
  else {
    lVar2 = func_0x006115d0();
  }
  unaff_x19[5] = unaff_x22;
  unaff_x19[6] = lVar2;
  unaff_x19[4] = -1;
  iVar1 = (**(code **)(*unaff_x19 + 0x40))();
  if (iVar1 < 4) {
    func_0x005eede0();
    (**(code **)(*unaff_x21 + 0x50))();
  }
  return;
}

