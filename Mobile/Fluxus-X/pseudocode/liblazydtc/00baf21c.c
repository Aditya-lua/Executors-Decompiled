/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baf21c
 */

undefined8 mbedtls_sha3_finish(long param_1,undefined1 *param_2,ulong param_3)

{
  bool bVar1;
  ushort uVar2;
  int iVar3;
  uint uVar4;
  uint uVar5;
  undefined8 uVar6;
  ulong uVar7;
  long lVar8;
  
  uVar7 = (ulong)*(ushort *)(param_1 + 0xcc);
  if ((uVar7 == 0) || (bVar1 = uVar7 <= param_3, param_3 = uVar7, bVar1)) {
    uVar7 = (ulong)*(uint *)(param_1 + 200) & 0xfffffff8;
    *(ulong *)(param_1 + uVar7) =
         6L << ((*(uint *)(param_1 + 200) & 7) << 3) ^ *(ulong *)(param_1 + uVar7);
    uVar5 = (int)(*(ushort *)(param_1 + 0xce) - 1) >> 3;
    uVar7 = -(ulong)(uVar5 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar5 << 3;
    *(ulong *)(param_1 + uVar7) =
         0x80L << ((uint)*(ushort *)(param_1 + 0xce) * 8 + 0x38 & 0x38) ^
         *(ulong *)(param_1 + uVar7);
    FUN_00baee68(param_1);
    *(undefined4 *)(param_1 + 200) = 0;
    if (param_3 != 0) {
      uVar5 = 0;
      lVar8 = -param_3;
      while( true ) {
        lVar8 = lVar8 + 1;
        *param_2 = (char)(*(ulong *)(param_1 + (ulong)(uVar5 & 0xfffffff8)) >> ((uVar5 & 7) << 3));
        uVar2 = *(ushort *)(param_1 + 0xce);
        uVar5 = *(int *)(param_1 + 200) + 1;
        uVar4 = 0;
        if (uVar2 != 0) {
          uVar4 = uVar5 / uVar2;
        }
        iVar3 = uVar5 - uVar4 * uVar2;
        *(int *)(param_1 + 200) = iVar3;
        if (iVar3 == 0) {
          FUN_00baee68(param_1);
        }
        if (lVar8 == 0) break;
        uVar5 = *(uint *)(param_1 + 200);
        param_2 = param_2 + 1;
      }
    }
    uVar6 = 0;
  }
  else {
    uVar6 = 0xffffff8a;
  }
  mbedtls_platform_zeroize(param_1,0xd0);
  return uVar6;
}

