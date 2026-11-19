/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31a54
 */

int EC_POINT_is_at_infinity(EC_GROUP *group,EC_POINT *p)

{
  int iVar1;
  undefined8 uVar2;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)group + 0xb8);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3d6,"EC_POINT_is_at_infinity");
    uVar2 = 0xc0101;
  }
  else {
    if (*(long *)group == *(long *)p) {
      if (((*(int *)(group + 0x20) == 0) || (*(int *)(p + 8) == 0)) ||
         (*(int *)(group + 0x20) == *(int *)(p + 8))) {
                    /* WARNING: Could not recover jumptable at 0x00a31af4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (*UNRECOVERED_JUMPTABLE)();
        return iVar1;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3da,"EC_POINT_is_at_infinity");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

