/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f810c
 */

long ossl_asn1_do_adb(long param_1,long param_2,int param_3)

{
  int iVar1;
  long lVar2;
  ASN1_OBJECT *o;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long local_38;
  
  if ((*(byte *)(param_2 + 1) & 3) == 0) {
    return param_2;
  }
  lVar2 = (**(code **)(param_2 + 0x20))();
  o = *(ASN1_OBJECT **)(param_1 + *(long *)(lVar2 + 8));
  if (o == (ASN1_OBJECT *)0x0) {
    lVar2 = *(long *)(lVar2 + 0x30);
  }
  else {
    if ((*(byte *)(param_2 + 1) & 1) == 0) {
      local_38 = ASN1_INTEGER_get((ASN1_INTEGER *)o);
    }
    else {
      iVar1 = OBJ_obj2nid(o);
      local_38 = (long)iVar1;
    }
    if ((*(code **)(lVar2 + 0x10) != (code *)0x0) &&
       (iVar1 = (**(code **)(lVar2 + 0x10))(&local_38), iVar1 == 0)) {
      ERR_new();
      uVar3 = 0x103;
      goto LAB_009f8204;
    }
    if (0 < *(long *)(lVar2 + 0x20)) {
      lVar4 = 0;
      lVar5 = *(long *)(lVar2 + 0x18) + 8;
      do {
        if (*(long *)(lVar5 + -8) == local_38) {
          return lVar5;
        }
        lVar4 = lVar4 + 1;
        lVar5 = lVar5 + 0x30;
      } while (lVar4 < *(long *)(lVar2 + 0x20));
    }
    lVar2 = *(long *)(lVar2 + 0x28);
  }
  if (lVar2 != 0) {
    return lVar2;
  }
  if (param_3 == 0) {
    return 0;
  }
  ERR_new();
  uVar3 = 0x11c;
LAB_009f8204:
  ERR_set_debug("crypto/asn1/tasn_utl.c",uVar3,"ossl_asn1_do_adb");
  ERR_set_error(0xd,0xa4,0);
  return 0;
}

