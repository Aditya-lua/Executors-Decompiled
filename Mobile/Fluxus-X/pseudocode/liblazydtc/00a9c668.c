/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c668
 */

undefined8 WPACKET_init_static_len(undefined8 *param_1,long param_2,ulong param_3,ulong param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined1 auStack_28 [8];
  
  if (param_4 - 1 < 7) {
    uVar4 = (1L << ((param_4 & 7) << 3)) + (param_4 - 1);
  }
  else {
    uVar4 = 0xffffffffffffffff;
  }
  if ((param_2 == 0) || (param_3 == 0)) {
    return 0;
  }
  if (param_3 <= uVar4) {
    uVar4 = param_3;
  }
  *param_1 = 0;
  param_1[1] = param_2;
  param_1[4] = uVar4;
  *(byte *)(param_1 + 6) = *(byte *)(param_1 + 6) & 0xfe;
  param_1[2] = 0;
  param_1[3] = 0;
  lVar2 = CRYPTO_zalloc(0x28,"crypto/packet.c",0x6b);
  param_1[5] = lVar2;
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/packet.c",0x6c,"wpacket_intern_init_len");
    ERR_set_error(0xf,0xc0100,0);
    uVar3 = 0;
  }
  else {
    if (param_4 != 0) {
      *(ulong *)(lVar2 + 0x10) = param_4;
      *(ulong *)(lVar2 + 0x18) = param_4;
      iVar1 = WPACKET_reserve_bytes(param_1,param_4,auStack_28);
      if (iVar1 == 0) {
        CRYPTO_free((void *)param_1[5]);
        param_1[5] = 0;
        return 0;
      }
      param_1[3] = param_4 + param_1[3];
      param_1[2] = param_4 + param_1[2];
      *(undefined8 *)(param_1[5] + 8) = 0;
    }
    uVar3 = 1;
  }
  return uVar3;
}

