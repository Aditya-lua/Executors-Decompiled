
void FUN_00688b60(void)

{
  undefined8 *puVar1;
  ulong uVar2;
  long lVar3;
  long *unaff_x19;
  undefined8 *puVar5;
  undefined8 *puVar4;
  
  while( true ) {
    puVar1 = (undefined8 *)unaff_x19[2];
    puVar4 = (undefined8 *)(unaff_x19[1] + 8);
    unaff_x19[1] = (long)puVar4;
    if ((ulong)((long)puVar1 - (long)puVar4) < 0x11) break;
    __ZdlPv(*puVar4);
  }
  uVar2 = (ulong)((long)puVar1 - (long)puVar4) >> 3;
  if (uVar2 == 1) {
    lVar3 = 0x200;
  }
  else {
    if (uVar2 != 2) goto LAB_00688b9c;
    lVar3 = 0x400;
  }
  unaff_x19[4] = lVar3;
LAB_00688b9c:
  if (puVar4 != puVar1) {
    do {
      puVar5 = puVar4 + 1;
      __ZdlPv(*puVar4);
      puVar4 = puVar5;
    } while (puVar5 != puVar1);
    lVar3 = unaff_x19[2];
    if (lVar3 != unaff_x19[1]) {
      unaff_x19[2] = lVar3 + ((unaff_x19[1] - lVar3) + 7U & 0xfffffffffffffff8);
    }
  }
  if (*unaff_x19 != 0) {
    __ZdlPv();
  }
  return;
}

