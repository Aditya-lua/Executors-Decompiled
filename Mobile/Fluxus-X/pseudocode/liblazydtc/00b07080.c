/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b07080
 */

void ossl_ipaddr_to_asc(byte *param_1,int param_2)

{
  char *format;
  int iVar1;
  char *buf;
  int iVar2;
  uint uVar3;
  char acStack_78 [40];
  
  if (param_2 == 4) {
    BIO_snprintf(acStack_78,0x28,"%d.%d.%d.%d",(uint)*param_1,(uint)param_1[1],(uint)param_1[2],
                 (uint)param_1[3]);
  }
  else if (param_2 == 0x10) {
    iVar2 = 0x28;
    buf = acStack_78;
    uVar3 = 8;
    do {
      format = "%X:";
      if (uVar3 == 0 || uVar3 - 1 == 0) {
        format = "%X";
      }
      iVar1 = BIO_snprintf(buf,(long)iVar2,format,(ulong)CONCAT11(*param_1,param_1[1]));
      if (uVar3 < 2) break;
      iVar2 = iVar2 - iVar1;
      buf = buf + iVar1;
      param_1 = param_1 + 2;
      uVar3 = uVar3 - 1;
    } while (-1 < iVar1);
  }
  else {
    BIO_snprintf(acStack_78,0x28,"<invalid length=%d>",param_2);
  }
  CRYPTO_strdup(acStack_78,"crypto/x509/v3_utl.c",0x429);
  return;
}

