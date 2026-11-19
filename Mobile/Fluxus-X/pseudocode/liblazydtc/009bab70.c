/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bab70
 */

undefined8 FUN_009bab70(long param_1,long param_2)

{
  X509_STORE *pXVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  
  puVar2 = *(undefined8 **)(param_1 + 0x18);
  if (puVar2 == (undefined8 *)0x0) {
    lVar5 = *(long *)(param_1 + 0x20);
    if (lVar5 == 0) {
      return 1;
    }
    puVar2 = *(undefined8 **)(lVar5 + 0x9a8);
    lVar5 = *(long *)(lVar5 + 0x898);
    if (puVar2 == (undefined8 *)0x0) {
      uVar3 = 0;
      uVar4 = 0;
      pXVar1 = *(X509_STORE **)(lVar5 + 0x1d0);
      goto joined_r0x009babd0;
    }
  }
  else {
    lVar5 = puVar2[0x2b];
  }
  uVar3 = *puVar2;
  uVar4 = puVar2[0x88];
  pXVar1 = *(X509_STORE **)(lVar5 + 0x1d0);
joined_r0x009babd0:
  if (pXVar1 == (X509_STORE *)0x0) {
    pXVar1 = X509_STORE_new();
    *(X509_STORE **)(lVar5 + 0x1d0) = pXVar1;
    if (pXVar1 == (X509_STORE *)0x0) {
      return 0;
    }
  }
  if ((param_2 == 0) ||
     (uVar3 = X509_STORE_load_file_ex(pXVar1,param_2,uVar3,uVar4), (int)uVar3 != 0)) {
    return 1;
  }
  return uVar3;
}

