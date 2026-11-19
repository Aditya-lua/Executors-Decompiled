/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad9698
 */

undefined8 FUN_00ad9698(undefined8 *param_1,long *param_2,int param_3,void *param_4,size_t param_5)

{
  void *__dest;
  undefined8 uVar1;
  undefined *__src;
  size_t __n;
  
  if (param_3 < 0x446) {
    if (param_3 < 0x75) {
      if (param_3 < 0x40) {
        if (param_3 == 0) {
          ERR_new();
          ERR_set_debug("crypto/rsa/rsa_sign.c",0xfa,"encode_pkcs1");
          uVar1 = 0x75;
          goto LAB_00ad98f0;
        }
        if (param_3 == 4) {
          __src = &DAT_007749d8;
          __n = 0x12;
          goto LAB_00ad987c;
        }
      }
      else {
        if (param_3 == 0x40) {
          __src = &DAT_007749f9;
LAB_00ad9878:
          __n = 0xf;
          goto LAB_00ad987c;
        }
        if (param_3 == 0x5f) {
          __src = &DAT_007749b8;
          __n = 0xe;
          goto LAB_00ad987c;
        }
      }
switchD_00ad9710_default:
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_sign.c",0x100,"encode_pkcs1");
      uVar1 = 0x74;
      goto LAB_00ad98f0;
    }
    switch(param_3) {
    case 0x2a0:
      __src = &DAT_00774a1b;
      __n = 0x13;
      break;
    case 0x2a1:
      __src = &DAT_00774a2e;
      __n = 0x13;
      break;
    case 0x2a2:
      __src = &DAT_00774a41;
      __n = 0x13;
      break;
    case 0x2a3:
      __src = &DAT_00774a08;
      __n = 0x13;
      break;
    default:
      if (param_3 == 0x75) {
        __src = &DAT_007749ea;
        goto LAB_00ad9878;
      }
      if (param_3 != 0x101) goto switchD_00ad9710_default;
      __src = &DAT_007749c6;
      __n = 0x12;
    }
  }
  else {
    switch(param_3) {
    case 0x446:
      __src = &DAT_00774a54;
      __n = 0x13;
      break;
    case 0x447:
      __src = &DAT_00774a67;
      __n = 0x13;
      break;
    case 0x448:
      __src = &DAT_00774a7a;
      __n = 0x13;
      break;
    case 0x449:
      __src = &DAT_00774a8d;
      __n = 0x13;
      break;
    case 0x44a:
      __src = &DAT_00774aa0;
      __n = 0x13;
      break;
    case 1099:
      __src = &DAT_00774ab3;
      __n = 0x13;
      break;
    default:
      goto switchD_00ad9710_default;
    }
  }
LAB_00ad987c:
  __dest = CRYPTO_malloc((int)(__n + param_5),"crypto/rsa/rsa_sign.c",0x104);
  if (__dest != (void *)0x0) {
    memcpy(__dest,__src,__n);
    memcpy((void *)((long)__dest + __n),param_4,param_5);
    *param_1 = __dest;
    *param_2 = __n + param_5;
    return 1;
  }
  ERR_new();
  ERR_set_debug("crypto/rsa/rsa_sign.c",0x106,"encode_pkcs1");
  uVar1 = 0xc0100;
LAB_00ad98f0:
  ERR_set_error(4,uVar1,0);
  return 0;
}

