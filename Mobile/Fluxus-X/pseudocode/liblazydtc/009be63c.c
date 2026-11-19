/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be63c
 */

undefined8 ssl_clear_bad_session(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*(long *)(param_1 + 0x918) == 0) {
    uVar2 = 0;
  }
  else {
    uVar2 = 0;
    if ((*(byte *)(param_1 + 0x44) & 1) == 0) {
      iVar1 = SSL_in_init(param_1);
      uVar2 = 0;
      if (iVar1 == 0) {
        iVar1 = SSL_in_before(param_1);
        uVar2 = 0;
        if (iVar1 == 0) {
          uVar2 = 1;
          FUN_009be2fc(*(undefined8 *)(param_1 + 0xb88),*(undefined8 *)(param_1 + 0x918),1);
        }
      }
    }
  }
  return uVar2;
}

