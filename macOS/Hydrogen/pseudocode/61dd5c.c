
void FUN_0061dd5c(void)

{
  int iVar1;
  long lVar2;
  long *unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  
  if ((int)unaff_x22 == 0) {
    lVar2 = 0;
  }
  else {
    lVar2 = func_0x006115d0();
  }
  unaff_x19[0xf] = unaff_x22;
  unaff_x19[0x10] = lVar2;
  unaff_x19[0xe] = -1;
  iVar1 = (**(code **)(*unaff_x19 + 0x40))();
  if (iVar1 < 4) {
    func_0x005eede0();
    (**(code **)(*unaff_x21 + 0x50))();
  }
  return;
}

