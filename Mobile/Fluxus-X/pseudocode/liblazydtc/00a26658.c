/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a26658
 */

int i2d_ECDSA_SIG(ECDSA_SIG *sig,uchar **pp)

{
  int iVar1;
  BUF_MEM *a;
  undefined1 auStack_68 [56];
  int local_28;
  undefined4 uStack_24;
  
  if (pp == (uchar **)0x0) {
    iVar1 = WPACKET_init_null(auStack_68);
  }
  else {
    if (*pp == (uchar *)0x0) {
      a = BUF_MEM_new();
      if ((a == (BUF_MEM *)0x0) || (iVar1 = WPACKET_init_len(auStack_68,a,0), iVar1 == 0)) {
        BUF_MEM_free(a);
        return -1;
      }
      goto LAB_00a266d4;
    }
    iVar1 = WPACKET_init_static_len(auStack_68,*pp,0xffffffffffffffff,0);
  }
  a = (BUF_MEM *)0x0;
  if (iVar1 == 0) {
    return -1;
  }
LAB_00a266d4:
  iVar1 = ossl_encode_der_dsa_sig(auStack_68,sig->r,sig->s);
  if (((iVar1 == 0) || (iVar1 = WPACKET_get_total_written(auStack_68,&local_28), iVar1 == 0)) ||
     (iVar1 = WPACKET_finish(auStack_68), iVar1 == 0)) {
    BUF_MEM_free(a);
    WPACKET_cleanup(auStack_68);
    local_28 = -1;
  }
  else if (pp != (uchar **)0x0) {
    if (*pp == (uchar *)0x0) {
      *pp = (uchar *)a->data;
      a->data = (char *)0x0;
      BUF_MEM_free(a);
    }
    else {
      *pp = *pp + CONCAT44(uStack_24,local_28);
    }
  }
  return local_28;
}

