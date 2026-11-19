/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86444
 */

int mbedtls_to_psa_error(int param_1)

{
  if ((-param_1 & 0x7fU) != 0) {
    param_1 = -(-param_1 & 0x7fU);
  }
  if (param_1 < -0x3900) {
    if (param_1 < -0x4400) {
      if (param_1 < -0x5080) {
        if (param_1 < -0x6100) {
          if (param_1 < -0x6280) {
            if (param_1 == -0x6380) {
              return -0x97;
            }
            if (param_1 == -0x6300) {
              return -0x95;
            }
          }
          else {
            if (param_1 == -0x6280) {
              return -0x87;
            }
            if (param_1 == -0x6200) {
              return -0x96;
            }
            if (param_1 == -0x6180) {
              return -0x8d;
            }
          }
        }
        else if (param_1 < -0x5200) {
          if (param_1 == -0x6100) {
            return -0x87;
          }
          if (param_1 == -0x6080) {
            return -0x86;
          }
        }
        else {
          if (param_1 == -0x5200) {
            return -0x92;
          }
          if (param_1 == -0x5180) {
            return -0x8d;
          }
          if (param_1 == -0x5100) {
            return -0x87;
          }
        }
      }
      else if (param_1 < -0x4d80) {
        if (param_1 < -0x4f00) {
          if (param_1 == -0x5080) {
            return -0x86;
          }
          if (param_1 == -0x4f80) {
            return -0x87;
          }
        }
        else {
          if (param_1 == -0x4f00) {
            return -0x8a;
          }
          if (param_1 == -0x4e80) {
            return -0x86;
          }
          if (param_1 == -0x4e00) {
            return -0x95;
          }
        }
      }
      else if (param_1 < -0x4c80) {
        if (param_1 == -0x4d80) {
          return -0x8d;
        }
        if (param_1 == -0x4d00) {
          return -0x94;
        }
      }
      else {
        if (param_1 == -0x4c80) {
          return -0x87;
        }
        if (param_1 == -0x4c00) {
          return -0x95;
        }
        if (param_1 == -0x4480) {
          return -0x94;
        }
      }
    }
    else if (param_1 < -16000) {
      if (param_1 < -0x4180) {
        if (param_1 < -0x4300) {
          if (param_1 == -0x4400) {
            return -0x8a;
          }
          if (param_1 == -0x4380) {
            return -0x95;
          }
        }
        else {
          if ((param_1 == -0x4300) || (param_1 == -0x4280)) {
            return -0x97;
          }
          if (param_1 == -0x4200) {
            return -0x87;
          }
        }
      }
      else if (param_1 < -0x4080) {
        if (param_1 == -0x4180) {
          return -0x93;
        }
        if (param_1 == -0x4100) {
          return -0x96;
        }
      }
      else {
        if (param_1 == -0x4080) {
          return -0x87;
        }
        if (param_1 == -0x3f80) {
          return -0x8d;
        }
        if (param_1 == -0x3f00) {
          return -0x87;
        }
      }
    }
    else if (param_1 < -0x3c00) {
      if (param_1 < -0x3d80) {
        if (param_1 == -16000) {
          return -0x87;
        }
        if (param_1 == -0x3e00) {
          return -0x92;
        }
      }
      else {
        if ((param_1 == -0x3d80) || (param_1 == -0x3d00)) {
          return -0x87;
        }
        if (param_1 == -0x3c80) {
          return -0x86;
        }
      }
    }
    else if (param_1 < -0x3a80) {
      if ((param_1 == -0x3c00) || (param_1 == -0x3b80)) {
        return -0x85;
      }
      if (param_1 == -0x3b00) {
        return -0x87;
      }
    }
    else if (((param_1 == -0x3a80) || (param_1 == -0x3a00)) || (param_1 == -0x3980)) {
      return -0x86;
    }
  }
  else {
    switch(param_1) {
    case 0:
      goto switchD_00b864d8_caseD_0;
    case -0x72:
      return -0x86;
    case -0x71:
    case -0x6f:
    case -0x6d:
    case -0x6b:
    case -0x69:
    case -0x67:
    case -0x65:
    case -99:
    case -0x61:
    case -0x5f:
    case -0x5e:
    case -0x5d:
    case -0x5c:
    case -0x5b:
    case -0x5a:
    case -0x59:
    case -0x58:
    case -0x57:
    case -0x55:
    case -0x53:
    case -0x52:
    case -0x50:
    case -0x4f:
    case -0x4e:
    case -0x4d:
    case -0x4c:
    case -0x4b:
    case -0x4a:
    case -0x49:
    case -0x48:
    case -0x47:
    case -0x46:
    case -0x45:
    case -0x44:
    case -0x43:
    case -0x42:
    case -0x41:
    case -0x3f:
    case -0x3e:
    case -0x3b:
    case -0x39:
    case -0x37:
    case -0x35:
    case -0x33:
    case -0x31:
    case -0x30:
    case -0x2f:
    case -0x2e:
    case -0x2d:
    case -0x2c:
    case -0x2b:
    case -0x2a:
    case -0x29:
    case -0x28:
    case -0x27:
    case -0x25:
    case -0x23:
    case -0x1f:
    case -0x1e:
    case -0x1d:
    case -0x1c:
    case -0x1b:
    case -0x1a:
    case -0x19:
    case -0x18:
    case -0x17:
    case -0x15:
    case -0x13:
    case -0x11:
    case -0xb:
    case -9:
    case -7:
    case -5:
    case -3:
    case -1:
      break;
    case -0x70:
      return -0x93;
    case -0x6e:
      return -0x97;
    case -0x6c:
      return -0x8a;
    case -0x6a:
      return -0x8d;
    case -0x68:
    case -0x66:
    case -100:
    case -0x62:
    case -0x60:
    case -0x21:
      return -0x87;
    case -0x56:
      return -0x95;
    case -0x54:
      return -0x89;
    case -0x51:
      return -0x87;
    case -0x40:
    case -0x3d:
    case -0x3c:
      return -0x94;
    case -0x3a:
      return -0x94;
    case -0x38:
    case -0x36:
      return -0x86;
    case -0x34:
      return -0x94;
    case -0x32:
      return -0x86;
    case -0x26:
    case -0x24:
      return -0x86;
    case -0x22:
    case -0x20:
      return -0x86;
    case -0x16:
      return -0x8a;
    case -0x14:
      return -0x87;
    case -0x12:
      return -0x95;
    case -0x10:
      return -0x8d;
    case -0xf:
      return -0x95;
    case -0xe:
    case -0xc:
    case -10:
      return -0x87;
    case -0xd:
      return -0x87;
    case -8:
      return -0x8a;
    case -6:
    case -4:
      return -0x87;
    case -2:
      return -0x92;
    default:
      if (param_1 == -0x3900) {
        return -0x95;
      }
      if (param_1 == -0x3880) {
        return -0x8a;
      }
    }
  }
  param_1 = -0x84;
switchD_00b864d8_caseD_0:
  return param_1;
}

