/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ae940
 */

void SSL_CTX_set_ciphersuites(long param_1)

{
  int iVar1;
  
  iVar1 = FUN_009ae98c(param_1 + 0x20);
  if (iVar1 != 0) {
    if (*(long *)(param_1 + 0x10) != 0) {
      FUN_009aea44(param_1,(long *)(param_1 + 0x10),param_1 + 0x18,*(undefined8 *)(param_1 + 0x20));
      return;
    }
  }
  return;
}

