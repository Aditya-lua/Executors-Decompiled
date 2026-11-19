/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8a708
 */

undefined4 psa_verify_hash_complete(int *param_1)

{
  byte bVar1;
  undefined4 uVar2;
  
  bVar1 = *(byte *)(param_1 + 2);
  if (*param_1 == 0) {
    *(byte *)(param_1 + 2) = bVar1 | 1;
    return 0xffffff77;
  }
  if ((bVar1 & 1) == 0) {
    uVar2 = 0xffffff79;
    if (*param_1 == 1) {
      uVar2 = 0xffffff7a;
    }
    param_1[3] = 0;
  }
  else {
    uVar2 = 0xffffff77;
  }
  *(byte *)(param_1 + 2) = bVar1 | 1;
  *param_1 = 0;
  return uVar2;
}

