
void FUN_00420944(undefined4 param_1)

{
  uint *puVar1;
  int iVar2;
  ulong uVar3;
  ulong *unaff_x19;
  int unaff_w20;
  int iStack0000000000000000;
  int iStack0000000000000004;
  
  iVar2 = _getsockopt(param_1,0xffff,"k/Versions/A/LDAP");
  if (iVar2 == -1) {
    puVar1 = (uint *)___error();
    uVar3 = (ulong)*puVar1 << 0x20 | 2;
    unaff_w20 = unaff_w20 + 1;
  }
  else {
    uVar3 = (ulong)iStack0000000000000004;
    if (iStack0000000000000000 != 0) {
      unaff_w20 = 0;
    }
  }
  *unaff_x19 = uVar3;
  *(int *)(unaff_x19 + 1) = unaff_w20;
  return;
}

