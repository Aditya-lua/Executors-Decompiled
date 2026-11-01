
void FUN_004b4a00(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uStack0000000000000010;
  long *in_stack_00000018;
  undefined8 in_stack_00000028;
  
  func_0x005ec378(param_2,param_1 + 0x18);
  lVar1 = uStack0000000000000010;
  if ((uStack0000000000000010 != 2) &&
     (func_0x005ec3ac(&uStack0000000000000010,in_stack_00000028), lVar1 != 0)) {
    lVar1 = *in_stack_00000018;
    *in_stack_00000018 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x005e80f0((ulong)&uStack0000000000000010 | 8);
    }
  }
  return;
}

