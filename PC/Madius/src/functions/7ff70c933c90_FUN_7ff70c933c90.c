/* 7ff70c933c90 FUN_7ff70c933c90 */

longlong * FUN_7ff70c933c90(longlong param_1,longlong *param_2,longlong *param_3)

{
  longlong lVar1;
  ulonglong uVar2;
  int iVar3;
  ulonglong uVar4;
  longlong lVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  longlong lVar9;
  longlong lVar10;
  
  uVar4 = 0xcbf29ce484222325;
  lVar1 = *param_3;
  uVar2 = param_3[1];
  if (uVar2 != 0) {
    uVar6 = (ulonglong)((uint)uVar2 & 3);
    if (uVar2 < 4) {
      uVar7 = 0;
    }
    else {
      uVar7 = 0;
      do {
        uVar4 = ((ulonglong)*(byte *)(lVar1 + 3 + uVar7) ^
                ((ulonglong)*(byte *)(lVar1 + 2 + uVar7) ^
                ((ulonglong)*(byte *)(lVar1 + 1 + uVar7) ^
                (*(byte *)(lVar1 + uVar7) ^ uVar4) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3
                ) * 0x100000001b3;
        uVar7 = uVar7 + 4;
      } while ((uVar2 & 0xfffffffffffffffc) != uVar7);
      if (uVar6 == 0) goto LAB_7ff70c933d47;
    }
    uVar8 = 0;
    do {
      uVar4 = (*(byte *)(uVar7 + lVar1 + uVar8) ^ uVar4) * 0x100000001b3;
      uVar8 = uVar8 + 1;
    } while (uVar6 != uVar8);
  }
LAB_7ff70c933d47:
  lVar9 = *(longlong *)(param_1 + 8);
  lVar5 = (uVar4 & *(ulonglong *)(param_1 + 0x30)) * 0x10;
  lVar10 = *(longlong *)(*(longlong *)(param_1 + 0x18) + 8 + lVar5);
  if (lVar10 != lVar9) {
    lVar5 = *(longlong *)(*(longlong *)(param_1 + 0x18) + lVar5);
    if (uVar2 == 0) {
      for (; *(longlong *)(lVar10 + 0x18) != 0; lVar10 = *(longlong *)(lVar10 + 8)) {
        if (lVar10 == lVar5) goto LAB_7ff70c933db2;
      }
      goto LAB_7ff70c933db5;
    }
    uVar4 = *(ulonglong *)(lVar10 + 0x18);
    while( true ) {
      if ((uVar2 == uVar4) &&
         (iVar3 = FUN_7ff70cb12b50(lVar1,*(undefined8 *)(lVar10 + 0x10),uVar2), iVar3 == 0))
      goto LAB_7ff70c933db5;
      if (lVar10 == lVar5) break;
      lVar10 = *(longlong *)(lVar10 + 8);
      uVar4 = *(ulonglong *)(lVar10 + 0x18);
    }
  }
LAB_7ff70c933db2:
  lVar10 = 0;
LAB_7ff70c933db5:
  if (lVar10 != 0) {
    lVar9 = lVar10;
  }
  *param_2 = lVar9;
  return param_2;
}


