/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69d28
 */

int EVP_PBE_find(int type,int pbe_nid,int *pcnid,int *pmnid,undefined1 **pkeygen)

{
  undefined4 uVar1;
  void *pvVar2;
  int local_50;
  int iStack_4c;
  
  if (pbe_nid == 0) {
    return 0;
  }
  local_50 = type;
  iStack_4c = pbe_nid;
  if (DAT_00d21b40 != 0) {
    uVar1 = OPENSSL_sk_find(DAT_00d21b40,&local_50);
    pvVar2 = (void *)OPENSSL_sk_value(DAT_00d21b40,uVar1);
    if (pvVar2 != (void *)0x0) goto LAB_00a69da0;
  }
  pvVar2 = OBJ_bsearch_(&local_50,&DAT_00c5e550,0x1d,0x20,(cmp *)&LAB_00a69e6c);
  if (pvVar2 == (void *)0x0) {
    return 0;
  }
LAB_00a69da0:
  if (pcnid != (int *)0x0) {
    *pcnid = *(int *)((long)pvVar2 + 8);
  }
  if (pmnid != (int *)0x0) {
    *pmnid = *(int *)((long)pvVar2 + 0xc);
  }
  if (pkeygen != (undefined1 **)0x0) {
    *pkeygen = *(undefined1 **)((long)pvVar2 + 0x10);
  }
  return 1;
}

