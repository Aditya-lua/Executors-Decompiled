
void FUN_000d9c48(void)

{
  undefined1 *puVar1;
  long lVar2;
  
  ___stack_chk_fail();
  puVar1 = &UNK_00003f66 + lRam0000000000a334c0;
  lVar2 = *(long *)(lRam0000000000a334c0 + 0x4000);
  if (((*(long *)(&UNK_00004b18 + lRam0000000000a334c0) == lVar2) &&
      ((&UNK_00004bc1)[lRam0000000000a334c0] != '\0')) &&
     (*(int *)(&UNK_00004b68 + lRam0000000000a334c0) == 0)) {
    *(uint *)(&UNK_00004bc4 + lRam0000000000a334c0) =
         *(uint *)(&UNK_00004bc4 + lRam0000000000a334c0) & 0xfffffff0 | 2;
  }
  if ((*(byte *)(lVar2 + 0x17) & 1) != 0) {
    *puVar1 = 1;
  }
  func_0x000cea90();
  *puVar1 = 0;
  return;
}

