
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006d4ee0(undefined8 param_1,undefined8 param_2,long param_3)

{
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 uVar1;
  undefined8 uVar2;
  double dVar3;
  double dVar4;
  double dVar5;
  
  uVar1 = 0xbff0000000000000;
  if (0.0 <= *(double *)(param_3 + 8)) {
    uVar1 = 0;
  }
  uVar2 = 0x3ff0000000000000;
  if (*(double *)(param_3 + 8) <= 0.0) {
    uVar2 = uVar1;
  }
  *unaff_x19 = _UNK_008174a8;
  unaff_x19[1] = uVar2;
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28)) {
    do {
      while (___stack_chk_fail(), *(int *)(param_3 + 0x30) == 3) {
        dVar3 = *(double *)(param_3 + 8);
        dVar4 = *(double *)(param_3 + 0x20);
        dVar5 = *(double *)(param_3 + 0x38);
        *unaff_x19 = _UNK_008174b0;
        *(float *)(unaff_x19 + 1) = (float)dVar3;
        *(float *)((long)unaff_x19 + 0xc) = (float)dVar4;
        *(float *)(unaff_x19 + 2) = (float)dVar5;
        *(undefined4 *)((long)unaff_x19 + 0x14) = 0;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
          return;
        }
      }
      *unaff_x19 = 0;
      unaff_x19[1] = 0;
      unaff_x19[2] = 0;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28));
  }
  return;
}

