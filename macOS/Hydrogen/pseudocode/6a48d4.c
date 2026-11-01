
ulong FUN_006a48d4(long param_1,long param_2)

{
  long lVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  
  lVar1 = param_2 + param_1 + 0x18;
  uVar4 = func_0x00604ce4();
  iVar3 = func_0x00609ec8(lVar1,uVar4);
  if (iVar3 < 1) {
    return 0;
  }
  uVar5 = func_0x005ffe3c(lVar1,0);
  if ((int)uVar5 != 0) {
    lVar2 = param_2 + param_1 + 0x48;
    uVar4 = func_0x00604ce4();
    iVar3 = func_0x00609ec8(lVar2,uVar4);
    if (iVar3 < 1) {
      return 0;
    }
    uVar5 = func_0x005ffe3c(lVar2,0);
    if ((int)uVar5 != 0) {
      uVar5 = func_0x00609ec8(lVar2,lVar1);
      uVar5 = uVar5 >> 0x1f & 1;
    }
  }
  return uVar5;
}

