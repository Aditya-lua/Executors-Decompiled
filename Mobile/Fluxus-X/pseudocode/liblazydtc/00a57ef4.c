/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a57ef4
 */

int EVP_DigestUpdate(EVP_MD_CTX *ctx,void *d,size_t cnt)

{
  int iVar1;
  undefined8 uVar2;
  ENGINE *pEVar3;
  _func_1088 *p_Var4;
  
  if (cnt == 0) {
    return 1;
  }
  p_Var4 = ctx->update;
  if (p_Var4 != (_func_1088 *)0x0) {
    iVar1 = *(int *)p_Var4;
    if (((((iVar1 - 0x10U < 0x31) &&
          ((1L << ((ulong)(iVar1 - 0x10U) & 0x3f) & 0x1000000010001U) != 0)) || (iVar1 == 0x100)) ||
        (iVar1 == 0x80)) && (*(long *)(p_Var4 + 0x30) != 0)) {
      if (iVar1 == 0x100) {
        iVar1 = EVP_DigestVerifyUpdate();
        return iVar1;
      }
      if (iVar1 == 0x80) {
        iVar1 = EVP_DigestSignUpdate();
        return iVar1;
      }
      ERR_new();
      uVar2 = 0x18b;
      goto LAB_00a57fe0;
    }
  }
  pEVar3 = ctx->engine;
  if (((pEVar3 == (ENGINE *)0x0) || (*(long *)(pEVar3 + 0x70) == 0)) ||
     (((ulong)ctx->md_data & 0x100) != 0)) {
                    /* WARNING: Could not recover jumptable at 0x00a57fa0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    iVar1 = (*(code *)ctx[1].digest)();
    return iVar1;
  }
  if (*(code **)(pEVar3 + 0x98) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a57f88. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    iVar1 = (**(code **)(pEVar3 + 0x98))(ctx[1].engine);
    return iVar1;
  }
  ERR_new();
  uVar2 = 0x195;
LAB_00a57fe0:
  ERR_set_debug("crypto/evp/digest.c",uVar2,"EVP_DigestUpdate");
  ERR_set_error(6,0xbd,0);
  return 0;
}

