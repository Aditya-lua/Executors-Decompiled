
void FUN_00552d70(undefined8 param_1,undefined8 param_2,long param_3)

{
  long *plVar1;
  ulong uVar2;
  long lVar3;
  undefined1 auVar4 [16];
  ulong in_stack_00000010;
  undefined8 uStack0000000000000050;
  undefined1 uStack0000000000000068;
  undefined1 uStack0000000000000080;
  undefined1 uStack00000000000000c8;
  
  func_0x0053abe0();
  func_0x00549a94(&uStack00000000000000c8);
  func_0x00548358(&uStack0000000000000080);
  if (in_stack_00000010 < 3) {
    if (uStack0000000000000050 != 2) {
      func_0x005ec378(&uStack0000000000000050,&uStack0000000000000068);
    }
    func_0x005492bc(&uStack0000000000000050);
  }
  __Unwind_Resume();
  auVar4 = func_0x007a2668();
  plVar1 = auVar4._0_8_;
  uVar2 = param_3 - auVar4._8_8_;
  lVar3 = plVar1[2];
  if ((ulong)(*plVar1 - lVar3) < uVar2) {
    func_0x007abb04(plVar1,lVar3,uVar2,1,1);
    lVar3 = plVar1[2];
  }
  _memcpy(plVar1[1] + lVar3,auVar4._8_8_,uVar2);
  plVar1[2] = lVar3 + uVar2;
  return;
}

