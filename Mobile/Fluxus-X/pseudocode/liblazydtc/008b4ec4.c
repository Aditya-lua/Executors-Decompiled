/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4ec4
 */

void FUN_008b4ec4(long param_1,ulong param_2)

{
  undefined1 uVar1;
  byte bVar2;
  undefined1 *puVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  long *plVar8;
  
  plVar8 = (long *)(param_1 + 0x30);
  lVar4 = *plVar8;
  lVar7 = *(long *)(param_1 + 0x60);
  if ((lVar4 != 0) && (uVar5 = *(ulong *)(lVar4 + 8), param_2 <= uVar5)) {
    do {
      lVar6 = lVar4;
      if (uVar5 == param_2) {
        return;
      }
      lVar4 = *(long *)(lVar6 + 0x20);
    } while ((lVar4 != 0) && (uVar5 = *(ulong *)(lVar4 + 8), param_2 <= uVar5));
    plVar8 = (long *)(lVar6 + 0x20);
  }
  puVar3 = (undefined1 *)FUN_008b78d0(param_1,0x28,*(undefined1 *)(param_1 + 4),0xf,0);
  uVar1 = *(undefined1 *)(param_1 + 4);
  lVar4 = *(long *)(param_1 + 0x60);
  lVar6 = *plVar8;
  *puVar3 = 0xf;
  puVar3[1] = uVar1;
  bVar2 = *(byte *)(lVar4 + 2);
  puVar3[3] = 0;
  *(long *)(puVar3 + 0x20) = lVar6;
  puVar3[2] = bVar2 & 3;
  *plVar8 = (long)puVar3;
  *(ulong *)(puVar3 + 8) = param_2;
  *(long *)(puVar3 + 0x10) = lVar7 + 0x1b8;
  lVar4 = *(long *)(lVar7 + 0x1d0);
  *(long *)(puVar3 + 0x18) = lVar4;
  *(undefined1 **)(lVar4 + 0x10) = puVar3;
  *(undefined1 **)(lVar7 + 0x1d0) = puVar3;
  return;
}

