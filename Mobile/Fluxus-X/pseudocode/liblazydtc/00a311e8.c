/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a311e8
 */

int EC_GROUP_check_discriminant(EC_GROUP *group,BN_CTX *ctx)

{
  int iVar1;
  
  if (*(code **)(*(long *)group + 0x48) == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x267,"EC_GROUP_check_discriminant");
    ERR_set_error(0x10,0xc0101,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a311f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(*(long *)group + 0x48))();
  return iVar1;
}

