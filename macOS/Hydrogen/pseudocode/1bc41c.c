
ulong FUN_001bc41c(void)

{
  bool bVar1;
  ulong uVar2;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined1 uStack0000000000000008;
  
  uVar2 = func_0x001e108c(&uStack0000000000000008);
  if (((uVar2 & 1) == 0) && (bVar1 = unaff_x21 != 0x20, unaff_x21 = 0, bVar1)) {
                    /* WARNING: Could not recover jumptable at 0x001bc338. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (*(code *)(&LAB_001bc33c +
                      (ulong)*(byte *)(unaff_x20 + (ulong)*(ushort *)(unaff_x22 + 0x18)) * 4))();
    return uVar2;
  }
  func_0x001e189c(&uStack0000000000000008);
  return (ulong)(unaff_x21 != 0);
}

