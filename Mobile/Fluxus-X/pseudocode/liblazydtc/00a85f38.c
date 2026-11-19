/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a85f38
 */

int FUN_00a85f38(undefined8 param_1,undefined8 *param_2,undefined8 *param_3,int param_4)

{
  undefined4 uVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  
  if (param_2 == (undefined8 *)0x0) {
    if (DAT_00d220bc == '\x01') {
      iVar2 = DAT_00d220b8;
    }
    else {
      lVar4 = FUN_00a86158();
      if (lVar4 != 0) {
        uVar1 = EVP_CIPHER_get_nid();
        lVar4 = (long)DAT_00d220b8;
        DAT_00d220b8 = DAT_00d220b8 + 1;
        *(undefined4 *)(&DAT_00d220a8 + lVar4 * 4) = uVar1;
      }
      lVar4 = FUN_00a86200();
      if (lVar4 == 0) {
        iVar2 = DAT_00d220b8;
      }
      else {
        uVar1 = EVP_CIPHER_get_nid();
        lVar4 = (long)DAT_00d220b8;
        iVar2 = DAT_00d220b8 + 1;
        DAT_00d220b8 = iVar2;
        *(undefined4 *)(&DAT_00d220a8 + lVar4 * 4) = uVar1;
      }
      *(undefined4 *)(&DAT_00d220a8 + (long)iVar2 * 4) = 0;
      DAT_00d220bc = '\x01';
    }
    *param_3 = &DAT_00d220a8;
  }
  else {
    if (param_4 == 0x61) {
      uVar3 = FUN_00a86200();
    }
    else {
      if (param_4 != 5) {
        *param_2 = 0;
        return 0;
      }
      uVar3 = FUN_00a86158();
    }
    *param_2 = uVar3;
    iVar2 = 1;
  }
  return iVar2;
}

