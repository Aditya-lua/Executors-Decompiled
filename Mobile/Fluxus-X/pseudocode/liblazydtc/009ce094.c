/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ce094
 */

bool ssl3_do_compress(long param_1,long param_2)

{
  int iVar1;
  
  iVar1 = COMP_compress_block(*(COMP_CTX **)(param_1 + 0x868),*(uchar **)(param_2 + 0x20),
                              *(int *)(param_2 + 8) + 0x400,*(uchar **)(param_2 + 0x28),
                              *(int *)(param_2 + 8));
  if (-1 < iVar1) {
    *(long *)(param_2 + 8) = (long)iVar1;
    *(undefined8 *)(param_2 + 0x28) = *(undefined8 *)(param_2 + 0x20);
  }
  return -1 < iVar1;
}

