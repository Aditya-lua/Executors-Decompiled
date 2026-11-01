
void __ZN3std2fs4File9try_clone17hde6c7876b02a75c8E(uint *param_1,undefined4 *param_2)

{
  uint uVar1;
  uint *puVar2;
  
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

