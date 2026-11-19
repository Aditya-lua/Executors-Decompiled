/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd400
 */

ulong BIO_do_connect_retry(BIO *param_1,int param_2,int param_3)

{
  uint uVar1;
  int iVar2;
  time_t tVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined4 uVar7;
  long lVar8;
  uint uVar9;
  uint uVar10;
  
  if (param_2 < 1) {
    lVar8 = 0;
  }
  else {
    tVar3 = time((time_t *)0x0);
    lVar8 = tVar3 + param_2;
  }
  if (param_1 == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x3a2,"BIO_do_connect_retry");
    uVar6 = 0xc0102;
LAB_009fd580:
    ERR_set_error(0x20,uVar6,0);
LAB_009fd59c:
    uVar4 = 0xffffffff;
  }
  else {
    iVar2 = 100;
    if (-1 < param_3) {
      iVar2 = param_3;
    }
    BIO_ctrl(param_1,0x66,(ulong)(0 < param_2),(void *)0x0);
    do {
      ERR_set_mark();
      uVar4 = BIO_ctrl(param_1,0x65,0,(void *)0x0);
      if (0 < (int)uVar4) {
        ERR_clear_last_mark();
        goto LAB_009fd5a0;
      }
      uVar4 = ERR_peek_last_error();
      uVar10 = *(uint *)&param_1->ptr & 8;
      uVar9 = (uint)uVar4;
      if (((uVar4 & 0xff800000) == 0x10000000) &&
         (((uVar1 = ((int)uVar9 >> 0x1f | 0x7fffffU) & uVar9 & 0x7fffffff, uVar1 == 0x67 ||
           (uVar1 == 0x80002)) || (uVar1 == 0x6e)))) {
        uVar10 = 1;
        BIO_ctrl(param_1,1,0,(void *)0x0);
      }
      if ((param_2 < 0) || (uVar10 == 0)) {
        ERR_clear_last_mark();
        if (uVar9 != 0) goto LAB_009fd59c;
        ERR_new();
        ERR_set_debug("crypto/bio/bio_lib.c",0x3d3,"BIO_do_connect_retry");
        uVar6 = 0x67;
        goto LAB_009fd580;
      }
      ERR_pop_to_mark();
      uVar5 = FUN_009fd2f8(param_1,lVar8,iVar2);
      uVar4 = uVar5 & 0xffffffff;
    } while (0 < (int)uVar5);
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x3cd,"BIO_do_connect_retry");
    uVar7 = 0x93;
    if ((int)uVar5 != 0) {
      uVar7 = 0x67;
    }
    ERR_set_error(0x20,uVar7,0);
  }
LAB_009fd5a0:
  return uVar4 & 0xffffffff;
}

