/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d9f8c
 */

undefined8 tls_construct_stoc_cryptopro_bug(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined4 local_30;
  
  local_30 = 0x17020203;
  uStack_48 = 0x9020203852a0606;
  local_50 = 0x8301e302000e8fd;
  uStack_38 = 0x852a060608301602;
  uStack_40 = 0x203852a06060830;
  if (((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x18) & 0xfffe) == 0x80) &&
     (iVar1 = SSL_get_options(), iVar1 < 0)) {
    iVar1 = WPACKET_memcpy(param_2,&local_50,0x24);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_srvr.c",0x746,"tls_construct_stoc_cryptopro_bug");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
  }
  else {
    uVar2 = 2;
  }
  return uVar2;
}

