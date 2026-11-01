
/* WARNING: Removing unreachable block (ram,0x00056f04) */
/* WARNING: Removing unreachable block (ram,0x00056ef4) */
/* WARNING: Removing unreachable block (ram,0x00056f14) */

void FUN_00056de4(void)

{
  undefined8 *puVar1;
  long *plVar2;
  long unaff_x19;
  long unaff_x21;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  
  func_0x000562f0();
  *(undefined8 *)(unaff_x19 + 0x18) = 0;
  puVar1 = (undefined8 *)__Znwm(0x80);
  *puVar1 = &UNK_009b7bd0;
  puVar1[2] = in_stack_00000010;
  puVar1[1] = in_stack_00000008;
  puVar1[3] = in_stack_00000018;
  puVar1[5] = in_stack_00000028;
  puVar1[4] = in_stack_00000020;
  puVar1[6] = in_stack_00000030;
  puVar1[8] = in_stack_00000040;
  puVar1[7] = in_stack_00000038;
  puVar1[9] = in_stack_00000048;
  puVar1[10] = in_stack_00000050;
  plVar2 = puVar1 + 0xb;
  *plVar2 = in_stack_00000058;
  puVar1[0xc] = in_stack_00000060;
  if (in_stack_00000060 == 0) {
    puVar1[10] = plVar2;
  }
  else {
    *(long **)(in_stack_00000058 + 0x10) = plVar2;
    *(undefined8 *)(unaff_x21 + 0x50) = 0;
    *(undefined8 *)(unaff_x21 + 0x58) = 0;
  }
  plVar2 = puVar1 + 0xe;
  *plVar2 = uStack0000000000000070;
  puVar1[0xd] = uStack0000000000000068;
  puVar1[0xf] = in_stack_00000078;
  if (in_stack_00000078 == 0) {
    puVar1[0xd] = plVar2;
  }
  else {
    uStack0000000000000068 = &uStack0000000000000070;
    *(long **)(uStack0000000000000070 + 0x10) = plVar2;
    uStack0000000000000070 = 0;
    in_stack_00000078 = 0;
  }
  *(undefined8 **)(unaff_x19 + 0x18) = puVar1;
  func_0x00056a34(&uStack0000000000000068,uStack0000000000000070);
  func_0x00056a34(unaff_x21 + 0x48,in_stack_00000058);
  return;
}

