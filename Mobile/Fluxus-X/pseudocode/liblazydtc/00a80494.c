/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80494
 */

undefined8 ossl_encode_der_length(undefined8 param_1,ulong param_2)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_2 >> 0x10 == 0) {
    if (param_2 < 0x100) {
      if ((0x7f < param_2) && (uVar1 = WPACKET_put_bytes__(param_1,0x81,1), (int)uVar1 == 0)) {
        return uVar1;
      }
      uVar1 = 1;
    }
    else {
      uVar1 = WPACKET_put_bytes__(param_1,0x82,1);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
      uVar1 = 2;
    }
    uVar1 = WPACKET_put_bytes__(param_1,param_2,uVar1);
    if ((int)uVar1 != 0) {
      uVar1 = 1;
    }
  }
  return uVar1;
}

