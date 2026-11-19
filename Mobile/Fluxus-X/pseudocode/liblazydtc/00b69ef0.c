/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69ef0
 */

undefined8
mbedtls_cipher_update(long *param_1,void *param_2,ulong param_3,void *param_4,ulong *param_5)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  size_t __n;
  
  lVar6 = *param_1;
  if (lVar6 == 0) {
    return 0xffff9f00;
  }
  *param_5 = 0;
  uVar1 = *(uint *)(lVar6 + 8);
  uVar7 = (ulong)uVar1 & 0x1f;
  if ((int)uVar7 == 0) {
    return 0xffff9c80;
  }
  uVar2 = uVar1 >> 0xc & 0xf;
  if (uVar2 == 9) {
    uVar4 = mbedtls_ccm_update(param_1[10],param_2,param_3,param_4,param_3,param_5);
    return uVar4;
  }
  if (uVar2 == 6) {
    uVar4 = mbedtls_gcm_update(param_1[10],param_2,param_3,param_4,param_3,param_5);
    return uVar4;
  }
  if (uVar2 == 1) {
    if (uVar7 == param_3) {
      *param_5 = param_3;
                    /* WARNING: Could not emulate address calculation at 0x00b69f84 */
                    /* WARNING: Treating indirect jump as call */
      uVar4 = (**(code **)((&mbedtls_cipher_base_lookup_table)[*(uint *)(lVar6 + 8) >> 0x1a & 0x1f]
                          + 8))(param_1[10],*(undefined4 *)((long)param_1 + 0xc),param_2,param_4);
      return uVar4;
    }
    return 0xffff9d80;
  }
  if ((uVar1 & 0xff0000) == 0x4d0000) {
    *param_5 = param_3;
    uVar4 = mbedtls_chachapoly_update(param_1[10],param_3,param_2,param_4);
    return uVar4;
  }
  if (param_2 == param_4) {
    if (param_1[6] != 0) {
      return 0xffff9f00;
    }
    uVar5 = 0;
    if ((uVar1 & 0x1f) != 0) {
      uVar5 = param_3 / uVar7;
    }
    if (param_3 != uVar5 * uVar7) {
      return 0xffff9f00;
    }
  }
  uVar4 = 0xffff9f80;
  switch(uVar2) {
  case 2:
    if (*(int *)((long)param_1 + 0xc) == 1) {
      lVar6 = param_1[6];
      uVar5 = uVar7 - lVar6;
    }
    else {
      if (*(int *)((long)param_1 + 0xc) != 0) goto LAB_00b6a22c;
      lVar6 = param_1[6];
      uVar5 = uVar7 - lVar6;
      if (param_1[2] != 0) {
        if (uVar5 < param_3) goto LAB_00b6a22c;
        goto LAB_00b6a098;
      }
    }
    if (param_3 < uVar5) {
LAB_00b6a098:
      memcpy((void *)((long)param_1 + lVar6 + 0x20),param_2,param_3);
      param_1[6] = param_1[6] + param_3;
      return 0;
    }
LAB_00b6a22c:
    lVar6 = param_1[6];
    if (lVar6 != 0) {
      __n = uVar7 - lVar6;
      memcpy((void *)((long)(param_1 + 4) + lVar6),param_2,__n);
      uVar4 = (**(code **)((&mbedtls_cipher_base_lookup_table)
                           [*(uint *)(*param_1 + 8) >> 0x1a & 0x1f] + 0x10))
                        (param_1[10],*(undefined4 *)((long)param_1 + 0xc),uVar7,param_1 + 7,
                         param_1 + 4,param_4);
      if ((int)uVar4 != 0) {
        return uVar4;
      }
      param_4 = (void *)((long)param_4 + uVar7);
      param_2 = (void *)((long)param_2 + __n);
      param_3 = param_3 - __n;
      *param_5 = *param_5 + uVar7;
      param_1[6] = 0;
    }
    if (param_3 != 0) {
      uVar5 = 0;
      if ((uVar1 & 0x1f) != 0) {
        uVar5 = param_3 / uVar7;
      }
      uVar5 = param_3 - uVar5 * uVar7;
      if (((uVar5 == 0) && (*(int *)((long)param_1 + 0xc) == 0)) && (uVar5 = 0, param_1[2] != 0)) {
        uVar5 = uVar7;
      }
      lVar6 = param_3 - uVar5;
      memcpy(param_1 + 4,(void *)((long)param_2 + lVar6),uVar5);
      param_1[6] = param_1[6] + uVar5;
      if (lVar6 != 0) {
        uVar4 = (**(code **)((&mbedtls_cipher_base_lookup_table)
                             [*(uint *)(*param_1 + 8) >> 0x1a & 0x1f] + 0x10))
                          (param_1[10],*(undefined4 *)((long)param_1 + 0xc),lVar6,param_1 + 7,
                           param_2,param_4);
        if ((int)uVar4 == 0) {
          *param_5 = *param_5 + lVar6;
          return uVar4;
        }
        return uVar4;
      }
    }
    return 0;
  case 3:
    uVar4 = (**(code **)((&mbedtls_cipher_base_lookup_table)[uVar1 >> 0x1a & 0x1f] + 0x18))
                      (param_1[10],*(undefined4 *)((long)param_1 + 0xc),param_3,param_1 + 6,
                       param_1 + 7,param_2,param_4);
    iVar3 = (int)uVar4;
    break;
  case 4:
    uVar4 = (**(code **)((&mbedtls_cipher_base_lookup_table)[uVar1 >> 0x1a & 0x1f] + 0x20))
                      (param_1[10],param_3,param_1 + 6,param_1 + 7,param_2,param_4);
    iVar3 = (int)uVar4;
    goto joined_r0x00b6a198;
  case 5:
    uVar4 = (**(code **)((&mbedtls_cipher_base_lookup_table)[uVar1 >> 0x1a & 0x1f] + 0x28))
                      (param_1[10],param_3,param_1 + 6,param_1 + 7,param_1 + 4,param_2,param_4);
    iVar3 = (int)uVar4;
joined_r0x00b6a198:
    if (iVar3 != 0) {
      return uVar4;
    }
    goto LAB_00b6a214;
  default:
    goto switchD_00b6a06c_caseD_6;
  case 7:
    uVar4 = (**(code **)((&mbedtls_cipher_base_lookup_table)[uVar1 >> 0x1a & 0x1f] + 0x38))
                      (param_1[10],param_3,param_2,param_4);
    iVar3 = (int)uVar4;
    break;
  case 10:
    if (param_1[6] != 0) {
      return 0xffff9f80;
    }
    uVar4 = (**(code **)((&mbedtls_cipher_base_lookup_table)[uVar1 >> 0x1a & 0x1f] + 0x30))
                      (param_1[10],*(undefined4 *)((long)param_1 + 0xc),param_3,param_1 + 7,param_2,
                       param_4);
    iVar3 = (int)uVar4;
  }
  if (iVar3 == 0) {
LAB_00b6a214:
    *param_5 = param_3;
  }
switchD_00b6a06c_caseD_6:
  return uVar4;
}

