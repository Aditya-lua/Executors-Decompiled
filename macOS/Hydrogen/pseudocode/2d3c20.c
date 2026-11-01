
void FUN_002d3c20(long param_1)

{
  undefined8 in_x9;
  undefined8 in_x10;
  undefined8 in_x11;
  
  *(undefined8 *)(param_1 + 0x38) = in_x9;
  *(undefined8 *)(param_1 + 0x58) = in_x10;
  *(undefined8 *)(param_1 + 0x60) = in_x11;
  *(undefined **)(param_1 + 0x68) = &_aws_lc_0_24_0_ec_GFp_mont_felem_to_bytes;
  *(undefined **)(param_1 + 0x70) = &_aws_lc_0_24_0_ec_GFp_mont_felem_from_bytes;
  *(undefined **)(param_1 + 0x78) = &_aws_lc_0_24_0_ec_GFp_mont_felem_reduce;
  *(undefined **)(param_1 + 0x80) = &_aws_lc_0_24_0_ec_GFp_mont_felem_exp;
  *(undefined **)(param_1 + 0x88) = &DAT_00314774;
  *(undefined **)(param_1 + 0x90) = &DAT_00314980;
  *(undefined **)(param_1 + 0x98) = &DAT_003149e4;
  return;
}

