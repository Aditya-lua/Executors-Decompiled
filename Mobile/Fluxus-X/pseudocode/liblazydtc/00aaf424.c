/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf424
 */

int OBJ_find_sigid_by_algs(int *psignid,int dig_nid,int pkey_nid)

{
  int iVar1;
  undefined1 **ppuVar2;
  undefined1 *local_38;
  undefined1 auStack_30 [4];
  int local_2c;
  int iStack_28;
  
  local_38 = auStack_30;
  local_2c = dig_nid;
  iStack_28 = pkey_nid;
  if ((DAT_00d22198 == 0) || (iVar1 = OPENSSL_sk_find(DAT_00d22198,auStack_30), iVar1 < 0)) {
    ppuVar2 = OBJ_bsearch_(&local_38,&PTR_LAB_00c79d98,0x2c,8,(cmp *)&LAB_00aaf680);
    if (ppuVar2 == (undefined1 **)0x0) {
      return 0;
    }
  }
  else {
    local_38 = (undefined1 *)OPENSSL_sk_value(DAT_00d22198,iVar1);
    ppuVar2 = &local_38;
  }
  if (psignid != (int *)0x0) {
    *psignid = *(int *)*ppuVar2;
  }
  return 1;
}

