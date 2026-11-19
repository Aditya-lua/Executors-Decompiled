/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a34b70
 */

size_t EC_POINT_point2oct(EC_GROUP *group,EC_POINT *p,point_conversion_form_t form,uchar *buf,
                         size_t len,BN_CTX *ctx)

{
  size_t sVar1;
  undefined8 uVar2;
  byte *pbVar3;
  
  pbVar3 = *(byte **)group;
  if ((*(code **)(pbVar3 + 0x90) == (code *)0x0) && ((*pbVar3 & 1) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_oct.c",0x4f,"EC_POINT_point2oct");
    uVar2 = 0xc0101;
  }
  else {
    if ((pbVar3 == *(byte **)p) &&
       (((*(int *)(group + 0x20) == 0 || (*(int *)(p + 8) == 0)) ||
        (*(int *)(group + 0x20) == *(int *)(p + 8))))) {
      if ((*pbVar3 & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x00a34c20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        sVar1 = (**(code **)(pbVar3 + 0x90))();
        return sVar1;
      }
      if (*(int *)(pbVar3 + 4) == 0x196) {
        sVar1 = ossl_ec_GFp_simple_point2oct();
        return sVar1;
      }
      sVar1 = ossl_ec_GF2m_simple_point2oct(group,p,form);
      return sVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_oct.c",0x53,"EC_POINT_point2oct");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

