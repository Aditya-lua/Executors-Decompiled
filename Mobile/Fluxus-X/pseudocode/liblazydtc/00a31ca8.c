/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31ca8
 */

int EC_POINT_invert(EC_GROUP *group,EC_POINT *a,BN_CTX *ctx)

{
  int iVar1;
  undefined8 uVar2;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)group + 0xb0);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3c9,"EC_POINT_invert");
    uVar2 = 0xc0101;
  }
  else {
    if (*(long *)group == *(long *)a) {
      if (((*(int *)(group + 0x20) == 0) || (*(int *)(a + 8) == 0)) ||
         (*(int *)(group + 0x20) == *(int *)(a + 8))) {
                    /* WARNING: Could not recover jumptable at 0x00a31d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (*UNRECOVERED_JUMPTABLE)();
        return iVar1;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3cd,"EC_POINT_invert");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

