
void FUN_002481a0(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 *extraout_x8;
  undefined8 uVar2;
  undefined8 in_stack_00000038;
  undefined8 uStack_f0;
  undefined4 uStack_e8;
  undefined2 uStack_38;
  
  func_0x00187bd4(in_stack_00000038,param_2,1);
  lVar1 = __Unwind_Resume(param_1);
  uVar2 = 0x800000000000001a;
  if ((*(byte *)(lVar1 + 0x331) & 1) == 0) {
    uStack_38 = 4;
    uStack_f0 = 0x8000000000000001;
    uStack_e8 = 0x10001;
    func_0x00248ae4(lVar1,&uStack_f0,*(char *)(lVar1 + 0x49) == '\x02');
    *(undefined1 *)(lVar1 + 0x335) = 1;
    *(undefined1 *)(extraout_x8 + 1) = 0x1b;
  }
  else {
    uVar2 = 0x8000000000000027;
  }
  *extraout_x8 = uVar2;
  return;
}

