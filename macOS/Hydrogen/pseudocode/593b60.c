
ulong * FUN_00593b60(long param_1,long param_2)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong *puVar3;
  ulong *puVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x21;
  
  puVar2 = (ulong *)func_0x00593b34(param_2,param_2 + (param_1 + unaff_x21) * 0x20,
                                    param_2 + (unaff_x21 * 0x200 - param_1));
  puVar3 = (ulong *)func_0x00593b34();
  puVar4 = (ulong *)func_0x00593b34();
  uVar5 = *puVar2;
  uVar6 = *puVar3;
  puVar1 = puVar4;
  if (uVar5 < uVar6 == uVar6 < *puVar4) {
    puVar1 = puVar3;
  }
  if (uVar5 < uVar6 == uVar5 < *puVar4) {
    puVar2 = puVar1;
  }
  return puVar2;
}

