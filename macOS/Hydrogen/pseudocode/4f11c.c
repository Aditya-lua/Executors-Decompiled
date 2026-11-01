
long FUN_0004f11c(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  long unaff_x19;
  uint unaff_w20;
  
  lVar2 = _fopen(param_2,param_1);
  *(long *)(unaff_x19 + 0x78) = lVar2;
  if (lVar2 == 0) {
    return 0;
  }
  *(uint *)(unaff_x19 + 0x188) = unaff_w20;
  if (((unaff_w20 >> 1 & 1) == 0) || (iVar1 = _fseek(lVar2,0,2), iVar1 == 0)) {
    return unaff_x19;
  }
  _fclose(*(undefined8 *)(unaff_x19 + 0x78));
  *(undefined8 *)(unaff_x19 + 0x78) = 0;
  return 0;
}

