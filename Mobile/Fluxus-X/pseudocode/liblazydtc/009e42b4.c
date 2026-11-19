/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e42b4
 */

bool tls_construct_change_cipher_spec(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = WPACKET_put_bytes__(param_2,1,1);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x379,"tls_construct_change_cipher_spec");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
  }
  return iVar1 != 0;
}

