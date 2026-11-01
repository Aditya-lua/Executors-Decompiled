
long * FUN_006a4be4(long *param_1,undefined8 param_2,code *param_3,ulong param_4)

{
  long *plVar1;
  code *pcVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000048;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  
  if ((char)param_1[2] == '\0') {
    func_0x005fdd18(&uStack0000000000000060);
    uVar3 = (**(code **)(*(long *)param_1[1] + 0x10))
                      ((long *)param_1[1],param_2,&UNK_009f5fc0,&uStack0000000000000060);
    if ((uVar3 & 1) == 0) {
      uVar4 = ___cxa_allocate_exception(0x28);
      func_0x0000a968();
      func_0x0003a638(&uStack0000000000000018);
      func_0x0003a638(&uStack0000000000000030,&uStack0000000000000018,param_2);
      func_0x0003a638(&uStack0000000000000048,&uStack0000000000000030,"\'");
      func_0x0002703c(uVar4,&uStack0000000000000048);
      ___cxa_throw(uVar4,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x6a4d2c);
      (*pcVar2)();
    }
    plVar1 = (long *)(*param_1 + ((long)param_4 >> 1));
    if ((param_4 & 1) != 0) {
      param_3 = *(code **)(*plVar1 + ((ulong)param_3 & 0xffffffff));
    }
    (*param_3)(plVar1,&uStack0000000000000060);
    uStack0000000000000060 = &UNK_009f5d60;
    uVar3 = in_stack_00000070;
    if (in_stack_00000078 <= in_stack_00000070) {
      uVar3 = in_stack_00000078;
    }
    if (in_stack_00000080 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(in_stack_00000080 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
  }
  return param_1;
}

