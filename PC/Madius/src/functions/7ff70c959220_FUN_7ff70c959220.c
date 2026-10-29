/* 7ff70c959220 FUN_7ff70c959220 */

bool FUN_7ff70c959220(byte *param_1,byte *param_2)

{
  bool bVar1;
  byte bVar2;
  ulonglong uVar3;
  
  if (param_2 == (byte *)0x0 || param_1 == (byte *)0x0) {
    return param_1 == (byte *)0x0 && param_2 == (byte *)0x0;
  }
  bVar2 = *param_1;
  if (bVar2 == 0) {
    bVar1 = true;
  }
  else {
    do {
      param_1 = param_1 + 1;
      uVar3 = (ulonglong)*param_2;
      bVar1 = uVar3 != 0;
      if (uVar3 == 0) break;
      if ((&UNK_7ff70cb50660)[bVar2] != (&UNK_7ff70cb50660)[uVar3]) {
        return false;
      }
      param_2 = param_2 + 1;
      bVar2 = *param_1;
    } while (bVar2 != 0);
  }
  return (bool)(*param_2 != 0 ^ bVar1);
}


