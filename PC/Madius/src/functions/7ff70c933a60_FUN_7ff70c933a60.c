/* 7ff70c933a60 FUN_7ff70c933a60 */

longlong FUN_7ff70c933a60(longlong param_1,longlong *param_2)

{
  ulonglong uVar1;
  code *pcVar2;
  int iVar3;
  ulonglong uVar4;
  longlong lVar5;
  longlong lVar6;
  longlong lVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  
  uVar4 = 0xcbf29ce484222325;
  lVar6 = *param_2;
  uVar1 = param_2[1];
  if (uVar1 != 0) {
    uVar8 = (ulonglong)((uint)uVar1 & 3);
    if (uVar1 < 4) {
      uVar9 = 0;
    }
    else {
      uVar9 = 0;
      do {
        uVar4 = ((ulonglong)*(byte *)(lVar6 + 3 + uVar9) ^
                ((ulonglong)*(byte *)(lVar6 + 2 + uVar9) ^
                ((ulonglong)*(byte *)(lVar6 + 1 + uVar9) ^
                (*(byte *)(lVar6 + uVar9) ^ uVar4) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3
                ) * 0x100000001b3;
        uVar9 = uVar9 + 4;
      } while ((uVar1 & 0xfffffffffffffffc) != uVar9);
      if (uVar8 == 0) goto LAB_7ff70c933b17;
    }
    uVar10 = 0;
    do {
      uVar4 = (*(byte *)(uVar9 + lVar6 + uVar10) ^ uVar4) * 0x100000001b3;
      uVar10 = uVar10 + 1;
    } while (uVar8 != uVar10);
  }
LAB_7ff70c933b17:
  lVar5 = (uVar4 & *(ulonglong *)(param_1 + 0x30)) * 0x10;
  lVar7 = *(longlong *)(*(longlong *)(param_1 + 0x18) + 8 + lVar5);
  if (lVar7 != *(longlong *)(param_1 + 8)) {
    lVar5 = *(longlong *)(*(longlong *)(param_1 + 0x18) + lVar5);
    if (uVar1 == 0) {
      for (; *(longlong *)(lVar7 + 0x18) != 0; lVar7 = *(longlong *)(lVar7 + 8)) {
        if (lVar7 == lVar5) goto LAB_7ff70c933b91;
      }
LAB_7ff70c933b80:
      return lVar7 + 0x20;
    }
    uVar4 = *(ulonglong *)(lVar7 + 0x18);
    while( true ) {
      if ((uVar1 == uVar4) &&
         (iVar3 = FUN_7ff70cb12b50(lVar6,*(undefined8 *)(lVar7 + 0x10),uVar1), iVar3 == 0))
      goto LAB_7ff70c933b80;
      if (lVar7 == lVar5) break;
      lVar7 = *(longlong *)(lVar7 + 8);
      uVar4 = *(ulonglong *)(lVar7 + 0x18);
    }
  }
LAB_7ff70c933b91:
  FUN_7ff70cb12530(&UNK_7ff70cb7ffa9);
  pcVar2 = (code *)swi(3);
  lVar6 = (*pcVar2)();
  return lVar6;
}


