
/* WARNING: Removing unreachable block (ram,0x006167a8) */
/* WARNING: Removing unreachable block (ram,0x006167ac) */
/* WARNING: Removing unreachable block (ram,0x006167b0) */
/* WARNING: Removing unreachable block (ram,0x006167bc) */
/* WARNING: Removing unreachable block (ram,0x006167d4) */
/* WARNING: Removing unreachable block (ram,0x006167d8) */
/* WARNING: Removing unreachable block (ram,0x006167dc) */
/* WARNING: Removing unreachable block (ram,0x006167e8) */

void FUN_0061666c(long param_1,long *param_2)

{
  undefined4 uVar1;
  long lVar2;
  undefined8 *puVar3;
  long in_x9;
  undefined8 unaff_x19;
  long *unaff_x20;
  int unaff_w21;
  long unaff_x22;
  ulong unaff_x24;
  undefined4 unaff_w25;
  int unaff_w26;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000080;
  long *in_stack_00000088;
  
  *param_2 = in_x9 + 0xee8;
  param_2[1] = param_1;
  *(undefined1 *)(param_2 + 4) = 0x3d;
  param_2[3] = (long)in_stack_00000088;
  in_stack_00000088 = param_2;
  in_stack_00000088 = (long *)__Znwm(0x28);
  if (unaff_w21 == 0) {
    unaff_w25 = 0x48;
  }
  *(char *)(in_stack_00000088 + 2) = (char)unaff_w26;
  *(undefined1 *)((long)in_stack_00000088 + 0x11) = 0;
  uVar1 = 0;
  if ((unaff_x24 & 1) == 0) {
    uVar1 = unaff_w25;
  }
  *in_stack_00000088 = (long)&UNK_009f8b20;
  in_stack_00000088[1] = (long)"GroupSize";
  *(undefined4 *)(in_stack_00000088 + 4) = uVar1;
  in_stack_00000088[3] = unaff_x22;
  uStack0000000000000040 = 0;
  lVar2 = func_0x0003fcac(&uStack0000000000000080,"Separator",&uStack0000000000000040,unaff_w26 != 0
                         );
  uStack0000000000000008 = 0;
  lVar2 = func_0x0003fcac(lVar2,"Terminator",&uStack0000000000000008,*(undefined1 *)(lVar2 + 0x10));
  puVar3 = (undefined8 *)__Znwm(0x28);
  *(undefined2 *)(puVar3 + 2) = 1;
  *puVar3 = &UNK_009f8b20;
  puVar3[1] = "Log2Base";
  *(undefined4 *)(puVar3 + 4) = 6;
  puVar3[3] = *(undefined8 *)(lVar2 + 8);
  *(undefined8 **)(lVar2 + 8) = puVar3;
  *(undefined1 *)(lVar2 + 0x10) = 1;
  *(undefined **)(unaff_x29 + -0x68) = &UNK_009f6848;
  *(undefined8 *)(unaff_x29 + -0x60) = unaff_x19;
  *(long *)(unaff_x29 + -0x58) = lVar2;
  (**(code **)(*unaff_x20 + 0x70))();
  uStack0000000000000080 = &UNK_009f6820;
  if (in_stack_00000088 != (long *)0x0) {
    (**(code **)(*in_stack_00000088 + 8))();
  }
  return;
}

