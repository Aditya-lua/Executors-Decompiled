/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b31bcc
 */

undefined4 FUN_00b31bcc(RIPEMD160_CTX *param_1,uchar *param_2,undefined8 *param_3,ulong param_4)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if ((0x13 < param_4) && (iVar1 != 0)) {
    iVar1 = RIPEMD160_Final(param_2,param_1);
    uVar2 = 0;
    if (iVar1 != 0) {
      uVar2 = 1;
      *param_3 = 0x14;
    }
  }
  return uVar2;
}

