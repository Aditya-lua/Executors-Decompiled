/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8602c
 */

int FUN_00a8602c(undefined8 param_1,undefined8 *param_2,undefined8 *param_3,int param_4)

{
  undefined4 uVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  
  if (param_2 == (undefined8 *)0x0) {
    if (DAT_00d220cc == '\x01') {
      iVar2 = DAT_00d220c8;
    }
    else {
      lVar4 = FUN_00a86388();
      if (lVar4 == 0) {
        iVar2 = DAT_00d220c8;
      }
      else {
        uVar1 = EVP_MD_get_type();
        lVar4 = (long)DAT_00d220c8;
        iVar2 = DAT_00d220c8 + 1;
        DAT_00d220c8 = iVar2;
        *(undefined4 *)(&DAT_00d220c0 + lVar4 * 4) = uVar1;
      }
      *(undefined4 *)(&DAT_00d220c0 + (long)iVar2 * 4) = 0;
      DAT_00d220cc = '\x01';
    }
    *param_3 = &DAT_00d220c0;
  }
  else if (param_4 == 0x40) {
    uVar3 = FUN_00a86388();
    *param_2 = uVar3;
    iVar2 = 1;
  }
  else {
    iVar2 = 0;
    *param_2 = 0;
  }
  return iVar2;
}

