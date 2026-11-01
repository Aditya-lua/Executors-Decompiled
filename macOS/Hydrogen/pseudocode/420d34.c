
void FUN_00420d34(uint *param_1,undefined4 *param_2)

{
  uint uVar1;
  uint *puVar2;
  undefined8 uStack0000000000000000;
  
  uStack0000000000000000 = 3;
  uVar1 = _fcntl(*param_2,0x43);
  if (uVar1 == 0xffffffff) {
    puVar2 = (uint *)___error();
    *(ulong *)(param_1 + 2) = (ulong)*puVar2 << 0x20 | 2;
  }
  else {
    param_1[1] = uVar1;
  }
  *param_1 = (uint)(uVar1 == 0xffffffff);
  return;
}

