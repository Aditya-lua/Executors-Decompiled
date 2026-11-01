
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00145348(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  int in_w8;
  undefined2 *puVar6;
  undefined4 *puVar7;
  ulong *unaff_x19;
  long unaff_x22;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined4 in_stack_00000038;
  
  puRam0000000000a393e8 = (undefined8 *)param_1;
  if (in_w8 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  puVar1 = (undefined8 *)*unaff_x19;
  puVar2 = (undefined8 *)unaff_x19[1];
  uStack0000000000000020 = (char *)__Znwm(0x38);
  uVar5 = s__________________________________008d982b._24_8_;
  uVar4 = s__________________________________008d982b._16_8_;
  uVar3 = s__________________________________008d982b._0_8_;
  *(undefined8 *)(uStack0000000000000020 + 8) = s__________________________________008d982b._8_8_;
  *(undefined8 *)uStack0000000000000020 = uVar3;
  *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar5;
  *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar4;
  uVar3 = s__________________________________008d982b._32_8_;
  *(undefined8 *)(uStack0000000000000020 + 0x28) =
       s__________________________________008d982b._40_8_;
  *(undefined8 *)(uStack0000000000000020 + 0x20) = uVar3;
  uStack0000000000000020[0x30] = '\0';
  uVar3 = _UNK_00813420;
  in_stack_00000030 = _UNK_00813428;
  in_stack_00000028 = _UNK_00813420;
  in_stack_00000038 = 5;
  if (puVar1 < puVar2) {
    puVar1[2] = _UNK_00813428;
    puVar1[1] = uVar3;
    *puVar1 = uStack0000000000000020;
    *(undefined4 *)(puVar1 + 3) = 5;
    puRam0000000000a393e8 = puVar1 + 4;
  }
  else {
    puRam0000000000a393e8 = (undefined8 *)func_0x0014a284(0xa393e0,&uStack0000000000000020);
    if (in_stack_00000030 < 0) {
      __ZdlPv(uStack0000000000000020);
    }
  }
  if (cRam0000000000a3939f < '\0') {
    uRam0000000000a39390 = 2;
    puVar6 = (undefined2 *)
             CONCAT53(uRam0000000000a3938b,CONCAT12(uRam0000000000a3938a,uRam0000000000a39388));
    *puVar6 = 0x2a2f;
    *(undefined1 *)(puVar6 + 1) = 0;
  }
  else {
    cRam0000000000a3939f = '\x02';
    uRam0000000000a39388 = 0x2a2f;
    uRam0000000000a3938a = 0;
  }
  if (cRam0000000000a393b7 < '\0') {
    uRam0000000000a393a8 = 2;
    puVar6 = (undefined2 *)
             CONCAT53(uRam0000000000a393a3,CONCAT12(uRam0000000000a393a2,uRam0000000000a393a0));
    *puVar6 = 0x2f2a;
    *(undefined1 *)(puVar6 + 1) = 0;
  }
  else {
    cRam0000000000a393b7 = '\x02';
    uRam0000000000a393a0 = 0x2f2a;
    uRam0000000000a393a2 = 0;
  }
  if (cRam0000000000a393cf < '\0') {
    uRam0000000000a393c0 = 2;
    puVar6 = puRam0000000000a393b8;
  }
  else {
    puVar6 = (undefined2 *)0xa393b8;
    cRam0000000000a393cf = '\x02';
  }
  *puVar6 = 0x2f2f;
  *(undefined1 *)(puVar6 + 1) = 0;
  uRam0000000000a393f8 = 1;
  uRam0000000000a393d1 = 1;
  if (cRam0000000000a3930f < '\0') {
    uRam0000000000a39300 = 4;
    puVar7 = puRam0000000000a392f8;
  }
  else {
    cRam0000000000a3930f = '\x04';
    puVar7 = (undefined4 *)0xa392f8;
  }
  *puVar7 = 0x4c534c47;
  *(undefined1 *)(puVar7 + 1) = 0;
  *(undefined1 *)(unaff_x22 + 0xaa) = 1;
  return 0xa392f8;
}

