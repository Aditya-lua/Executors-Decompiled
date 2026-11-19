/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5494c
 */

size_t ossl_err_string_int(ulong param_1,char *param_2,char *param_3,size_t param_4)

{
  ulong param3;
  int iVar1;
  uint uVar2;
  long lVar3;
  ulong *param6;
  size_t sVar4;
  ulong param3_00;
  char *param4;
  ulong local_1a0 [32];
  char acStack_a0 [64];
  
  param6 = local_1a0;
  if (param_4 == 0) {
    return param_1;
  }
  uVar2 = (uint)param_1;
  param3 = 2;
  if (-1 < (int)uVar2) {
    param3 = param_1 >> 0x17 & 0xff;
  }
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21a30,&LAB_00a53f8c);
  if ((iVar1 == 0) || (DAT_00d21a34 == 0)) {
LAB_00a54a04:
    param4 = acStack_a0;
    BIO_snprintf(acStack_a0,0x40,"lib(%lu)",param3);
  }
  else {
    local_1a0[0] = 0x1000000;
    if (-1 < (int)uVar2) {
      local_1a0[0] = param_1 & 0x7f800000;
    }
    iVar1 = CRYPTO_THREAD_read_lock(DAT_00d21a20);
    if (iVar1 == 0) goto LAB_00a54a04;
    lVar3 = OPENSSL_LH_retrieve(DAT_00d21a28,local_1a0);
    CRYPTO_THREAD_unlock(DAT_00d21a20);
    if ((lVar3 == 0) || (param4 = *(char **)(lVar3 + 8), param4 == (char *)0x0)) goto LAB_00a54a04;
  }
  param3_00 = (ulong)(((int)uVar2 >> 0x1f & 0x7f800000U | 0x7fffff) & uVar2);
  if ((int)uVar2 < 0) {
    iVar1 = openssl_strerror_r(param3_00,local_1a0,0x100);
    if (iVar1 != 0) goto LAB_00a54a60;
  }
  else {
    param6 = (ulong *)ERR_reason_error_string(param_1);
    if (param6 != (ulong *)0x0) goto LAB_00a54a60;
  }
  BIO_snprintf((char *)local_1a0,0x100,"reason(%lu)",param3_00);
  param6 = local_1a0;
LAB_00a54a60:
  BIO_snprintf(param_3,param_4,"error:%08lX:%s:%s:%s",param_1,param4,param_2,(char *)param6);
  sVar4 = strlen(param_3);
  if (sVar4 == param_4 - 1) {
    uVar2 = BIO_snprintf(param_3,param_4,"err:%lx:%lx:%lx:%lx",param_1,param3,0,param3_00);
    sVar4 = (size_t)uVar2;
  }
  return sVar4;
}

