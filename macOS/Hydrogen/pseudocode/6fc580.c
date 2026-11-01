
void FUN_006fc580(long param_1)

{
  long lVar1;
  long in_x9;
  long unaff_x19;
  
  for (; in_x9 != param_1; param_1 = param_1 + 0x20) {
    lVar1 = *(long *)(unaff_x19 + 0x20) + param_1;
    *(undefined4 *)(lVar1 + 0xc) = 0;
    *(undefined4 *)(lVar1 + 0x1c) = 0;
  }
  *(undefined1 *)(unaff_x19 + 3) = 0xff;
  return;
}

