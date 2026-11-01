
void FUN_005daf28(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 extraout_x8;
  long unaff_x22;
  undefined8 uStack_c0;
  long lStack_b8;
  long lStack_b0;
  undefined8 uStack_a8;
  long lStack_a0;
  long lStack_98;
  undefined8 uStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  undefined8 uStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  undefined8 uStack_50;
  long lStack_48;
  
  uVar4 = __Unwind_Resume();
  if (unaff_x22 != 0) {
    func_0x00187bd4();
  }
  lVar5 = __Unwind_Resume(uVar4);
  func_0x005c34dc(&uStack_a8,lVar5 + 0x98);
  lVar3 = lStack_98;
  lVar2 = lStack_a0;
  uVar4 = uStack_a8;
  func_0x005c34dc(&uStack_a8,lVar5 + 0x40);
  lVar1 = lStack_98 * 8;
  func_0x005c34dc(&uStack_c0,lVar5);
  lStack_98 = lVar2;
  uStack_90 = uVar4;
  lStack_78 = lStack_a0;
  lStack_80 = lStack_a0;
  lStack_48 = lStack_b8 + lStack_b0 * 8;
  uStack_70 = uStack_a8;
  uStack_a8 = 1;
  lStack_60 = lStack_b8;
  lStack_58 = lStack_b8;
  uStack_50 = uStack_c0;
  lStack_88 = lVar2 + lVar3 * 8;
  lStack_68 = lStack_a0 + lVar1;
  func_0x005a0704(extraout_x8,&uStack_a8,&UNK_009f30a0);
  return;
}

