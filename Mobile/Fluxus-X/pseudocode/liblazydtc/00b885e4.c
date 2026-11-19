/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b885e4
 */

int psa_mac_update(int *param_1,void *param_2,size_t param_3)

{
  int iVar1;
  int iVar2;
  void *__dest;
  
  iVar1 = *param_1;
  if (iVar1 == 0) {
    return -0x89;
  }
  if (param_3 == 0) {
    return 0;
  }
  __dest = calloc(param_3,1);
  if (__dest == (void *)0x0) {
    iVar2 = -0x8d;
  }
  else {
    memcpy(__dest,param_2,param_3);
    if (iVar1 == 1) {
      iVar2 = mbedtls_psa_mac_update(param_1 + 2,__dest,param_3);
      if (iVar2 == 0) goto LAB_00b8869c;
      iVar1 = *param_1;
    }
    else {
      iVar2 = -0x87;
    }
    if (iVar1 != 0) {
      if (iVar1 == 1) {
        mbedtls_psa_mac_abort(param_1 + 2);
      }
      *(undefined1 *)(param_1 + 1) = 0;
      *param_1 = 0;
      *(byte *)((long)param_1 + 5) = *(byte *)((long)param_1 + 5) & 0xfe;
    }
  }
LAB_00b8869c:
  free(__dest);
  return iVar2;
}

