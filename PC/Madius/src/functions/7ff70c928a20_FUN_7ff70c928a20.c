/* 7ff70c928a20 FUN_7ff70c928a20 */

ulonglong FUN_7ff70c928a20(longlong param_1,longlong param_2,undefined8 *param_3,longlong *param_4)

{
  uint uVar1;
  undefined4 uVar2;
  longlong lVar3;
  byte bVar4;
  undefined4 uVar5;
  longlong lVar6;
  longlong lVar7;
  ulonglong uVar8;
  longlong alStackX_8 [2];
  undefined1 auStackX_18 [16];
  undefined8 uStack_40;
  undefined1 *puVar9;
  
  uStack_40 = 0x7ff70c928a34;
  lVar6 = FUN_7ff70caa9780();
  lVar6 = -lVar6;
  *(undefined8 *)(&stack0x00001110 + lVar6) = 0xfffffffffffffffe;
  if (param_3 != (undefined8 *)0x0) {
    *(undefined1 *)(param_3 + 1) = 1;
    if (param_3[3] != param_3[2]) {
      param_3[3] = param_3[2];
    }
  }
  lVar3 = *param_4;
  if (lVar3 == 0) {
    uVar8 = 0;
    goto LAB_7ff70c928c55;
  }
  uVar1 = *(uint *)(&stack0x00001178 + lVar6);
  lVar7 = (ulonglong)(param_1 != param_2 & (byte)(uVar1 >> 0xe) & 1) + param_1;
  uVar5 = *(undefined4 *)(lVar3 + 0x20);
  uVar2 = *(undefined4 *)(lVar3 + 0x28);
  *(undefined1 **)((longlong)alStackX_8 + lVar6) = auStackX_18 + lVar6;
  *(uint *)(auStackX_18 + lVar6 + -0x18) = uVar1;
  *(undefined4 *)(&stack0xfffffffffffffff8 + lVar6) = uVar5;
  *(undefined4 *)(&stack0xfffffffffffffff0 + lVar6) = uVar2;
  *(longlong *)(&stack0xffffffffffffffe8 + lVar6) = lVar3;
  puVar9 = &stack0x00001018 + lVar6;
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x7ff70c928acf;
  FUN_7ff70c928d10(puVar9,lVar7,param_2,param_4 + 1);
  *(undefined8 *)(&stack0x00001020 + lVar6) = *(undefined8 *)(&stack0x000010e8 + lVar6);
  (&stack0x0000110c)[lVar6] = 0;
  *(undefined8 *)(&stack0x000010c8 + lVar6) = 0;
  (&stack0x0000110a)[lVar6] = 0;
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x7ff70c928b05;
  bVar4 = FUN_7ff70c929f60(puVar9,*(undefined8 *)(&stack0x000010d8 + lVar6));
  if (((bVar4 | (&stack0x0000110a)[lVar6]) & 1) == 0) {
    uVar8 = 0;
    if (((uVar1 & 0x40) == 0) && (lVar7 != param_2)) {
      *(uint *)(&stack0x000010fc + lVar6) = *(uint *)(&stack0x000010fc + lVar6) & 0xffffdeff | 0x100
      ;
      puVar9 = &stack0x00001018 + lVar6;
      do {
        *(undefined4 *)(&stack0xffffffffffffffe8 + lVar6) = 0;
        *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x7ff70c928bac;
        lVar7 = FUN_7ff70c929240(puVar9,lVar7 + 1,param_2,0);
        if (lVar7 == param_2) {
          *(longlong *)(&stack0x000010e8 + lVar6) = param_2;
          *(longlong *)(&stack0x00001020 + lVar6) = param_2;
          (&stack0x0000110c)[lVar6] = 0;
          *(undefined8 *)(&stack0x000010c8 + lVar6) = 0;
          (&stack0x0000110a)[lVar6] = 0;
          *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x7ff70c928c35;
          uVar5 = FUN_7ff70c929f60(&stack0x00001018 + lVar6,
                                   *(undefined8 *)(&stack0x000010d8 + lVar6));
          uVar8 = (ulonglong)
                  CONCAT31((int3)((uint)uVar5 >> 8),(byte)uVar5 | (&stack0x0000110a)[lVar6]);
          goto joined_r0x7ff70c928c43;
        }
        *(longlong *)(&stack0x000010e8 + lVar6) = lVar7;
        *(longlong *)(&stack0x00001020 + lVar6) = lVar7;
        (&stack0x0000110c)[lVar6] = 0;
        *(undefined8 *)(&stack0x000010c8 + lVar6) = 0;
        (&stack0x0000110a)[lVar6] = 0;
        *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x7ff70c928beb;
        bVar4 = FUN_7ff70c929f60(puVar9,*(undefined8 *)(&stack0x000010d8 + lVar6));
      } while (((bVar4 | (&stack0x0000110a)[lVar6]) & 1) == 0);
      goto LAB_7ff70c928b10;
    }
  }
  else {
LAB_7ff70c928b10:
    uVar8 = CONCAT71((int7)((ulonglong)puVar9 >> 8),1);
joined_r0x7ff70c928c43:
    if ((param_3 != (undefined8 *)0x0) && ((uVar8 & 1) != 0)) {
      *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x7ff70c928b35;
      FUN_7ff70c929660(&stack0x00001018 + lVar6,param_3);
      *param_3 = *(undefined8 *)(&stack0x00001180 + lVar6);
      param_3[5] = param_1;
      *(bool *)(param_3 + 7) = param_1 != param_3[6];
      uVar8 = CONCAT71((int7)(uVar8 >> 8),1);
    }
  }
  *(undefined8 *)((longlong)&uStack_40 + lVar6) = 0x7ff70c928c55;
  FUN_7ff70c929810(&stack0x00001018 + lVar6);
LAB_7ff70c928c55:
  return uVar8 & 0xffffff01;
}


