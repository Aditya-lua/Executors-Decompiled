/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d2f08
 */

undefined8 tls_construct_ctos_npn(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((*(long *)(*(long *)(param_1 + 0x9a8) + 0x2c8) == 0) ||
     ((*(long *)(param_1 + 0x240) != 0 && (*(long *)(param_1 + 0x2c8) != 0)))) {
    uVar2 = 2;
  }
  else {
    iVar1 = WPACKET_put_bytes__(param_2,0x3374,2);
    if ((iVar1 == 0) || (iVar1 = WPACKET_put_bytes__(param_2,0,2), iVar1 == 0)) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",399,"tls_construct_ctos_npn");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
  }
  return uVar2;
}

