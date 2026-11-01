
void FUN_0002cd5c(void)

{
  int iVar1;
  undefined4 in_w8;
  ulong uVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined4 *unaff_x19;
  long unaff_x20;
  undefined8 uVar8;
  long in_stack_00000000;
  long in_stack_00000008;
  
  *unaff_x19 = in_w8;
  *(undefined8 *)(unaff_x19 + 0x14) = *(undefined8 *)(unaff_x20 + 8);
  uVar2 = (in_stack_00000008 - in_stack_00000000 >> 3) * -0x5555555555555555;
  if (uVar2 < 2) {
    if (in_stack_00000000 == 0) {
      return;
    }
  }
  else {
    iVar3 = 0;
    iVar1 = *(int *)(unaff_x20 + 0x50);
    lVar4 = *(long *)(unaff_x19 + 8);
    uVar5 = 1;
    do {
      puVar6 = (undefined8 *)(in_stack_00000000 + uVar5 * 0x18);
      puVar7 = (undefined8 *)(lVar4 + (ulong)(uint)(iVar1 + iVar3) * 0x18);
      uVar8 = *puVar6;
      puVar7[1] = puVar6[1];
      *puVar7 = uVar8;
      *(undefined1 *)(puVar7 + 2) = *(undefined1 *)(puVar6 + 2);
      uVar5 = (ulong)(iVar3 + 2);
      iVar3 = iVar3 + 1;
    } while (uVar5 < uVar2);
  }
  __ZdlPv();
  return;
}

