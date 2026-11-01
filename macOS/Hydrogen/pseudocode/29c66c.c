
void FUN_0029c66c(ulong *param_1,ulong param_2,byte *param_3)

{
  ulong *puVar1;
  ulong uVar2;
  long in_x9;
  
  puVar1 = param_1;
  if (in_x9 != 0) {
    uVar2 = 0;
    do {
      uVar2 = (ulong)*param_3 | uVar2 << 8;
      in_x9 = in_x9 + -1;
      param_3 = param_3 + 1;
    } while (in_x9 != 0);
    puVar1 = param_1 + 1;
    *param_1 = uVar2;
    param_2 = param_2 - 1;
  }
  if ((param_2 & 0x1fffffffffffffff) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b31b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__bzero_00a24c68)(puVar1);
  return;
}

