
void FUN_006db954(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  ulong in_x10;
  long lVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong *unaff_x19;
  ulong uVar12;
  
  uVar1 = 0x10;
  if (in_x10 != 0) {
    uVar1 = in_x10 << 1;
  }
  uVar12 = *(ulong *)(param_1 + 0x18);
  if (uVar1 == 0) {
    uVar2 = 0;
    uVar3 = *unaff_x19;
    uVar5 = uVar12;
    goto joined_r0x006dba88;
  }
  uVar2 = __Znwm(uVar1 << 4);
  uVar5 = unaff_x19[3];
  if ((uVar1 < 0x18) ||
     (lVar6 = (uVar1 - 1) * 0x10,
     (uVar2 + lVar6 < uVar2 || uVar2 + 8 + lVar6 < uVar2 + 8) || uVar1 - 1 >> 0x3c != 0)) {
    uVar3 = 0;
code_r0x006db9ac:
    lVar6 = uVar1 - uVar3;
    puVar4 = (undefined8 *)(uVar2 + uVar3 * 0x10 + 8);
    do {
      puVar4[-1] = uVar5;
      *puVar4 = 0;
      puVar4 = puVar4 + 2;
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
  }
  else {
    uVar3 = uVar1 & 0xfffffffffffffff8;
    puVar7 = (ulong *)(uVar2 + 0x40);
    uVar8 = uVar3;
    do {
      puVar7[-7] = 0;
      puVar7[-8] = uVar5;
      puVar7[-5] = 0;
      puVar7[-6] = uVar5;
      puVar7[-3] = 0;
      puVar7[-4] = uVar5;
      puVar7[-1] = 0;
      puVar7[-2] = uVar5;
      puVar7[1] = 0;
      *puVar7 = uVar5;
      puVar7[3] = 0;
      puVar7[2] = uVar5;
      puVar7[5] = 0;
      puVar7[4] = uVar5;
      puVar7[7] = 0;
      puVar7[6] = uVar5;
      puVar7 = puVar7 + 0x10;
      uVar8 = uVar8 - 8;
    } while (uVar8 != 0);
    if (uVar1 != uVar3) goto code_r0x006db9ac;
  }
  uVar3 = *unaff_x19;
  in_x10 = unaff_x19[1];
joined_r0x006dba88:
  if (in_x10 == 0) {
    *unaff_x19 = uVar2;
    unaff_x19[1] = uVar1;
    if (uVar3 == 0) {
      return;
    }
  }
  else {
    uVar8 = 0;
    do {
      uVar9 = *(ulong *)(uVar3 + uVar8 * 0x10);
      if (uVar9 != uVar5) {
        uVar10 = (uVar9 >> 4 ^ uVar9 >> 9) & uVar1 - 1;
        uVar11 = *(ulong *)(uVar2 + uVar10 * 0x10);
        if (uVar11 != uVar12) {
          lVar6 = 1;
          do {
            if (uVar11 == uVar9) {
              puVar7 = (ulong *)(uVar2 + uVar10 * 0x10);
              goto code_r0x006db9e4;
            }
            uVar10 = uVar10 + lVar6 & uVar1 - 1;
            uVar11 = *(ulong *)(uVar2 + uVar10 * 0x10);
            lVar6 = lVar6 + 1;
          } while (uVar11 != uVar12);
        }
        puVar7 = (ulong *)(uVar2 + uVar10 * 0x10);
        *puVar7 = uVar9;
code_r0x006db9e4:
        *puVar7 = uVar9;
        *(undefined8 *)(uVar2 + uVar10 * 0x10 + 8) = *(undefined8 *)(uVar3 + uVar8 * 0x10 + 8);
      }
      uVar8 = uVar8 + 1;
    } while (uVar8 != in_x10);
    *unaff_x19 = uVar2;
    unaff_x19[1] = uVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(uVar3);
  return;
}

