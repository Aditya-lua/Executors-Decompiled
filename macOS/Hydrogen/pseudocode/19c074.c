
void FUN_0019c074(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  undefined1 auVar2 [16];
  
  auVar2 = func_0x007a11c0();
  lVar1 = auVar2._0_8_;
  if ((*(ulong *)(lVar1 + 0x20) | 2) == 2) {
    *(long *)(lVar1 + 0x20) = auVar2._8_8_;
    *(undefined8 *)(lVar1 + 0x28) = param_3;
    return;
  }
  _CFRelease(*(undefined8 *)(lVar1 + 0x28));
  *(long *)(lVar1 + 0x20) = auVar2._8_8_;
  *(undefined8 *)(lVar1 + 0x28) = param_3;
  return;
}

