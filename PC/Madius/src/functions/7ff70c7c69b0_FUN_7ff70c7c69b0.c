/* 7ff70c7c69b0 FUN_7ff70c7c69b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7c69b0(undefined1 *param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined1 auStack_38 [32];
  ulonglong uStack_18;
  
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  *param_1 = 0;
  *(undefined4 *)(param_1 + 0xc) = 0;
  *(undefined8 *)(param_1 + 4) = 0;
  if (*(int *)(param_1 + 0x14) < 0) {
    uVar2 = FUN_7ff70c802100(0);
    if (*(longlong *)(param_1 + 0x18) != 0) {
      FUN_7ff70cb12b60(uVar2,*(longlong *)(param_1 + 0x18),(longlong)*(int *)(param_1 + 0x10) << 3);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x18));
    }
    *(undefined8 *)(param_1 + 0x18) = uVar2;
    *(undefined4 *)(param_1 + 0x14) = 0;
  }
  *(undefined4 *)(param_1 + 0x10) = 0;
  *(undefined8 *)(param_1 + 0x20) = 0;
  *(undefined8 *)(param_1 + 0x28) = 0;
  *(undefined8 *)(param_1 + 0x30) = 0;
  *(undefined8 *)(param_1 + 0x38) = 0;
  *(undefined8 *)(param_1 + 0x40) = 0;
  if (_DAT_7ff70cbebd80 == (uStack_18 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_38);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


