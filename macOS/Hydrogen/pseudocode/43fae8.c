
void FUN_0043fae8(undefined8 *param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long in_x9;
  ulong in_x10;
  ulong in_x11;
  uint *in_x12;
  undefined *in_x13;
  ulong uVar3;
  long in_x14;
  undefined *puVar4;
  
  puVar4 = (undefined *)(in_x14 - in_x9);
  lVar1 = 0;
  if (in_x13 < puVar4) {
    lVar2 = 1;
  }
  else {
    lVar2 = in_x14;
    lVar1 = (long)in_x13 - (long)puVar4;
  }
  *(long *)(param_2 + 0x28) = lVar2;
  *(long *)(param_2 + 0x30) = lVar1;
  if (in_x13 < puVar4) {
    puVar4 = &UNK_008885f6;
    if (in_x11 <= in_x10) {
      puVar4 = &UNK_00888633;
    }
  }
  else {
    if (puVar4 < in_x13) {
      *(long *)(param_2 + 0x28) = in_x14 + 1;
      *(long *)(param_2 + 0x30) = lVar1 + -1;
      if (in_x10 < in_x11) {
        uVar3 = (ulong)*in_x12;
      }
      else {
        puVar4 = &UNK_00888633;
        uVar3 = 0x23;
        in_x9 = 0;
      }
      goto code_r0x0043f8f8;
    }
    *(undefined8 *)(param_2 + 0x28) = 1;
    *(undefined8 *)(param_2 + 0x30) = 0;
    puVar4 = &UNK_008885f6;
    if (in_x11 <= in_x10) {
      puVar4 = &UNK_00888633;
    }
  }
  in_x9 = 0;
  uVar3 = 0x1b;
  if (in_x11 <= in_x10) {
    uVar3 = 0x23;
  }
code_r0x0043f8f8:
  param_1[1] = in_x9;
  param_1[2] = puVar4;
  param_1[3] = uVar3;
  *param_1 = 1;
  return;
}

