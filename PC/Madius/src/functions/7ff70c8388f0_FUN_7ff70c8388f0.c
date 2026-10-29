/* 7ff70c8388f0 FUN_7ff70c8388f0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c8388f0(longlong param_1)

{
  char cVar1;
  code *pcVar2;
  ulonglong uVar3;
  uint uVar4;
  undefined8 uVar5;
  char *pcVar6;
  uint *puVar7;
  uint *puVar8;
  ulonglong uVar9;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  pcVar6 = (char *)(param_1 + 2);
  uVar4 = 0xffffffff;
  do {
    cVar1 = pcVar6[-2];
    if (cVar1 == '#') {
      if ((pcVar6[-1] == '#') && (*pcVar6 == '#')) {
        uVar4 = 0xffffffff;
      }
    }
    else if (cVar1 == '\0') {
      puVar7 = *(uint **)(_DAT_7ff70cc1a3c0 + 0x1428);
      puVar8 = puVar7 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1420) * 4;
      uVar9 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1420);
      while (uVar3 = uVar9, uVar3 != 0) {
        uVar9 = uVar3 >> 1;
        if (puVar7[uVar9 * 4] < ~uVar4) {
          puVar7 = puVar7 + uVar9 * 4 + 4;
          uVar9 = ~uVar9 + uVar3;
        }
      }
      if ((puVar7 == puVar8) || (*puVar7 != ~uVar4)) {
        uVar5 = 0;
      }
      else {
        uVar5 = *(undefined8 *)(puVar7 + 2);
      }
      if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
        FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
        pcVar2 = (code *)swi(3);
        uVar5 = (*pcVar2)();
        return uVar5;
      }
      return uVar5;
    }
    uVar4 = crc32(uVar4,cVar1);
    pcVar6 = pcVar6 + 1;
  } while( true );
}


