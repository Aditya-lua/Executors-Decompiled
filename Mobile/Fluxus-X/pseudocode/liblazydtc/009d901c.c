/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d901c
 */

undefined8 tls_construct_stoc_session_ticket(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((*(int *)(param_1 + 0xa98) == 0) || (iVar1 = tls_use_ticket(param_1), iVar1 == 0)) {
    *(undefined4 *)(param_1 + 0xa98) = 0;
    uVar2 = 2;
  }
  else {
    iVar1 = WPACKET_put_bytes__(param_2,0x23,2);
    if ((iVar1 == 0) || (iVar1 = WPACKET_put_bytes__(param_2,0,2), iVar1 == 0)) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_srvr.c",0x57d,"tls_construct_stoc_session_ticket");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
  }
  return uVar2;
}

