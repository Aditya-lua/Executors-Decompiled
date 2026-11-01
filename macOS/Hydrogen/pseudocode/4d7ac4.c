
void FUN_004d7ac4(void)

{
  long lVar1;
  long unaff_x19;
  long lVar2;
  
  lVar2 = *(long *)(unaff_x19 + 0x30) + 1;
  lVar1 = *(long *)(unaff_x19 + 0x28);
  while (lVar2 = lVar2 + -1, lVar2 != 0) {
    func_0x004ca6d8(lVar1);
    lVar1 = lVar1 + 0x40;
  }
  if (*(long *)(unaff_x19 + 0x20) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)
            (*(undefined8 *)(unaff_x19 + 0x28),*(long *)(unaff_x19 + 0x20) << 6,8);
  return;
}

