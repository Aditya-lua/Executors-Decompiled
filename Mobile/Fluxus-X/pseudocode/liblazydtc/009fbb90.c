/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbb90
 */

undefined8 BIO_hex_string(BIO *param_1,uint param_2,int param_3,byte *param_4,int param_5)

{
  int iVar1;
  uint uVar2;
  bool bVar3;
  int iVar4;
  byte *pbVar5;
  ulong uVar6;
  
  uVar2 = param_5 - 1;
  if (0 < param_5) {
    if (uVar2 != 0) {
      uVar6 = (ulong)uVar2;
      iVar4 = 0;
      bVar3 = true;
      pbVar5 = param_4;
      do {
        if (!bVar3) {
          BIO_printf(param_1,"%*s",(ulong)param_2,&DAT_002ab32c);
        }
        BIO_printf(param_1,"%02X:",(uint)*pbVar5);
        iVar1 = 0;
        if (param_3 != 0) {
          iVar1 = (iVar4 + 1) / param_3;
        }
        iVar4 = (iVar4 + 1) - iVar1 * param_3;
        if (iVar4 == 0) {
          BIO_printf(param_1,"\n");
        }
        bVar3 = iVar4 != 0;
        uVar6 = uVar6 - 1;
        pbVar5 = pbVar5 + 1;
      } while (uVar6 != 0);
      if (iVar4 == 0) {
        BIO_printf(param_1,"%*s",(ulong)param_2,&DAT_002ab32c);
      }
    }
    BIO_printf(param_1,"%02X",(ulong)param_4[(int)uVar2]);
  }
  return 1;
}

