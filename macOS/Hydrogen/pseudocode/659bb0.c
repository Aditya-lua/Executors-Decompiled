
void FUN_00659bb0(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  undefined1 auVar10 [16];
  undefined *apuStack_c0 [2];
  ulong uStack_b0;
  ulong uStack_a8;
  long lStack_a0;
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  
  func_0x00623644();
  uVar3 = __Unwind_Resume();
  func_0x00623644();
  uVar3 = __Unwind_Resume(uVar3);
  func_0x00623644();
  auVar10 = __Unwind_Resume(uVar3);
  lVar4 = auVar10._0_8_;
  if (1 < param_4) {
    func_0x005fe0b4(apuStack_c0,lVar4);
    func_0x005fe0b4(apuStack_90,lVar4 + 0x30);
    uVar7 = 0;
    lVar9 = lVar4;
    do {
      lVar1 = uVar7 + 1;
      lVar8 = lVar9 + lVar1 * 0x60;
      lVar6 = uVar7 * 2;
      uVar7 = uVar7 << 1 | 1;
      uVar2 = lVar6 + 2;
      if ((long)uVar2 < param_4) {
        uVar5 = func_0x00609ec8(lVar9 + lVar1 * 0x60 + 0x30,lVar8 + 0x90);
        lVar8 = lVar8 + (uVar5 >> 0x1f & 1) * 0x60;
        if (-1 < (int)uVar5) {
          uVar2 = uVar7;
        }
        uVar7 = uVar2;
      }
      func_0x005ffccc(lVar9,lVar8);
      lVar1 = lVar8 + 0x30;
      func_0x005ffccc(lVar9 + 0x30,lVar1);
      lVar9 = lVar8;
    } while ((long)uVar7 <= (long)(param_4 - 2U >> 1));
    lVar9 = auVar10._8_8_ + -0x60;
    if (lVar8 == lVar9) {
      func_0x005ffccc(lVar8,apuStack_c0);
      func_0x005ffccc(lVar1,apuStack_90);
    }
    else {
      func_0x005ffccc(lVar8,lVar9);
      lVar6 = auVar10._8_8_ + -0x30;
      func_0x005ffccc(lVar1,lVar6);
      func_0x005ffccc(lVar9,apuStack_c0);
      func_0x005ffccc(lVar6,apuStack_90);
      func_0x00659e44(lVar4,lVar8 + 0x60,param_3,((lVar8 + 0x60) - lVar4 >> 5) * -0x5555555555555555
                     );
    }
    apuStack_90[0] = &UNK_009f5d60;
    if (uStack_78 <= uStack_80) {
      uStack_80 = uStack_78;
    }
    if (lStack_70 != 0) {
      if (uStack_80 != 0) {
        do {
          *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
          uStack_80 = uStack_80 - 1;
        } while (uStack_80 != 0);
      }
      func_0x00611644();
    }
    apuStack_c0[0] = &UNK_009f5d60;
    if (uStack_a8 <= uStack_b0) {
      uStack_b0 = uStack_a8;
    }
    if (lStack_a0 != 0) {
      if (uStack_b0 != 0) {
        do {
          *(undefined8 *)(lStack_a0 + -8 + uStack_b0 * 8) = 0;
          uStack_b0 = uStack_b0 - 1;
        } while (uStack_b0 != 0);
      }
      func_0x00611644();
    }
  }
  return;
}

