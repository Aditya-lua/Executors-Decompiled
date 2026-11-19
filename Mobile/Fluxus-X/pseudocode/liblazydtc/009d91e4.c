/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d91e4
 */

undefined8 tls_construct_stoc_next_proto_neg(long param_1,undefined8 param_2)

{
  int iVar1;
  code *pcVar2;
  undefined4 local_2c;
  undefined8 local_28;
  
  iVar1 = *(int *)(param_1 + 0x484);
  *(undefined4 *)(param_1 + 0x484) = 0;
  if (iVar1 != 0) {
    pcVar2 = *(code **)(*(long *)(param_1 + 0x9a8) + 0x2b8);
    if (pcVar2 != (code *)0x0) {
      iVar1 = (*pcVar2)(param_1,&local_28,&local_2c,
                        *(undefined8 *)(*(long *)(param_1 + 0x9a8) + 0x2c0));
      if (iVar1 != 0) {
        return 1;
      }
      iVar1 = WPACKET_put_bytes__(param_2,0x3374,2);
      if ((iVar1 == 0) || (iVar1 = WPACKET_sub_memcpy__(param_2,local_28,local_2c,2), iVar1 == 0)) {
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0x5be,"tls_construct_stoc_next_proto_neg");
        ossl_statem_fatal(param_1,0x50,0xc0103,0);
        return 0;
      }
      *(undefined4 *)(param_1 + 0x484) = 1;
      return 1;
    }
  }
  return 2;
}

