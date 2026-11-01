
undefined8
FUN_0014a120(byte *param_1,undefined8 param_2,byte *param_3,undefined8 *param_4,undefined8 *param_5)

{
  bool in_CY;
  byte *pbVar1;
  long in_x9;
  byte *pbVar2;
  
  if ((!in_CY) && ((*param_1 == 0x2d || (*param_1 == 0x2b)))) {
    param_1 = (byte *)(in_x9 + 2);
  }
  if ((param_3 <= param_1) || (*param_1 - 0x3a < 0xfffffff6)) {
    return 0;
  }
  pbVar2 = param_1 + 1;
  if (pbVar2 != param_3) {
    pbVar1 = param_3 + ~(ulong)param_1;
    do {
      if (9 < *pbVar2 - 0x30) goto LAB_0014a200;
      pbVar2 = pbVar2 + 1;
      pbVar1 = pbVar1 + -1;
    } while (pbVar1 != (byte *)0x0);
  }
  pbVar2 = param_3;
LAB_0014a200:
  if (param_3 <= pbVar2) {
    *param_4 = param_2;
    *param_5 = pbVar2;
    return 1;
  }
  if (*pbVar2 == 0x66) {
    pbVar2 = pbVar2 + 1;
  }
  *param_4 = param_2;
  *param_5 = pbVar2;
  return 1;
}

