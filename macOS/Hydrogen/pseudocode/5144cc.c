
undefined8 FUN_005144cc(undefined8 *param_1)

{
  long *plVar1;
  undefined1 in_ZR;
  undefined8 *puVar2;
  undefined8 *in_x9;
  byte *in_x10;
  long in_x11;
  byte *pbVar3;
  byte *in_x12;
  long unaff_x19;
  byte *unaff_x20;
  
  while( true ) {
    puVar2 = param_1;
    pbVar3 = in_x12;
    if (!(bool)in_ZR) {
      do {
        puVar2 = param_1 + 2;
        if (puVar2 == in_x9) {
          return 0;
        }
        plVar1 = param_1 + 3;
        param_1 = puVar2;
      } while (*plVar1 != unaff_x19);
      in_x10 = (byte *)*puVar2;
      in_x11 = unaff_x19;
      pbVar3 = unaff_x20;
    }
    if (in_x11 == 0) break;
    in_x11 = in_x11 + -1;
    in_x12 = pbVar3 + 1;
    in_ZR = ((uint)*in_x10 | (uint)(*in_x10 - 0x41 < 0x1a) << 5) ==
            ((uint)*pbVar3 | (uint)(*pbVar3 - 0x41 < 0x1a) << 5);
    param_1 = puVar2;
    in_x10 = in_x10 + 1;
  }
  return 1;
}

