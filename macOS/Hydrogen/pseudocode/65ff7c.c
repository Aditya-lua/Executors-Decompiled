
long * FUN_0065ff7c(undefined8 param_1,undefined8 param_2,code *param_3,ulong param_4)

{
  long *plVar1;
  code *pcVar2;
  long *plVar3;
  ulong uVar4;
  undefined8 uVar5;
  int in_w8;
  undefined1 auVar6 [16];
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined1 auStack_c0 [24];
  undefined1 auStack_a8 [24];
  undefined1 auStack_90 [24];
  undefined1 auStack_78 [24];
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  while (-1 < in_w8) {
    __Unwind_Resume();
    __ZdlPv(in_stack_00000020);
    in_w8 = (int)in_stack_00000018._7_1_;
  }
  __ZdlPv(in_stack_00000008);
  auVar6 = __Unwind_Resume();
  plVar3 = auVar6._0_8_;
  if ((char)plVar3[2] == '\0') {
    func_0x005fdd18(apuStack_60);
    uVar4 = (**(code **)(*(long *)plVar3[1] + 0x10))
                      ((long *)plVar3[1],auVar6._8_8_,&UNK_009f5fc0,apuStack_60);
    if ((uVar4 & 1) == 0) {
      uVar5 = ___cxa_allocate_exception(0x28);
      func_0x0000a968(auStack_c0,&UNK_008be795);
      func_0x0003a638(auStack_a8,auStack_c0,": Missing required parameter \'");
      func_0x0003a638(auStack_90,auStack_a8,auVar6._8_8_);
      func_0x0003a638(auStack_78,auStack_90,"\'");
      func_0x0002703c(uVar5,auStack_78);
      ___cxa_throw(uVar5,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x6600f0);
      (*pcVar2)();
    }
    plVar1 = (long *)(*plVar3 + ((long)param_4 >> 1));
    if ((param_4 & 1) != 0) {
      param_3 = *(code **)(*plVar1 + ((ulong)param_3 & 0xffffffff));
    }
    (*param_3)(plVar1,apuStack_60);
    apuStack_60[0] = &UNK_009f5d60;
    if (uStack_48 <= uStack_50) {
      uStack_50 = uStack_48;
    }
    if (lStack_40 != 0) {
      if (uStack_50 != 0) {
        do {
          *(undefined8 *)(lStack_40 + -8 + uStack_50 * 8) = 0;
          uStack_50 = uStack_50 - 1;
        } while (uStack_50 != 0);
      }
      func_0x00611644();
    }
  }
  return plVar3;
}

