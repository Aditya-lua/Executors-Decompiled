
undefined8 FUN_0073eb00(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long unaff_x29;
  long lStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  lStack0000000000000000 = unaff_x29 + 0x10;
  lVar1 = func_0x0076464c(param_1,unaff_x29 + 0x10);
  if (lVar1 == 0) {
    uVar3 = 0x1b;
  }
  else {
    uStack0000000000000008 = 0;
    lVar2 = _strlen();
    uVar3 = func_0x007841a0(param_2,lVar1,lVar2,0,&uStack0000000000000008);
    if ((int)uVar3 == 0) {
      lVar4 = lVar1;
      do {
        func_0x0073c8fc(param_2,4,lVar4,uStack0000000000000008);
        lVar2 = lVar2 - uStack0000000000000008;
        if (lVar2 == 0) {
          uVar3 = 0;
          break;
        }
        lVar4 = lVar4 + uStack0000000000000008;
        uVar3 = func_0x007841a0(param_2,lVar4,lVar2,0,&uStack0000000000000008);
      } while ((int)uVar3 == 0);
    }
    (*pcRam0000000000a2b5f0)(lVar1);
  }
  return uVar3;
}

