/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d0938
 */

undefined8 tls_parse_extension(int *param_1,uint param_2,uint param_3,long param_4)

{
  undefined **ppuVar1;
  uint uVar2;
  int iVar3;
  bool bVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  int *piVar8;
  
  puVar6 = (undefined8 *)(param_4 + (ulong)param_2 * 0x28);
  if (*(int *)(puVar6 + 2) == 0) {
    return 1;
  }
  uVar7 = (ulong)param_2;
  piVar8 = (int *)(param_4 + uVar7 * 0x28 + 0x14);
  if (*piVar8 != 0) {
    return 1;
  }
  *piVar8 = 1;
  if (0x19 < param_2) goto LAB_009d0a80;
  uVar2 = *(uint *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60);
  if ((param_3 >> 0xb & 1) == 0) {
    bVar4 = false;
    if ((uVar2 >> 3 & 1) != 0) goto LAB_009d09bc;
    iVar3 = **(int **)(param_1 + 2);
    bVar4 = false;
    if (0x303 < iVar3) {
      bVar4 = iVar3 != 0x10000;
    }
  }
  else {
    bVar4 = true;
LAB_009d09bc:
    if (((0x1e1ffffUL >> (uVar7 & 0x3f) & 1) == 0) && ((uVar2 >> 3 & 1) != 0)) {
      return 1;
    }
  }
  if ((((((param_2 != 0) && (*param_1 == 0x300)) ||
        (((0x3dfd6a6U >> (uVar7 & 0x3f) & 1) == 0 && (bVar4)))) ||
       (((uVar2 = 0x1237fff >> (uVar7 & 0x3f), (param_3 >> 7 & 1) == 0 && ((uVar2 & 1) == 0)) &&
        (!bVar4)))) || ((((uVar2 & 1) == 0 && (!bVar4)) && (param_1[0xe] != 0)))) ||
     ((((uint)(&DAT_00c581ec)[uVar7 * 0xe] >> 6 ^ 0xffffffff) & 1) == 0 && param_1[0x134] != 0)) {
    return 1;
  }
  ppuVar1 = &PTR_tls_parse_stoc_renegotiate_00c58200 + uVar7 * 7;
  if (param_1[0xe] != 0) {
    ppuVar1 = &PTR_tls_parse_ctos_renegotiate_00c581f8 + uVar7 * 7;
  }
  if ((code *)*ppuVar1 != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x009d0a7c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar5 = (*(code *)*ppuVar1)();
    return uVar5;
  }
LAB_009d0a80:
  param_4 = param_4 + uVar7 * 0x28;
  uVar5 = custom_ext_parse(param_1,param_3,*(undefined4 *)(param_4 + 0x18),*puVar6,
                           *(undefined8 *)(param_4 + 8));
  return uVar5;
}

