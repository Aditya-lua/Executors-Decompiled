
int FUN_006ed924(long param_1,long param_2)

{
  int iVar1;
  long in_x9;
  long in_x10;
  uint in_w11;
  long in_x12;
  uint in_w13;
  int unaff_w19;
  ulong uVar2;
  undefined8 *puVar3;
  
  while( true ) {
    iVar1 = *(int *)(in_x10 + (ulong)in_w13 * 4) + (uint)*(byte *)(in_x9 + in_x12);
    if (unaff_w19 <= iVar1) {
      unaff_w19 = iVar1;
    }
    in_x12 = in_x12 + 1;
    if (param_1 == in_x12) break;
    in_w13 = (uint)in_x12 >> (ulong)(in_w11 & 0x1f);
  }
  uVar2 = (ulong)*(uint *)(param_2 + 0x8c);
  if (0 < (int)*(uint *)(param_2 + 0x8c)) {
    puVar3 = *(undefined8 **)(param_2 + 0x18);
    do {
      iVar1 = func_0x006ed80c(*puVar3);
      if (unaff_w19 <= iVar1) {
        unaff_w19 = iVar1;
      }
      uVar2 = uVar2 - 1;
      puVar3 = puVar3 + 1;
    } while (uVar2 != 0);
  }
  return unaff_w19;
}

