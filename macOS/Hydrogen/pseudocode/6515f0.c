
/* WARNING: Possible PIC construction at 0x006516e0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006516e4) */
/* WARNING: Removing unreachable block (ram,0x0065170c) */
/* WARNING: Removing unreachable block (ram,0x00651734) */
/* WARNING: Removing unreachable block (ram,0x0065174c) */
/* WARNING: Removing unreachable block (ram,0x00651754) */
/* WARNING: Removing unreachable block (ram,0x00651758) */
/* WARNING: Removing unreachable block (ram,0x0065175c) */
/* WARNING: Removing unreachable block (ram,0x00651768) */
/* WARNING: Removing unreachable block (ram,0x0065171c) */
/* WARNING: Removing unreachable block (ram,0x00651720) */
/* WARNING: Removing unreachable block (ram,0x0065176c) */
/* WARNING: Removing unreachable block (ram,0x00651774) */
/* WARNING: Removing unreachable block (ram,0x00651778) */

undefined8 * FUN_006515f0(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  undefined1 auVar7 [16];
  long lStack_58;
  long lStack_50;
  long lStack_48;
  long lStack_40;
  long *plStack_38;
  
  lVar5 = *(long *)(param_1 + 0x28);
  uVar3 = *(ulong *)(param_1 + 0x18);
  if (*(ulong *)(param_1 + 0x20) <= *(ulong *)(param_1 + 0x18)) {
    uVar3 = *(ulong *)(param_1 + 0x20);
  }
  if (lVar5 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar5 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume();
  auVar7 = func_0x0001753c();
  auVar7._0_8_ = auVar7._0_8_;
  lVar5 = auVar7._0_8_[1] - *auVar7._0_8_ >> 5;
  uVar3 = lVar5 * -0x3333333333333333 + 1;
  if (uVar3 < 0x19999999999999a) {
    plStack_38 = auVar7._0_8_ + 2;
    lVar4 = *plStack_38 - *auVar7._0_8_ >> 5;
    uVar6 = lVar4 * -0x6666666666666666;
    if (uVar6 <= uVar3) {
      uVar6 = uVar3;
    }
    if (0xcccccccccccccb < (ulong)(lVar4 * -0x3333333333333333)) {
      uVar6 = 0x199999999999999;
    }
    if (uVar6 == 0) {
      lStack_58 = 0;
    }
    else {
      if (0x199999999999999 < uVar6) goto code_r0x00651798;
      lStack_58 = __Znwm(uVar6 * 0xa0);
    }
    lStack_50 = lStack_58 + lVar5 * 0x20;
    auVar7._8_8_ = auVar7._8_8_;
    auVar7._0_8_ = lStack_50;
    lStack_40 = lStack_58 + uVar6 * 0xa0;
    lStack_48 = lStack_50;
  }
  else {
    func_0x00017f90(auVar7._0_8_);
code_r0x00651798:
    uVar1 = func_0x00017514();
    func_0x006514b4(&lStack_58);
    __Unwind_Resume(uVar1);
    auVar7 = func_0x0001753c();
  }
  lVar5 = auVar7._8_8_;
  puVar2 = auVar7._0_8_;
  *puVar2 = &UNK_00a09a40;
  func_0x005fe0b4(puVar2 + 1,lVar5 + 8);
  func_0x005fe0b4(puVar2 + 7,lVar5 + 0x38);
  *(undefined1 *)(puVar2 + 0xd) = *(undefined1 *)(lVar5 + 0x68);
  func_0x005fe0b4(puVar2 + 0xe,lVar5 + 0x70);
  return puVar2;
}

