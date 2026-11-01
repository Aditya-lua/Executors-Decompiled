
void FUN_006dc1c0(long param_1,long param_2,ulong param_3)

{
  long in_x9;
  long in_x10;
  ulong in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong *puVar1;
  long in_x15;
  ulong *in_x16;
  ulong in_x17;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  
  do {
    in_x15 = in_x15 + 1;
    if (in_x17 == unaff_x21 && param_3 == unaff_x22) goto LAB_006dc138;
    while ((in_x17 == in_x12 && (param_3 == in_x13))) {
      puVar1 = (ulong *)(param_2 + in_x14 * 0x10);
      while( true ) {
        *puVar1 = in_x12;
        *(ulong *)(param_2 + in_x14 * 0x10 + 8) = in_x13;
        do {
          in_x10 = in_x10 + 1;
          if (in_x10 == in_x9) {
            *unaff_x19 = param_2;
            unaff_x19[1] = unaff_x20;
            if (param_1 == 0) {
              return;
            }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)PTR___ZdlPv_009b01b8)(param_1);
            return;
          }
          puVar1 = (ulong *)(param_1 + in_x10 * 0x10);
          in_x12 = *puVar1;
          in_x13 = puVar1[1];
        } while (in_x12 == unaff_x19[3] && in_x13 == unaff_x19[4]);
        in_x14 = ((in_x12 ^ in_x13) >> 4 ^ (in_x12 ^ in_x13) >> 9) & in_x11;
        in_x17 = *(ulong *)(param_2 + in_x14 * 0x10);
        in_x16 = (ulong *)(param_2 + in_x14 * 0x10 + 8);
        param_3 = *in_x16;
        if (in_x17 != unaff_x21 || param_3 != unaff_x22) break;
LAB_006dc138:
        puVar1 = (ulong *)(param_2 + in_x14 * 0x10);
        *puVar1 = in_x12;
        *in_x16 = in_x13;
      }
      in_x15 = 1;
    }
    in_x14 = in_x14 + in_x15 & in_x11;
    in_x17 = *(ulong *)(param_2 + in_x14 * 0x10);
    in_x16 = (ulong *)(param_2 + in_x14 * 0x10 + 8);
    param_3 = *in_x16;
  } while( true );
}

