/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0408
 */

void ZSTD_decompressBound(long param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined1 auStack_50 [8];
  ulong local_48;
  long local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar3 = 0;
  do {
    if (param_2 == 0) {
      lVar2 = lVar3;
      break;
    }
    FUN_00bb04a4(auStack_50,param_1,param_2,0);
    lVar2 = -2;
    if (0xffffffffffffff88 < local_48) break;
    param_1 = param_1 + local_48;
    param_2 = param_2 - local_48;
    lVar3 = local_40 + lVar3;
  } while (local_40 != -2);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar2);
  }
  return;
}

