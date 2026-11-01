/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180c664a0(ulonglong param_1,undefined8 param_2,undefined8 param_3,longlong param_4)

{
  undefined1 uVar1;
  undefined8 uVar2;
  uint *puVar3;
  undefined8 uVar4;
  int iVar5;
  undefined4 uVar6;
  longlong lVar7;
  undefined8 uVar8;
  longlong lVar9;
  uint uVar10;
  ulonglong uVar11;
  uint uVar12;
  ulonglong uVar13;
  undefined1 auStackX_8 [16];
  ulonglong auStackX_18 [2];
  undefined8 uStack_40;
  
  uStack_40 = 0x180c664b5;
  lVar7 = FUN_180e15b20();
  lVar7 = -lVar7;
  *(ulonglong *)((longlong)auStackX_18 + lVar7) =
       _DAT_1810c1700 ^ (ulonglong)(&stack0xffffffffffffffc8 + lVar7);
  uVar2 = *(undefined8 *)(&stack0x00000090 + lVar7);
  puVar3 = *(uint **)(&stack0x00000088 + lVar7);
  *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c664ec;
  uVar8 = func_0x000180c05340(uVar2);
  *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c664fa;
  uVar8 = FUN_180c5dfe0(uVar8,_DAT_1810bdbe0);
  *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66509;
  FUN_180c63110(uVar8,&UNK_180f8c7a0);
  *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66517;
  lVar9 = FUN_180c79af0(uVar2,_DAT_1810bdbe4);
  if (lVar9 == 0) {
    if (_DAT_1810cfa98 == 0) {
      *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c6652c;
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66537;
    FUN_180c14970();
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c6654f;
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66562;
    FUN_180c14bc0(_DAT_1810cfa98,0x66,0);
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66576;
    FUN_180c14a90(&UNK_180f8c6a0,0x362,0);
    goto LAB_180c66779;
  }
  iVar5 = (int)param_1;
  if (iVar5 < 0x2a1) {
    if (iVar5 == 0x2a0) {
      uVar8 = 0x800c;
    }
    else if (iVar5 == 4) {
      uVar8 = 0x8003;
    }
    else if (iVar5 == 0x40) {
      uVar8 = 0x8004;
    }
    else {
      if (iVar5 != 0x72) goto LAB_180c665bf;
      uVar8 = 0x8008;
    }
  }
  else if (iVar5 == 0x2a1) {
    uVar8 = 0x800d;
  }
  else {
    if (iVar5 != 0x2a2) {
LAB_180c665bf:
      *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c665d8;
      FUN_180c377d0(auStackX_8 + lVar7,10,&UNK_180f8c7b8,param_1 & 0xffffffff);
      *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c665f1;
      FUN_180c631b0(0,0x7e,&UNK_180f8c6a0,0x382);
      *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66607;
      FUN_180c14df0(2,&UNK_180f8c7bc,auStackX_8 + lVar7);
      goto LAB_180c66779;
    }
    uVar8 = 0x800e;
  }
  uVar4 = *(undefined8 *)(lVar9 + 8);
  *(longlong *)(&stack0xffffffffffffffe8 + lVar7) = (longlong)auStackX_18 + lVar7 + -0x18;
  *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66632;
  iVar5 = CryptCreateHash(uVar4,uVar8,0,0);
  if (iVar5 == 0) {
    if (_DAT_1810cfa98 == 0) {
      *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66643;
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c6664e;
    FUN_180c14970();
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66666;
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66679;
    FUN_180c14bc0(_DAT_1810cfa98,100,0);
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c6668d;
    FUN_180c14a90(&UNK_180f8c6a0,0x38a,0);
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66692;
    FUN_180c63290();
  }
  else {
    uVar8 = *(undefined8 *)((longlong)auStackX_18 + lVar7 + -0x18);
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c666ad;
    iVar5 = CryptSetHashParam(uVar8,2,param_2,0);
    if (iVar5 == 0) {
      *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c666ca;
      FUN_180c631b0(0,0x67,&UNK_180f8c6a0,0x391);
      *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c666cf;
      FUN_180c63290();
    }
    else {
      *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c666dc;
      uVar6 = FUN_180c95e50(uVar2);
      uVar2 = *(undefined8 *)((longlong)auStackX_18 + lVar7 + -0x18);
      *(undefined4 *)(&stack0xfffffffffffffff8 + lVar7) = uVar6;
      uVar6 = *(undefined4 *)(lVar9 + 0x18);
      *(undefined1 **)(&stack0xfffffffffffffff0 + lVar7) = &stack0xfffffffffffffff8 + lVar7;
      *(longlong *)(&stack0xffffffffffffffe8 + lVar7) = param_4;
      *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66703;
      iVar5 = CryptSignHashW(uVar2,uVar6,0,0);
      if (iVar5 == 0) {
        *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66720;
        FUN_180c631b0(0,0x72,&UNK_180f8c6a0,0x399);
        *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66725;
        FUN_180c63290();
      }
      else {
        uVar10 = *(uint *)(&stack0xfffffffffffffff8 + lVar7);
        uVar13 = 0;
        if ((uVar10 & 0xfffffffe) != 0) {
          do {
            uVar1 = *(undefined1 *)(uVar13 + param_4);
            uVar11 = (ulonglong)((uVar10 - (int)uVar13) - 1);
            *(undefined1 *)(uVar13 + param_4) = *(undefined1 *)(uVar11 + param_4);
            uVar12 = (int)uVar13 + 1;
            uVar13 = (ulonglong)uVar12;
            *(undefined1 *)(uVar11 + param_4) = uVar1;
            uVar10 = *(uint *)(&stack0xfffffffffffffff8 + lVar7);
          } while (uVar12 < uVar10 >> 1);
        }
        *puVar3 = uVar10;
      }
    }
    uVar2 = *(undefined8 *)((longlong)auStackX_18 + lVar7 + -0x18);
    *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66779;
    CryptDestroyHash(uVar2);
  }
LAB_180c66779:
  *(undefined8 *)((longlong)&uStack_40 + lVar7) = 0x180c66788;
  FUN_180e155e0(*(ulonglong *)((longlong)auStackX_18 + lVar7) ^
                (ulonglong)(&stack0xffffffffffffffc8 + lVar7));
  return;
}


