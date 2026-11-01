
ulong FUN_00421494(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  ulong uVar2;
  uint *puVar3;
  
  iVar1 = _setsockopt(param_1,0,10,param_4,4);
  if (iVar1 == -1) {
    puVar3 = (uint *)___error();
    uVar2 = (ulong)*puVar3 << 0x20 | 2;
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}

