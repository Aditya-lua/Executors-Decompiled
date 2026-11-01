
void FUN_000357e4(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  ulong uVar3;
  long unaff_x19;
  
  while( true ) {
    __ZdlPv(param_1);
    puVar1 = (undefined8 *)(*(long *)(unaff_x19 + 8) + 8);
    *(undefined8 **)(unaff_x19 + 8) = puVar1;
    uVar3 = *(long *)(unaff_x19 + 0x10) - (long)puVar1;
    if (uVar3 < 0x11) break;
    param_1 = *puVar1;
  }
  uVar3 = uVar3 >> 3;
  if (uVar3 == 1) {
    uVar2 = 0x15;
  }
  else {
    if (uVar3 != 2) {
      return;
    }
    uVar2 = 0x2a;
  }
  *(undefined8 *)(unaff_x19 + 0x20) = uVar2;
  return;
}

