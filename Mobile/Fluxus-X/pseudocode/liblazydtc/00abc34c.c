/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc34c
 */

void PKCS8_decrypt_ex(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
                     undefined8 param_5)

{
  undefined8 uVar1;
  undefined8 local_48;
  undefined8 local_38;
  
  X509_SIG_get0(param_1,&local_38,&local_48);
  uVar1 = PKCS8_PRIV_KEY_INFO_it();
  PKCS12_item_decrypt_d2i_ex(local_38,uVar1,param_2,param_3,local_48,1,param_4,param_5);
  return;
}

