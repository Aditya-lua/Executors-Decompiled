/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31be4
 */

int EC_POINT_dbl(EC_GROUP *group,EC_POINT *r,EC_POINT *a,BN_CTX *ctx)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  lVar3 = *(long *)group;
  if (*(code **)(lVar3 + 0xa8) == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3bc,"EC_POINT_dbl");
    uVar2 = 0xc0101;
  }
  else {
    if (lVar3 == *(long *)r) {
      iVar1 = *(int *)(group + 0x20);
      if ((((iVar1 == 0) || (*(int *)(r + 8) == 0)) || (iVar1 == *(int *)(r + 8))) &&
         ((lVar3 == *(long *)a &&
          (((iVar1 == 0 || (*(int *)(a + 8) == 0)) || (iVar1 == *(int *)(a + 8))))))) {
                    /* WARNING: Could not recover jumptable at 0x00a31ca4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (**(code **)(lVar3 + 0xa8))();
        return iVar1;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3c0,"EC_POINT_dbl");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

