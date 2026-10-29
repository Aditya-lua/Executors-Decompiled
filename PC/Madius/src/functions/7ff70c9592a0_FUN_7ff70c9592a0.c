/* 7ff70c9592a0 FUN_7ff70c9592a0 */

bool FUN_7ff70c9592a0(byte *param_1,byte *param_2,longlong param_3)

{
  byte bVar1;
  ulonglong uVar2;
  
  if (param_2 == (byte *)0x0 || param_1 == (byte *)0x0) {
    return param_3 != 0 && (param_1 == (byte *)0x0 && param_2 == (byte *)0x0);
  }
  bVar1 = *param_1;
  if (bVar1 == 0) {
    uVar2 = 0;
  }
  else {
    do {
      param_1 = param_1 + 1;
      if (((ulonglong)*param_2 == 0) || (param_3 == 0)) goto LAB_7ff70c9592fe;
      if ((&UNK_7ff70cb50660)[bVar1] != (&UNK_7ff70cb50660)[*param_2]) {
        return false;
      }
      param_3 = param_3 + -1;
      param_2 = param_2 + 1;
      bVar1 = *param_1;
    } while (bVar1 != 0);
    bVar1 = 0;
LAB_7ff70c9592fe:
    uVar2 = (ulonglong)bVar1;
  }
  if (param_3 == 0) {
    return true;
  }
  return (&UNK_7ff70cb50660)[uVar2] == (&UNK_7ff70cb50660)[*param_2];
}


