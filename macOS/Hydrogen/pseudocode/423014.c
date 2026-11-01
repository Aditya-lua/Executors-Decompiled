
ulong FUN_00423014(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  bool in_ZR;
  int iVar1;
  ulong uVar2;
  uint *puVar3;
  undefined8 uStack_20;
  uint uStack_18;
  
  uStack_18 = (uint)((ulong)param_1 >> 0x26);
  if (in_ZR) {
    uStack_18 = 1;
  }
  uStack_20 = param_3;
  iVar1 = _setsockopt(param_2,0xffff,"works/CoreFoundation.framework/Versions/A/CoreFoundation",
                      &uStack_20,0x10);
  if (iVar1 == -1) {
    puVar3 = (uint *)___error();
    uVar2 = (ulong)*puVar3 << 0x20 | 2;
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}

