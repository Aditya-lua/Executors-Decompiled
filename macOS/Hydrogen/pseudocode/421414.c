
void FUN_00421414(undefined4 param_1)

{
  uint *puVar1;
  int iVar2;
  long unaff_x19;
  undefined1 uStack0000000000000008;
  undefined1 uStack000000000000000c;
  
  _uStack0000000000000008 = 0;
  _uStack000000000000000c = 4;
  iVar2 = _getsockopt(param_1,0,0xb,&uStack0000000000000008,&uStack000000000000000c);
  if (iVar2 == -1) {
    puVar1 = (uint *)___error();
    *(ulong *)(unaff_x19 + 8) = (ulong)*puVar1 << 0x20 | 2;
  }
  else {
    *(bool *)(unaff_x19 + 1) = _uStack0000000000000008 != 0;
  }
  *(bool *)unaff_x19 = iVar2 == -1;
  return;
}

