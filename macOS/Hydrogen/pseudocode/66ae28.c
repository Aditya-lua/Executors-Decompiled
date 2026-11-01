
void FUN_0066ae28(undefined8 *param_1)

{
  undefined8 uVar1;
  ulong uVar2;
  long unaff_x19;
  
  do {
    __ZdlPv(*param_1);
    param_1 = (undefined8 *)(*(long *)(unaff_x19 + 0x58) + 8);
    *(undefined8 **)(unaff_x19 + 0x58) = param_1;
    uVar2 = *(long *)(unaff_x19 + 0x60) - (long)param_1;
  } while (0x10 < uVar2);
  uVar2 = uVar2 >> 3;
  if (uVar2 == 1) {
    uVar1 = 0x55;
  }
  else {
    if (uVar2 != 2) {
      return;
    }
    uVar1 = 0xaa;
  }
  *(undefined8 *)(unaff_x19 + 0x70) = uVar1;
  return;
}

