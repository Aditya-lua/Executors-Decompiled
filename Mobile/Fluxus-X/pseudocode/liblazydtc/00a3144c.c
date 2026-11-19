/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3144c
 */

int EC_POINT_cmp(EC_GROUP *group,EC_POINT *a,EC_POINT *b,BN_CTX *ctx)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  lVar3 = *(long *)group;
  if (*(code **)(lVar3 + 200) == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3f9,"EC_POINT_cmp");
    uVar2 = 0xc0101;
  }
  else {
    if (lVar3 == *(long *)a) {
      iVar1 = *(int *)(group + 0x20);
      if ((((iVar1 == 0) || (*(int *)(a + 8) == 0)) || (iVar1 == *(int *)(a + 8))) &&
         ((lVar3 == *(long *)b &&
          (((iVar1 == 0 || (*(int *)(b + 8) == 0)) || (iVar1 == *(int *)(b + 8))))))) {
                    /* WARNING: Could not recover jumptable at 0x00a3150c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (**(code **)(lVar3 + 200))();
        return iVar1;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x3fd,"EC_POINT_cmp");
    uVar2 = 0x65;
  }
  ERR_set_error(0x10,uVar2,0);
  return -1;
}

