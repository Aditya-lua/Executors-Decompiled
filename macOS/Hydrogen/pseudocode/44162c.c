
void FUN_0044162c(ulong *param_1)

{
  undefined *puVar1;
  ulong uVar2;
  ulong in_x9;
  undefined *in_x10;
  ulong uVar3;
  long in_x14;
  
  uVar3 = in_x14 - (long)in_x10;
  puVar1 = &UNK_0088897d;
  if (uVar3 < in_x9) {
    puVar1 = in_x10;
  }
  uVar2 = 0x1e;
  if (uVar3 < in_x9) {
    uVar2 = uVar3;
  }
  param_1[1] = (ulong)puVar1;
  param_1[2] = uVar2;
  *param_1 = (ulong)(in_x9 <= uVar3);
  return;
}

