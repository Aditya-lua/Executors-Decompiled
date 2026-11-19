/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d3280
 */

undefined8 tls_construct_ctos_sct(long param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = 2;
  if ((param_4 == 0) && (*(long *)(param_1 + 0xb68) != 0)) {
    iVar1 = WPACKET_put_bytes__(param_2,0x12,2);
    if ((iVar1 == 0) || (iVar1 = WPACKET_put_bytes__(param_2,0,2), iVar1 == 0)) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",500,"tls_construct_ctos_sct");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
  }
  return uVar2;
}

