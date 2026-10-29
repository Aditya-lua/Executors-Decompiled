/* 7ff70c8bfd80 FUN_7ff70c8bfd80 */

/* WARNING: Instruction at (ram,0x7ff70c8bfe09) overlaps instruction at (ram,0x7ff70c8bfe04)
    */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8bfd80(undefined8 param_1,undefined *param_2)

{
  byte *pbVar1;
  int iVar2;
  int *piVar3;
  code *pcVar4;
  longlong lVar5;
  ulonglong uVar6;
  char cVar7;
  byte bVar8;
  longlong *******ppppppplVar10;
  byte bVar11;
  longlong ******unaff_RBX;
  ulonglong *puVar12;
  longlong *******ppppppplVar13;
  longlong *******ppppppplVar14;
  longlong ******pppppplVar15;
  code *unaff_RSI;
  char *unaff_RDI;
  undefined8 uVar16;
  undefined7 uVar17;
  undefined1 uVar18;
  ulonglong uStack_160;
  undefined1 auStack_158 [36];
  undefined8 uStack_134;
  undefined4 uStack_12c;
  undefined1 auStack_128 [72];
  undefined *puStack_e0;
  longlong ******pppppplStack_d8;
  undefined1 auStack_d0 [184];
  undefined8 uStack_18;
  undefined1 *puVar9;
  
  puVar12 = (ulonglong *)auStack_158;
  ppppppplVar14 = &pppppplStack_d8;
  uStack_18 = 0xfffffffffffffffe;
  if (_DAT_7ff70cc1a460 == (code *)0x0) {
    uStack_160 = 0x7ff70c8bfe95;
    piVar3 = (int *)func_0x7ff70d5c3f29(&UNK_7ff70cb84de1);
    bVar8 = (char)*(undefined4 *)((longlong)piVar3 + -0x7b) * -0x40;
    *piVar3 = *piVar3 + (int)piVar3;
    pbVar1 = (byte *)((longlong)piVar3 + -0x73);
    bVar11 = *pbVar1;
    *pbVar1 = *pbVar1 + bVar8;
    uStack_160 = (ulonglong)((int)piVar3 + 0x2c424f + (uint)CARRY1(bVar11,bVar8));
    puVar12 = &uStack_160;
    ppppppplVar13 = (longlong *******)&uStack_160;
    _DAT_7ff70cc1a460 = (code *)FUN_7ff70cc3c486(uStack_160);
    if (_DAT_7ff70cc1a460 != (code *)0x0) goto LAB_7ff70c8bfdaa;
LAB_7ff70c8bfe09_1:
    if (_DAT_7ff70cc1a460 == (code *)0x0) {
      *(undefined **)((longlong)ppppppplVar13 + -8) = &UNK_7ff70c8bff26;
      lVar5 = func_0x7ff70d982f81(&UNK_7ff70cb84de1);
      if (lVar5 != 0) {
        param_2 = &UNK_7ff70cb840f5;
        *(undefined **)((longlong)ppppppplVar13 + -8) = &UNK_7ff70c8bff3f;
        _DAT_7ff70cc1a460 = (code *)func_0x7ff70d758d81(lVar5);
      }
      if (_DAT_7ff70cc1a460 == (code *)0x0) goto LAB_7ff70c8bfe78;
    }
  }
  else {
LAB_7ff70c8bfdaa:
    puVar9 = auStack_128;
    uVar16 = 0x110;
    uVar18 = 0;
    *(undefined8 *)((longlong)puVar12 + -8) = 0x7ff70c8bfdbb;
    FUN_7ff70cb12b80(puVar9,0,0x110);
    cVar7 = (char)puVar9;
    uStack_134 = 0xa0000011c;
    uStack_12c = 0;
    ppppppplVar13 = (longlong *******)((longlong)puVar12 + -8);
    *(longlong *******)((longlong)puVar12 + -8) = unaff_RBX;
    *(undefined8 *)((longlong)puVar12 + -0x10) = 0x7ff70c8bfdd6;
    piVar3 = (int *)func_0x7ff70d82e716();
    pppppplVar15 = pppppplStack_d8;
    if (!(bool)uVar18) {
      ppppppplVar13 = (longlong *******)auStack_d0;
      uVar17 = (undefined7)((ulonglong)uVar16 >> 8);
      pppppplStack_d8 = (longlong ******)0x7ff70c8bfde3;
      uVar16 = (*unaff_RSI)();
      pppppplStack_d8 = (longlong ******)0x7ff70c8bfdf0;
      uVar16 = (*unaff_RSI)(uVar16,1,CONCAT71(uVar17,3));
      param_2 = (undefined *)0x3;
      pppppplStack_d8 = (longlong ******)0x7ff70c8bfe02;
      iVar2 = (*_DAT_7ff70cc1a460)((undefined *)((longlong)pppppplVar15 + -0x5c),3,uVar16);
      ppppppplVar14 = (longlong *******)pppppplVar15;
      if (iVar2 == 0) {
        uVar6 = (ulonglong)uRam00007ff70cc1a430;
        ppppppplVar10 = (longlong *******)auStack_d0;
        if (*(int *)(*(longlong *)
                      ((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8) + 4)
            < (int)uRam00007ff70cc1a430) {
          pppppplStack_d8 = (longlong ******)&UNK_7ff70c8bffdf;
          uVar6 = FUN_7ff70caa4e60(0x7ff70cc1a430);
          ppppppplVar10 = (longlong *******)auStack_d0;
          if (uRam00007ff70cc1a430 == 0xffffffff) {
            ppppppplVar10 = &pppppplStack_d8;
            puStack_e0 = &UNK_7ff70c8bfff9;
            pppppplStack_d8 = pppppplVar15;
            uRam00007ff70cc1a428 = func_0x7ff70d60b6ed(&UNK_7ff70cb84e39);
            puStack_e0 = &UNK_7ff70c8c000d;
            uVar6 = FUN_7ff70caa4f40(0x7ff70cc1a430);
          }
        }
        param_2 = &UNK_7ff70cb80880;
        ppppppplVar13 = (longlong *******)((longlong)ppppppplVar10 + -8);
        *(ulonglong *)((longlong)ppppppplVar10 + -8) = uVar6;
        *(undefined **)((longlong)ppppppplVar10 + -0x10) = &UNK_7ff70c8bfefd;
        pcVar4 = (code *)func_0x7ff70d7d6fd8(uRam00007ff70cc1a428);
        if (pcVar4 != (code *)0x0) {
          *(undefined **)((longlong)ppppppplVar10 + -0x10) = &UNK_7ff70c8bff0f;
          (*pcVar4)(0xfffffffffffffffc);
          return;
        }
      }
      goto LAB_7ff70c8bfe09_1;
    }
    *(char *)((longlong)piVar3 + -0x7d) = *(char *)((longlong)piVar3 + -0x7d) + cVar7;
    *unaff_RDI = *unaff_RDI + cVar7;
    *piVar3 = *piVar3 + (int)piVar3;
    *(char *)((longlong)piVar3 + -0x73) = *(char *)((longlong)piVar3 + -0x73) + cVar7;
  }
  ppppppplVar10 = ppppppplVar14 + -10;
  uVar16 = 0x110;
  bVar11 = 0;
  ppppppplVar13[-1] = (longlong ******)0x7ff70c8bfe29;
  FUN_7ff70cb12b80(ppppppplVar10,0,0x110);
  *(undefined8 *)((longlong)ppppppplVar14 + -0x5c) = 0x60000011c;
  *(undefined4 *)((longlong)ppppppplVar14 + -0x54) = 3;
  pcVar4 = (code *)*ppppppplVar13;
  *ppppppplVar13 = (longlong ******)0x7ff70c8bfe44;
  func_0x7ff70da14877();
  *(byte *)ppppppplVar10 = *(byte *)ppppppplVar10 | bVar11;
  pppppplVar15 = *ppppppplVar14;
  ppppppplVar13 = ppppppplVar14 + 1;
  uVar17 = (undefined7)((ulonglong)uVar16 >> 8);
  *ppppppplVar14 = (longlong ******)0x7ff70c8bfe51;
  uVar16 = (*pcVar4)();
  *ppppppplVar14 = (longlong ******)0x7ff70c8bfe5e;
  uVar16 = (*pcVar4)(uVar16,1,CONCAT71(uVar17,3));
  param_2 = (undefined *)0x3;
  *ppppppplVar14 = (longlong ******)0x7ff70c8bfe70;
  iVar2 = (*_DAT_7ff70cc1a460)((longlong)pppppplVar15 + -0x5c,3,uVar16);
  if (iVar2 == 0) {
    ppppppplVar13 = ppppppplVar14 + 1;
    if (*(int *)(*(longlong *)
                  ((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8) + 4) <
        _DAT_7ff70cc1a440) {
      *ppppppplVar14 = (longlong ******)0x7ff70c8c001e;
      FUN_7ff70caa4e60(&DAT_7ff70cc1a440);
      ppppppplVar13 = ppppppplVar14 + 1;
      if (_DAT_7ff70cc1a440 == -1) {
        *ppppppplVar14 = unaff_RBX;
        ppppppplVar14[-1] = (longlong ******)0x7ff70c8c0038;
        _DAT_7ff70cc1a438 = func_0x7ff70d8bb18e(&UNK_7ff70cb84df8);
        ppppppplVar14[-1] = (longlong ******)0x7ff70c8c004c;
        FUN_7ff70caa4f40(&DAT_7ff70cc1a440);
        ppppppplVar13 = ppppppplVar14;
      }
    }
    param_2 = &UNK_7ff70cb819f4;
    ppppppplVar13[-1] = (longlong ******)0x7ff70c8bff8d;
    uVar6 = func_0x7ff70d978a08(_DAT_7ff70cc1a438);
    if ((int)(code *)(uVar6 ^ 0x48) != 0) {
      ppppppplVar13[-1] = (longlong ******)0x7ff70c8bff9e;
      (*(code *)(uVar6 ^ 0x48))(2);
      return;
    }
  }
LAB_7ff70c8bfe78:
  *(undefined **)((longlong)ppppppplVar13 + -8) = param_2;
  *(undefined8 *)((longlong)ppppppplVar13 + -0x10) = 0x7ff70c8bfe7e;
  func_0x7ff70d769869();
  return;
}


