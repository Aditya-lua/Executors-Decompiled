/* 7ff70c99c870 FUN_7ff70c99c870 */

/* WARNING: Removing unreachable block (ram,0x7ff70c99cba0) */
/* WARNING: Removing unreachable block (ram,0x7ff70c99cbb4) */
/* WARNING: Removing unreachable block (ram,0x7ff70c99cbc9) */
/* WARNING: Removing unreachable block (ram,0x7ff70c99cbd3) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong * FUN_7ff70c99c870(ulonglong *param_1,undefined *param_2)

{
  code *pcVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  longlong lVar4;
  int iVar5;
  undefined4 uVar6;
  ulonglong uVar7;
  undefined8 **ppuVar8;
  ulonglong uVar9;
  longlong lVar10;
  longlong lVar11;
  ulonglong *puVar12;
  code **ppcVar13;
  undefined8 ***pppuVar14;
  undefined4 *puVar15;
  ulonglong uVar16;
  undefined4 extraout_XMM0_Da;
  code *pcStack_1d0;
  undefined1 auStack_1c8 [32];
  undefined4 auStack_1a8 [68];
  undefined8 **ppuStack_98;
  undefined1 uStack_90;
  undefined8 **appuStack_88 [3];
  ulonglong uStack_70;
  undefined *puStack_68;
  undefined8 **ppuStack_60;
  undefined8 uStack_58;
  ulonglong uStack_50;
  
  pcStack_1d0 = (code *)0x7ff70c99c8a6;
  iVar5 = func_0x7ff70cb12570(0x7ff70cbeced8);
  if (iVar5 != 0) {
                    /* WARNING: Subroutine does not return */
    pcStack_1d0 = (code *)0x7ff70c99ce15;
    FUN_7ff70cb124d0(5);
  }
  if (_DAT_7ff70cbecf24 == 0x7fffffff) {
    _DAT_7ff70cbecf24 = 0x7ffffffe;
                    /* WARNING: Subroutine does not return */
    pcStack_1d0 = (code *)0x7ff70c99ce29;
    FUN_7ff70cb124d0(6);
  }
  if (*(int *)(*(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8)
              + 4) < _DAT_7ff70cc1aeb0) {
    pcStack_1d0 = (code *)0x7ff70c99ce35;
    FUN_7ff70caa4e60(&DAT_7ff70cc1aeb0);
    if (_DAT_7ff70cc1aeb0 == -1) {
      auStack_1a8[0] = 0;
      pcStack_1d0 = (code *)0x7ff70c99ce60;
      func_0x7ff70c99db40(0x7ff70cc1ae70,auStack_1a8,&puStack_68);
      pcStack_1d0 = (code *)0x7ff70c99ce6d;
      func_0x7ff70caa4fb0(&UNK_7ff70c99d030);
      pcStack_1d0 = (code *)0x7ff70c99ce79;
      FUN_7ff70caa4f40(&DAT_7ff70cc1aeb0);
    }
  }
  lVar4 = _DAT_7ff70cc1ae78;
  lVar11 = (((ulonglong)param_2 >> 0x38 ^
            ((ulonglong)param_2 >> 0x30 & 0xff ^
            ((ulonglong)param_2 >> 0x28 & 0xff ^
            ((ulonglong)param_2 >> 0x20 & 0xff ^
            ((ulonglong)param_2 >> 0x18 & 0xff ^
            ((ulonglong)param_2 >> 0x10 & 0xff ^
            ((ulonglong)param_2 >> 8 & 0xff ^
            ((ulonglong)param_2 & 0xff ^ 0xcbf29ce484222325) * 0x100000001b3) * 0x100000001b3) *
            0x100000001b3) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3) *
            0x100000001b3 & _DAT_7ff70cc1aea0) * 0x10;
  lVar10 = *(longlong *)(_DAT_7ff70cc1ae88 + 8 + lVar11);
  if (lVar10 != _DAT_7ff70cc1ae78) {
    if (param_2 != *(undefined **)(lVar10 + 0x10)) {
      do {
        if (lVar10 == *(longlong *)(_DAT_7ff70cc1ae88 + lVar11)) goto LAB_7ff70c99c9d6;
        lVar10 = *(longlong *)(lVar10 + 8);
      } while (param_2 != *(undefined **)(lVar10 + 0x10));
    }
    if (lVar10 != _DAT_7ff70cc1ae78) {
      param_1[2] = 0;
      param_1[3] = 0;
      *param_1 = 0;
      param_1[1] = 0;
      uVar7 = *(ulonglong *)(lVar10 + 0x28);
      if (*(ulonglong *)(lVar10 + 0x30) < 0x10) {
        puVar15 = (undefined4 *)(lVar10 + 0x18);
      }
      else {
        puVar15 = *(undefined4 **)(lVar10 + 0x18);
      }
      if ((longlong)uVar7 < 0) {
                    /* WARNING: Subroutine does not return */
        pcStack_1d0 = FUN_7ff70c99ce8f;
        FUN_7ff70ca00780();
      }
      if (uVar7 < 0x10) {
        param_1[2] = uVar7;
        param_1[3] = 0xf;
        uVar6 = puVar15[1];
        uVar2 = puVar15[2];
        uVar3 = puVar15[3];
        *(undefined4 *)param_1 = *puVar15;
        *(undefined4 *)((longlong)param_1 + 4) = uVar6;
        *(undefined4 *)(param_1 + 1) = uVar2;
        *(undefined4 *)((longlong)param_1 + 0xc) = uVar3;
        ppcVar13 = (code **)auStack_1c8;
      }
      else {
        uVar9 = uVar7 | 0xf;
        uVar16 = 0x16;
        if (0x16 < uVar9) {
          uVar16 = uVar9;
        }
        if (uVar9 < 0xfff) {
          pcStack_1d0 = (code *)0x7ff70c99cdcd;
          uVar9 = func_0x7ff70ca8ff40(uVar16 + 1);
        }
        else {
          pcStack_1d0 = (code *)0x7ff70c99cc83;
          lVar10 = func_0x7ff70ca8ff40(uVar16 + 0x28);
          uVar9 = lVar10 + 0x27U & 0xffffffffffffffe0;
          *(longlong *)(uVar9 - 8) = lVar10;
        }
        *param_1 = uVar9;
        param_1[2] = uVar7;
        param_1[3] = uVar16;
        pcStack_1d0 = (code *)0x7ff70c99cdea;
        func_0x7ff70cb12b60(uVar9,puVar15,uVar7 + 1);
        ppcVar13 = (code **)auStack_1c8;
      }
      goto LAB_7ff70c99cdea;
    }
  }
LAB_7ff70c99c9d6:
  pcStack_1d0 = (code *)auStack_1a8;
  ppcVar13 = &pcStack_1d0;
  iVar5 = FUN_7ff70d98ffc0(param_2,pcStack_1d0,0x104);
  if (iVar5 == 0) {
    uVar6 = FUN_7ff70d66ce6b();
    func_0x7ff70ca2efe0(extraout_XMM0_Da,appuStack_88,uVar6);
    ppuStack_98 = appuStack_88;
    if (0xf < uStack_70) {
      ppuStack_98 = appuStack_88[0];
    }
    puStack_68 = &UNK_7ff70cb740d8;
    ppuStack_60 = (undefined8 ***)0x0;
    uStack_58 = 0;
    uStack_90 = 1;
    func_0x7ff70cb12ad0(&ppuStack_98,&ppuStack_60);
    puStack_68 = &UNK_7ff70cb74158;
    if (0xf < uStack_70) {
      uVar7 = uStack_70 + 1;
      pppuVar14 = (undefined8 ***)appuStack_88[0];
      if (0xfff < uVar7) {
        pppuVar14 = (undefined8 ***)appuStack_88[0][-1];
        if (0x1f < (ulonglong)((longlong)appuStack_88[0] + (-8 - (longlong)pppuVar14)))
        goto LAB_7ff70c99ce90;
        uVar7 = uStack_70 + 0x28;
      }
      thunk_FUN_7ff70ca90250(pppuVar14,uVar7);
    }
    uStack_50 = CONCAT44(uStack_50._4_4_,(int)lVar10);
    puStack_68 = &UNK_7ff70cb74118;
    pppuVar14 = (undefined8 ***)&UNK_7ff70cb84352;
    if ((undefined8 ***)ppuStack_60 != (undefined8 ***)0x0) {
      pppuVar14 = (undefined8 ***)ppuStack_60;
    }
    func_0x7ff70c9a4980(pppuVar14);
    puStack_68 = &UNK_7ff70cb740d8;
    func_0x7ff70cb12ae0(&ppuStack_60);
    ppuStack_60 = (undefined8 ***)0x0;
    uStack_58 = 0;
    uStack_50 = 0;
    puStack_68 = param_2;
    func_0x7ff70c99dca0(0x7ff70cc1ae70,appuStack_88,0xcb76138,&puStack_68);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    param_1[3] = 0xf;
  }
  else {
    ppuStack_60 = (undefined8 ***)0x0;
    uStack_58 = 0;
    uStack_50 = 0;
    puStack_68 = param_2;
    uVar7 = func_0x7ff70cb12e80(auStack_1a8);
    if ((longlong)uVar7 < 0) {
                    /* WARNING: Subroutine does not return */
      FUN_7ff70ca00780();
    }
    if (uVar7 < 0x10) {
      pppuVar14 = &ppuStack_60;
      uVar16 = 0xf;
    }
    else {
      uVar9 = uVar7 | 0xf;
      uVar16 = 0x16;
      if (0x16 < uVar9) {
        uVar16 = uVar9;
      }
      if (uVar9 < 0xfff) {
        pppuVar14 = (undefined8 ***)func_0x7ff70ca8ff40(uVar16 + 1);
        ppuStack_60 = pppuVar14;
      }
      else {
        ppuVar8 = (undefined8 **)func_0x7ff70ca8ff40(uVar16 + 0x28);
        pppuVar14 = (undefined8 ***)((longlong)ppuVar8 + 0x27U & 0xffffffffffffffe0);
        pppuVar14[-1] = ppuVar8;
        ppuStack_60 = pppuVar14;
      }
    }
    uStack_50 = uVar7;
    func_0x7ff70cb12b60(pppuVar14,auStack_1a8,uVar7);
    *(undefined1 *)((longlong)pppuVar14 + uVar7) = 0;
    func_0x7ff70c99dca0(0x7ff70cc1ae70,appuStack_88,lVar4,&puStack_68);
    if (0xf < uVar16) {
      uVar7 = uVar16 + 1;
      pppuVar14 = (undefined8 ***)ppuStack_60;
      if (0xfff < uVar7) {
        pppuVar14 = (undefined8 ***)ppuStack_60[-1];
        if ((undefined *)0x1f < (undefined *)((longlong)ppuStack_60 + (-8 - (longlong)pppuVar14))) {
LAB_7ff70c99ce90:
                    /* WARNING: Does not return */
          pcVar1 = (code *)invalidInstructionException();
          (*pcVar1)();
        }
        uVar7 = uVar16 + 0x28;
      }
      thunk_FUN_7ff70ca90250(pppuVar14,uVar7);
    }
    param_1[2] = 0;
    param_1[3] = 0;
    *param_1 = 0;
    param_1[1] = 0;
    uVar7 = func_0x7ff70cb12e80(auStack_1a8);
    if ((longlong)uVar7 < 0) {
                    /* WARNING: Subroutine does not return */
      FUN_7ff70ca00780();
    }
    uVar16 = 0xf;
    puVar12 = param_1;
    if (0xf < uVar7) {
      uVar9 = uVar7 | 0xf;
      uVar16 = 0x16;
      if (0x16 < uVar9) {
        uVar16 = uVar9;
      }
      if (uVar9 < 0xfff) {
        puVar12 = (ulonglong *)func_0x7ff70ca8ff40(uVar16 + 1);
      }
      else {
        uVar9 = func_0x7ff70ca8ff40(uVar16 + 0x28);
        puVar12 = (ulonglong *)(uVar9 + 0x27 & 0xffffffffffffffe0);
        puVar12[-1] = uVar9;
      }
      *param_1 = (ulonglong)puVar12;
    }
    param_1[2] = uVar7;
    param_1[3] = uVar16;
    func_0x7ff70cb12b60(puVar12,auStack_1a8,uVar7);
    *(undefined1 *)((longlong)puVar12 + uVar7) = 0;
    ppcVar13 = &pcStack_1d0;
  }
LAB_7ff70c99cdea:
  *(undefined8 *)((longlong)ppcVar13 + -8) = 0x7ff70c99cdf6;
  func_0x7ff70cb12580(0x7ff70cbeced8);
  return param_1;
}


