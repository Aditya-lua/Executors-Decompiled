
void FUN_000f250c(void)

{
  long lVar1;
  long unaff_x19;
  undefined8 *unaff_x20;
  ulong unaff_x22;
  
  lVar1 = func_0x000b810c(-(unaff_x22 >> 0x1f & 1) & 0xfffffff800000000 |
                          (unaff_x22 & 0xffffffff) << 3);
  if (*(long *)(unaff_x19 + 0x80) != 0) {
    _memcpy(lVar1,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
    func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
  }
  *(long *)(unaff_x19 + 0x80) = lVar1;
  *(int *)(unaff_x19 + 0x7c) = (int)unaff_x22;
  *(undefined8 *)(lVar1 + (long)*(int *)(unaff_x19 + 0x78) * 8) = *unaff_x20;
  *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  return;
}

