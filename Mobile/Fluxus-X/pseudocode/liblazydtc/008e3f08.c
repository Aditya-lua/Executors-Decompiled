/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3f08
 */

void FUN_008e3f08(undefined8 param_1,ulong param_2,long param_3,long param_4)

{
  if (*(int *)(param_4 + 0x44) != 0) {
    log_internal_impl(0xffffffff,"[!] [%s:%d:%s]: \n","assembler-arm64.h",0x224,"LoadStore");
    log_internal_impl(0xffffffff,"[!] %s\n\n","unreachable code!!!");
                    /* WARNING: Subroutine does not return */
    abort();
  }
  FUN_008e4874(param_1,(uint)param_2 | *(int *)(param_4 + 8) << 5 | *(uint *)(param_3 + 8) |
                       ((uint)(*(long *)(param_4 + 0x30) >> (param_2 >> 0x1e & 3)) & 0xfff) << 10 |
                       0x39000000);
  return;
}

