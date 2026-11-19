/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a17ae0
 */

/* WARNING: Removing unreachable block (ram,0x00a17b2c) */
/* WARNING: Removing unreachable block (ram,0x00a17b1c) */
/* WARNING: Removing unreachable block (ram,0x00a17b30) */

int DHparams_print(BIO *bp,DH *x)

{
  int iVar1;
  undefined4 uVar2;
  
  uVar2 = 0xc0102;
  if (x->p != (BIGNUM *)0x0) {
    uVar2 = 0x80007;
    iVar1 = BIO_indent(bp,4,0x80);
    if (iVar1 != 0) {
      iVar1 = DH_bits(x);
      iVar1 = BIO_printf(bp,"%s: (%d bit)\n","DH Parameters",iVar1);
      if (((((0 < iVar1) &&
            (iVar1 = ASN1_bn_print(bp,"private-key:",(BIGNUM *)0x0,(uchar *)0x0,8), iVar1 != 0)) &&
           (iVar1 = ASN1_bn_print(bp,"public-key:",(BIGNUM *)0x0,(uchar *)0x0,8), iVar1 != 0)) &&
          (iVar1 = ossl_ffc_params_print(bp,&x->p,8), iVar1 != 0)) &&
         ((x->references == 0 ||
          ((iVar1 = BIO_indent(bp,8,0x80), iVar1 != 0 &&
           (iVar1 = BIO_printf(bp,"recommended-private-length: %d bits\n",x->references), 0 < iVar1)
           ))))) {
        return 1;
      }
    }
  }
  ERR_new();
  ERR_set_debug("crypto/dh/dh_ameth.c",0x128,"do_dh_print");
  ERR_set_error(5,uVar2,0);
  return 0;
}

