
void FUN_002792d4(code *param_1,undefined8 param_2,long param_3,undefined8 param_4)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined1 *puVar4;
  long *extraout_x8;
  long lVar5;
  long *unaff_x19;
  undefined1 auVar6 [16];
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000010;
  undefined1 uStack0000000000000040;
  undefined1 auStack_2e0 [672];
  
  uStack0000000000000000 = param_2;
  uStack0000000000000010 = param_2;
  if (0x40 < *(ulong *)(param_3 + 8)) {
    func_0x007a28b0(*(ulong *)(param_3 + 8),0x40,&UNK_009cd2b8);
LAB_00279374:
    puVar4 = &uStack0000000000000040;
    auVar6 = func_0x007a2810(&UNK_0082e030,0x1c,puVar4,&UNK_009ccdc0,&UNK_009cd2d0);
    func_0x002dd670(auStack_2e0);
    uVar3 = func_0x00273ea8(auVar6._0_8_ + 0x28);
    iVar1 = func_0x002c18e4(auStack_2e0,auVar6._8_8_,puVar4,uVar3,0);
    lVar5 = 0;
    if (iVar1 == 1) {
      _memcpy(extraout_x8 + 1,auStack_2e0,0x2a0);
      lVar5 = auVar6._0_8_;
    }
    *extraout_x8 = lVar5;
    return;
  }
  uVar2 = (*param_1)(param_4);
  if ((uVar2 & 1) == 0) {
    func_0x002dd670(&uStack0000000000000040);
    func_0x00273ea8(param_3 + 0x28);
    iVar1 = func_0x002c18e4(&uStack0000000000000040);
    if (iVar1 != 1) goto LAB_00279374;
    _memcpy(unaff_x19 + 1,&uStack0000000000000040,0x2a0);
  }
  else {
    param_3 = 0;
  }
  *unaff_x19 = param_3;
  return;
}

