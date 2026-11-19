/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31878
 */

int EC_POINT_is_on_curve(EC_GROUP *group,EC_POINT *point,BN_CTX *ctx)

{
  int iVar1;
  undefined8 uVar2;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)group + 0xc0);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3eb,"EC_POINT_is_on_curve");
    uVar2 = 0xc0101;
  }
  else {
    if (*(long *)group == *(long *)point) {
      if (((*(int *)(group + 0x20) == 0) || (*(int *)(point + 8) == 0)) ||
         (*(int *)(group + 0x20) == *(int *)(point + 8))) {
                    /* WARNING: Could not recover jumptable at 0x00a31918. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (*UNRECOVERED_JUMPTABLE)();
        return iVar1;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3ef,"EC_POINT_is_on_curve");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

