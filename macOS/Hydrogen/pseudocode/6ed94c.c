
ulong FUN_006ed94c(long param_1)

{
  uint uVar1;
  char in_NG;
  char in_OV;
  uint uVar2;
  ulong unaff_x19;
  long unaff_x20;
  undefined8 *puVar3;
  
  if (in_NG == in_OV) {
    puVar3 = *(undefined8 **)(param_1 + 0x18);
    do {
      uVar2 = func_0x006ed80c(*puVar3);
      uVar1 = (uint)unaff_x19;
      if ((int)(uint)unaff_x19 <= (int)uVar2) {
        uVar1 = uVar2;
      }
      unaff_x19 = (ulong)uVar1;
      unaff_x20 = unaff_x20 + -1;
      puVar3 = puVar3 + 1;
    } while (unaff_x20 != 0);
  }
  return unaff_x19;
}

