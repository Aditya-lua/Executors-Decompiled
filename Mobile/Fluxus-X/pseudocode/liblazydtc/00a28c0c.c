/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a28c0c
 */

int BN_nist_mod_224(BIGNUM *r,BIGNUM *a,BIGNUM *p,BN_CTX *ctx)

{
  ulong *puVar1;
  int iVar2;
  int iVar3;
  BIGNUM *pBVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong *puVar8;
  ulong *puVar9;
  ulong uVar10;
  ulong *rp;
  uint uVar11;
  ulong *puVar12;
  code *pcVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong local_90;
  ulong uStack_88;
  ulong local_80;
  ulong uStack_78;
  ulong local_70 [4];
  
  iVar3 = a->top;
  puVar12 = a->d;
  iVar2 = BN_is_negative(a);
  if ((iVar2 != 0) || (iVar2 = BN_ucmp(a,(BIGNUM *)&PTR_LAB_00c5bf08), -1 < iVar2)) {
    iVar3 = BN_nnmod(r,a,(BIGNUM *)&PTR_DAT_00c5be90,ctx);
    return iVar3;
  }
  iVar2 = BN_ucmp((BIGNUM *)&PTR_DAT_00c5be90,a);
  if (iVar2 == 0) {
    BN_zero_ex(r);
    return 1;
  }
  if (0 < iVar2) {
    if (r == a) {
      return 1;
    }
    pBVar4 = BN_copy(r,a);
    return (uint)(pBVar4 != (BIGNUM *)0x0);
  }
  if (r == a) {
    rp = puVar12;
  }
  else {
    lVar5 = bn_wexpand(r,4);
    if (lVar5 == 0) {
      return 0;
    }
    rp = r->d;
    *rp = *puVar12;
    rp[1] = puVar12[1];
    rp[2] = puVar12[2];
    rp[3] = puVar12[3];
  }
  uVar6 = 0;
  if (3 < iVar3) {
    uVar11 = iVar3 - 3;
    uVar6 = (ulong)uVar11;
    uVar7 = 0;
    if ((uVar11 < 4) ||
       ((local_70 < puVar12 + uVar6 + 3 && (uVar7 = 0, puVar12 + 3 < local_70 + uVar6)))) {
LAB_00a28d94:
      lVar5 = uVar6 - uVar7;
      puVar8 = local_70 + uVar7;
      puVar12 = puVar12 + uVar7 + 3;
      do {
        lVar5 = lVar5 + -1;
        *puVar8 = *puVar12;
        puVar8 = puVar8 + 1;
        puVar12 = puVar12 + 1;
      } while (lVar5 != 0);
    }
    else {
      uVar7 = uVar6 & 0xfffffffc;
      puVar8 = puVar12 + 5;
      puVar9 = local_70 + 2;
      uVar10 = uVar7;
      do {
        puVar1 = puVar8 + -1;
        uVar14 = puVar8[-2];
        uVar16 = puVar8[1];
        uVar15 = *puVar8;
        puVar8 = puVar8 + 4;
        uVar10 = uVar10 - 4;
        puVar9[-1] = *puVar1;
        puVar9[-2] = uVar14;
        puVar9[1] = uVar16;
        *puVar9 = uVar15;
        puVar9 = puVar9 + 4;
      } while (uVar10 != 0);
      if (uVar7 != uVar6) goto LAB_00a28d94;
    }
    if (3 < uVar11) goto LAB_00a28de4;
  }
  memset(local_70 + uVar6,0,(ulong)(3 - (int)uVar6) * 8 + 8);
LAB_00a28de4:
  uStack_78 = local_70[2] & 0xffffffff;
  rp[3] = (ulong)(uint)rp[3];
  uStack_88 = local_70[0] & 0xffffffff00000000;
  local_90 = 0;
  local_80 = local_70[1];
  bn_add_words(rp,rp,&local_90,4);
  uStack_88 = local_70[2] & 0xffffffff00000000;
  local_90 = 0;
  local_80 = local_70[3];
  uStack_78 = 0;
  bn_add_words(rp,rp,&local_90,4);
  local_90 = local_70[0] >> 0x20 | local_70[1] << 0x20;
  uStack_88 = local_70[1] >> 0x20 | local_70[2] << 0x20;
  uVar6 = local_70[2] >> 0x20 | local_70[3] << 0x20;
  local_80 = uVar6;
  uStack_78 = local_70[3] >> 0x20;
  bn_sub_words(rp,rp,&local_90,4);
  local_80 = 0;
  uStack_78 = 0;
  local_90 = uVar6;
  uStack_88 = local_70[3] >> 0x20;
  bn_sub_words(rp,rp,&local_90,4);
  uVar6 = rp[3];
  if ((int)(uVar6 >> 0x20) < 1) {
    if ((long)uVar6 < 0) {
      uVar6 = bn_add_words(rp,rp,(ulong *)(&DAT_007588a8 +
                                          ((long)(~uVar6 & 0xffffffff00000000) >> 0x1b)),4);
      uVar11 = (uint)uVar6;
      pcVar13 = bn_add_words;
      if (uVar11 != 0) {
        pcVar13 = bn_sub_words;
      }
    }
    else {
      uVar11 = 1;
      pcVar13 = bn_sub_words;
    }
  }
  else {
    bn_sub_words(rp,rp,(ulong *)(&DAT_007588a8 + ((long)(uVar6 - 0x100000000) >> 0x20) * 0x20),4);
    uVar11 = ~*(uint *)((long)rp + 0x1c) & 1;
    pcVar13 = bn_sub_words;
  }
  lVar5 = (*pcVar13)(local_70,rp,&DAT_007588a8,4);
  puVar12 = rp;
  if (lVar5 == 0 || uVar11 == 0) {
    puVar12 = local_70;
  }
  *rp = *puVar12;
  rp[1] = puVar12[1];
  rp[2] = puVar12[2];
  rp[3] = puVar12[3];
  r->top = 4;
  bn_correct_top(r);
  return 1;
}

