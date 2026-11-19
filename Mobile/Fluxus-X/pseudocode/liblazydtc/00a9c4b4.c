/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c4b4
 */

undefined8 WPACKET_start_sub_packet_len__(long param_1,long param_2)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long lVar3;
  undefined1 auStack_28 [8];
  
  if (*(long *)(param_1 + 0x28) == 0) {
    uVar2 = 0;
  }
  else {
    if ((param_2 != 0) && ((*(byte *)(param_1 + 0x30) & 1) != 0)) {
      return 0;
    }
    puVar1 = (undefined8 *)CRYPTO_zalloc(0x28,"crypto/packet.c",0x162);
    if (puVar1 == (undefined8 *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/packet.c",0x163,"WPACKET_start_sub_packet_len__");
      ERR_set_error(0xf,0xc0100,0);
      uVar2 = 0;
    }
    else {
      *puVar1 = *(undefined8 *)(param_1 + 0x28);
      lVar3 = *(long *)(param_1 + 0x18);
      *(undefined8 **)(param_1 + 0x28) = puVar1;
      puVar1[2] = param_2;
      puVar1[3] = lVar3 + param_2;
      if (param_2 == 0) {
        puVar1[1] = 0;
      }
      else {
        puVar1[1] = lVar3;
        uVar2 = WPACKET_reserve_bytes(param_1,param_2,auStack_28);
        if ((int)uVar2 == 0) {
          return uVar2;
        }
        *(long *)(param_1 + 0x18) = param_2 + *(long *)(param_1 + 0x18);
        *(long *)(param_1 + 0x10) = param_2 + *(long *)(param_1 + 0x10);
      }
      uVar2 = 1;
    }
  }
  return uVar2;
}

