
byte FUN_005380d8(long param_1)

{
  byte bVar1;
  bool bVar2;
  byte *in_x9;
  byte *pbVar3;
  long in_x10;
  uint in_w11;
  long in_x13;
  long in_x14;
  
  while( true ) {
    bVar2 = true;
    pbVar3 = in_x9;
    while( true ) {
      do {
        in_x13 = in_x13 + 1;
        in_x10 = in_x10 + -1;
        if (in_x10 == 0) {
          return bVar2 ^ 1U | param_1 + -2 != in_x14;
        }
        in_x9 = pbVar3 + 1;
        bVar1 = *pbVar3;
        pbVar3 = in_x9;
      } while (bVar1 - 0x30 < 10);
      if (bVar1 != 0x2e) break;
      if ((in_w11 & 1) != 0 || bVar2 != false) {
        return 0;
      }
      bVar2 = false;
      in_w11 = 1;
    }
    if (((bVar1 != 0x45) && (bVar1 != 0x65)) || (bVar2)) break;
    in_x14 = in_x13;
  }
  return 0;
}

