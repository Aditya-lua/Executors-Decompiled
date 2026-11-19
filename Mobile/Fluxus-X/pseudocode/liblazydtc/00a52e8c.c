/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52e8c
 */

void FUN_00a52e8c(long param_1,long param_2)

{
  int iVar1;
  
  iVar1 = OPENSSL_sk_find(*(undefined8 *)(param_1 + 8));
  while (-1 < iVar1) {
    OPENSSL_sk_delete(*(undefined8 *)(param_1 + 8),iVar1);
    *(undefined4 *)(param_1 + 0x18) = 0;
    iVar1 = OPENSSL_sk_find(*(undefined8 *)(param_1 + 8),param_2);
  }
  if (*(long *)(param_1 + 0x10) == param_2) {
    engine_unlocked_finish(param_2,0);
    *(undefined8 *)(param_1 + 0x10) = 0;
  }
  return;
}

