/* 7ff70c8544b0 FUN_7ff70c8544b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8544b0(undefined4 param_1,int param_2,undefined4 param_3,undefined4 *param_4)

{
  undefined4 *puVar1;
  code *pcVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  longlong lVar6;
  undefined1 auStack_48 [32];
  ulonglong uStack_28;
  
  lVar6 = _DAT_7ff70cc1a3c0;
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1f94) = param_1;
  *(int *)(lVar6 + 0x1fa4) = param_2;
  FUN_7ff70c83e1d0(param_3);
  *(undefined4 *)(*(longlong *)(lVar6 + 0x1f98) + 0x3f0 + (longlong)param_2 * 4) = param_1;
  uVar3 = param_4[1];
  uVar4 = param_4[2];
  uVar5 = param_4[3];
  puVar1 = (undefined4 *)(*(longlong *)(lVar6 + 0x1f98) + 0x3f8 + (longlong)param_2 * 0x10);
  *puVar1 = *param_4;
  puVar1[1] = uVar3;
  puVar1[2] = uVar4;
  puVar1[3] = uVar5;
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
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


