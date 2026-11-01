
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0004025c(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined1 auVar3 [16];
  long lStack0000000000000000;
  long *in_stack_00000008;
  
  lStack0000000000000000 = param_1 + 0x10;
  if (in_stack_00000008 != (long *)0x0) {
    (**(code **)(*in_stack_00000008 + 8))();
  }
  func_0x00040478();
  __Unwind_Resume();
  uVar1 = func_0x0001753c();
  __ZdlPv();
  auVar3 = __Unwind_Resume(uVar1);
  puVar2 = (undefined8 *)func_0x0066a6b0(auVar3._0_8_,0);
  *puVar2 = &UNK_009f8320;
  puVar2[1] = &UNK_009f84c8;
  puVar2[8] = 0;
  puVar2[9] = 0;
  puVar2[7] = 0xffffffffffffffff;
  puVar2[0xb] = 0xffffffffffffffff;
  puVar2[0xd] = 0;
  puVar2[0xc] = 0;
  puVar2[0xf] = 0;
  puVar2[0xe] = 0;
  (*_UNK_009f8490)(puVar2,auVar3._8_8_);
  return auVar3._0_8_;
}

