
/* WARNING: Removing unreachable block (ram,0x0069498c) */
/* WARNING: Removing unreachable block (ram,0x0069497c) */
/* WARNING: Removing unreachable block (ram,0x00694a1c) */
/* WARNING: Removing unreachable block (ram,0x00694a20) */
/* WARNING: Removing unreachable block (ram,0x00694a24) */
/* WARNING: Removing unreachable block (ram,0x00694a30) */

bool FUN_0069488c(long param_1)

{
  char *pcVar1;
  bool bVar2;
  uint uVar3;
  long lVar4;
  long *unaff_x19;
  long *unaff_x20;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  char *pcVar5;
  char *pcVar6;
  uint unaff_w28;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  
  (**(code **)(param_1 + 0x10))();
  (**(code **)(*unaff_x20 + 0x10))();
  (**(code **)(*unaff_x25 + 0x10))();
  pcVar6 = (char *)(unaff_x24 + unaff_x23);
  pcVar1 = (char *)(unaff_x26 + unaff_x22);
  pcVar5 = pcVar6;
  if (pcVar6 != pcVar1) {
    lVar4 = unaff_x22 + unaff_x23 * -2;
    do {
      if (*pcVar5 == '\x01') goto LAB_00694940;
      pcVar5 = pcVar5 + 1;
      lVar4 = lVar4 + -1;
    } while (lVar4 != 0);
    pcVar5 = pcVar1;
LAB_00694940:
    lVar4 = (long)pcVar5 - (long)pcVar6;
    if (lVar4 != 0) {
      do {
        if (*pcVar6 != '\0') goto LAB_00694968;
        pcVar6 = pcVar6 + 1;
        lVar4 = lVar4 + -1;
      } while (lVar4 != 0);
      pcVar6 = pcVar5;
    }
  }
LAB_00694968:
  uVar3 = (**(code **)(*unaff_x19 + 0x78))();
  uVar3 = uVar3 ^ 1;
  if (pcVar5 == pcVar1 || pcVar6 != pcVar5) {
    uVar3 = 1;
  }
  if (unaff_x22 < (unaff_x23 << 1 | 1U)) {
    uVar3 = 1;
  }
  bVar2 = ((uVar3 | unaff_w28) & 1) == 0;
  if (bVar2) {
    _memcpy();
  }
  (**(code **)(*unaff_x20 + 8))();
  if (in_stack_00000050 <= in_stack_00000048) {
    in_stack_00000048 = in_stack_00000050;
  }
  if (in_stack_00000058 != 0) {
    if (in_stack_00000048 != 0) {
      do {
        *(undefined1 *)(in_stack_00000058 + -1 + in_stack_00000048) = 0;
        in_stack_00000048 = in_stack_00000048 - 1;
      } while (in_stack_00000048 != 0);
    }
    func_0x00611644();
  }
  (**(code **)(*unaff_x19 + 8))();
  return bVar2;
}

