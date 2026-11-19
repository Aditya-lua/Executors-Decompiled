/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091cdf8
 */

undefined8 FUN_0091cdf8(long param_1,long param_2)

{
  uint *puVar1;
  uint uVar2;
  char *pcVar3;
  ulong uVar4;
  uint uVar5;
  int iVar6;
  uint uVar7;
  
  uVar2 = *(uint *)(param_1 + 0x120);
  if ((uVar2 & 0xfffffffe) != 10) {
    uVar4 = (ulong)(uint)((int)uVar2 / 10);
    uVar7 = (int)uVar2 % 10;
    pcVar3 = "Unsupported HTTP version (%u.%d) in response";
LAB_0091cf38:
    FUN_00904b80(param_1,pcVar3,uVar4,uVar7);
    return 1;
  }
  uVar5 = (uint)*(byte *)(param_2 + 0x574);
  if (uVar5 != 0) {
    uVar7 = (int)uVar2 / 10;
    uVar4 = (ulong)uVar5 / 10;
    if (uVar7 != uVar5 / 10) {
      pcVar3 = "Version mismatch (from HTTP/%u to HTTP/%u)";
      goto LAB_0091cf38;
    }
  }
  iVar6 = *(int *)(param_1 + 0x124);
  *(uint *)(param_1 + 0x1330) = uVar2;
  *(int *)(param_1 + 0x1328) = iVar6;
  *(byte *)(param_2 + 0x574) = (byte)uVar2;
  uVar7 = (uint)*(byte *)(param_1 + 0x1319);
  if ((uVar7 == 0) || ((int)uVar2 < (int)uVar7)) {
    *(byte *)(param_1 + 0x1319) = (byte)uVar2;
  }
  if (((*(long *)(param_1 + 0x1118) != 0) && (iVar6 == 0x1a0)) &&
     (*(char *)(param_1 + 0x131a) == '\0')) {
    *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) | 0x200;
  }
  if (uVar2 != 0x14) {
    if (uVar2 == 10) {
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"HTTP 1.0, assume close after body");
      }
      FUN_00908c4c(param_2,1);
      iVar6 = *(int *)(param_1 + 0x124);
      goto LAB_0091cf64;
    }
    if ((iVar6 != 0x65) || (*(int *)(param_1 + 300) != 2)) goto LAB_0091cf64;
  }
  **(undefined4 **)(param_2 + 0x540) = 2;
LAB_0091cf64:
  puVar1 = (uint *)(param_1 + 0x1b1);
  uVar7 = *puVar1;
  uVar2 = (uint)(iVar6 < 200) << 10;
  if (iVar6 < 100) {
    uVar2 = 0;
  }
  *puVar1 = uVar2 | uVar7 & 0xfffffbff;
  if (iVar6 != 0xcc) {
    if (iVar6 != 0x130) {
      return 0;
    }
    if (*(char *)(param_1 + 0x528) != '\0') {
      *(byte *)(param_1 + 0x140c) = *(byte *)(param_1 + 0x140c) | 1;
    }
  }
  *(undefined8 *)(param_1 + 0xd8) = 0;
  *(undefined8 *)(param_1 + 0xe0) = 0;
  *puVar1 = uVar7 | 0x400;
  return 0;
}

