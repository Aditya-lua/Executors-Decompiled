
void FUN_00617b44(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 uVar3;
  uint unaff_w21;
  undefined1 auVar4 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined1 auStack_90 [24];
  undefined1 auStack_78 [24];
  undefined1 auStack_60 [24];
  undefined1 auStack_48 [24];
  
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
  }
  auVar4 = __Unwind_Resume();
  uVar2 = (**(code **)(*auVar4._0_8_ + 0x10))(auVar4._0_8_,param_3,PTR___ZTIi_009b0170);
  if ((uVar2 & 1) == 0) {
    uVar3 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(auStack_90,auVar4._8_8_);
    func_0x0003a638(auStack_78,auStack_90,": missing required parameter \'");
    func_0x0003a638(auStack_60,auStack_78,param_3);
    func_0x0003a638(auStack_48,auStack_60,"\'");
    func_0x0002703c(uVar3,auStack_48);
    ___cxa_throw(uVar3,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x617cb4);
    (*pcVar1)();
  }
  return;
}

