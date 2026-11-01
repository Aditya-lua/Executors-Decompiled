
void FUN_000c3464(long *param_1)

{
  long lVar1;
  undefined8 *puVar2;
  uint uVar3;
  ulong in_x9;
  int iVar4;
  long in_x10;
  long *in_x11;
  long *plVar5;
  undefined8 unaff_x19;
  ulong uVar6;
  long unaff_x21;
  
  plVar5 = param_1;
  do {
    if (*plVar5 == in_x10) break;
    plVar5 = plVar5 + 1;
  } while (plVar5 < in_x11);
  uVar6 = (long)plVar5 - (long)param_1;
  iVar4 = (int)(uVar6 >> 3);
  uVar3 = (uint)(in_x9 >> 3);
  if ((int)uVar3 < iVar4) {
    _memmove(param_1 + (int)uVar3,param_1 + (int)uVar3 + 1,
             -(ulong)(iVar4 + ~uVar3 >> 0x1f) & 0xfffffff800000000 | (ulong)(iVar4 + ~uVar3) << 3);
    puVar2 = (undefined8 *)
             (*(long *)(&UNK_00003fa8 + unaff_x21) +
             ((long)(uVar6 * 0x20000000 + -0x100000000) >> 0x20) * 8);
  }
  else {
    lVar1 = (long)(uVar6 * 0x20000000) >> 0x20;
    _memmove(param_1 + ((long)(uVar6 * 0x20000000 + 0x100000000) >> 0x20),param_1 + lVar1,
             -(ulong)(uVar3 - iVar4 >> 0x1f) & 0xfffffff800000000 | (ulong)(uVar3 - iVar4) << 3);
    puVar2 = (undefined8 *)(*(long *)(&UNK_00003fa8 + unaff_x21) + lVar1 * 8);
  }
  *puVar2 = unaff_x19;
  return;
}

