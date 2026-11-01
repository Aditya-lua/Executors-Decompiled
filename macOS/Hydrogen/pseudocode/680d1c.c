
void FUN_00680d1c(void)

{
  byte bVar1;
  bool in_ZR;
  bool in_CY;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  long *unaff_x19;
  uint unaff_w20;
  ulong unaff_x21;
  
  if (!in_CY || in_ZR) {
    unaff_w20 = 1;
  }
  do {
    lVar4 = unaff_x19[5];
    bVar1 = *(byte *)(lVar4 + unaff_x21);
    plVar2 = (long *)(**(code **)(*unaff_x19 + 0xa8))();
    uVar3 = (**(code **)(*plVar2 + 0x50))();
    ((byte *)(lVar4 + unaff_x21))[uVar3 & 0xffffffff] = bVar1 ^ 0x5c;
    *(byte *)(unaff_x19[5] + unaff_x21) = *(byte *)(unaff_x19[5] + unaff_x21) ^ 0x36;
    unaff_x21 = unaff_x21 + 1;
  } while (unaff_w20 != unaff_x21);
  return;
}

