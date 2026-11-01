
long FUN_00471ce4(ulong param_1,ulong param_2)

{
  byte bVar1;
  float fVar2;
  int iVar3;
  ulong in_x9;
  ulong in_x10;
  uint uVar4;
  int unaff_w20;
  long unaff_x21;
  int unaff_w25;
  float fVar5;
  byte in_stack_0000030c;
  
  do {
    param_2 = param_2 * 10;
    if (in_x10 < in_x9) {
      param_2 = param_2 + *(byte *)(unaff_x21 + in_x10);
    }
    in_x10 = in_x10 + 1;
  } while (param_1 != in_x10);
  if (param_1 < in_x9) {
    bVar1 = *(byte *)(unaff_x21 + param_1);
    if (bVar1 == 5 && param_1 + 1 == in_x9) {
      if (((in_stack_0000030c & 1) != 0) ||
         (((int)param_1 != 0 && ((((byte *)(unaff_x21 + param_1))[-1] & 1) != 0))))
      goto code_r0x00471d58;
    }
    else if (4 < bVar1) {
code_r0x00471d58:
      param_2 = param_2 + 1;
    }
  }
  if (param_2 >> 0x18 != 0) {
    func_0x0045d7d8();
    param_2 = func_0x0045d50c();
    if (0xfe < unaff_w20 + 0x80) {
      uVar4 = 0;
      iVar3 = 0xff;
      goto code_r0x00471b3c;
    }
    unaff_w20 = unaff_w20 + 1;
  }
  iVar3 = 0x7e;
  if (0x7fffff < param_2) {
    iVar3 = 0x7f;
  }
  iVar3 = iVar3 + unaff_w20;
  uVar4 = (uint)param_2 & 0x7fffff;
code_r0x00471b3c:
  fVar2 = (float)(uVar4 | iVar3 << 0x17);
  fVar5 = -fVar2;
  if (unaff_w25 != 0x2d) {
    fVar5 = fVar2;
  }
  return (ulong)(uint)fVar5 << 0x20;
}

