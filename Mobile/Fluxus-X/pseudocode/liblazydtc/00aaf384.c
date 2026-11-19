/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf384
 */

int OBJ_find_sigid_algs(int signid,int *pdig_nid,int *ppkey_nid)

{
  undefined4 uVar1;
  void *pvVar2;
  int local_40 [4];
  
  local_40[0] = signid;
  if (DAT_00d22190 != 0) {
    uVar1 = OPENSSL_sk_find(DAT_00d22190,local_40);
    pvVar2 = (void *)OPENSSL_sk_value(DAT_00d22190,uVar1);
    if (pvVar2 != (void *)0x0) goto LAB_00aaf3f4;
  }
  pvVar2 = OBJ_bsearch_(local_40,&LAB_007741e0,0x31,0xc,(cmp *)&LAB_00aaf670);
  if (pvVar2 == (void *)0x0) {
    return 0;
  }
LAB_00aaf3f4:
  if (pdig_nid != (int *)0x0) {
    *pdig_nid = *(int *)((long)pvVar2 + 4);
  }
  if (ppkey_nid != (int *)0x0) {
    *ppkey_nid = *(int *)((long)pvVar2 + 8);
  }
  return 1;
}

