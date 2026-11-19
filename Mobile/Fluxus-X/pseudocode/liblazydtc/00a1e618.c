/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e618
 */

int DH_compute_key(uchar *key,BIGNUM *pub_key,DH *dh)

{
  uchar *puVar1;
  uint uVar2;
  ulong uVar3;
  ulong local_38;
  size_t local_28;
  
  local_28 = 0;
  local_38 = 1;
  uVar2 = (**(code **)&(dh[1].priv_key)->neg)();
  if (0 < (int)uVar2) {
    uVar3 = 0;
    do {
      puVar1 = key + uVar3;
      uVar3 = uVar3 + 1;
      local_38 = local_38 & *puVar1 == '\0';
      local_28 = local_28 + local_38;
    } while (uVar2 != uVar3);
    uVar2 = uVar2 - (int)local_28;
    memmove(key,key + local_28,(long)(int)uVar2);
    memset(key + (int)uVar2,0,local_28);
  }
  return uVar2;
}

