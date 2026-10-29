/* 7ff70c924500 FUN_7ff70c924500 */

bool FUN_7ff70c924500(longlong param_1,longlong *param_2)

{
  longlong lVar1;
  ulonglong uVar2;
  int iVar3;
  ulonglong uVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  
  uVar4 = 0xcbf29ce484222325;
  lVar1 = *param_2;
  uVar2 = param_2[1];
  if (uVar2 != 0) {
    uVar7 = (ulonglong)((uint)uVar2 & 3);
    if (uVar2 < 4) {
      uVar8 = 0;
    }
    else {
      uVar8 = 0;
      do {
        uVar4 = ((ulonglong)*(byte *)(lVar1 + 3 + uVar8) ^
                ((ulonglong)*(byte *)(lVar1 + 2 + uVar8) ^
                ((ulonglong)*(byte *)(lVar1 + 1 + uVar8) ^
                (*(byte *)(lVar1 + uVar8) ^ uVar4) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3
                ) * 0x100000001b3;
        uVar8 = uVar8 + 4;
      } while ((uVar2 & 0xfffffffffffffffc) != uVar8);
      if (uVar7 == 0) goto LAB_7ff70c9245b7;
    }
    uVar9 = 0;
    do {
      uVar4 = (*(byte *)(uVar8 + lVar1 + uVar9) ^ uVar4) * 0x100000001b3;
      uVar9 = uVar9 + 1;
    } while (uVar7 != uVar9);
  }
LAB_7ff70c9245b7:
  lVar5 = (uVar4 & *(ulonglong *)(param_1 + 0x30)) * 0x10;
  lVar6 = *(longlong *)(*(longlong *)(param_1 + 0x18) + 8 + lVar5);
  if (lVar6 != *(longlong *)(param_1 + 8)) {
    lVar5 = *(longlong *)(*(longlong *)(param_1 + 0x18) + lVar5);
    if (uVar2 == 0) {
      for (; *(longlong *)(lVar6 + 0x18) != 0; lVar6 = *(longlong *)(lVar6 + 8)) {
        if (lVar6 == lVar5) goto LAB_7ff70c924622;
      }
      goto LAB_7ff70c924624;
    }
    uVar4 = *(ulonglong *)(lVar6 + 0x18);
    while( true ) {
      if ((uVar2 == uVar4) &&
         (iVar3 = FUN_7ff70cb12b50(lVar1,*(undefined8 *)(lVar6 + 0x10),uVar2), iVar3 == 0))
      goto LAB_7ff70c924624;
      if (lVar6 == lVar5) break;
      lVar6 = *(longlong *)(lVar6 + 8);
      uVar4 = *(ulonglong *)(lVar6 + 0x18);
    }
  }
LAB_7ff70c924622:
  lVar6 = 0;
LAB_7ff70c924624:
  return lVar6 != 0;
}


