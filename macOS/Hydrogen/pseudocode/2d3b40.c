
void FUN_002d3b40(long param_1)

{
  undefined8 in_x9;
  long in_x10;
  
  *(undefined8 *)(param_1 + 0x38) = in_x9;
  *(long *)(param_1 + 0x58) = in_x10 + 0xbf8;
  *(undefined **)(param_1 + 0x60) = &_aws_lc_0_24_0_ec_GFp_mont_felem_sqr;
  *(undefined **)(param_1 + 0x68) = &_aws_lc_0_24_0_ec_GFp_mont_felem_to_bytes;
  *(undefined **)(param_1 + 0x70) = &_aws_lc_0_24_0_ec_GFp_mont_felem_from_bytes;
  *(undefined **)(param_1 + 0x78) = &_aws_lc_0_24_0_ec_GFp_mont_felem_reduce;
  *(undefined **)(param_1 + 0x80) = &_aws_lc_0_24_0_ec_GFp_mont_felem_exp;
  *(undefined **)(param_1 + 0x88) = &_aws_lc_0_24_0_ec_simple_scalar_inv0_montgomery;
  *(undefined **)(param_1 + 0x90) = &_aws_lc_0_24_0_ec_simple_scalar_to_montgomery_inv_vartime;
  *(undefined **)(param_1 + 0x98) = &DAT_0031339c;
  return;
}

