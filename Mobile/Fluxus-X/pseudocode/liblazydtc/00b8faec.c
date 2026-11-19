/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8faec
 */

undefined8 psa_pake_setup(int *param_1,uint *param_2)

{
  uint uVar1;
  char cVar2;
  undefined8 uVar3;
  
  cVar2 = (char)param_1[3];
  if (cVar2 == '\x02') {
    if (*param_1 == 1) {
      mbedtls_psa_pake_abort(param_1 + 8);
      cVar2 = (char)param_1[3];
      goto LAB_00b8fbbc;
    }
  }
  else {
    if (cVar2 == '\0') {
      if (((*param_2 & 0x7f000000) == 0xa000000) && ((param_2[2] & 0x7f000000) == 0x2000000)) {
        memset(param_1 + 8,0,0x58);
        uVar1 = *param_2;
        param_1[1] = uVar1;
        param_1[2] = CONCAT13((char)param_2[1],
                              CONCAT12(*(undefined1 *)((long)param_2 + 5),
                                       *(undefined2 *)((long)param_2 + 6)));
        param_1[0x1c] = param_2[2];
        *(undefined8 *)(param_1 + 0x1a) = *(undefined8 *)param_2;
        if (uVar1 == 0xa000100) {
          param_1[6] = 0;
          param_1[4] = 0;
          param_1[5] = 0;
          *(undefined1 *)((long)param_1 + 0x1a) = 1;
          *(undefined1 *)(param_1 + 3) = 1;
          return 0;
        }
        uVar3 = 0xffffff7a;
      }
      else {
        uVar3 = 0xffffff79;
      }
      goto LAB_00b8fbf8;
    }
LAB_00b8fbbc:
    if (cVar2 == '\x01') {
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
  }
  uVar3 = 0xffffff77;
LAB_00b8fbf8:
  memset(param_1,0,0x390);
  return uVar3;
}

