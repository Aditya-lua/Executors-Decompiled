/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13e20
 */

int X509_VERIFY_PARAM_inherit(X509_VERIFY_PARAM *to,X509_VERIFY_PARAM *from)

{
  uint uVar1;
  int iVar2;
  char *pcVar3;
  long lVar4;
  ulong uVar5;
  time_t tVar6;
  size_t __n;
  void *__dest;
  
  if (from == (X509_VERIFY_PARAM *)0x0) {
    return 1;
  }
  uVar1 = (uint)from->inh_flags | (uint)to->inh_flags;
  if ((uVar1 >> 4 & 1) != 0) {
    *(undefined4 *)&to->inh_flags = 0;
  }
  if ((uVar1 >> 3 & 1) != 0) {
    return 1;
  }
  iVar2 = from->purpose;
  if ((uVar1 >> 1 & 1) == 0) {
    if ((iVar2 != 0) && (((uVar1 & 1) != 0 || (to->purpose == 0)))) {
      to->purpose = iVar2;
    }
    if ((from->trust != 0) && (((uVar1 & 1) != 0 || (to->trust == 0)))) {
      to->trust = from->trust;
    }
    if ((from->depth != -1) && (((uVar1 & 1) != 0 || (to->depth == -1)))) {
      to->depth = from->depth;
    }
    if ((*(int *)&from->field_0x2c != -1) && (((uVar1 & 1) != 0 || (*(int *)&to->field_0x2c == -1)))
       ) {
      *(int *)&to->field_0x2c = *(int *)&from->field_0x2c;
    }
    uVar5 = to->flags;
    if (((uint)uVar5 >> 1 & 1) == 0) goto LAB_00b13ef4;
  }
  else {
    to->purpose = iVar2;
    iVar2 = from->depth;
    to->trust = from->trust;
    to->depth = iVar2;
    uVar5 = to->flags;
    *(undefined4 *)&to->field_0x2c = *(undefined4 *)&from->field_0x2c;
LAB_00b13ef4:
    tVar6 = from->check_time;
    uVar5 = uVar5 & 0xfffffffffffffffd;
    to->flags = uVar5;
    to->check_time = tVar6;
  }
  if ((uVar1 >> 2 & 1) != 0) {
    uVar5 = 0;
    to->flags = 0;
  }
  to->flags = uVar5 | from->flags;
  if (((uVar1 >> 1 & 1) == 0) &&
     ((from->policies == (stack_st_ASN1_OBJECT *)0x0 ||
      (((uVar1 & 1) == 0 && (to->policies != (stack_st_ASN1_OBJECT *)0x0)))))) {
LAB_00b13f54:
    iVar2 = (int)from[1].check_time;
    if ((iVar2 != 0) && (((uVar1 & 1) != 0 || ((int)to[1].check_time == 0)))) {
      *(int *)&to[1].check_time = iVar2;
    }
    if ((from[1].name != (char *)0x0) && (((uVar1 & 1) != 0 || (to[1].name == (char *)0x0))))
    goto LAB_00b13f84;
LAB_00b13fdc:
    pcVar3 = (char *)from[1].flags;
    if ((pcVar3 != (char *)0x0) && (((uVar1 & 1) != 0 || (to[1].flags == 0)))) {
LAB_00b13ff8:
      __n._0_4_ = from[1].purpose;
      __n._4_4_ = from[1].trust;
      if (__n == 0) {
        __n = strlen(pcVar3);
      }
      __dest = CRYPTO_malloc((int)__n + 1,"crypto/x509/x509_vpm.c",0xf7);
      if (__dest == (void *)0x0) {
        return 0;
      }
      memcpy(__dest,pcVar3,__n);
      *(undefined1 *)((long)__dest + __n) = 0;
      goto LAB_00b14038;
    }
  }
  else {
    iVar2 = X509_VERIFY_PARAM_set1_policies(to,from->policies);
    if (iVar2 == 0) {
      return 0;
    }
    if ((uVar1 >> 1 & 1) == 0) goto LAB_00b13f54;
    *(int *)&to[1].check_time = (int)from[1].check_time;
LAB_00b13f84:
    OPENSSL_sk_pop_free(to[1].name,&LAB_00b13e10);
    to[1].name = (char *)0x0;
    if (from[1].name != (char *)0x0) {
      pcVar3 = (char *)OPENSSL_sk_deep_copy(from[1].name,&LAB_00b1419c,&LAB_00b13e10);
      to[1].name = pcVar3;
      if (pcVar3 == (char *)0x0) {
        return 0;
      }
    }
    if ((uVar1 >> 1 & 1) == 0) goto LAB_00b13fdc;
    pcVar3 = (char *)from[1].flags;
    if (pcVar3 != (char *)0x0) goto LAB_00b13ff8;
    __n = 0;
    __dest = (void *)0x0;
LAB_00b14038:
    CRYPTO_free((void *)to[1].flags);
    to[1].flags = (ulong)__dest;
    to[1].purpose = (int)__n;
    to[1].trust = (int)(__n >> 0x20);
    if ((uVar1 >> 1 & 1) != 0) {
      lVar4 = *(long *)&from[1].depth;
      goto LAB_00b14074;
    }
  }
  lVar4 = *(long *)&from[1].depth;
  if (lVar4 == 0) {
    return 1;
  }
  if (((uVar1 & 1) == 0) && (*(long *)&to[1].depth != 0)) {
    return 1;
  }
LAB_00b14074:
  iVar2 = X509_VERIFY_PARAM_set1_ip(to,lVar4,from[1].policies);
  if (iVar2 == 0) {
    return 0;
  }
  return 1;
}

