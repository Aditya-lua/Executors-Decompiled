
void FUN_006db9f0(long param_1,long param_2)

{
  ulong in_x9;
  long in_x10;
  long in_x11;
  ulong in_x12;
  undefined8 in_x13;
  ulong uVar1;
  ulong in_x14;
  ulong *puVar2;
  long lVar3;
  ulong uVar4;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  
  do {
    *(undefined8 *)(param_2 + in_x14 * 0x10 + 8) = in_x13;
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
      uVar1 = *(ulong *)(param_1 + in_x11 * 0x10);
    } while (uVar1 == in_x9);
    in_x14 = (uVar1 >> 4 ^ uVar1 >> 9) & in_x12;
    uVar4 = *(ulong *)(param_2 + in_x14 * 0x10);
    if (uVar4 != unaff_x21) {
      lVar3 = 1;
      do {
        if (uVar4 == uVar1) {
          puVar2 = (ulong *)(param_2 + in_x14 * 0x10);
          goto code_r0x006db9e4;
        }
        in_x14 = in_x14 + lVar3 & in_x12;
        uVar4 = *(ulong *)(param_2 + in_x14 * 0x10);
        lVar3 = lVar3 + 1;
      } while (uVar4 != unaff_x21);
    }
    puVar2 = (ulong *)(param_2 + in_x14 * 0x10);
    *puVar2 = uVar1;
code_r0x006db9e4:
    *puVar2 = uVar1;
    in_x13 = *(undefined8 *)(param_1 + in_x11 * 0x10 + 8);
  } while( true );
}

