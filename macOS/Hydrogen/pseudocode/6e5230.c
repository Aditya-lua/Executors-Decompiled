
void FUN_006e5230(ulong param_1)

{
  ulong uVar1;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  double dVar2;
  double dVar3;
  double unaff_d8;
  double unaff_d9;
  
  dVar3 = *(double *)(&UNK_00001a58 + unaff_x20) - unaff_d9;
  dVar2 = *(double *)(&UNK_00001ab8 + unaff_x20) - unaff_d8;
  if ((0.0 < dVar3) &&
     (*(long *)(&UNK_00001a70 + unaff_x20) = *(long *)(&UNK_00001a70 + unaff_x20) + 1,
     *(double *)(&UNK_00001a68 + unaff_x20) < dVar3)) {
    *(double *)(&UNK_00001a68 + unaff_x20) = dVar3;
  }
  if ((0.0 < dVar2) &&
     (*(long *)(&UNK_00001ad0 + unaff_x20) = *(long *)(&UNK_00001ad0 + unaff_x20) + 1,
     *(double *)(&UNK_00001ac8 + unaff_x20) < dVar2)) {
    *(double *)(&UNK_00001ac8 + unaff_x20) = dVar2;
  }
  if ((param_1 & 1) == 0) {
    uVar1 = unaff_x22 + unaff_x21 + *(long *)(unaff_x20 + 0x48);
    *(ulong *)(unaff_x20 + 0x40) = uVar1 & ((long)uVar1 >> 0x3f ^ 0xffffffffffffffffU);
    return;
  }
  return;
}

