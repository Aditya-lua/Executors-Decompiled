/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cce04
 */

undefined8 ssl3_release_write_buffer(long param_1)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  
  lVar1 = *(long *)(param_1 + 0xc70);
  if (lVar1 != 0) {
    puVar2 = (undefined8 *)(param_1 + lVar1 * 0x30 + 0xc78);
    do {
      lVar1 = lVar1 + -1;
      if (*(int *)(puVar2 + 5) == 0) {
        puVar3 = (undefined8 *)(param_1 + lVar1 * 0x30 + 0xca8);
        CRYPTO_free((void *)*puVar2);
      }
      else {
        *(undefined4 *)(puVar2 + 5) = 0;
        puVar3 = puVar2;
      }
      puVar2 = puVar2 + -6;
      *puVar3 = 0;
    } while (lVar1 != 0);
  }
  *(undefined8 *)(param_1 + 0xc70) = 0;
  return 1;
}

