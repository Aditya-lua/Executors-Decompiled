/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18810
 */

bool ASN1_buf_print(BIO *param_1,long param_2,ulong param_3,int param_4)

{
  char *param3;
  int iVar1;
  long lVar2;
  ulong uVar3;
  
  if (param_3 != 0) {
    lVar2 = 0;
    uVar3 = 0;
    do {
      if (lVar2 + (uVar3 / 0xf) * 0xf == 0) {
        if ((uVar3 != 0) && (iVar1 = BIO_puts(param_1,"\n"), iVar1 < 1)) {
          return false;
        }
        iVar1 = BIO_indent(param_1,param_4,0x80);
        if (iVar1 == 0) {
          return false;
        }
      }
      param3 = "";
      if (param_3 - 1 != uVar3) {
        param3 = ":";
      }
      iVar1 = BIO_printf(param_1,"%02x%s",(uint)*(byte *)(param_2 + uVar3),param3);
      if (iVar1 < 1) {
        return false;
      }
      uVar3 = uVar3 + 1;
      lVar2 = lVar2 + -1;
    } while (uVar3 < param_3);
  }
  iVar1 = BIO_write(param_1,&DAT_002c4dae,1);
  return 0 < iVar1;
}

