/* 7ff70c928d10 FUN_7ff70c928d10 */

void FUN_7ff70c928d10(longlong *param_1,longlong param_2,longlong param_3,ulonglong param_4,
                     longlong param_5,undefined4 param_6,uint param_7,uint param_8,longlong param_9)

{
  longlong *plVar1;
  char cVar2;
  char cVar3;
  ushort uVar4;
  uint uVar5;
  undefined *puVar6;
  ulonglong uVar7;
  ushort uVar8;
  ulonglong uVar9;
  longlong lVar10;
  ulonglong unaff_R14;
  longlong lStack_60;
  ulonglong uStack_58;
  longlong *plStack_50;
  undefined8 uStack_48;
  
  uStack_48 = 0xfffffffffffffffe;
  param_1[6] = 0;
  param_1[7] = 0;
  param_1[4] = 0;
  param_1[5] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  param_1[9] = 0;
  param_1[10] = 0;
  param_1[0xb] = 0;
  param_1[0xc] = 0;
  param_1[0xd] = 0;
  param_1[0xe] = 0;
  param_1[0xf] = 0;
  param_1[0x10] = 0;
  param_1[0x11] = 0;
  param_1[0x12] = 0;
  param_1[0x13] = 0;
  param_1[0x14] = 0;
  param_1[0x15] = 0;
  param_1[0x19] = param_4;
  param_1[0x1a] = param_2;
  param_1[0x1b] = param_3;
  *(uint *)(param_1 + 0x1c) = param_7;
  *(uint *)((longlong)param_1 + 0xe4) = param_8;
  *(undefined4 *)(param_1 + 0x1d) = param_6;
  *(undefined4 *)((longlong)param_1 + 0xec) = 0;
  *(undefined4 *)((longlong)param_1 + 0xef) = 0;
  *(byte *)((longlong)param_1 + 0xf3) =
       (param_8 & 0x10) == 0 & (byte)((*(uint *)(param_5 + 0xc) & 8) >> 3);
  uVar5 = *(uint *)(param_5 + 0xc);
  plStack_50 = param_1;
  if ((uVar5 & 0x100) != 0) {
    puVar6 = &UNK_7ff70cb849e6;
    uVar9 = 0;
    do {
      if ((0x2810UL >> (uVar9 & 0x3f) & 1) != 0) {
        unaff_R14 = CONCAT71((int7)(unaff_R14 >> 8),*puVar6);
        cVar2 = (**(code **)(**(longlong **)(param_4 + 8) + 0x20))(*(longlong **)(param_4 + 8),0x57)
        ;
        cVar3 = (**(code **)(**(longlong **)(param_4 + 8) + 0x20))
                          (*(longlong **)(param_4 + 8),unaff_R14 & 0xffffffff);
        if (cVar2 == cVar3) {
          uVar4 = *(ushort *)(&UNK_7ff70cb463e4 + uVar9 * 0x18);
          goto LAB_7ff70c928e7c;
        }
      }
      uVar9 = uVar9 + 1;
      puVar6 = *(undefined **)(&UNK_7ff70cb463d0 + uVar9 * 0x18);
    } while (uVar9 != 0xf);
    uVar4 = 0;
LAB_7ff70c928e7c:
    uVar8 = uVar4 | 3;
    if ((uVar4 & 3) == 0) {
      uVar8 = uVar4;
    }
    if ((param_7 & 0x100) == 0) {
      uVar8 = uVar4;
    }
    *(ushort *)((longlong)param_1 + 0xec) = uVar8;
    uVar5 = *(uint *)(param_5 + 0xc);
  }
  if ((uVar5 & 0x200) != 0) {
    lVar10 = plStack_50[0x19];
    uVar5 = *(uint *)(plStack_50 + 0x1c);
    puVar6 = &UNK_7ff70cb849e6;
    uVar9 = 0;
    do {
      if ((0x2810UL >> (uVar9 & 0x3f) & 1) != 0) {
        param_4 = CONCAT71((int7)(param_4 >> 8),*puVar6);
        plVar1 = *(longlong **)(lVar10 + 8);
        cVar2 = (**(code **)(*plVar1 + 0x20))(plVar1,0x53);
        plVar1 = *(longlong **)(lVar10 + 8);
        cVar3 = (**(code **)(*plVar1 + 0x20))(plVar1,param_4 & 0xffffffff);
        if (cVar2 == cVar3) {
          uVar4 = *(ushort *)(&UNK_7ff70cb463e4 + uVar9 * 0x18);
          goto LAB_7ff70c928f28;
        }
      }
      uVar9 = uVar9 + 1;
      puVar6 = *(undefined **)(&UNK_7ff70cb463d0 + uVar9 * 0x18);
    } while (uVar9 != 0xf);
    uVar4 = 0;
LAB_7ff70c928f28:
    uVar8 = uVar4 | 3;
    if ((uVar4 & 3) == 0) {
      uVar8 = uVar4;
    }
    if ((uVar5 & 0x100) == 0) {
      uVar8 = uVar4;
    }
    *(ushort *)((longlong)plStack_50 + 0xee) = uVar8;
    uVar5 = *(uint *)(param_5 + 0xc);
  }
  if ((uVar5 & 0x400) != 0) {
    lVar10 = plStack_50[0x19];
    uVar5 = *(uint *)(plStack_50 + 0x1c);
    puVar6 = &UNK_7ff70cb849e6;
    uVar9 = 0;
    do {
      if ((0x2810UL >> (uVar9 & 0x3f) & 1) != 0) {
        param_4 = CONCAT71((int7)(param_4 >> 8),*puVar6);
        plVar1 = *(longlong **)(lVar10 + 8);
        cVar2 = (**(code **)(*plVar1 + 0x20))(plVar1,0x44);
        plVar1 = *(longlong **)(lVar10 + 8);
        cVar3 = (**(code **)(*plVar1 + 0x20))(plVar1,param_4 & 0xffffffff);
        if (cVar2 == cVar3) {
          uVar4 = *(ushort *)(&UNK_7ff70cb463e4 + uVar9 * 0x18);
          goto LAB_7ff70c928fd8;
        }
      }
      uVar9 = uVar9 + 1;
      puVar6 = *(undefined **)(&UNK_7ff70cb463d0 + uVar9 * 0x18);
    } while (uVar9 != 0xf);
    uVar4 = 0;
LAB_7ff70c928fd8:
    uVar8 = uVar4 | 3;
    if ((uVar4 & 3) == 0) {
      uVar8 = uVar4;
    }
    if ((uVar5 & 0x100) == 0) {
      uVar8 = uVar4;
    }
    *(ushort *)(plStack_50 + 0x1e) = uVar8;
  }
  param_3 = param_3 - param_2;
  uVar7 = param_3 / 3 + 0x4c4b4;
  uVar9 = 0x7ffffffffffffff;
  if (uVar7 < 0x7ffffffffffffff) {
    uVar9 = uVar7;
  }
  lVar10 = 0x7fffffffffffffff;
  if (param_3 < 0x7ffffffffffb6d) {
    lVar10 = param_3 * 0x100 + 300000;
  }
  plStack_50[0x17] = uVar9;
  *plStack_50 = lVar10;
  plStack_50[0x18] = *(longlong *)(*(longlong *)(param_5 + 0x10) + 0x10);
  lStack_60 = param_9;
  uStack_58 = 0x1000;
  FUN_7ff70c929b00(param_1 + 0xf,&lStack_60,&uStack_58,*(undefined4 *)(param_5 + 0x24));
  if (1 < *(uint *)(plStack_50 + 0x1d)) {
    FUN_7ff70c929c30(plStack_50 + 2,&lStack_60,&uStack_58,*(uint *)(plStack_50 + 0x1d) - 1);
    if (*(char *)((longlong)plStack_50 + 0xf3) == '\x01') {
      FUN_7ff70c929c30(plStack_50 + 9,&lStack_60,&uStack_58,(int)plStack_50[0x1d] + -1);
    }
    FUN_7ff70c929e50(plStack_50 + 5,&lStack_60,&uStack_58,
                     (ulonglong)((int)plStack_50[0x1d] - 1) + 0x3f >> 6);
    if (*(char *)((longlong)plStack_50 + 0xf3) == '\x01') {
      FUN_7ff70c929e50(plStack_50 + 0xc,&lStack_60,&uStack_58,
                       (ulonglong)((int)plStack_50[0x1d] - 1) + 0x3f >> 6);
    }
  }
  uVar7 = (ulonglong)((uint)lStack_60 & 7);
  uVar9 = 8 - uVar7;
  if (uVar7 == 0) {
    uVar9 = 0;
  }
  if ((lStack_60 != 0 && uVar9 <= uStack_58) && 0x1f < uStack_58 - uVar9) {
    lStack_60 = lStack_60 + uVar9;
    plStack_50[0x12] = lStack_60;
    plStack_50[0x13] = lStack_60;
    plStack_50[0x14] = (uStack_58 - uVar9 & 0xffffffffffffffe0) + lStack_60;
  }
  if ((*(uint *)(plStack_50 + 0x1c) & 0x3e) != 0) {
    *(uint *)(plStack_50 + 0x1c) = *(uint *)(plStack_50 + 0x1c) & 0xffffefff;
  }
  return;
}


