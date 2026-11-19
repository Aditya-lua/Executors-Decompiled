/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e8c80
 */

undefined8 tls_construct_cert_status(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = WPACKET_put_bytes__(param_2,(long)*(int *)(param_1 + 0xa60),1);
  if ((iVar1 == 0) ||
     (iVar1 = WPACKET_sub_memcpy__
                        (param_2,*(undefined8 *)(param_1 + 0xa88),*(undefined8 *)(param_1 + 0xa90),3
                        ), iVar1 == 0)) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0xfcb,"tls_construct_cert_status_body");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar2 = 0;
  }
  else {
    uVar2 = 1;
  }
  return uVar2;
}

