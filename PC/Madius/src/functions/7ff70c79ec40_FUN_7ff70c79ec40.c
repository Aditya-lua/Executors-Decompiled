/* 7ff70c79ec40 FUN_7ff70c79ec40 */

undefined8 * FUN_7ff70c79ec40(undefined8 *param_1)

{
  code *pcVar1;
  longlong *plVar2;
  undefined8 **ppuVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  longlong lVar6;
  undefined8 uVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  longlong ***ppplVar10;
  longlong ****pppplVar11;
  undefined8 ****ppppuVar12;
  longlong ****pppplVar13;
  undefined1 *puVar14;
  longlong ****pppplVar15;
  ulonglong uVar16;
  undefined8 ***pppuStack_b8;
  undefined4 uStack_b0;
  undefined4 uStack_ac;
  undefined4 uStack_a8;
  undefined4 uStack_a4;
  undefined4 uStack_a0;
  undefined4 uStack_9c;
  longlong *plStack_98;
  undefined8 *puStack_90;
  longlong ***ppplStack_88;
  undefined8 uStack_80;
  ulonglong uStack_78;
  ulonglong uStack_70;
  undefined8 **ppuStack_60;
  undefined8 *puStack_58;
  undefined8 uStack_50;
  
  uStack_50 = 0xfffffffffffffffe;
  *(undefined1 *)(param_1 + 8) = 0;
  *param_1 = 0;
  param_1[1] = 0;
  *(undefined1 *)(param_1 + 2) = 0;
  puStack_58 = param_1;
  ppuStack_60 = (undefined8 **)FUN_7ff70ca8ff40(0x120);
  FUN_7ff70c8f5070(ppuStack_60);
  puVar4 = puStack_58;
  ppuVar3 = ppuStack_60;
  plStack_98 = puStack_58 + 9;
  *plStack_98 = 0;
  puStack_58[10] = 0;
  pppuStack_b8 = (undefined8 ***)ppuStack_60;
  puVar5 = (undefined8 *)FUN_7ff70ca8ff40(0x18);
  puVar5[1] = 0x100000001;
  *puVar5 = &UNK_7ff70cb15178;
  puVar5[2] = ppuVar3;
  puVar4[9] = ppuVar3;
  puVar4[10] = puVar5;
  ppuStack_60 = (undefined8 **)(puVar4 + 0xb);
  puVar4[0xc] = 0;
  puVar4[0xd] = 0;
  puVar4[0xe] = 0;
  puVar4[0xf] = 0xf;
  puVar4[0xb] = &UNK_7ff70cb743b8;
  *(undefined1 *)(puVar4 + 0x10) = 1;
  puVar4[0x11] = 0;
  puVar4[0x12] = 0;
  puVar4[0x13] = 0;
  puVar4[0x14] = 0;
  puVar4[0x15] = 0;
  lVar6 = FUN_7ff70ca8ff40(0x60);
  *(longlong *)lVar6 = lVar6;
  *(longlong *)(lVar6 + 8) = lVar6;
  *(longlong *)(lVar6 + 0x10) = lVar6;
  *(undefined2 *)(lVar6 + 0x18) = 0x101;
  puVar4[0x14] = lVar6;
  puVar4[0x16] = 0;
  puVar4[0x17] = 0;
  lVar6 = FUN_7ff70ca8ff40(0x88);
  *(longlong *)lVar6 = lVar6;
  *(longlong *)(lVar6 + 8) = lVar6;
  *(longlong *)(lVar6 + 0x10) = lVar6;
  *(undefined2 *)(lVar6 + 0x18) = 0x101;
  puVar4[0x16] = lVar6;
  puVar4[0x18] = 0;
  puVar4[0x19] = 0;
  lVar6 = FUN_7ff70ca8ff40(0x60);
  *(longlong *)lVar6 = lVar6;
  *(longlong *)(lVar6 + 8) = lVar6;
  *(longlong *)(lVar6 + 0x10) = lVar6;
  *(undefined2 *)(lVar6 + 0x18) = 0x101;
  puVar4[0x18] = lVar6;
  pppuStack_b8 = (undefined8 ***)((ulonglong)pppuStack_b8 & 0xffffffff00000000);
  pppplVar13 = &ppplStack_88;
  FUN_7ff70c7abf50(puVar4 + 0x1a,&pppuStack_b8,pppplVar13);
  uVar7 = FUN_7ff70ca8ff40(400);
  puVar4 = puStack_58;
  puStack_90 = puStack_58 + 0x22;
  FUN_7ff70cb12b80(uVar7,0,400);
  puVar4[0x22] = uVar7;
  puVar4[0x23] = 0;
  puVar4[0x24] = 0;
  puVar4[0x25] = 0;
  puVar4[0x26] = 0;
  puVar4[0x27] = 0xf;
  puVar4[0x28] = 0;
  puVar4[0x29] = 0;
  puVar4[0x2a] = 0;
  puVar4[0x2b] = 0xf;
  puVar4[0x2c] = 0;
  puVar4[0x2d] = 0;
  puVar4[0x2e] = 0;
  puVar4[0x2f] = 0;
  puVar4[0x30] = 0;
  puVar5 = (undefined8 *)FUN_7ff70ca8ff40(0x10);
  puVar5[1] = 0;
  puVar4[0x2c] = puVar5;
  *puVar5 = puVar4 + 0x2c;
  *(undefined2 *)(puVar4 + 0x31) = 0;
  lVar6 = FUN_7ff70c8f54d0(10);
  uVar7 = *(undefined8 *)(lVar6 + 8);
  uStack_78 = 0;
  uStack_70 = 0;
  ppplStack_88 = (longlong ***)0x0;
  uStack_80 = 0;
  uVar8 = FUN_7ff70cb12e80(uVar7);
  if ((longlong)uVar8 < 0) {
    FUN_7ff70ca00780();
LAB_7ff70c79f18c:
                    /* WARNING: Does not return */
    pcVar1 = (code *)invalidInstructionException();
    (*pcVar1)();
  }
  uVar16 = 0xf;
  if (0xf < uVar8) {
    uVar9 = uVar8 | 0xf;
    uVar16 = 0x16;
    if (0x16 < uVar9) {
      uVar16 = uVar9;
    }
    if (uVar9 < 0xfff) {
      pppplVar13 = (longlong ****)FUN_7ff70ca8ff40(uVar16 + 1);
      ppplStack_88 = (longlong ***)pppplVar13;
    }
    else {
      ppplVar10 = (longlong ***)FUN_7ff70ca8ff40(uVar16 + 0x28);
      pppplVar13 = (longlong ****)((longlong)ppplVar10 + 0x27U & 0xffffffffffffffe0);
      pppplVar13[-1] = ppplVar10;
      ppplStack_88 = (longlong ***)pppplVar13;
    }
  }
  uStack_78 = uVar8;
  uStack_70 = uVar16;
  FUN_7ff70cb12b60(pppplVar13,uVar7,uVar8);
  *(undefined1 *)((longlong)pppplVar13 + uVar8) = 0;
  if (uStack_70 - uStack_78 < 5) {
    pppplVar13 = (longlong ****)FUN_7ff70ca6f040(&ppplStack_88,5,uStack_78,0,&UNK_7ff70cb8bfaf,5);
  }
  else {
    pppplVar13 = &ppplStack_88;
    pppplVar15 = pppplVar13;
    if (0xf < uStack_70) {
      pppplVar15 = (longlong ****)ppplStack_88;
    }
    puVar14 = (undefined1 *)0x5;
    if ((&UNK_7ff70cb8bfae < (undefined1 *)((longlong)pppplVar15 + uStack_78) &&
         pppplVar15 < &UNK_7ff70cb8bfb4) &&
       (puVar14 = (undefined1 *)((longlong)pppplVar15 + -0x7ff70cb8bfaf),
       pppplVar15 < &UNK_7ff70cb8bfaf || puVar14 == (undefined1 *)0x0)) {
      puVar14 = (undefined1 *)0x0;
    }
    lVar6 = uStack_78 + 1;
    pppplVar11 = (longlong ****)ppplStack_88;
    if (uStack_70 < 0x10) {
      pppplVar11 = pppplVar13;
    }
    uStack_78 = uStack_78 + 5;
    FUN_7ff70cb12b70((undefined1 *)((longlong)pppplVar11 + 5),pppplVar15,lVar6);
    FUN_7ff70cb12b60(pppplVar15,&UNK_7ff70cb8bfaf,puVar14);
    FUN_7ff70cb12b60((undefined1 *)((longlong)pppplVar15 + (longlong)puVar14),
                     puVar14 + 0x7ff70cb8bfb4,5 - (longlong)puVar14);
  }
  plVar2 = plStack_98;
  pppuStack_b8 = *pppplVar13;
  uStack_b0 = *(undefined4 *)(pppplVar13 + 1);
  uStack_ac = *(undefined4 *)((longlong)pppplVar13 + 0xc);
  uStack_a8 = *(undefined4 *)(pppplVar13 + 2);
  uStack_a4 = *(undefined4 *)((longlong)pppplVar13 + 0x14);
  uStack_a0 = *(undefined4 *)(pppplVar13 + 3);
  uStack_9c = *(undefined4 *)((longlong)pppplVar13 + 0x1c);
  pppplVar13[2] = (longlong ***)0x0;
  pppplVar13[3] = (longlong ***)0xf;
  *(undefined1 *)pppplVar13 = 0;
  if (0xf < uStack_70) {
    uVar8 = uStack_70 + 1;
    pppplVar13 = (longlong ****)ppplStack_88;
    if (0xfff < uVar8) {
      pppplVar13 = (longlong ****)ppplStack_88[-1];
      if ((undefined1 *)0x1f < (undefined1 *)((longlong)ppplStack_88 + (-8 - (longlong)pppplVar13)))
      goto LAB_7ff70c79f18c;
      uVar8 = uStack_70 + 0x28;
    }
    thunk_FUN_7ff70ca90250(pppplVar13,uVar8);
  }
  ppppuVar12 = &pppuStack_b8;
  if (0xf < CONCAT44(uStack_9c,uStack_a0)) {
    ppppuVar12 = (undefined8 ****)pppuStack_b8;
  }
  FUN_7ff70c8f5030(*(undefined8 *)*plVar2,0x2722,ppppuVar12);
  ppplStack_88 = (longlong ***)0x7000100000032;
  FUN_7ff70c79f4f0(puStack_58,&ppplStack_88);
  FUN_7ff70c8f5030(*(undefined8 *)*plVar2,0x2b,1);
  FUN_7ff70c8f5030(*(undefined8 *)*plVar2,0x271a,(undefined8 *)*plVar2 + 4);
  FUN_7ff70c8f5030(*(undefined8 *)*plVar2,0x272f,&UNK_7ff70cb923a7);
  FUN_7ff70c8f5030(*(undefined8 *)*plVar2,0xd5,1);
  puVar4 = puStack_58;
  uVar8 = CONCAT44(uStack_9c,uStack_a0);
  if (0xf < uVar8) {
    uVar16 = uVar8 + 1;
    ppppuVar12 = (undefined8 ****)pppuStack_b8;
    if (0xfff < uVar16) {
      ppppuVar12 = (undefined8 ****)pppuStack_b8[-1];
      if (0x1f < (ulonglong)((longlong)pppuStack_b8 + (-8 - (longlong)ppppuVar12)))
      goto LAB_7ff70c79f18c;
      uVar16 = uVar8 + 0x28;
    }
    thunk_FUN_7ff70ca90250(ppppuVar12,uVar16);
  }
  return puVar4;
}


