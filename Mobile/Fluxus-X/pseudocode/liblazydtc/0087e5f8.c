/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087e5f8
 */

undefined8 FUN_0087e5f8(undefined8 *param_1,long param_2)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  char *__s1;
  char *pcVar4;
  
  __s1 = (char *)*param_1;
  if (__s1 != (char *)0x0) {
    iVar1 = strcmp(__s1,"math");
    if ((iVar1 == 0) && (pcVar4 = (char *)param_1[1], pcVar4 != (char *)0x0)) {
      iVar1 = strcmp(pcVar4,"abs");
      if (iVar1 == 0) {
        return 2;
      }
      iVar1 = strcmp(pcVar4,"acos");
      if (iVar1 == 0) {
        return 3;
      }
      iVar1 = strcmp(pcVar4,"asin");
      if (iVar1 == 0) {
        return 4;
      }
      iVar1 = strcmp(pcVar4,"atan2");
      if (iVar1 == 0) {
        return 5;
      }
      iVar1 = strcmp(pcVar4,"atan");
      if (iVar1 == 0) {
        return 6;
      }
      iVar1 = strcmp(pcVar4,"ceil");
      if (iVar1 == 0) {
        return 7;
      }
      iVar1 = strcmp(pcVar4,"cosh");
      if (iVar1 == 0) {
        return 8;
      }
      iVar1 = strcmp(pcVar4,"cos");
      if (iVar1 == 0) {
        return 9;
      }
      iVar1 = strcmp(pcVar4,"deg");
      if (iVar1 == 0) {
        return 10;
      }
      iVar1 = strcmp(pcVar4,"exp");
      if (iVar1 == 0) {
        return 0xb;
      }
      iVar1 = strcmp(pcVar4,"floor");
      if (iVar1 == 0) {
        return 0xc;
      }
      iVar1 = strcmp(pcVar4,"fmod");
      if (iVar1 == 0) {
        return 0xd;
      }
      iVar1 = strcmp(pcVar4,"frexp");
      if (iVar1 == 0) {
        return 0xe;
      }
      iVar1 = strcmp(pcVar4,"ldexp");
      if (iVar1 == 0) {
        return 0xf;
      }
      iVar1 = strcmp(pcVar4,"log10");
      if (iVar1 == 0) {
        return 0x10;
      }
      iVar1 = strcmp(pcVar4,"log");
      if (iVar1 == 0) {
        return 0x11;
      }
      iVar1 = strcmp(pcVar4,"max");
      if (iVar1 == 0) {
        return 0x12;
      }
      iVar1 = strcmp(pcVar4,"min");
      if (iVar1 == 0) {
        return 0x13;
      }
      iVar1 = strcmp(pcVar4,"modf");
      if (iVar1 == 0) {
        return 0x14;
      }
      iVar1 = strcmp(pcVar4,"pow");
      if (iVar1 == 0) {
        return 0x15;
      }
      iVar1 = strcmp(pcVar4,"rad");
      if (iVar1 == 0) {
        return 0x16;
      }
      iVar1 = strcmp(pcVar4,"sinh");
      if (iVar1 == 0) {
        return 0x17;
      }
      iVar1 = strcmp(pcVar4,"sin");
      if (iVar1 == 0) {
        return 0x18;
      }
      iVar1 = strcmp(pcVar4,"sqrt");
      if (iVar1 == 0) {
        return 0x19;
      }
      iVar1 = strcmp(pcVar4,"tanh");
      if (iVar1 == 0) {
        return 0x1a;
      }
      iVar1 = strcmp(pcVar4,"tan");
      if (iVar1 == 0) {
        return 0x1b;
      }
      iVar1 = strcmp(pcVar4,"clamp");
      if (iVar1 == 0) {
        return 0x2e;
      }
      iVar1 = strcmp(pcVar4,"sign");
      if (iVar1 == 0) {
        return 0x2f;
      }
      iVar1 = strcmp(pcVar4,"round");
      if (iVar1 == 0) {
        return 0x30;
      }
      iVar1 = strcmp(pcVar4,"lerp");
      if (iVar1 == 0) {
        return 0x59;
      }
      iVar1 = strcmp(pcVar4,"isnan");
      if (iVar1 == 0) {
        return 0x5b;
      }
      iVar1 = strcmp(pcVar4,"isinf");
      if (iVar1 == 0) {
        return 0x5c;
      }
      iVar1 = strcmp(pcVar4,"isfinite");
      if (iVar1 == 0) {
        return 0x5d;
      }
    }
    iVar1 = strcmp(__s1,"bit32");
    if ((iVar1 == 0) && (pcVar4 = (char *)param_1[1], pcVar4 != (char *)0x0)) {
      iVar1 = strcmp(pcVar4,"arshift");
      if (iVar1 == 0) {
        return 0x1c;
      }
      iVar1 = strcmp(pcVar4,"band");
      if (iVar1 == 0) {
        return 0x1d;
      }
      iVar1 = strcmp(pcVar4,"bnot");
      if (iVar1 == 0) {
        return 0x1e;
      }
      iVar1 = strcmp(pcVar4,"bor");
      if (iVar1 == 0) {
        return 0x1f;
      }
      iVar1 = strcmp(pcVar4,"bxor");
      if (iVar1 == 0) {
        return 0x20;
      }
      iVar1 = strcmp(pcVar4,"btest");
      if (iVar1 == 0) {
        return 0x21;
      }
      iVar1 = strcmp(pcVar4,"extract");
      if (iVar1 == 0) {
        return 0x22;
      }
      iVar1 = strcmp(pcVar4,"lrotate");
      if (iVar1 == 0) {
        return 0x23;
      }
      iVar1 = strcmp(pcVar4,"lshift");
      if (iVar1 == 0) {
        return 0x24;
      }
      iVar1 = strcmp(pcVar4,"replace");
      if (iVar1 == 0) {
        return 0x25;
      }
      iVar1 = strcmp(pcVar4,"rrotate");
      if (iVar1 == 0) {
        return 0x26;
      }
      iVar1 = strcmp(pcVar4,"rshift");
      if (iVar1 == 0) {
        return 0x27;
      }
      iVar1 = strcmp(pcVar4,"countlz");
      if (iVar1 == 0) {
        return 0x37;
      }
      iVar1 = strcmp(pcVar4,"countrz");
      if (iVar1 == 0) {
        return 0x38;
      }
      iVar1 = strcmp(pcVar4,"byteswap");
      if (iVar1 == 0) {
        return 0x40;
      }
    }
    iVar1 = strcmp(__s1,"string");
    if ((iVar1 == 0) && (pcVar4 = (char *)param_1[1], pcVar4 != (char *)0x0)) {
      iVar1 = strcmp(pcVar4,"byte");
      if (iVar1 == 0) {
        return 0x29;
      }
      iVar1 = strcmp(pcVar4,"char");
      if (iVar1 == 0) {
        return 0x2a;
      }
      iVar1 = strcmp(pcVar4,"len");
      if (iVar1 == 0) {
        return 0x2b;
      }
      iVar1 = strcmp(pcVar4,"sub");
      if (iVar1 == 0) {
        return 0x2d;
      }
    }
    iVar1 = strcmp(__s1,"table");
    if ((iVar1 == 0) && (pcVar4 = (char *)param_1[1], pcVar4 != (char *)0x0)) {
      iVar1 = strcmp(pcVar4,"insert");
      if (iVar1 == 0) {
        return 0x34;
      }
      iVar1 = strcmp(pcVar4,"unpack");
      if (iVar1 == 0) {
        return 0x35;
      }
      if (DAT_00d1ef48 == '\x01') {
        iVar1 = strcmp(pcVar4,"create");
        if (iVar1 == 0) {
          return 0x85;
        }
        iVar1 = strcmp(pcVar4,"clear");
        if (iVar1 == 0) {
          return 0x86;
        }
      }
    }
    iVar1 = strcmp(__s1,"buffer");
    if ((iVar1 == 0) && (pcVar4 = (char *)param_1[1], pcVar4 != (char *)0x0)) {
      iVar1 = strcmp(pcVar4,"readi8");
      if (iVar1 == 0) {
        return 0x41;
      }
      iVar1 = strcmp(pcVar4,"readu8");
      if (iVar1 == 0) {
        return 0x42;
      }
      iVar1 = strcmp(pcVar4,"writei8");
      if ((iVar1 == 0) || (iVar1 = strcmp(pcVar4,"writeu8"), iVar1 == 0)) {
        return 0x43;
      }
      iVar1 = strcmp(pcVar4,"readi16");
      if (iVar1 == 0) {
        return 0x44;
      }
      iVar1 = strcmp(pcVar4,"readu16");
      if (iVar1 == 0) {
        return 0x45;
      }
      iVar1 = strcmp(pcVar4,"writei16");
      if ((iVar1 == 0) || (iVar1 = strcmp(pcVar4,"writeu16"), iVar1 == 0)) {
        return 0x46;
      }
      iVar1 = strcmp(pcVar4,"readi32");
      if (iVar1 == 0) {
        return 0x47;
      }
      iVar1 = strcmp(pcVar4,"readu32");
      if (iVar1 == 0) {
        return 0x48;
      }
      iVar1 = strcmp(pcVar4,"writei32");
      if ((iVar1 == 0) || (iVar1 = strcmp(pcVar4,"writeu32"), iVar1 == 0)) {
        return 0x49;
      }
      iVar1 = strcmp(pcVar4,"readf32");
      if (iVar1 == 0) {
        return 0x4a;
      }
      iVar1 = strcmp(pcVar4,"writef32");
      if (iVar1 == 0) {
        return 0x4b;
      }
      iVar1 = strcmp(pcVar4,"readf64");
      if (iVar1 == 0) {
        return 0x4c;
      }
      iVar1 = strcmp(pcVar4,"writef64");
      if (iVar1 == 0) {
        return 0x4d;
      }
      if (DAT_00d1ef28 == '\x01') {
        iVar1 = strcmp(pcVar4,"readvectorf32x2");
        if (iVar1 == 0) {
          return 0x87;
        }
        iVar1 = strcmp(pcVar4,"readvectorf32x3");
        if (iVar1 == 0) {
          return 0x88;
        }
        iVar1 = strcmp(pcVar4,"readvectorf32x4");
        if (iVar1 == 0) {
          return 0x89;
        }
        iVar1 = strcmp(pcVar4,"writevectorf32x2");
        if (iVar1 == 0) {
          return 0x8a;
        }
        iVar1 = strcmp(pcVar4,"writevectorf32x3");
        if (iVar1 == 0) {
          return 0x8b;
        }
        iVar1 = strcmp(pcVar4,"writevectorf32x4");
        if (iVar1 == 0) {
          return 0x8c;
        }
      }
    }
    iVar1 = strcmp(__s1,"vector");
    if ((iVar1 != 0) || (pcVar4 = (char *)param_1[1], pcVar4 == (char *)0x0)) goto LAB_0087e8b0;
    iVar1 = strcmp(pcVar4,"create");
    if (iVar1 != 0) {
      iVar1 = strcmp(pcVar4,"magnitude");
      if (iVar1 == 0) {
        return 0x4e;
      }
      iVar1 = strcmp(pcVar4,"normalize");
      if (iVar1 == 0) {
        return 0x4f;
      }
      iVar1 = strcmp(pcVar4,"cross");
      if (iVar1 == 0) {
        return 0x50;
      }
      iVar1 = strcmp(pcVar4,"dot");
      if (iVar1 == 0) {
        return 0x51;
      }
      iVar1 = strcmp(pcVar4,"floor");
      if (iVar1 == 0) {
        return 0x52;
      }
      iVar1 = strcmp(pcVar4,"ceil");
      if (iVar1 == 0) {
        return 0x53;
      }
      iVar1 = strcmp(pcVar4,"abs");
      if (iVar1 == 0) {
        return 0x54;
      }
      iVar1 = strcmp(pcVar4,"sign");
      if (iVar1 == 0) {
        return 0x55;
      }
      iVar1 = strcmp(pcVar4,"clamp");
      if (iVar1 == 0) {
        return 0x56;
      }
      iVar1 = strcmp(pcVar4,"min");
      if (iVar1 == 0) {
        return 0x57;
      }
      iVar1 = strcmp(pcVar4,"max");
      if (iVar1 == 0) {
        return 0x58;
      }
      iVar1 = strcmp(pcVar4,"lerp");
      if (iVar1 == 0) {
        return 0x5a;
      }
      goto LAB_0087e8b0;
    }
    goto LAB_0087e8cc;
  }
  pcVar4 = (char *)param_1[1];
  if (pcVar4 != (char *)0x0) {
    iVar1 = strcmp(pcVar4,"assert");
    if (iVar1 == 0) {
      return 1;
    }
    iVar1 = strcmp(pcVar4,"type");
    if (iVar1 == 0) {
      return 0x28;
    }
    iVar1 = strcmp(pcVar4,"typeof");
    if (iVar1 == 0) {
      return 0x2c;
    }
    iVar1 = strcmp(pcVar4,"rawset");
    if (iVar1 == 0) {
      return 0x31;
    }
    iVar1 = strcmp(pcVar4,"rawget");
    if (iVar1 == 0) {
      return 0x32;
    }
    iVar1 = strcmp(pcVar4,"rawequal");
    if (iVar1 == 0) {
      return 0x33;
    }
    iVar1 = strcmp(pcVar4,"rawlen");
    if (iVar1 == 0) {
      return 0x3a;
    }
    iVar1 = strcmp(pcVar4,"unpack");
    if (iVar1 == 0) {
      return 0x35;
    }
    iVar1 = strcmp(pcVar4,"select");
    if (iVar1 == 0) {
      return 0x39;
    }
    iVar1 = strcmp(pcVar4,"getmetatable");
    if (iVar1 == 0) {
      return 0x3c;
    }
    iVar1 = strcmp(pcVar4,"setmetatable");
    if (iVar1 == 0) {
      return 0x3d;
    }
    iVar1 = strcmp(pcVar4,"tonumber");
    if (iVar1 == 0) {
      return 0x3e;
    }
    iVar1 = strcmp(pcVar4,"tostring");
    if (iVar1 == 0) {
      return 0x3f;
    }
  }
LAB_0087e8b0:
  if (*(char **)(param_2 + 0x18) == (char *)0x0) {
LAB_0087ef68:
    uVar3 = 0xffffffff;
  }
  else {
    if (*(long *)(param_2 + 0x10) == 0) {
      if (((__s1 != (char *)0x0) || ((char *)param_1[1] == (char *)0x0)) ||
         (iVar1 = strcmp((char *)param_1[1],*(char **)(param_2 + 0x18)), iVar1 != 0))
      goto LAB_0087ef68;
    }
    else {
      uVar2 = FUN_0087f640(param_1);
      if ((uVar2 & 1) == 0) goto LAB_0087ef68;
    }
LAB_0087e8cc:
    uVar3 = 0x36;
  }
  return uVar3;
}

