
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006d4a00(double param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  undefined8 *unaff_x19;
  long unaff_x29;
  double dVar1;
  double dVar2;
  double dVar3;
  
  if (0x1f < (uint)(int)param_1) goto LAB_006d5370;
  dVar1 = *(double *)(param_4 + 8);
  *unaff_x19 = _UNK_008174a8;
  unaff_x19[1] = (double)(uint)((int)(long)dVar1 >> ((int)param_1 & 0x1fU));
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28)) {
    do {
      while (___stack_chk_fail(), *(int *)(param_4 + 0x30) != 3) {
LAB_006d5370:
        *unaff_x19 = 0;
        unaff_x19[1] = 0;
        unaff_x19[2] = 0;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
          return;
        }
      }
      dVar1 = *(double *)(param_4 + 8);
      dVar2 = *(double *)(param_4 + 0x20);
      dVar3 = *(double *)(param_4 + 0x38);
      *unaff_x19 = _UNK_008174b0;
      *(float *)(unaff_x19 + 1) = (float)dVar1;
      *(float *)((long)unaff_x19 + 0xc) = (float)dVar2;
      *(float *)(unaff_x19 + 2) = (float)dVar3;
      *(undefined4 *)((long)unaff_x19 + 0x14) = 0;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28));
  }
  return;
}

