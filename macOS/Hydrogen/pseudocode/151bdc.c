
ulong FUN_00151bdc(undefined8 param_1,undefined8 param_2,ulong param_3,long param_4,
                  undefined *param_5)

{
  long lVar1;
  uint uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long *unaff_x19;
  uint unaff_w23;
  long lVar7;
  long lVar8;
  ulong uVar9;
  long unaff_x29;
  undefined1 auVar10 [16];
  int iStack_64;
  
  if (*(int *)(unaff_x29 + 0x20) == 0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return 0xffffffffffffffec;
    }
  }
  else {
    if (*(int *)(unaff_x29 + 0x24) != 0 && 0x18 < *(int *)(unaff_x29 + 0x28)) {
      uVar5 = 0;
      do {
        Hint_Prefetch(*unaff_x19 + uVar5,0,1,0);
        uVar5 = uVar5 + 0x40;
      } while (uVar5 < (ulong)((1 << (ulong)(unaff_w23 & 0x1f)) + 1) << 3);
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return 0;
    }
  }
  auVar10 = ___stack_chk_fail();
  uVar5 = auVar10._8_8_;
  lVar3 = auVar10._0_8_;
  if (*(int *)(&UNK_000075e0 + lVar3) == 0) {
    if (&UNK_00020001 <= param_5) {
      return 0xffffffffffffffb8;
    }
  }
  else if ((undefined *)(ulong)*(uint *)(&UNK_000074f8 + lVar3) < param_5) {
    return 0xffffffffffffffb8;
  }
  uVar4 = func_0x00150fa0(lVar3,param_4,param_5,uVar5,param_3);
  if (0xffffffffffffff88 < uVar4) {
    return uVar4;
  }
  uVar9 = param_3;
  if (*(int *)(&UNK_000075e0 + lVar3) == 0) {
    if (param_3 < 0x20000) goto LAB_00151d54;
    uVar6 = 0x20000;
  }
  else {
    uVar6 = (ulong)*(uint *)(&UNK_000074f8 + lVar3);
    if (param_3 < uVar6) goto LAB_00151d54;
  }
  uVar9 = uVar6;
LAB_00151d54:
  lVar7 = *(long *)(&UNK_000074d0 + lVar3);
  uVar2 = *(uint *)(&UNK_000075fc + lVar3);
  uVar6 = func_0x0015184c(lVar3,&iStack_64,param_4 + uVar4,(long)param_5 - uVar4);
  if (0xffffffffffffff88 < uVar6) {
    return uVar6;
  }
  if (0xffffffffffefffff < uVar5) {
    return 0xffffffffffffffba;
  }
  if ((uVar5 == 0 || param_3 == 0) && 0 < iStack_64) {
    return 0xffffffffffffffba;
  }
  lVar1 = param_4 + uVar4 + uVar6;
  lVar8 = ((long)param_5 - uVar4) - uVar6;
  if (((uVar2 == 0) &&
      (0x1000000 < (uVar5 + (uVar9 & ((long)uVar9 >> 0x3f ^ 0xffffffffffffffffU))) - lVar7)) &&
     (8 < iStack_64)) {
    uVar2 = func_0x00151e60(*(undefined8 *)(lVar3 + 0x10),iStack_64);
    uVar2 = (uint)(6 < uVar2);
  }
  *(undefined4 *)(&UNK_000075fc + lVar3) = 0;
  if (uVar2 != 0) {
    uVar5 = func_0x00151ebc(lVar3,uVar5,param_3,lVar1,lVar8,iStack_64);
    return uVar5;
  }
  if (*(int *)(&UNK_000076a0 + lVar3) == 2) {
    uVar5 = func_0x00153f04();
    return uVar5;
  }
  uVar5 = func_0x00155264(lVar3,uVar5,param_3,lVar1,lVar8,iStack_64);
  return uVar5;
}

