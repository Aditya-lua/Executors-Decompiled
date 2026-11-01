
undefined8 FUN_006e51d0(ulong param_1)

{
  ulong uVar1;
  bool bVar2;
  long lVar3;
  undefined8 uVar4;
  uint in_w9;
  undefined *puVar5;
  long unaff_x20;
  long unaff_x21;
  long lVar6;
  double dVar7;
  double dVar8;
  double unaff_d9;
  
  dVar8 = *(double *)(&UNK_00001b90 + unaff_x20);
  if (*(ulong *)(unaff_x20 + 0x48) < param_1) {
    lVar6 = 0;
  }
  else {
    lVar6 = 0;
    do {
      lVar3 = func_0x006efe90();
      lVar6 = lVar3 + lVar6;
      in_w9 = (uint)*(byte *)(unaff_x20 + 0x21);
      if (*(byte *)(unaff_x20 + 0x21) == 0) {
        uVar4 = 1;
        bVar2 = true;
        goto LAB_006e5230;
      }
    } while (*(ulong *)(unaff_x20 + 0x40) <= *(ulong *)(unaff_x20 + 0x48));
  }
  uVar4 = 0;
  bVar2 = in_w9 == 0;
  if (in_w9 == 0) {
LAB_006e5230:
    puVar5 = &UNK_00001a30;
  }
  else {
    puVar5 = &UNK_00001b08;
  }
  dVar7 = *(double *)(puVar5 + unaff_x20 + 0x28) - unaff_d9;
  dVar8 = *(double *)(puVar5 + unaff_x20 + 0x88) - dVar8;
  if ((0.0 < dVar7) &&
     (*(long *)(puVar5 + unaff_x20 + 0x40) = *(long *)(puVar5 + unaff_x20 + 0x40) + 1,
     *(double *)(puVar5 + unaff_x20 + 0x38) < dVar7)) {
    *(double *)(puVar5 + unaff_x20 + 0x38) = dVar7;
  }
  if ((0.0 < dVar8) &&
     (*(long *)(puVar5 + unaff_x20 + 0xa0) = *(long *)(puVar5 + unaff_x20 + 0xa0) + 1,
     *(double *)(puVar5 + unaff_x20 + 0x98) < dVar8)) {
    *(double *)(puVar5 + unaff_x20 + 0x98) = dVar8;
  }
  if (bVar2) {
    return uVar4;
  }
  uVar1 = lVar6 + unaff_x21 + *(long *)(unaff_x20 + 0x48);
  *(ulong *)(unaff_x20 + 0x40) = uVar1 & ((long)uVar1 >> 0x3f ^ 0xffffffffffffffffU);
  return uVar4;
}

