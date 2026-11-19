/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a27ba4
 */

int EC_GROUP_check_named_curve(long param_1,int param_2,BN_CTX *param_3)

{
  int iVar1;
  long lVar2;
  BN_CTX *c;
  int iVar3;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_check.c",0x1a,"EC_GROUP_check_named_curve");
    ERR_set_error(0x10,0xc0102,0);
    iVar3 = 0;
  }
  else {
    c = (BN_CTX *)0x0;
    if (param_3 == (BN_CTX *)0x0) {
      param_3 = (BN_CTX *)BN_CTX_new_ex(0);
      c = param_3;
      if (param_3 == (BN_CTX *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_check.c",0x21,"EC_GROUP_check_named_curve");
        ERR_set_error(0x10,0xc0100,0);
        iVar3 = 0;
        goto LAB_00a27c80;
      }
    }
    iVar1 = ossl_ec_curve_nid_from_params(param_1,param_3);
    iVar3 = iVar1;
    if ((param_2 != 0) && (0 < iVar1)) {
      lVar2 = EC_curve_nid2nist(iVar1);
      iVar3 = 0;
      if (lVar2 != 0) {
        iVar3 = iVar1;
      }
    }
    BN_CTX_free(c);
  }
LAB_00a27c80:
  return iVar3;
}

