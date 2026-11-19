/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2981c
 */

int BN_nist_mod_521(BIGNUM *r,BIGNUM *a,BIGNUM *p,BN_CTX *ctx)

{
  uint uVar1;
  ulong *puVar2;
  int iVar3;
  int iVar4;
  BIGNUM *pBVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong *puVar9;
  ulong *puVar10;
  ulong uVar11;
  ulong *rp;
  ulong *puVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong local_88 [7];
  ulong local_50;
  ulong local_48;
  
  iVar4 = a->top;
  puVar12 = a->d;
  iVar3 = BN_is_negative(a);
  if ((iVar3 != 0) || (iVar3 = BN_ucmp(a,(BIGNUM *)&PTR_LAB_00c5bf50), -1 < iVar3)) {
    iVar4 = BN_nnmod(r,a,(BIGNUM *)&PTR_DAT_00c5bed8,ctx);
    return iVar4;
  }
  iVar3 = BN_ucmp((BIGNUM *)&PTR_DAT_00c5bed8,a);
  if (iVar3 == 0) {
    BN_zero_ex(r);
    return 1;
  }
  if (0 < iVar3) {
    if (r == a) {
      return 1;
    }
    pBVar5 = BN_copy(r,a);
    return (uint)(pBVar5 != (BIGNUM *)0x0);
  }
  if (r == a) {
    rp = puVar12;
  }
  else {
    lVar6 = bn_wexpand(r,9);
    if (lVar6 == 0) {
      return 0;
    }
    rp = r->d;
    *rp = *puVar12;
    rp[1] = puVar12[1];
    rp[2] = puVar12[2];
    rp[3] = puVar12[3];
    rp[4] = puVar12[4];
    rp[5] = puVar12[5];
    rp[6] = puVar12[6];
    rp[7] = puVar12[7];
    rp[8] = puVar12[8];
  }
  uVar7 = 0;
  if (8 < iVar4) {
    uVar1 = iVar4 - 8;
    uVar7 = (ulong)uVar1;
    uVar8 = 0;
    if ((uVar1 < 4) ||
       ((local_88 < puVar12 + uVar7 + 8 && (uVar8 = 0, puVar12 + 8 < local_88 + uVar7)))) {
LAB_00a299c4:
      lVar6 = uVar7 - uVar8;
      puVar9 = local_88 + uVar8;
      puVar12 = puVar12 + uVar8 + 8;
      do {
        lVar6 = lVar6 + -1;
        *puVar9 = *puVar12;
        puVar9 = puVar9 + 1;
        puVar12 = puVar12 + 1;
      } while (lVar6 != 0);
    }
    else {
      uVar8 = uVar7 & 0xfffffffc;
      puVar9 = puVar12 + 10;
      puVar10 = local_88 + 2;
      uVar11 = uVar8;
      do {
        puVar2 = puVar9 + -1;
        uVar13 = puVar9[-2];
        uVar15 = puVar9[1];
        uVar14 = *puVar9;
        puVar9 = puVar9 + 4;
        uVar11 = uVar11 - 4;
        puVar10[-1] = *puVar2;
        puVar10[-2] = uVar13;
        puVar10[1] = uVar15;
        *puVar10 = uVar14;
        puVar10 = puVar10 + 4;
      } while (uVar11 != 0);
      if (uVar8 != uVar7) goto LAB_00a299c4;
    }
    if (8 < uVar1) goto LAB_00a29a14;
  }
  memset(local_88 + uVar7,0,(ulong)(8 - (int)uVar7) * 8 + 8);
LAB_00a29a14:
  local_88[0] = local_88[0] >> 9 | local_88[1] << 0x37;
  local_88[1] = local_88[1] >> 9 | local_88[2] << 0x37;
  local_88[2] = local_88[2] >> 9 | local_88[3] << 0x37;
  local_88[3] = local_88[3] >> 9 | local_88[4] << 0x37;
  local_88[4] = local_88[4] >> 9 | local_88[5] << 0x37;
  local_88[5] = local_88[5] >> 9 | local_88[6] << 0x37;
  local_88[6] = local_88[6] >> 9 | local_50 << 0x37;
  local_50 = local_50 >> 9 | local_48 << 0x37;
  local_48 = local_48 >> 9;
  rp[8] = rp[8] & 0x1ff;
  bn_add_words(rp,rp,local_88,9);
  uVar7 = bn_sub_words(local_88,rp,(ulong *)&DAT_00758ba0,9);
  puVar12 = local_88;
  if (uVar7 != 0) {
    puVar12 = rp;
  }
  *rp = *puVar12;
  rp[1] = puVar12[1];
  rp[2] = puVar12[2];
  rp[3] = puVar12[3];
  rp[4] = puVar12[4];
  rp[5] = puVar12[5];
  rp[6] = puVar12[6];
  rp[7] = puVar12[7];
  rp[8] = puVar12[8];
  r->top = 9;
  bn_correct_top(r);
  return 1;
}

