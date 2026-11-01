
void FUN_004b3e48(ulong param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  
  if (1 < param_1) {
    param_1 = 2;
  }
  if (param_1 != 0) {
    if (param_1 == 2) {
      func_0x005cea94(&uStack0000000000000008);
      lVar1 = in_stack_00000010;
      lVar3 = uStack0000000000000008;
      lVar5 = in_stack_00000018 * 8;
      for (lVar4 = 0; lVar5 != lVar4; lVar4 = lVar4 + 8) {
        uVar2 = *(undefined8 *)(lVar1 + lVar4);
        func_0x004b27b8();
        func_0x004b23e4(uVar2);
      }
    }
    else {
      func_0x005ce834(&uStack0000000000000008,param_2 + 0x10);
      lVar1 = in_stack_00000010;
      lVar3 = uStack0000000000000008;
      lVar5 = in_stack_00000018 * 8;
      for (lVar4 = 0; lVar5 != lVar4; lVar4 = lVar4 + 8) {
        uVar2 = *(undefined8 *)(lVar1 + lVar4);
        func_0x004b27b8();
        func_0x004b23e4(uVar2);
      }
    }
    if (lVar3 != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar1,lVar3 << 3,8);
      return;
    }
  }
  return;
}

