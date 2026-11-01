
long FUN_006f1754(long param_1)

{
  uint uVar1;
  long lVar2;
  uint in_w9;
  long in_x10;
  long unaff_x19;
  
  do {
    lVar2 = param_1;
    if (4 < (*(uint *)(in_x10 + 0x1c) & 0xf)) {
      *(uint *)(in_x10 + 0x1c) = *(uint *)(in_x10 + 0x1c) & 0xfffffff0 | in_w9 & 0xf;
    }
    do {
      param_1 = lVar2 + -0x20;
      if (lVar2 == 0) {
        *(byte *)(unaff_x19 + 1) = *(byte *)(unaff_x19 + 1) & 0xfb;
        uVar1 = 1 << (ulong)(*(byte *)(unaff_x19 + 6) & 0x1f);
        return (-(ulong)(uVar1 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar1 << 5) +
               (long)*(int *)(unaff_x19 + 8) * 0x10 + 0x30;
      }
      in_x10 = *(long *)(unaff_x19 + 0x20) + param_1;
      lVar2 = param_1;
    } while (*(int *)(in_x10 + 0xc) != 0);
  } while( true );
}

