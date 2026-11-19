/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b429bc
 */

uint ossl_read_der(undefined8 param_1,undefined8 param_2,undefined8 *param_3,undefined8 *param_4)

{
  BIO *a;
  ulong uVar1;
  uint uVar2;
  undefined8 *local_38;
  
  local_38 = (undefined8 *)0x0;
  a = (BIO *)ossl_bio_new_from_core_bio();
  if (a == (BIO *)0x0) {
    uVar2 = 0;
  }
  else {
    uVar1 = asn1_d2i_read_bio(a,&local_38);
    uVar2 = (uint)(uVar1 >> 0x1f) & 1 ^ 1;
    if (-1 < (int)uVar1) {
      *param_3 = local_38[1];
      *param_4 = *local_38;
      CRYPTO_free(local_38);
    }
    BIO_free(a);
  }
  return uVar2;
}

