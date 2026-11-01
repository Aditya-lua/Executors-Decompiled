
bool FUN_005d7680(void)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  long unaff_x20;
  long unaff_x22;
  undefined8 uStack0000000000000008;
  
  lVar3 = unaff_x22 * 0x40;
  while( true ) {
    lVar3 = lVar3 + -0x40;
    if (lVar3 == 0) {
      return false;
    }
    uVar2 = (**(code **)(uStack0000000000000008[1] + 0x18))(*uStack0000000000000008,&UNK_008aec76,2)
    ;
    if ((uVar2 & 1) != 0) break;
    iVar1 = func_0x005ab01c(&uStack0000000000000008,unaff_x20);
    unaff_x20 = unaff_x20 + 0x40;
    if (iVar1 != 0) {
      return lVar3 != 0;
    }
  }
  return lVar3 != 0;
}

