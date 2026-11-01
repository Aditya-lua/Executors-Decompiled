
bool FUN_004553c4(undefined8 param_1,undefined8 param_2)

{
  bool bVar1;
  bool in_ZR;
  ulong uVar2;
  undefined8 in_x9;
  undefined8 *unaff_x19;
  undefined1 unaff_w20;
  
  if (in_ZR) {
    in_x9 = param_1;
  }
  uVar2 = func_0x0046adc0(param_2,in_x9);
  bVar1 = (uVar2 & 1) != 0;
  if (!bVar1) {
    *unaff_x19 = 0;
    *(undefined1 *)(unaff_x19 + 1) = unaff_w20;
  }
  return bVar1;
}

