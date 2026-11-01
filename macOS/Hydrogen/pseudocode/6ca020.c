
void FUN_006ca020(long param_1,long param_2)

{
  ulong in_x9;
  long in_x10;
  long in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong *in_x15;
  long lVar1;
  ulong uVar2;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  
  do {
    *in_x15 = in_x13;
    while( true ) {
      *in_x15 = in_x13;
      *(undefined8 *)(param_2 + in_x14 * 0x10 + 8) = *(undefined8 *)(param_1 + in_x11 * 0x10 + 8);
      do {
        in_x11 = in_x11 + 1;
        if (in_x11 == in_x10) {
          *unaff_x19 = param_2;
          unaff_x19[1] = unaff_x20;
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR___ZdlPv_009b01b8)(param_1);
          return;
        }
        in_x13 = *(ulong *)(param_1 + in_x11 * 0x10);
      } while (in_x13 == in_x9);
      in_x14 = (in_x13 >> 4 ^ in_x13 >> 9) & in_x12;
      uVar2 = *(ulong *)(param_2 + in_x14 * 0x10);
      if (uVar2 == unaff_x21) break;
      lVar1 = 1;
      while (uVar2 != in_x13) {
        in_x14 = in_x14 + lVar1 & in_x12;
        uVar2 = *(ulong *)(param_2 + in_x14 * 0x10);
        lVar1 = lVar1 + 1;
        if (uVar2 == unaff_x21) goto LAB_006ca01c;
      }
      in_x15 = (ulong *)(param_2 + in_x14 * 0x10);
    }
LAB_006ca01c:
    in_x15 = (ulong *)(param_2 + in_x14 * 0x10);
  } while( true );
}

