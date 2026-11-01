
ulong FUN_001b216c(void)

{
  ulong uVar1;
  bool bVar2;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x24;
  undefined1 uStack0000000000000008;
  
  uVar3 = func_0x001e108c(&uStack0000000000000008);
  if (((uVar3 & 1) != 0) || (bVar2 = unaff_x24 == 0x40, unaff_x24 = 0, bVar2)) {
    func_0x001e189c(&uStack0000000000000008);
    return (ulong)(unaff_x24 != 0);
  }
  uVar1 = *(long *)(unaff_x19 + 0x1e) + unaff_x20;
  if (0x16 < uVar1) {
    uVar1 = unaff_x21;
  }
                    /* WARNING: Could not recover jumptable at 0x001b208c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (*(code *)(&UNK_001b2090 + (ulong)*(byte *)(unaff_x22 + uVar1) * 4))(uVar3,0);
  return uVar3;
}

