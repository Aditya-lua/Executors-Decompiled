/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31b00
 */

int EC_POINT_add(EC_GROUP *group,EC_POINT *r,EC_POINT *a,EC_POINT *b,BN_CTX *ctx)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  lVar3 = *(long *)group;
  if (*(code **)(lVar3 + 0xa0) == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3ad,"EC_POINT_add");
    uVar2 = 0xc0101;
  }
  else {
    if (lVar3 == *(long *)r) {
      iVar1 = *(int *)(group + 0x20);
      if ((((((iVar1 == 0) || (*(int *)(r + 8) == 0)) || (iVar1 == *(int *)(r + 8))) &&
           (lVar3 == *(long *)a)) &&
          ((((iVar1 == 0 || (*(int *)(a + 8) == 0)) || (iVar1 == *(int *)(a + 8))) &&
           (lVar3 == *(long *)b)))) &&
         (((iVar1 == 0 || (*(int *)(b + 8) == 0)) || (iVar1 == *(int *)(b + 8))))) {
                    /* WARNING: Could not recover jumptable at 0x00a31be0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (**(code **)(lVar3 + 0xa0))();
        return iVar1;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3b2,"EC_POINT_add");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

