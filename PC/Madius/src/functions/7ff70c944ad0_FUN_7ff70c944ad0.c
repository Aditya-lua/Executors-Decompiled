/* 7ff70c944ad0 FUN_7ff70c944ad0 */

/* WARNING: Instruction at (ram,0x7ff70c944b8f) overlaps instruction at (ram,0x7ff70c944b8e)
    */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c944ad0(undefined8 param_1)

{
  ulonglong uVar1;
  undefined1 *puVar2;
  int iVar3;
  longlong lVar4;
  code *UNRECOVERED_JUMPTABLE;
  longlong lVar5;
  undefined8 uVar6;
  code **ppcVar7;
  undefined1 *puVar8;
  longlong unaff_RBP;
  ulonglong uVar9;
  undefined8 uVar10;
  code *pcStack_68;
  undefined8 uStack_60;
  longlong lStack_58;
  undefined8 auStack_38 [2];
  
  lStack_58 = 0x7ff70c944aeb;
  lVar4 = func_0x7ff70cc47809(&UNK_7ff70cb8b96a);
  if (lVar4 == 0) {
    return 0;
  }
  uStack_60 = 0x7ff70c944b03;
  lStack_58 = lVar4;
  UNRECOVERED_JUMPTABLE = (code *)func_0x7ff70da65183(lVar4,&UNK_7ff70cb8ac35);
  ppcVar7 = (code **)&uStack_60;
  pcStack_68 = (code *)0x7ff70c944b16;
  uStack_60 = param_1;
  lVar5 = func_0x7ff70cc658f4(param_1,&UNK_7ff70cb8bfb5);
  if (lVar5 == 0) {
    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
      ppcVar7 = &pcStack_68;
      pcStack_68 = UNRECOVERED_JUMPTABLE;
      lVar4 = func_0x7ff70d93e8d0(lVar4,&UNK_7ff70cb7fd23);
      if (lVar4 != 0) {
        uVar10 = 0x800;
        goto LAB_7ff70c944b6c;
      }
    }
  }
  else {
    ppcVar7 = (code **)&uStack_60;
    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
      uVar10 = 8;
LAB_7ff70c944b6c:
                    /* WARNING: Could not recover jumptable at 0x7ff70c944b77. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar10 = (*UNRECOVERED_JUMPTABLE)(param_1,0,uVar10);
      return uVar10;
    }
  }
  uVar10 = *(undefined8 *)((longlong)ppcVar7 + 0x20);
  uVar1 = *(ulonglong *)((longlong)ppcVar7 + 0x38);
  UNRECOVERED_JUMPTABLE = *(code **)((longlong)ppcVar7 + 0x40);
  *(undefined **)((longlong)ppcVar7 + 0x40) = &UNK_7ff70c944b8e;
  func_0x7ff70d60ae03(param_1);
  *(undefined8 *)((longlong)ppcVar7 + 0x40) = 0x7ff70c944b9a;
  uVar6 = func_0x7ff70d78526e();
  uVar9 = CONCAT71((int7)((ulonglong)uVar6 >> 8),(char)uVar6 + *(char *)(unaff_RBP + 0x419374c0)) &
          0xffffffff;
  *(undefined8 *)((longlong)ppcVar7 + 0x40) = 0x7ff70c944baa;
  lVar4 = FUN_7ff70cb12e80(uVar9);
  *(undefined8 *)((longlong)ppcVar7 + 0x40) = 0x7ff70c944bb7;
  lVar4 = (*_DAT_7ff70cbebad0)((ulonglong)((int)uVar1 + 1) + lVar4);
  puVar2 = (undefined1 *)((longlong)ppcVar7 + 0x48);
  if (lVar4 != 0) {
    puVar8 = (undefined1 *)((longlong)ppcVar7 + 0x40);
    *(ulonglong *)((longlong)ppcVar7 + 0x40) = uVar1 & 0xffffffff;
    *(undefined8 *)((longlong)ppcVar7 + 0x38) = 0x7ff70c944bcb;
    iVar3 = func_0x7ff70d79ebc4(lVar4);
    puVar2 = (undefined1 *)((longlong)ppcVar7 + 0x40);
    if (iVar3 != 0) {
      *(undefined8 *)((longlong)ppcVar7 + 0x38) = 0x7ff70c944bd7;
      lVar5 = FUN_7ff70cb12e80(lVar4);
      *(undefined2 *)(lVar4 + lVar5) = 0x5c;
      *(undefined8 *)((longlong)ppcVar7 + 0x38) = 0x7ff70c944be5;
      lVar5 = FUN_7ff70cb12e80(lVar4);
      *(undefined8 *)((longlong)ppcVar7 + 0x38) = 0x7ff70c944bf3;
      FUN_7ff70cb12e70(lVar4 + lVar5,uVar9);
      if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
        puVar8 = (undefined1 *)((longlong)ppcVar7 + 0x38);
        *(undefined8 *)((longlong)ppcVar7 + 0x38) = uVar10;
        *(undefined8 *)((longlong)ppcVar7 + 0x30) = 0x7ff70c944c12;
        uVar10 = func_0x7ff70d668f09(lVar4);
      }
      else {
        *(undefined8 *)((longlong)ppcVar7 + 0x38) = 0x7ff70c944c06;
        uVar10 = (*UNRECOVERED_JUMPTABLE)(lVar4,0,8);
      }
      goto LAB_7ff70c944c15;
    }
  }
  puVar8 = puVar2;
  uVar10 = 0;
LAB_7ff70c944c15:
  *(undefined8 *)(puVar8 + -8) = 0x7ff70c944c1e;
  (*_DAT_7ff70cbebad8)(lVar4);
  return uVar10;
}


