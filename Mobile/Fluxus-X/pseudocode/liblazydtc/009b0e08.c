/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0e08
 */

undefined4 SSL_CIPHER_get_cipher_nid(long param_1)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  
  uVar2 = 0;
  if (param_1 != 0) {
    iVar1 = *(int *)(param_1 + 0x24);
    uVar2 = 0;
    if (iVar1 < 0x1000) {
      if (iVar1 < 0x80) {
        lVar3 = 0;
        switch(iVar1) {
        case 1:
          break;
        case 2:
          lVar3 = 1;
          break;
        default:
          goto switchD_009b0e44_caseD_3;
        case 4:
          lVar3 = 2;
          break;
        case 8:
          lVar3 = 3;
          break;
        case 0x10:
          lVar3 = 4;
          break;
        case 0x20:
          lVar3 = 5;
          break;
        case 0x40:
          lVar3 = 6;
        }
      }
      else if (iVar1 < 0x200) {
        if (iVar1 == 0x80) {
          lVar3 = 7;
        }
        else {
          if (iVar1 != 0x100) {
            return 0;
          }
          lVar3 = 8;
        }
      }
      else if (iVar1 == 0x200) {
        lVar3 = 9;
      }
      else if (iVar1 == 0x400) {
        lVar3 = 10;
      }
      else {
        if (iVar1 != 0x800) {
          return 0;
        }
        lVar3 = 0xb;
      }
    }
    else if (iVar1 < 0x40000) {
      if (iVar1 < 0x8000) {
        if (iVar1 == 0x1000) {
          lVar3 = 0xc;
        }
        else if (iVar1 == 0x2000) {
          lVar3 = 0xd;
        }
        else {
          if (iVar1 != 0x4000) {
            return 0;
          }
          lVar3 = 0xe;
        }
      }
      else if (iVar1 == 0x8000) {
        lVar3 = 0xf;
      }
      else if (iVar1 == 0x10000) {
        lVar3 = 0x10;
      }
      else {
        if (iVar1 != 0x20000) {
          return 0;
        }
        lVar3 = 0x11;
      }
    }
    else if (iVar1 < 0x200000) {
      if (iVar1 == 0x40000) {
        lVar3 = 0x12;
      }
      else if (iVar1 == 0x80000) {
        lVar3 = 0x13;
      }
      else {
        if (iVar1 != 0x100000) {
          return 0;
        }
        lVar3 = 0x14;
      }
    }
    else if (iVar1 == 0x200000) {
      lVar3 = 0x15;
    }
    else if (iVar1 == 0x400000) {
      lVar3 = 0x16;
    }
    else {
      if (iVar1 != 0x800000) {
        return 0;
      }
      lVar3 = 0x17;
    }
    uVar2 = (&DAT_0074be60)[lVar3 * 2];
  }
switchD_009b0e44_caseD_3:
  return uVar2;
}

