/* 7ff70c83ecf0 FUN_7ff70c83ecf0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83ecf0(undefined4 param_1,undefined4 param_2,uint param_3,undefined4 param_4)

{
  code *pcVar1;
  undefined8 uVar2;
  longlong lVar3;
  undefined4 uVar4;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(undefined2 *)(_DAT_7ff70cc1a3c0 + 0x2029) = 1;
  *(undefined1 *)(lVar3 + 0x2028) = 1;
  *(undefined4 *)(lVar3 + 0x2038) = param_1;
  *(undefined4 *)(lVar3 + 0x203c) = param_1;
  *(undefined4 *)(lVar3 + 0x2040) = param_2;
  *(uint *)(lVar3 + 0x202c) = param_3 >> 6 & 0x10 | param_3;
  *(undefined4 *)(lVar3 + 0x2030) = param_4;
  uVar4 = 0;
  if ((param_3 & 0x200) == 0) {
    uVar4 = *(undefined4 *)(lVar3 + 0x100);
  }
  *(undefined4 *)(lVar3 + 0x2034) = uVar4;
  *(undefined4 *)(lVar3 + 0x2090) = 0;
  *(undefined8 *)(lVar3 + 0x2070) = 0;
  *(undefined8 *)(lVar3 + 0x2078) = 0;
  *(undefined8 *)(lVar3 + 0x20a0) = 0xffffffffffffffff;
  *(undefined4 *)(lVar3 + 0x209c) = 0x7f7fffff;
  uVar2 = _DAT_7ff70cb1d4f0;
  *(undefined8 *)(lVar3 + 0x2094) = _DAT_7ff70cb1d4f0;
  *(undefined4 *)(lVar3 + 0x20c8) = 0;
  *(undefined8 *)(lVar3 + 0x20a8) = 0;
  *(undefined8 *)(lVar3 + 0x20b0) = 0;
  *(undefined8 *)(lVar3 + 0x20d8) = 0xffffffffffffffff;
  *(undefined4 *)(lVar3 + 0x20d4) = 0x7f7fffff;
  *(undefined8 *)(lVar3 + 0x20cc) = uVar2;
  *(undefined4 *)(lVar3 + 0x2100) = 0;
  *(undefined8 *)(lVar3 + 0x20e0) = 0;
  *(undefined8 *)(lVar3 + 0x20e8) = 0;
  *(undefined8 *)(lVar3 + 0x2110) = 0xffffffffffffffff;
  *(undefined4 *)(lVar3 + 0x210c) = 0x7f7fffff;
  *(undefined8 *)(lVar3 + 0x2104) = uVar2;
  *(undefined4 *)(lVar3 + 0x206c) = 0;
  *(undefined4 *)(lVar3 + 0x2138) = 0;
  *(undefined8 *)(lVar3 + 0x2118) = 0;
  *(undefined8 *)(lVar3 + 0x2120) = 0;
  *(undefined8 *)(lVar3 + 0x2148) = 0xffffffffffffffff;
  *(undefined4 *)(lVar3 + 0x2144) = 0x7f7fffff;
  *(undefined8 *)(lVar3 + 0x213c) = uVar2;
  *(undefined1 *)(lVar3 + 0x1fe9) = 1;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


