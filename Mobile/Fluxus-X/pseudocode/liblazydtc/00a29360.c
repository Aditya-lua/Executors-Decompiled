/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a29360
 */

int BN_nist_mod_384(BIGNUM *r,BIGNUM *a,BIGNUM *p,BN_CTX *ctx)

{
  uint uVar1;
  ulong *puVar2;
  int iVar3;
  int iVar4;
  BIGNUM *pBVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong *puVar16;
  ulong *puVar17;
  ulong *rp;
  ulong *puVar18;
  code *pcVar19;
  ulong local_a0;
  ulong uStack_98;
  ulong local_90;
  ulong uStack_88;
  ulong local_80;
  ulong uStack_78;
  ulong local_70 [6];
  
  iVar4 = a->top;
  puVar18 = a->d;
  iVar3 = BN_is_negative(a);
  if ((iVar3 != 0) || (iVar3 = BN_ucmp(a,(BIGNUM *)&PTR_LAB_00c5bf38), -1 < iVar3)) {
    iVar4 = BN_nnmod(r,a,(BIGNUM *)&PTR_DAT_00c5bec0,ctx);
    return iVar4;
  }
  iVar3 = BN_ucmp((BIGNUM *)&PTR_DAT_00c5bec0,a);
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
    rp = puVar18;
  }
  else {
    lVar6 = bn_wexpand(r,6);
    if (lVar6 == 0) {
      return 0;
    }
    rp = r->d;
    *rp = *puVar18;
    rp[1] = puVar18[1];
    rp[2] = puVar18[2];
    rp[3] = puVar18[3];
    rp[4] = puVar18[4];
    rp[5] = puVar18[5];
  }
  uVar14 = 0;
  if (6 < iVar4) {
    uVar1 = iVar4 - 6;
    uVar14 = (ulong)uVar1;
    uVar15 = 0;
    if ((uVar1 < 4) ||
       ((local_70 < puVar18 + uVar14 + 6 && (uVar15 = 0, puVar18 + 6 < local_70 + uVar14)))) {
LAB_00a294f0:
      lVar6 = uVar14 - uVar15;
      puVar16 = local_70 + uVar15;
      puVar18 = puVar18 + uVar15 + 6;
      do {
        lVar6 = lVar6 + -1;
        *puVar16 = *puVar18;
        puVar16 = puVar16 + 1;
        puVar18 = puVar18 + 1;
      } while (lVar6 != 0);
    }
    else {
      uVar15 = uVar14 & 0xfffffffc;
      puVar16 = puVar18 + 8;
      puVar17 = local_70 + 2;
      uVar7 = uVar15;
      do {
        puVar2 = puVar16 + -1;
        uVar8 = puVar16[-2];
        uVar10 = puVar16[1];
        uVar9 = *puVar16;
        puVar16 = puVar16 + 4;
        uVar7 = uVar7 - 4;
        puVar17[-1] = *puVar2;
        puVar17[-2] = uVar8;
        puVar17[1] = uVar10;
        *puVar17 = uVar9;
        puVar17 = puVar17 + 4;
      } while (uVar7 != 0);
      if (uVar15 != uVar14) goto LAB_00a294f0;
    }
    if (5 < uVar1) goto LAB_00a29540;
  }
  memset(local_70 + uVar14,0,(ulong)(5 - (int)uVar14) * 8 + 8);
LAB_00a29540:
  uStack_98 = local_70[5] >> 0x1f;
  local_a0 = (local_70[4] >> 0x20 | local_70[5] << 0x20) << 1;
  uStack_88 = 0;
  local_90 = 0;
  uVar14 = bn_add_words(rp + 2,rp + 2,&local_a0,4);
  uVar15 = bn_add_words(rp,rp,local_70,6);
  local_a0 = local_70[4] >> 0x20 | local_70[5] << 0x20;
  uStack_98 = local_70[5] >> 0x20 | local_70[0] << 0x20;
  local_90 = local_70[0] >> 0x20 | local_70[1] << 0x20;
  uStack_88 = local_70[1] >> 0x20 | local_70[2] << 0x20;
  local_80 = local_70[2] >> 0x20 | local_70[3] << 0x20;
  uStack_78 = local_70[3] >> 0x20 | local_70[4] << 0x20;
  uVar7 = bn_add_words(rp,rp,&local_a0,6);
  local_a0 = local_70[5] & 0xffffffff00000000;
  uStack_98 = local_70[4] << 0x20;
  uStack_88 = local_70[1];
  local_90 = local_70[0];
  uStack_78 = local_70[3];
  local_80 = local_70[2];
  uVar8 = bn_add_words(rp,rp,&local_a0,6);
  uStack_98 = 0;
  local_a0 = 0;
  uStack_88 = local_70[5];
  local_90 = local_70[4];
  uStack_78 = 0;
  local_80 = 0;
  uVar9 = bn_add_words(rp,rp,&local_a0,6);
  local_a0 = local_70[4] & 0xffffffff;
  uStack_98 = local_70[4] & 0xffffffff00000000;
  local_90 = local_70[5];
  uStack_88 = 0;
  uStack_78 = 0;
  local_80 = 0;
  uVar10 = bn_add_words(rp,rp,&local_a0,6);
  local_a0 = local_70[5] >> 0x20 | local_70[0] << 0x20;
  uStack_98 = local_70[0] >> 0x20 | local_70[1] << 0x20;
  local_90 = local_70[1] >> 0x20 | local_70[2] << 0x20;
  uStack_88 = local_70[2] >> 0x20 | local_70[3] << 0x20;
  local_80 = local_70[3] >> 0x20 | local_70[4] << 0x20;
  uStack_78 = local_70[4] >> 0x20 | local_70[5] << 0x20;
  uVar11 = bn_sub_words(rp,rp,&local_a0,6);
  local_a0 = local_70[4] << 0x20;
  uStack_98 = local_70[4] >> 0x20 | local_70[5] << 0x20;
  local_90 = local_70[5] >> 0x20;
  uStack_88 = 0;
  uStack_78 = 0;
  local_80 = 0;
  uVar12 = bn_sub_words(rp,rp,&local_a0,6);
  uStack_98 = local_70[5] & 0xffffffff00000000;
  local_90 = local_70[5] >> 0x20;
  local_a0 = 0;
  uStack_88 = 0;
  uStack_78 = 0;
  local_80 = 0;
  uVar13 = bn_sub_words(rp,rp,&local_a0,6);
  uVar1 = ((((int)uVar15 + (int)uVar14 + (int)uVar7 + (int)uVar8 + (int)uVar9 + (int)uVar10) -
           (int)uVar11) - (int)uVar12) - (int)uVar13;
  if ((int)uVar1 < 1) {
    if ((int)uVar1 < 0) {
      uVar14 = bn_add_words(rp,rp,(ulong *)(&DAT_00758a28 + (long)(int)~uVar1 * 0x30),6);
      iVar4 = (int)uVar14;
      pcVar19 = bn_add_words;
      if (iVar4 != 0) {
        pcVar19 = bn_sub_words;
      }
    }
    else {
      iVar4 = 1;
      pcVar19 = bn_sub_words;
    }
  }
  else {
    uVar14 = bn_sub_words(rp,rp,(ulong *)(&UNK_007589f8 + (long)(int)uVar1 * 0x30),6);
    iVar4 = (int)uVar14;
    pcVar19 = bn_sub_words;
  }
  lVar6 = (*pcVar19)(&local_a0,rp,&DAT_00758a28,6);
  puVar18 = rp;
  if (lVar6 == 0 || iVar4 == 0) {
    puVar18 = &local_a0;
  }
  *rp = *puVar18;
  rp[1] = puVar18[1];
  rp[2] = puVar18[2];
  rp[3] = puVar18[3];
  rp[4] = puVar18[4];
  rp[5] = puVar18[5];
  r->top = 6;
  bn_correct_top(r);
  return 1;
}

