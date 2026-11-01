
void FUN_0013c07c(void)

{
  ushort uVar1;
  undefined8 uVar2;
  int in_w8;
  long unaff_x19;
  long unaff_x21;
  
  while (unaff_x21 = unaff_x21 + 1, unaff_x21 < in_w8) {
    uVar1 = *(ushort *)(*(long *)(&UNK_000038d8 + unaff_x19) + unaff_x21 * 2);
    if ((uVar1 != 0) && ((uVar1 == 10 || (0x1f < uVar1)))) {
      func_0x0013edb8();
      in_w8 = *(int *)(&UNK_000038d0 + unaff_x19);
    }
  }
  if (*(int *)(&UNK_000038d4 + unaff_x19) < 0) {
    uVar2 = func_0x000b810c(0);
    if (*(long *)(&UNK_000038d8 + unaff_x19) != 0) {
      _memcpy(uVar2,*(long *)(&UNK_000038d8 + unaff_x19),
              (long)*(int *)(&UNK_000038d0 + unaff_x19) << 1);
      func_0x000b83d4(*(undefined8 *)(&UNK_000038d8 + unaff_x19));
    }
    *(undefined8 *)(&UNK_000038d8 + unaff_x19) = uVar2;
    *(undefined4 *)(&UNK_000038d4 + unaff_x19) = 0;
  }
  *(undefined4 *)(&UNK_000038d0 + unaff_x19) = 0;
  return;
}

