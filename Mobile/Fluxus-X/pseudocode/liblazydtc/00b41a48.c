/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b41a48
 */

bool FUN_00b41a48(BIO *param_1,undefined8 param_2,long param_3,ulong param_4)

{
  char *param3;
  bool bVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  
  iVar2 = BIO_printf(param_1,"%s\n",param_2);
  if (iVar2 < 1) {
LAB_00b41b50:
    bVar1 = false;
  }
  else {
    if (param_4 != 0) {
      lVar3 = 0;
      uVar4 = 0;
      do {
        if ((lVar3 + (uVar4 / 0xf) * 0xf == 0) &&
           (((uVar4 != 0 && (iVar2 = BIO_printf(param_1,"\n"), iVar2 < 1)) ||
            (iVar2 = BIO_printf(param_1,"    "), iVar2 < 1)))) goto LAB_00b41b50;
        param3 = "";
        if (param_4 - 1 != uVar4) {
          param3 = ":";
        }
        iVar2 = BIO_printf(param_1,"%02x%s",(uint)*(byte *)(param_3 + uVar4),param3);
        if (iVar2 < 1) goto LAB_00b41b50;
        uVar4 = uVar4 + 1;
        lVar3 = lVar3 + -1;
      } while (uVar4 < param_4);
    }
    iVar2 = BIO_printf(param_1,"\n");
    bVar1 = 0 < iVar2;
  }
  return bVar1;
}

