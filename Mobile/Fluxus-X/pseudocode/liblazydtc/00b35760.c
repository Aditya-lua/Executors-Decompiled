/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b35760
 */

EVP_PKEY * b2i_PrivateKey(uchar **in,long length)

{
  undefined4 uVar1;
  undefined8 uVar2;
  EVP_PKEY *pEVar3;
  undefined4 uVar4;
  undefined4 local_18;
  int local_14;
  
  local_18 = 0;
  local_14 = -1;
  uVar2 = FUN_00b34d84(in,length,&local_14,&local_18);
  uVar4 = 0x74;
  if (local_14 != 1) {
    uVar4 = 0;
  }
  uVar1 = 6;
  if (local_14 != 0) {
    uVar1 = uVar4;
  }
  pEVar3 = (EVP_PKEY *)FUN_00b34ee4(uVar2,uVar1);
  return pEVar3;
}

