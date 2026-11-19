/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a38ad0
 */

/* WARNING: Type propagation algorithm not settling */

int BN_kronecker(BIGNUM *a,BIGNUM *b,BN_CTX *ctx)

{
  int iVar1;
  int iVar2;
  int iVar3;
  BIGNUM *a_00;
  BIGNUM *a_01;
  BIGNUM *pBVar4;
  ulong uVar5;
  uint uVar6;
  uint uVar7;
  
  BN_CTX_start(ctx);
  a_00 = BN_CTX_get(ctx);
  a_01 = BN_CTX_get(ctx);
  if (a_01 == (BIGNUM *)0x0) {
    iVar1 = -2;
  }
  else {
    pBVar4 = BN_copy(a_00,a);
    if ((pBVar4 == (BIGNUM *)0x0) || (pBVar4 = BN_copy(a_01,b), pBVar4 == (BIGNUM *)0x0)) {
LAB_00a38d3c:
      BN_CTX_end(ctx);
      return -2;
    }
    iVar1 = BN_is_zero(a_01);
    if (iVar1 == 0) {
      iVar1 = BN_is_odd(a_00);
      if ((iVar1 == 0) && (iVar1 = BN_is_odd(a_01), iVar1 == 0)) {
        iVar1 = 0;
      }
      else {
        uVar6 = 0xffffffff;
        do {
          uVar6 = uVar6 + 1;
          iVar1 = BN_is_bit_set(a_01,uVar6);
        } while (iVar1 == 0);
        iVar1 = BN_rshift(a_01,a_01,uVar6);
        if (iVar1 == 0) goto LAB_00a38d3c;
        if ((uVar6 & 1) == 0) {
          iVar3 = 1;
          iVar1 = a_01->neg;
        }
        else {
          if (a_00->top == 0) {
            uVar5 = 0;
          }
          else {
            uVar5 = *a_00->d & 7;
          }
          iVar3 = (&DAT_00364cd0)[uVar5];
          iVar1 = a_01->neg;
        }
        if (iVar1 != 0) {
          a_01->neg = 0;
          iVar1 = -iVar3;
          if (a_00->neg == 0) {
            iVar1 = iVar3;
          }
          iVar3 = iVar1;
        }
        iVar1 = BN_is_zero(a_00);
        pBVar4 = a_01;
        if (iVar1 == 0) {
          do {
            a_01 = a_00;
            uVar6 = 0xffffffff;
            do {
              uVar6 = uVar6 + 1;
              iVar1 = BN_is_bit_set(a_01,uVar6);
            } while (iVar1 == 0);
            iVar1 = BN_rshift(a_01,a_01,uVar6);
            if (iVar1 == 0) goto LAB_00a38d3c;
            iVar1 = iVar3;
            if ((uVar6 & 1) != 0) {
              if (pBVar4->top == 0) {
                uVar5 = 0;
              }
              else {
                uVar5 = *pBVar4->d;
              }
              iVar1 = (&DAT_00364cd0)[uVar5 & 7] * iVar3;
            }
            if (a_01->neg == 0) {
              if (a_01->top == 0) {
                uVar6 = 0;
                iVar3 = pBVar4->top;
              }
              else {
                uVar6 = (uint)*a_01->d;
                iVar3 = pBVar4->top;
              }
joined_r0x00a38c54:
              if (iVar3 != 0) goto LAB_00a38cdc;
LAB_00a38cfc:
              uVar7 = 0;
            }
            else {
              if (a_01->top == 0) {
                uVar6 = 0xffffffff;
                iVar3 = pBVar4->top;
                goto joined_r0x00a38c54;
              }
              uVar6 = ~(uint)*a_01->d;
              if (pBVar4->top == 0) goto LAB_00a38cfc;
LAB_00a38cdc:
              uVar7 = (uint)*pBVar4->d;
            }
            iVar3 = BN_nnmod(pBVar4,pBVar4,a_01,ctx);
            if (iVar3 == 0) goto LAB_00a38d3c;
            iVar3 = -iVar1;
            if ((uVar6 & uVar7 & 2) == 0) {
              iVar3 = iVar1;
            }
            a_01->neg = 0;
            iVar1 = BN_is_zero(pBVar4);
            a_00 = pBVar4;
            pBVar4 = a_01;
          } while (iVar1 == 0);
        }
        iVar2 = BN_is_one(a_01);
        iVar1 = 0;
        if (iVar2 != 0) {
          iVar1 = iVar3;
        }
      }
    }
    else {
      iVar1 = BN_abs_is_word(a_00,1);
    }
  }
  BN_CTX_end(ctx);
  return iVar1;
}

