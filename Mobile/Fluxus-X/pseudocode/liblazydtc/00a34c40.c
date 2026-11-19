/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a34c40
 */

int EC_POINT_oct2point(EC_GROUP *group,EC_POINT *p,uchar *buf,size_t len,BN_CTX *ctx)

{
  int iVar1;
  undefined8 uVar2;
  byte *pbVar3;
  
  pbVar3 = *(byte **)group;
  if ((*(code **)(pbVar3 + 0x98) == (code *)0x0) && ((*pbVar3 & 1) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_oct.c",0x6e,"EC_POINT_oct2point");
    uVar2 = 0xc0101;
  }
  else {
    if ((pbVar3 == *(byte **)p) &&
       (((*(int *)(group + 0x20) == 0 || (*(int *)(p + 8) == 0)) ||
        (*(int *)(group + 0x20) == *(int *)(p + 8))))) {
      if ((*pbVar3 & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x00a34cf0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (**(code **)(pbVar3 + 0x98))();
        return iVar1;
      }
      if (*(int *)(pbVar3 + 4) == 0x196) {
        iVar1 = ossl_ec_GFp_simple_oct2point();
        return iVar1;
      }
      iVar1 = ossl_ec_GF2m_simple_oct2point();
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_oct.c",0x72,"EC_POINT_oct2point");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

