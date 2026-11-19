/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a91890
 */

void CAST_ecb_encrypt(uchar *in,uchar *out,CAST_KEY *key,int enc)

{
  uint uVar1;
  uint local_18;
  uint local_14;
  
  uVar1 = (*(uint *)in & 0xff00ff00) >> 8 | (*(uint *)in & 0xff00ff) << 8;
  local_18 = uVar1 >> 0x10 | uVar1 << 0x10;
  uVar1 = (*(uint *)(in + 4) & 0xff00ff00) >> 8 | (*(uint *)(in + 4) & 0xff00ff) << 8;
  local_14 = uVar1 >> 0x10 | uVar1 << 0x10;
  if (enc == 0) {
    CAST_decrypt(&local_18,key);
  }
  else {
    CAST_encrypt(&local_18,key);
  }
  *out = (uchar)(local_18 >> 0x18);
  out[3] = (uchar)local_18;
  out[1] = (uchar)(local_18 >> 0x10);
  out[2] = (uchar)(local_18 >> 8);
  out[4] = (uchar)(local_14 >> 0x18);
  out[5] = (uchar)(local_14 >> 0x10);
  out[6] = (uchar)(local_14 >> 8);
  out[7] = (uchar)local_14;
  return;
}

