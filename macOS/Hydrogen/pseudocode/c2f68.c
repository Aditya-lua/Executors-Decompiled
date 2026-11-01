
void FUN_000c2f68(long param_1)

{
  int *in_x9;
  undefined2 in_w11;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  int *piVar1;
  undefined8 unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x24;
  
  *(undefined2 *)(&UNK_000060e0 + param_1) = in_w11;
  *in_x9 = *in_x9 + 1;
  unaff_x20[0x18] = 0;
  unaff_x20[0x15] = 0;
  unaff_x20[0x14] = 0;
  unaff_x20[0x17] = 0;
  unaff_x20[0x16] = 0;
  unaff_x20[0x11] = 0;
  unaff_x20[0x10] = 0;
  unaff_x20[0x13] = 0;
  unaff_x20[0x12] = 0;
  unaff_x20[0xd] = 0;
  unaff_x20[0xc] = 0;
  unaff_x20[0xf] = 0;
  unaff_x20[0xe] = 0;
  unaff_x20[9] = 0;
  unaff_x20[8] = 0;
  unaff_x20[0xb] = 0;
  unaff_x20[10] = 0;
  unaff_x20[5] = 0;
  unaff_x20[4] = 0;
  unaff_x20[7] = 0;
  unaff_x20[6] = 0;
  unaff_x20[1] = 0;
  *unaff_x20 = 0;
  unaff_x20[3] = 0;
  unaff_x20[2] = 0;
  unaff_x20[7] = &UNK_00003d40 + unaff_x23;
  unaff_x20[8] = unaff_x22;
  *unaff_x24 = unaff_x20;
  piVar1 = (int *)(unaff_x19 + unaff_x21 * 4 + 0x30);
  if (*piVar1 != *(int *)(&UNK_00003f58 + unaff_x23)) {
    func_0x000ef410();
    func_0x000f0b5c();
    func_0x000f0930();
    *piVar1 = *(int *)(&UNK_00003f58 + unaff_x23);
  }
  return;
}

