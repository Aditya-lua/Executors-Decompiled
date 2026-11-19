/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a28f7c
 */

int BN_nist_mod_256(BIGNUM *r,BIGNUM *a,BIGNUM *p,BN_CTX *ctx)

{
  uint uVar1;
  ulong uVar2;
  int iVar3;
  int iVar4;
  BIGNUM *pBVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong *rp;
  ulong uVar12;
  code *pcVar13;
  ulong *puVar14;
  ulong uVar15;
  ulong uVar16;
  ulong local_c0;
  ulong local_b8;
  ulong local_b0;
  ulong local_a8;
  ulong local_a0;
  long local_98;
  ulong local_90;
  ulong local_88;
  ulong local_80 [4];
  
  iVar4 = a->top;
  puVar14 = a->d;
  iVar3 = BN_is_negative(a);
  if ((iVar3 != 0) || (iVar3 = BN_ucmp(a,(BIGNUM *)&PTR_LAB_00c5bf20), -1 < iVar3)) {
    iVar4 = BN_nnmod(r,a,(BIGNUM *)&PTR_DAT_00c5bea8,ctx);
    return iVar4;
  }
  iVar3 = BN_ucmp((BIGNUM *)&PTR_DAT_00c5bea8,a);
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
    rp = puVar14;
  }
  else {
    lVar6 = bn_wexpand(r,4);
    if (lVar6 == 0) {
      return 0;
    }
    rp = r->d;
    *rp = *puVar14;
    rp[1] = puVar14[1];
    rp[2] = puVar14[2];
    rp[3] = puVar14[3];
  }
  uVar12 = 0;
  if (4 < iVar4) {
    uVar1 = iVar4 - 4;
    uVar12 = (ulong)uVar1;
    memcpy(local_80,puVar14 + 4,uVar12 << 3);
    if (3 < uVar1) goto LAB_00a290dc;
  }
  memset(local_80 + uVar12,0,(ulong)(3 - (int)uVar12) * 8 + 8);
LAB_00a290dc:
  local_b8 = local_80[1] & 0xffffffff00000000;
  uVar16 = local_80[2] >> 0x20 | local_80[3] << 0x20;
  local_b0 = local_80[2];
  local_88 = local_80[3] >> 0x20;
  local_a8 = local_80[3];
  local_a0 = 0;
  local_c0 = 0;
  local_98 = local_80[2] << 0x20;
  local_90 = uVar16;
  uVar7 = bn_add_words(&local_c0,&local_c0,&local_a0,4);
  uVar12 = local_c0 >> 0x3f;
  uVar8 = local_b8 >> 0x3f;
  uVar9 = local_b0 >> 0x3f;
  uVar2 = local_a8 >> 0x3f;
  local_c0 = local_c0 << 1;
  local_b8 = uVar12 | local_b8 << 1;
  local_b0 = uVar8 | local_b0 << 1;
  local_a8 = uVar9 | local_a8 << 1;
  uVar12 = bn_add_words(rp,rp,&local_c0,4);
  local_b8 = local_80[1] & 0xffffffff;
  local_c0 = local_80[0];
  local_b0 = 0;
  local_a8 = local_80[3];
  uVar8 = bn_add_words(rp,rp,&local_c0,4);
  uVar15 = local_80[0] >> 0x20 | local_80[1] << 0x20;
  local_a8 = local_80[2] >> 0x20 | local_80[0] << 0x20;
  local_b8 = local_80[2] & 0xffffffff00000000 | local_80[1] >> 0x20;
  local_b0 = local_80[3];
  local_c0 = uVar15;
  uVar9 = bn_add_words(rp,rp,&local_c0,4);
  local_c0 = local_80[1] >> 0x20 | local_80[2] << 0x20;
  local_a8 = local_80[0] & 0xffffffff | local_80[1] << 0x20;
  local_b0 = 0;
  local_b8 = local_80[2] >> 0x20;
  uVar10 = bn_sub_words(rp,rp,&local_c0,4);
  local_a8 = local_80[1] & 0xffffffff00000000 | local_80[0] >> 0x20;
  local_c0 = local_80[2];
  local_b8 = local_80[3];
  local_b0 = 0;
  uVar11 = bn_sub_words(rp,rp,&local_c0,4);
  local_b8 = local_80[3] >> 0x20 | local_80[0] << 0x20;
  local_c0 = uVar16;
  local_b0 = uVar15;
  local_a8 = local_80[2] << 0x20;
  uVar15 = bn_sub_words(rp,rp,&local_c0,4);
  local_b8 = local_80[0] & 0xffffffff00000000;
  local_c0 = local_80[3];
  local_b0 = local_80[1];
  local_a8 = local_80[2] & 0xffffffff00000000;
  uVar16 = bn_sub_words(rp,rp,&local_c0,4);
  uVar1 = ((((((uint)uVar2 | (int)uVar7 << 1) + (int)uVar12 + (int)uVar8 + (int)uVar9) - (int)uVar10
            ) - (int)uVar11) - (int)uVar15) - (int)uVar16;
  if ((int)uVar1 < 1) {
    if ((int)uVar1 < 0) {
      uVar12 = bn_add_words(rp,rp,(ulong *)(&DAT_00758928 + (long)(int)~uVar1 * 0x20),4);
      iVar4 = (int)uVar12;
      pcVar13 = bn_add_words;
      if (iVar4 != 0) {
        pcVar13 = bn_sub_words;
      }
    }
    else {
      iVar4 = 1;
      pcVar13 = bn_sub_words;
    }
  }
  else {
    uVar12 = bn_sub_words(rp,rp,(ulong *)(&UNK_00758908 + (long)(int)uVar1 * 0x20),4);
    iVar4 = (int)uVar12;
    pcVar13 = bn_sub_words;
  }
  lVar6 = (*pcVar13)(&local_a0,rp,&DAT_00758928,4);
  puVar14 = rp;
  if (lVar6 == 0 || iVar4 == 0) {
    puVar14 = &local_a0;
  }
  *rp = *puVar14;
  rp[1] = puVar14[1];
  rp[2] = puVar14[2];
  rp[3] = puVar14[3];
  r->top = 4;
  bn_correct_top(r);
  return 1;
}

