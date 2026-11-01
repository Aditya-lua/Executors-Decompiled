
void FUN_006db9bc(undefined8 *param_1,long param_2)

{
  long lVar1;
  long lVar2;
  ulong in_x9;
  long in_x10;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong *puVar6;
  long lVar7;
  ulong uVar8;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  
  while( true ) {
    in_x10 = in_x10 + -1;
    if (in_x10 == 0) break;
    param_1[1] = in_x9;
    param_1[2] = 0;
    param_1 = param_1 + 2;
  }
  lVar1 = *unaff_x19;
  lVar2 = unaff_x19[1];
  if (lVar2 == 0) {
    *unaff_x19 = param_2;
    unaff_x19[1] = unaff_x20;
    if (lVar1 == 0) {
      return;
    }
  }
  else {
    lVar3 = 0;
    do {
      uVar4 = *(ulong *)(lVar1 + lVar3 * 0x10);
      if (uVar4 != in_x9) {
        uVar5 = (uVar4 >> 4 ^ uVar4 >> 9) & unaff_x20 - 1U;
        uVar8 = *(ulong *)(param_2 + uVar5 * 0x10);
        if (uVar8 != unaff_x21) {
          lVar7 = 1;
          do {
            if (uVar8 == uVar4) {
              puVar6 = (ulong *)(param_2 + uVar5 * 0x10);
              goto code_r0x006db9e4;
            }
            uVar5 = uVar5 + lVar7 & unaff_x20 - 1U;
            uVar8 = *(ulong *)(param_2 + uVar5 * 0x10);
            lVar7 = lVar7 + 1;
          } while (uVar8 != unaff_x21);
        }
        puVar6 = (ulong *)(param_2 + uVar5 * 0x10);
        *puVar6 = uVar4;
code_r0x006db9e4:
        *puVar6 = uVar4;
        *(undefined8 *)(param_2 + uVar5 * 0x10 + 8) = *(undefined8 *)(lVar1 + lVar3 * 0x10 + 8);
      }
      lVar3 = lVar3 + 1;
    } while (lVar3 != lVar2);
    *unaff_x19 = param_2;
    unaff_x19[1] = unaff_x20;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(lVar1);
  return;
}

