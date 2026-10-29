/* 7ff70c7a0f50 FUN_7ff70c7a0f50 */

/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_7ff70c7a0f50(longlong param_1,undefined8 param_2,undefined4 param_3)

{
  int *piVar1;
  code *pcVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  undefined8 ******ppppppuVar5;
  ulonglong uVar6;
  undefined8 *******pppppppuVar7;
  longlong lVar8;
  undefined4 auStack_d0 [2];
  undefined8 *******pppppppuStack_c8;
  undefined8 uStack_c0;
  undefined4 uStack_b8;
  undefined4 uStack_b4;
  undefined4 uStack_b0;
  undefined4 uStack_ac;
  undefined1 auStack_a8 [8];
  longlong lStack_a0;
  longlong lStack_98;
  longlong lStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 *******pppppppuStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  uStack_48 = 0xfffffffffffffffe;
  uStack_50 = 0;
  FUN_7ff70c8f20c0(**(undefined8 **)(param_1 + 0x48),0x40001c,&uStack_50);
  FUN_7ff70c7b1980(auStack_a8,uStack_50);
  FUN_7ff70c8f2cb0(uStack_50);
  lVar8 = *(longlong *)(param_1 + 0x48) + 0x20;
  uStack_68 = 0;
  uStack_60 = 0;
  pppppppuStack_78 = (undefined8 *******)0x0;
  uStack_70 = 0;
  uVar3 = FUN_7ff70cb12e80(lVar8);
  if ((longlong)uVar3 < 0) {
    FUN_7ff70ca00780();
LAB_7ff70c7a11c5:
                    /* WARNING: Does not return */
    pcVar2 = (code *)invalidInstructionException();
    (*pcVar2)();
  }
  if (uVar3 < 0x10) {
    pppppppuVar7 = &pppppppuStack_78;
    uVar6 = 0xf;
  }
  else {
    uVar4 = uVar3 | 0xf;
    uVar6 = 0x16;
    if (0x16 < uVar4) {
      uVar6 = uVar4;
    }
    if (uVar4 < 0xfff) {
      pppppppuVar7 = (undefined8 *******)FUN_7ff70ca8ff40(uVar6 + 1);
      pppppppuStack_78 = pppppppuVar7;
    }
    else {
      ppppppuVar5 = (undefined8 ******)FUN_7ff70ca8ff40(uVar6 + 0x28);
      pppppppuVar7 = (undefined8 *******)((longlong)ppppppuVar5 + 0x27U & 0xffffffffffffffe0);
      pppppppuVar7[-1] = ppppppuVar5;
      pppppppuStack_78 = pppppppuVar7;
    }
  }
  uStack_68 = uVar3;
  uStack_60 = uVar6;
  FUN_7ff70cb12b60(pppppppuVar7,lVar8,uVar3);
  *(undefined1 *)((longlong)pppppppuVar7 + uVar3) = 0;
  auStack_d0[0] = FUN_7ff70c8f5680(param_3);
  pppppppuStack_c8 = pppppppuStack_78;
  uStack_c0 = uStack_70;
  uStack_b8 = (undefined4)uStack_68;
  uStack_b4 = uStack_68._4_4_;
  uStack_b0 = (undefined4)uStack_60;
  uStack_ac = uStack_60._4_4_;
  uStack_68 = 0;
  uStack_60 = 0xf;
  pppppppuStack_78 = (undefined8 *******)((ulonglong)pppppppuStack_78 & 0xffffffffffffff00);
  if (*(longlong *)(param_1 + 0x50) == 0) {
    uStack_80 = 0;
  }
  else {
    LOCK();
    piVar1 = (int *)(*(longlong *)(param_1 + 0x50) + 8);
    *piVar1 = *piVar1 + 1;
    UNLOCK();
    uStack_80 = *(undefined8 *)(param_1 + 0x50);
  }
  uStack_88 = *(undefined8 *)(param_1 + 0x48);
  FUN_7ff70c8f5700(param_2,&uStack_88,param_1 + 0x120,param_1 + 0x140,auStack_a8,auStack_d0);
  uVar3 = CONCAT44(uStack_ac,uStack_b0);
  if (0xf < uVar3) {
    uVar6 = uVar3 + 1;
    pppppppuVar7 = pppppppuStack_c8;
    if (0xfff < uVar6) {
      pppppppuVar7 = (undefined8 *******)pppppppuStack_c8[-1];
      if (0x1f < (ulonglong)((longlong)pppppppuStack_c8 + (-8 - (longlong)pppppppuVar7)))
      goto LAB_7ff70c7a11c5;
      uVar6 = uVar3 + 0x28;
    }
    thunk_FUN_7ff70ca90250(pppppppuVar7,uVar6);
  }
  if (0xf < uStack_60) {
    uVar3 = uStack_60 + 1;
    pppppppuVar7 = pppppppuStack_78;
    if (0xfff < uVar3) {
      pppppppuVar7 = (undefined8 *******)pppppppuStack_78[-1];
      if (0x1f < (ulonglong)((longlong)pppppppuStack_78 + (-8 - (longlong)pppppppuVar7)))
      goto LAB_7ff70c7a11c5;
      uVar3 = uStack_60 + 0x28;
    }
    thunk_FUN_7ff70ca90250(pppppppuVar7,uVar3);
  }
  lVar8 = lStack_a0;
  if (lStack_a0 != 0) {
    for (; lVar8 != lStack_98; lVar8 = lVar8 + 0x98) {
      FUN_7ff70ca555e0(lVar8);
    }
    uVar3 = lStack_90 - lStack_a0;
    lVar8 = lStack_a0;
    if (0xfff < uVar3) {
      lVar8 = *(longlong *)(lStack_a0 + -8);
      if (0x1f < (ulonglong)((lStack_a0 + -8) - lVar8)) goto LAB_7ff70c7a11c5;
      uVar3 = uVar3 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar3);
  }
  return param_2;
}


