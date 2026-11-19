/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acb2ac
 */

void RC2_ecb_encrypt(uchar *in,uchar *out,RC2_KEY *key,int enc)

{
  ulong local_30;
  ulong local_28;
  
  local_30 = (ulong)*(uint *)in;
  local_28 = (ulong)*(uint *)(in + 4);
  if (enc == 0) {
    RC2_decrypt(&local_30,key);
  }
  else {
    RC2_encrypt(&local_30,key);
  }
  *out = (uchar)local_30;
  out[1] = (uchar)(local_30 >> 8);
  out[2] = (uchar)(local_30 >> 0x10);
  out[3] = (uchar)(local_30 >> 0x18);
  out[4] = (uchar)local_28;
  out[5] = (uchar)(local_28 >> 8);
  out[6] = (uchar)(local_28 >> 0x10);
  out[7] = (uchar)(local_28 >> 0x18);
  return;
}

