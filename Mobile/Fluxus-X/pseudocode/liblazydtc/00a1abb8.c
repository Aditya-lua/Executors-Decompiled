/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1abb8
 */

uint FUN_00a1abb8(BIGNUM *param_1,undefined4 param_2,BN_CTX *param_3,int param_4,int *param_5)

{
  int iVar1;
  BIGNUM *b;
  ulong uVar2;
  uint uVar3;
  ulong w;
  ulong uVar4;
  BN_CTX *c;
  ulong uVar5;
  int local_54;
  
  b = BN_value_one();
  iVar1 = BN_cmp(param_1,b);
  if (iVar1 < 1) {
    return 0;
  }
  iVar1 = BN_is_odd(param_1);
  if (iVar1 == 0) {
    w = 2;
LAB_00a1ac34:
    uVar3 = BN_is_word(param_1,w);
    return uVar3;
  }
  iVar1 = BN_is_word(param_1,3);
  if (iVar1 != 0) {
    return 1;
  }
  if (param_4 == 0) {
LAB_00a1ad2c:
    c = (BN_CTX *)0x0;
    if (param_3 != (BN_CTX *)0x0) goto LAB_00a1ad44;
LAB_00a1ad34:
    param_3 = BN_CTX_new();
    c = param_3;
    if (param_3 != (BN_CTX *)0x0) goto LAB_00a1ad44;
  }
  else {
    iVar1 = BN_num_bits(param_1);
    if (iVar1 < 0x201) {
      uVar4 = 0x40;
    }
    else if (iVar1 < 0x401) {
      uVar4 = 0x80;
    }
    else if (iVar1 < 0x801) {
      uVar4 = 0x180;
    }
    else {
      uVar4 = 0x400;
      if (0x1000 < iVar1) {
        uVar4 = 0x800;
      }
    }
    uVar5 = 1;
    do {
      w = (ulong)*(ushort *)(&UNK_00753948 + uVar5 * 2);
      uVar2 = BN_mod_word(param_1,w);
      if (uVar2 == 0xffffffffffffffff) {
        return 0xffffffff;
      }
      if (uVar2 == 0) goto LAB_00a1ac34;
      uVar5 = uVar5 + 1;
    } while (uVar5 < uVar4);
    if (param_5 == (int *)0x0) goto LAB_00a1ad2c;
    if (*param_5 == 2) {
      iVar1 = (**(code **)(param_5 + 4))(1,0xffffffff,param_5);
      if (iVar1 == 0) {
        return 0xffffffff;
      }
      goto LAB_00a1ad2c;
    }
    if (*param_5 != 1) {
      return 0xffffffff;
    }
    if (*(code **)(param_5 + 4) == (code *)0x0) goto LAB_00a1ad2c;
    (**(code **)(param_5 + 4))(1,0xffffffff,*(undefined8 *)(param_5 + 2));
    c = (BN_CTX *)0x0;
    if (param_3 == (BN_CTX *)0x0) goto LAB_00a1ad34;
LAB_00a1ad44:
    iVar1 = ossl_bn_miller_rabin_is_prime(param_1,param_2,param_3,param_5,0,&local_54);
    if (iVar1 != 0) {
      uVar3 = (uint)(local_54 == 3);
      goto LAB_00a1ad78;
    }
  }
  uVar3 = 0xffffffff;
LAB_00a1ad78:
  BN_CTX_free(c);
  return uVar3;
}

