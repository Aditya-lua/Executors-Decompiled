/* 7ff70c929240 FUN_7ff70c929240 */

/* WARNING: Removing unreachable block (ram,0x7ff70caa6da7) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6daa) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6d3a) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6d62) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6d70) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6d84) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6d87) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6d8b) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6d94) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6d98) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6dae) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6e49) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6db8) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6dc1) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6dc7) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6de0) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6df5) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6df8) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6dfc) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6e05) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6e09) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6e16) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6e19) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6e1d) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6e23) */
/* WARNING: Removing unreachable block (ram,0x7ff70caa6e26) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1 (*) [16]
FUN_7ff70c929240(longlong param_1,undefined1 (*param_2) [16],undefined1 (*param_3) [16],
                longlong param_4,uint param_5)

{
  longlong lVar1;
  longlong *plVar2;
  undefined1 *puVar3;
  undefined1 auVar4 [16];
  char cVar5;
  undefined8 uVar6;
  undefined1 (*pauVar7) [16];
  undefined1 (*pauVar8) [16];
  ulonglong uVar9;
  char *pcVar10;
  ulonglong uVar11;
  int iVar12;
  char cVar13;
  ulonglong uVar14;
  uint uVar15;
  longlong lVar16;
  undefined1 auStack_88 [8];
  undefined *puStack_80;
  undefined1 auStack_68 [16];
  undefined8 uStack_58;
  undefined1 (*pauStack_48) [16];
  
  if (param_4 == 0) {
    param_4 = *(longlong *)(param_1 + 0xc0);
  }
  if (param_4 == 0 || param_2 == param_3) {
    return param_2;
  }
  do {
    switch(*(undefined4 *)(param_4 + 8)) {
    case 1:
    case 8:
    case 9:
    case 0xb:
    case 0xd:
    case 0xe:
    case 0x11:
    case 0x14:
      break;
    case 2:
      if ((*(byte *)(param_1 + 0xe1) & 0x10) == 0) {
        return param_3;
      }
      if (param_2[-1][0xf] != '\n') {
        if (param_2[-1][0xf] != '\r') {
          puStack_80 = &UNK_7ff70c9293d5;
          pauVar8 = (undefined1 (*) [16])
                    func_0x7ff70c92c440(param_2,param_3,&UNK_7ff70cb46650,&UNK_7ff70cb46652);
          return (undefined1 (*) [16])(*pauVar8 + (pauVar8 != param_3));
        }
        return param_2;
      }
      return param_2;
    case 3:
      if ((*(byte *)(param_1 + 0xe1) & 0x10) == 0) {
        return param_3;
      }
      if ((longlong)param_3 - (longlong)param_2 < 0x10) {
        pauVar8 = (undefined1 (*) [16])(((longlong)param_3 - (longlong)param_2) + (longlong)param_2)
        ;
        while( true ) {
          if ((*param_2)[0] == '\n') {
            return param_2;
          }
          if ((*param_2)[0] == '\r') break;
          param_2 = (undefined1 (*) [16])(*param_2 + 1);
          if (param_2 == param_3) {
            return pauVar8;
          }
        }
        return param_2;
      }
      if ((DAT_7ff70cbebde4 & 4) == 0) {
        do {
          if (param_2 == param_3) {
            return param_2;
          }
          pcVar10 = "\r\n";
          do {
            if ((*param_2)[0] == *pcVar10) {
              return param_2;
            }
            pcVar10 = pcVar10 + 1;
          } while (pcVar10 != "");
          param_2 = (undefined1 (*) [16])(*param_2 + 1);
        } while( true );
      }
      uVar14 = (longlong)param_3 - (longlong)param_2;
      uStack_58 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
      puVar3 = *param_2;
      uVar6 = FUN_7ff70cb12b60(auStack_68,&UNK_7ff70cb46650,2);
      auVar4 = auStack_68;
      goto joined_r0x7ff70caa6cd5;
    case 4:
      cVar13 = (&UNK_7ff70cb46550)[(byte)param_2[-1][0xf]];
      do {
        puVar3 = *param_2;
        if (((cVar13 != (&UNK_7ff70cb46550)[(byte)*puVar3] ^ (byte)*(undefined4 *)(param_4 + 0xc)) &
            1) != 0) {
          return param_2;
        }
        param_2 = (undefined1 (*) [16])(*param_2 + 1);
        cVar13 = (&UNK_7ff70cb46550)[(byte)*puVar3];
      } while (param_2 != param_3);
      return param_3;
    case 5:
      if (param_5 < 0x32) {
        uStack_58 = CONCAT44(uStack_58._4_4_,param_5 + 1);
        puStack_80 = &UNK_7ff70c929391;
        lVar16 = FUN_7ff70c929240(param_1,*param_2 + 1,param_3,*(undefined8 *)(param_4 + 0x10));
        return (undefined1 (*) [16])(lVar16 + -1);
      }
      return param_2;
    case 6:
      uVar14 = (ulonglong)*(uint *)(param_4 + 0x24);
      pauVar8 = param_3;
      if (param_3 != *(undefined1 (**) [16])(param_1 + 0xd8) && 1 < uVar14) {
        uVar11 = (ulonglong)(*(uint *)(param_4 + 0x24) - 1);
        uVar9 = (longlong)*(undefined1 (**) [16])(param_1 + 0xd8) - (longlong)param_3;
        if ((longlong)uVar11 <= (longlong)uVar9) {
          uVar9 = uVar11;
        }
        pauVar8 = (undefined1 (*) [16])(*param_3 + uVar9);
      }
      lVar16 = *(longlong *)(param_4 + 0x28);
      pauVar7 = pauVar8;
      if ((*(byte *)(param_1 + 0xe1) & 1) == 0) {
        if ((longlong)uVar14 <= (longlong)pauVar8 - (longlong)param_2) {
          puStack_80 = &UNK_7ff70c929454;
          pauVar7 = (undefined1 (*) [16])thunk_FUN_7ff70caa61d0(param_2,pauVar8,lVar16,uVar14);
        }
      }
      else if (((longlong)uVar14 <= (longlong)pauVar8 - (longlong)param_2) &&
              (pauVar7 = param_2, uVar14 != 0)) {
        lVar1 = *(longlong *)(param_1 + 200);
        pauStack_48 = (undefined1 (*) [16])((longlong)pauVar8 - uVar14);
        while( true ) {
          uVar9 = 0;
          while( true ) {
            cVar13 = *(char *)(lVar16 + uVar9);
            plVar2 = *(longlong **)(lVar1 + 8);
            puStack_80 = &UNK_7ff70c9295fc;
            cVar5 = (**(code **)(*plVar2 + 0x20))(plVar2,(*param_2)[uVar9]);
            if (cVar5 != cVar13) break;
            uVar9 = uVar9 + 1;
            pauVar7 = param_2;
            if (uVar14 == uVar9) goto code_r0x7ff70c929620;
          }
          pauVar7 = pauVar8;
          if (param_2 == pauStack_48) break;
          param_2 = (undefined1 (*) [16])(*param_2 + 1);
        }
      }
code_r0x7ff70c929620:
      if (pauVar8 != pauVar7) {
        return pauVar7;
      }
      return param_3;
    case 7:
      do {
        puStack_80 = &UNK_7ff70c92935d;
        pauVar8 = (undefined1 (*) [16])func_0x7ff70c92b880(param_1,param_4,param_2);
        if (param_2 != pauVar8) {
          return param_2;
        }
        param_2 = (undefined1 (*) [16])(*param_2 + 1);
      } while (param_2 != param_3);
      return param_2;
    case 10:
      if (0x31 < param_5) {
        return param_2;
      }
      iVar12 = param_5 + 1;
      uStack_58 = CONCAT44(uStack_58._4_4_,iVar12);
      puStack_80 = &UNK_7ff70c9294c0;
      pauVar8 = (undefined1 (*) [16])
                FUN_7ff70c929240(param_1,param_2,param_3,*(undefined8 *)(param_4 + 0x20));
      do {
        puStack_80 = &UNK_7ff70c9294d9;
        uStack_58._0_4_ = iVar12;
        pauVar7 = (undefined1 (*) [16])
                  FUN_7ff70c929240(param_1,pauVar8,param_3,*(undefined8 *)(param_4 + 0x10));
        if (pauVar7 == pauVar8) {
          return pauVar8;
        }
        uStack_58 = CONCAT44(uStack_58._4_4_,iVar12);
        puStack_80 = &UNK_7ff70c9294fe;
        pauVar8 = (undefined1 (*) [16])
                  FUN_7ff70c929240(param_1,pauVar7,param_3,*(undefined8 *)(param_4 + 0x20));
      } while (pauVar7 != pauVar8);
      return pauVar8;
    default:
      return param_2;
    case 0x10:
      if (*(longlong *)(param_4 + 0x28) != 0) {
        if (0x31 < param_5) {
          return param_2;
        }
        do {
          lVar16 = (longlong)param_3 - (longlong)param_2;
          if (0x1ff < lVar16) {
            lVar16 = 0x200;
          }
          pauVar8 = (undefined1 (*) [16])(*param_2 + lVar16);
          lVar1 = param_4;
          pauVar7 = param_3;
          do {
            if (pauVar7 == param_2) break;
            uStack_58._4_4_ = (undefined4)(uStack_58 >> 0x20);
            uStack_58 = CONCAT44(uStack_58._4_4_,param_5 + 1);
            puStack_80 = &UNK_7ff70c9295a6;
            pauVar8 = (undefined1 (*) [16])
                      FUN_7ff70c929240(param_1,param_2,pauVar8,*(undefined8 *)(lVar1 + 0x10));
            lVar1 = *(longlong *)(lVar1 + 0x28);
            pauVar7 = pauVar8;
          } while (lVar1 != 0);
          if (pauVar8 != (undefined1 (*) [16])(*param_2 + lVar16)) {
            return pauVar8;
          }
          param_2 = pauVar8;
          if (pauVar8 == param_3) {
            return pauVar8;
          }
        } while( true );
      }
      break;
    case 0x12:
      if (*(int *)(param_4 + 0x20) < 1) {
        if (0x31 < param_5) {
          return param_2;
        }
        while( true ) {
          lVar16 = (longlong)param_3 - (longlong)param_2;
          if (0x1ff < lVar16) {
            lVar16 = 0x200;
          }
          puVar3 = *param_2;
          puStack_80 = &UNK_7ff70c92930d;
          uStack_58._0_4_ = param_5 + 1;
          uVar6 = FUN_7ff70c929240(param_1,param_2,(undefined1 (*) [16])(puVar3 + lVar16),
                                   *(undefined8 *)(param_4 + 0x10));
          uStack_58 = CONCAT44(uStack_58._4_4_,param_5 + 1);
          puStack_80 = &UNK_7ff70c929327;
          param_2 = (undefined1 (*) [16])
                    FUN_7ff70c929240(param_1,param_2,uVar6,
                                     *(undefined8 *)(*(longlong *)(param_4 + 0x28) + 0x10));
          if (param_2 != (undefined1 (*) [16])(puVar3 + lVar16)) break;
          if (param_2 == param_3) {
            return param_2;
          }
        }
        return param_2;
      }
    }
    param_4 = *(longlong *)(param_4 + 0x10);
    if (param_4 == 0) {
      return param_2;
    }
  } while( true );
joined_r0x7ff70caa6cd5:
  if (param_2 == (undefined1 (*) [16])(puVar3 + (uVar14 & 0xfffffffffffffff0))) {
    uVar15 = (uint)uVar14 & 0xf;
    if ((uVar14 & 0xf) != 0) {
      FUN_7ff70cb12b60(auStack_68,param_2,uVar15);
      uVar6 = auStack_68._0_8_;
      pcmpestri(auVar4,auStack_68,0,2,uVar15);
    }
LAB_7ff70caa6e2b:
    pauVar8 = (undefined1 (*) [16])FUN_7ff70caa97e0(uVar6);
    return pauVar8;
  }
  uVar6 = SUB168(*param_2,0);
  pcmpestri(auStack_68,*param_2,0,2,0x10);
  if (param_2 < (undefined1 (*) [16])(puVar3 + (uVar14 & 0xfffffffffffffff0)))
  goto LAB_7ff70caa6e2b;
  param_2 = param_2 + 1;
  goto joined_r0x7ff70caa6cd5;
}


