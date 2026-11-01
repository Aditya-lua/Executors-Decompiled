
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000486ec(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined8 *extraout_x8;
  
  __Unwind_Resume();
  puVar2 = (undefined8 *)__Znwm(0xf8);
  puVar2[1] = 0;
  *puVar2 = 0;
  puVar2[3] = 0;
  puVar2[2] = 0;
  puVar2[5] = 0;
  puVar2[4] = 0;
  puVar2[7] = 0;
  puVar2[6] = 0;
  puVar2[9] = 0;
  puVar2[8] = 0;
  puVar2[0xb] = 0;
  puVar2[10] = 0;
  puVar2[0xd] = 0;
  puVar2[0xc] = 0;
  puVar2[0xf] = 0;
  puVar2[0xe] = 0;
  puVar2[0x11] = 0;
  puVar2[0x10] = 0;
  puVar2[0x13] = 0;
  puVar2[0x12] = 0;
  puVar2[0x15] = 0;
  puVar2[0x14] = 0;
  puVar2[0x17] = 0;
  puVar2[0x16] = 0;
  puVar2[0x19] = 0;
  puVar2[0x18] = 0;
  puVar2[0x1b] = 0;
  puVar2[0x1a] = 0;
  puVar2[0x1d] = 0;
  puVar2[0x1c] = 0;
  puVar2[0x1e] = 0;
  func_0x005edf2c(puVar2,1);
  *puVar2 = &UNK_00a1a3f0;
  uVar1 = _UNK_007fc1e0;
  puVar2[0x1c] = _UNK_007fc1e8;
  puVar2[0x1b] = uVar1;
  *(undefined1 *)((long)puVar2 + 0xd1) = 1;
  puVar2[0x1d] = puVar2 + 1;
  *(undefined4 *)(puVar2 + 0x1e) = 0x30;
  (*_UNK_00a1a430)(puVar2);
  *puVar2 = &UNK_009b6ce0;
  *extraout_x8 = puVar2;
  return;
}

