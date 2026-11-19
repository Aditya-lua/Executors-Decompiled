/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeb804
 */

undefined8
FUN_00aeb804(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 *param_6)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = ossl_namemap_stored(*param_6);
  if (((lVar2 == 0) || (iVar1 = ossl_namemap_name2num(lVar2,param_4), iVar1 == 0)) ||
     ((param_1 == 0 && (param_1 = ossl_lib_ctx_get_data(*param_6,0xf,&DAT_00c7deb8), param_1 == 0)))
     ) {
    return 0;
  }
  uVar3 = ossl_method_store_add(param_1,param_3,iVar1,param_5,param_2,&LAB_00aebb84,&LAB_00aebba8);
  return uVar3;
}

