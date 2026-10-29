/* 7ff70c9503f0 FUN_7ff70c9503f0 */

/* WARNING: Instruction at (ram,0x7ff70c950596) overlaps instruction at (ram,0x7ff70c950595)
    */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c9503f0(undefined8 param_1,undefined8 *param_2,char *param_3)

{
  undefined8 *puVar1;
  ushort uVar2;
  ushort uVar3;
  undefined8 uVar4;
  code *pcVar5;
  uint uVar6;
  int iVar7;
  ulonglong uVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  longlong lVar11;
  undefined *puVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  undefined *puVar15;
  undefined *puVar16;
  longlong *plVar17;
  undefined *puVar18;
  undefined *puVar19;
  char cVar20;
  bool bVar21;
  undefined8 auStack_178 [7];
  undefined8 auStack_140 [2];
  uint auStack_130 [2];
  undefined8 auStack_128 [4];
  uint auStack_108 [18];
  longlong alStack_c0 [3];
  uint auStack_a4 [3];
  undefined8 uStack_98;
  undefined8 auStack_88 [2];
  int aiStack_74 [13];
  
  alStack_c0[0] = 0;
  uVar8 = 0;
  if (param_2 != (undefined8 *)0x0) {
    if (param_3 == (char *)0x0) {
      param_3 = (char *)*param_2;
    }
    if (((param_3 != (char *)0x0) && ((*(uint *)(param_2 + 5) & 4) == 0)) &&
       (uVar8 = 0, *param_3 != '\0')) {
      uStack_98 = param_3;
      uVar6 = FUN_7ff70c996a10(param_1,param_3,alStack_c0 + 1,alStack_c0);
      uVar8 = (ulonglong)uVar6;
      puVar14 = auStack_178 + 2;
      if (uVar6 == 0) {
        FUN_7ff70cb12c70(&UNK_7ff70cb9169b,0x75,1,alStack_c0[1]);
        plVar17 = (longlong *)param_2[1];
        auStack_108[0x11] = 0;
        puVar13 = auStack_178 + 2;
        while (plVar17 != (longlong *)0x0) {
          puVar14 = (undefined8 *)*plVar17;
          plVar17 = (longlong *)plVar17[2];
          uVar9 = puVar13[0x16];
          uVar4 = puVar14[4];
          puVar13[-1] = 0x7ff70c95056b;
          iVar7 = FUN_7ff70c9969c0(uVar4,(longlong)puVar13 + 0xec);
          cVar20 = iVar7 == 0;
          if (!(bool)cVar20) {
            *(int *)((longlong)puVar13 + 0xa4) = iVar7;
            break;
          }
          puVar13[0x1c] = uVar9;
          uVar9 = puVar14[2];
          lVar11 = 0x17;
          puVar1 = puVar13 + 0x22;
          pcVar5 = (code *)*puVar13;
          *puVar13 = 0x7ff70c950595;
          uVar8 = func_0x7ff70d9c50d2(0x17,uVar9,puVar1);
          if (lVar11 == 1 || cVar20 == '\0') {
            iVar7 = (int)CONCAT71((int7)(uVar8 >> 8),
                                  *(undefined1 *)((longlong)puVar1 + (uVar8 & 0xff)));
          }
          else {
            *puVar13 = 0x7ff70c950598;
            iVar7 = (*pcVar5)();
          }
          puVar18 = &UNK_7ff70cb923a7;
          puVar15 = &UNK_7ff70cb923a7;
          puVar19 = &UNK_7ff70cb89519;
          if (iVar7 == 1) {
            puVar15 = &UNK_7ff70cb89519;
            puVar18 = &UNK_7ff70cb894fc;
          }
          uVar9 = *puVar14;
          *puVar13 = 0x7ff70c9505c9;
          iVar7 = (*pcVar5)(0x17,uVar9,puVar1);
          puVar12 = &UNK_7ff70cb894fc;
          if (iVar7 != 1) {
            puVar12 = &UNK_7ff70cb923a7;
            puVar19 = &UNK_7ff70cb923a7;
          }
          puVar13[0x1c] = puVar19;
          *(undefined4 *)((longlong)puVar13 + 0xd4) = *(undefined4 *)((longlong)puVar14 + 0x2c);
          *(uint *)(puVar13 + 0x1a) = (uint)*(byte *)(puVar14 + 5);
          *(undefined4 *)((longlong)puVar13 + 0xcc) = *(undefined4 *)((longlong)puVar13 + 0xf4);
          *(undefined4 *)(puVar13 + 0x19) = *(undefined4 *)(puVar13 + 0x1f);
          *(undefined4 *)((longlong)puVar13 + 0xc4) = *(undefined4 *)((longlong)puVar13 + 0xfc);
          uVar2 = *(ushort *)(puVar14 + 3);
          uVar9 = puVar14[2];
          iVar7 = *(int *)((longlong)puVar14 + 0x1c);
          puVar19 = &UNK_7ff70cb8bb2b;
          puVar16 = &UNK_7ff70cb8bb2b;
          if (iVar7 != 8) {
            if (iVar7 == 0x20) {
              puVar16 = &UNK_7ff70cb8b7e0;
            }
            else if (iVar7 == 0x10) {
              puVar16 = &UNK_7ff70cb8b8fa;
            }
            else {
              puVar16 = &UNK_7ff70cb923a7;
            }
          }
          uVar3 = *(ushort *)(puVar14 + 1);
          uVar4 = *puVar14;
          iVar7 = *(int *)((longlong)puVar14 + 0xc);
          if (iVar7 != 8) {
            if (iVar7 == 0x20) {
              puVar19 = &UNK_7ff70cb8b7e0;
            }
            else if (iVar7 == 0x10) {
              puVar19 = &UNK_7ff70cb8b8fa;
            }
            else {
              puVar19 = &UNK_7ff70cb923a7;
            }
          }
          *(undefined4 *)(puVar13 + 0x14) = *(undefined4 *)((longlong)puVar13 + 0xd4);
          *(undefined4 *)(puVar13 + 0x13) = *(undefined4 *)(puVar13 + 0x1a);
          *(undefined4 *)(puVar13 + 0x12) = *(undefined4 *)((longlong)puVar13 + 0xcc);
          *(undefined4 *)(puVar13 + 0x11) = *(undefined4 *)(puVar13 + 0x19);
          *(undefined4 *)(puVar13 + 0x10) = *(undefined4 *)((longlong)puVar13 + 0xc4);
          *(undefined4 *)(puVar13 + 0xf) = *(undefined4 *)(puVar13 + 0x20);
          *(int *)(puVar13 + 0xe) = *(int *)((longlong)puVar13 + 0x104) + 1;
          *(int *)(puVar13 + 0xd) = *(int *)(puVar13 + 0x21) + 0x76c;
          *(uint *)(puVar13 + 0xc) = (uint)uVar2;
          puVar13[0xb] = puVar18;
          puVar13[10] = uVar9;
          puVar13[9] = puVar15;
          puVar13[8] = puVar16;
          *(uint *)(puVar13 + 7) = (uint)uVar3;
          puVar13[6] = puVar12;
          puVar13[5] = uVar4;
          *puVar13 = 0x7ff70c950540;
          FUN_7ff70c95c3b0(puVar13[0x1d],&UNK_7ff70cb91316,puVar19,puVar13[0x1c]);
          puVar13 = puVar13 + 1;
        }
        puVar13[-1] = 0x7ff70c9506d4;
        uVar9 = func_0x7ff70d6e4bb4(puVar13[0x16]);
        uVar6 = *(uint *)((longlong)puVar13 + 0xa4);
        uVar8 = (ulonglong)uVar6;
        uVar10 = CONCAT71((int7)((ulonglong)uVar9 >> 8),uVar6 == 0);
        lVar11 = puVar13[0x15];
        if (lVar11 != 0 && uVar6 == 0) {
          puVar13[-1] = 0x7ff70c950706;
          uVar10 = FUN_7ff70c996b40(lVar11,puVar13[0x1a]);
          uVar8 = 0x17;
          if ((int)uVar10 == 0) {
            uVar8 = uVar10 & 0xffffffff;
          }
          lVar11 = puVar13[0x15];
        }
        bVar21 = (int)uVar8 != 0;
        puVar14 = puVar13;
        if (lVar11 != 0 && bVar21) {
          puVar14 = puVar13 + -1;
          puVar13[-1] = CONCAT71((int7)(uVar10 >> 8),bVar21);
          puVar13[-2] = 0x7ff70c950735;
          func_0x7ff70d6e6fde();
        }
      }
      *(undefined8 *)((longlong)puVar14 + -8) = 0x7ff70c950743;
      (*_DAT_7ff70cbebad8)(*(undefined8 *)((longlong)puVar14 + 0xa8));
    }
  }
  return uVar8;
}


