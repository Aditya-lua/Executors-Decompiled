
void FUN_0018dc88(undefined8 param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  undefined1 auVar2 [16];
  char *pcStack_18;
  
  func_0x00187bd4(param_1,param_2,8);
  auVar2 = __Unwind_Resume();
  puVar1 = auVar2._8_8_;
  if (*(char *)*auVar2._0_8_ == '\x01') {
    pcStack_18 = (char *)*auVar2._0_8_ + 1;
    func_0x004699b0(puVar1,&UNK_008151ac,4,&pcStack_18,&UNK_009c0740);
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(puVar1[1] + 0x18))(*puVar1,&UNK_008151a8,4);
  return;
}

