
/* WARNING: Removing unreachable block (ram,0x0004b0f0) */
/* WARNING: Removing unreachable block (ram,0x0004b0f4) */
/* WARNING: Removing unreachable block (ram,0x0004b0f8) */
/* WARNING: Removing unreachable block (ram,0x0004b104) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0004af5c(void)

{
  char cVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  ulong uVar4;
  long *unaff_x19;
  undefined8 *unaff_x21;
  undefined4 unaff_w23;
  long unaff_x29;
  undefined1 uStack0000000000000038;
  undefined8 *in_stack_00000040;
  ulong in_stack_00000048;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  
  puVar2 = (undefined8 *)__Znwm(0x70);
  uVar3 = __Znwm(0x80);
  func_0x000402a0(uVar3,0);
  func_0x0066a6b0(puVar2,0);
  *puVar2 = &UNK_009f7f30;
  puVar2[1] = &UNK_009f80e0;
  puVar2[7] = 0;
  puVar2[8] = 0;
  puVar2[6] = 0;
  *(undefined4 *)(puVar2 + 9) = 0;
  puVar2[0xc] = 0;
  puVar2[0xd] = 0;
  puVar2[0xb] = 0xffffffffffffffff;
  (*_UNK_009f80a0)(puVar2,uVar3);
  func_0x0066c374();
  *unaff_x19 = (long)&UNK_00a11ee0;
  unaff_x19[1] = (long)&UNK_00a120f0;
  func_0x00040398(unaff_x29 + -0x60,"Uppercase",unaff_x29 + -0x41,1);
  cVar1 = *(char *)(unaff_x29 + -0x50);
  puVar2 = (undefined8 *)__Znwm(0x28);
  *(char *)(puVar2 + 2) = cVar1;
  *(undefined1 *)((long)puVar2 + 0x11) = 0;
  *puVar2 = &UNK_009f8b20;
  puVar2[1] = "GroupSize";
  *(undefined4 *)(puVar2 + 4) = unaff_w23;
  puVar2[3] = *(undefined8 *)(unaff_x29 + -0x58);
  *(undefined8 **)(unaff_x29 + -0x58) = puVar2;
  in_stack_00000060 = 0;
  in_stack_00000068 = 0;
  in_stack_00000058 = 0xffffffffffffffff;
  in_stack_00000048 = unaff_x21[1];
  in_stack_00000040 = (undefined8 *)*unaff_x21;
  if (-1 < (char)*(byte *)((long)unaff_x21 + 0x17)) {
    in_stack_00000048 = (ulong)*(byte *)((long)unaff_x21 + 0x17);
    in_stack_00000040 = unaff_x21;
  }
  uStack0000000000000038 = 0;
  uVar3 = func_0x0003fcac(unaff_x29 + -0x60,"Separator",&uStack0000000000000038,cVar1 != '\0');
  func_0x0003fcac(uVar3,"Terminator");
  (**(code **)(*unaff_x19 + 0x58))();
  uVar4 = in_stack_00000058;
  if (in_stack_00000060 <= in_stack_00000058) {
    uVar4 = in_stack_00000060;
  }
  if (in_stack_00000068 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined1 *)(in_stack_00000068 + -1 + uVar4) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0x60) = &UNK_009f6820;
  if (*(long **)(unaff_x29 + -0x58) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0x58) + 8))();
  }
  return;
}

