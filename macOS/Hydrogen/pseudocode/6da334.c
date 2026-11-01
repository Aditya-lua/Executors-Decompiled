
undefined1  [16] FUN_006da334(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  undefined1 auVar5 [16];
  
  lVar1 = func_0x006da0e0();
  lVar2 = func_0x006da0e0();
  uVar3 = lVar2 + lVar1 & 0x8080808080808080;
  uVar3 = (uVar3 - (uVar3 >> 7) | lVar2 + lVar1 & 0x7f7f7f7f7f7f7f7fU) + 1;
  uVar4 = uVar3 & 0x8080808080808080;
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar4 - (uVar4 >> 7) | uVar3 & 0x7f7f7f7f7f7f7f7f;
  return auVar5;
}

