/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baeccc
 */

undefined8 mbedtls_sha3_update(long param_1,byte *param_2,ulong param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  ushort uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  byte *pbVar8;
  ulong uVar9;
  ulong uVar10;
  
  if (7 < param_3) {
    uVar5 = *(uint *)(param_1 + 200);
    uVar1 = uVar5 & 7;
    if (uVar1 != 8) {
      uVar6 = uVar5 << 3;
      iVar7 = 9 - uVar1;
      pbVar8 = param_2;
      do {
        uVar2 = uVar5 & 0xfffffff8;
        uVar3 = uVar6 & 0x38;
        iVar7 = iVar7 + -1;
        uVar5 = uVar5 + 1;
        uVar6 = uVar6 + 8;
        *(ulong *)(param_1 + (ulong)uVar2) =
             (ulong)*pbVar8 << uVar3 ^ *(ulong *)(param_1 + (ulong)uVar2);
        *(uint *)(param_1 + 200) = uVar5;
        pbVar8 = pbVar8 + 1;
      } while (1 < iVar7);
      uVar4 = *(ushort *)(param_1 + 0xce);
      param_3 = (param_3 - 1) - (ulong)(uVar1 ^ 7);
      param_2 = param_2 + (ulong)(uVar1 ^ 7) + 1;
      uVar1 = 0;
      if (uVar4 != 0) {
        uVar1 = uVar5 / uVar4;
      }
      iVar7 = uVar5 - uVar1 * uVar4;
      *(int *)(param_1 + 200) = iVar7;
      if (iVar7 == 0) {
        FUN_00baee68(param_1);
      }
      if (param_3 < 8) goto joined_r0x00baedfc;
    }
    uVar9 = param_3 - 8;
    uVar10 = uVar9 & 0xfffffffffffffff8;
    pbVar8 = param_2;
    do {
      while( true ) {
        uVar5 = *(uint *)(param_1 + 200);
        param_3 = param_3 - 8;
        *(ulong *)(param_1 + ((ulong)uVar5 & 0xfffffff8)) =
             *(long *)pbVar8 << ((uVar5 & 7) << 3) ^
             *(ulong *)(param_1 + ((ulong)uVar5 & 0xfffffff8));
        uVar4 = *(ushort *)(param_1 + 0xce);
        uVar1 = 0;
        if (uVar4 != 0) {
          uVar1 = (uVar5 + 8) / (uint)uVar4;
        }
        iVar7 = (uVar5 + 8) - uVar1 * uVar4;
        *(int *)(param_1 + 200) = iVar7;
        if (iVar7 == 0) break;
        pbVar8 = pbVar8 + 8;
        if (param_3 < 8) goto LAB_00baedf8;
      }
      FUN_00baee68(param_1);
      pbVar8 = pbVar8 + 8;
    } while (7 < param_3);
LAB_00baedf8:
    param_3 = uVar9 - uVar10;
    param_2 = param_2 + uVar10 + 8;
  }
joined_r0x00baedfc:
  do {
    if (param_3 == 0) {
      return 0;
    }
    while( true ) {
      uVar5 = *(uint *)(param_1 + 200);
      param_3 = param_3 - 1;
      *(ulong *)(param_1 + ((ulong)uVar5 & 0xfffffff8)) =
           (ulong)*param_2 << ((uVar5 & 7) << 3) ^ *(ulong *)(param_1 + ((ulong)uVar5 & 0xfffffff8))
      ;
      uVar4 = *(ushort *)(param_1 + 0xce);
      uVar1 = 0;
      if (uVar4 != 0) {
        uVar1 = (uVar5 + 1) / (uint)uVar4;
      }
      iVar7 = (uVar5 + 1) - uVar1 * uVar4;
      *(int *)(param_1 + 200) = iVar7;
      if (iVar7 == 0) break;
      param_2 = param_2 + 1;
      if (param_3 == 0) {
        return 0;
      }
    }
    FUN_00baee68(param_1);
    param_2 = param_2 + 1;
  } while( true );
}

