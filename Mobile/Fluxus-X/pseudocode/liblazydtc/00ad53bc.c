/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad53bc
 */

void RSA_padding_add_PKCS1_OAEP_mgf1
               (undefined8 param_1,undefined4 param_2,undefined8 param_3,undefined4 param_4,
               undefined8 param_5,undefined4 param_6,undefined8 param_7,undefined8 param_8)

{
  ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex
            (0,param_1,param_2,param_3,param_4,param_5,param_6,param_7,param_8);
  return;
}

