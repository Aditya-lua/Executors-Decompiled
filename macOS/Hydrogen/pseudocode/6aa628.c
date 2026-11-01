
void FUN_006aa628(void)

{
  undefined1 uVar1;
  int iVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  
  iVar2 = _strncmp();
  if ((iVar2 == 0) && (iVar2 = _strcmp(unaff_x24 + 0xc,&UNK_008c5665), iVar2 == 0)) {
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

