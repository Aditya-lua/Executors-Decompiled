/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c518
 */

int mbedtls_hmac_drbg_seed
              (long param_1,undefined8 param_2,code *param_3,undefined8 param_4,void *param_5,
              ulong param_6)

{
  long lVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  undefined1 auStack_1f0 [384];
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  iVar3 = mbedtls_md_setup(param_1,param_2,1);
  if (iVar3 == 0) {
    uVar4 = mbedtls_md_get_size(param_2);
    uVar4 = uVar4 & 0xff;
    iVar3 = mbedtls_md_hmac_starts(param_1,(void *)(param_1 + 0x18),uVar4);
    if (iVar3 == 0) {
      memset((void *)(param_1 + 0x18),1,uVar4);
      lVar5 = *(long *)(param_1 + 0x60);
      *(code **)(param_1 + 0x70) = param_3;
      *(undefined8 *)(param_1 + 0x78) = param_4;
      if (lVar5 == 0) {
        lVar1 = 0x18;
        if (0x1c < (uint)uVar4) {
          lVar1 = 0x20;
        }
        lVar5 = 0x10;
        if (0x14 < (uint)uVar4) {
          lVar5 = lVar1;
        }
        *(long *)(param_1 + 0x60) = lVar5;
      }
      iVar3 = -5;
      if ((param_6 < 0x101) && (param_6 + ((ulong)(lVar5 * 3) >> 1) < 0x181)) {
        memset(auStack_1f0,0,0x180);
        iVar3 = (*param_3)(param_4,auStack_1f0,lVar5);
        if (iVar3 == 0) {
          uVar4 = *(ulong *)(param_1 + 0x60);
          iVar3 = (**(code **)(param_1 + 0x70))
                            (*(undefined8 *)(param_1 + 0x78),auStack_1f0 + uVar4,uVar4 >> 1);
          if (iVar3 == 0) {
            lVar5 = uVar4 + (*(ulong *)(param_1 + 0x60) >> 1);
            if ((param_5 != (void *)0x0) && (param_6 != 0)) {
              memcpy(auStack_1f0 + lVar5,param_5,param_6);
              lVar5 = lVar5 + param_6;
            }
            iVar3 = mbedtls_hmac_drbg_update(param_1,auStack_1f0,lVar5);
            if (iVar3 == 0) {
              *(undefined4 *)(param_1 + 0x58) = 1;
            }
            mbedtls_platform_zeroize(auStack_1f0,lVar5);
            goto LAB_00b9c630;
          }
        }
        iVar3 = -9;
      }
    }
  }
LAB_00b9c630:
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

