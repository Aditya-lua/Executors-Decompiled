/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30938
 */

int EC_POINT_copy(EC_POINT *dst,EC_POINT *src)

{
  int iVar1;
  undefined8 uVar2;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)dst + 0x68);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x302,"EC_POINT_copy");
    uVar2 = 0xc0101;
  }
  else {
    if (*(long *)dst == *(long *)src) {
      if (((*(int *)(src + 8) == 0) || (*(int *)(dst + 8) == 0)) ||
         (*(int *)(dst + 8) == *(int *)(src + 8))) {
        if (dst == src) {
          return 1;
        }
                    /* WARNING: Could not recover jumptable at 0x00a309e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (*UNRECOVERED_JUMPTABLE)();
        return iVar1;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x309,"EC_POINT_copy");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

