
/* WARNING: Removing unreachable block (ram,0x0065a370) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0065a200(void)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  long *unaff_x23;
  long unaff_x24;
  
  iVar3 = _strncmp();
  if ((iVar3 == 0) && (iVar3 = _strcmp(unaff_x24 + 0xc,&UNK_008bd96a), iVar3 == 0)) {
    func_0x0003eef0();
    *unaff_x20 = unaff_x21;
    uVar2 = 1;
  }
  else {
    if (unaff_x23 != (long *)0x0) {
      bVar1 = (**(code **)(*unaff_x23 + 0x10))();
      *(byte *)(unaff_x19 + 0x20) = bVar1;
      if ((bVar1 & 1) != 0) {
        return;
      }
    }
    if (_UNK_00a0fc80 == &UNK_008bd96a) {
      return;
    }
    uVar2 = func_0x0067ecf4();
  }
  *(undefined1 *)(unaff_x19 + 0x20) = uVar2;
  return;
}

