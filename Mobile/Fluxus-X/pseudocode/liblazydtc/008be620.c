/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008be620
 */

void FUN_008be620(long param_1,undefined4 param_2,long *param_3)

{
  int iVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  
  if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x18)) {
    plVar3 = (long *)FUN_008b4200();
  }
  else {
    plVar3 = (long *)(*(long *)(param_1 + 0x50) + 0x30);
    *(long **)(param_1 + 0x50) = plVar3;
  }
  plVar3[1] = (long)param_3;
  lVar5 = *param_3;
  if (*(char *)(lVar5 + 6) == '\0') {
    lVar4 = *(long *)(lVar5 + 0x18);
    if ((DAT_00d1fdf0 == '\x01') && (lVar6 = *(long *)(lVar4 + 0xd0), *(long *)(lVar4 + 0xd0) != 0))
    {
      do {
        lVar4 = lVar6;
        *(long *)(lVar5 + 0x18) = lVar4;
        lVar6 = *(long *)(lVar4 + 0xd0);
      } while (*(long *)(lVar4 + 0xd0) != 0);
      *(undefined1 *)(lVar5 + 4) = *(undefined1 *)(lVar4 + 5);
    }
  }
  else {
    lVar4 = 0;
  }
  lVar5 = *(long *)(param_1 + 0x68);
  plVar3[4] = 0;
  lVar6 = *(long *)(param_1 + 0x48);
  lVar7 = *(long *)(param_1 + 0x68);
  *plVar3 = lVar4;
  *(undefined4 *)(plVar3 + 5) = param_2;
  *(undefined4 *)((long)plVar3 + 0x2c) = 0;
  plVar3[2] = (long)(param_3 + 2);
  plVar3[3] = lVar5 + 0x140;
  *(long **)(param_1 + 0x70) = param_3 + 2;
  if (0x140 < lVar6 - lVar7) {
    return;
  }
  iVar2 = *(int *)(param_1 + 0x40);
  iVar1 = iVar2 << 1;
  if (iVar2 < 0x14) {
    iVar1 = iVar2 + 0x14;
  }
  FUN_008b3fdc(param_1,iVar1,1);
  return;
}

