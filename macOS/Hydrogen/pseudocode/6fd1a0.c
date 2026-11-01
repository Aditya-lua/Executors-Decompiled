
undefined8 FUN_006fd1a0(long param_1)

{
  byte bVar1;
  uint uVar2;
  ulong uVar3;
  long in_x9;
  double *pdVar4;
  long lVar5;
  int *piVar6;
  double dVar7;
  double dVar8;
  
  if ((int)in_x9 < 1) {
    dVar7 = 0.0;
    bVar1 = *(byte *)(param_1 + 6);
  }
  else {
    lVar5 = 0;
    dVar7 = 0.0;
    piVar6 = (int *)(*(long *)(param_1 + 0x18) + 0xc);
    do {
      lVar5 = lVar5 + 1;
      if (*piVar6 != 0) {
        dVar7 = (double)(int)lVar5;
      }
      piVar6 = piVar6 + 4;
    } while (in_x9 != lVar5);
    bVar1 = *(byte *)(param_1 + 6);
  }
  if (bVar1 != 0x1f) {
    uVar2 = 1 << (ulong)(bVar1 & 0x1f);
    if ((int)uVar2 < 2) {
      uVar2 = 1;
    }
    uVar3 = (ulong)uVar2;
    pdVar4 = (double *)(*(long *)(param_1 + 0x20) + 0x10);
    do {
      dVar8 = dVar7;
      if (((*(int *)((long)pdVar4 + -4) != 0) && ((*(uint *)((long)pdVar4 + 0xc) & 0xf) == 3)) &&
         (dVar8 = *pdVar4, *pdVar4 <= dVar7)) {
        dVar8 = dVar7;
      }
      pdVar4 = pdVar4 + 4;
      uVar3 = uVar3 - 1;
      dVar7 = dVar8;
    } while (uVar3 != 0);
  }
  func_0x006e3850();
  return 1;
}

