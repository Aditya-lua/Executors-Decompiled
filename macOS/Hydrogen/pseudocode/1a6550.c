
void FUN_001a6550(void)

{
  long lVar1;
  long unaff_x20;
  long unaff_x21;
  
  func_0x0079b61c();
  lVar1 = *(long *)(unaff_x21 + 0x10);
  *(undefined2 *)(*(long *)(unaff_x21 + 8) + lVar1) = 0xffff;
  *(long *)(unaff_x21 + 0x10) = lVar1 + 2;
  if (*(long *)(unaff_x20 + 0x10) == 0) {
    func_0x0024031c();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001a6460. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001a6464 + (ulong)(byte)(&UNK_0081d4ee)[**(ushort **)(unaff_x20 + 8)] * 4))();
  return;
}

