
void FUN_00195170(long param_1)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  long lVar4;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long lVar5;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  
  if (unaff_x22 == param_1) {
    func_0x0019275c(&uStack0000000000000008,&UNK_009c1608);
  }
  puVar1 = (undefined8 *)(in_stack_00000010 + unaff_x22 * 0x10);
  *puVar1 = unaff_x20;
  puVar1[1] = unaff_x21;
  in_stack_00000018 = unaff_x22 + 1;
  uVar3 = func_0x0018e2ec(in_stack_00000010);
  uStack0000000000000020 = 0;
  iVar2 = _SecItemCopyMatching(uVar3,&uStack0000000000000020);
  if (iVar2 == 0) {
    func_0x00195b20();
    _CFRelease(uVar3);
    lVar4 = in_stack_00000010;
    for (lVar5 = in_stack_00000018; lVar5 != 0; lVar5 = lVar5 + -1) {
      func_0x0019fb28(lVar4);
      func_0x0019e6a4(lVar4 + 8);
      lVar4 = lVar4 + 0x10;
    }
  }
  else {
    *(int *)(unaff_x19 + 1) = iVar2;
    *unaff_x19 = 0x8000000000000000;
    _CFRelease(uVar3);
    lVar4 = in_stack_00000010;
    for (lVar5 = in_stack_00000018; lVar5 != 0; lVar5 = lVar5 + -1) {
      func_0x0019fb28(lVar4);
      func_0x0019e6a4(lVar4 + 8);
      lVar4 = lVar4 + 0x10;
    }
  }
  if (uStack0000000000000008 != 0) {
    func_0x00187bd4(in_stack_00000010,uStack0000000000000008 << 4,8);
  }
  return;
}

