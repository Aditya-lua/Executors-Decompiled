/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180c63a60(undefined8 param_1,int param_2,undefined8 param_3)

{
  undefined4 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  undefined1 uVar6;
  undefined1 uVar7;
  undefined1 uVar8;
  undefined1 uVar9;
  undefined1 uVar10;
  undefined1 uVar11;
  int iVar12;
  longlong lVar13;
  undefined8 uVar14;
  longlong lVar15;
  longlong lVar16;
  longlong lVar17;
  ulonglong uVar18;
  longlong lStackX_8;
  undefined4 auStack_58 [2];
  undefined8 uStack_50;
  undefined1 uStack_48;
  undefined1 uStack_47;
  undefined1 uStack_46;
  undefined1 uStack_45;
  undefined1 uStack_44;
  undefined1 uStack_43;
  undefined1 uStack_42;
  undefined1 uStack_41;
  undefined1 uStack_40;
  undefined1 uStack_3f;
  undefined1 uStack_3e;
  undefined1 uStack_3d;
  undefined1 uStack_3c;
  undefined1 uStack_3b;
  undefined1 uStack_3a;
  undefined1 uStack_39;
  undefined1 uStack_38;
  undefined1 uStack_37;
  undefined1 uStack_36;
  undefined1 uStack_35;
  undefined1 auStack_34 [20];
  ulonglong uStack_20;
  
  uStack_20 = 0x180c63a7b;
  lVar13 = FUN_180e15b20();
  lVar13 = -lVar13;
  uStack_20 = _DAT_1810c1700 ^ (ulonglong)(&stack0xffffffffffffffe8 + lVar13);
  *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63a9e;
  uVar14 = func_0x000180c79ac0(param_3);
  *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63aac;
  uVar14 = FUN_180c5dfe0(uVar14,_DAT_1810bdbe0);
  *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63abb;
  FUN_180c63110(uVar14,&UNK_180f8c7f8);
  *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63ac9;
  lVar15 = FUN_180c79af0(param_3,_DAT_1810bdbe8);
  if (lVar15 == 0) {
    if (_DAT_1810cfa98 == 0) {
      *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63ade;
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63ae9;
    FUN_180c14970();
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63b01;
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63b14;
    FUN_180c14bc0(_DAT_1810cfa98,0x66,0);
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63b28;
    FUN_180c14a90(&UNK_180f8c6a0,0x40e,0);
    goto LAB_180c63dc8;
  }
  if (param_2 != 0x14) {
    if (_DAT_1810cfa98 == 0) {
      *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63b41;
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63b4c;
    FUN_180c14970();
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63b64;
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63b77;
    FUN_180c14bc0(_DAT_1810cfa98,0x76,0);
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63b8b;
    FUN_180c14a90(&UNK_180f8c6a0,0x413,0);
    goto LAB_180c63dc8;
  }
  uVar14 = *(undefined8 *)(lVar15 + 8);
  *(undefined8 **)((longlong)&lStackX_8 + lVar13) = &uStack_50;
  *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63bb0;
  iVar12 = CryptCreateHash(uVar14,0x8004,0,0);
  if (iVar12 == 0) {
    if (_DAT_1810cfa98 == 0) {
      *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63bc1;
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63bcc;
    FUN_180c14970();
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63be4;
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63bf7;
    FUN_180c14bc0(_DAT_1810cfa98,100,0);
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63c0b;
    FUN_180c14a90(&UNK_180f8c6a0,0x419,0);
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63c10;
    FUN_180c63290();
    goto LAB_180c63dc8;
  }
  *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63c2c;
  iVar12 = CryptSetHashParam(uStack_50,2,param_1,0);
  if (iVar12 == 0) {
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63c49;
    FUN_180c631b0(0,0x67,&UNK_180f8c6a0,0x420);
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63c4e;
    FUN_180c63290();
  }
  else {
    *(undefined4 **)(&stack0x00000010 + lVar13) = auStack_58;
    auStack_58[0] = 0x28;
    uVar1 = *(undefined4 *)(lVar15 + 0x18);
    *(undefined1 **)((longlong)&lStackX_8 + lVar13) = &uStack_48;
    *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63c7f;
    iVar12 = CryptSignHashW(uStack_50,uVar1,0,0);
    if (iVar12 == 0) {
      *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63c9c;
      FUN_180c631b0(0,0x72,&UNK_180f8c6a0,0x428);
      *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63ca1;
      FUN_180c63290();
    }
    else {
      *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63cab;
      lVar15 = FUN_180c195d0();
      *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63cb3;
      lVar16 = FUN_180c195d0();
      uVar11 = uStack_35;
      uVar10 = uStack_36;
      uVar9 = uStack_37;
      uVar8 = uStack_38;
      uVar7 = uStack_39;
      uVar6 = uStack_3a;
      uVar5 = uStack_3b;
      uVar4 = uStack_3c;
      uVar3 = uStack_3d;
      uVar2 = uStack_3e;
      if ((lVar15 != 0) && (lVar16 != 0)) {
        uStack_35 = uStack_48;
        uStack_48 = uVar11;
        uStack_36 = uStack_47;
        uStack_47 = uVar10;
        uStack_37 = uStack_46;
        uStack_46 = uVar9;
        uStack_38 = uStack_45;
        uStack_45 = uVar8;
        uStack_39 = uStack_44;
        uStack_44 = uVar7;
        uStack_3a = uStack_43;
        uStack_43 = uVar6;
        uStack_3b = uStack_42;
        uStack_42 = uVar5;
        uStack_3c = uStack_41;
        uStack_41 = uVar4;
        uStack_3d = uStack_40;
        uStack_40 = uVar3;
        uStack_3e = uStack_3f;
        uStack_3f = uVar2;
        *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63d65;
        lVar17 = FUN_180c18d40(&uStack_48,0x14,lVar15);
        if (lVar17 != 0) {
          *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63d7c;
          iVar12 = FUN_180c669a0(lVar16,auStack_34,0x14);
          if (iVar12 != 0) {
            *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63d85;
            lVar17 = FUN_180c7a000();
            if (lVar17 != 0) {
              *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63d9b;
              FUN_180c7a030(lVar17,lVar15,lVar16);
              goto LAB_180c63dad;
            }
          }
        }
      }
      *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63da5;
      FUN_180c193a0(lVar15);
      *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63dad;
      FUN_180c193a0(lVar16);
    }
  }
LAB_180c63dad:
  *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63dbb;
  func_0x000180001240(&uStack_48,0x28);
  *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63dc5;
  CryptDestroyHash(uStack_50);
LAB_180c63dc8:
  uVar18 = uStack_20 ^ (ulonglong)(&stack0xffffffffffffffe8 + lVar13);
  *(undefined8 *)((longlong)&uStack_20 + lVar13) = 0x180c63dd4;
  FUN_180e155e0(uVar18);
  return;
}


