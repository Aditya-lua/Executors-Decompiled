/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8fc24
 */

undefined4 psa_pake_abort(int *param_1)

{
  char cVar1;
  undefined4 uVar2;
  
  cVar1 = (char)param_1[3];
  if (cVar1 == '\x02') {
    if (*param_1 != 1) {
      uVar2 = 0xffffff79;
      goto LAB_00b8fca4;
    }
    uVar2 = mbedtls_psa_pake_abort(param_1 + 8);
    cVar1 = (char)param_1[3];
  }
  else {
    uVar2 = 0;
  }
  if (cVar1 == '\x01') {
    if (*(long *)(param_1 + 8) != 0) {
      mbedtls_zeroize_and_free(*(long *)(param_1 + 8),*(undefined8 *)(param_1 + 10));
    }
    if (*(void **)(param_1 + 0xc) != (void *)0x0) {
      free(*(void **)(param_1 + 0xc));
    }
    if (*(void **)(param_1 + 0x10) != (void *)0x0) {
      free(*(void **)(param_1 + 0x10));
    }
  }
LAB_00b8fca4:
  memset(param_1,0,0x390);
  return uVar2;
}

