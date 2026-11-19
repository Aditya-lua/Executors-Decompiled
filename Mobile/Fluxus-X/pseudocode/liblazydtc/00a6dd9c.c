/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6dd9c
 */

undefined4 EVP_PKEY_get_base_id(int *param_1)

{
  EVP_PKEY_ASN1_METHOD *pEVar1;
  undefined4 uVar2;
  ENGINE *local_18;
  
  pEVar1 = EVP_PKEY_asn1_find(&local_18,*param_1);
  if (pEVar1 == (EVP_PKEY_ASN1_METHOD *)0x0) {
    uVar2 = 0;
  }
  else {
    uVar2 = *(undefined4 *)pEVar1;
  }
  ENGINE_finish(local_18);
  return uVar2;
}

