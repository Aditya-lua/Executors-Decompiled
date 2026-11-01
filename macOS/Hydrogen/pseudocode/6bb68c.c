
void FUN_006bb68c(void)

{
  int *piVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  ulong in_x9;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  
  for (; unaff_x21 < in_x9; unaff_x21 = unaff_x21 + 1) {
    piVar1 = (int *)(*unaff_x19 + unaff_x20);
    if (((*piVar1 != (int)unaff_x19[3]) || (*(long *)(piVar1 + 2) != unaff_x19[4])) ||
       (*(long *)(*unaff_x19 + unaff_x20 + 0x10) != unaff_x19[5])) {
      puVar3 = (undefined8 *)func_0x006bb4ac(&uStack0000000000000008);
      puVar2 = (undefined8 *)(*unaff_x19 + unaff_x20);
      uVar6 = puVar2[1];
      uVar5 = *puVar2;
      puVar3[2] = puVar2[2];
      puVar3[1] = uVar6;
      *puVar3 = uVar5;
      *(undefined4 *)(puVar3 + 3) = *(undefined4 *)(puVar2 + 3);
      in_x9 = unaff_x19[1];
    }
    unaff_x20 = unaff_x20 + 0x20;
  }
  lVar4 = *unaff_x19;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[1] = in_stack_00000010;
  if (lVar4 != 0) {
    uStack0000000000000008 = lVar4;
    in_stack_00000010 = in_x9;
    __ZdlPv(lVar4);
  }
  return;
}

