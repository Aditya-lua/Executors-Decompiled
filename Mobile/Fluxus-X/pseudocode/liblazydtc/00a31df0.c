/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31df0
 */

int EC_POINTs_make_affine(EC_GROUP *group,size_t num,EC_POINT **points,BN_CTX *ctx)

{
  int iVar1;
  undefined8 uVar2;
  code *UNRECOVERED_JUMPTABLE;
  ulong uVar3;
  
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)group + 0xd8);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x417,"EC_POINTs_make_affine");
    uVar2 = 0xc0101;
LAB_00a31e98:
    ERR_set_error(0x10,uVar2,0);
    return 0;
  }
  if (num != 0) {
    uVar3 = 0;
    do {
      if ((*(long *)group != *(long *)points[uVar3]) ||
         (((*(int *)(group + 0x20) != 0 && (iVar1 = *(int *)(points[uVar3] + 8), iVar1 != 0)) &&
          (*(int *)(group + 0x20) != iVar1)))) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_lib.c",0x41c,"EC_POINTs_make_affine");
        uVar2 = 0x65;
        goto LAB_00a31e98;
      }
      uVar3 = uVar3 + 1;
    } while (uVar3 < num);
  }
                    /* WARNING: Could not recover jumptable at 0x00a31e44. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*UNRECOVERED_JUMPTABLE)();
  return iVar1;
}

