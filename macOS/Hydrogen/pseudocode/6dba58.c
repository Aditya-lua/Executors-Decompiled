
void FUN_006dba58(long param_1,long param_2)

{
  ulong in_x9;
  long in_x10;
  long in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong *puVar1;
  long lVar2;
  ulong uVar3;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  
LAB_006db9dc:
  do {
    puVar1 = (ulong *)(param_2 + in_x14 * 0x10);
    *puVar1 = in_x13;
    while( true ) {
      *puVar1 = in_x13;
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
      uVar3 = *(ulong *)(param_2 + in_x14 * 0x10);
      if (uVar3 == unaff_x21) break;
      lVar2 = 1;
      while (uVar3 != in_x13) {
        in_x14 = in_x14 + lVar2 & in_x12;
        uVar3 = *(ulong *)(param_2 + in_x14 * 0x10);
        lVar2 = lVar2 + 1;
        if (uVar3 == unaff_x21) goto LAB_006db9dc;
      }
      puVar1 = (ulong *)(param_2 + in_x14 * 0x10);
    }
  } while( true );
}

