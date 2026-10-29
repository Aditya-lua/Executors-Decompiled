/* 7ff70c924a70 FUN_7ff70c924a70 */

undefined8 FUN_7ff70c924a70(longlong *param_1,longlong param_2)

{
  longlong lVar1;
  code *pcVar2;
  undefined8 *puVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  undefined8 **ppuVar6;
  longlong lVar7;
  ulonglong uVar8;
  undefined8 ***pppuVar9;
  undefined1 auStack_e0 [104];
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  undefined8 **ppuStack_68;
  undefined8 uStack_60;
  ulonglong uStack_58;
  ulonglong uStack_50;
  undefined8 *puStack_48;
  undefined8 uStack_40;
  
  uStack_40 = 0xfffffffffffffffe;
  if ((param_1 != (longlong *)0x0) && (*param_1 == 0)) {
    puStack_48 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
    lVar1 = *(longlong *)(param_2 + 8);
    if (lVar1 == 0) {
      ppuStack_68 = (undefined8 ***)0x0;
      uStack_60 = 0;
      uStack_58 = 0;
      uStack_50 = 0xf;
      pppuVar9 = &ppuStack_68;
    }
    else {
      lVar7 = lVar1 + 0x30;
      if (*(longlong *)(lVar1 + 0x28) != 0) {
        lVar7 = *(longlong *)(lVar1 + 0x28);
      }
      ppuStack_68 = (undefined8 ***)0x0;
      uStack_60 = 0;
      uVar4 = FUN_7ff70cb12e80(lVar7);
      if ((longlong)uVar4 < 0) {
        FUN_7ff70ca00780();
        goto LAB_7ff70c924c33;
      }
      uVar8 = 0xf;
      pppuVar9 = &ppuStack_68;
      if (0xf < uVar4) {
        uVar5 = uVar4 | 0xf;
        uVar8 = 0x16;
        if (0x16 < uVar5) {
          uVar8 = uVar5;
        }
        if (uVar5 < 0xfff) {
          pppuVar9 = (undefined8 ***)FUN_7ff70ca8ff40(uVar8 + 1);
          ppuStack_68 = pppuVar9;
        }
        else {
          ppuVar6 = (undefined8 **)FUN_7ff70ca8ff40(uVar8 + 0x28);
          pppuVar9 = (undefined8 ***)((longlong)ppuVar6 + 0x27U & 0xffffffffffffffe0);
          pppuVar9[-1] = ppuVar6;
          ppuStack_68 = pppuVar9;
        }
      }
      uStack_58 = uVar4;
      uStack_50 = uVar8;
      FUN_7ff70cb12b60(pppuVar9,lVar7,uVar4);
      *(undefined1 *)((longlong)pppuVar9 + uVar4) = 0;
      pppuVar9 = &ppuStack_68;
      if (0xf < uStack_50) {
        pppuVar9 = (undefined8 ***)ppuStack_68;
      }
    }
    func_0x7ff70d797668(auStack_e0,pppuVar9);
    puVar3 = puStack_48;
    func_0x7ff70d73a731(puStack_48,0);
    *puVar3 = &UNK_7ff70cb46328;
    func_0x7ff70d70fb80(auStack_e0,&uStack_78);
    *(undefined4 *)(puStack_48 + 2) = uStack_78;
    *(undefined4 *)((longlong)puStack_48 + 0x14) = uStack_74;
    *(undefined4 *)(puStack_48 + 3) = uStack_70;
    *(undefined4 *)((longlong)puStack_48 + 0x1c) = uStack_6c;
    *param_1 = (longlong)puStack_48;
    func_0x7ff70d635af9(auStack_e0);
    if (0xf < uStack_50) {
      uVar4 = uStack_50 + 1;
      pppuVar9 = (undefined8 ***)ppuStack_68;
      if (0xfff < uVar4) {
        pppuVar9 = (undefined8 ***)ppuStack_68[-1];
        if (0x1f < (ulonglong)((longlong)ppuStack_68 + (-8 - (longlong)pppuVar9))) {
LAB_7ff70c924c33:
                    /* WARNING: Does not return */
          pcVar2 = (code *)invalidInstructionException();
          (*pcVar2)();
        }
        uVar4 = uStack_50 + 0x28;
      }
      thunk_FUN_7ff70ca90250(pppuVar9,uVar4);
    }
  }
  return 1;
}


