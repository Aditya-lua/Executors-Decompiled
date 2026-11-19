/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00eac
 */

undefined8 FUN_00a00eac(long param_1,undefined8 param_2)

{
  long *ptr;
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  
  ptr = (long *)CRYPTO_zalloc(0x10,"crypto/bio/bss_mem.c",0x6f);
  if (ptr != (long *)0x0) {
    lVar1 = BUF_MEM_new_ex(param_2);
    *ptr = lVar1;
    if (lVar1 != 0) {
      puVar2 = (undefined8 *)CRYPTO_zalloc(0x20,"crypto/bio/bss_mem.c",0x77);
      ptr[1] = (long)puVar2;
      if (puVar2 != (undefined8 *)0x0) {
        puVar3 = (undefined8 *)*ptr;
        uVar4 = puVar3[2];
        puVar2[3] = puVar3[3];
        puVar2[2] = uVar4;
        uVar4 = *puVar3;
        puVar2[1] = puVar3[1];
        *puVar2 = uVar4;
        *(undefined8 *)(param_1 + 0x28) = 0x100000001;
        *(undefined4 *)(param_1 + 0x38) = 0xffffffff;
        *(long **)(param_1 + 0x40) = ptr;
        return 1;
      }
      BUF_MEM_free((BUF_MEM *)*ptr);
    }
    CRYPTO_free(ptr);
  }
  return 0;
}

