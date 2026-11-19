/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77a1c
 */

undefined8 EVP_PKEY_CTX_str2ctrl(long param_1,undefined4 param_2,char *param_3)

{
  size_t sVar1;
  undefined8 uVar2;
  
  sVar1 = strlen(param_3);
  if (sVar1 >> 0x1f == 0) {
                    /* WARNING: Could not recover jumptable at 0x00a77a80. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (**(code **)(*(long *)(param_1 + 0x78) + 0xc0))(param_1,param_2,sVar1,param_3);
    return uVar2;
  }
  return 0xffffffff;
}

