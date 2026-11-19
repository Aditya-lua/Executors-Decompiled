/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8b4dc
 */

int psa_cipher_decrypt(undefined8 param_1,uint param_2,void *param_3,size_t param_4,void *param_5,
                      size_t param_6,undefined8 *param_7)

{
  ushort uVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  ushort *puVar6;
  void *__dest;
  void *__src;
  ushort *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_70 = (ushort *)0x0;
  if ((param_2 & 0x7f000000) == 0x4000000) {
    iVar3 = FUN_00b86e5c(param_1,&local_70,0x200,param_2);
    puVar6 = local_70;
    if (iVar3 != 0) {
      __dest = (void *)0x0;
      param_6 = 0;
      __src = (void *)0x0;
      param_5 = (void *)0x0;
      goto LAB_00b8b57c;
    }
    uVar1 = *local_70;
    if (((uVar1 & 0x7000) == 0x2000) && ((uVar1 & 0x700) != 0)) {
      if ((int)param_2 < 0x4c01000) {
        if (((param_2 == 0x4404000) || (param_2 == 0x4404100)) || (param_2 == 0x440ff00))
        goto LAB_00b8b67c;
        goto LAB_00b8b68c;
      }
      if (((param_2 != 0x4c01000) && (param_2 != 0x4c01200)) && (param_2 != 0x4c01100))
      goto LAB_00b8b68c;
LAB_00b8b67c:
      uVar5 = 1 << (ulong)(uVar1 >> 8 & 7);
    }
    else {
LAB_00b8b68c:
      if ((param_2 == 0x4800100) && (uVar1 == 0x2004)) {
        uVar5 = 0xc;
      }
      else {
        uVar5 = 0xd;
        if (param_2 != 0x4c01300) {
          uVar5 = 0;
        }
      }
    }
    if (param_4 < uVar5) goto LAB_00b8b568;
    if (param_4 == 0) {
      __dest = (void *)0x0;
      if (param_6 == 0) goto LAB_00b8b724;
LAB_00b8b6fc:
      __src = calloc(param_6,1);
      if (__src == (void *)0x0) goto LAB_00b8b784;
    }
    else {
      __dest = calloc(param_4,1);
      if (__dest == (void *)0x0) {
        __src = (void *)0x0;
LAB_00b8b784:
        param_6 = 0;
        param_5 = (void *)0x0;
        iVar3 = -0x8d;
        goto LAB_00b8b57c;
      }
      memcpy(__dest,param_3,param_4);
      if (param_6 != 0) goto LAB_00b8b6fc;
LAB_00b8b724:
      __src = (void *)0x0;
      param_5 = (void *)0x0;
    }
    if (0xff < *(uint *)(puVar6 + 2)) goto LAB_00b8b578;
    iVar3 = mbedtls_psa_cipher_decrypt
                      (puVar6,*(undefined8 *)(puVar6 + 0x14),*(undefined8 *)(puVar6 + 0x18),param_2,
                       __dest,param_4,__src,param_6,param_7);
    iVar4 = psa_unregister_read_under_mutex(local_70);
    if (iVar3 == 0) {
      if (iVar4 == 0) {
        iVar3 = 0;
        goto LAB_00b8b588;
      }
      iVar3 = iVar4;
    }
  }
  else {
LAB_00b8b568:
    __dest = (void *)0x0;
    param_6 = 0;
    __src = (void *)0x0;
    param_5 = (void *)0x0;
    puVar6 = local_70;
LAB_00b8b578:
    iVar3 = -0x87;
LAB_00b8b57c:
    psa_unregister_read_under_mutex(puVar6);
  }
  *param_7 = 0;
LAB_00b8b588:
  free(__dest);
  if (__src != (void *)0x0) {
    if (param_5 == (void *)0x0) {
      iVar3 = -0x97;
    }
    else {
      if (param_6 != 0) {
        memcpy(param_5,__src,param_6);
      }
      free(__src);
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

