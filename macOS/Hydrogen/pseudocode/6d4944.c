
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006d4944(undefined8 param_1,undefined8 param_2,long param_3)

{
  bool in_ZR;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 uVar1;
  double dVar2;
  double dVar3;
  double dVar4;
  
  if (!in_ZR) goto LAB_006d5370;
  uVar1 = _sinh(*(undefined8 *)(param_3 + 8));
  *unaff_x19 = _UNK_008174a8;
  unaff_x19[1] = uVar1;
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
      dVar2 = *(double *)(param_3 + 8);
      dVar3 = *(double *)(param_3 + 0x20);
      dVar4 = *(double *)(param_3 + 0x38);
      *unaff_x19 = _UNK_008174b0;
      *(float *)(unaff_x19 + 1) = (float)dVar2;
      *(float *)((long)unaff_x19 + 0xc) = (float)dVar3;
      *(float *)(unaff_x19 + 2) = (float)dVar4;
      *(undefined4 *)((long)unaff_x19 + 0x14) = 0;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28));
  }
  return;
}

