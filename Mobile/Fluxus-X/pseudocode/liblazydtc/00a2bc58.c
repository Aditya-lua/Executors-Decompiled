/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2bc58
 */

uint BN_GF2m_mod_mul_arr(undefined8 param_1,long *param_2,long *param_3,undefined8 param_4,
                        BN_CTX *param_5)

{
  ulong *puVar1;
  long lVar2;
  int iVar3;
  BIGNUM *pBVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong *puVar8;
  uint uVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  ulong local_90;
  ulong local_88;
  ulong uStack_80;
  ulong local_78;
  ulong uStack_70;
  ulong local_68;
  
  if (param_2 == param_3) {
    uVar9 = BN_GF2m_mod_sqr_arr(param_1,param_2,param_4,param_5);
    return uVar9;
  }
  BN_CTX_start(param_5);
  pBVar4 = BN_CTX_get(param_5);
  if (pBVar4 != (BIGNUM *)0x0) {
    lVar12 = param_2[1];
    lVar13 = param_3[1];
    iVar3 = (int)lVar12 + (int)lVar13 + 4;
    lVar5 = bn_wexpand(pBVar4,iVar3);
    if (lVar5 != 0) {
      pBVar4->top = iVar3;
      if (0 < iVar3) {
        memset(pBVar4->d,0,(ulong)((int)lVar12 + (int)lVar13 + 3) * 8 + 8);
      }
      uVar6 = (ulong)*(uint *)(param_3 + 1);
      if (0 < (int)*(uint *)(param_3 + 1)) {
        lVar12 = 0;
        uVar7 = 0;
        do {
          uVar10 = 0;
          uVar14 = *(ulong *)(*param_3 + uVar7 * 8);
          if ((uVar7 | 1) != uVar6) {
            uVar10 = *(ulong *)(*param_3 + (uVar7 | 1) * 8);
          }
          uVar9 = *(uint *)(param_2 + 1);
          if (0 < (int)uVar9) {
            lVar13 = 0;
            lVar5 = 0x18;
            do {
              uVar11 = 0;
              uVar6 = *(ulong *)(*param_2 + lVar13 * 8);
              if (lVar13 + 1U != (ulong)uVar9) {
                uVar11 = *(ulong *)(*param_2 + lVar13 * 8 + 8);
              }
              FUN_00a2e40c(&local_78,&uStack_80,uVar11,uVar10);
              FUN_00a2e40c(&local_88,&local_90,uVar6,uVar14);
              FUN_00a2e40c(&local_68,&uStack_70,uVar11 ^ uVar6,uVar10 ^ uVar14);
              local_88 = uStack_80 ^ local_88;
              uStack_80 = local_88 ^ local_68 ^ local_78;
              local_88 = local_88 ^ local_90 ^ uStack_70;
              puVar8 = pBVar4->d;
              puVar1 = (ulong *)((long)puVar8 + lVar5 + lVar12);
              lVar2 = lVar13 * 8 + lVar12;
              lVar13 = lVar13 + 2;
              lVar5 = lVar5 + 0x10;
              puVar1[-3] = puVar1[-3] ^ local_90;
              *(ulong *)((long)puVar8 + lVar2 + 8) = *(ulong *)((long)puVar8 + lVar2 + 8) ^ local_88
              ;
              *(ulong *)((long)puVar8 + lVar2 + 0x10) =
                   *(ulong *)((long)puVar8 + lVar2 + 0x10) ^ uStack_80;
              *puVar1 = *puVar1 ^ local_78;
              uVar9 = *(uint *)(param_2 + 1);
            } while ((int)lVar13 < (int)uVar9);
            uVar6 = (ulong)*(uint *)(param_3 + 1);
          }
          uVar7 = uVar7 + 2;
          lVar12 = lVar12 + 0x10;
        } while ((int)uVar7 < (int)uVar6);
      }
      bn_correct_top(pBVar4);
      iVar3 = BN_GF2m_mod_arr(param_1,pBVar4,param_4);
      uVar9 = (uint)(iVar3 != 0);
      goto LAB_00a2be94;
    }
  }
  uVar9 = 0;
LAB_00a2be94:
  BN_CTX_end(param_5);
  return uVar9;
}

