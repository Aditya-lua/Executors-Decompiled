/* 7ff70c932f50 FUN_7ff70c932f50 */

uint FUN_7ff70c932f50(undefined8 param_1,undefined8 param_2,longlong *param_3,uint param_4)

{
  undefined4 uVar1;
  longlong lVar2;
  undefined4 uVar3;
  longlong lVar4;
  uint uVar5;
  longlong lStackX_10;
  undefined4 auStackX_18 [4];
  undefined8 uStack_18;
  
  uStack_18 = 0x7ff70c932f5c;
  lVar4 = FUN_7ff70caa9780();
  lVar4 = -lVar4;
  *(undefined8 *)(&stack0x00001130 + lVar4) = 0xfffffffffffffffe;
  lVar2 = *param_3;
  if (lVar2 == 0) {
    uVar5 = 0;
  }
  else {
    uVar3 = *(undefined4 *)(lVar2 + 0x20);
    uVar1 = *(undefined4 *)(lVar2 + 0x28);
    *(undefined1 **)(&stack0x00000030 + lVar4) = &stack0x00000038 + lVar4;
    *(uint *)(&stack0x00000028 + lVar4) = param_4 | 0x10;
    *(undefined4 *)((longlong)auStackX_18 + lVar4 + 8) = uVar3;
    *(undefined4 *)((longlong)auStackX_18 + lVar4) = uVar1;
    *(longlong *)((longlong)&lStackX_10 + lVar4) = lVar2;
    *(undefined8 *)((longlong)&uStack_18 + lVar4) = 0x7ff70c932fc6;
    FUN_7ff70c928d10(&stack0x00001038 + lVar4,param_1,param_2,param_3 + 1);
    *(undefined8 *)(&stack0x00001040 + lVar4) = *(undefined8 *)(&stack0x00001108 + lVar4);
    (&stack0x0000112c)[lVar4] = 1;
    *(undefined8 *)(&stack0x000010e8 + lVar4) = 0;
    (&stack0x0000112a)[lVar4] = 0;
    *(undefined8 *)((longlong)&uStack_18 + lVar4) = 0x7ff70c932ffc;
    uVar3 = FUN_7ff70c929f60(&stack0x00001038 + lVar4,*(undefined8 *)(&stack0x000010f8 + lVar4));
    uVar5 = CONCAT31((int3)((uint)uVar3 >> 8),(byte)uVar3 | (&stack0x0000112a)[lVar4]);
    *(undefined8 *)((longlong)&uStack_18 + lVar4) = 0x7ff70c933012;
    FUN_7ff70c929810(&stack0x00001038 + lVar4);
  }
  return uVar5 & 0xffffff01;
}


