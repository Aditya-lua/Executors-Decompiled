
void FUN_0018ec7c(uint *param_1,undefined8 *param_2)

{
  uint uVar1;
  undefined1 uStack0000000000000008;
  
  _uStack0000000000000008 = 0;
  uVar1 = _CMSDecoderGetNumSigners(*param_2,&uStack0000000000000008);
  if (uVar1 == 0) {
    *(undefined8 *)(param_1 + 2) = _uStack0000000000000008;
  }
  else {
    param_1[1] = uVar1;
  }
  *param_1 = (uint)(uVar1 != 0);
  return;
}

