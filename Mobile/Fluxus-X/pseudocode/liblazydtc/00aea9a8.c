/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea9a8
 */

ulong OSSL_STORE_supports_search(long *param_1,undefined4 param_2)

{
  bool bVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  undefined4 local_80 [12];
  
  if (param_1[1] == 0) goto LAB_00aeaabc;
  OSSL_STORE_LOADER_get0_provider();
  ossl_provider_ctx();
  if (*(code **)(param_1[1] + 0xa0) == (code *)0x0) goto LAB_00aeaadc;
  uVar2 = (**(code **)(param_1[1] + 0xa0))();
  lVar3 = OSSL_PARAM_locate_const(uVar2,"subject");
  lVar4 = OSSL_PARAM_locate_const(uVar2,&DAT_002cde11);
  lVar5 = OSSL_PARAM_locate_const(uVar2,"serial");
  lVar6 = OSSL_PARAM_locate_const(uVar2,"fingerprint");
  lVar7 = OSSL_PARAM_locate_const(uVar2,"alias");
  switch(param_2) {
  case 1:
    bVar1 = lVar3 == 0;
    break;
  case 2:
    uVar8 = (ulong)(lVar4 != 0 && lVar5 != 0);
    lVar3 = param_1[1];
    goto joined_r0x00aeaa7c;
  case 3:
    bVar1 = lVar6 == 0;
    break;
  case 4:
    bVar1 = lVar7 == 0;
    break;
  default:
    uVar8 = 0;
    lVar3 = param_1[1];
joined_r0x00aeaa7c:
    if (lVar3 != 0) {
      return uVar8;
    }
    goto LAB_00aeaabc;
  }
  uVar8 = (ulong)!bVar1;
  if (param_1[1] == 0) {
LAB_00aeaabc:
    if (*(code **)(*param_1 + 0x30) == (code *)0x0) {
LAB_00aeaadc:
      uVar8 = 0;
    }
    else {
      local_80[0] = param_2;
      uVar8 = (**(code **)(*param_1 + 0x30))(0,local_80);
    }
  }
  return uVar8;
}

