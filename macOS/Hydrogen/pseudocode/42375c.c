
void FUN_0042375c(int param_1)

{
  undefined1 *puVar1;
  long lVar2;
  long *plVar3;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000040;
  
  if (param_1 != -1) {
    _close();
  }
  if (in_stack_00000040._4_4_ != -1) {
    _close();
  }
  if (in_stack_00000008 != -0x8000000000000000) {
    if (in_stack_00000018 != 0) {
      plVar3 = (long *)(in_stack_00000010 + 8);
      do {
        puVar1 = (undefined1 *)plVar3[-1];
        lVar2 = *plVar3;
        *puVar1 = 0;
        if (lVar2 != 0) {
          func_0x00187bd4(puVar1,lVar2,1);
        }
        plVar3 = plVar3 + 2;
        in_stack_00000018 = in_stack_00000018 + -1;
      } while (in_stack_00000018 != 0);
    }
    if (in_stack_00000008 != 0) {
      func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 4,8);
    }
    if (in_stack_00000020 != 0) {
      func_0x00187bd4(in_stack_00000028,in_stack_00000020 << 3,8);
    }
  }
  return;
}

