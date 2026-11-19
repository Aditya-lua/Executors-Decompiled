/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e86c
 */

undefined8 ossl_dh_buf2key(undefined8 param_1,uchar *param_2,int param_3)

{
  int iVar1;
  BIGNUM *a;
  undefined8 uVar2;
  undefined1 auStack_2c [4];
  BIGNUM *local_28;
  
  a = BN_bin2bn(param_2,param_3,(BIGNUM *)0x0);
  if (a != (BIGNUM *)0x0) {
    DH_get0_pqg(param_1,&local_28,0,0);
    if ((local_28 == (BIGNUM *)0x0) || (iVar1 = BN_num_bits(local_28), iVar1 + 0xeU < 0xf)) {
      uVar2 = 0x6b;
      goto LAB_00a1e8fc;
    }
    iVar1 = ossl_dh_check_pub_key_partial(param_1,a,auStack_2c);
    if (iVar1 == 0) {
      uVar2 = 0x66;
      goto LAB_00a1e8fc;
    }
    uVar2 = DH_set0_key(param_1,a,0);
    if ((int)uVar2 == 1) {
      return uVar2;
    }
  }
  uVar2 = 0x6a;
LAB_00a1e8fc:
  ERR_new();
  ERR_set_debug("crypto/dh/dh_key.c",0x197,"ossl_dh_buf2key");
  ERR_set_error(5,uVar2,0);
  BN_free(a);
  return 0;
}

