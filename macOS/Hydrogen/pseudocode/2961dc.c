
/* WARNING: Possible PIC construction at 0x002961f8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00296238: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0029625c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0029623c) */
/* WARNING: Removing unreachable block (ram,0x00296240) */
/* WARNING: Removing unreachable block (ram,0x002961fc) */
/* WARNING: Removing unreachable block (ram,0x00296200) */
/* WARNING: Removing unreachable block (ram,0x0029621c) */
/* WARNING: Removing unreachable block (ram,0x00296260) */
/* WARNING: Removing unreachable block (ram,0x00296264) */

ulong FUN_002961dc(int param_1)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  ulong uVar4;
  long unaff_x23;
  
  if (param_1 < 1) {
    return 0;
  }
  if (unaff_x23 == 0) {
    return 1;
  }
  iVar1 = func_0x0027f658();
  if (iVar1 == 0) {
code_r0x00295fbc:
    uVar4 = 0;
  }
  else {
    iVar1 = func_0x0029b308();
    if (iVar1 == 0) {
      iVar1 = func_0x0029d938();
      func_0x0029c378();
      if (iVar1 == 0) {
        iVar1 = func_0x00280490();
        if (0 < iVar1) {
          uVar2 = func_0x0029bfd4();
          lVar3 = func_0x0036e31c((ulong)uVar2 + 1);
          if (lVar3 != 0) {
            func_0x0029ce18();
            uVar4 = func_0x00296004();
            func_0x0036e3d8(lVar3);
            return uVar4;
          }
        }
        goto code_r0x00295fbc;
      }
    }
    iVar1 = func_0x00280490();
    uVar4 = (ulong)(0 < iVar1);
  }
  return uVar4;
}

