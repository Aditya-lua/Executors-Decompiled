/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8068
 */

undefined8 ssl_hmac_old_final(long param_1,uchar *param_2,ulong *param_3)

{
  int iVar1;
  undefined8 uVar2;
  uint local_14;
  
  iVar1 = HMAC_Final(*(HMAC_CTX **)(param_1 + 8),param_2,&local_14);
  if (iVar1 < 1) {
    uVar2 = 0;
  }
  else {
    if (param_3 != (ulong *)0x0) {
      *param_3 = (ulong)local_14;
    }
    uVar2 = 1;
  }
  return uVar2;
}

