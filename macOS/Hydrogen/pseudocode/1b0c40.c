
void FUN_001b0c40(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  
  func_0x0079b61c();
  lVar1 = *(long *)(unaff_x19 + 0x10);
  *(undefined2 *)(*(long *)(unaff_x19 + 8) + lVar1) = 0xffff;
  *(long *)(unaff_x19 + 0x10) = lVar1 + 2;
                    /* WARNING: Could not recover jumptable at 0x001b0754. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001b0758 + (ulong)(byte)(&UNK_0081d9a0)[*(ushort *)(unaff_x20 + 0x20)] * 4))();
  return;
}

