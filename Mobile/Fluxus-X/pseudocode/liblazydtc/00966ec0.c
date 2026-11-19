/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00966ec0
 */

undefined8 FUN_00966ec0(long param_1,undefined8 param_2,uint *param_3)

{
  byte bVar1;
  ushort uVar2;
  uint uVar3;
  long *plVar4;
  ulong uVar5;
  long lVar6;
  undefined8 uVar7;
  
  plVar4 = (long *)FUN_009252a8(param_2);
  uVar5 = FUN_009252b0(param_2);
  *param_3 = 0;
  if (((uVar5 < 0x20) || (*plVar4 != 0x5053534d4c544e)) || ((int)plVar4[1] != 2)) {
    if (((param_1 == 0) || ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0)) ||
       ((*(long *)(param_1 + 0x12a0) != 0 && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1)))) {
      return 0x3d;
    }
    FUN_00904c98(param_1,"NTLM handshake failure (bad type-2 message)");
    return 0x3d;
  }
  uVar3 = FUN_0095a724((long)plVar4 + 0x14);
  *param_3 = uVar3;
  *(long *)(param_3 + 1) = plVar4[3];
  if ((uVar3 >> 0x17 & 1) == 0) {
    return 0;
  }
  lVar6 = FUN_009252a8(param_2);
  uVar5 = FUN_009252b0(param_2);
  uVar2 = 0;
  if (uVar5 < 0x30) {
LAB_00967070:
    param_3[3] = (uint)uVar2;
    return 0;
  }
  uVar2 = FUN_0095a71c(lVar6 + 0x28);
  uVar3 = FUN_0095a724(lVar6 + 0x2c);
  if (uVar2 == 0) {
    uVar2 = 0;
    goto LAB_00967070;
  }
  if (((uVar5 < uVar3) || (uVar3 < 0x30)) || (uVar5 < uVar3 + uVar2)) {
    if (param_1 == 0) {
      return 0x3d;
    }
    if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
      if ((*(long *)(param_1 + 0x12a0) != 0) && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1)) {
        uVar7 = 0x3d;
        goto LAB_00967084;
      }
      FUN_00904c98(param_1,
                   "NTLM handshake failure (bad type-2 message). Target Info Offset Len is set incorrect by the peer"
                  );
    }
    uVar7 = 0x3d;
    bVar1 = *(byte *)(param_1 + 0xa85);
  }
  else {
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_3 + 4));
    lVar6 = FUN_009418f0(lVar6 + (ulong)uVar3,uVar2);
    *(long *)(param_3 + 4) = lVar6;
    if (lVar6 != 0) goto LAB_00967070;
    uVar7 = 0x1b;
    if (param_1 == 0) {
      return 0x1b;
    }
LAB_00967084:
    bVar1 = *(byte *)(param_1 + 0xa85);
  }
  if ((bVar1 >> 4 & 1) == 0) {
    return uVar7;
  }
  if ((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) {
    FUN_00904c98(param_1,"NTLM handshake failure (bad type-2 message)");
    return uVar7;
  }
  return uVar7;
}

