/* 7ff70c7e7220 FUN_7ff70c7e7220 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7e7220(undefined8 param_1,longlong param_2,longlong param_3)

{
  longlong lVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  code *pcVar6;
  char cVar7;
  uint uVar8;
  undefined4 uVar9;
  ulonglong unaff_RBP;
  ulonglong uVar10;
  longlong lVar11;
  longlong lVar12;
  ushort uVar13;
  undefined1 auStack_68 [32];
  ulonglong uStack_48;
  
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  if (*(short *)(param_2 + 0x32) == 0) {
    lVar1 = param_2 + 0x38;
    lVar3 = *(longlong *)(param_2 + 8);
    if (*(int *)(param_2 + 0x38) == 0) {
      unaff_RBP = CONCAT62((int6)(unaff_RBP >> 0x10),0xfffd);
      iVar2 = *(int *)(param_2 + 0x20);
    }
    else {
      uVar8 = FUN_7ff70c804a30(lVar1,0xfffd,0xfffd);
      unaff_RBP = (ulonglong)uVar8;
      iVar2 = *(int *)(param_2 + 0x20);
    }
    if ((longlong)iVar2 != 0) {
      lVar11 = *(longlong *)(param_2 + 0x28);
      lVar12 = 0;
      do {
        lVar4 = *(longlong *)(lVar11 + lVar12);
        lVar5 = *(longlong *)(lVar4 + 0x80);
        if (lVar5 == 0) {
          pcVar6 = *(code **)(*(longlong *)(lVar3 + 0x2b8) + 0x28);
        }
        else {
          pcVar6 = *(code **)(lVar5 + 0x28);
        }
        if ((pcVar6 != (code *)0x0) &&
           (cVar7 = (*pcVar6)(lVar3,lVar4,unaff_RBP & 0xffffffff), cVar7 != '\0')) {
          *(undefined2 *)(param_2 + 0x32) = 0xfffd;
          goto LAB_7ff70c7e724c;
        }
        lVar12 = lVar12 + 8;
      } while ((longlong)iVar2 * 8 != lVar12);
    }
    lVar3 = *(longlong *)(param_2 + 8);
    if (*(int *)(param_2 + 0x38) == 0) {
      unaff_RBP = CONCAT62((int6)(unaff_RBP >> 0x10),0x3f);
      iVar2 = *(int *)(param_2 + 0x20);
    }
    else {
      uVar8 = FUN_7ff70c804a30(lVar1,0x3f,0x3f);
      unaff_RBP = (ulonglong)uVar8;
      iVar2 = *(int *)(param_2 + 0x20);
    }
    if ((longlong)iVar2 != 0) {
      lVar11 = *(longlong *)(param_2 + 0x28);
      lVar12 = 0;
      do {
        lVar4 = *(longlong *)(lVar11 + lVar12);
        lVar5 = *(longlong *)(lVar4 + 0x80);
        if (lVar5 == 0) {
          pcVar6 = *(code **)(*(longlong *)(lVar3 + 0x2b8) + 0x28);
        }
        else {
          pcVar6 = *(code **)(lVar5 + 0x28);
        }
        if ((pcVar6 != (code *)0x0) &&
           (cVar7 = (*pcVar6)(lVar3,lVar4,unaff_RBP & 0xffffffff), cVar7 != '\0')) {
          *(undefined2 *)(param_2 + 0x32) = 0x3f;
          goto LAB_7ff70c7e724c;
        }
        lVar12 = lVar12 + 8;
      } while ((longlong)iVar2 * 8 != lVar12);
    }
    lVar3 = *(longlong *)(param_2 + 8);
    if (*(int *)(param_2 + 0x38) == 0) {
      uVar9 = (undefined4)CONCAT62((int6)((ulonglong)lVar1 >> 0x10),0x20);
      iVar2 = *(int *)(param_2 + 0x20);
    }
    else {
      uVar9 = FUN_7ff70c804a30(lVar1,0x20,0x20);
      iVar2 = *(int *)(param_2 + 0x20);
    }
    if ((longlong)iVar2 != 0) {
      lVar1 = *(longlong *)(param_2 + 0x28);
      lVar11 = 0;
      do {
        lVar12 = *(longlong *)(lVar1 + lVar11);
        lVar4 = *(longlong *)(lVar12 + 0x80);
        if (lVar4 == 0) {
          pcVar6 = *(code **)(*(longlong *)(lVar3 + 0x2b8) + 0x28);
        }
        else {
          pcVar6 = *(code **)(lVar4 + 0x28);
        }
        if ((pcVar6 != (code *)0x0) && (cVar7 = (*pcVar6)(lVar3,lVar12,uVar9), cVar7 != '\0')) {
          *(undefined2 *)(param_2 + 0x32) = 0x20;
          break;
        }
        lVar11 = lVar11 + 8;
      } while ((longlong)iVar2 * 8 != lVar11);
    }
  }
LAB_7ff70c7e724c:
  if (*(short *)(param_2 + 0x30) == 0) {
    uVar13 = *(ushort *)(param_3 + 0x3a);
    uVar10 = (ulonglong)uVar13;
    lVar1 = param_2 + 0x38;
    if (uVar13 != 0) {
      lVar3 = *(longlong *)(param_2 + 8);
      if (*(int *)(param_2 + 0x38) != 0) {
        uVar8 = FUN_7ff70c804a30(lVar1,uVar10,uVar10);
        uVar10 = (ulonglong)uVar8;
      }
      iVar2 = *(int *)(param_2 + 0x20);
      unaff_RBP = uVar10;
      if ((longlong)iVar2 != 0) {
        lVar11 = *(longlong *)(param_2 + 0x28);
        lVar12 = 0;
        do {
          lVar4 = *(longlong *)(lVar11 + lVar12);
          lVar5 = *(longlong *)(lVar4 + 0x80);
          if (lVar5 == 0) {
            pcVar6 = *(code **)(*(longlong *)(lVar3 + 0x2b8) + 0x28);
          }
          else {
            pcVar6 = *(code **)(lVar5 + 0x28);
          }
          if ((pcVar6 != (code *)0x0) && (cVar7 = (*pcVar6)(lVar3,lVar4,uVar10), cVar7 != '\0'))
          goto LAB_7ff70c7e74a1;
          lVar12 = lVar12 + 8;
        } while ((longlong)iVar2 * 8 != lVar12);
      }
    }
    lVar3 = *(longlong *)(param_2 + 8);
    if (*(int *)(param_2 + 0x38) == 0) {
      uVar9 = (undefined4)CONCAT62((int6)(unaff_RBP >> 0x10),0x2026);
      iVar2 = *(int *)(param_2 + 0x20);
    }
    else {
      uVar9 = FUN_7ff70c804a30(lVar1,0x2026,0x2026);
      iVar2 = *(int *)(param_2 + 0x20);
    }
    if ((longlong)iVar2 != 0) {
      lVar11 = *(longlong *)(param_2 + 0x28);
      lVar12 = 0;
      do {
        lVar4 = *(longlong *)(lVar11 + lVar12);
        lVar5 = *(longlong *)(lVar4 + 0x80);
        if (lVar5 == 0) {
          pcVar6 = *(code **)(*(longlong *)(lVar3 + 0x2b8) + 0x28);
        }
        else {
          pcVar6 = *(code **)(lVar5 + 0x28);
        }
        if ((pcVar6 != (code *)0x0) && (cVar7 = (*pcVar6)(lVar3,lVar4,uVar9), cVar7 != '\0')) {
          uVar13 = 0x2026;
LAB_7ff70c7e74a1:
          *(ushort *)(param_2 + 0x30) = uVar13;
          goto LAB_7ff70c7e7253;
        }
        lVar12 = lVar12 + 8;
      } while ((longlong)iVar2 * 8 != lVar12);
    }
    lVar3 = *(longlong *)(param_2 + 8);
    if (*(int *)(param_2 + 0x38) == 0) {
      uVar9 = (undefined4)CONCAT62((int6)((ulonglong)lVar1 >> 0x10),0x85);
      iVar2 = *(int *)(param_2 + 0x20);
    }
    else {
      uVar9 = FUN_7ff70c804a30(lVar1,0x85,0x85);
      iVar2 = *(int *)(param_2 + 0x20);
    }
    if ((longlong)iVar2 != 0) {
      lVar1 = *(longlong *)(param_2 + 0x28);
      lVar11 = 0;
      do {
        lVar12 = *(longlong *)(lVar1 + lVar11);
        lVar4 = *(longlong *)(lVar12 + 0x80);
        if (lVar4 == 0) {
          pcVar6 = *(code **)(*(longlong *)(lVar3 + 0x2b8) + 0x28);
        }
        else {
          pcVar6 = *(code **)(lVar4 + 0x28);
        }
        if ((pcVar6 != (code *)0x0) && (cVar7 = (*pcVar6)(lVar3,lVar12,uVar9), cVar7 != '\0')) {
          *(undefined2 *)(param_2 + 0x30) = 0x85;
          goto LAB_7ff70c7e7253;
        }
        lVar11 = lVar11 + 8;
      } while ((longlong)iVar2 * 8 != lVar11);
    }
    if (*(short *)(param_2 + 0x30) == 0) {
      *(undefined2 *)(param_2 + 0x30) = 0x85;
      *(undefined1 *)(param_2 + 0x35) = 1;
    }
  }
LAB_7ff70c7e7253:
  if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_68)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_68);
  pcVar6 = (code *)swi(3);
  (*pcVar6)();
  return;
}


