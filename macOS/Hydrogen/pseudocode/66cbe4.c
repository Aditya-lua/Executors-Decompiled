
void FUN_0066cbe4(undefined8 param_1,long param_2,undefined4 *param_3,undefined1 param_4)

{
  long *plVar1;
  undefined8 uStack0000000000000008;
  long *in_stack_00000010;
  undefined1 in_stack_00000018;
  
  func_0x00611398(&uStack0000000000000008);
  plVar1 = (long *)__Znwm(0x28);
  *(undefined1 *)(plVar1 + 2) = param_4;
  *(undefined1 *)((long)plVar1 + 0x11) = 0;
  *plVar1 = (long)&UNK_00a0f028;
  plVar1[1] = param_2;
  *(undefined4 *)(plVar1 + 4) = *param_3;
  plVar1[3] = (long)in_stack_00000010;
  in_stack_00000010 = plVar1;
  in_stack_00000018 = param_4;
  func_0x00611428(param_1,&uStack0000000000000008);
  uStack0000000000000008 = &UNK_009f6820;
  if (in_stack_00000010 != (long *)0x0) {
    (**(code **)(*in_stack_00000010 + 8))();
  }
  return;
}

