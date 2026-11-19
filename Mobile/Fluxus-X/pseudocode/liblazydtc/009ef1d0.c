/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef1d0
 */

void ASN1_TIME_diff(undefined8 param_1,undefined8 param_2,long param_3,long param_4)

{
  int iVar1;
  long lVar2;
  time_t local_a0 [14];
  time_t tStack_28;
  
  if (param_3 == 0) {
    time(local_a0);
    local_a0[0xc] = 0;
    local_a0[0xd] = 0;
    local_a0[10] = 0;
    local_a0[0xb] = 0;
    local_a0[8] = 0;
    local_a0[9] = 0;
    local_a0[7] = 0;
    lVar2 = OPENSSL_gmtime(local_a0,local_a0 + 7);
    if (lVar2 == 0) {
      return;
    }
  }
  else {
    iVar1 = ossl_asn1_time_to_tm(local_a0 + 7,param_3);
    if (iVar1 == 0) {
      return;
    }
  }
  if (param_4 == 0) {
    time(&tStack_28);
    local_a0[5] = 0;
    local_a0[6] = 0;
    local_a0[3] = 0;
    local_a0[4] = 0;
    local_a0[1] = 0;
    local_a0[2] = 0;
    local_a0[0] = 0;
    lVar2 = OPENSSL_gmtime(&tStack_28,local_a0);
    if (lVar2 == 0) {
      return;
    }
  }
  else {
    iVar1 = ossl_asn1_time_to_tm(local_a0,param_4);
    if (iVar1 == 0) {
      return;
    }
  }
  OPENSSL_gmtime_diff(param_1,param_2,local_a0 + 7,local_a0);
  return;
}

