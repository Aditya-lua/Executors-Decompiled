
void FUN_004b3538(long *param_1,undefined8 param_2)

{
  undefined *puVar1;
  undefined8 uVar2;
  undefined *puVar3;
  ulong uVar4;
  ulong *puStack_18;
  
  puStack_18 = (ulong *)*param_1;
  uVar4 = *puStack_18 ^ 0x8000000000000000;
  if (2 < uVar4) {
    uVar4 = 1;
  }
  if (uVar4 == 0) {
    puVar1 = &UNK_008a15bf;
    puVar3 = &UNK_009e4cc8;
  }
  else {
    if (uVar4 == 1) {
      puVar1 = &UNK_008a15c4;
      puVar3 = &UNK_009e4ce8;
      uVar2 = 6;
      goto LAB_004b35cc;
    }
    puVar1 = &UNK_008a15ca;
    puVar3 = &UNK_009e4d08;
  }
  puStack_18 = puStack_18 + 1;
  uVar2 = 5;
LAB_004b35cc:
  func_0x004699b0(param_2,puVar1,uVar2,&puStack_18,puVar3);
  return;
}

