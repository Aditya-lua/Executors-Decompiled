/* 7ff70c84c6e0 FUN_7ff70c84c6e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c84c6e0(longlong param_1,float param_2,undefined4 param_3)

{
  code *pcVar1;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(float *)(param_1 + 0xa8) =
       (float)(int)(((param_2 - *(float *)(param_1 + 0x70)) - *(float *)(param_1 + 0x80)) +
                   *(float *)(param_1 + 0x98));
  *(undefined4 *)(param_1 + 0xb0) = param_3;
  *(undefined4 *)(param_1 + 0xb8) = 0;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


