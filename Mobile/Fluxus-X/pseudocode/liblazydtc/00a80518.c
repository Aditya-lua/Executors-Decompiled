/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80518
 */

undefined8 ossl_encode_der_integer(undefined8 param_1,BIGNUM *param_2)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  undefined8 uVar5;
  ulong uVar6;
  long local_28;
  
  iVar2 = BN_is_negative(param_2);
  uVar5 = 0;
  if (iVar2 == 0) {
    iVar3 = BN_num_bits(param_2);
    iVar2 = iVar3 + 7;
    if (-1 < iVar3) {
      iVar2 = iVar3;
    }
    uVar5 = WPACKET_start_sub_packet(param_1);
    if ((int)uVar5 != 0) {
      uVar1 = (iVar2 >> 3) + 1;
      uVar6 = (ulong)(int)uVar1;
      iVar2 = WPACKET_put_bytes__(param_1,2,1);
      if ((uVar6 >> 0x10 & 0xffff) == 0) {
        uVar5 = 0;
        if (iVar2 != 0) {
          if (uVar1 < 0x100) {
            if ((0x7f < uVar1) && (uVar5 = WPACKET_put_bytes__(param_1,0x81,1), (int)uVar5 == 0)) {
              return uVar5;
            }
            uVar5 = 1;
          }
          else {
            uVar5 = WPACKET_put_bytes__(param_1,0x82,1);
            if ((int)uVar5 == 0) {
              return uVar5;
            }
            uVar5 = 2;
          }
          uVar5 = WPACKET_put_bytes__(param_1,uVar6,uVar5);
          if ((((int)uVar5 != 0) &&
              (uVar5 = WPACKET_allocate_bytes(param_1,uVar6,&local_28), (int)uVar5 != 0)) &&
             (uVar5 = WPACKET_close(param_1), (int)uVar5 != 0)) {
            if ((local_28 != 0) && (uVar4 = BN_bn2binpad(param_2,local_28,uVar1), uVar4 != uVar1)) {
              return 0;
            }
            uVar5 = 1;
          }
        }
      }
      else {
        uVar5 = 0;
      }
    }
  }
  return uVar5;
}

