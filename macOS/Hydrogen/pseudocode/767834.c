
undefined8 FUN_00767834(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  undefined8 uStack0000000000000008;
  
  plVar3 = *(long **)(param_1 + 0x1b0);
  uVar1 = func_0x007841a0(param_1,&UNK_008cd8c0,2,0,&uStack0000000000000008);
  if ((int)uVar1 == 0) {
    func_0x0073c8fc(param_1,2,&UNK_008cd8c0,uStack0000000000000008);
    if (uStack0000000000000008 == 2) {
      uVar1 = 0;
      *plVar3 = 0;
      plVar3[1] = 0;
    }
    else {
      lVar4 = 2 - uStack0000000000000008;
      lVar2 = func_0x0077e8e4(&UNK_008cd8c0 + uStack0000000000000008,lVar4);
      if (lVar2 == 0) {
        uVar1 = 0x1b;
      }
      else {
        uVar1 = 0;
        *plVar3 = lVar2;
        plVar3[1] = lVar4;
      }
    }
  }
  (*pcRam0000000000a2b5f0)(*plVar3);
  *plVar3 = 0;
  func_0x00740678(plVar3 + 5);
  return uVar1;
}

