/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd0d8
 */

BIO * BIO_dup_chain(BIO *in)

{
  undefined4 uVar1;
  ulong uVar2;
  int iVar3;
  BIO *a;
  long lVar4;
  BIO *pBVar5;
  BIO *parg;
  BIO *a_00;
  BIO *pBVar6;
  char *pcVar7;
  
  if (in == (BIO *)0x0) {
    return (BIO *)0x0;
  }
  pBVar6 = (BIO *)0x0;
  a_00 = (BIO *)0x0;
  do {
    a = (BIO *)BIO_new_ex(0,in->callback);
    if (a == (BIO *)0x0) {
LAB_009fd1b8:
      if (a_00 != (BIO *)0x0) {
        while( true ) {
          uVar2 = a_00->num_write;
          pBVar6 = *(BIO **)&a_00->references;
          BIO_free(a_00);
          if (1 < (int)uVar2) break;
          a_00 = pBVar6;
          if (pBVar6 == (BIO *)0x0) {
            return (BIO *)0x0;
          }
        }
      }
      return (BIO *)0x0;
    }
    iVar3 = in->shutdown;
    pcVar7 = in->cb_arg;
    a->init = in->init;
    a->shutdown = iVar3;
    a->cb_arg = pcVar7;
    iVar3 = in->retry_reason;
    a->flags = in->flags;
    a->retry_reason = iVar3;
    uVar1 = *(undefined4 *)&in->field_0x2c;
    a->num = in->num;
    *(undefined4 *)&a->field_0x2c = uVar1;
    *(undefined4 *)&a->ptr = *(undefined4 *)&in->ptr;
    *(undefined4 *)&a->next_bio = *(undefined4 *)&in->next_bio;
    lVar4 = BIO_ctrl(in,0xc,0,a);
    if ((lVar4 < 1) ||
       (iVar3 = CRYPTO_dup_ex_data(0xc,(CRYPTO_EX_DATA *)(a + 1),(CRYPTO_EX_DATA *)(in + 1)),
       iVar3 == 0)) {
      BIO_free(a);
      goto LAB_009fd1b8;
    }
    pBVar5 = a;
    if (a_00 != (BIO *)0x0) {
      if (pBVar6 != (BIO *)0x0) {
        pBVar5 = pBVar6;
        do {
          parg = pBVar5;
          pBVar5 = *(BIO **)&parg->references;
        } while (*(BIO **)&parg->references != (BIO *)0x0);
        *(BIO **)&parg->references = a;
        a->num_read = (ulong)parg;
        BIO_ctrl(pBVar6,6,0,parg);
      }
      pBVar5 = a_00;
    }
    in = *(BIO **)&in->references;
    pBVar6 = a;
    a_00 = pBVar5;
    if (in == (BIO *)0x0) {
      return pBVar5;
    }
  } while( true );
}

