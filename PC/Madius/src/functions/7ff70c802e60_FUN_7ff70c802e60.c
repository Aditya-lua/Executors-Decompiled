/* 7ff70c802e60 FUN_7ff70c802e60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c802e60(undefined4 *param_1,ulonglong param_2,uint param_3)

{
  undefined4 *puVar1;
  code *pcVar2;
  undefined4 *puVar3;
  undefined4 *puVar4;
  ulonglong uVar5;
  undefined4 uVar6;
  uint uVar7;
  ulonglong uVar8;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  param_3 = ~param_3;
  puVar1 = (undefined4 *)((longlong)param_1 + param_2);
  puVar3 = param_1;
  if (3 < param_2) {
    do {
      param_3 = crc32(param_3,*puVar3);
      param_1 = puVar3 + 1;
      puVar4 = puVar3 + 2;
      puVar3 = param_1;
    } while (puVar4 <= puVar1);
  }
  uVar5 = (longlong)param_1 - (longlong)puVar1;
  if (param_1 < puVar1) {
    uVar7 = (int)puVar1 - (int)param_1 & 7;
    uVar8 = (ulonglong)uVar7;
    if (uVar7 != 0) {
      do {
        param_3 = crc32(param_3,*(undefined1 *)param_1);
        param_1 = (undefined4 *)((longlong)param_1 + 1);
        uVar8 = uVar8 - 1;
      } while (uVar8 != 0);
    }
    if (uVar5 < 0xfffffffffffffff9) {
      do {
        uVar6 = crc32(param_3,*(undefined1 *)param_1);
        uVar6 = crc32(uVar6,*(undefined1 *)((longlong)param_1 + 1));
        uVar6 = crc32(uVar6,*(undefined1 *)((longlong)param_1 + 2));
        uVar6 = crc32(uVar6,*(undefined1 *)((longlong)param_1 + 3));
        uVar6 = crc32(uVar6,*(undefined1 *)(param_1 + 1));
        uVar6 = crc32(uVar6,*(undefined1 *)((longlong)param_1 + 5));
        uVar6 = crc32(uVar6,*(undefined1 *)((longlong)param_1 + 6));
        param_3 = crc32(uVar6,*(undefined1 *)((longlong)param_1 + 7));
        param_1 = param_1 + 2;
      } while (param_1 < puVar1);
    }
  }
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar2 = (code *)swi(3);
    uVar5 = (*pcVar2)();
    return uVar5;
  }
  return (ulonglong)~param_3;
}


