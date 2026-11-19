/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8ac90
 */

int psa_cipher_set_iv(int *param_1,void *param_2,ulong param_3)

{
  int iVar1;
  int iVar2;
  void *__dest;
  byte bVar3;
  
  iVar1 = *param_1;
  if (iVar1 == 0) {
    __dest = (void *)0x0;
    iVar2 = -0x89;
    goto LAB_00b8ad18;
  }
  if ((*(byte *)(param_1 + 1) & 3) == 1) {
    if (0x10 < param_3) {
      iVar2 = -0x87;
      goto joined_r0x00b8acf4;
    }
    if (param_3 == 0) {
      __dest = (void *)0x0;
      if (iVar1 == 1) goto LAB_00b8ad80;
LAB_00b8ad68:
      iVar2 = -0x87;
      goto joined_r0x00b8acf4;
    }
    __dest = calloc(param_3,1);
    if (__dest == (void *)0x0) {
      iVar2 = -0x8d;
      goto joined_r0x00b8acf4;
    }
    memcpy(__dest,param_2,param_3);
    if (iVar1 != 1) goto LAB_00b8ad68;
LAB_00b8ad80:
    iVar2 = mbedtls_psa_cipher_set_iv(param_1 + 2,__dest,param_3);
    if (iVar2 != 0) {
      iVar1 = *param_1;
      goto joined_r0x00b8acf4;
    }
    bVar3 = *(byte *)(param_1 + 1) | 2;
  }
  else {
    iVar2 = -0x89;
joined_r0x00b8acf4:
    __dest = (void *)0x0;
joined_r0x00b8acf4:
    if (iVar1 == 0) goto LAB_00b8ad18;
    if (iVar1 == 1) {
      mbedtls_psa_cipher_abort(param_1 + 2);
    }
    *param_1 = 0;
    bVar3 = *(byte *)(param_1 + 1) & 0xfc;
  }
  *(byte *)(param_1 + 1) = bVar3;
LAB_00b8ad18:
  free(__dest);
  return iVar2;
}

