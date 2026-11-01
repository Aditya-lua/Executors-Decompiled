
/* WARNING: Removing unreachable block (ram,0x00797c54) */
/* WARNING: Removing unreachable block (ram,0x00797c74) */
/* WARNING: Removing unreachable block (ram,0x00797d20) */
/* WARNING: Removing unreachable block (ram,0x00797d2c) */
/* WARNING: Removing unreachable block (ram,0x00797cac) */
/* WARNING: Removing unreachable block (ram,0x00797cb8) */
/* WARNING: Removing unreachable block (ram,0x00797d30) */
/* WARNING: Removing unreachable block (ram,0x00797cc0) */
/* WARNING: Removing unreachable block (ram,0x00797ccc) */
/* WARNING: Removing unreachable block (ram,0x00797ce0) */
/* WARNING: Removing unreachable block (ram,0x00797d44) */
/* WARNING: Removing unreachable block (ram,0x00797d60) */

undefined8 FUN_00797bbc(long param_1)

{
  undefined8 uVar1;
  long unaff_x19;
  undefined8 *unaff_x22;
  int *piVar2;
  
  if (param_1 != 0) {
    piVar2 = *(int **)(param_1 + 0xe8);
    if ((piVar2 == (int *)0x0) || (*piVar2 == 0xe1551)) goto LAB_00797bf0;
    func_0x0073c9e4();
  }
  piVar2 = (int *)0x0;
LAB_00797bf0:
  func_0x007955b8();
  *unaff_x22 = 0;
  if (piVar2 == (int *)0x0) {
    uVar1 = 0;
  }
  else {
    if ((*(long *)(unaff_x19 + 0xe0) != 0) &&
       ((*(byte *)(*(long *)(unaff_x19 + 0xe0) + 4) >> 4 & 1) != 0)) {
      func_0x00779cfc();
    }
    uVar1 = func_0x00797dd0();
    if ((*(long *)(unaff_x19 + 0xe0) != 0) &&
       ((*(byte *)(*(long *)(unaff_x19 + 0xe0) + 4) >> 4 & 1) != 0)) {
      func_0x00779d40();
    }
    if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
       (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b590)))) {
      func_0x0073d22c();
    }
  }
  return uVar1;
}

