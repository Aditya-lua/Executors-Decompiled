
void FUN_006d38f0(long param_1,long param_2)

{
  ulong in_x9;
  long in_x10;
  long in_x11;
  ulong uVar1;
  ulong uVar2;
  ulong *puVar3;
  long lVar4;
  ulong uVar5;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  
  do {
    uVar1 = *(ulong *)(param_1 + in_x11 * 0x10);
    if (uVar1 != in_x9) {
      uVar2 = (uVar1 >> 4 ^ uVar1 >> 9) & unaff_x20 - 1U;
      uVar5 = *(ulong *)(param_2 + uVar2 * 0x10);
      if (uVar5 != unaff_x21) {
        lVar4 = 1;
        do {
          if (uVar5 == uVar1) {
            puVar3 = (ulong *)(param_2 + uVar2 * 0x10);
            goto LAB_006d3900;
          }
          uVar2 = uVar2 + lVar4 & unaff_x20 - 1U;
          uVar5 = *(ulong *)(param_2 + uVar2 * 0x10);
          lVar4 = lVar4 + 1;
        } while (uVar5 != unaff_x21);
      }
      puVar3 = (ulong *)(param_2 + uVar2 * 0x10);
      *puVar3 = uVar1;
LAB_006d3900:
      *puVar3 = uVar1;
      *(undefined4 *)(param_2 + uVar2 * 0x10 + 8) = *(undefined4 *)(param_1 + in_x11 * 0x10 + 8);
    }
    in_x11 = in_x11 + 1;
    if (in_x11 == in_x10) {
      *unaff_x19 = param_2;
      unaff_x19[1] = unaff_x20;
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR___ZdlPv_009b01b8)(param_1);
      return;
    }
  } while( true );
}

