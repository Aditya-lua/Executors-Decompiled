
/* WARNING: Removing unreachable block (ram,0x00031a60) */
/* WARNING: Removing unreachable block (ram,0x00031a70) */

void FUN_00031978(ulong param_1)

{
  byte bVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 *in_x10;
  undefined8 *in_x11;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar6;
  undefined8 *unaff_x21;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  long in_stack_00000058;
  
  while( true ) {
    *(undefined1 *)((long)in_x11 + param_1) = *(undefined1 *)((long)in_x10 + param_1);
    param_1 = param_1 + 1;
    bVar1 = *(byte *)((long)unaff_x20 + 0x17);
    uVar5 = (ulong)bVar1;
    if ((char)bVar1 < '\0') {
      uVar5 = unaff_x20[1];
    }
    if (uVar5 <= param_1) break;
    in_x10 = unaff_x20;
    in_x11 = unaff_x20;
    if ((char)bVar1 < '\0') {
      in_x10 = (undefined8 *)*unaff_x20;
      in_x11 = (undefined8 *)*unaff_x20;
    }
  }
  if ((char)*(byte *)((long)unaff_x21 + 0x17) < '\0') {
    puVar6 = (undefined8 *)*unaff_x21;
    uVar5 = unaff_x21[1];
  }
  else {
    uVar5 = (ulong)*(byte *)((long)unaff_x21 + 0x17);
    puVar6 = unaff_x21;
  }
  func_0x00032d70(&uStack0000000000000018,unaff_x19 + 0x10,puVar6,(long)puVar6 + uVar5);
  if ((char)*(byte *)((long)unaff_x20 + 0x17) < '\0') {
    puVar6 = (undefined8 *)*unaff_x20;
    uVar5 = unaff_x20[1];
  }
  else {
    uVar5 = (ulong)*(byte *)((long)unaff_x20 + 0x17);
    puVar6 = unaff_x20;
  }
  func_0x00032d70(unaff_x19 + 0x10,puVar6,(long)puVar6 + uVar5);
  lVar3 = in_stack_00000028;
  uVar2 = in_stack_00000020;
  uVar4 = uStack0000000000000018;
  in_stack_00000038 = in_stack_00000020;
  uStack0000000000000030 = uStack0000000000000018;
  in_stack_00000040 = in_stack_00000028;
  in_stack_00000020 = 0;
  in_stack_00000028 = 0;
  in_stack_00000050 = in_stack_00000008;
  in_stack_00000048 = in_stack_00000000;
  in_stack_00000058 = in_stack_00000010;
  uStack0000000000000018 = 0;
  puVar6 = *(undefined8 **)(unaff_x19 + 0x60);
  if (puVar6 < *(undefined8 **)(unaff_x19 + 0x68)) {
    puVar6[2] = lVar3;
    puVar6[1] = uVar2;
    *puVar6 = uVar4;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uStack0000000000000030 = 0;
    puVar6[4] = in_stack_00000008;
    puVar6[3] = in_stack_00000000;
    puVar6[5] = in_stack_00000010;
    in_stack_00000050 = 0;
    in_stack_00000058 = 0;
    in_stack_00000048 = 0;
    *(undefined8 **)(unaff_x19 + 0x60) = puVar6 + 6;
  }
  else {
    uVar4 = func_0x00032f4c(unaff_x19 + 0x58,&uStack0000000000000030);
    *(undefined8 *)(unaff_x19 + 0x60) = uVar4;
    if (in_stack_00000058 < 0) {
      __ZdlPv(in_stack_00000048);
    }
    if (in_stack_00000040 < 0) {
      __ZdlPv(uStack0000000000000030);
    }
  }
  if (in_stack_00000028 < 0) {
    __ZdlPv(uStack0000000000000018);
    return;
  }
  return;
}

