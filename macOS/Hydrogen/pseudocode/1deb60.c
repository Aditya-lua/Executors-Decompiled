
/* WARNING: Removing unreachable block (ram,0x001decb8) */
/* WARNING: Removing unreachable block (ram,0x001dec90) */
/* WARNING: Removing unreachable block (ram,0x001deca4) */
/* WARNING: Removing unreachable block (ram,0x001decb0) */
/* WARNING: Removing unreachable block (ram,0x001decc0) */
/* WARNING: Removing unreachable block (ram,0x001decc4) */
/* WARNING: Removing unreachable block (ram,0x001deccc) */
/* WARNING: Removing unreachable block (ram,0x001decdc) */
/* WARNING: Removing unreachable block (ram,0x001ded08) */
/* WARNING: Removing unreachable block (ram,0x001ded10) */
/* WARNING: Removing unreachable block (ram,0x001ded20) */
/* WARNING: Removing unreachable block (ram,0x001dece4) */

void FUN_001deb60(void)

{
  long lVar1;
  long unaff_x19;
  long *unaff_x23;
  long unaff_x25;
  undefined1 uStack00000000000000d8;
  
  func_0x001d58dc();
  lVar1 = *unaff_x23;
  *unaff_x23 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9b44(&uStack00000000000000d8);
  }
  func_0x001d50f8();
  do {
    if (*(long *)(unaff_x19 + 200) != unaff_x25 + -2) {
      func_0x001d5248();
    }
    func_0x001d5f88(unaff_x19 + 0x1a0);
    func_0x00187bd4();
    __Unwind_Resume();
  } while( true );
}

