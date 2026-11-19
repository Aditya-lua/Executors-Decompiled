/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00856254
 */

void FUN_00856254(void)

{
  long lVar1;
  
  if (DAT_00d1ee60 == '\x01') {
    if (DAT_00d1ee50 == (long *)&DAT_00d1ee30) {
      lVar1 = 0x20;
    }
    else {
      if (DAT_00d1ee50 == (long *)0x0) goto LAB_0085629c;
      lVar1 = 0x28;
    }
    (**(code **)(*DAT_00d1ee50 + lVar1))();
  }
LAB_0085629c:
  if (DAT_00d1ee10 == '\x01') {
    if (DAT_00d1ee00 == &DAT_00d1ede0) {
      lVar1 = 0x20;
    }
    else {
      if (DAT_00d1ee00 == (long *)0x0) goto LAB_008562dc;
      lVar1 = 0x28;
    }
    (**(code **)(*DAT_00d1ee00 + lVar1))();
  }
LAB_008562dc:
  if (DAT_00d1edc0 == '\x01') {
    if (DAT_00d1edb0 == (long *)&DAT_00d1ed90) {
      lVar1 = 0x20;
    }
    else {
      if (DAT_00d1edb0 == (long *)0x0) goto LAB_0085631c;
      lVar1 = 0x28;
    }
    (**(code **)(*DAT_00d1edb0 + lVar1))();
  }
LAB_0085631c:
  if (DAT_00d1ed70 != '\x01') {
    return;
  }
  if (DAT_00d1ed60 == (long *)&DAT_00d1ed40) {
    lVar1 = 0x20;
  }
  else {
    if (DAT_00d1ed60 == (long *)0x0) {
      return;
    }
    lVar1 = 0x28;
  }
                    /* WARNING: Could not recover jumptable at 0x00856364. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*DAT_00d1ed60 + lVar1))();
  return;
}

