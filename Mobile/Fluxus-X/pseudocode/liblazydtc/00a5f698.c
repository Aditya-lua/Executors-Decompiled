/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f698
 */

undefined8 EVP_MD_names_do_all(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  if (*(long *)(param_1 + 0x70) == 0) {
    return 1;
  }
  uVar1 = evp_names_do_all(*(long *)(param_1 + 0x70),*(undefined4 *)(param_1 + 0x58),param_2,param_3
                          );
  return uVar1;
}

