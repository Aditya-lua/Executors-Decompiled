/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a289c0
 */

int BN_nist_mod_192(BIGNUM *r,BIGNUM *a,BIGNUM *p,BN_CTX *ctx)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  BIGNUM *pBVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong *rp;
  ulong uVar9;
  ulong *puVar10;
  ulong local_70;
  ulong local_68;
  ulong local_60;
  ulong local_58 [3];
  
  iVar4 = a->top;
  puVar10 = a->d;
  iVar3 = BN_is_negative(a);
  if ((iVar3 != 0) || (iVar3 = BN_ucmp(a,(BIGNUM *)&PTR_LAB_00c5bef0), -1 < iVar3)) {
    iVar4 = BN_nnmod(r,a,(BIGNUM *)&PTR_DAT_00c5be78,ctx);
    return iVar4;
  }
  iVar3 = BN_ucmp((BIGNUM *)&PTR_DAT_00c5be78,a);
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
    rp = puVar10;
  }
  else {
    lVar6 = bn_wexpand(r,3);
    if (lVar6 == 0) {
      return 0;
    }
    rp = r->d;
    *rp = *puVar10;
    rp[1] = puVar10[1];
    rp[2] = puVar10[2];
  }
  uVar9 = 0;
  if (3 < iVar4) {
    uVar1 = iVar4 - 3;
    uVar9 = (ulong)uVar1;
    memcpy(local_58,puVar10 + 3,uVar9 << 3);
    if (2 < uVar1) goto LAB_00a28b08;
  }
  memset(local_58 + uVar9,0,(ulong)(2 - (int)uVar9) * 8 + 8);
LAB_00a28b08:
  local_70 = local_58[0];
  local_68 = local_58[0];
  local_60 = 0;
  uVar9 = bn_add_words(rp,rp,&local_70,3);
  local_70 = 0;
  local_68 = local_58[1];
  local_60 = local_58[1];
  uVar7 = bn_add_words(rp,rp,&local_70,3);
  local_70 = local_58[2];
  local_68 = local_58[2];
  local_60 = local_58[2];
  uVar8 = bn_add_words(rp,rp,&local_70,3);
  iVar4 = (int)uVar7 + (int)uVar9 + (int)uVar8;
  if (iVar4 < 1) {
    bVar2 = true;
  }
  else {
    uVar9 = bn_sub_words(rp,rp,(ulong *)(&UNK_00758810 + (long)iVar4 * 0x18),3);
    bVar2 = (int)uVar9 != 0;
  }
  uVar9 = bn_sub_words(&local_70,rp,(ulong *)&DAT_00758828,3);
  puVar10 = rp;
  if (!(bool)(bVar2 & uVar9 != 0)) {
    puVar10 = &local_70;
  }
  *rp = *puVar10;
  rp[1] = puVar10[1];
  rp[2] = puVar10[2];
  r->top = 3;
  bn_correct_top(r);
  return 1;
}

