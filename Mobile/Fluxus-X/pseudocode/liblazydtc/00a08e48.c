/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a08e48
 */

undefined8 bn_mod_add_fixed_top(undefined8 *param_1,long *param_2,long *param_3,undefined8 *param_4)

{
  long lVar1;
  long lVar2;
  ulong *puVar3;
  ulong uVar4;
  int iVar5;
  int iVar6;
  uint num;
  long lVar7;
  long lVar8;
  long lVar9;
  ulong *ap;
  ulong uVar10;
  undefined8 uVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  ulong uVar15;
  ulong *puVar16;
  ulong uVar17;
  ulong uVar18;
  ulong auStack_d0 [16];
  
  ap = auStack_d0;
  num = *(uint *)(param_4 + 1);
  lVar9 = bn_wexpand(param_1,num);
  uVar11 = 0;
  if (lVar9 != 0) {
    uVar17 = (ulong)(int)num;
    if ((0x10 < num) &&
       (ap = CRYPTO_malloc((int)(uVar17 << 3),"crypto/bn/bn_mod.c",0x41), ap == (ulong *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/bn/bn_mod.c",0x43,"bn_mod_add_fixed_top");
      ERR_set_error(3,0xc0100,0);
      return 0;
    }
    puVar16 = ap;
    if ((ulong *)*param_2 != (ulong *)0x0) {
      puVar16 = (ulong *)*param_2;
    }
    puVar3 = ap;
    if ((ulong *)*param_3 != (ulong *)0x0) {
      puVar3 = (ulong *)*param_3;
    }
    if (num == 0) {
      uVar18 = 0;
    }
    else {
      lVar7 = param_2[1];
      iVar5 = *(int *)((long)param_2 + 0xc);
      lVar8 = param_3[1];
      iVar6 = *(int *)((long)param_3 + 0xc);
      uVar14 = 0;
      lVar9 = 0;
      lVar13 = 0;
      uVar18 = 0;
      do {
        uVar15 = puVar16[lVar9] & (long)(uVar14 - (long)(int)lVar7) >> 0x3f;
        uVar10 = puVar3[lVar13] & (long)(uVar14 - (long)(int)lVar8) >> 0x3f;
        uVar12 = uVar15 + uVar18;
        uVar4 = 2;
        if (!CARRY8(uVar15,uVar18)) {
          uVar4 = 1;
        }
        lVar1 = (1 - (long)iVar5) + uVar14;
        ap[uVar14] = uVar10 + uVar12;
        lVar2 = (1 - (long)iVar6) + uVar14;
        uVar14 = uVar14 + 1;
        uVar18 = (ulong)CARRY8(uVar15,uVar18);
        if (CARRY8(uVar10,uVar12)) {
          uVar18 = uVar4;
        }
        lVar9 = lVar9 - (lVar1 >> 0x3f);
        lVar13 = lVar13 - (lVar2 >> 0x3f);
      } while (uVar14 < uVar17);
    }
    puVar16 = (ulong *)*param_1;
    uVar14 = bn_sub_words(puVar16,ap,(ulong *)*param_4,num);
    if (num != 0) {
      uVar12 = 0;
      do {
        uVar4 = uVar12 + 1;
        puVar16[uVar12] = puVar16[uVar12] & ~(uVar18 - uVar14) | ap[uVar12] & uVar18 - uVar14;
        ap[uVar12] = 0;
        uVar12 = uVar4;
      } while (uVar4 < uVar17);
    }
    *(uint *)(param_1 + 1) = num;
    *(undefined4 *)(param_1 + 2) = 0;
    if (ap != auStack_d0) {
      CRYPTO_free(ap);
    }
    uVar11 = 1;
  }
  return uVar11;
}

