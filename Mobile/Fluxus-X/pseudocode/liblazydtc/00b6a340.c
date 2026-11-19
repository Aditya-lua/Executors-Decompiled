/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6a340
 */

ulong mbedtls_cipher_finish(long *param_1,undefined8 param_2,ulong *param_3)

{
  uint uVar1;
  ulong uVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  ulong uVar6;
  
  lVar5 = *param_1;
  if (lVar5 == 0) {
    return 0xffff9f00;
  }
  *param_3 = 0;
  uVar4 = *(uint *)(lVar5 + 8);
  if (((uVar4 & 0xf000) == 0x2000) && (param_1[3] == 0)) {
    return 0xffff9f00;
  }
  uVar1 = (uVar4 >> 0xc) + 7;
  if (((~uVar1 & 0xf) != 0) && ((0x7c03U >> (ulong)(uVar1 & 0xf) & 1) != 0)) {
    return 0;
  }
  if ((uVar4 & 0xfe0000) == 0x4c0000) {
    return 0;
  }
  uVar1 = uVar4 >> 0xc & 0xf;
  if (uVar1 == 2) {
    iVar3 = *(int *)((long)param_1 + 0xc);
    if (iVar3 != 1) {
      uVar6 = (ulong)(uVar4 & 0x1f);
      if (param_1[6] == uVar6) goto LAB_00b6a468;
      uVar6 = param_1[6] | param_1[2];
      goto LAB_00b6a3d0;
    }
    if ((code *)param_1[2] != (code *)0x0) {
      uVar4 = uVar4 >> 3 & 0x1c;
      if (param_1[9] != 0) {
        uVar4 = (uint)param_1[9];
      }
      (*(code *)param_1[2])(param_1 + 4,(long)(int)uVar4,param_1[6]);
      lVar5 = *param_1;
      iVar3 = *(int *)((long)param_1 + 0xc);
      uVar4 = *(uint *)(lVar5 + 8);
      uVar6 = (ulong)uVar4 & 0x1f;
LAB_00b6a468:
      uVar2 = 0;
      if (lVar5 != 0) {
        uVar2 = uVar6;
      }
      uVar6 = (**(code **)((&mbedtls_cipher_base_lookup_table)[uVar4 >> 0x1a & 0x1f] + 0x10))
                        (param_1[10],iVar3,uVar2,param_1 + 7,param_1 + 4,param_2);
      if ((int)uVar6 != 0) {
        return uVar6;
      }
      if (*(int *)((long)param_1 + 0xc) != 0) {
        uVar6 = 0;
        if (*param_1 != 0) {
          uVar6 = (ulong)*(uint *)(*param_1 + 8) & 0x1f;
        }
        *param_3 = uVar6;
        return 0;
      }
      if (*param_1 == 0) {
        uVar4 = 0;
      }
      else {
        uVar4 = *(uint *)(*param_1 + 8) & 0x1f;
      }
                    /* WARNING: Could not recover jumptable at 0x00b6a4fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar6 = (*(code *)param_1[3])(param_2,uVar4,param_3);
      return uVar6;
    }
  }
  else if (uVar1 != 1) {
    return 0xffff9f80;
  }
  uVar6 = param_1[6];
LAB_00b6a3d0:
  uVar4 = 0;
  if (uVar6 != 0) {
    uVar4 = 0xffff9d80;
  }
  return (ulong)uVar4;
}

