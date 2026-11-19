/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0eb6c
 */

undefined8 X509_cmp_timeframe(X509_VERIFY_PARAM *param_1,ASN1_TIME *param_2,ASN1_TIME *param_3)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  time_t *t;
  time_t local_28;
  
  if (param_1 != (X509_VERIFY_PARAM *)0x0) {
    uVar2 = X509_VERIFY_PARAM_get_flags(param_1);
    if (((uint)uVar2 >> 1 & 1) != 0) {
      local_28 = X509_VERIFY_PARAM_get_time(param_1);
      t = &local_28;
      goto joined_r0x00b0eba8;
    }
    if (((uint)uVar2 >> 0x15 & 1) != 0) {
      return 0;
    }
  }
  t = (time_t *)0x0;
joined_r0x00b0eba8:
  if ((param_3 == (ASN1_TIME *)0x0) || (iVar1 = X509_cmp_time(param_3,t), -1 < iVar1)) {
    if ((param_2 == (ASN1_TIME *)0x0) || (iVar1 = X509_cmp_time(param_2,t), iVar1 < 1)) {
      uVar3 = 0;
    }
    else {
      uVar3 = 0xffffffff;
    }
  }
  else {
    uVar3 = 1;
  }
  return uVar3;
}

