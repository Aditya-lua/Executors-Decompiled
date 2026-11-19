/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00814d90
 */

void FUN_00814d90(undefined8 *param_1,ulong param_2)

{
  int iVar1;
  void *__s;
  undefined8 uVar2;
  ulong *puVar3;
  ulong *extraout_x8;
  undefined4 *unaff_x22;
  
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if (param_2 == 0) {
    __s = (void *)0x0;
LAB_00814de8:
    unaff_x22 = &DAT_00d1b000;
    if ((DAT_00d1bff0 & 1) != 0) goto LAB_00814ed8;
                    /* try { // try from 00814df4 to 00814e0b has its CatchHandler @ 00814f50 */
    mbedtls_entropy_init(&DAT_00d1bb58);
    mbedtls_ctr_drbg_init(&DAT_00d1be98);
    puVar3 = &DAT_00d1c000;
    if ((DAT_00d1c010 & 1) == 0) goto LAB_00814f00;
  }
  else {
    if (-1 < (long)param_2) {
      __s = operator_new(param_2);
      *param_1 = __s;
      param_1[2] = (long)__s + param_2;
      memset(__s,0,param_2);
      param_1[1] = (long)__s + param_2;
      goto LAB_00814de8;
    }
    FUN_0080734c();
    puVar3 = extraout_x8;
LAB_00814f00:
    iVar1 = __cxa_guard_acquire(&DAT_00d1c010);
    if (iVar1 != 0) {
      puVar3[1] = 0x191598d5c7b1824;
      *puVar3 = 0x80f455985c731a17;
      __cxa_atexit(&LAB_00814fb4,puVar3,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1c010);
    }
  }
  if (DAT_00d1c00f == '\x01') {
    *(undefined1 *)((long)puVar3 + 0xf) = 0;
    *(byte *)((long)puVar3 + 0xc) = *(byte *)((long)puVar3 + 0xc) ^ 0xfd;
    *(byte *)((long)puVar3 + 0xd) = *(byte *)((long)puVar3 + 0xd) ^ 0x2d;
    *(byte *)((long)puVar3 + 0xe) = *(byte *)((long)puVar3 + 0xe) ^ 0x91;
    *puVar3 = *puVar3 ^ 0xe3912dfd25097b7b;
    *(uint *)(puVar3 + 1) = (uint)puVar3[1] ^ 0x25097b7b;
  }
  uVar2 = __strlen_chk(&DAT_00d1c000,0x10);
                    /* try { // try from 00814eac to 00814eeb has its CatchHandler @ 00814f50 */
  mbedtls_ctr_drbg_seed(&DAT_00d1be98,mbedtls_entropy_func,&DAT_00d1bb58,&DAT_00d1c000,uVar2);
  __s = (void *)*param_1;
  *(undefined1 *)(unaff_x22 + 0x3fc) = 1;
LAB_00814ed8:
  mbedtls_ctr_drbg_random(&DAT_00d1be98,__s,param_2);
  return;
}

