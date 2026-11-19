/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ebf0c
 */

undefined8 FUN_009ebf0c(long param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  uVar3 = *(ulong *)(*(long *)(param_1 + 0x918) + 0x2d8);
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
    if (0x93a7f < (long)uVar3) {
      uVar3 = 0x93a80;
    }
  }
  else if (*(int *)(param_1 + 0x4d0) != 0) {
    uVar3 = 0;
  }
  iVar1 = WPACKET_put_bytes__(param_2,uVar3 & 0xffffffff,4);
  if (iVar1 == 0) {
    ERR_new();
    uVar2 = 0xe39;
  }
  else if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
           (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) &&
          ((iVar1 != 0x10000 &&
           ((iVar1 = WPACKET_put_bytes__(param_2,param_3,4), iVar1 == 0 ||
            (iVar1 = WPACKET_sub_memcpy__(param_2,param_4,8,1), iVar1 == 0)))))) {
    ERR_new();
    uVar2 = 0xe40;
  }
  else {
    iVar1 = WPACKET_start_sub_packet_len__(param_2,2);
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar2 = 0xe47;
  }
  ERR_set_debug("ssl/statem/statem_srvr.c",uVar2,"create_ticket_prequel");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

