
void FUN_00471338(long param_1,undefined8 param_2,uint param_3)

{
  undefined1 uVar1;
  uint in_w9;
  
  uVar1 = 0;
  if (in_w9 != 0) {
    uVar1 = (undefined1)(((uint)*(byte *)(param_1 + 5) | (param_3 & 0xff) << 8) / in_w9);
  }
  *(undefined1 *)(param_1 + 5) = uVar1;
  return;
}

