/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4a48
 */

void FUN_008e4a48(undefined8 param_1,long param_2,long param_3,uint *param_4,uint param_5)

{
  if (param_4[4] != 0) {
    log_internal_impl(0xffffffff,"[!] [%s:%d:%s]: \n","assembler-arm64.h",0x248,"AddSubImmediate");
    log_internal_impl(0xffffffff,"[!] %s\n\n","unreachable code!!!");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  FUN_008e4874(param_1,*(uint *)(param_2 + 8) | param_5 | (*param_4 & 0xfff) << 10 |
                       *(int *)(param_3 + 8) << 5);
  return;
}

