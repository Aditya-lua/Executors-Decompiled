
void FUN_0009bf84(void)

{
  uint in_w8;
  long *in_x9;
  long *in_x10;
  int in_w11;
  long in_x12;
  ulong uVar1;
  long *in_x14;
  int in_w15;
  long unaff_x19;
  int unaff_w20;
  
  for (; in_x14 <= in_x10; in_x14 = (long *)((long)in_x14 + 3)) {
    *(int *)(unaff_x19 + ((ulong)(*in_x14 * in_x12) >> 0x32 & 0x3ffc)) = in_w15;
    in_w15 = in_w15 + 3;
  }
  if (unaff_w20 == 1) {
    do {
      uVar1 = (ulong)(*in_x9 * in_x12) >> 0x34;
      if (*(uint *)(unaff_x19 + uVar1 * 4) <= in_w8) {
        *(int *)(unaff_x19 + uVar1 * 4) = in_w11;
      }
      in_x9 = (long *)((long)in_x9 + 1);
      in_w11 = in_w11 + 1;
    } while (in_x9 <= in_x10);
  }
  return;
}

