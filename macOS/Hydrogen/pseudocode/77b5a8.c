
undefined8 FUN_0077b5a8(undefined8 param_1)

{
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  ulong uVar4;
  char *in_x9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 uStack0000000000000000;
  char *pcStack0000000000000008;
  undefined8 in_stack_00000020;
  
  do {
    pcStack0000000000000008 = in_x9 + 0x313;
    uStack0000000000000000 = param_1;
    func_0x0073d0f4();
    do {
      while( true ) {
        do {
          *(undefined4 *)(unaff_x24 + 0x4a8) = 0;
          if ((*(int *)(unaff_x20 + 0x4a8) == 0) || (uVar4 = func_0x0076e6e0(), (uVar4 & 1) == 0)) {
            return 0;
          }
          uVar3 = func_0x0076e374();
          if ((int)uVar3 != 0) {
            return uVar3;
          }
          iVar1 = *(int *)(unaff_x20 + 0x4a8);
          if (iVar1 != 0xc && in_stack_00000020._4_4_ != 1) {
            *(int *)(&UNK_00001350 + unaff_x19) = in_stack_00000020._4_4_;
          }
          if (in_stack_00000020._4_4_ == 0) {
            return 0;
          }
          uVar2 = iVar1 - 1;
          if (uVar2 < 0xb) {
                    /* WARNING: Could not recover jumptable at 0x0077b1e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            uVar3 = (*(code *)(&UNK_0077b1ec + (ulong)*(byte *)(unaff_x23 + (ulong)uVar2) * 4))();
            return uVar3;
          }
          unaff_x24 = *(long *)(unaff_x19 + 0x18);
        } while (((unaff_x19 == 0) || (*(uint *)(unaff_x24 + 0x4a8) == 0)) ||
                (-1 < *(char *)(unaff_x25 + 3)));
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) != 0) break;
        if (0 < iRam0000000000a2b580) goto code_r0x0077b598;
      }
    } while ((*(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8) < 1) || (iRam0000000000a2b580 < 1));
code_r0x0077b598:
    param_1 = *(undefined8 *)(&UNK_00a1f768 + (ulong)*(uint *)(unaff_x24 + 0x4a8) * 8);
    in_x9 = "st %s";
  } while( true );
}

