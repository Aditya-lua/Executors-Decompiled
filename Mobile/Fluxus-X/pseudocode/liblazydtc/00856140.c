/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00856140
 */

void FUN_00856140(void)

{
  long lVar1;
  
  if (DAT_00cc45d0 == '\x01') {
    if (DAT_00cc45c0 == (long *)0xcc45a0) {
      lVar1 = 0x20;
    }
    else {
      if (DAT_00cc45c0 == (long *)0x0) goto LAB_00856188;
      lVar1 = 0x28;
    }
    (**(code **)(*DAT_00cc45c0 + lVar1))();
  }
LAB_00856188:
  if (DAT_00cc4580 == '\x01') {
    if (DAT_00cc4570 == (long *)0xcc4550) {
      lVar1 = 0x20;
    }
    else {
      if (DAT_00cc4570 == (long *)0x0) goto LAB_008561c8;
      lVar1 = 0x28;
    }
    (**(code **)(*DAT_00cc4570 + lVar1))();
  }
LAB_008561c8:
  if (DAT_00cc4530 == '\x01') {
    if (DAT_00cc4520 == (long *)0xcc4500) {
      lVar1 = 0x20;
    }
    else {
      if (DAT_00cc4520 == (long *)0x0) goto LAB_00856208;
      lVar1 = 0x28;
    }
    (**(code **)(*DAT_00cc4520 + lVar1))();
  }
LAB_00856208:
  if (DAT_00cc44e0 != '\x01') {
    return;
  }
  if (DAT_00cc44d0 == (long *)0xcc44b0) {
    lVar1 = 0x20;
  }
  else {
    if (DAT_00cc44d0 == (long *)0x0) {
      return;
    }
    lVar1 = 0x28;
  }
                    /* WARNING: Could not recover jumptable at 0x00856250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*DAT_00cc44d0 + lVar1))();
  return;
}

