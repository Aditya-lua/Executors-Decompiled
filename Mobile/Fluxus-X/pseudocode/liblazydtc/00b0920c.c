/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0920c
 */

int X509_cmp(X509 *a,X509 *b)

{
  int iVar1;
  X509_POLICY_CACHE *__n;
  uint uVar2;
  
  if (a == b) {
    uVar2 = 0;
  }
  else {
    X509_check_purpose(a,-1,0);
    X509_check_purpose(b,-1,0);
    if ((((*(byte *)((long)&a[1].name + 2) >> 4 & 1) == 0) &&
        ((*(byte *)((long)&b[1].name + 2) >> 4 & 1) == 0)) &&
       (iVar1 = memcmp(&a[1].akid,&b[1].akid,0x14), iVar1 != 0)) {
      uVar2 = iVar1 >> 0x1f | 1;
    }
    else {
      uVar2 = 0;
      if ((*(int *)&a->crldp == 0) && (uVar2 = 0, *(int *)&b->crldp == 0)) {
        __n = a->policy_cache;
        if ((long)__n < (long)b->policy_cache) {
          uVar2 = 0xffffffff;
        }
        else if ((long)b->policy_cache < (long)__n) {
          uVar2 = 1;
        }
        else {
          iVar1 = memcmp(a->akid,b->akid,(size_t)__n);
          uVar2 = (uint)(0 < iVar1);
          if (iVar1 < 0) {
            uVar2 = 0xffffffff;
          }
        }
      }
    }
  }
  return uVar2;
}

