/* 7ff70c9283a0 FUN_7ff70c9283a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c9283a0(undefined8 *param_1,undefined8 param_2,char *param_3)

{
  ulonglong uVar1;
  undefined8 uVar2;
  code *pcVar3;
  int iVar4;
  ulonglong uVar5;
  undefined8 ***pppuVar6;
  ulonglong uVar7;
  char *pcVar8;
  ulonglong uVar9;
  undefined8 ****ppppuVar10;
  ulonglong uVar11;
  undefined *puVar12;
  undefined8 ***pppuStack_68;
  undefined8 uStack_60;
  ulonglong uStack_58;
  ulonglong uStack_50;
  undefined8 uStack_48;
  
  uStack_48 = 0xfffffffffffffffe;
  pcVar8 = param_3;
  if (0xf < *(ulonglong *)(param_3 + 0x18)) {
    pcVar8 = *(char **)param_3;
  }
  uVar2 = *param_1;
  iVar4 = (*_DAT_7ff70cb96660)((int)*pcVar8);
  puVar12 = &UNK_7ff70cb8929d;
  if (iVar4 == 0) {
    puVar12 = &UNK_7ff70cb923a7;
  }
  uVar7 = *(ulonglong *)(param_3 + 0x10);
  uVar11 = (ulonglong)((uint)(iVar4 != 0) * 2);
  uVar9 = 0x7fffffffffffffff;
  if ((uVar7 ^ 0x7fffffffffffffff) < uVar11) {
    FUN_7ff70ca00780();
    goto LAB_7ff70c92852a;
  }
  pppuStack_68 = (undefined8 ****)0x0;
  uStack_60 = 0;
  uVar1 = uVar11 + uVar7;
  if (uVar1 < 0x10) {
    ppppuVar10 = &pppuStack_68;
    uVar9 = 0xf;
  }
  else {
    if (-1 < (longlong)uVar1) {
      uVar5 = uVar1 | 0xf;
      uVar9 = 0x16;
      if (0x16 < uVar5) {
        uVar9 = uVar5;
      }
      if (uVar5 < 0xfff) {
        ppppuVar10 = (undefined8 ****)FUN_7ff70ca8ff40(uVar9 + 1);
        pppuStack_68 = ppppuVar10;
        goto LAB_7ff70c928485;
      }
    }
    pppuVar6 = (undefined8 ***)FUN_7ff70ca8ff40(uVar9 + 0x28);
    ppppuVar10 = (undefined8 ****)((longlong)pppuVar6 + 0x27U & 0xffffffffffffffe0);
    ppppuVar10[-1] = pppuVar6;
    pppuStack_68 = ppppuVar10;
  }
LAB_7ff70c928485:
  uStack_58 = uVar1;
  uStack_50 = uVar9;
  FUN_7ff70cb12b60(ppppuVar10,pcVar8,uVar7);
  FUN_7ff70cb12b60(uVar7 + (longlong)ppppuVar10,puVar12,uVar11);
  *(undefined1 *)((longlong)ppppuVar10 + uVar1) = 0;
  FUN_7ff70c928570(param_2,&pppuStack_68,uVar2,&UNK_7ff70cb8fcf5,0);
  if (0xf < uStack_50) {
    uVar7 = uStack_50 + 1;
    ppppuVar10 = (undefined8 ****)pppuStack_68;
    if (0xfff < uVar7) {
      ppppuVar10 = (undefined8 ****)pppuStack_68[-1];
      if (0x1f < (ulonglong)((longlong)pppuStack_68 + (-8 - (longlong)ppppuVar10))) {
LAB_7ff70c92852a:
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar7 = uStack_50 + 0x28;
    }
    thunk_FUN_7ff70ca90250(ppppuVar10,uVar7);
  }
  return param_2;
}


