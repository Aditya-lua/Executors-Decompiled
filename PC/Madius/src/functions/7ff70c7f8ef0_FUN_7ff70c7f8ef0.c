/* 7ff70c7f8ef0 FUN_7ff70c7f8ef0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7f8ef0(int *param_1,undefined4 param_2)

{
  code *pcVar1;
  longlong lVar2;
  float *pfVar3;
  ushort in_DX;
  float fVar4;
  undefined1 auStack_38 [36];
  float fStack_14;
  ulonglong uStack_10;
  
  uStack_10 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  if ((int)(uint)in_DX < *param_1) {
    fVar4 = *(float *)(*(longlong *)(param_1 + 2) + (ulonglong)in_DX * 4);
    param_2 = 0;
    if (0.0 <= fVar4) goto LAB_7ff70c7f8f6f;
  }
  fVar4 = (float)param_1[5];
  if (_DAT_7ff70cb1c640 <= fVar4) {
    fStack_14 = 0.0;
    lVar2 = FUN_7ff70c7f86d0(fVar4,param_2,&fStack_14);
    pfVar3 = (float *)(lVar2 + 4);
    if (lVar2 == 0) {
      pfVar3 = &fStack_14;
    }
    fVar4 = *pfVar3;
  }
  else {
    lVar2 = FUN_7ff70c7f86d0(fVar4,param_2,0);
    pfVar3 = (float *)(param_1 + 4);
    if (lVar2 != 0) {
      pfVar3 = (float *)(lVar2 + 4);
    }
    fVar4 = *pfVar3;
  }
LAB_7ff70c7f8f6f:
  if (_DAT_7ff70cbebd80 == (uStack_10 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(fVar4);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


