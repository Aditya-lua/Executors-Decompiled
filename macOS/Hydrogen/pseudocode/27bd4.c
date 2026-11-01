
void FUN_00027bd4(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  long *unaff_x19;
  undefined8 unaff_x20;
  ulong unaff_x22;
  
  uVar2 = *(ulong *)(param_1 + 8);
  if ((unaff_x22 & unaff_x22 - 1) == 0) {
    uVar2 = uVar2 & unaff_x22 - 1;
  }
  else if (unaff_x22 <= uVar2) {
    uVar1 = 0;
    if (unaff_x22 != 0) {
      uVar1 = uVar2 / unaff_x22;
    }
    uVar2 = uVar2 - uVar1 * unaff_x22;
  }
  *(undefined8 *)(*unaff_x19 + uVar2 * 8) = unaff_x20;
  unaff_x19[3] = unaff_x19[3] + 1;
  return;
}

