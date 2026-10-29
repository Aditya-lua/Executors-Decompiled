/* 7ff70c830dc0 FUN_7ff70c830dc0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c830dc0(void)

{
  undefined4 *puVar1;
  longlong lVar2;
  code *pcVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined1 auStack_38 [40];
  ulonglong uStack_10;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_10 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar2 = *(longlong *)(lVar2 + 0x1440);
  FUN_7ff70c7b8130(*(undefined8 *)(lVar2 + 0x2c8));
  puVar1 = (undefined4 *)
           (*(longlong *)(*(longlong *)(lVar2 + 0x2c8) + 0xa8) + -0x10 +
           (longlong)*(int *)(*(longlong *)(lVar2 + 0x2c8) + 0xa0) * 0x10);
  uVar4 = puVar1[1];
  uVar5 = puVar1[2];
  uVar6 = puVar1[3];
  *(undefined4 *)(lVar2 + 0x260) = *puVar1;
  *(undefined4 *)(lVar2 + 0x264) = uVar4;
  *(undefined4 *)(lVar2 + 0x268) = uVar5;
  *(undefined4 *)(lVar2 + 0x26c) = uVar6;
  if (_DAT_7ff70cbebd80 == (uStack_10 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_10 ^ (ulonglong)auStack_38);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


