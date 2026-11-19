/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b25f30
 */

undefined8 FUN_00b25f30(void *param_1,void *param_2)

{
  undefined8 uVar1;
  
  memcpy(param_2,param_1,0x78);
  *(undefined8 *)((long)param_2 + 0x40) = 0;
  *(undefined8 *)((long)param_2 + 0x48) = 0;
  *(undefined8 *)((long)param_2 + 0x38) = 0;
  uVar1 = ossl_siv128_copy_ctx((long)param_2 + 0x18,(long)param_1 + 0x18);
  if ((int)uVar1 != 0) {
    if (*(long *)((long)param_2 + 0x60) != 0) {
      EVP_CIPHER_up_ref();
    }
    if (*(long *)((long)param_2 + 0x58) != 0) {
      EVP_CIPHER_up_ref();
    }
    uVar1 = 1;
  }
  return uVar1;
}

