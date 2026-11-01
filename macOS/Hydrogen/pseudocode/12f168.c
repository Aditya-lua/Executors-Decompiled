
void FUN_0012f168(void)

{
  char in_NG;
  char in_OV;
  int iVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar2;
  
  while (lVar2 = lRam0000000000a334c0, in_NG != in_OV) {
    lVar2 = *(long *)(unaff_x19 + 0x18);
    if ((*(uint *)(lVar2 + unaff_x20) & 1) == 0) {
      iVar1 = func_0x001266f4();
      if (iVar1 != 0) {
        *(byte *)(lVar2 + unaff_x20 + 100) = *(byte *)(lVar2 + unaff_x20 + 99) ^ 1;
      }
    }
    unaff_x21 = unaff_x21 + 1;
    unaff_x20 = unaff_x20 + 0x70;
    in_OV = SBORROW8(unaff_x21,(long)*(int *)(unaff_x19 + 0x6c));
    in_NG = unaff_x21 - *(int *)(unaff_x19 + 0x6c) < 0;
  }
  iVar1 = *(int *)(&UNK_00004ab0 + lRam0000000000a334c0);
  *(int *)(&UNK_00004ab0 + lRam0000000000a334c0) = iVar1 + -1;
  *(undefined4 *)(&UNK_0000497c + lVar2) =
       *(undefined4 *)(*(long *)(&UNK_00004ab8 + lVar2) + (long)(iVar1 + -2) * 4);
  return;
}

