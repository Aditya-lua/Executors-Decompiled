/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b1128
 */

undefined4 SSL_CIPHER_get_auth_nid(long param_1)

{
  undefined4 uVar1;
  long lVar2;
  
  uVar1 = 0;
  lVar2 = 0;
  switch(*(int *)(param_1 + 0x20)) {
  case 0:
    lVar2 = 8;
    break;
  case 1:
    break;
  case 2:
    lVar2 = 3;
    break;
  case 3:
  case 5:
  case 6:
  case 7:
  case 9:
  case 10:
  case 0xb:
  case 0xc:
  case 0xd:
  case 0xe:
  case 0xf:
  case 0x11:
  case 0x12:
  case 0x13:
  case 0x14:
  case 0x15:
  case 0x16:
  case 0x17:
  case 0x18:
  case 0x19:
  case 0x1a:
  case 0x1b:
  case 0x1c:
  case 0x1d:
  case 0x1e:
  case 0x1f:
  case 0x21:
  case 0x22:
  case 0x23:
  case 0x24:
  case 0x25:
  case 0x26:
  case 0x27:
  case 0x28:
  case 0x29:
  case 0x2a:
  case 0x2b:
  case 0x2c:
  case 0x2d:
  case 0x2e:
  case 0x2f:
  case 0x30:
  case 0x31:
  case 0x32:
  case 0x33:
  case 0x34:
  case 0x35:
  case 0x36:
  case 0x37:
  case 0x38:
  case 0x39:
  case 0x3a:
  case 0x3b:
  case 0x3c:
  case 0x3d:
  case 0x3e:
  case 0x3f:
    goto switchD_009b114c_caseD_3;
  case 4:
    lVar2 = 7;
    break;
  case 8:
    lVar2 = 1;
    break;
  case 0x10:
    lVar2 = 2;
    break;
  case 0x20:
    lVar2 = 4;
    break;
  case 0x40:
    lVar2 = 6;
    break;
  default:
    if (*(int *)(param_1 + 0x20) != 0x80) {
      return 0;
    }
    lVar2 = 5;
  }
  uVar1 = (&DAT_0074c020)[lVar2 * 2];
switchD_009b114c_caseD_3:
  return uVar1;
}

