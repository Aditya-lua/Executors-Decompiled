
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006d4fa8(double param_1,double param_2,undefined8 param_3,undefined8 param_4,long param_5)

{
  undefined8 *unaff_x19;
  long unaff_x29;
  double dVar1;
  double dVar2;
  double dVar3;
  
  *unaff_x19 = _UNK_008174b0;
  *(float *)(unaff_x19 + 1) = (float)param_1;
  *(float *)((long)unaff_x19 + 0xc) = (float)param_2;
  do {
    unaff_x19[2] = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
      return;
    }
    while (___stack_chk_fail(), *(int *)(param_5 + 0x30) == 3) {
      dVar1 = *(double *)(param_5 + 8);
      dVar2 = *(double *)(param_5 + 0x20);
      dVar3 = *(double *)(param_5 + 0x38);
      *unaff_x19 = _UNK_008174b0;
      *(float *)(unaff_x19 + 1) = (float)dVar1;
      *(float *)((long)unaff_x19 + 0xc) = (float)dVar2;
      *(float *)(unaff_x19 + 2) = (float)dVar3;
      *(undefined4 *)((long)unaff_x19 + 0x14) = 0;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
        return;
      }
    }
    *unaff_x19 = 0;
    unaff_x19[1] = 0;
  } while( true );
}

