/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3ddfc
 */

long ossl_ecx_key_op(X509_ALGOR *param_1,void *param_2,int param_3,int param_4,int param_5,
                    undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  long lVar2;
  byte *__dest;
  undefined8 uVar3;
  size_t __n;
  undefined4 uVar4;
  int local_44;
  
  if (param_5 != 2) {
    if (param_1 != (X509_ALGOR *)0x0) {
      X509_ALGOR_get0((ASN1_OBJECT **)0x0,&local_44,(void **)0x0,param_1);
      if (local_44 != -1) {
        ERR_new();
        uVar3 = 0xad;
        goto LAB_00a3e09c;
      }
      iVar1 = OBJ_obj2nid(param_1->algorithm);
      if (param_4 == 0) {
        param_4 = iVar1;
      }
      else if (iVar1 != param_4) {
        ERR_new();
        uVar3 = 0xb3;
        goto LAB_00a3e09c;
      }
    }
    if ((param_2 != (void *)0x0) && (param_4 != 0)) {
      iVar1 = 0x20;
      if ((param_4 != 0x40a) && ((param_4 != 0x43f && (iVar1 = 0x38, param_4 != 0x40b)))) {
        iVar1 = 0x39;
      }
      if (iVar1 == param_3) goto LAB_00a3de34;
    }
    ERR_new();
    uVar3 = 0xb9;
LAB_00a3e09c:
    ERR_set_debug("crypto/ec/ecx_backend.c",uVar3,"ossl_ecx_key_op");
    ERR_set_error(0x10,0x66,0);
    return 0;
  }
LAB_00a3de34:
  if ((param_4 == 0x43f) || (param_4 == 0x40a)) {
    uVar4 = 0;
    if (param_4 != 0x40a) {
      uVar4 = 2;
    }
  }
  else {
    uVar4 = 3;
    if (param_4 == 0x40b) {
      uVar4 = 1;
    }
  }
  lVar2 = ossl_ecx_key_new(param_6,uVar4,1,param_7);
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecx_backend.c",0xc0,"ossl_ecx_key_op");
    ERR_set_error(0x10,0xc0100,0);
    return 0;
  }
  if (param_5 == 0) {
    memcpy((void *)(lVar2 + 0x11),param_2,(long)param_3);
    return lVar2;
  }
  __dest = (byte *)ossl_ecx_key_allocate_privkey(lVar2);
  if (__dest == (byte *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecx_backend.c",0xca,"ossl_ecx_key_op");
    uVar3 = 0xc0100;
  }
  else {
    if (param_5 == 2) {
      if (param_4 != 0) {
        uVar3 = 0x20;
        if (((param_4 != 0x40a) && (param_4 != 0x43f)) && (uVar3 = 0x38, param_4 != 0x40b)) {
          uVar3 = 0x39;
        }
        iVar1 = RAND_priv_bytes_ex(param_6,__dest,uVar3,0);
        if (iVar1 < 1) goto LAB_00a3e044;
        if (param_4 == 0x40a) {
          *__dest = *__dest & 0xf8;
          __dest[0x1f] = __dest[0x1f] & 0x3f | 0x40;
        }
        else if (param_4 == 0x40b) {
          *__dest = *__dest & 0xfc;
          __dest[0x37] = __dest[0x37] | 0x80;
        }
      }
    }
    else {
      __n = 0x20;
      if (((param_4 != 0x40a) && (param_4 != 0x43f)) && (__n = 0x38, param_4 != 0x40b)) {
        __n = 0x39;
      }
      memcpy(__dest,param_2,__n);
    }
    iVar1 = ossl_ecx_public_from_private(lVar2);
    if (iVar1 != 0) {
      return lVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ecx_backend.c",0xde,"ossl_ecx_key_op");
    uVar3 = 0xa6;
  }
  ERR_set_error(0x10,uVar3,0);
LAB_00a3e044:
  ossl_ecx_key_free(lVar2);
  return 0;
}

