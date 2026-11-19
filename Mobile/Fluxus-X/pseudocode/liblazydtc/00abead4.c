/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abead4
 */

bool FUN_00abead4(BIO *param_1,int param_2,char *param_3,char *param_4,ulong *param_5)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  
  if (param_2 < 0x15) {
    iVar2 = param_2;
  }
  else {
    do {
      iVar2 = BIO_write(param_1,"                    ",0x14);
      if (iVar2 != 0x14) goto LAB_00abebf4;
      iVar2 = param_2 + -0x14;
      bVar1 = 0x28 < param_2;
      param_2 = iVar2;
    } while (bVar1);
  }
  iVar3 = BIO_write(param_1,"                    ",iVar2);
  if (iVar3 != iVar2) {
    return false;
  }
  if ((*param_5 & 0x100) != 0) {
    param_4 = (char *)0x0;
  }
  if ((*param_5 & 0x40) != 0) {
    param_3 = (char *)0x0;
  }
  if (param_4 == (char *)0x0 && param_3 == (char *)0x0) {
    return true;
  }
  if ((param_3 == (char *)0x0) || (iVar2 = BIO_puts(param_1,param_3), 0 < iVar2)) {
    if (param_4 != (char *)0x0) {
      if (param_3 == (char *)0x0) {
        iVar2 = BIO_puts(param_1,param_4);
      }
      else {
        iVar2 = BIO_printf(param_1," (%s)",param_4);
      }
      if (iVar2 < 1) goto LAB_00abebf4;
    }
    iVar2 = BIO_write(param_1,&DAT_002d4f75,2);
    bVar1 = iVar2 == 2;
  }
  else {
LAB_00abebf4:
    bVar1 = false;
  }
  return bVar1;
}

