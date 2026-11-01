
bool FUN_005d764c(void)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  long unaff_x21;
  long unaff_x22;
  undefined8 uStack0000000000000008;
  
  uVar3 = func_0x005ab01c();
  if ((uVar3 & 1) == 0) {
    lVar4 = unaff_x22 * 0x40;
    do {
      unaff_x21 = unaff_x21 + 0x40;
      lVar4 = lVar4 + -0x40;
      bVar1 = lVar4 != 0;
      if (lVar4 == 0) {
        return false;
      }
      uVar3 = (**(code **)(uStack0000000000000008[1] + 0x18))
                        (*uStack0000000000000008,&UNK_008aec76,2);
      if ((uVar3 & 1) != 0) {
        return bVar1;
      }
      iVar2 = func_0x005ab01c(&uStack0000000000000008,unaff_x21);
    } while (iVar2 == 0);
  }
  else {
    bVar1 = true;
  }
  return bVar1;
}

