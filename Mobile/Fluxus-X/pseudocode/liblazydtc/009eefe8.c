/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eefe8
 */

ulong ASN1_TIME_to_tm(long param_1,undefined8 *param_2)

{
  ulong uVar1;
  long lVar2;
  time_t tStack_18;
  
  if (param_1 == 0) {
    time(&tStack_18);
    param_2[5] = 0;
    param_2[6] = 0;
    param_2[3] = 0;
    param_2[4] = 0;
    param_2[1] = 0;
    param_2[2] = 0;
    *param_2 = 0;
    lVar2 = OPENSSL_gmtime(&tStack_18,param_2);
    return (ulong)(lVar2 != 0);
  }
  uVar1 = ossl_asn1_time_to_tm(param_2,param_1);
  return uVar1;
}

