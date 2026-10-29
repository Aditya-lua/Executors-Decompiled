/* 7ff70c819230 FUN_7ff70c819230 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c819230(float *param_1,float param_2)

{
  longlong lVar1;
  code *pcVar2;
  float fVar3;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  fVar3 = 0.0;
  if (0.0 <= param_2) {
    lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    if ((param_2 != 0.0) || (NAN(param_2))) {
      if (0.0 < param_2) {
        param_2 = param_2 + (*(float *)(lVar1 + 0x28) - *(float *)(lVar1 + 0x98));
      }
    }
    else {
      param_2 = *(float *)(lVar1 + 0x248);
    }
    fVar3 = param_2 - *param_1;
    if (param_2 - *param_1 <= _DAT_7ff70cb1ba2c) {
      fVar3 = _DAT_7ff70cb1ba2c;
    }
  }
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(fVar3);
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  return;
}


