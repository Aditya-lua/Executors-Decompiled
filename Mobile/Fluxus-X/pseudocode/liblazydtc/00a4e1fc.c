/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e1fc
 */

undefined8 FUN_00a4e1fc(long param_1)

{
  undefined4 *ptr;
  long lVar1;
  undefined8 uVar2;
  
  ptr = (undefined4 *)CRYPTO_zalloc(0x28,"crypto/bio/bf_readbuff.c",0x37);
  uVar2 = 0;
  if (ptr != (undefined4 *)0x0) {
    *ptr = 0x1000;
    lVar1 = CRYPTO_zalloc(0x1000,"crypto/bio/bf_readbuff.c",0x3c);
    *(long *)(ptr + 2) = lVar1;
    if (lVar1 == 0) {
      CRYPTO_free(ptr);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
      *(undefined4 **)(param_1 + 0x40) = ptr;
      *(undefined4 *)(param_1 + 0x28) = 1;
      *(undefined4 *)(param_1 + 0x30) = 0;
    }
  }
  return uVar2;
}

