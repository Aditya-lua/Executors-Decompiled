/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3f9c
 */

void FUN_008e3f9c(undefined8 param_1,long param_2,undefined8 param_3)

{
  uint uVar1;
  undefined **local_28;
  undefined4 local_20;
  undefined8 local_1c;
  
  uVar1 = *(uint *)(param_2 + 0xc);
  if ((8 < uVar1) || ((0x1c3U >> (ulong)(uVar1 & 0x1f) & 1) == 0)) {
    log_internal_impl(0xffffffff,"[!] [%s:%d:%s]: \n","assembler-arm64.h",0x1d2,&DAT_002ad04d);
    log_internal_impl(0xffffffff,"[!] %s\n\n","unreachable code!!!");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  local_20 = *(undefined4 *)(param_2 + 8);
  local_28 = &PTR_LAB_00c4e320;
  local_1c = *(undefined8 *)(param_2 + 0xc);
  FUN_008e4070(param_1,*(undefined8 *)(&LAB_00744ef8 + (long)(int)uVar1 * 8),&local_28,param_3);
  return;
}

