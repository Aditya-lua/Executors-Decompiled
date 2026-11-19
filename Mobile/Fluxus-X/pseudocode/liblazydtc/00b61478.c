/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b61478
 */

undefined8 FUN_00b61478(long param_1)

{
  int iVar1;
  void *d;
  undefined8 uVar2;
  
  if ((*(byte *)(param_1 + 0x18) & 1) == 0) {
    uVar2 = 1;
  }
  else {
    *(byte *)(param_1 + 0x18) = *(byte *)(param_1 + 0x18) & 0xfe;
    d = (void *)CRYPTO_zalloc(*(undefined8 *)(param_1 + 0x170),
                              "providers/implementations/signature/sm2_sig.c",0x104);
    if (((d == (void *)0x0) ||
        (iVar1 = ossl_sm2_compute_z_digest
                           (d,*(undefined8 *)(param_1 + 0x160),*(undefined8 *)(param_1 + 0x178),
                            *(undefined8 *)(param_1 + 0x180),*(undefined8 *)(param_1 + 0x10)),
        iVar1 == 0)) ||
       (iVar1 = EVP_DigestUpdate(*(EVP_MD_CTX **)(param_1 + 0x168),d,*(size_t *)(param_1 + 0x170)),
       iVar1 == 0)) {
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
    CRYPTO_free(d);
  }
  return uVar2;
}

