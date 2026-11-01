
/* WARNING: Possible PIC construction at 0x0066c430: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0066c434) */

void FUN_0066c424(long param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x19;
  
  (**(code **)(param_1 + 8))();
  *unaff_x19 = &UNK_00a0c410;
  unaff_x19[1] = &UNK_00a0c620;
  lVar1 = unaff_x19[0xd];
  uVar2 = unaff_x19[0xb];
  if ((ulong)unaff_x19[0xc] <= (ulong)unaff_x19[0xb]) {
    uVar2 = unaff_x19[0xc];
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  *unaff_x19 = &UNK_00a0c238;
  unaff_x19[1] = &UNK_00a0c3e0;
  if ((long *)unaff_x19[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[3] + 8))();
  }
  return;
}

