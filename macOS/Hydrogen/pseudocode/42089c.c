
ulong FUN_0042089c(long param_1)

{
  int iVar1;
  ulong uVar2;
  uint *puVar3;
  undefined1 auVar4 [12];
  uint uStack_18;
  undefined4 uStack_14;
  
  iVar1 = 0x9d9300;
  auVar4 = func_0x007a23d8(param_1 + 0xf5,0x19);
  uStack_14 = auVar4._8_4_;
  if (iVar1 == 1000000000) {
    uStack_14 = 0;
  }
  uStack_18 = (uint)(iVar1 != 1000000000);
  iVar1 = _setsockopt(*auVar4._0_8_,0xffff,"k/Versions/A/LDAP",&uStack_18,8);
  if (iVar1 == -1) {
    puVar3 = (uint *)___error();
    uVar2 = (ulong)*puVar3 << 0x20 | 2;
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}

