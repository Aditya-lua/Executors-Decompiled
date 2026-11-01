
void FUN_000357a0(void)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  while( true ) {
    if (*(long *)(unaff_x22 + 0x20) != 0) {
      *(long *)(unaff_x22 + 0x28) = *(long *)(unaff_x22 + 0x20);
      __ZdlPv();
    }
    unaff_x22 = unaff_x22 + 0x60;
    if (unaff_x22 - *unaff_x21 == 0xfc0) {
      unaff_x21 = unaff_x21 + 1;
      unaff_x22 = *unaff_x21;
    }
    if (unaff_x22 == unaff_x23) break;
    if (*(long *)(unaff_x22 + 0x38) != 0) {
      *(long *)(unaff_x22 + 0x40) = *(long *)(unaff_x22 + 0x38);
      __ZdlPv();
    }
  }
  puVar1 = *(undefined8 **)(unaff_x19 + 8);
  lVar2 = *(long *)(unaff_x19 + 0x10);
  *unaff_x20 = 0;
  uVar4 = lVar2 - (long)puVar1;
  while (0x10 < uVar4) {
    __ZdlPv(*puVar1);
    puVar1 = (undefined8 *)(*(long *)(unaff_x19 + 8) + 8);
    *(undefined8 **)(unaff_x19 + 8) = puVar1;
    uVar4 = *(long *)(unaff_x19 + 0x10) - (long)puVar1;
  }
  if (uVar4 >> 3 == 1) {
    uVar3 = 0x15;
  }
  else {
    if (uVar4 >> 3 != 2) {
      return;
    }
    uVar3 = 0x2a;
  }
  *(undefined8 *)(unaff_x19 + 0x20) = uVar3;
  return;
}

