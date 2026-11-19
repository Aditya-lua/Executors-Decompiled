/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef5c4
 */

ulong ASN1_TIME_normalize(long param_1)

{
  ulong uVar1;
  long lVar2;
  undefined8 local_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined8 local_30;
  undefined8 uStack_28;
  time_t tStack_18;
  
  if (param_1 == 0) {
    time(&tStack_18);
    local_30 = 0;
    uStack_28 = 0;
    local_40 = 0;
    uStack_38 = 0;
    local_50 = 0;
    uStack_48 = 0;
    local_58 = 0;
    lVar2 = OPENSSL_gmtime(&tStack_18,&local_58);
    if (lVar2 == 0) {
      return (ulong)(lVar2 != 0);
    }
  }
  else {
    uVar1 = ossl_asn1_time_to_tm(&local_58,param_1);
    if ((int)uVar1 == 0) {
      return uVar1;
    }
  }
  lVar2 = ossl_asn1_time_from_tm(param_1,&local_58,0xffffffff);
  return (ulong)(lVar2 != 0);
}

