/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_1801b2ea0(undefined8 param_1,ulonglong param_2,ulonglong param_3,ulonglong *param_4,
                  undefined8 param_5,undefined8 param_6)

{
  code *pcVar1;
  int iVar2;
  longlong lVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  undefined1 *puVar6;
  undefined1 uStack0000000000000000;
  undefined1 auStack_a8 [8];
  undefined1 auStack_a0 [24];
  ulonglong *puStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  ulonglong uStack_68;
  longlong lStack_60;
  longlong lStack_58;
  ulonglong uStack_40;
  ulonglong uStack_38;
  
  uStack_38 = _DAT_1810c1700 ^ (ulonglong)auStack_a8;
  if (&uStack0000000000000000 == (undefined1 *)0x0) {
    (*(code *)0xffffffffffffffb0)();
    (*(code *)0x0)();
  }
  puVar6 = auStack_a8;
  if (param_3 <= param_2) goto LAB_1801b301c;
  uStack_68 = 0;
  lStack_60 = 0;
  lStack_58 = 0;
  param_3 = param_3 - param_2;
  if (param_3 != 0) {
    if (0x7fffffffffffffff < param_3) goto LAB_1801b303e;
    if (param_3 < 0x1000) {
      uStack_68 = FUN_180e152f0(param_3);
LAB_1801b2f4f:
      lVar3 = uStack_68 + param_3;
      lStack_58 = lVar3;
      FUN_180f297c0(uStack_68,0,param_3);
      lStack_60 = lVar3;
      goto LAB_1801b2f6f;
    }
    if (param_3 + 0x27 <= param_3) {
      FUN_1801958c0();
      pcVar1 = (code *)swi(3);
      (*pcVar1)();
      return;
    }
    lVar3 = FUN_180e152f0();
    if (lVar3 != 0) {
      uStack_68 = lVar3 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uStack_68 - 8) = lVar3;
      goto LAB_1801b2f4f;
    }
LAB_1801b3037:
    pcVar1 = (code *)swi(0x29);
    (*pcVar1)(5);
    puVar6 = auStack_a0;
LAB_1801b303e:
    *(undefined8 *)(puVar6 + -8) = 0x1801b3043;
    FUN_1801c0c10();
    pcVar1 = (code *)swi(3);
    (*pcVar1)();
    return;
  }
LAB_1801b2f6f:
  uStack_40 = 0;
  puStack_88 = &uStack_40;
  iVar2 = ReadProcessMemory(param_1,param_2,uStack_68,param_3);
  if ((iVar2 != 0) && (uStack_40 == param_3)) {
    uStack_78 = param_6;
    uStack_80 = param_5;
    puStack_88 = param_4;
    FUN_1801b2000(param_1,uStack_68,lStack_60 - uStack_68,param_2);
  }
  if (uStack_68 == 0) goto LAB_1801b301c;
  uVar5 = lStack_58 - uStack_68;
  if (uVar5 < 0x1000) {
    uVar4 = uStack_68;
  }
  else {
    if (0x1f < (uStack_68 - *(ulonglong *)(uStack_68 - 8)) - 8) goto LAB_1801b3037;
    uVar5 = uVar5 + 0x27;
    uVar4 = *(ulonglong *)(uStack_68 - 8);
  }
  func_0x000180e15340(uVar4,uVar5);
LAB_1801b301c:
  FUN_180e155e0(uStack_38 ^ (ulonglong)auStack_a8);
  return;
}

