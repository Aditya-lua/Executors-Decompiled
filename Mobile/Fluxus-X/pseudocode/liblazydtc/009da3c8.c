/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da3c8
 */

void ossl_statem_set_in_handshake(long param_1,int param_2)

{
  int iVar1;
  
  iVar1 = 1;
  if (param_2 == 0) {
    iVar1 = -1;
  }
  *(int *)(param_1 + 0x6c) = *(int *)(param_1 + 0x6c) + iVar1;
  return;
}

