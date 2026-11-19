/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f298
 */

undefined8 OSSL_PARAM_set_double(double param_1,long param_2)

{
  int iVar1;
  long *plVar2;
  double dVar3;
  
  if (param_2 == 0) {
    return 0;
  }
  iVar1 = *(int *)(param_2 + 8);
  *(undefined8 *)(param_2 + 0x20) = 0;
  if (iVar1 == 1) {
    if ((double)(long)param_1 != param_1) {
      return 0;
    }
    plVar2 = *(long **)(param_2 + 0x10);
    *(undefined8 *)(param_2 + 0x20) = 8;
    if (plVar2 == (long *)0x0) {
      return 1;
    }
    if (*(long *)(param_2 + 0x18) == 8) {
      if (param_1 < -9.223372036854776e+18) {
        return 0;
      }
      dVar3 = 9.223372036854776e+18;
      goto LAB_00a9f3fc;
    }
    if (*(long *)(param_2 + 0x18) != 4) {
      return 0;
    }
    if (param_1 < -2147483648.0) {
      return 0;
    }
    if (2147483647.0 < param_1) {
      return 0;
    }
  }
  else {
    if (iVar1 != 2) {
      if (iVar1 != 3) {
        return 0;
      }
      *(undefined8 *)(param_2 + 0x20) = 8;
      if (*(double **)(param_2 + 0x10) == (double *)0x0) {
        return 1;
      }
      if (*(long *)(param_2 + 0x18) == 8) {
        **(double **)(param_2 + 0x10) = param_1;
        return 1;
      }
      return 0;
    }
    if ((double)(ulong)(long)param_1 != param_1) {
      return 0;
    }
    plVar2 = *(long **)(param_2 + 0x10);
    *(undefined8 *)(param_2 + 0x20) = 8;
    if (plVar2 == (long *)0x0) {
      return 1;
    }
    if (*(long *)(param_2 + 0x18) == 8) {
      if (param_1 < 0.0) {
        return 0;
      }
      dVar3 = 1.8446744073709552e+19;
LAB_00a9f3fc:
      if (param_1 < dVar3) {
        *(undefined8 *)(param_2 + 0x20) = 8;
        *plVar2 = (long)param_1;
        return 1;
      }
      return 0;
    }
    if (*(long *)(param_2 + 0x18) != 4) {
      return 0;
    }
    if (param_1 < 0.0) {
      return 0;
    }
    if (4294967295.0 < param_1) {
      return 0;
    }
  }
  *(undefined8 *)(param_2 + 0x20) = 4;
  *(int *)plVar2 = (int)param_1;
  return 1;
}

