
void FUN_001a4fbc(uint *param_1,long param_2)

{
  uint *puVar1;
  undefined2 *puVar2;
  long *plVar3;
  long *unaff_x19;
  long unaff_x20;
  uint *unaff_x21;
  char *unaff_x22;
  uint *unaff_x23;
  undefined2 uVar4;
  undefined2 uVar5;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
code_r0x001a4fbc:
  plVar3 = *(long **)(unaff_x23 + 2);
  if (*plVar3 == 0) goto LAB_001a4fa8;
  unaff_x23 = unaff_x23 + 4;
  uVar4 = (undefined2)plVar3[9];
  uVar5 = *(undefined2 *)((long)plVar3 + 0x4a);
  if (unaff_x20 != uStack0000000000000008) goto LAB_001a4f78;
  do {
    func_0x0079b61c(&uStack0000000000000008,unaff_x20,1,2,4);
    param_2 = in_stack_00000010;
LAB_001a4f78:
    do {
      puVar2 = (undefined2 *)(param_2 + unaff_x20 * 4);
      *puVar2 = uVar4;
      puVar2[1] = uVar5;
      unaff_x20 = unaff_x20 + 1;
      in_stack_00000018 = unaff_x20;
      if (unaff_x23 == unaff_x21) goto code_r0x001a501c;
      if (*unaff_x22 == '\x01') {
        goto code_r0x001a4fb4;
      }
      puVar1 = unaff_x23 + 2;
      unaff_x23 = unaff_x23 + 4;
      uVar4 = *(undefined2 *)(*(long *)puVar1 + 0x48);
      uVar5 = *(undefined2 *)(*(long *)puVar1 + 0x4a);
    } while (unaff_x20 != uStack0000000000000008);
  } while( true );
code_r0x001a4fb4:
  param_1 = unaff_x23 + 4;
  if ((*unaff_x23 & 1) != 0) goto code_r0x001a4fbc;
LAB_001a4fa8:
  unaff_x23 = param_1;
  if (param_1 == unaff_x21) {
code_r0x001a501c:
    unaff_x19[1] = in_stack_00000010;
    *unaff_x19 = uStack0000000000000008;
    unaff_x19[2] = in_stack_00000018;
    return;
  }
  goto code_r0x001a4fb4;
}

