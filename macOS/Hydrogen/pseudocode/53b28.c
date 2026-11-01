
byte FUN_00053b28(long param_1)

{
  bool in_ZR;
  int iVar1;
  ulong uVar2;
  ulong in_x9;
  ulong in_x10;
  byte *unaff_x19;
  byte bVar3;
  
  if ((in_ZR && in_x10 == (in_x9 & 0xffffffff | 0x6469746500000000)) &&
      param_1 == 0x2f2f3a6469746573) {
    bVar3 = 6;
  }
  else {
    uVar2 = func_0x00053bb8();
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
  }
  *unaff_x19 = *unaff_x19 & 0xf0 | bVar3;
  return bVar3;
}

