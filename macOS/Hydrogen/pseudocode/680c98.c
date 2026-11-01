
void FUN_00680c98(void)

{
  byte bVar1;
  uint uVar2;
  long *plVar3;
  ulong uVar4;
  long lVar5;
  long *unaff_x19;
  uint unaff_w20;
  ulong uVar6;
  long *unaff_x24;
  
  uVar2 = (**(code **)(*unaff_x24 + 0x48))();
  _bzero(unaff_x19[5] + (ulong)uVar2,unaff_w20 - uVar2);
  uVar6 = 0;
  if (unaff_w20 < 2) {
    unaff_w20 = 1;
  }
  do {
    lVar5 = unaff_x19[5];
    bVar1 = *(byte *)(lVar5 + uVar6);
    plVar3 = (long *)(**(code **)(*unaff_x19 + 0xa8))();
    uVar4 = (**(code **)(*plVar3 + 0x50))();
    ((byte *)(lVar5 + uVar6))[uVar4 & 0xffffffff] = bVar1 ^ 0x5c;
    *(byte *)(unaff_x19[5] + uVar6) = *(byte *)(unaff_x19[5] + uVar6) ^ 0x36;
    uVar6 = uVar6 + 1;
  } while (unaff_w20 != uVar6);
  return;
}

