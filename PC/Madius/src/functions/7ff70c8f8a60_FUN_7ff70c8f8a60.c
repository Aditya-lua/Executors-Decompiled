/* 7ff70c8f8a60 FUN_7ff70c8f8a60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c8f8a60(longlong param_1)

{
  char cVar1;
  longlong lVar2;
  code *pcVar3;
  int iVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  longlong lVar8;
  longlong lVar9;
  ulonglong uVar10;
  longlong lVar11;
  ulonglong uVar12;
  longlong lVar13;
  undefined8 unaff_R14;
  bool bVar14;
  undefined1 auStack_a0 [32];
  undefined1 auStack_80 [24];
  undefined1 auStack_68 [32];
  undefined8 uStack_48;
  
  uStack_48 = 0xfffffffffffffffe;
  lVar2 = *(longlong *)(_DAT_7ff70cc1a8e8 + 8);
  cVar1 = *(char *)(lVar2 + 0x19);
  lVar9 = _DAT_7ff70cc1a8e8;
  while (cVar1 == '\0') {
    if (3 < *(int *)(lVar2 + 0x20)) {
      lVar9 = lVar2;
    }
    lVar2 = *(longlong *)(lVar2 + (ulonglong)(*(int *)(lVar2 + 0x20) < 4) * 0x10);
    cVar1 = *(char *)(lVar2 + 0x19);
  }
  if ((*(char *)(lVar9 + 0x19) != '\0') || (4 < *(int *)(lVar9 + 0x20))) {
    FUN_7ff70cb12530(&UNK_7ff70cb7ffc9);
    goto LAB_7ff70c8f8c59;
  }
  uVar6 = *(ulonglong *)(lVar9 + 0x38);
  if (*(ulonglong *)(lVar9 + 0x40) < 0x10) {
    lVar9 = lVar9 + 0x28;
    if (uVar6 != 0) goto LAB_7ff70c8f8ae2;
LAB_7ff70c8f8b0e:
    uVar10 = 0xcbf29ce484222325;
  }
  else {
    lVar9 = *(longlong *)(lVar9 + 0x28);
    if (uVar6 == 0) goto LAB_7ff70c8f8b0e;
LAB_7ff70c8f8ae2:
    uVar5 = (ulonglong)((uint)uVar6 & 3);
    if (uVar6 < 4) {
      uVar10 = 0xcbf29ce484222325;
      uVar7 = 0;
LAB_7ff70c8f8b71:
      uVar12 = 0;
      do {
        uVar10 = (*(byte *)(uVar7 + lVar9 + uVar12) ^ uVar10) * 0x100000001b3;
        uVar12 = uVar12 + 1;
      } while (uVar5 != uVar12);
    }
    else {
      uVar10 = 0xcbf29ce484222325;
      uVar7 = 0;
      do {
        uVar10 = ((ulonglong)*(byte *)(lVar9 + 3 + uVar7) ^
                 ((ulonglong)*(byte *)(lVar9 + 2 + uVar7) ^
                 ((ulonglong)*(byte *)(lVar9 + 1 + uVar7) ^
                 (*(byte *)(lVar9 + uVar7) ^ uVar10) * 0x100000001b3) * 0x100000001b3) *
                 0x100000001b3) * 0x100000001b3;
        uVar7 = uVar7 + 4;
      } while ((uVar6 & 0xfffffffffffffffc) != uVar7);
      if (uVar5 != 0) goto LAB_7ff70c8f8b71;
    }
  }
  lVar2 = *(longlong *)(param_1 + 8);
  lVar11 = (uVar10 & *(ulonglong *)(param_1 + 0x30)) * 0x10;
  lVar13 = *(longlong *)(*(longlong *)(param_1 + 0x18) + 8 + lVar11);
  bVar14 = true;
  if (lVar13 != lVar2) {
    lVar11 = *(longlong *)(*(longlong *)(param_1 + 0x18) + lVar11);
    if (uVar6 == 0) {
      for (; *(longlong *)(lVar13 + 0x20) != 0; lVar13 = *(longlong *)(lVar13 + 8)) {
        if (lVar13 == lVar11) goto LAB_7ff70c8f8c32;
      }
LAB_7ff70c8f8c22:
      bVar14 = lVar13 == lVar2;
      if ((!bVar14) && (*(longlong *)(param_1 + 0x10) != 1)) {
LAB_7ff70c8f8c59:
        FUN_7ff70c8f85d0(param_1,auStack_a0);
        FUN_7ff70ca215b0(auStack_68,&UNK_7ff70cb90a7c,auStack_a0);
        FUN_7ff70c8f9170(auStack_80,auStack_68);
        FUN_7ff70cb12a50(auStack_80,&UNK_7ff70cb9fda0);
        pcVar3 = (code *)swi(3);
        uVar6 = (*pcVar3)();
        return uVar6;
      }
    }
    else {
      uVar5 = *(ulonglong *)(lVar13 + 0x20);
      while( true ) {
        if (uVar6 == uVar5) {
          if (*(ulonglong *)(lVar13 + 0x28) < 0x10) {
            lVar8 = lVar13 + 0x10;
          }
          else {
            lVar8 = *(longlong *)(lVar13 + 0x10);
          }
          iVar4 = FUN_7ff70cb12b50(lVar9,lVar8,uVar6);
          if (iVar4 == 0) goto LAB_7ff70c8f8c22;
        }
        if (lVar13 == lVar11) break;
        lVar13 = *(longlong *)(lVar13 + 8);
        uVar5 = *(ulonglong *)(lVar13 + 0x20);
      }
    }
  }
LAB_7ff70c8f8c32:
  return (CONCAT71((int7)((ulonglong)unaff_R14 >> 8),bVar14) ^ 1) & 0xffffffff;
}


