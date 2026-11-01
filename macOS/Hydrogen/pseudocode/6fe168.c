
void FUN_006fe168(void)

{
  uint uVar1;
  uint uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined1 in_ZR;
  int iVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  uint unaff_w19;
  long unaff_x20;
  code *unaff_x22;
  int unaff_w23;
  uint unaff_w24;
  uint unaff_w25;
  uint unaff_w26;
  int unaff_w27;
  int unaff_w28;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  int in_stack_00000008;
  
  while( true ) {
    uVar1 = unaff_w24;
    if (!(bool)in_ZR) {
      uVar1 = unaff_w19;
    }
    iVar5 = (*unaff_x22)();
    if (*(int *)(unaff_x20 + 8) != unaff_w28) goto LAB_006fe278;
    if (iVar5 != 0) {
      uVar1 = unaff_w26;
    }
    if (uVar1 == unaff_w24) break;
    lVar7 = *(long *)(unaff_x20 + 0x18);
    puVar3 = (undefined8 *)(lVar7 + (long)unaff_w27 * 0x10);
    uVar11 = puVar3[1];
    uVar10 = *puVar3;
    uVar9 = -(ulong)(uVar1 + unaff_w23 >> 0x1f) & 0xfffffff000000000 |
            (ulong)(uVar1 + unaff_w23) << 4;
    puVar3 = (undefined8 *)(lVar7 + uVar9);
    uVar12 = *puVar3;
    puVar4 = (undefined8 *)(lVar7 + (long)unaff_w27 * 0x10);
    puVar4[1] = puVar3[1];
    *puVar4 = uVar12;
    puVar3 = (undefined8 *)(lVar7 + uVar9);
    puVar3[1] = uVar11;
    *puVar3 = uVar10;
    uVar2 = uVar1 * 2;
    unaff_w26 = uVar2 + 2;
    if ((int)unaff_w25 < (int)unaff_w26) goto joined_r0x006fe1fc;
    unaff_w19 = uVar2 | 1;
    unaff_w27 = uVar1 + unaff_w23;
    unaff_w28 = *(int *)(unaff_x20 + 8);
    iVar5 = (*unaff_x22)();
    if (*(int *)(unaff_x20 + 8) != unaff_w28) goto LAB_006fe278;
    in_ZR = iVar5 == 0;
    unaff_w24 = uVar1;
  }
  uVar2 = unaff_w24 << 1;
  uVar1 = unaff_w24;
joined_r0x006fe1fc:
  if ((uVar2 | 1) == unaff_w25) {
    iVar5 = *(int *)(unaff_x20 + 8);
    iVar6 = (*unaff_x22)();
    if (*(int *)(unaff_x20 + 8) != iVar5) {
LAB_006fe278:
      func_0x006e644c();
      if (((bRam0000000000a278d0 & 1) != 0) || (iVar5 = ___cxa_guard_acquire(0xa278d0), iVar5 == 0))
      {
        return;
      }
      if (((bRam0000000000a28b60 & 1) == 0) && (iVar5 = ___cxa_guard_acquire(0xa28b60), iVar5 != 0))
      {
        lRam0000000000a28b58 = __dyld_get_image_header(0);
        ___cxa_guard_release(0xa28b60);
      }
      lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
      return;
    }
    if (iVar6 != 0) {
      lVar8 = *(long *)(unaff_x20 + 0x18);
      lVar7 = (long)(int)(uVar1 + unaff_w23) * 0x10;
      puVar3 = (undefined8 *)(lVar8 + lVar7);
      uVar11 = puVar3[1];
      uVar10 = *puVar3;
      puVar3 = (undefined8 *)(lVar8 + (long)in_stack_00000008 * 0x10);
      uVar12 = *puVar3;
      puVar4 = (undefined8 *)(lVar8 + lVar7);
      puVar4[1] = puVar3[1];
      *puVar4 = uVar12;
      puVar3 = (undefined8 *)(lVar8 + (long)in_stack_00000008 * 0x10);
      puVar3[1] = uVar11;
      *puVar3 = uVar10;
    }
  }
  return;
}

