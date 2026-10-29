/* 7ff70c7b1980 FUN_7ff70c7b1980 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1 * FUN_7ff70c7b1980(undefined1 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  code *pcVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  undefined8 ***pppuVar5;
  undefined4 *puVar6;
  undefined1 *puVar7;
  ulonglong uVar8;
  undefined8 ****ppppuVar9;
  undefined8 ***pppuStack_128;
  undefined8 uStack_120;
  ulonglong uStack_118;
  ulonglong uStack_110;
  undefined8 *puStack_88;
  undefined1 *puStack_80;
  longlong lStack_78;
  undefined8 *puStack_70;
  undefined8 *puStack_68;
  undefined8 uStack_60;
  
  uStack_60 = 0xfffffffffffffffe;
  *param_1 = 1;
  *(undefined8 *)(param_1 + 8) = 0;
  *(undefined8 *)(param_1 + 0x10) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  if (param_2 == (undefined8 *)0x0) {
    return param_1;
  }
  uVar1 = *param_2;
  uStack_118 = 0;
  uStack_110 = 0;
  pppuStack_128 = (undefined8 ****)0x0;
  uStack_120 = 0;
  puStack_88 = param_2;
  puStack_80 = param_1;
  uVar3 = FUN_7ff70cb12e80(uVar1);
  if ((longlong)uVar3 < 0) {
    FUN_7ff70ca00780();
    FUN_7ff70c7b4260();
    FUN_7ff70c7b4260();
    FUN_7ff70c7b4260();
    FUN_7ff70c7b4260();
    pcVar2 = (code *)swi(3);
    puVar7 = (undefined1 *)(*pcVar2)();
    return puVar7;
  }
  uVar8 = 0xf;
  ppppuVar9 = &pppuStack_128;
  if (0xf < uVar3) {
    uVar4 = uVar3 | 0xf;
    uVar8 = 0x16;
    if (0x16 < uVar4) {
      uVar8 = uVar4;
    }
    if (uVar4 < 0xfff) {
      ppppuVar9 = (undefined8 ****)FUN_7ff70ca8ff40(uVar8 + 1);
      pppuStack_128 = ppppuVar9;
    }
    else {
      pppuVar5 = (undefined8 ***)FUN_7ff70ca8ff40(uVar8 + 0x28);
      ppppuVar9 = (undefined8 ****)((longlong)pppuVar5 + 0x27U & 0xffffffffffffffe0);
      ppppuVar9[-1] = pppuVar5;
      pppuStack_128 = ppppuVar9;
    }
  }
  uStack_118 = uVar3;
  uStack_110 = uVar8;
  FUN_7ff70cb12b60(ppppuVar9,uVar1,uVar3);
  *(undefined1 *)((longlong)ppppuVar9 + uVar3) = 0;
  FUN_7ff70c7b1e80(&lStack_78,&pppuStack_128,9);
  if (0xf < uStack_110) {
    uVar3 = uStack_110 + 1;
    ppppuVar9 = (undefined8 ****)pppuStack_128;
    if (0xfff < uVar3) {
      ppppuVar9 = (undefined8 ****)pppuStack_128[-1];
      if (0x1f < (ulonglong)((longlong)pppuStack_128 + (-8 - (longlong)ppppuVar9))) {
                    /* WARNING: Does not return */
        pcVar2 = (code *)invalidInstructionException();
        (*pcVar2)();
      }
      uVar3 = uStack_110 + 0x28;
    }
    thunk_FUN_7ff70ca90250(ppppuVar9,uVar3);
  }
  while ((ulonglong)((longlong)puStack_70 - lStack_78) < 0xe0) {
    if (puStack_70 == puStack_68) {
      FUN_7ff70c7b3e50(&lStack_78,puStack_70,&UNK_7ff70cb923a7);
    }
    else {
      *puStack_70 = 0;
      puStack_70[1] = 0;
      puStack_70[2] = 0;
      puStack_70[3] = 0xf;
      puStack_70 = puStack_70 + 4;
    }
  }
  puVar6 = (undefined4 *)(*_DAT_7ff70cb964a0)();
  if (*(ulonglong *)(lStack_78 + 0x98) < 0x10) {
    lStack_78 = lStack_78 + 0x80;
  }
  else {
    lStack_78 = *(longlong *)(lStack_78 + 0x80);
  }
  *puVar6 = 0;
  func_0x7ff70d94bbc1(lStack_78,&pppuStack_128,10);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


