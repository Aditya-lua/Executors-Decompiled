
bool FUN_004bafc0(ulong param_1)

{
  long *plVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  long in_x11;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  
  if ((param_1 < *(ulong *)(in_x11 + 0x10)) &&
     (plVar1 = (long *)(*(long *)(in_x11 + 8) + param_1 * 0x20), *plVar1 != -0x8000000000000000)) {
    uVar2 = (ulong)*(uint *)(plVar1 + 3);
    lVar3 = 0;
    lVar4 = *(long *)(in_x11 + 0x20);
    uVar5 = *(ulong *)(in_x11 + 0x28);
    uVar6 = 0xffffffff;
    if (uVar5 <= uVar2) goto LAB_004bb020;
  }
  else {
    uVar2 = 0xffffffff;
    lVar3 = 0;
    lVar4 = *(long *)(in_x11 + 0x20);
    uVar5 = *(ulong *)(in_x11 + 0x28);
    uVar6 = 0xffffffff;
    if (uVar5 < 0x100000000) goto LAB_004bb020;
  }
  do {
    do {
      uVar2 = (ulong)*(uint *)(lVar4 + uVar2 * 0x30 + 0x20);
      lVar3 = lVar3 + 1;
    } while (uVar2 < uVar5);
LAB_004bb020:
    do {
      if (uVar5 <= uVar6) {
        return lVar3 == 0;
      }
      lVar7 = lVar4 + uVar6 * 0x30;
      uVar6 = (ulong)*(uint *)(lVar7 + 0x24);
    } while ((*(int *)(lVar7 + 0x28) == -1) || (lVar3 = lVar3 + 1, uVar5 <= uVar2));
  } while( true );
}

