
void FUN_00431680(void)

{
  uint uVar1;
  int iVar2;
  undefined8 *puVar3;
  uint *puVar4;
  long *plVar5;
  undefined1 auVar6 [16];
  long lStack_280;
  undefined8 uStack_278;
  ulong uStack_270;
  undefined1 auStack_268 [384];
  int aiStack_e8 [2];
  undefined8 uStack_e0;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  func_0x003f67e4();
  __Unwind_Resume();
  auVar6 = func_0x007a2668();
  plVar5 = auVar6._8_8_;
  puVar3 = auVar6._0_8_;
  func_0x004261e4(&lStack_280,*(undefined8 *)(*plVar5 + 0x18),*(undefined8 *)(*plVar5 + 0x20),
                  (long)plVar5 + 0x1d,*(undefined2 *)((long)plVar5 + 0x1a));
  if (uStack_270 < 0x180) {
    _memcpy(auStack_268,uStack_278,uStack_270);
    auStack_268[uStack_270] = 0;
    func_0x00462a54(aiStack_e8,auStack_268,uStack_270 + 1);
    if (aiStack_e8[0] == 1) {
      *puVar3 = 1;
      puVar3[1] = &UNK_009dae48;
    }
    else {
      uStack_58 = 0;
      uStack_60 = 0;
      uStack_48 = 0;
      uStack_50 = 0;
      uStack_78 = 0;
      uStack_80 = 0;
      uStack_68 = 0;
      uStack_70 = 0;
      uStack_98 = 0;
      uStack_a0 = 0;
      uStack_88 = 0;
      uStack_90 = 0;
      uStack_b8 = 0;
      uStack_c0 = 0;
      uStack_a8 = 0;
      uStack_b0 = 0;
      uStack_c8 = 0;
      uStack_d0 = 0;
      iVar2 = _lstat(uStack_e0,&uStack_d0);
      if (iVar2 == -1) {
        puVar4 = (uint *)___error();
        uVar1 = *puVar4;
        *puVar3 = 1;
        puVar3[1] = (ulong)uVar1 << 0x20 | 2;
      }
      else {
        puVar3[0xc] = uStack_78;
        puVar3[0xb] = uStack_80;
        puVar3[0xe] = uStack_68;
        puVar3[0xd] = uStack_70;
        puVar3[0x10] = uStack_58;
        puVar3[0xf] = uStack_60;
        puVar3[0x12] = uStack_48;
        puVar3[0x11] = uStack_50;
        puVar3[4] = uStack_b8;
        puVar3[3] = uStack_c0;
        puVar3[6] = uStack_a8;
        puVar3[5] = uStack_b0;
        puVar3[8] = uStack_98;
        puVar3[7] = uStack_a0;
        puVar3[10] = uStack_88;
        puVar3[9] = uStack_90;
        puVar3[2] = uStack_c8;
        puVar3[1] = uStack_d0;
        *puVar3 = 0;
      }
    }
  }
  else {
    func_0x007a0b8c(puVar3,uStack_278,uStack_270,&DAT_003f4ca4);
  }
  if (lStack_280 != 0) {
    func_0x00187bd4(uStack_278,lStack_280,1);
  }
  return;
}

