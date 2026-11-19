/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5eb88
 */

undefined8 evp_cipher_set_asn1_aead_params(undefined8 param_1,long param_2,long param_3)

{
  undefined8 uVar1;
  
  if ((param_2 == 0) || (param_3 == 0)) {
    return 0;
  }
  uVar1 = ossl_asn1_type_set_octetstring_int
                    (param_2,*(undefined4 *)(param_3 + 0x14),param_3,*(undefined4 *)(param_3 + 0x10)
                    );
  return uVar1;
}

