
undefined8 FUN_0014538c(long param_1)

{
  undefined2 *puVar1;
  undefined4 *puVar2;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x22;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined4 uStack0000000000000038;
  
  lStack0000000000000030 = *(long *)(param_1 + 0x428);
  uStack0000000000000028 = *(undefined8 *)(param_1 + 0x420);
  uStack0000000000000038 = 5;
  if (unaff_x20 < unaff_x19) {
    unaff_x20[2] = lStack0000000000000030;
    unaff_x20[1] = uStack0000000000000028;
    *unaff_x20 = uStack0000000000000020;
    *(undefined4 *)(unaff_x20 + 3) = 5;
    puRam0000000000a393e8 = unaff_x20 + 4;
  }
  else {
    puRam0000000000a393e8 = (undefined8 *)func_0x0014a284(0xa393e0,&uStack0000000000000020);
    if (lStack0000000000000030 < 0) {
      __ZdlPv(uStack0000000000000020);
    }
  }
  if (cRam0000000000a3939f < '\0') {
    uRam0000000000a39390 = 2;
    puVar1 = (undefined2 *)
             CONCAT53(uRam0000000000a3938b,CONCAT12(uRam0000000000a3938a,uRam0000000000a39388));
    *puVar1 = 0x2a2f;
    *(undefined1 *)(puVar1 + 1) = 0;
  }
  else {
    cRam0000000000a3939f = '\x02';
    uRam0000000000a39388 = 0x2a2f;
    uRam0000000000a3938a = 0;
  }
  if (cRam0000000000a393b7 < '\0') {
    uRam0000000000a393a8 = 2;
    puVar1 = (undefined2 *)
             CONCAT53(uRam0000000000a393a3,CONCAT12(uRam0000000000a393a2,uRam0000000000a393a0));
    *puVar1 = 0x2f2a;
    *(undefined1 *)(puVar1 + 1) = 0;
  }
  else {
    cRam0000000000a393b7 = '\x02';
    uRam0000000000a393a0 = 0x2f2a;
    uRam0000000000a393a2 = 0;
  }
  if (cRam0000000000a393cf < '\0') {
    uRam0000000000a393c0 = 2;
    puVar1 = puRam0000000000a393b8;
  }
  else {
    puVar1 = (undefined2 *)0xa393b8;
    cRam0000000000a393cf = '\x02';
  }
  *puVar1 = 0x2f2f;
  *(undefined1 *)(puVar1 + 1) = 0;
  uRam0000000000a393f8 = 1;
  uRam0000000000a393d1 = 1;
  if (cRam0000000000a3930f < '\0') {
    uRam0000000000a39300 = 4;
    puVar2 = puRam0000000000a392f8;
  }
  else {
    cRam0000000000a3930f = '\x04';
    puVar2 = (undefined4 *)0xa392f8;
  }
  *puVar2 = 0x4c534c47;
  *(undefined1 *)(puVar2 + 1) = 0;
  *(undefined1 *)(unaff_x22 + 0xaa) = 1;
  return 0xa392f8;
}

