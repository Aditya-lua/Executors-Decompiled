
void FUN_006e4db0(void)

{
  long unaff_x19;
  
  if (*(ulong *)(unaff_x19 + 8) < *(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10)) {
    return;
  }
  *(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) = *(ulong *)(unaff_x19 + 8);
  return;
}

