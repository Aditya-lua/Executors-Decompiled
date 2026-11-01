
ulong FUN_004212c8(undefined8 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  ulong uVar2;
  uint *puVar3;
  undefined1 auVar4 [12];
  undefined4 uStack_14;
  
  auVar4 = func_0x007a247c(param_1,0x35,param_3 + 0xc00);
  uStack_14 = auVar4._8_4_;
  iVar1 = _setsockopt(*auVar4._0_8_,0xffff,0x20,&uStack_14,4);
  if (iVar1 == -1) {
    puVar3 = (uint *)___error();
    uVar2 = (ulong)*puVar3 << 0x20 | 2;
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}

