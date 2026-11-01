
void FUN_004ab5cc(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  func_0x005ca790(&uStack0000000000000008);
  lVar2 = in_stack_00000010;
  lVar1 = uStack0000000000000008;
  lVar5 = in_stack_00000018 * 8;
  for (lVar4 = 0; lVar5 != lVar4; lVar4 = lVar4 + 8) {
    uVar3 = *(undefined8 *)(lVar2 + lVar4);
    func_0x004ad4c8(param_2,uVar3);
    func_0x004aceb8(uVar3,param_2);
  }
  if (lVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar1 << 3,8);
  return;
}

