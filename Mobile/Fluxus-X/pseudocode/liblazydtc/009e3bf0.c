/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e3bf0
 */

bool tls_construct_key_update(long param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = WPACKET_put_bytes__(param_2,(long)*(int *)(param_1 + 0xba4),1);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x285,"tls_construct_key_update");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
  }
  else {
    *(undefined4 *)(param_1 + 0xba4) = 0xffffffff;
  }
  return iVar1 != 0;
}

