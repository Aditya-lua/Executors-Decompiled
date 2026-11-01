
void FUN_00721c28(void)

{
  ulong uVar1;
  int *piVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x22;
  long unaff_x23;
  
  uVar1 = func_0x00721cf8();
  if (((*(char *)(unaff_x19 + 0x58) != '\0') && (*(long *)(unaff_x19 + 0x428) != 0)) &&
     (uVar1 != *(ulong *)(unaff_x19 + 0x430))) {
    uVar3 = 0;
    uVar4 = *(long *)(unaff_x19 + 0x420) - 1;
    uVar5 = uVar1 >> 4 ^ uVar1 >> 9;
    do {
      uVar5 = uVar5 & uVar4;
      uVar6 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar5 * 0x10);
      if (uVar6 == uVar1) {
        piVar2 = *(int **)(*(long *)(unaff_x19 + 0x418) + uVar5 * 0x10 + 8);
        if (*piVar2 != iRam0000000000a2ae00) {
          piVar2 = (int *)0x0;
        }
        *(undefined8 *)(piVar2 + 0xc) = unaff_x20;
        break;
      }
      uVar3 = uVar3 + 1;
      uVar5 = uVar3 + uVar5;
    } while (uVar6 != *(ulong *)(unaff_x19 + 0x430) && uVar3 <= uVar4);
  }
  if (*(int *)(uVar1 + 8) != iRam0000000000a27ac8) {
    uVar1 = 0;
  }
  if (uVar1 == 0 || unaff_x23 == 0) {
    return;
  }
  *(undefined8 *)(uVar1 + 0x28) = unaff_x22;
  *(long *)(uVar1 + 0x30) = unaff_x23;
  return;
}

