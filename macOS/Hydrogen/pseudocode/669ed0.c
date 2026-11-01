
/* WARNING: Possible PIC construction at 0x0066a044: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00669ff0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0066a048) */
/* WARNING: Removing unreachable block (ram,0x0066a054) */
/* WARNING: Removing unreachable block (ram,0x0066a070) */
/* WARNING: Removing unreachable block (ram,0x0066a098) */
/* WARNING: Removing unreachable block (ram,0x0066a0b0) */
/* WARNING: Removing unreachable block (ram,0x0066a0b8) */
/* WARNING: Removing unreachable block (ram,0x0066a0bc) */
/* WARNING: Removing unreachable block (ram,0x0066a0c0) */
/* WARNING: Removing unreachable block (ram,0x0066a0cc) */
/* WARNING: Removing unreachable block (ram,0x0066a080) */
/* WARNING: Removing unreachable block (ram,0x0066a084) */
/* WARNING: Removing unreachable block (ram,0x0066a0d0) */
/* WARNING: Removing unreachable block (ram,0x0066a0d8) */
/* WARNING: Removing unreachable block (ram,0x00669ff4) */
/* WARNING: Removing unreachable block (ram,0x0066a000) */

long * FUN_00669ed0(void)

{
  undefined8 uVar1;
  long *plVar2;
  ulong uVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  undefined8 *unaff_x20;
  long *plVar8;
  undefined1 auVar9 [16];
  long lStack_58;
  long *plStack_50;
  long *plStack_48;
  long lStack_40;
  long *plStack_38;
  
  uVar1 = func_0x0001753c();
  *unaff_x20 = &UNK_009f5d60;
  lVar7 = unaff_x20[4];
  uVar3 = unaff_x20[2];
  if ((ulong)unaff_x20[3] <= (ulong)unaff_x20[2]) {
    uVar3 = unaff_x20[3];
  }
  if (lVar7 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar7 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume(uVar1);
  auVar9 = func_0x0001753c();
  uVar3 = auVar9._8_8_;
  plVar2 = auVar9._0_8_;
  plVar4 = plVar2 + 2;
  plVar8 = (long *)plVar2[1];
  if (uVar3 <= (ulong)((*plVar4 - (long)plVar8 >> 5) * -0x3333333333333333)) {
    if (uVar3 == 0) {
      plVar2[1] = (long)plVar8;
      return plVar2;
    }
    goto code_r0x0066a134;
  }
  lVar7 = (long)plVar8 - *plVar2 >> 5;
  plVar8 = (long *)(lVar7 * -0x3333333333333333);
  uVar3 = (long)plVar8 + uVar3;
  if (uVar3 < 0x19999999999999a) {
    lVar5 = *plVar4 - *plVar2 >> 5;
    uVar6 = lVar5 * -0x6666666666666666;
    if (uVar6 <= uVar3) {
      uVar6 = uVar3;
    }
    if (0xcccccccccccccb < (ulong)(lVar5 * -0x3333333333333333)) {
      uVar6 = 0x199999999999999;
    }
    plStack_38 = plVar4;
    if (uVar6 == 0) {
      lStack_58 = 0;
    }
    else {
      if (0x199999999999999 < uVar6) goto LAB_0066a0f8;
      lStack_58 = __Znwm(uVar6 * 0xa0);
    }
    plVar8 = (long *)(lStack_58 + lVar7 * 0x20);
    lStack_40 = lStack_58 + uVar6 * 0xa0;
    plStack_50 = plVar8;
    plStack_48 = plVar8;
  }
  else {
    func_0x00017f90(plVar2);
LAB_0066a0f8:
    uVar1 = func_0x00017514();
    func_0x006514b4(&lStack_58);
    __Unwind_Resume(uVar1);
    func_0x0001753c();
    plVar2[1] = (long)plVar8;
    uVar1 = __Unwind_Resume();
    plStack_48 = plVar8;
    func_0x006514b4(&lStack_58);
    plVar8 = (long *)__Unwind_Resume(uVar1);
  }
code_r0x0066a134:
  *plVar8 = (long)&UNK_00a09a40;
  func_0x005fdd18(plVar8 + 1);
  func_0x005fdd18(plVar8 + 7);
  *(undefined1 *)(plVar8 + 0xd) = 1;
  func_0x005fdd18(plVar8 + 0xe);
  return plVar8;
}

