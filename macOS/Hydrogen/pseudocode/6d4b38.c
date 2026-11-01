
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006d4b38(undefined8 param_1,undefined8 param_2,long param_3)

{
  int in_w8;
  uint uVar1;
  ulong uVar2;
  long lVar3;
  double *pdVar4;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long unaff_x29;
  double dVar5;
  double dVar6;
  double dVar7;
  
  if (in_w8 != 3) goto LAB_006d5370;
  uVar2 = (ulong)*(double *)(param_3 + 8);
  uVar1 = (uint)uVar2;
  if (1 < unaff_x20) {
    lVar3 = unaff_x20 - 1;
    pdVar4 = (double *)(param_3 + 0x20);
    do {
      if (*(int *)(pdVar4 + -1) != 3) goto LAB_006d5370;
      uVar1 = (uint)uVar2 & (uint)(long)*pdVar4;
      uVar2 = (ulong)uVar1;
      lVar3 = lVar3 + -1;
      pdVar4 = pdVar4 + 3;
    } while (lVar3 != 0);
  }
  *unaff_x19 = _UNK_0080c1f0;
  unaff_x19[1] = 0;
  *(bool *)(unaff_x19 + 1) = uVar1 != 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28)) {
    do {
      while (___stack_chk_fail(), *(int *)(param_3 + 0x30) != 3) {
LAB_006d5370:
        *unaff_x19 = 0;
        unaff_x19[1] = 0;
        unaff_x19[2] = 0;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
          return;
        }
      }
      dVar5 = *(double *)(param_3 + 8);
      dVar6 = *(double *)(param_3 + 0x20);
      dVar7 = *(double *)(param_3 + 0x38);
      *unaff_x19 = _UNK_008174b0;
      *(float *)(unaff_x19 + 1) = (float)dVar5;
      *(float *)((long)unaff_x19 + 0xc) = (float)dVar6;
      *(float *)(unaff_x19 + 2) = (float)dVar7;
      *(undefined4 *)((long)unaff_x19 + 0x14) = 0;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28));
  }
  return;
}

