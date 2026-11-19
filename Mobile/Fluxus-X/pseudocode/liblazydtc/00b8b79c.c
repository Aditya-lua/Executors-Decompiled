/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8b79c
 */

int psa_aead_encrypt(undefined8 param_1,uint param_2,void *param_3,size_t param_4,void *param_5,
                    size_t param_6,void *param_7,size_t param_8,void *param_9,size_t param_10,
                    undefined8 *param_11)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  void *__dest;
  void *__s;
  uint uVar4;
  void *local_90;
  size_t sStack_88;
  void *local_80;
  void *local_78;
  long local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  *param_11 = 0;
  if ((param_2 & 0x7f000000) != 0x5000000) {
LAB_00b8b8dc:
    iVar3 = -0x87;
    goto LAB_00b8b8e0;
  }
  uVar1 = param_2 & 0xffffff00;
  if ((int)uVar1 < 0x6000900) {
    if (uVar1 != 0x6000200) {
      uVar4 = 0x300;
      goto LAB_00b8b83c;
    }
LAB_00b8b85c:
    if ((param_2 & 0xff) == 0) goto LAB_00b8b88c;
    if ((int)uVar1 < 0x6000900) {
      if (uVar1 != 0x6000200) {
        uVar4 = 0x300;
        goto LAB_00b8b8a8;
      }
LAB_00b8b8c8:
      if ((param_2 & 0xff | 0x2000000) == 0x20000ff) goto LAB_00b8b8dc;
    }
    else {
      if (uVar1 == 0x6000900) goto LAB_00b8b8c8;
      uVar4 = 0x1300;
LAB_00b8b8a8:
      if ((uVar1 == (uVar4 | 0x6000000)) || ((param_2 >> 9 | 1) == 0x30003)) goto LAB_00b8b8c8;
    }
  }
  else {
    if (uVar1 == 0x6000900) goto LAB_00b8b85c;
    uVar4 = 0x1300;
LAB_00b8b83c:
    if ((uVar1 == (uVar4 | 0x6000000)) || ((param_2 >> 9 | 1) == 0x30003)) goto LAB_00b8b85c;
LAB_00b8b88c:
    if ((param_2 >> 0xf & 1) != 0) goto LAB_00b8b8dc;
  }
  iVar3 = FUN_00b86e5c(param_1,&local_70,0x100,param_2);
  if (iVar3 != 0) goto LAB_00b8b8e0;
  if (param_4 == 0) {
    local_78 = (void *)0x0;
    if (param_6 != 0) goto LAB_00b8b954;
LAB_00b8b9d4:
    local_80 = (void *)0x0;
    if (param_8 != 0) goto LAB_00b8b97c;
LAB_00b8b9dc:
    __dest = (void *)0x0;
    if (param_10 != 0) goto LAB_00b8b9ac;
LAB_00b8b9ec:
    local_90 = (void *)0x0;
    sStack_88 = 0;
    __s = (void *)0x0;
LAB_00b8b9f4:
    uVar1 = param_2 & 0xffc07fff;
    if (uVar1 == 0x5000500) {
      iVar3 = -0x87;
      if (param_4 == 8) {
        iVar3 = -0x86;
      }
      if (param_4 == 0xc) {
LAB_00b8ba8c:
        if (*(uint *)(local_70 + 4) < 0x100) {
          iVar3 = mbedtls_psa_aead_encrypt
                            (local_70,*(undefined8 *)(local_70 + 0x28),
                             *(undefined8 *)(local_70 + 0x30),param_2,local_78,param_4,local_80,
                             param_6,__dest,param_8,__s,param_10,param_11);
        }
        else {
          iVar3 = -0x87;
        }
        if ((param_10 != 0) && (iVar3 != 0)) {
          memset(__s,0,param_10);
        }
      }
    }
    else {
      if (uVar1 == 0x5400100) {
        if (param_4 - 7 < 7) goto LAB_00b8ba8c;
      }
      else {
        if (uVar1 != 0x5400200) {
          iVar3 = -0x86;
          goto LAB_00b8bb0c;
        }
        if (param_4 != 0) goto LAB_00b8ba8c;
      }
      iVar3 = -0x87;
    }
  }
  else {
    local_78 = calloc(param_4,1);
    if (local_78 == (void *)0x0) {
      local_80 = (void *)0x0;
      __dest = (void *)0x0;
    }
    else {
      memcpy(local_78,param_3,param_4);
      if (param_6 == 0) goto LAB_00b8b9d4;
LAB_00b8b954:
      local_80 = calloc(param_6,1);
      if (local_80 == (void *)0x0) {
        __dest = (void *)0x0;
      }
      else {
        memcpy(local_80,param_5,param_6);
        if (param_8 == 0) goto LAB_00b8b9dc;
LAB_00b8b97c:
        __dest = calloc(param_8,1);
        if (__dest != (void *)0x0) {
          memcpy(__dest,param_7,param_8);
          if (param_10 == 0) goto LAB_00b8b9ec;
LAB_00b8b9ac:
          __s = calloc(param_10,1);
          if (__s != (void *)0x0) {
            local_90 = param_9;
            sStack_88 = param_10;
            goto LAB_00b8b9f4;
          }
          sStack_88 = 0;
          local_90 = (void *)0x0;
          iVar3 = -0x8d;
          goto LAB_00b8bb0c;
        }
      }
    }
    sStack_88 = 0;
    __s = (void *)0x0;
    local_90 = (void *)0x0;
    iVar3 = -0x8d;
  }
LAB_00b8bb0c:
  free(local_78);
  free(local_80);
  free(__dest);
  if (__s != (void *)0x0) {
    if (local_90 == (void *)0x0) {
      iVar3 = -0x97;
    }
    else {
      if (sStack_88 != 0) {
        memcpy(local_90,__s,sStack_88);
      }
      free(__s);
    }
  }
  psa_unregister_read_under_mutex(local_70);
LAB_00b8b8e0:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

