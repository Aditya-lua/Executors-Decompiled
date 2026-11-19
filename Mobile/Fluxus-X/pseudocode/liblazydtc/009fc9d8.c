/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fc9d8
 */

ulong BIO_get_line(BIO *param_1,char *param_2,int param_3)

{
  char cVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  int iVar5;
  char *pcVar6;
  char *pcVar7;
  ulong uVar8;
  int local_38 [2];
  
  if (param_2 == (char *)0x0) {
    ERR_new();
    uVar4 = 0x1fc;
LAB_009fcabc:
    ERR_set_debug("crypto/bio/bio_lib.c",uVar4,"BIO_get_line");
    uVar4 = 0xc0102;
  }
  else if (param_3 < 1) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x200,"BIO_get_line");
    uVar4 = 0x7d;
  }
  else {
    *param_2 = '\0';
    if (param_1 == (BIO *)0x0) {
      ERR_new();
      uVar4 = 0x206;
      goto LAB_009fcabc;
    }
    if (param_1->num != 0) {
      iVar5 = 0;
      pcVar6 = param_2;
      do {
        if (param_3 + -1 == 0 || param_3 < 1) {
          *pcVar6 = '\0';
          if (0 < iVar5) goto LAB_009fcb4c;
          uVar8 = 0;
LAB_009fcb34:
          lVar3 = BIO_ctrl(param_1,2,0,(void *)0x0);
          if ((int)lVar3 != 0) goto LAB_009fcb4c;
          goto LAB_009fcad8;
        }
        iVar2 = FUN_009fc050(param_1,pcVar6,1,local_38);
        iVar5 = local_38[0];
        if (iVar2 < 1) {
          iVar5 = iVar2;
        }
        if (iVar5 < 1) {
          *pcVar6 = '\0';
          uVar8 = (ulong)iVar5;
          goto LAB_009fcb34;
        }
        pcVar7 = pcVar6 + 1;
        cVar1 = *pcVar6;
        pcVar6 = pcVar7;
        param_3 = param_3 + -1;
      } while (cVar1 != '\n');
      *pcVar7 = '\0';
LAB_009fcb4c:
      uVar8 = (long)pcVar6 - (long)param_2;
      goto LAB_009fcad8;
    }
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x20a,"BIO_get_line");
    uVar4 = 0x78;
  }
  ERR_set_error(0x20,uVar4,0);
  uVar8 = 0xffffffff;
LAB_009fcad8:
  return uVar8 & 0xffffffff;
}

