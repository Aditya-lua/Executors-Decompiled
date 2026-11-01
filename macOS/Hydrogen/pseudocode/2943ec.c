
undefined8 FUN_002943ec(long param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  undefined8 *unaff_x19;
  long unaff_x20;
  
  if (*(long *)(param_1 + 0x10) == 0) {
    func_0x0028f83c(6,0,0x78,"/aws-lc/crypto/evp_extra/p_kem_asn1.c",0x2b);
    return 0;
  }
  if (param_4 == 0) {
    *unaff_x19 = 0;
    return 1;
  }
  _memcpy(param_3,*(long *)(param_1 + 0x10));
  *unaff_x19 = *(undefined8 *)(unaff_x20 + 0x28);
  return 1;
}

