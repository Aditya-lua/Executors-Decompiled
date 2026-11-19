/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5ec38
 */

int EVP_CIPHER_get_type(int *param_1)

{
  int iVar1;
  ASN1_OBJECT *a;
  long lVar2;
  int iVar3;
  
  iVar3 = *param_1;
  if (iVar3 < 0x1a9) {
    if (iVar3 < 0x61) {
      if (iVar3 < 0x25) {
        if (iVar3 == 5) {
          return 5;
        }
        if (iVar3 != 0x1e) goto LAB_00a5ed10;
      }
      else {
        if (iVar3 == 0x25) {
          return 0x25;
        }
        if (iVar3 != 0x3d) goto LAB_00a5ed10;
      }
LAB_00a5ed30:
      return 0x1e;
    }
    if (iVar3 < 0xa6) {
      if (iVar3 == 0x61) {
        return 5;
      }
      if (iVar3 == 0x62) {
        return 0x25;
      }
    }
    else {
      if (iVar3 == 0xa6) {
        return 0x25;
      }
      if (iVar3 == 0x1a5) {
        return 0x1a5;
      }
    }
LAB_00a5ed10:
    a = OBJ_nid2obj(iVar3);
    lVar2 = OBJ_get0_data();
    iVar1 = 0;
    if (lVar2 != 0) {
      iVar1 = iVar3;
    }
    ASN1_OBJECT_free(a);
    return iVar1;
  }
  switch(iVar3) {
  case 0x28a:
  case 0x28d:
    return 0x1a5;
  case 0x28c:
  case 0x28f:
switchD_00a5ec98_caseD_28c:
    iVar3 = 0x1ad;
    break;
  case 0x290:
  case 0x291:
  case 0x292:
  case 0x293:
    goto LAB_00a5ed30;
  default:
    if (iVar3 != 0x1a9) {
      if (iVar3 != 0x1ad) goto LAB_00a5ed10;
      goto switchD_00a5ec98_caseD_28c;
    }
  case 0x28b:
  case 0x28e:
    iVar3 = 0x1a9;
  }
  return iVar3;
}

