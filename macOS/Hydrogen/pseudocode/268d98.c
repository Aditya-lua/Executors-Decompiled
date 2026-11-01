
bool FUN_00268d98(undefined8 param_1,undefined8 param_2,char param_3)

{
  byte bVar1;
  byte bVar2;
  int in_w8;
  int iVar3;
  byte in_w9;
  byte in_w10;
  uint in_w11;
  ulong uVar4;
  long lVar5;
  long in_x12;
  byte *pbVar6;
  byte *in_x13;
  uint in_w14;
  ulong in_x15;
  
  while( true ) {
    if (9 < in_w14) {
      if ((in_w11 & 0xffffffdf) - 0x41 < 0x1a) goto code_r0x00268e14;
      return false;
    }
    uVar4 = in_x15 + 1;
    if (0x3f < uVar4) {
      return false;
    }
    in_w10 = in_x15 == 0 | in_w10;
    if (in_x12 == 0) break;
    bVar2 = 0;
    lVar5 = in_x12;
    pbVar6 = in_x13;
    while( true ) {
      while( true ) {
        while( true ) {
          in_x12 = lVar5 + -1;
          if (lVar5 == 0) {
            return false;
          }
          in_x13 = pbVar6 + 1;
          bVar1 = *pbVar6;
          in_w11 = (uint)bVar1;
          lVar5 = in_x12;
          pbVar6 = in_x13;
          if (bVar1 != 0x2d) break;
          if (uVar4 == 0) {
            return false;
          }
          in_w10 = 0;
          uVar4 = uVar4 + 1;
          if ((0x3f < uVar4) || (in_x12 == 0)) {
            return false;
          }
          bVar2 = 1;
        }
        if (bVar1 != 0x2e) break;
        if ((bool)(uVar4 == 0 | bVar2)) {
          return false;
        }
        in_w8 = in_w8 + 1;
        if (in_x12 == 0) goto LAB_00268e5c;
        bVar2 = 0;
        uVar4 = 0;
      }
      in_x15 = uVar4;
      if (bVar1 != 0x5f) break;
code_r0x00268e14:
      uVar4 = in_x15 + 1;
      if (0x3f < uVar4) {
        return false;
      }
      if (in_x12 == 0) {
        if (uVar4 == 0) {
          in_w10 = 0;
          goto LAB_00268e5c;
        }
        if ((in_w9 & 1) != 0) {
          return true;
        }
        iVar3 = in_w8 + 1;
        goto LAB_00268e80;
      }
      bVar2 = 0;
      in_w10 = 0;
      lVar5 = in_x12;
      pbVar6 = in_x13;
    }
    in_w14 = bVar1 - 0x30;
  }
  if (uVar4 == 0) {
LAB_00268e5c:
    if (param_3 != '\0') {
      return false;
    }
    iVar3 = 0;
  }
  else {
    iVar3 = 1;
  }
  if (((in_w9 | in_w10) & 1) != 0) {
    return (bool)((in_w10 ^ 1) & 1);
  }
  iVar3 = in_w8 + iVar3;
LAB_00268e80:
  return 2 < iVar3;
}

