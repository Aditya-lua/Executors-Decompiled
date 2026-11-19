/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b9214
 */

bool FUN_008b9214(double *param_1,double *param_2)

{
  float fVar1;
  float fVar2;
  
  fVar1 = *(float *)((long)param_1 + 0xc);
  if (fVar1 == *(float *)((long)param_2 + 0xc)) {
    if ((int)fVar1 < 2) {
      if (fVar1 == 0.0) {
        return true;
      }
      if (fVar1 == 1.4013e-45) {
        fVar1 = *(float *)param_1;
        fVar2 = *(float *)param_2;
LAB_008b9288:
        return fVar1 == fVar2;
      }
LAB_008b92d8:
      return *param_1 == *param_2;
    }
    if (fVar1 == 2.8026e-45) {
      if (*param_1 == *param_2) {
        fVar1 = *(float *)(param_1 + 1);
        fVar2 = *(float *)(param_2 + 1);
        goto LAB_008b9288;
      }
    }
    else {
      if (fVar1 != 5.60519e-45) {
        if (fVar1 == 4.2039e-45) {
          return *param_1 == *param_2;
        }
        goto LAB_008b92d8;
      }
      if ((*(float *)param_1 == *(float *)param_2) &&
         (*(float *)((long)param_1 + 4) == *(float *)((long)param_2 + 4))) {
        return *(float *)(param_1 + 1) == *(float *)(param_2 + 1);
      }
    }
  }
  return false;
}

