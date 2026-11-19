/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7e31c
 */

undefined8
FUN_00a7e31c(BN_CTX *param_1,EVP_MD *param_2,int param_3,int param_4,void *param_5,size_t param_6,
            BIGNUM *param_7,BIGNUM *param_8,int param_9,BN_GENCB *param_10,int *param_11,
            uint *param_12)

{
  bool bVar1;
  char cVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  BIGNUM *r;
  BIGNUM *a;
  BIGNUM *rem;
  BIGNUM *r_00;
  BIGNUM *ret;
  BIGNUM *pBVar6;
  long lVar7;
  undefined8 uVar8;
  int b;
  uchar auStack_a8 [72];
  
  BN_CTX_start(param_1);
  r = BN_CTX_get(param_1);
  a = BN_CTX_get(param_1);
  rem = BN_CTX_get(param_1);
  r_00 = BN_CTX_get(param_1);
  ret = BN_CTX_get(param_1);
  if (ret != (BIGNUM *)0x0) {
    pBVar6 = BN_value_one();
    iVar3 = BN_lshift(r_00,pBVar6,param_9 + -1);
    if (iVar3 != 0) {
      iVar3 = EVP_MD_get_size(param_2);
      if (0 < iVar3) {
        if (-1 < param_3) {
          b = 0;
          do {
            if ((b != 0) && (iVar4 = BN_GENCB_call(param_10,0,b), iVar4 == 0)) goto LAB_00a7e5bc;
            BN_zero_ex(r);
            if (-1 < param_4) {
              iVar4 = 0;
              do {
                lVar7 = (long)(int)param_6;
                do {
                  if (lVar7 < 1) break;
                  cVar2 = *(char *)((long)param_5 + lVar7 + -1) + '\x01';
                  *(char *)((long)param_5 + lVar7 + -1) = cVar2;
                  lVar7 = lVar7 + -1;
                } while (cVar2 == '\0');
                iVar5 = EVP_Digest(param_5,param_6,auStack_a8,(uint *)0x0,param_2,(ENGINE *)0x0);
                if ((((iVar5 == 0) ||
                     (pBVar6 = BN_bin2bn(auStack_a8,iVar3,ret), pBVar6 == (BIGNUM *)0x0)) ||
                    (iVar5 = BN_lshift(ret,ret,iVar3 * 8 * iVar4), iVar5 == 0)) ||
                   (iVar5 = BN_add(r,r,ret), iVar5 == 0)) goto LAB_00a7e5bc;
                bVar1 = iVar4 < param_4;
                iVar4 = iVar4 + 1;
              } while (bVar1);
            }
            iVar4 = BN_mask_bits(r,param_9 + -1);
            if (iVar4 == 0) goto LAB_00a7e5bc;
            pBVar6 = BN_copy(a,r);
            if (((pBVar6 == (BIGNUM *)0x0) || (iVar4 = BN_add(a,a,r_00), iVar4 == 0)) ||
               (iVar4 = BN_lshift1(ret,param_7), iVar4 == 0)) goto LAB_00a7e5bc;
            iVar4 = BN_div((BIGNUM *)0x0,rem,a,ret,param_1);
            if (iVar4 == 0) goto LAB_00a7e5bc;
            pBVar6 = BN_value_one();
            iVar4 = BN_sub(ret,rem,pBVar6);
            if (iVar4 == 0) goto LAB_00a7e5bc;
            iVar4 = BN_sub(param_8,a,ret);
            if (iVar4 == 0) goto LAB_00a7e5bc;
            iVar4 = BN_cmp(param_8,r_00);
            if (-1 < iVar4) {
              iVar4 = BN_check_prime(param_8,param_1,param_10);
              if (0 < iVar4) {
                uVar8 = 1;
                *param_11 = b;
                goto LAB_00a7e5c0;
              }
              if (iVar4 != 0) goto LAB_00a7e5bc;
            }
            bVar1 = b < param_3;
            b = b + 1;
          } while (bVar1);
        }
        uVar8 = 0;
        *param_12 = *param_12 | 1;
        goto LAB_00a7e5c0;
      }
    }
  }
LAB_00a7e5bc:
  uVar8 = 0xffffffff;
LAB_00a7e5c0:
  BN_CTX_end(param_1);
  return uVar8;
}

