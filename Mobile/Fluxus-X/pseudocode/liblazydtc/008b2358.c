/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b2358
 */

undefined1 *
FUN_008b2358(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,int param_5,
            uint param_6,uint param_7,byte param_8,undefined8 param_9)

{
  int iVar1;
  undefined1 uVar2;
  byte bVar3;
  undefined1 *puVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  undefined4 *puVar9;
  ulong uVar10;
  
  puVar4 = (undefined1 *)FUN_008b78d0(param_1,0x70,*(undefined1 *)(param_1 + 4),0xb,0);
  lVar5 = *(long *)(param_1 + 0x60);
  uVar2 = *(undefined1 *)(param_1 + 4);
  *puVar4 = 0xb;
  bVar3 = *(byte *)(lVar5 + 2);
  iVar1 = *(int *)(lVar5 + 0x558c);
  puVar4[1] = uVar2;
  *(undefined8 *)(puVar4 + 0x10) = param_2;
  puVar4[2] = bVar3 & 3;
  if (iVar1 != 0) {
    *(int *)(lVar5 + 0x558c) = iVar1 + 1;
  }
  *(int *)(puVar4 + 0x18) = iVar1;
  *(undefined8 *)(puVar4 + 0x28) = 0;
  *(undefined8 *)(puVar4 + 0x20) = 0;
  *(undefined8 *)(puVar4 + 0x38) = 0;
  *(undefined8 *)(puVar4 + 0x30) = 0;
  *(undefined8 *)(puVar4 + 0x48) = 0;
  *(undefined8 *)(puVar4 + 0x40) = 0;
  *(undefined8 *)(puVar4 + 0x58) = 0;
  *(undefined8 *)(puVar4 + 0x50) = 0;
  *(undefined8 *)(puVar4 + 99) = 0;
  *(undefined8 *)(puVar4 + 0x5b) = 0;
  lVar5 = FUN_008b7610(param_1,(ulong)param_6 << 4);
  *(long *)(puVar4 + 0x28) = lVar5;
  if (param_6 != 0) {
    uVar6 = (ulong)param_6;
    if (param_6 == 1) {
      uVar8 = 0;
    }
    else {
      uVar8 = uVar6 & 0xfffffffe;
      puVar9 = (undefined4 *)(lVar5 + 0x1c);
      uVar10 = uVar8;
      do {
        uVar10 = uVar10 - 2;
        puVar9[-4] = 0;
        *puVar9 = 0;
        puVar9 = puVar9 + 8;
      } while (uVar10 != 0);
      if (uVar8 == uVar6) goto LAB_008b2468;
    }
    lVar7 = uVar6 - uVar8;
    puVar9 = (undefined4 *)(lVar5 + uVar8 * 0x10 + 0xc);
    do {
      lVar7 = lVar7 + -1;
      *puVar9 = 0;
      puVar9 = puVar9 + 4;
    } while (lVar7 != 0);
  }
LAB_008b2468:
  *(int *)(puVar4 + 0x58) = param_5;
  *(uint *)(puVar4 + 0x5c) = param_6 + param_5;
  *(undefined8 *)(puVar4 + 0x38) = param_3;
  *(undefined8 *)(puVar4 + 0x40) = param_4;
  *(uint *)(puVar4 + 0x60) = param_7 & 0xff;
  *(uint *)(puVar4 + 100) = param_5 - (param_7 & 0xff);
  puVar4[0x68] = param_8;
  *(ulong *)(puVar4 + 0x30) = lVar5 + (ulong)(param_6 - param_8) * 0x10;
  FUN_008b24c4(param_1,puVar4,param_9);
  return puVar4;
}

