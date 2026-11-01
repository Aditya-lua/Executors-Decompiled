
void FUN_0051a884(undefined8 *param_1,undefined8 param_2,byte param_3)

{
  undefined1 uVar1;
  undefined8 uStack_28;
  
  if (param_3 < 2) {
    if (param_3 == 0) {
      uStack_28 = param_2;
      uVar1 = func_0x00535bb4(&uStack_28,&UNK_009e9f60);
      FUN_0051a884(param_1,uStack_28,uVar1);
      return;
    }
  }
  else if (param_3 != 2) {
    *param_1 = param_2;
    *(undefined4 *)(param_1 + 1) = 0;
    *(undefined1 *)((long)param_1 + 0xc) = 0;
    *(undefined1 *)(param_1 + 2) = 0xc;
    return;
  }
  _isatty(2);
  *param_1 = param_2;
  *(undefined1 *)((long)param_1 + 0xc) = 8;
  return;
}

