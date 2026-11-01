
long * FUN_00620f7c(long param_1,long *param_2,ulong param_3)

{
  undefined8 uVar1;
  long *plVar2;
  long extraout_x1;
  ulong uVar3;
  ulong in_x9;
  long unaff_x20;
  long lVar4;
  long lVar5;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  
  if (param_1 * (in_x9 & 0xffff | 0x6db6db6db6db0000) < param_3) {
    if (0x249249249249249 < param_3) {
      uVar1 = func_0x00017f90(param_2);
      func_0x0064aa64(&uStack0000000000000008);
      plVar2 = (long *)__Unwind_Resume(uVar1);
      plVar2[6] = (long)&UNK_009f5d60;
      lVar4 = plVar2[10];
      uVar3 = plVar2[8];
      if ((ulong)plVar2[9] <= (ulong)plVar2[8]) {
        uVar3 = plVar2[9];
      }
      if (lVar4 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(lVar4 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      *plVar2 = (long)&UNK_009f5d60;
      lVar4 = plVar2[4];
      uVar3 = plVar2[2];
      if ((ulong)plVar2[3] <= (ulong)plVar2[2]) {
        uVar3 = plVar2[3];
      }
      if (lVar4 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(lVar4 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      return plVar2;
    }
    lVar4 = param_2[1];
    uStack0000000000000008 = __Znwm(param_3 * 0x70);
    in_stack_00000010 = uStack0000000000000008 + (lVar4 - unaff_x20);
    in_stack_00000020 = uStack0000000000000008 + param_3 * 0x70;
    in_stack_00000018 = in_stack_00000010;
    func_0x0064aa98();
    lVar4 = param_2[2];
    lVar5 = param_2[1];
    uStack0000000000000008 = *param_2;
    *param_2 = extraout_x1;
    param_2[2] = in_stack_00000020;
    param_2[1] = in_stack_00000018;
    in_stack_00000010 = uStack0000000000000008;
    in_stack_00000018 = lVar5;
    in_stack_00000020 = lVar4;
    func_0x0064ad04(&uStack0000000000000008,uStack0000000000000008);
    param_2 = (long *)0x0;
    if (uStack0000000000000008 != 0) {
      param_2 = (long *)__ZdlPv();
    }
  }
  return param_2;
}

