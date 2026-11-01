
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000b6ab0(void)

{
  undefined8 *puVar1;
  undefined4 unaff_w19;
  int *unaff_x20;
  long unaff_x21;
  undefined4 unaff_w22;
  
  func_0x000ebbac();
  puVar1 = (undefined8 *)(*(long *)(unaff_x21 + 0x3f80) + (long)*unaff_x20 * 0x1c);
  *puVar1 = _UNK_0080c160;
  *(undefined4 *)(puVar1 + 1) = unaff_w22;
  *(undefined4 *)((long)puVar1 + 0xc) = unaff_w19;
  puVar1[2] = 0;
  *(undefined4 *)(puVar1 + 3) = 0;
  *(int *)(&UNK_00003f78 + unaff_x21) = *(int *)(&UNK_00003f78 + unaff_x21) + 1;
  return;
}

