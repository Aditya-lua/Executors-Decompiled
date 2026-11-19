/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4bc8
 */

undefined4 FUN_008e4bc8(undefined8 param_1,undefined8 param_2,uint param_3)

{
  if (4 < param_3) {
    log_internal_impl(0xffffffff,"[!] [%s:%d:%s]: \n","platform-posix.cc",0x79,
                      "GetProtectionFromMemoryPermission");
    log_internal_impl(0xffffffff,"[!] %s\n\n","unreachable code!!!");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  return *(undefined4 *)(&DAT_00744f40 + (long)(int)param_3 * 4);
}

