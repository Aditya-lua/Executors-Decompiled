/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0cd48
 */

int X509_TRUST_get_by_id(int id)

{
  int iVar1;
  uint uVar2;
  int local_38 [10];
  
  uVar2 = id - 1;
  if (7 < uVar2) {
    if (DAT_00d227e8 == 0) {
      return -1;
    }
    local_38[0] = id;
    iVar1 = OPENSSL_sk_find(DAT_00d227e8,local_38);
    uVar2 = iVar1 + 8;
    if (iVar1 < 0) {
      uVar2 = 0xffffffff;
    }
  }
  return uVar2;
}

