
/* WARNING: Removing unreachable block (ram,0x0004db6c) */
/* WARNING: Removing unreachable block (ram,0x0004dab4) */
/* WARNING: Removing unreachable block (ram,0x0004dbac) */

undefined8 FUN_0004da80(void)

{
  undefined8 *puVar1;
  undefined8 *unaff_x24;
  long unaff_x29;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000090;
  
  __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE();
  __ZNSt3__14__fs10filesystem6__copyERKNS1_4pathES4_NS1_12copy_optionsEPNS_10error_codeE
            (&uStack0000000000000040,&uStack0000000000000060,8,0);
  in_stack_00000028 = *(undefined8 *)(unaff_x29 + -0x70);
  uStack0000000000000020 = *(undefined8 *)(unaff_x29 + -0x78);
  in_stack_00000030 = *(long *)(unaff_x29 + -0x68);
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKcm
                     (&uStack0000000000000020,0,"rbxasset://",0xb);
  uVar3 = puVar1[1];
  uVar2 = *puVar1;
  *(undefined8 *)(unaff_x29 + -0x50) = puVar1[2];
  unaff_x24[1] = uVar3;
  *unaff_x24 = uVar2;
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  func_0x006e38d8();
  if (in_stack_00000050._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000040);
  }
  if (in_stack_00000070._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000060);
  }
  if (in_stack_00000090._7_1_ < '\0') {
    __ZdlPv(in_stack_00000080);
  }
  return 1;
}

