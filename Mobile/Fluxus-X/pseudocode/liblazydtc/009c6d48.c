/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c6d48
 */

void tls13_generate_master_secret
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               long *param_5)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = ssl_handshake_md();
  iVar1 = EVP_MD_get_size();
  *param_5 = (long)iVar1;
  tls13_generate_secret(param_1,uVar2,param_3,0,0,param_2);
  return;
}

