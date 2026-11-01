
void FUN_005949a0(long param_1,undefined8 param_2)

{
  long extraout_x8;
  undefined1 uStack0000000000000018;
  
  func_0x00187bd4(param_2,param_1 << 3,8);
  func_0x0059393c(&uStack0000000000000018);
  __Unwind_Resume();
  func_0x007a2668();
  func_0x0057ef94();
  *(undefined8 *)(extraout_x8 + 0x38) = 0;
  *(undefined8 *)(extraout_x8 + 0x30) = 0;
  *(undefined8 *)(extraout_x8 + 0x40) = 0xffffffffffffffff;
  return;
}

