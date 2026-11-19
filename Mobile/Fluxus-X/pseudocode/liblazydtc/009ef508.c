/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef508
 */

int ASN1_TIME_cmp_time_t(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  uint local_90;
  uint local_8c;
  time_t atStack_88 [7];
  undefined8 local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  undefined8 local_28;
  undefined8 uStack_20;
  undefined8 local_18;
  
  local_18 = param_2;
  if (param_1 == 0) {
    time(atStack_88);
    local_28 = 0;
    uStack_20 = 0;
    local_38 = 0;
    uStack_30 = 0;
    local_48 = 0;
    uStack_40 = 0;
    local_50 = 0;
    lVar2 = OPENSSL_gmtime(atStack_88,&local_50);
    if (lVar2 == 0) {
      return -2;
    }
  }
  else {
    iVar1 = ossl_asn1_time_to_tm(&local_50,param_1);
    if (iVar1 == 0) {
      return -2;
    }
  }
  lVar2 = OPENSSL_gmtime(&local_18,atStack_88);
  if ((lVar2 == 0) ||
     (iVar1 = OPENSSL_gmtime_diff(&local_8c,&local_90,atStack_88,&local_50), iVar1 == 0)) {
    return -2;
  }
  if (0 < (int)local_8c) {
    return 1;
  }
  if ((int)local_90 < 1) {
    return (int)(local_90 | local_8c) >> 0x1f;
  }
  return 1;
}

