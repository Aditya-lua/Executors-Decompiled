
void FUN_0042ed50(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 in_x9;
  undefined8 *unaff_x20;
  long lVar5;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined1 auVar6 [16];
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined1 auStack_48 [16];
  long lStack_38;
  undefined8 uStack_30;
  long lStack_28;
  undefined8 *puStack_20;
  
  uStack0000000000000020 = in_x9;
  while( true ) {
    uStack0000000000000028 = uStack0000000000000020;
    uStack0000000000000020 = param_1;
    func_0x00465960();
    puVar1 = unaff_x20 + 6;
    unaff_x21 = unaff_x21 + -0x30;
    if (unaff_x21 == 0) {
      func_0x00465c80();
      return;
    }
    func_0x0046b8d0(&uStack0000000000000010,unaff_x20[2],unaff_x20[3]);
    uVar3 = uStack0000000000000020;
    uVar2 = in_stack_00000018;
    if ((int)uStack0000000000000010 == 1) break;
    func_0x0046b8d0(&uStack0000000000000010,unaff_x20[5],*puVar1);
    param_1 = in_stack_00000018;
    unaff_x22 = uVar2;
    if ((int)uStack0000000000000010 == 1) goto code_r0x0042ed9c;
    uStack0000000000000010 = uVar2;
    in_stack_00000018 = uVar3;
    unaff_x20 = puVar1;
  }
  func_0x007a23bc(&UNK_009db6d8);
code_r0x0042ed9c:
  auVar6 = func_0x007a23bc(&UNK_009db6c0);
  uStack_30 = unaff_x22;
  lStack_28 = unaff_x21;
  puStack_20 = puVar1;
  func_0x0046a8c4(auStack_48,auVar6._8_8_);
  lVar5 = *(long *)(auVar6._0_8_ + 0x18);
  for (lVar4 = *(long *)(auVar6._0_8_ + 8); lVar5 != lVar4; lVar4 = lVar4 + 0x30) {
    lStack_38 = lVar4;
    func_0x00465960(auStack_48,&lStack_38,&UNK_009d9238);
  }
  func_0x00465c80(auStack_48);
  return;
}

