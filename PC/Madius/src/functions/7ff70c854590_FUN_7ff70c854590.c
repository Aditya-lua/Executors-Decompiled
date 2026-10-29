/* 7ff70c854590 FUN_7ff70c854590 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c854590(int param_1,longlong param_2)

{
  float *pfVar1;
  undefined8 uVar2;
  int iVar4;
  code *pcVar5;
  float fVar6;
  float fVar7;
  float fVar8;
  longlong lVar9;
  longlong lVar10;
  undefined1 uVar11;
  undefined *puVar12;
  undefined1 auStack_48 [32];
  ulonglong uStack_28;
  undefined8 uVar3;
  
  lVar9 = _DAT_7ff70cc1a3c0;
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  if (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) != param_2) {
    if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 4) != 0) {
      if (param_2 == 0) {
        puVar12 = &UNK_7ff70cb8ae59;
      }
      else {
        puVar12 = *(undefined **)(param_2 + 8);
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb91b12,puVar12);
    }
    lVar10 = _DAT_7ff70cc1a3c0;
    *(longlong *)(lVar9 + 0x1f98) = param_2;
    *(undefined8 *)(lVar9 + 0x1fe0) = 0xffffffffffffffff;
    *(undefined2 *)(lVar9 + 0x2028) = 0;
    *(undefined1 *)(lVar9 + 0x1fea) = 0;
    uVar11 = 1;
    if (*(char *)(lVar10 + 0x2029) == '\0') {
      uVar11 = *(undefined1 *)(lVar10 + 0x1fea);
    }
    *(undefined1 *)(lVar10 + 0x1fe9) = uVar11;
  }
  iVar4 = *(int *)(param_2 + 0x170);
  *(int *)(lVar9 + 0x1f94) = param_1;
  *(int *)(lVar9 + 0x1fa4) = iVar4;
  FUN_7ff70c83e1d0(*(undefined4 *)(lVar9 + 0x1ddc));
  *(int *)(param_2 + 0x3f0 + (longlong)iVar4 * 4) = param_1;
  if (*(int *)(lVar9 + 0x1e20) == param_1) {
    uVar2 = *(undefined8 *)(param_2 + 0x128);
    uVar3 = *(undefined8 *)(param_2 + 0x128);
    fVar6 = *(float *)(lVar9 + 0x1e40);
    fVar7 = *(float *)(lVar9 + 0x1e44);
    fVar8 = *(float *)(lVar9 + 0x1e48);
    pfVar1 = (float *)(param_2 + 0x3f8 + (longlong)iVar4 * 0x10);
    *pfVar1 = *(float *)(lVar9 + 0x1e3c) - (float)uVar2;
    pfVar1[1] = fVar6 - (float)((ulonglong)uVar2 >> 0x20);
    pfVar1[2] = fVar7 - (float)uVar3;
    pfVar1[3] = fVar8 - (float)((ulonglong)uVar3 >> 0x20);
  }
  if ((*(uint *)(lVar9 + 0x14e0) & 0xfffffffe) == 2) {
    *(undefined1 *)(lVar9 + 0x1f91) = 1;
  }
  else if (*(char *)(lVar9 + 0x56) == '\x01') {
    *(undefined1 *)(lVar9 + 0x1f90) = 0;
  }
  *(undefined4 *)
   (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3d8) + 0x418 +
   (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) * 8) = 0x7f7fffff;
  *(undefined4 *)
   (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3d8) + 0x41c +
   (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) * 8) = 0x7f7fffff;
  if (_DAT_7ff70cbebd80 == (uStack_28 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_48);
  pcVar5 = (code *)swi(3);
  (*pcVar5)();
  return;
}


