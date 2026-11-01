
void FUN_001c9928(void)

{
  long lVar1;
  long lVar2;
  bool bVar3;
  undefined8 uVar4;
  long lVar5;
  undefined1 uStack0000000000000040;
  long in_stack_00000080;
  undefined8 in_stack_00000088;
  
  uVar4 = __Unwind_Resume();
  func_0x001be890();
  uVar4 = __Unwind_Resume(uVar4);
  if (in_stack_00000080 != 0) {
    func_0x00187bd4(in_stack_00000088,in_stack_00000080,1);
  }
  func_0x001be890(&uStack0000000000000040);
  func_0x001be890();
  lVar5 = __Unwind_Resume(uVar4);
  bVar3 = *(char *)(lVar5 + 0x18) == '\0';
  lVar1 = 0x30;
  if (bVar3) {
    lVar1 = 0x20;
  }
  lVar2 = 0x38;
  if (bVar3) {
    lVar2 = 0x28;
  }
                    /* WARNING: Could not recover jumptable at 0x001c99a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)(lVar5 + lVar2) + 0x40))(*(undefined8 *)(lVar5 + lVar1));
  return;
}

