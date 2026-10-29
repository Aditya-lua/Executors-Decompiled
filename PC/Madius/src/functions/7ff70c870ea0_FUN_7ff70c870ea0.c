/* 7ff70c870ea0 FUN_7ff70c870ea0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c870ea0(longlong param_1,uint param_2)

{
  code *pcVar1;
  longlong lVar2;
  undefined *puVar3;
  float fVar4;
  undefined1 auStack_38 [32];
  ulonglong uStack_18;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  if (param_1 == 0) {
    *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1480) = 0;
    if (*(longlong *)(lVar2 + 0x1468) == 0) goto LAB_7ff70c870f66;
  }
  else {
    fVar4 = (float)(param_2 & _DAT_7ff70cb1bac0) * _DAT_7ff70cb1d7c4 +
            *(float *)(_DAT_7ff70cc1a3c0 + 0x1480);
    if (_DAT_7ff70cb1d7c4 <= fVar4) {
      fVar4 = _DAT_7ff70cb1d7c4;
    }
    *(float *)(_DAT_7ff70cc1a3c0 + 0x1480) = fVar4;
    if (*(longlong *)(lVar2 + 0x1468) == param_1) goto LAB_7ff70c870f66;
  }
  if ((*(byte *)(lVar2 + 0x27b4) & 0x80) != 0) {
    if (param_1 == 0) {
      puVar3 = &UNK_7ff70cb8a129;
    }
    else {
      puVar3 = *(undefined **)(param_1 + 8);
    }
    FUN_7ff70c800cf0(&UNK_7ff70cb91e5d,puVar3);
  }
  *(longlong *)(lVar2 + 0x1468) = param_1;
  *(undefined8 *)(lVar2 + 0x1470) = *(undefined8 *)(lVar2 + 0xe0);
  if (param_1 == 0) {
    *(undefined4 *)(lVar2 + 0x1478) = 0xffffffff;
    *(undefined8 *)(lVar2 + 0x148c) = 0;
  }
LAB_7ff70c870f66:
  if (_DAT_7ff70cbebd80 != (uStack_18 ^ (ulonglong)auStack_38)) {
    FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_38);
    pcVar1 = (code *)swi(3);
    (*pcVar1)();
    return;
  }
  return;
}


