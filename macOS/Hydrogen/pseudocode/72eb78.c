
undefined8
FUN_0072eb78(undefined8 param_1,undefined8 param_2,int param_3,uint *param_4,uint *param_5)

{
  long lVar1;
  undefined8 uVar2;
  int in_w8;
  uint *puVar3;
  undefined1 *unaff_x21;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long in_stack_00000008;
  
  if (0 < in_w8) {
    param_3 = 0x8ee1b3;
    func_0x0073cbdc();
  }
  *unaff_x21 = 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000008) {
    return 1;
  }
  lVar1 = ___stack_chk_fail();
  if (param_3 - 2U < 7) {
    puVar3 = *(uint **)(lVar1 + 0x10);
    switch(param_3) {
    case 2:
      if ((puVar3[0x4d] & 1) == 0) {
        *param_4 = 0xffffffff;
        return 0;
      }
      lVar1 = func_0x00782dc4(*(undefined8 *)(puVar3 + 0x48),*(undefined8 *)(puVar3 + 0x4a),
                              *(undefined8 *)(puVar3 + 0x40),*(undefined8 *)(puVar3 + 0x42));
      if (0x7ffffffe < lVar1) {
        lVar1 = 0x7fffffff;
      }
      *param_4 = (uint)lVar1;
      return 0;
    case 3:
      *param_5 = puVar3[0x26];
      return 0;
    case 4:
      if (((*puVar3 & 0xfffffffe) == 4) && ((puVar3[0x4d] & 1) != 0)) {
        uVar2 = *(undefined8 *)(puVar3 + 0x48);
        *(undefined8 *)(param_5 + 2) = *(undefined8 *)(puVar3 + 0x4a);
        *(undefined8 *)param_5 = uVar2;
        return 0;
      }
      uVar2 = *(undefined8 *)(puVar3 + 0x44);
      *(undefined8 *)(param_5 + 2) = *(undefined8 *)(puVar3 + 0x46);
      *(undefined8 *)param_5 = uVar2;
      return 0;
    case 8:
      *param_4 = (uint)(puVar3[2] == 0x1e);
      uVar4 = *(undefined8 *)(puVar3 + 0x29);
      uVar2 = *(undefined8 *)(puVar3 + 0x27);
      uVar5 = *(undefined8 *)(puVar3 + 0x2b);
      uVar7 = *(undefined8 *)(puVar3 + 0x31);
      uVar6 = *(undefined8 *)(puVar3 + 0x2f);
      *(undefined8 *)(param_5 + 6) = *(undefined8 *)(puVar3 + 0x2d);
      *(undefined8 *)(param_5 + 4) = uVar5;
      *(undefined8 *)(param_5 + 10) = uVar7;
      *(undefined8 *)(param_5 + 8) = uVar6;
      *(undefined8 *)(param_5 + 2) = uVar4;
      *(undefined8 *)param_5 = uVar2;
      uVar4 = *(undefined8 *)(puVar3 + 0x35);
      uVar2 = *(undefined8 *)(puVar3 + 0x33);
      uVar6 = *(undefined8 *)(puVar3 + 0x39);
      uVar5 = *(undefined8 *)(puVar3 + 0x37);
      uVar8 = *(undefined8 *)(puVar3 + 0x3d);
      uVar7 = *(undefined8 *)(puVar3 + 0x3b);
      param_5[0x18] = puVar3[0x3f];
      *(undefined8 *)(param_5 + 0x12) = uVar6;
      *(undefined8 *)(param_5 + 0x10) = uVar5;
      *(undefined8 *)(param_5 + 0x16) = uVar8;
      *(undefined8 *)(param_5 + 0x14) = uVar7;
      *(undefined8 *)(param_5 + 0xe) = uVar4;
      *(undefined8 *)(param_5 + 0xc) = uVar2;
      return 0;
    }
  }
  if (*(long **)(lVar1 + 8) == (long *)0x0) {
    return 0x30;
  }
                    /* WARNING: Could not recover jumptable at 0x0072ec60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (**(code **)(**(long **)(lVar1 + 8) + 0x70))();
  return uVar2;
}

