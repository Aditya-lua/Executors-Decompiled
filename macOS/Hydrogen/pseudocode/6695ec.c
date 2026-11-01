
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

long * FUN_006695ec(void)

{
  long lVar1;
  bool bVar2;
  undefined8 uVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  long *plVar7;
  ulong uVar8;
  long lVar9;
  long *plVar10;
  undefined1 auVar11 [16];
  undefined1 uStack0000000000000008;
  long lStack_58;
  long *plStack_50;
  long *plStack_48;
  long lStack_40;
  long *plStack_38;
  
  uVar3 = __Unwind_Resume();
  func_0x0062069c(&uStack0000000000000008);
  auVar11 = __Unwind_Resume(uVar3);
  uVar8 = auVar11._8_8_;
  plVar4 = auVar11._0_8_;
  lVar9 = plVar4[1];
  lVar5 = lVar9 - *plVar4 >> 5;
  bVar2 = uVar8 < (ulong)(lVar5 * -0x3333333333333333);
  uVar6 = uVar8 + lVar5 * 0x3333333333333333;
  if (bVar2 || uVar6 == 0) {
    plVar10 = plVar4;
    if (bVar2) {
      lVar5 = *plVar4 + uVar8 * 0xa0;
      while (lVar9 != lVar5) {
        *(undefined **)(lVar9 + -0x30) = &UNK_009f5d60;
        lVar1 = *(long *)(lVar9 + -0x10);
        uVar6 = *(ulong *)(lVar9 + -0x20);
        if (*(ulong *)(lVar9 + -0x18) <= *(ulong *)(lVar9 + -0x20)) {
          uVar6 = *(ulong *)(lVar9 + -0x18);
        }
        if (lVar1 != 0) {
          if (uVar6 != 0) {
            do {
              *(undefined8 *)(lVar1 + -8 + uVar6 * 8) = 0;
              uVar6 = uVar6 - 1;
            } while (uVar6 != 0);
          }
          func_0x00611644();
        }
        lVar9 = lVar9 + -0xa0;
        plVar10 = (long *)func_0x0064f6d0(lVar9);
      }
      plVar4[1] = lVar5;
    }
    return plVar10;
  }
  plVar7 = plVar4 + 2;
  plVar10 = (long *)plVar4[1];
  if (uVar6 <= (ulong)((*plVar7 - (long)plVar10 >> 5) * -0x3333333333333333)) {
    if (uVar6 == 0) {
      plVar4[1] = (long)plVar10;
      return plVar4;
    }
    goto code_r0x0066a134;
  }
  lVar9 = (long)plVar10 - *plVar4 >> 5;
  plVar10 = (long *)(lVar9 * -0x3333333333333333);
  uVar6 = (long)plVar10 + uVar6;
  if (uVar6 < 0x19999999999999a) {
    lVar5 = *plVar7 - *plVar4 >> 5;
    uVar8 = lVar5 * -0x6666666666666666;
    if (uVar8 <= uVar6) {
      uVar8 = uVar6;
    }
    if (0xcccccccccccccb < (ulong)(lVar5 * -0x3333333333333333)) {
      uVar8 = 0x199999999999999;
    }
    plStack_38 = plVar7;
    if (uVar8 == 0) {
      lStack_58 = 0;
    }
    else {
      if (0x199999999999999 < uVar8) goto LAB_0066a0f8;
      lStack_58 = __Znwm(uVar8 * 0xa0);
    }
    plVar10 = (long *)(lStack_58 + lVar9 * 0x20);
    lStack_40 = lStack_58 + uVar8 * 0xa0;
    plStack_50 = plVar10;
    plStack_48 = plVar10;
  }
  else {
    func_0x00017f90(plVar4);
LAB_0066a0f8:
    uVar3 = func_0x00017514();
    func_0x006514b4(&lStack_58);
    __Unwind_Resume(uVar3);
    func_0x0001753c();
    plVar4[1] = (long)plVar10;
    uVar3 = __Unwind_Resume();
    plStack_48 = plVar10;
    func_0x006514b4(&lStack_58);
    plVar10 = (long *)__Unwind_Resume(uVar3);
  }
code_r0x0066a134:
  *plVar10 = (long)&UNK_00a09a40;
  func_0x005fdd18(plVar10 + 1);
  func_0x005fdd18(plVar10 + 7);
  *(undefined1 *)(plVar10 + 0xd) = 1;
  func_0x005fdd18(plVar10 + 0xe);
  return plVar10;
}

