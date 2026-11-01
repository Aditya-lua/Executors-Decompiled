
void FUN_004d58ec(void)

{
  undefined4 *extraout_x8;
  long *plVar1;
  undefined1 auVar2 [12];
  
  auVar2 = func_0x007a2668();
  if (((ulong)auVar2._8_4_ < *(ulong *)(auVar2._0_8_ + 0x28)) &&
     (plVar1 = (long *)(*(long *)(auVar2._0_8_ + 0x20) + (ulong)auVar2._8_4_ * 0x30),
     *plVar1 != -0x8000000000000000)) {
    *(long *)(extraout_x8 + 1) = plVar1[5];
    *extraout_x8 = 1;
    return;
  }
  *extraout_x8 = 0;
  return;
}

