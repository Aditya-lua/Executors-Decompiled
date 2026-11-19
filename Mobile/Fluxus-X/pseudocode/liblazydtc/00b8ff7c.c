/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8ff7c
 */

undefined8 psa_pake_set_peer(int *param_1,void *param_2,size_t param_3)

{
  long lVar1;
  void *__dest;
  void *__dest_00;
  undefined8 uVar2;
  
  if ((char)param_1[3] == '\x02') {
    if (*param_1 != 1) goto LAB_00b8fff4;
    mbedtls_psa_pake_abort(param_1 + 8);
    uVar2 = 0xffffff77;
    if ((char)param_1[3] != '\x01') goto LAB_00b90028;
LAB_00b90000:
    lVar1 = *(long *)(param_1 + 8);
  }
  else {
    if ((char)param_1[3] != '\x01') {
LAB_00b8fff4:
      uVar2 = 0xffffff77;
      goto LAB_00b90028;
    }
    if (param_3 == 0) {
      uVar2 = 0xffffff79;
      goto LAB_00b90000;
    }
    if (*(long *)(param_1 + 0x12) == 0) {
      __dest = calloc(1,param_3);
      *(void **)(param_1 + 0x10) = __dest;
      if ((__dest != (void *)0x0) && (__dest_00 = calloc(param_3,1), __dest_00 != (void *)0x0)) {
        memcpy(__dest_00,param_2,param_3);
        memcpy(__dest,__dest_00,param_3);
        *(size_t *)(param_1 + 0x12) = param_3;
        free(__dest_00);
        return 0;
      }
      uVar2 = 0xffffff73;
      lVar1 = *(long *)(param_1 + 8);
    }
    else {
      uVar2 = 0xffffff77;
      lVar1 = *(long *)(param_1 + 8);
    }
  }
  if (lVar1 != 0) {
    mbedtls_zeroize_and_free(lVar1,*(undefined8 *)(param_1 + 10));
  }
  if (*(void **)(param_1 + 0xc) != (void *)0x0) {
    free(*(void **)(param_1 + 0xc));
  }
  if (*(void **)(param_1 + 0x10) != (void *)0x0) {
    free(*(void **)(param_1 + 0x10));
  }
LAB_00b90028:
  memset(param_1,0,0x390);
  return uVar2;
}

