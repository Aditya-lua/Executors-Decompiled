/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b01ccc
 */

int X509_check_purpose(X509 *x,int id,int ca)

{
  int iVar1;
  undefined *puVar2;
  uint uVar3;
  int local_60 [12];
  
  iVar1 = ossl_x509v3_cache_extensions(x,id,ca);
  if (iVar1 == 0) {
    return -1;
  }
  if (id == -1) {
    return 1;
  }
  uVar3 = id - 1;
  if (8 < uVar3) {
    if (DAT_00d227e0 == 0) {
      return -1;
    }
    local_60[0] = id;
    iVar1 = OPENSSL_sk_find(DAT_00d227e0,local_60);
    if (iVar1 < 0) {
      return -1;
    }
    uVar3 = iVar1 + 9;
    if (uVar3 == 0xffffffff) {
      return -1;
    }
    if ((int)uVar3 < 0) {
      puVar2 = (undefined *)0x0;
      goto LAB_00b01d18;
    }
    if (8 < (int)uVar3) {
      puVar2 = (undefined *)OPENSSL_sk_value(DAT_00d227e0,iVar1);
      goto LAB_00b01d18;
    }
  }
  puVar2 = &DAT_00cc9a28 + (long)(int)uVar3 * 0x30;
LAB_00b01d18:
  iVar1 = (**(code **)(puVar2 + 0x10))(puVar2,x,ca);
  return iVar1;
}

