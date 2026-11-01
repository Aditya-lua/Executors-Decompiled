
undefined8 FUN_00091424(int param_1)

{
  int iVar1;
  undefined8 *puVar2;
  long unaff_x19;
  undefined8 uVar3;
  
  if (param_1 == 0) {
    puVar2 = (undefined8 *)func_0x006e3790();
    *(undefined8 *)(unaff_x19 + 0x30) = *puVar2;
    return 0;
  }
  iVar1 = _strcmp();
  if (iVar1 == 0) {
    uVar3 = func_0x006e6a4c();
    *(undefined8 *)(unaff_x19 + 0x28) = uVar3;
    return 0;
  }
  iVar1 = _strcmp();
  if (iVar1 == 0) {
    iVar1 = func_0x006e6b04();
    *(bool *)(unaff_x19 + 0x40) = iVar1 != 0;
    return 0;
  }
  func_0x00091104();
  return 0;
}

