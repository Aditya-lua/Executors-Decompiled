/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a9674
 */

undefined8 ssl3_get_req_cert_type(int *param_1,undefined8 param_2)

{
  uint uVar1;
  undefined8 uVar2;
  int iVar3;
  long lVar4;
  uint local_24;
  
  local_24 = 0;
  lVar4 = *(long *)(*(long *)(param_1 + 0x226) + 0x188);
  if (lVar4 == 0) {
    ssl_set_sig_mask(&local_24,param_1,0x5000e);
    iVar3 = *param_1;
    uVar1 = *(uint *)(*(long *)(param_1 + 0xb8) + 0x1c);
    if ((0x300 < iVar3) && ((uVar1 >> 4 & 1) != 0)) {
      uVar2 = WPACKET_put_bytes__(param_2,0x16,1);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      uVar2 = WPACKET_put_bytes__(param_2,0x43,1);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      uVar2 = WPACKET_put_bytes__(param_2,0x44,1);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      uVar2 = WPACKET_put_bytes__(param_2,0xee,1);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      uVar2 = WPACKET_put_bytes__(param_2,0xef,1);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      iVar3 = *param_1;
    }
    if (((uVar1 >> 9 & 1) != 0) && (0x302 < iVar3)) {
      uVar2 = WPACKET_put_bytes__(param_2,0x43,1);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      uVar2 = WPACKET_put_bytes__(param_2,0x44,1);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      iVar3 = *param_1;
    }
    if (((((uVar1 >> 1 & 1) == 0) || (iVar3 != 0x300)) ||
        ((uVar2 = WPACKET_put_bytes__(param_2,5,1), (int)uVar2 != 0 &&
         ((((byte)local_24 >> 1 & 1) != 0 ||
          (uVar2 = WPACKET_put_bytes__(param_2,6,1), (int)uVar2 != 0)))))) &&
       ((((local_24 & 1) != 0 || (uVar2 = WPACKET_put_bytes__(param_2,1,1), (int)uVar2 != 0)) &&
        ((((local_24 >> 1 & 1) != 0 || (uVar2 = WPACKET_put_bytes__(param_2,2,1), (int)uVar2 != 0))
         && ((*param_1 < 0x301 ||
             ((((byte)local_24 >> 3 & 1) != 0 ||
              (uVar2 = WPACKET_put_bytes__(param_2,0x40,1), (int)uVar2 != 0)))))))))) {
      uVar2 = 1;
    }
  }
  else {
    uVar2 = WPACKET_memcpy(param_2,lVar4,*(undefined8 *)(*(long *)(param_1 + 0x226) + 400));
  }
  return uVar2;
}

