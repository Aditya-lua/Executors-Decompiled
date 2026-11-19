/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c03f9c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00c03f9c(void)

{
  int iVar1;
  undefined8 *puVar2;
  
  if (((DAT_00d27ba8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27ba8), iVar1 != 0)) {
    __cxa_atexit(&LAB_00c0ba44,0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d27ba8);
  }
  if ((DAT_00d27b78 & 1) == 0) {
    DAT_00d27b78 = 4;
    puVar2 = (undefined8 *)&DAT_00d27b7c;
  }
  else {
    _DAT_00d27b80 = 2;
    puVar2 = DAT_00d27b88;
  }
  *(undefined4 *)(puVar2 + 1) = 0;
  *puVar2 = 0x4d00000041;
  if (((byte)DAT_00d27b90 & 1) == 0) {
    DAT_00d27b90._0_1_ = 4;
    puVar2 = (undefined8 *)((long)&DAT_00d27b90 + 4);
  }
  else {
    _DAT_00d27b98 = 2;
    puVar2 = DAT_00d27ba0;
  }
  *puVar2 = 0x4d00000050;
  *(undefined4 *)(puVar2 + 1) = 0;
  return;
}

