/* 7ff70c95a780 FUN_7ff70c95a780 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c95a780(undefined8 param_1,longlong param_2,uint param_3)

{
  int iVar1;
  ulonglong uVar2;
  undefined8 uVar3;
  ulonglong uVar4;
  byte bStack_5c;
  undefined1 uStack_5b;
  undefined1 uStack_5a;
  undefined1 uStack_59;
  undefined1 auStack_58 [32];
  
  if ((int)param_3 < 0) {
LAB_7ff70c95a883:
    uVar3 = 0;
  }
  else {
    FUN_7ff70c94fcf0(auStack_58,24000000);
    if (param_3 == 0) {
      uVar2 = FUN_7ff70cb12e80(param_2);
      if (uVar2 == 0) {
        uVar3 = (*_DAT_7ff70cbebae8)(&UNK_7ff70cb923a7);
        return uVar3;
      }
    }
    else {
      uVar2 = (ulonglong)param_3;
    }
    uVar4 = 0;
    do {
      bStack_5c = *(byte *)(param_2 + uVar4);
      if (((((byte)(bStack_5c - 0x30) < 10) || ((byte)((bStack_5c & 0xdf) + 0xbf) < 0x1a)) ||
          (bStack_5c - 0x2d < 2)) || ((bStack_5c == 0x7e || (bStack_5c == 0x5f)))) {
        iVar1 = FUN_7ff70c94fdd0(auStack_58,&bStack_5c,1);
      }
      else {
        uStack_5b = 0x25;
        uStack_5a = (&UNK_7ff70cb509a0)[bStack_5c >> 4];
        uStack_59 = (&UNK_7ff70cb509a0)[bStack_5c & 0xf];
        iVar1 = FUN_7ff70c94fdd0(auStack_58,&uStack_5b,3);
      }
      if (iVar1 != 0) goto LAB_7ff70c95a883;
      uVar4 = uVar4 + 1;
    } while (uVar2 != uVar4);
    uVar3 = FUN_7ff70c94ffd0(auStack_58);
  }
  return uVar3;
}


