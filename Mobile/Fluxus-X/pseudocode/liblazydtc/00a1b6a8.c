/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1b6a8
 */

/* WARNING: Type propagation algorithm not settling */

int BN_mod_exp_mont_word(BIGNUM *r,ulong a,BIGNUM *p,BIGNUM *m,BN_CTX *ctx,BN_MONT_CTX *m_ctx)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  BIGNUM *a_00;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong w;
  BIGNUM *pBVar7;
  BN_MONT_CTX *local_78;
  BIGNUM *local_70;
  int local_64;
  
  iVar3 = BN_get_flags(p,4);
  if ((iVar3 != 0) || (iVar3 = BN_get_flags(m,4), iVar3 != 0)) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_exp.c",0x4a8,"BN_mod_exp_mont_word");
    uVar4 = 0xc0101;
LAB_00a1b728:
    ERR_set_error(3,uVar4,0);
    return 0;
  }
  iVar3 = BN_is_odd(m);
  if (iVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_exp.c",0x4b0,"BN_mod_exp_mont_word");
    uVar4 = 0x66;
    goto LAB_00a1b728;
  }
  if (m->top == 1) {
    uVar5 = *m->d;
    uVar6 = 0;
    if (uVar5 != 0) {
      uVar6 = a / uVar5;
    }
    a = a - uVar6 * uVar5;
  }
  local_64 = BN_num_bits(p);
  if (local_64 == 0) {
    iVar3 = BN_abs_is_word(m,1);
    if (iVar3 == 0) {
      iVar3 = BN_set_word(r,1);
      return iVar3;
    }
LAB_00a1b990:
    BN_zero_ex(r);
    return 1;
  }
  if (a == 0) goto LAB_00a1b990;
  BN_CTX_start(ctx);
  a_00 = BN_CTX_get(ctx);
  local_70 = BN_CTX_get(ctx);
  if (local_70 == (BIGNUM *)0x0) {
    local_78 = (BN_MONT_CTX *)0x0;
joined_r0x00a1b9a8:
    iVar3 = 0;
joined_r0x00a1bad4:
    if (m_ctx != (BN_MONT_CTX *)0x0) goto LAB_00a1bae0;
  }
  else {
    local_78 = m_ctx;
    if (m_ctx != (BN_MONT_CTX *)0x0) {
LAB_00a1b7c0:
      uVar6 = a;
      if (local_64 < 2) {
        bVar1 = true;
      }
      else {
        local_64 = local_64 + -1;
        bVar1 = true;
        do {
          w = uVar6 * uVar6;
          uVar5 = 0;
          if (uVar6 != 0) {
            uVar5 = w / uVar6;
          }
          pBVar7 = local_70;
          if (uVar5 == uVar6) {
            if (!bVar1) {
              local_70 = a_00;
              goto LAB_00a1b864;
            }
            bVar2 = true;
          }
          else {
            if (bVar1) {
              iVar3 = BN_set_word(a_00,uVar6);
              if ((iVar3 == 0) || (iVar3 = BN_to_montgomery(a_00,a_00,local_78,ctx), iVar3 == 0))
              goto joined_r0x00a1b9a8;
              local_70 = a_00;
            }
            else {
              iVar3 = BN_mul_word(a_00,uVar6);
              if ((iVar3 == 0) || (iVar3 = BN_div((BIGNUM *)0x0,local_70,a_00,m,ctx), iVar3 == 0))
              goto joined_r0x00a1b9a8;
              pBVar7 = a_00;
            }
            w = 1;
LAB_00a1b864:
            iVar3 = BN_mod_mul_montgomery(local_70,local_70,local_70,local_78,ctx);
            bVar2 = false;
            bVar1 = false;
            a_00 = local_70;
            local_70 = pBVar7;
            if (iVar3 == 0) goto LAB_00a1bacc;
          }
          local_64 = local_64 + -1;
          iVar3 = BN_is_bit_set(p,local_64);
          uVar6 = w;
          if (iVar3 == 0) {
LAB_00a1b8bc:
          }
          else {
            uVar6 = w * a;
            uVar5 = 0;
            if (a != 0) {
              uVar5 = uVar6 / a;
            }
            if (uVar5 == w) goto LAB_00a1b8bc;
            if (bVar2) {
              iVar3 = BN_set_word(a_00,w);
              if (iVar3 == 0) goto LAB_00a1bacc;
              iVar3 = BN_to_montgomery(a_00,a_00,local_78,ctx);
              bVar1 = false;
              pBVar7 = local_70;
            }
            else {
              iVar3 = BN_mul_word(a_00,w);
              if (iVar3 == 0) goto LAB_00a1bacc;
              iVar3 = BN_div((BIGNUM *)0x0,local_70,a_00,m,ctx);
              pBVar7 = a_00;
              a_00 = local_70;
            }
            local_70 = pBVar7;
            uVar6 = a;
            if (iVar3 == 0) goto LAB_00a1bacc;
          }
        } while (0 < local_64);
      }
      if (uVar6 == 1) {
        if (bVar1) {
          iVar3 = BN_set_word(r,1);
        }
        else {
LAB_00a1baa4:
          iVar3 = BN_from_montgomery(r,a_00,local_78,ctx);
        }
        if (iVar3 == 0) goto joined_r0x00a1b9a8;
        iVar3 = 1;
      }
      else {
        if (bVar1) {
          iVar3 = BN_set_word(a_00,uVar6);
          if (iVar3 != 0) {
            iVar3 = BN_to_montgomery(a_00,a_00,local_78,ctx);
            goto joined_r0x00a1baa0;
          }
        }
        else {
          iVar3 = BN_mul_word(a_00,uVar6);
          if (iVar3 != 0) {
            iVar3 = BN_div((BIGNUM *)0x0,local_70,a_00,m,ctx);
            a_00 = local_70;
joined_r0x00a1baa0:
            if (iVar3 != 0) goto LAB_00a1baa4;
          }
        }
LAB_00a1bacc:
        iVar3 = 0;
      }
      goto joined_r0x00a1bad4;
    }
    local_78 = BN_MONT_CTX_new();
    if (local_78 == (BN_MONT_CTX *)0x0) {
      iVar3 = 0;
      local_78 = (BN_MONT_CTX *)0x0;
    }
    else {
      iVar3 = BN_MONT_CTX_set(local_78,m,ctx);
      if (iVar3 != 0) goto LAB_00a1b7c0;
      iVar3 = 0;
    }
  }
  BN_MONT_CTX_free(local_78);
LAB_00a1bae0:
  BN_CTX_end(ctx);
  return iVar3;
}

