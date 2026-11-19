/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d2ba4
 */

undefined8 tls_construct_ctos_sig_algs(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 local_28;
  
  iVar1 = *(int *)(param_1 + 0xa0c);
  if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
    if (iVar1 < 0x303) {
      return 2;
    }
  }
  else {
    if (iVar1 == 0x100) {
      return 2;
    }
    if (0xfefd < iVar1) {
      return 2;
    }
  }
  uVar2 = tls12_get_psigalgs(param_1,1,&local_28);
  iVar1 = WPACKET_put_bytes__(param_2,0xd,2);
  if ((((iVar1 == 0) || (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) ||
      (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) ||
     (((iVar1 = tls12_copy_sigalgs(param_1,param_2,local_28,uVar2), iVar1 == 0 ||
       (iVar1 = WPACKET_close(param_2), iVar1 == 0)) || (iVar1 = WPACKET_close(param_2), iVar1 == 0)
      ))) {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x13a,"tls_construct_ctos_sig_algs");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar2 = 0;
  }
  else {
    uVar2 = 1;
  }
  return uVar2;
}

