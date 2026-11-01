/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180c65600(longlong param_1,undefined8 param_2)

{
  int *piVar1;
  undefined4 uVar2;
  longlong lVar3;
  undefined1 *puVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  longlong lVar8;
  char *pcVar9;
  ulonglong uVar10;
  undefined8 uVar11;
  undefined8 unaff_RBX;
  longlong lVar12;
  undefined1 *puVar13;
  undefined8 unaff_RSI;
  undefined8 unaff_RDI;
  undefined8 unaff_R12;
  longlong lStackX_8;
  uint auStackX_10 [2];
  int iStackX_18;
  uint uStackX_1c;
  undefined8 uStackX_20;
  undefined8 uStack_20;
  
  uStack_20 = 0x180c65610;
  lVar8 = FUN_180e15b20();
  lVar8 = -lVar8;
  puVar13 = &stack0xffffffffffffffe8 + lVar8;
  piVar1 = (int *)((longlong)&iStackX_18 + lVar8);
  *(undefined8 *)(&stack0x00000058 + lVar8) = unaff_RBX;
  *(undefined8 *)(&stack0x00000060 + lVar8) = unaff_RSI;
  *(undefined8 *)(&stack0x00000068 + lVar8) = unaff_RDI;
  *(undefined8 *)(&stack0x00000070 + lVar8) = unaff_R12;
  *(ulonglong *)(&stack0x00000028 + lVar8) = _DAT_1810c1700 ^ (ulonglong)piVar1;
  *piVar1 = 0;
  lVar12 = 0;
  *(undefined8 *)((longlong)&uStack_20 + lVar8) = 0x180c6565f;
  FUN_180c63110();
  lVar3 = *(longlong *)(param_1 + 0x18);
  if (lVar3 == 0) {
LAB_180c65740:
    uVar2 = *(undefined4 *)(param_1 + 0x20);
    *(undefined4 *)(puVar13 + 0x20) = 0xf0000000;
    *(undefined8 *)(puVar13 + -8) = 0x180c6575b;
    iVar6 = CryptAcquireContextW((longlong)&uStackX_20 + lVar8,0,lVar12,uVar2);
    if (iVar6 != 0) {
      uVar11 = *(undefined8 *)((longlong)&uStackX_20 + lVar8);
      *(undefined4 *)(puVar13 + 0x20) = 1;
      *(undefined8 *)(puVar13 + -8) = 0x180c657c7;
      iVar6 = CryptGetProvParam(uVar11,2,0,piVar1);
      if (iVar6 == 0) {
        if (_DAT_1810cfa98 == 0) {
          *(undefined8 *)(puVar13 + -8) = 0x180c657d8;
          _DAT_1810cfa98 = FUN_180c153b0();
        }
        *(undefined8 *)(puVar13 + -8) = 0x180c657e3;
        FUN_180c14970();
        *(undefined8 *)(puVar13 + -8) = 0x180c657fb;
        FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
        *(undefined8 *)(puVar13 + -8) = 0x180c6580e;
        FUN_180c14bc0(_DAT_1810cfa98,0x6c,0);
        *(undefined8 *)(puVar13 + -8) = 0x180c65822;
        FUN_180c14a90(&UNK_180f8c6a0,0x4eb,0);
        *(undefined8 *)(puVar13 + -8) = 0x180c65827;
        FUN_180c63290();
        uVar11 = *(undefined8 *)((longlong)&uStackX_20 + lVar8);
        *(undefined8 *)(puVar13 + -8) = 0x180c65833;
        CryptReleaseContext(uVar11,0);
      }
      else {
        iVar6 = *piVar1;
        *(undefined8 *)(puVar13 + -8) = 0x180c6584d;
        FUN_180c63110(param_1,&UNK_180f8c8f0,iVar6);
        iVar6 = *piVar1;
        if (iVar6 == 0) {
          iVar6 = 0x400;
          *piVar1 = 0x400;
        }
        *(undefined8 *)(puVar13 + -8) = 0x180c65870;
        pcVar9 = (char *)FUN_180c14360(iVar6,&UNK_180f8c6a0,0x4f3);
        if (pcVar9 != (char *)0x0) {
          iVar6 = 0;
          while( true ) {
            *(int *)((longlong)&uStackX_1c + lVar8) = *piVar1;
            *pcVar9 = '\0';
            uVar11 = *(undefined8 *)((longlong)&uStackX_20 + lVar8);
            *(uint *)(puVar13 + 0x20) = (uint)(iVar6 == 0);
            *(undefined8 *)(puVar13 + -8) = 0x180c658ab;
            iVar7 = CryptGetProvParam(uVar11,2,pcVar9,(longlong)&uStackX_1c + lVar8);
            if (iVar7 == 0) break;
            uVar2 = *(undefined4 *)((longlong)&uStackX_1c + lVar8);
            *(uint *)(puVar13 + 0x28) = (uint)(iVar6 == 0);
            *(int *)(puVar13 + 0x20) = iVar6;
            *(undefined8 *)(puVar13 + -8) = 0x180c658cd;
            FUN_180c63110(param_1,&UNK_180f8c910,pcVar9,uVar2);
            if ((*pcVar9 == '\0') && (*(int *)((longlong)&uStackX_1c + lVar8) == *piVar1)) {
              *(undefined8 *)(puVar13 + -8) = 0x180c65902;
              FUN_180c63110(param_1,&UNK_180f8c940);
              goto LAB_180c65975;
            }
            *(undefined8 *)(puVar13 + -8) = 0x180c658ef;
            FUN_180c376c0(param_2,&UNK_180f8c968,iVar6,pcVar9);
            iVar6 = iVar6 + 1;
          }
          *(undefined8 *)(puVar13 + -8) = 0x180c6590a;
          iVar6 = GetLastError();
          if (iVar6 != 0x103) {
            if (_DAT_1810cfa98 == 0) {
              *(undefined8 *)(puVar13 + -8) = 0x180c65921;
              _DAT_1810cfa98 = FUN_180c153b0();
            }
            *(undefined8 *)(puVar13 + -8) = 0x180c6592c;
            FUN_180c14970();
            *(undefined8 *)(puVar13 + -8) = 0x180c65944;
            FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
            *(undefined8 *)(puVar13 + -8) = 0x180c65957;
            FUN_180c14bc0(_DAT_1810cfa98,0x6c,0);
            *(undefined8 *)(puVar13 + -8) = 0x180c6596b;
            FUN_180c14a90(&UNK_180f8c6a0,0x504,0);
            *(undefined8 *)(puVar13 + -8) = 0x180c65972;
            FUN_180c63230(iVar6);
          }
        }
LAB_180c65975:
        *(undefined8 *)(puVar13 + -8) = 0x180c6598a;
        FUN_180c14420(pcVar9,&UNK_180f8c6a0,0x515);
        uVar11 = *(undefined8 *)((longlong)&uStackX_20 + lVar8);
        *(undefined8 *)(puVar13 + -8) = 0x180c65996;
        CryptReleaseContext(uVar11,0);
      }
      goto LAB_180c65999;
    }
    if (_DAT_1810cfa98 == 0) {
      *(undefined8 *)(puVar13 + -8) = 0x180c6576c;
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    *(undefined8 *)(puVar13 + -8) = 0x180c65777;
    FUN_180c14970();
    *(undefined8 *)(puVar13 + -8) = 0x180c6578f;
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    *(undefined8 *)(puVar13 + -8) = 0x180c657a2;
    FUN_180c14bc0(_DAT_1810cfa98,0x68,0);
    uVar11 = 0x4e5;
  }
  else {
    *(undefined4 *)((longlong)auStackX_10 + lVar8) = 0;
    *(undefined8 *)((longlong)&lStackX_8 + lVar8) = 0;
    *(undefined8 *)((longlong)&uStack_20 + lVar8) = 0x180c65685;
    uVar5 = MultiByteToWideChar(0,0,lVar3,0xffffffff);
    *(uint *)((longlong)&uStackX_1c + lVar8) = uVar5;
    puVar4 = &stack0xffffffffffffffe8 + lVar8;
    if (uVar5 != 0) {
      uVar10 = (ulonglong)uVar5 * 2 + 0xf;
      if (uVar10 <= (ulonglong)uVar5 * 2) {
        uVar10 = 0xffffffffffffff0;
      }
      uVar10 = uVar10 & 0xfffffffffffffff0;
      *(undefined8 *)((longlong)&uStack_20 + lVar8) = 0x180c656b2;
      FUN_180e15b20();
      uVar11 = *(undefined8 *)(param_1 + 0x18);
      lVar3 = -uVar10;
      puVar13 = &stack0xffffffffffffffe8 + lVar3 + lVar8;
      *(uint *)((longlong)auStackX_10 + lVar3 + lVar8) = uVar5;
      lVar12 = (longlong)&iStackX_18 + lVar3 + lVar8;
      *(longlong *)((longlong)&lStackX_8 + lVar3 + lVar8) = lVar12;
      *(undefined8 *)((longlong)&uStack_20 + lVar3 + lVar8) = 0x180c656d7;
      MultiByteToWideChar(0,0,uVar11,0xffffffff);
      puVar4 = &stack0xffffffffffffffe8 + lVar3 + lVar8;
      if (lVar12 != 0) goto LAB_180c65740;
    }
    puVar13 = puVar4;
    if (_DAT_1810cfa98 == 0) {
      *(undefined8 *)(puVar13 + -8) = 0x180c656ea;
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    *(undefined8 *)(puVar13 + -8) = 0x180c656f5;
    FUN_180c14970();
    *(undefined8 *)(puVar13 + -8) = 0x180c6570d;
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    *(undefined8 *)(puVar13 + -8) = 0x180c65720;
    FUN_180c14bc0(_DAT_1810cfa98,0xc0100,0);
    uVar11 = 0x4dd;
  }
  *(undefined8 *)(puVar13 + -8) = 0x180c65734;
  FUN_180c14a90(&UNK_180f8c6a0,uVar11,0);
  *(undefined8 *)(puVar13 + -8) = 0x180c65739;
  FUN_180c63290();
LAB_180c65999:
  uVar10 = *(ulonglong *)(&stack0x00000028 + lVar8);
  *(undefined8 *)(puVar13 + -8) = 0x180c659a5;
  FUN_180e155e0(uVar10 ^ (ulonglong)piVar1);
  return;
}


