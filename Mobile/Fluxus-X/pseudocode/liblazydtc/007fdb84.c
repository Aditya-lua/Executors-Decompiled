/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fdb84
 */

void FUN_007fdb84(void)

{
  long lVar1;
  long lVar2;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar2 = FUN_007fe1ec(DAT_00cca8c8);
  while (lVar2 == 0) {
    local_40 = 10000000;
    std::__ndk1::this_thread::sleep_for((duration *)&local_40);
    lVar2 = FUN_007fe1ec(DAT_00cca8c8);
  }
  while ((DAT_00ccabb8 == 0 || (DAT_00ccabc0 == 0))) {
    local_40 = 10000000;
    std::__ndk1::this_thread::sleep_for((duration *)&local_40);
  }
  FUN_008068b4();
  FUN_007fce48();
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

