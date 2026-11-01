
void FUN_005e6494(undefined8 *param_1,long param_2)

{
  undefined1 uStack0000000000000008;
  
  _uStack0000000000000008 = *(undefined8 *)*param_1;
  if ((*(uint *)(param_2 + 0x10) >> 0x19 & 1) == 0) {
    if ((*(uint *)(param_2 + 0x10) >> 0x1a & 1) == 0) {
      func_0x00476678();
    }
    else {
      func_0x00475878(&uStack0000000000000008);
    }
  }
  else {
    func_0x004757f8(&uStack0000000000000008);
  }
  return;
}

