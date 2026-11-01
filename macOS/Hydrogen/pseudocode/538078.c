
byte FUN_00538078(long param_1)

{
  bool bVar1;
  bool bVar2;
  bool in_ZR;
  byte bVar3;
  long in_x9;
  byte *pbVar4;
  long lVar5;
  long lVar6;
  long in_x14;
  
  if (in_ZR) {
    if (param_1 == 1) {
LAB_0053809c:
      bVar3 = 1;
    }
    else {
      if (9 < *(byte *)(in_x9 + 1) - 0x30) goto LAB_00538130;
      if (param_1 == 2) goto LAB_0053809c;
      bVar2 = false;
      bVar1 = false;
      lVar5 = param_1 + -2;
      lVar6 = 1;
      pbVar4 = (byte *)(in_x9 + 2);
      do {
        bVar3 = *pbVar4;
        if (9 < bVar3 - 0x30) {
          if (bVar3 == 0x2e) {
            if (bVar2 || bVar1 != false) goto LAB_00538130;
            bVar1 = false;
            bVar2 = true;
          }
          else {
            if (((bVar3 != 0x45) && (bVar3 != 0x65)) || (bVar1)) goto LAB_00538130;
            bVar1 = true;
            in_x14 = lVar6;
          }
        }
        lVar6 = lVar6 + 1;
        lVar5 = lVar5 + -1;
        pbVar4 = pbVar4 + 1;
      } while (lVar5 != 0);
      bVar3 = bVar1 ^ 1;
    }
    bVar3 = bVar3 | param_1 + -2 != in_x14;
  }
  else {
LAB_00538130:
    bVar3 = 0;
  }
  return bVar3;
}

