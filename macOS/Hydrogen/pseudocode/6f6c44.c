
void FUN_006f6c44(void)

{
  undefined1 *puVar1;
  undefined4 unaff_w19;
  long unaff_x20;
  
  puVar1 = (undefined1 *)func_0x006f3878();
  puVar1[1] = *(byte *)(*(long *)(unaff_x20 + 0x18) + 0x20) & 3;
  *puVar1 = 5;
  puVar1[2] = *(undefined1 *)(unaff_x20 + 4);
  *(undefined4 *)(puVar1 + 4) = 0xffff8000;
  *(int *)(puVar1 + 0x10) = -((int)puVar1 + 0x10);
  *(undefined4 *)(puVar1 + 0x14) = unaff_w19;
  *(undefined8 *)(puVar1 + 8) = 0;
  return;
}

