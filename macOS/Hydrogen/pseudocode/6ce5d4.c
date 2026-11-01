
void FUN_006ce5d4(ulong param_1,long param_2)

{
  long lVar1;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong *puVar2;
  ulong in_x14;
  ulong uVar3;
  ulong uVar4;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  
  do {
    uVar3 = in_x14 ^ in_x12 >> 9;
    do {
      uVar3 = uVar3 & in_x10;
      uVar4 = *(ulong *)(param_2 + uVar3 * 0x20);
      if (uVar4 == unaff_x21) {
        puVar2 = (ulong *)(param_2 + uVar3 * 0x20);
        *puVar2 = in_x12;
        goto LAB_006ce590;
      }
      if (uVar4 == in_x12) {
        puVar2 = (ulong *)(param_2 + uVar3 * 0x20);
        goto LAB_006ce590;
      }
      in_x13 = in_x13 + 1;
      uVar3 = in_x13 + uVar3;
    } while (in_x13 <= in_x10);
    puVar2 = (ulong *)0x0;
LAB_006ce590:
    *puVar2 = in_x12;
    lVar1 = in_x11 + in_x9 * 0x20;
    uVar4 = *(ulong *)(lVar1 + 0x10);
    uVar3 = *(ulong *)(lVar1 + 8);
    puVar2[3] = *(ulong *)(lVar1 + 0x18);
    puVar2[2] = uVar4;
    puVar2[1] = uVar3;
    do {
      in_x9 = in_x9 + 1;
      if (param_1 <= in_x9) {
        lVar1 = *unaff_x19;
        *unaff_x19 = param_2;
        unaff_x19[1] = unaff_x20;
        if (lVar1 == 0) {
          return;
        }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR___ZdlPv_009b01b8)(lVar1);
        return;
      }
      in_x11 = *unaff_x19;
      in_x12 = *(ulong *)(in_x11 + in_x9 * 0x20);
    } while (in_x12 == unaff_x19[3]);
    in_x13 = 0;
    in_x14 = in_x12 >> 4;
  } while( true );
}

