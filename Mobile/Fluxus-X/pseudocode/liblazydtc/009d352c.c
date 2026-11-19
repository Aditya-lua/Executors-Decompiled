/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d352c
 */

undefined8 tls_construct_ctos_psk_kex_modes(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  uVar3 = *(ulong *)(param_1 + 0x9e8);
  iVar1 = WPACKET_put_bytes__(param_2,0x2d,2);
  if (((((iVar1 == 0) || (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) ||
       (iVar1 = WPACKET_start_sub_packet_len__(param_2,1), iVar1 == 0)) ||
      ((iVar1 = WPACKET_put_bytes__(param_2,1,1), iVar1 == 0 ||
       ((((uint)uVar3 >> 10 & 1) != 0 && (iVar1 = WPACKET_put_bytes__(param_2,0,1), iVar1 == 0))))))
     || ((iVar1 = WPACKET_close(param_2), iVar1 == 0 || (iVar1 = WPACKET_close(param_2), iVar1 == 0)
         ))) {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x244,"tls_construct_ctos_psk_kex_modes");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar2 = 0;
  }
  else {
    uVar2 = 1;
    *(uint *)(param_1 + 0xb28) = (uint)((uVar3 & 0x400) >> 10) | 2;
  }
  return uVar2;
}

