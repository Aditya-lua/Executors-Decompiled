/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81ee0
 */

undefined4 FUN_00a81ee0(undefined8 param_1,long param_2)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  long *plVar4;
  int iVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  long *plVar8;
  undefined4 local_68;
  int local_64;
  
  iVar3 = *(int *)(param_2 + 8);
  uVar7 = 1;
  iVar5 = iVar3;
  if (iVar3 == 0) {
    iVar5 = 1;
  }
  iVar2 = 0x16;
  if (iVar3 != 0) {
    iVar2 = iVar3;
  }
  if (iVar5 <= iVar2) {
    uVar6 = 1;
    do {
      local_68 = 0;
      plVar4 = (long *)ossl_provider_query_operation(param_1,iVar5,&local_68);
      uVar7 = local_68;
      local_64 = 0;
      iVar3 = (**(code **)(param_2 + 0x18))(local_68,*(undefined8 *)(param_2 + 0x38));
      if (iVar3 == 0) {
        iVar3 = -1;
      }
      else {
        if (*(code **)(param_2 + 0x10) == (code *)0x0) {
          local_64 = 1;
joined_r0x00a81fd4:
          if ((plVar4 != (long *)0x0) && (*plVar4 != 0)) {
            plVar8 = plVar4;
            do {
              (**(code **)(param_2 + 0x20))(param_1,plVar8,uVar7,*(undefined8 *)(param_2 + 0x38));
              plVar8 = plVar8 + 4;
            } while (*plVar8 != 0);
          }
          if (*(code **)(param_2 + 0x30) == (code *)0x0) {
LAB_00a82004:
            local_64 = 1;
          }
          else {
            iVar3 = (**(code **)(param_2 + 0x30))
                              (param_1,iVar5,uVar7,*(undefined8 *)(param_2 + 0x38),&local_64);
            if (iVar3 == 0) goto LAB_00a81ffc;
          }
        }
        else {
          iVar3 = (**(code **)(param_2 + 0x10))
                            (param_1,iVar5,uVar7,*(undefined8 *)(param_2 + 0x38),&local_64);
          if (iVar3 != 0) {
            if (local_64 != 0) goto joined_r0x00a81fd4;
            goto LAB_00a82004;
          }
LAB_00a81ffc:
          local_64 = -1;
        }
        (**(code **)(param_2 + 0x28))(*(undefined8 *)(param_2 + 0x38));
        iVar3 = local_64;
      }
      ossl_provider_unquery_operation(param_1,iVar5,plVar4);
      if (iVar3 < 0) {
        return 0;
      }
      uVar7 = 0;
      if (iVar3 != 0) {
        uVar7 = uVar6;
      }
      bVar1 = iVar5 < iVar2;
      iVar5 = iVar5 + 1;
      uVar6 = uVar7;
    } while (bVar1);
  }
  return uVar7;
}

