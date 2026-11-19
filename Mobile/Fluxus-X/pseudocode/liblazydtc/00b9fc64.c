/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9fc64
 */

int mbedtls_psa_pake_setup(int *param_1,undefined8 param_2)

{
  long lVar1;
  size_t sVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  void *__s1;
  void *__s1_00;
  int *piVar6;
  undefined8 local_a8;
  int local_a0;
  undefined8 local_98;
  long local_90;
  long local_88;
  size_t local_80;
  size_t local_78;
  size_t local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  local_78 = 0;
  local_70 = 0;
  local_88 = 0;
  local_80 = 0;
  local_98 = 0;
  local_90 = 0;
  local_a8 = 0;
  local_a0 = 0;
  iVar3 = psa_crypto_driver_pake_get_password_len(param_2,&local_80);
  if (iVar3 != 0) goto LAB_00b9fed0;
  iVar3 = psa_crypto_driver_pake_get_user_len(param_2,&local_70);
  if (iVar3 != 0) goto LAB_00b9fed0;
  iVar3 = psa_crypto_driver_pake_get_peer_len(param_2,&local_78);
  if (iVar3 != 0) goto LAB_00b9fed0;
  iVar3 = psa_crypto_driver_pake_get_cipher_suite(param_2,&local_a8);
  sVar2 = local_80;
  if (iVar3 != 0) goto LAB_00b9fed0;
  pvVar5 = calloc(1,local_80);
  piVar6 = param_1 + 2;
  *(void **)piVar6 = pvVar5;
  if (pvVar5 == (void *)0x0) {
    __s1 = (void *)0x0;
LAB_00b9fe7c:
    __s1_00 = (void *)0x0;
LAB_00b9fe80:
    iVar3 = -0x8d;
  }
  else {
    __s1 = calloc(1,local_70);
    if (__s1 == (void *)0x0) goto LAB_00b9fe7c;
    __s1_00 = calloc(1,local_78);
    if (__s1_00 == (void *)0x0) goto LAB_00b9fe80;
    iVar3 = psa_crypto_driver_pake_get_password(param_2,pvVar5,sVar2,&local_98);
    if (iVar3 == 0) {
      iVar3 = psa_crypto_driver_pake_get_user(param_2,__s1,local_70,&local_88);
      if (iVar3 == 0) {
        iVar3 = psa_crypto_driver_pake_get_peer(param_2,__s1_00,local_78,&local_90);
        if (iVar3 == 0) {
          *(undefined8 *)(param_1 + 4) = local_98;
          *param_1 = (int)local_a8;
          if ((((int)local_a8 == 0xa000100) && (local_a8._4_1_ == '\x01')) &&
             (local_a8._5_1_ == '\x12')) {
            iVar3 = -0x86;
            if (((local_a8._6_2_ == 0x100) && (local_a0 == 0x2000009)) &&
               ((iVar3 = -0x86, local_88 == 6 && (local_90 == 6)))) {
              iVar3 = memcmp(__s1,&DAT_00787abe,6);
              if ((iVar3 == 0) && (iVar3 = memcmp(__s1_00,&DAT_00787ac4,6), iVar3 == 0)) {
                param_1[6] = 0;
              }
              else {
                iVar3 = memcmp(__s1,&DAT_00787ac4,6);
                if ((iVar3 != 0) || (iVar3 = memcmp(__s1_00,&DAT_00787abe,6), iVar3 != 0))
                goto LAB_00b9fe70;
                param_1[6] = 1;
              }
              param_1[0x5c] = 0;
              param_1[0x5d] = 0;
              param_1[0x5e] = 0;
              param_1[0x5f] = 0;
              mbedtls_ecjpake_init(param_1 + 0x60);
              iVar4 = mbedtls_ecjpake_setup
                                (param_1 + 0x60,param_1[6],9,3,*(undefined8 *)(param_1 + 2),
                                 *(undefined8 *)(param_1 + 4));
              mbedtls_platform_zeroize(*(undefined8 *)(param_1 + 2),*(undefined8 *)(param_1 + 4));
              iVar3 = -0x8a;
              if (iVar4 < -0x4c80) {
                if (iVar4 < -0x4f00) {
                  if (iVar4 == -0x5080) goto LAB_00b9fe70;
                  if (iVar4 != -0x4f80) goto LAB_00b9fff4;
                }
                else {
                  if (iVar4 == -0x4f00) goto LAB_00b9fe84;
                  if (iVar4 != -0x4e00) goto LAB_00b9fff4;
                }
LAB_00b9ffec:
                iVar3 = -0x99;
              }
              else if (iVar4 < -8) {
                if (iVar4 == -0x4c80) goto LAB_00b9ffec;
                if (iVar4 != -0x6e) goto LAB_00b9fff4;
                iVar3 = -0x97;
              }
              else if (iVar4 != -8) {
                if (iVar4 == -4) goto LAB_00b9ffec;
                if (iVar4 == 0) {
                  free(__s1);
                  free(__s1_00);
                  iVar3 = 0;
                  goto LAB_00b9fed0;
                }
LAB_00b9fff4:
                iVar3 = -0x84;
              }
            }
          }
          else {
LAB_00b9fe70:
            iVar3 = -0x86;
          }
        }
      }
    }
  }
LAB_00b9fe84:
  free(__s1);
  free(__s1_00);
  mbedtls_zeroize_and_free(*(undefined8 *)(param_1 + 2),*(undefined8 *)(param_1 + 4));
  piVar6[0] = 0;
  piVar6[1] = 0;
  param_1[4] = 0;
  param_1[5] = 0;
  if (*param_1 == 0xa000100) {
    param_1[6] = 2;
    mbedtls_platform_zeroize(param_1 + 7,0x150);
    param_1[0x5c] = 0;
    param_1[0x5d] = 0;
    param_1[0x5e] = 0;
    param_1[0x5f] = 0;
    mbedtls_ecjpake_free(param_1 + 0x60);
  }
  *param_1 = 0;
LAB_00b9fed0:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

