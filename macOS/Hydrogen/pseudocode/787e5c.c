
undefined8 FUN_00787e5c(void)

{
  int iVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  uint unaff_w23;
  long *plVar2;
  
  if (unaff_x22 != 6) {
    iVar1 = func_0x0077e6e4((long)*(char *)(unaff_x20 + 6));
    unaff_w23 = iVar1 + unaff_w23 * 0x20;
  }
  plVar2 = *(long **)(&UNK_00a20020 + (ulong)(unaff_w23 % 0x43) * 8);
  if ((((plVar2 == (long *)0x0) || (iVar1 = func_0x0077e76c(), iVar1 == 0)) ||
      (*(char *)(*plVar2 + unaff_x22) != '\0')) ||
     (((*(uint *)((long)plVar2 + 0x94) & *(uint *)(unaff_x19 + 0x954)) == 0 ||
      ((((byte)(&UNK_00001344)[unaff_x19] >> 3 & 1) != 0 &&
       ((*(uint *)(unaff_x19 + 0x958) & *(uint *)((long)plVar2 + 0x94)) == 0)))))) {
    func_0x0073c9e4();
    return 1;
  }
  *(long **)(unaff_x21 + 0x3a8) = plVar2;
  *(long **)(unaff_x21 + 0x3a0) = plVar2;
  return 0;
}

