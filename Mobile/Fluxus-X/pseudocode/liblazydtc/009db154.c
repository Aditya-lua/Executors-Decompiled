/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009db154
 */

bool statem_flush(long param_1)

{
  bool bVar1;
  long lVar2;
  
  *(undefined4 *)(param_1 + 0x28) = 2;
  lVar2 = BIO_ctrl(*(BIO **)(param_1 + 0x18),0xb,0,(void *)0x0);
  bVar1 = 0 < (int)lVar2;
  if (bVar1) {
    *(undefined4 *)(param_1 + 0x28) = 1;
  }
  return bVar1;
}

