/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c03e50
 */

void FUN_00c03e50(void)

{
  int iVar1;
  undefined2 *puVar2;
  
  if (((DAT_00d27b70 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27b70), iVar1 != 0)) {
    __cxa_atexit(&LAB_00c0b9e0,0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d27b70);
  }
  if ((DAT_00d27b40 & 1) == 0) {
    DAT_00d27b40 = 4;
    puVar2 = (undefined2 *)&DAT_00d27b41;
  }
  else {
    DAT_00d27b48 = 2;
    puVar2 = DAT_00d27b50;
  }
  *(undefined1 *)(puVar2 + 1) = 0;
  *puVar2 = 0x4d41;
  if (((byte)DAT_00d27b58 & 1) == 0) {
    DAT_00d27b58._0_1_ = 4;
    puVar2 = (undefined2 *)((long)&DAT_00d27b58 + 1);
  }
  else {
    DAT_00d27b60 = 2;
    puVar2 = DAT_00d27b68;
  }
  *puVar2 = 0x4d50;
  *(undefined1 *)(puVar2 + 1) = 0;
  return;
}

