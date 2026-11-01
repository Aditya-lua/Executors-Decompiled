
/* WARNING: Removing unreachable block (ram,0x004267ec) */
/* WARNING: Removing unreachable block (ram,0x004267fc) */
/* WARNING: Removing unreachable block (ram,0x00426804) */
/* WARNING: Removing unreachable block (ram,0x0042680c) */
/* WARNING: Removing unreachable block (ram,0x00426818) */

bool FUN_0042676c(void)

{
  bool bVar1;
  int iVar2;
  long unaff_x29;
  
  iVar2 = _stat();
  if (iVar2 == -1) {
    ___error();
    bVar1 = false;
  }
  else {
    bVar1 = (*(ulong *)(unaff_x29 + -0xb0) & 0xf00000000000) == 0x800000000000;
  }
  return bVar1;
}

