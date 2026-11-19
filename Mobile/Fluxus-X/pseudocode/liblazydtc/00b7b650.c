/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b650
 */

undefined8 mbedtls_poly1305_finish(long param_1,undefined4 *param_2)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  uint uVar6;
  int iVar7;
  uint uVar8;
  uint uVar9;
  long lVar10;
  
  if (*(long *)(param_1 + 0x48) != 0) {
    lVar1 = param_1 + 0x34;
    *(undefined1 *)(lVar1 + *(long *)(param_1 + 0x48)) = 1;
    lVar10 = *(long *)(param_1 + 0x48);
    lVar2 = lVar10 + 1;
    *(long *)(param_1 + 0x48) = lVar2;
    memset((void *)(lVar1 + lVar2),0,0xf - lVar10);
    FUN_00b7b534(param_1,1,lVar1,0);
  }
  uVar6 = *(uint *)(param_1 + 0x2c);
  uVar3 = (ulong)*(uint *)(param_1 + 0x20) + 5;
  uVar4 = (ulong)*(uint *)(param_1 + 0x24) + (uVar3 >> 0x20);
  uVar5 = (ulong)*(uint *)(param_1 + 0x28) + (uVar4 >> 0x20);
  lVar1 = (ulong)uVar6 + (uVar5 >> 0x20);
  uVar8 = (uint)(*(int *)(param_1 + 0x30) + (int)((ulong)lVar1 >> 0x20)) >> 2;
  uVar9 = -uVar8;
  uVar8 = uVar8 - 1;
  iVar7 = *(int *)(param_1 + 0x1c);
  uVar3 = (ulong)(uVar8 & *(uint *)(param_1 + 0x20) | uVar9 & (uint)uVar3) +
          (ulong)*(uint *)(param_1 + 0x10);
  uVar4 = (ulong)(uVar8 & *(uint *)(param_1 + 0x24) | uVar9 & (uint)uVar4) +
          (ulong)*(uint *)(param_1 + 0x14) + (uVar3 >> 0x20);
  lVar2 = (ulong)(uVar8 & *(uint *)(param_1 + 0x28) | uVar9 & (uint)uVar5) +
          (ulong)*(uint *)(param_1 + 0x18) + (uVar4 >> 0x20);
  *param_2 = (int)uVar3;
  param_2[1] = (int)uVar4;
  param_2[2] = (int)lVar2;
  param_2[3] = (uVar8 & uVar6 | uVar9 & (uint)lVar1) + iVar7 + (int)((ulong)lVar2 >> 0x20);
  return 0;
}

