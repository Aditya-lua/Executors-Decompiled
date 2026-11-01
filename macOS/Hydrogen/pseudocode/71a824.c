
/* WARNING: Removing unreachable block (ram,0x0071a4fc) */
/* WARNING: Removing unreachable block (ram,0x0071a544) */
/* WARNING: Removing unreachable block (ram,0x0071a57c) */
/* WARNING: Removing unreachable block (ram,0x0071a518) */
/* WARNING: Removing unreachable block (ram,0x0071a580) */
/* WARNING: Removing unreachable block (ram,0x0071a55c) */
/* WARNING: Removing unreachable block (ram,0x0071a560) */
/* WARNING: Removing unreachable block (ram,0x0071a52c) */
/* WARNING: Removing unreachable block (ram,0x0071a588) */

void FUN_0071a824(long param_1,long param_2)

{
  long lVar1;
  bool in_ZR;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  long unaff_x29;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000030;
  long *in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  long *in_stack_00000060;
  long in_stack_00000068;
  long lStack0000000000000078;
  undefined8 uStack0000000000000088;
  long *in_stack_00000098;
  long in_stack_000000a0;
  
  lVar5 = in_stack_00000058;
  lVar1 = in_stack_00000050;
  if (!in_ZR) {
    lVar6 = unaff_x23 - param_1;
    puVar4 = (undefined8 *)(unaff_x25 + param_1 * 8 + unaff_x24 * 8);
    puVar2 = (undefined8 *)(param_2 + param_1 * 8);
    do {
      *puVar2 = *puVar4;
      lVar6 = lVar6 + -1;
      puVar4 = puVar4 + 1;
      puVar2 = puVar2 + 1;
    } while (lVar6 != 0);
  }
  uStack0000000000000088 = in_stack_00000010;
  lStack0000000000000078 = param_2;
  if (in_stack_00000058 != 0) {
    lVar6 = *in_stack_00000048;
    puVar2 = (undefined8 *)func_0x00704c24(*(undefined8 *)(unaff_x21 + 0xd8),in_stack_00000058 << 5)
    ;
    puVar4 = (undefined8 *)(lVar6 + lVar1 * 0x20);
    do {
      uVar3 = *puVar4;
      uVar8 = puVar4[3];
      uVar7 = puVar4[2];
      puVar2[1] = puVar4[1];
      *puVar2 = uVar3;
      puVar2[3] = uVar8;
      puVar2[2] = uVar7;
      lVar5 = lVar5 + -1;
      puVar4 = puVar4 + 4;
      puVar2 = puVar2 + 4;
    } while (lVar5 != 0);
  }
  uVar3 = func_0x00704c24();
  uVar3 = func_0x00707fd4(uVar3,&uStack0000000000000030);
  *unaff_x19 = unaff_x26;
  unaff_x19[1] = unaff_x20;
  unaff_x19[2] = in_stack_00000018;
  unaff_x19[3] = uVar3;
  *(undefined1 *)(unaff_x19 + 4) = 1;
  *(undefined8 *)((long)unaff_x19 + 0x24) = *(undefined8 *)(unaff_x29 + -0x70);
  *(undefined8 *)((long)unaff_x19 + 0x2c) = unaff_x27;
  lVar5 = *in_stack_00000048 + in_stack_00000050 * 0x20;
  if (lVar5 != in_stack_00000048[1]) {
    in_stack_00000048[1] = lVar5;
  }
  lVar5 = *in_stack_00000060 + in_stack_00000068 * 8;
  if (lVar5 != in_stack_00000060[1]) {
    in_stack_00000060[1] = lVar5;
  }
  lVar5 = *in_stack_00000098 + in_stack_000000a0 * 0x28;
  if (lVar5 != in_stack_00000098[1]) {
    in_stack_00000098[1] = lVar5;
  }
  return;
}

