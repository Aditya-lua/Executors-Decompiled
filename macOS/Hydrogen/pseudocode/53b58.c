
byte FUN_00053b58(undefined8 param_1)

{
  int iVar1;
  ulong uVar2;
  byte *unaff_x19;
  byte bVar3;
  
  uVar2 = func_0x00053bb8(param_1,3);
  if ((uVar2 & 1) == 0) {
    iVar1 = func_0x00053bb8();
    bVar3 = 0xc;
    if (iVar1 == 0) {
      bVar3 = 1;
    }
  }
  else {
    bVar3 = 9;
  }
  *unaff_x19 = *unaff_x19 & 0xf0 | bVar3;
  return bVar3;
}

