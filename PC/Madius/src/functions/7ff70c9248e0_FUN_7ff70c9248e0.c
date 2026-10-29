/* 7ff70c9248e0 FUN_7ff70c9248e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c9248e0(longlong param_1)

{
  int iVar1;
  code *pcVar2;
  ulonglong *puVar3;
  ulonglong **ppuVar4;
  longlong lVar5;
  undefined8 uVar6;
  ulonglong uVar7;
  ulonglong unaff_RBX;
  ulonglong **ppuVar8;
  ulonglong uVar9;
  byte bVar10;
  char cVar11;
  char in_AF;
  char cVar12;
  char cVar13;
  ulonglong *puStack_80;
  undefined1 auStack_78 [44];
  undefined1 auStack_4c [4];
  undefined1 auStack_34 [4];
  undefined8 uStack_30;
  
  ppuVar8 = (ulonglong **)auStack_78;
  uStack_30 = 0xfffffffffffffffe;
  puStack_80 = (ulonglong *)0x7ff70c924905;
  func_0x7ff70d8ce7b1(auStack_34);
  puVar3 = _DAT_7ff70cb95d80;
  uVar7 = *_DAT_7ff70cb95d80;
  if (uVar7 == 0) {
    puStack_80 = (ulonglong *)0x7ff70c924937;
    func_0x7ff70d8b0409(auStack_4c);
    iVar1 = *_DAT_7ff70cb95c28;
    *_DAT_7ff70cb95c28 = (int)((longlong)iVar1 + 1U);
    *puVar3 = (longlong)iVar1 + 1U;
    ppuVar8 = &puStack_80;
    puStack_80 = puVar3;
    func_0x7ff70d58ec04(auStack_4c);
    uVar7 = *puVar3;
    lVar5 = *(longlong *)(param_1 + 8);
    ppuVar4 = &puStack_80;
    if (uVar7 < *(ulonglong *)(lVar5 + 0x18)) goto LAB_7ff70c924967;
  }
  else {
    lVar5 = *(longlong *)(param_1 + 8);
    ppuVar4 = (ulonglong **)auStack_78;
    if (uVar7 < *(ulonglong *)(lVar5 + 0x18)) {
LAB_7ff70c924967:
      uVar9 = *(ulonglong *)(*(longlong *)(lVar5 + 0x10) + uVar7 * 8);
      ppuVar4 = ppuVar8;
      if (uVar9 != 0) goto LAB_7ff70c9249d2;
    }
  }
  ppuVar8 = ppuVar4;
  if (*(char *)(lVar5 + 0x24) == '\x01') {
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c92497f;
    lVar5 = FUN_7ff70cb124a0();
    if ((uVar7 < *(ulonglong *)(lVar5 + 0x18)) &&
       (uVar9 = *(ulonglong *)(*(longlong *)(lVar5 + 0x10) + uVar7 * 8), uVar9 != 0))
    goto LAB_7ff70c9249d2;
  }
  bVar10 = 0;
  cVar13 = (longlong)unaff_RBX < 0;
  cVar12 = unaff_RBX == 0;
  cVar11 = (POPCOUNT(unaff_RBX & 0xff) & 1U) == 0;
  uVar9 = unaff_RBX;
  if ((bool)cVar12) {
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c9249a7;
    uVar6 = func_0x7ff70d59f317(&stack0xffffffffffffffb8,param_1);
    if (CONCAT62((int6)((ulonglong)uVar6 >> 0x10),
                 CONCAT11(cVar13 << 7 | cVar12 << 6 | in_AF << 4 | cVar11 << 2 | 2U | bVar10,
                          (char)uVar6)) == -1) {
      *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c9249ef;
      FUN_7ff70ca320b0();
      pcVar2 = (code *)swi(3);
      uVar7 = (*pcVar2)();
      return uVar7;
    }
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c9249bc;
    FUN_7ff70caa5220();
    pcVar2 = *(code **)(lRam0000000000000000 + 8);
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c9249c7;
    (*pcVar2)();
    _DAT_7ff70cc1ab18 = 0;
  }
LAB_7ff70c9249d2:
  *(ulonglong *)((longlong)ppuVar8 + -8) = unaff_RBX;
  *(undefined8 *)((longlong)ppuVar8 + -0x10) = 0x7ff70c9249dc;
  func_0x7ff70d6e3266(auStack_34);
  return uVar9;
}


