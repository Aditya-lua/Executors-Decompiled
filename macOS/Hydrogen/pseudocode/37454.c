
void FUN_00037454(long param_1)

{
  long lVar1;
  long *plVar2;
  long in_x9;
  ulong in_x10;
  long *in_x11;
  long in_x12;
  long in_x13;
  long in_x14;
  long in_x16;
  long *unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  for (; in_x9 = in_x9 + 0x18, in_x10 < (ulong)((in_x16 - param_1 >> 3) * in_x12);
      in_x10 = in_x10 + 1) {
    plVar2 = (long *)(in_x14 + in_x9);
    if ((ulong)((in_x13 - in_x14 >> 3) * in_x12) <= in_x10) {
      plVar2 = in_x11;
    }
    *(long *)(param_1 + in_x9) = unaff_x22 + (*plVar2 - unaff_x24);
    plVar2 = (long *)(*unaff_x19 + in_x9);
    if ((ulong)((unaff_x19[1] - *unaff_x19 >> 3) * in_x12) <= in_x10) {
      plVar2 = in_x11;
    }
    *(long *)(*unaff_x20 + in_x9 + 8) = unaff_x22 + (plVar2[1] - unaff_x24);
    in_x14 = *unaff_x19;
    in_x13 = unaff_x19[1];
    plVar2 = (long *)(in_x14 + in_x9);
    if ((ulong)((in_x13 - in_x14 >> 3) * in_x12) <= in_x10) {
      plVar2 = in_x11;
    }
    param_1 = *unaff_x20;
    in_x16 = unaff_x20[1];
    *(char *)(param_1 + in_x9 + 0x10) = (char)plVar2[2];
  }
  unaff_x20[3] = unaff_x23;
  unaff_x20[4] = unaff_x23;
  *(undefined1 *)(unaff_x20 + 5) = 0;
  lVar1 = unaff_x22 + (unaff_x19[6] - unaff_x24);
  unaff_x20[6] = lVar1;
  unaff_x20[7] = unaff_x22 + (unaff_x19[7] - unaff_x24);
  *(char *)(unaff_x20 + 8) = (char)unaff_x19[8];
  unaff_x20[9] = unaff_x22 + (unaff_x19[9] - unaff_x24);
  unaff_x20[10] = unaff_x22 + (unaff_x19[10] - unaff_x24);
  *(char *)(unaff_x20 + 0xb) = (char)unaff_x19[0xb];
  if ((unaff_x21 & 1) == 0) {
    unaff_x20[0xd] = lVar1;
  }
  *(char *)(unaff_x20 + 0xc) = (char)unaff_x19[0xc];
  return;
}

