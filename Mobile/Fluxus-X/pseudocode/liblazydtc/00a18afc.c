/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18afc
 */

undefined1 * bn_compute_wNAF(BIGNUM *param_1,uint param_2,ulong *param_3)

{
  uint uVar1;
  uint uVar2;
  undefined4 uVar3;
  int iVar4;
  undefined1 *ptr;
  undefined8 uVar5;
  ulong uVar6;
  ulong uVar7;
  uint uVar8;
  uint uVar9;
  char cVar10;
  uint uVar11;
  
  iVar4 = BN_is_zero();
  if (iVar4 == 0) {
    if (param_2 - 1 < 7) {
      iVar4 = BN_is_negative(param_1);
      cVar10 = -1;
      if (iVar4 == 0) {
        cVar10 = '\x01';
      }
      if ((param_1->d != (ulong *)0x0) && (param_1->top != 0)) {
        iVar4 = BN_num_bits(param_1);
        uVar7 = (ulong)iVar4;
        ptr = CRYPTO_malloc((int)(uVar7 + 1),"crypto/bn/bn_intern.c",0x3c);
        if (ptr == (undefined1 *)0x0) {
          ERR_new();
          uVar5 = 0x42;
          goto LAB_00a18b9c;
        }
        uVar1 = 1 << (ulong)(param_2 & 0x1f);
        uVar2 = uVar1 * 2;
        uVar11 = uVar2 - 1 & (uint)*param_1->d;
        uVar6 = 0;
        do {
          if (uVar11 == 0) {
            uVar8 = 0;
            if (uVar7 <= (long)(int)param_2 + 1 + uVar6) {
              if (uVar6 <= uVar7 + 1) goto LAB_00a18b54;
              ERR_new();
              uVar5 = 0x82;
              goto LAB_00a18e14;
            }
          }
          else if ((uVar11 & 1) == 0) {
            uVar8 = 0;
          }
          else {
            if ((uVar11 & uVar1) == 0) {
              uVar9 = 1;
              uVar8 = uVar11;
            }
            else {
              uVar8 = uVar11 + uVar1 * -2;
              if (uVar7 <= (long)(int)param_2 + 1 + uVar6) {
                uVar8 = uVar11 & (int)(uVar2 - 1) >> 1;
              }
              uVar9 = uVar8 & 1;
            }
            if ((((int)uVar1 <= (int)uVar8) || ((int)uVar8 <= (int)-uVar1)) || (uVar9 == 0)) {
              ERR_new();
              uVar5 = 0x65;
              goto LAB_00a18e14;
            }
            uVar11 = uVar11 - uVar8;
            if (((uVar11 != uVar1) && (uVar11 != 0)) && (uVar11 != uVar2)) {
              ERR_new();
              uVar5 = 0x71;
              goto LAB_00a18e14;
            }
          }
          ptr[uVar6] = (char)uVar8 * cVar10;
          iVar4 = BN_is_bit_set(param_1,param_2 + (int)uVar6 + 1);
          uVar11 = (iVar4 << (ulong)(param_2 & 0x1f)) + ((int)uVar11 >> 1);
          uVar6 = uVar6 + 1;
        } while ((int)uVar11 <= (int)uVar2);
        ERR_new();
        uVar5 = 0x7c;
LAB_00a18e14:
        ERR_set_debug("crypto/bn/bn_intern.c",uVar5,"bn_compute_wNAF");
        uVar3 = 0xc0103;
        goto LAB_00a18bb0;
      }
      ERR_new();
      uVar5 = 0x37;
    }
    else {
      ERR_new();
      uVar5 = 0x2b;
    }
    ERR_set_debug("crypto/bn/bn_intern.c",uVar5,"bn_compute_wNAF");
    ERR_set_error(3,0xc0103,0);
    ptr = (undefined1 *)0x0;
  }
  else {
    ptr = CRYPTO_malloc(1,"crypto/bn/bn_intern.c",0x1f);
    if (ptr != (undefined1 *)0x0) {
      uVar6 = 1;
      *ptr = 0;
LAB_00a18b54:
      *param_3 = uVar6;
      return ptr;
    }
    ERR_new();
    uVar5 = 0x21;
    ptr = (undefined1 *)0x0;
LAB_00a18b9c:
    ERR_set_debug("crypto/bn/bn_intern.c",uVar5,"bn_compute_wNAF");
    uVar3 = 0xc0100;
LAB_00a18bb0:
    ERR_set_error(3,uVar3,0);
  }
  CRYPTO_free(ptr);
  return (undefined1 *)0x0;
}

