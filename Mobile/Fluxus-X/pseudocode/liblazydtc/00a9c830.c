/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c830
 */

undefined8 WPACKET_init_len(long *param_1,long param_2,ulong param_3)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined1 auStack_28 [8];
  
  if (param_2 == 0) {
    return 0;
  }
  *param_1 = param_2;
  param_1[1] = 0;
  if (param_3 - 1 < 7) {
    lVar3 = (1L << ((param_3 & 7) << 3)) + (param_3 - 1);
  }
  else {
    lVar3 = -1;
  }
  param_1[4] = lVar3;
  *(byte *)(param_1 + 6) = *(byte *)(param_1 + 6) & 0xfe;
  param_1[2] = 0;
  param_1[3] = 0;
  lVar3 = CRYPTO_zalloc(0x28,"crypto/packet.c",0x6b);
  param_1[5] = lVar3;
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/packet.c",0x6c,"wpacket_intern_init_len");
    ERR_set_error(0xf,0xc0100,0);
    uVar2 = 0;
  }
  else {
    if (param_3 != 0) {
      *(ulong *)(lVar3 + 0x10) = param_3;
      *(ulong *)(lVar3 + 0x18) = param_3;
      iVar1 = WPACKET_reserve_bytes(param_1,param_3,auStack_28);
      if (iVar1 == 0) {
        CRYPTO_free((void *)param_1[5]);
        param_1[5] = 0;
        return 0;
      }
      param_1[3] = param_3 + param_1[3];
      param_1[2] = param_3 + param_1[2];
      *(undefined8 *)(param_1[5] + 8) = 0;
    }
    uVar2 = 1;
  }
  return uVar2;
}

