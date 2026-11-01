
ulong __ZN4core5slice4sort6stable5drift11sqrt_approx17hc016cdf4839e2b11E(ulong param_1)

{
  ulong uVar1;
  
  uVar1 = 0x40U - LZCOUNT(param_1 | 1) >> 1;
  return (1L << (uVar1 & 0x3f)) + (param_1 >> (uVar1 & 0x3f)) >> 1;
}

