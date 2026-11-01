
undefined8 FUN_006ecd44(void)

{
  uint uVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x20;
  char *unaff_x22;
  long unaff_x23;
  long unaff_x27;
  undefined8 in_stack_00000008;
  
  uVar2 = func_0x006f4f8c(in_stack_00000008,0x100);
  *(undefined8 *)(unaff_x20 + 0x18) = uVar2;
  do {
    if (*unaff_x22 == '\0') {
      if (unaff_x23 != 0) {
        if ((*(byte *)(unaff_x19 + 1) >> 2 & 1) != 0) {
          func_0x006f0ed4();
        }
        plVar3 = *(long **)(unaff_x19 + 8);
        *plVar3 = unaff_x23;
        *(undefined4 *)((long)plVar3 + 0xc) = 7;
        lVar4 = *(long *)(unaff_x19 + 8);
        if (*(long *)(unaff_x19 + 0x28) - lVar4 < 0x11) {
          func_0x006ee1d4();
          lVar4 = *(long *)(unaff_x19 + 8);
        }
        *(long *)(unaff_x19 + 8) = lVar4 + 0x10;
      }
      return 1;
    }
    uVar1 = (int)*unaff_x22 - 0x61;
    unaff_x22 = unaff_x22 + 1;
  } while (0x14 < uVar1);
                    /* WARNING: Could not recover jumptable at 0x006ecbf8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (*(code *)(&UNK_006ecbd0 + (ulong)*(byte *)(unaff_x27 + (ulong)uVar1) * 4))();
  return uVar2;
}

