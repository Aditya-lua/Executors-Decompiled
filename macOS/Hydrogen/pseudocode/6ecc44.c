
undefined8 FUN_006ecc44(long param_1)

{
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  long *plVar4;
  long lVar5;
  long in_x9;
  long in_x10;
  int in_w11;
  long unaff_x19;
  long unaff_x20;
  char *unaff_x22;
  long unaff_x23;
  long unaff_x27;
  
  iVar1 = 0;
  if (in_x10 != in_x9) {
    iVar1 = in_w11 + -1;
  }
  lVar5 = *(long *)(param_1 + 0x38) - (param_1 + 0x38);
  if (lVar5 == 0) {
    *(undefined4 *)(unaff_x20 + 0x24) = 0;
  }
  else {
    *(uint *)(unaff_x20 + 0x24) =
         *(int *)((*(ulong *)(param_1 + 0x40U) ^ param_1 + 0x40U) +
                 (long)(iVar1 >> (*(uint *)(param_1 + 0xa0) & 0x1f)) * 4) +
         (uint)*(byte *)(lVar5 + iVar1);
  }
  do {
    if (*unaff_x22 == '\0') {
      if (unaff_x23 != 0) {
        if ((*(byte *)(unaff_x19 + 1) >> 2 & 1) != 0) {
          func_0x006f0ed4();
        }
        plVar4 = *(long **)(unaff_x19 + 8);
        *plVar4 = unaff_x23;
        *(undefined4 *)((long)plVar4 + 0xc) = 7;
        lVar5 = *(long *)(unaff_x19 + 8);
        if (*(long *)(unaff_x19 + 0x28) - lVar5 < 0x11) {
          func_0x006ee1d4();
          lVar5 = *(long *)(unaff_x19 + 8);
        }
        *(long *)(unaff_x19 + 8) = lVar5 + 0x10;
      }
      return 1;
    }
    uVar2 = (int)*unaff_x22 - 0x61;
    unaff_x22 = unaff_x22 + 1;
  } while (0x14 < uVar2);
                    /* WARNING: Could not recover jumptable at 0x006ecbf8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (*(code *)(&UNK_006ecbd0 + (ulong)*(byte *)(unaff_x27 + (ulong)uVar2) * 4))();
  return uVar3;
}

