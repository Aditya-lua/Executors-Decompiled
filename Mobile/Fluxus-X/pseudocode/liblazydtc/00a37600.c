/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a37600
 */

bool FUN_00a37600(BIO *param_1,undefined8 param_2,long param_3,ulong param_4,int param_5)

{
  byte *pbVar1;
  char *param3;
  int iVar2;
  ulong uVar3;
  undefined1 local_e8 [136];
  
  if (param_3 == 0) {
    return true;
  }
  if (param_5 < 1) {
    param_5 = 0;
  }
  else {
    if (0x7f < param_5) {
      param_5 = 0x80;
    }
    memset(local_e8,0x20,(long)param_5);
    iVar2 = BIO_write(param_1,local_e8,param_5);
    if (iVar2 < 1) {
      return false;
    }
  }
  iVar2 = BIO_printf(param_1,"%s",param_2);
  if (0 < iVar2) {
    uVar3 = 0;
    do {
      if (param_4 <= uVar3) {
        iVar2 = BIO_write(param_1,&DAT_002c4dae,1);
        return 0 < iVar2;
      }
      if ((uVar3 / 0xf) * 0xf == uVar3) {
        local_e8[0] = 10;
        memset((void *)((ulong)local_e8 | 1),0x20,(long)(param_5 + 4));
        iVar2 = BIO_write(param_1,local_e8,param_5 + 5);
        if (iVar2 < 1) {
          return false;
        }
      }
      pbVar1 = (byte *)(param_3 + uVar3);
      param3 = "";
      if (param_4 - 1 != uVar3) {
        param3 = ":";
      }
      uVar3 = uVar3 + 1;
      iVar2 = BIO_printf(param_1,"%02x%s",(uint)*pbVar1,param3);
    } while (0 < iVar2);
  }
  return false;
}

