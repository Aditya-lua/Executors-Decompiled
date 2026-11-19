/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2d404
 */

int BN_GF2m_mod_exp(undefined8 param_1,undefined8 param_2,undefined8 param_3,BIGNUM *param_4,
                   undefined8 param_5)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  void *ptr;
  long lVar5;
  ulong *puVar6;
  int iVar7;
  ulong uVar8;
  ulong uVar9;
  
  iVar2 = BN_num_bits(param_4);
  ptr = CRYPTO_malloc((iVar2 + 1) * 4,"crypto/bn/bn_gf2m.c",0x39b);
  if (ptr == (void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_gf2m.c",0x39d,"BN_GF2m_mod_exp");
    ERR_set_error(3,0xc0100,0);
    return 0;
  }
  iVar3 = BN_is_zero(param_4);
  iVar4 = 0;
  if (iVar3 == 0) {
    iVar4 = param_4->top;
    if (iVar4 < 1) {
      iVar4 = 0;
      iVar3 = 0;
      if (-1 < iVar2) goto LAB_00a2d578;
    }
    else {
      puVar6 = param_4->d;
      iVar3 = 0;
      iVar7 = iVar4 << 6;
      lVar5 = (long)iVar4;
      do {
        uVar8 = puVar6[lVar5 + -1];
        if (uVar8 != 0) {
          uVar9 = 0x8000000000000000;
          iVar4 = -1;
          do {
            if ((uVar9 & uVar8) != 0) {
              if (iVar3 <= iVar2) {
                *(int *)((long)ptr + (long)iVar3 * 4) = iVar7 + iVar4;
              }
              iVar3 = iVar3 + 1;
            }
            iVar4 = iVar4 + -1;
            uVar9 = uVar9 >> 1;
          } while (iVar4 != -0x41);
        }
        iVar7 = iVar7 + -0x40;
        bVar1 = 1 < lVar5;
        lVar5 = lVar5 + -1;
      } while (bVar1);
      iVar4 = iVar3;
      if (iVar3 <= iVar2) {
LAB_00a2d578:
        *(undefined4 *)((long)ptr + (long)iVar3 * 4) = 0xffffffff;
        iVar4 = iVar3 + 1;
      }
    }
    if ((iVar4 != 0) && (iVar4 <= iVar2 + 1)) {
      iVar4 = BN_GF2m_mod_exp_arr(param_1,param_2,param_3,ptr,param_5);
      goto LAB_00a2d49c;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/bn/bn_gf2m.c",0x3a2,"BN_GF2m_mod_exp");
  ERR_set_error(3,0x6a,0);
LAB_00a2d49c:
  CRYPTO_free(ptr);
  return iVar4;
}

