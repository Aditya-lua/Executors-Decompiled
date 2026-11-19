/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a133f8
 */

long o2i_SCT_LIST(long *param_1,long *param_2,long param_3)

{
  ulong uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  int iVar4;
  long lVar5;
  undefined8 uVar6;
  undefined1 *puVar7;
  long lVar8;
  ulong uVar9;
  
  uVar9 = param_3 - 2;
  if (uVar9 < 0xfffe) {
    puVar7 = (undefined1 *)*param_2;
    uVar2 = *puVar7;
    uVar3 = puVar7[1];
    *param_2 = (long)(puVar7 + 2);
    if (CONCAT11(uVar2,uVar3) == uVar9) {
      if ((param_1 == (long *)0x0) || (lVar8 = *param_1, lVar8 == 0)) {
        lVar8 = OPENSSL_sk_new_null();
        if (lVar8 == 0) {
          return 0;
        }
      }
      else {
        while (lVar5 = OPENSSL_sk_pop(lVar8), lVar5 != 0) {
          SCT_free();
        }
      }
      do {
        if (uVar9 == 0) {
          if ((param_1 != (long *)0x0) && (*param_1 == 0)) {
            *param_1 = lVar8;
          }
          return lVar8;
        }
        if (uVar9 == 1) {
          ERR_new();
          uVar6 = 0x123;
LAB_00a13590:
          ERR_set_debug("crypto/ct/ct_oct.c",uVar6,"o2i_SCT_LIST");
          ERR_set_error(0x32,0x69,0);
          goto joined_r0x00a135a4;
        }
        puVar7 = (undefined1 *)*param_2;
        uVar2 = *puVar7;
        uVar3 = puVar7[1];
        *param_2 = (long)(puVar7 + 2);
        uVar1 = (ulong)CONCAT11(uVar2,uVar3);
        if (uVar9 - 2 <= uVar1 - 1) {
          ERR_new();
          uVar6 = 0x12a;
          goto LAB_00a13590;
        }
        lVar5 = o2i_SCT(0,param_2,uVar1);
        if (lVar5 == 0) goto joined_r0x00a135a4;
        uVar9 = (uVar9 - 2) - uVar1;
        iVar4 = OPENSSL_sk_push(lVar8,lVar5);
      } while (iVar4 != 0);
      SCT_free(lVar5);
joined_r0x00a135a4:
      if ((param_1 == (long *)0x0) || (*param_1 == 0)) {
        SCT_LIST_free(lVar8);
        return 0;
      }
      return 0;
    }
    ERR_new();
    uVar6 = 0x10e;
  }
  else {
    ERR_new();
    uVar6 = 0x108;
  }
  ERR_set_debug("crypto/ct/ct_oct.c",uVar6,"o2i_SCT_LIST");
  ERR_set_error(0x32,0x69,0);
  return 0;
}

