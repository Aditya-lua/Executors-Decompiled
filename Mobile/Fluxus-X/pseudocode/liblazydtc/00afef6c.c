/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afef6c
 */

int NAME_CONSTRAINTS_check(X509 *x,NAME_CONSTRAINTS *nc)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  X509_NAME *name;
  X509_NAME_ENTRY *ne;
  undefined8 uVar7;
  undefined4 local_50 [2];
  X509_NAME *local_48;
  
  name = X509_get_subject_name(x);
  uVar1 = X509_NAME_entry_count(name);
  uVar2 = OPENSSL_sk_num(x[1].ex_kusage);
  uVar2 = uVar2 & ((int)uVar2 >> 0x1f ^ 0xffffffffU);
  uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
  if ((int)uVar1 <= (int)(uVar2 ^ 0x7fffffff)) {
    uVar3 = OPENSSL_sk_num(nc->permittedSubtrees);
    uVar4 = OPENSSL_sk_num(nc->excludedSubtrees);
    uVar4 = uVar4 & ((int)uVar4 >> 0x1f ^ 0xffffffffU);
    uVar3 = uVar3 & ((int)uVar3 >> 0x1f ^ 0xffffffffU);
    if ((int)uVar3 <= (int)(uVar4 ^ 0x7fffffff)) {
      uVar2 = uVar2 + uVar1;
      if (uVar2 != 0) {
        uVar1 = 0;
        if (uVar2 != 0) {
          uVar1 = 0x100000 / uVar2;
        }
        if (uVar1 < uVar4 + uVar3) {
          return 1;
        }
      }
      iVar5 = X509_NAME_entry_count(name);
      if (0 < iVar5) {
        local_50[0] = 4;
        local_48 = name;
        iVar5 = FUN_00aff100(local_50,nc);
        if (iVar5 != 0) {
          return iVar5;
        }
        iVar5 = -1;
        local_50[0] = 1;
        while (iVar5 = X509_NAME_get_index_by_NID(name,0x30,iVar5), iVar5 != -1) {
          ne = X509_NAME_get_entry(name,iVar5);
          local_48 = (X509_NAME *)X509_NAME_ENTRY_get_data(ne);
          if (*(int *)((long)&local_48->entries + 4) != 0x16) {
            return 0x35;
          }
          iVar6 = FUN_00aff100(local_50,nc);
          if (iVar6 != 0) {
            return iVar6;
          }
        }
      }
      iVar5 = OPENSSL_sk_num(x[1].ex_kusage);
      if (iVar5 < 1) {
        return 0;
      }
      iVar5 = 0;
      do {
        uVar7 = OPENSSL_sk_value(x[1].ex_kusage,iVar5);
        iVar6 = FUN_00aff100(uVar7,nc);
        if (iVar6 != 0) {
          return iVar6;
        }
        iVar5 = iVar5 + 1;
        iVar6 = OPENSSL_sk_num(x[1].ex_kusage);
      } while (iVar5 < iVar6);
      return 0;
    }
  }
  return 1;
}

