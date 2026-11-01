
bool FUN_006e2704(double *param_1,double *param_2)

{
  bool bVar1;
  float fVar2;
  float fVar3;
  
  if (*(float *)((long)param_1 + 0xc) != *(float *)((long)param_2 + 0xc)) {
    return false;
  }
  bVar1 = true;
  switch(*(float *)((long)param_1 + 0xc)) {
  case 0.0:
    break;
  case 1.4013e-45:
    fVar2 = *(float *)param_1;
    fVar3 = *(float *)param_2;
    goto code_r0x006f4be8;
  case 2.8026e-45:
    if (*param_1 != *param_2) {
      return false;
    }
    fVar2 = *(float *)(param_1 + 1);
    fVar3 = *(float *)(param_2 + 1);
code_r0x006f4be8:
    bVar1 = fVar2 == fVar3;
    break;
  case 4.2039e-45:
    bVar1 = *param_1 == *param_2;
    break;
  case 5.60519e-45:
    if (*(float *)param_1 != *(float *)param_2) {
      return false;
    }
    if (*(float *)((long)param_1 + 4) != *(float *)((long)param_2 + 4)) {
      return false;
    }
    bVar1 = false;
    if (!NAN(*(float *)(param_1 + 1)) && !NAN(*(float *)(param_2 + 1))) {
      bVar1 = *(float *)(param_1 + 1) == *(float *)(param_2 + 1);
    }
    break;
  default:
    bVar1 = *param_1 == *param_2;
  }
  return bVar1;
}

