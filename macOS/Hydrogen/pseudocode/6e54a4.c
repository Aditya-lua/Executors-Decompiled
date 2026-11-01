
int FUN_006e54a4(void)

{
  undefined8 *puVar1;
  int in_w8;
  undefined8 *puVar2;
  long in_x9;
  uint in_w10;
  long unaff_x19;
  int unaff_w20;
  undefined8 uVar3;
  
  do {
    unaff_w20 = unaff_w20 + 1;
    puVar1 = (undefined8 *)(in_x9 + (long)(int)((unaff_w20 - in_w8) - 1) * 0x20);
    if (*(int *)((long)puVar1 + 0xc) != 0) {
      puVar2 = *(undefined8 **)(unaff_x19 + 8);
      *puVar2 = puVar1[2];
      *(undefined4 *)(puVar2 + 1) = *(undefined4 *)(puVar1 + 3);
      *(uint *)((long)puVar2 + 0xc) = *(uint *)((long)puVar1 + 0x1c) & 0xf;
      uVar3 = *puVar1;
      puVar2[3] = puVar1[1];
      puVar2[2] = uVar3;
      *(undefined8 **)(unaff_x19 + 8) = puVar2 + 4;
      return unaff_w20;
    }
  } while ((uint)(unaff_w20 - in_w8) >> (ulong)(in_w10 & 0x1f) == 0);
  return -1;
}

