/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b900c0
 */

undefined8 psa_pake_set_role(int *param_1,char param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  if ((char)param_1[3] == '\x02') {
    if (*param_1 != 1) goto LAB_00b90138;
    mbedtls_psa_pake_abort(param_1 + 8);
    uVar2 = 0xffffff77;
    if ((char)param_1[3] != '\x01') goto LAB_00b9016c;
LAB_00b90144:
    lVar1 = *(long *)(param_1 + 8);
  }
  else {
    if ((char)param_1[3] != '\x01') {
LAB_00b90138:
      uVar2 = 0xffffff77;
      goto LAB_00b9016c;
    }
    if (param_1[1] != 0xa000100) {
      uVar2 = 0xffffff7a;
      goto LAB_00b90144;
    }
    if (param_2 == '\0') {
      return 0;
    }
    uVar2 = 0xffffff79;
    lVar1 = *(long *)(param_1 + 8);
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
LAB_00b9016c:
  memset(param_1,0,0x390);
  return uVar2;
}

