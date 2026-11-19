/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a654fc
 */

undefined8 evp_keymgmt_util_try_import(long *param_1,undefined8 *param_2)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  
  lVar3 = param_2[1];
  if (lVar3 == 0) {
    lVar3 = evp_keymgmt_newdata(*param_2);
    param_2[1] = lVar3;
    if (lVar3 == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/keymgmt_lib.c",0x25,"evp_keymgmt_util_try_import");
      ERR_set_error(6,0xc0100,0);
      return 0;
    }
    bVar1 = true;
    lVar4 = *param_1;
  }
  else {
    bVar1 = false;
    lVar4 = *param_1;
  }
  if ((lVar4 == 0) ||
     (iVar2 = evp_keymgmt_import(*param_2,lVar3,*(undefined4 *)(param_2 + 2),param_1), iVar2 != 0))
  {
    return 1;
  }
  if (bVar1) {
    evp_keymgmt_freedata(*param_2,param_2[1]);
    param_2[1] = 0;
    return 0;
  }
  return 0;
}

