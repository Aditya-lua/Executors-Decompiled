
void FUN_00433c04(undefined8 param_1)

{
  int iVar1;
  uint *puVar2;
  undefined4 *unaff_x19;
  undefined4 unaff_w20;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = param_1;
  iVar1 = _bind();
  if (iVar1 == -1) {
    puVar2 = (uint *)___error();
    *(ulong *)(unaff_x19 + 2) = (ulong)*puVar2 << 0x20 | 2;
    *unaff_x19 = 1;
    _close();
  }
  else {
    *unaff_x19 = 0;
    unaff_x19[1] = unaff_w20;
  }
  return;
}

