
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00047cf8(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int iVar3;
  undefined8 *puVar4;
  undefined8 *unaff_x19;
  int *unaff_x20;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000020;
  
  iVar3 = _memcmp();
  if (iVar3 == 0) {
    func_0x0004828c(&uStack0000000000000008);
  }
  else if (*unaff_x20 == 0x32616873 && (short)unaff_x20[1] == 0x3635) {
    func_0x000483c8(&uStack0000000000000008);
  }
  else {
    if (*unaff_x20 == 0x33616873 && (short)unaff_x20[1] == 0x3438) {
      puVar4 = (undefined8 *)__Znwm(0x158);
      puVar4[0x2a] = 0;
      puVar4[0x27] = 0;
      puVar4[0x26] = 0;
      puVar4[0x29] = 0;
      puVar4[0x28] = 0;
      puVar4[0x23] = 0;
      puVar4[0x22] = 0;
      puVar4[0x25] = 0;
      puVar4[0x24] = 0;
      puVar4[0x1f] = 0;
      puVar4[0x1e] = 0;
      puVar4[0x21] = 0;
      puVar4[0x20] = 0;
      puVar4[0x1b] = 0;
      puVar4[0x1a] = 0;
      puVar4[0x1d] = 0;
      puVar4[0x1c] = 0;
      puVar4[0x17] = 0;
      puVar4[0x16] = 0;
      puVar4[0x19] = 0;
      puVar4[0x18] = 0;
      puVar4[0x13] = 0;
      puVar4[0x12] = 0;
      puVar4[0x15] = 0;
      puVar4[0x14] = 0;
      puVar4[0xf] = 0;
      puVar4[0xe] = 0;
      puVar4[0x11] = 0;
      puVar4[0x10] = 0;
      puVar4[0xb] = 0;
      puVar4[10] = 0;
      puVar4[0xd] = 0;
      puVar4[0xc] = 0;
      puVar4[7] = 0;
      puVar4[6] = 0;
      puVar4[9] = 0;
      puVar4[8] = 0;
      puVar4[3] = 0;
      puVar4[2] = 0;
      puVar4[5] = 0;
      puVar4[4] = 0;
      puVar4[1] = 0;
      *puVar4 = 0;
      func_0x005edf2c(puVar4,1);
      puVar4[1] = 0;
      puVar4[2] = 0;
      uVar2 = _UNK_007fc178;
      uVar1 = _UNK_007fc170;
      puVar4[0x15] = _UNK_007fc178;
      puVar4[0x14] = uVar1;
      *(undefined1 *)((long)puVar4 + 0x99) = 1;
      puVar4[0x16] = puVar4 + 3;
      *puVar4 = &UNK_009b2c38;
      puVar4[0x29] = uVar2;
      puVar4[0x28] = uVar1;
      *(undefined1 *)((long)puVar4 + 0x139) = 1;
      puVar4[0x2a] = puVar4 + 0x17;
      func_0x006ad7bc(puVar4 + 0x17);
      *puVar4 = &UNK_00a1a200;
      *unaff_x19 = puVar4;
      goto joined_r0x00047e04;
    }
    if (*unaff_x20 == 0x35616873 && (short)unaff_x20[1] == 0x3231) {
      puVar4 = (undefined8 *)__Znwm(0x158);
      puVar4[0x2a] = 0;
      puVar4[0x27] = 0;
      puVar4[0x26] = 0;
      puVar4[0x29] = 0;
      puVar4[0x28] = 0;
      puVar4[0x23] = 0;
      puVar4[0x22] = 0;
      puVar4[0x25] = 0;
      puVar4[0x24] = 0;
      puVar4[0x1f] = 0;
      puVar4[0x1e] = 0;
      puVar4[0x21] = 0;
      puVar4[0x20] = 0;
      puVar4[0x1b] = 0;
      puVar4[0x1a] = 0;
      puVar4[0x1d] = 0;
      puVar4[0x1c] = 0;
      puVar4[0x17] = 0;
      puVar4[0x16] = 0;
      puVar4[0x19] = 0;
      puVar4[0x18] = 0;
      puVar4[0x13] = 0;
      puVar4[0x12] = 0;
      puVar4[0x15] = 0;
      puVar4[0x14] = 0;
      puVar4[0xf] = 0;
      puVar4[0xe] = 0;
      puVar4[0x11] = 0;
      puVar4[0x10] = 0;
      puVar4[0xb] = 0;
      puVar4[10] = 0;
      puVar4[0xd] = 0;
      puVar4[0xc] = 0;
      puVar4[7] = 0;
      puVar4[6] = 0;
      puVar4[9] = 0;
      puVar4[8] = 0;
      puVar4[3] = 0;
      puVar4[2] = 0;
      puVar4[5] = 0;
      puVar4[4] = 0;
      puVar4[1] = 0;
      *puVar4 = 0;
      func_0x005edf2c(puVar4,1);
      puVar4[1] = 0;
      puVar4[2] = 0;
      uVar2 = _UNK_007fc178;
      uVar1 = _UNK_007fc170;
      puVar4[0x15] = _UNK_007fc178;
      puVar4[0x14] = uVar1;
      *(undefined1 *)((long)puVar4 + 0x99) = 1;
      puVar4[0x16] = puVar4 + 3;
      *puVar4 = &UNK_009b69f8;
      puVar4[0x29] = uVar2;
      puVar4[0x28] = uVar1;
      *(undefined1 *)((long)puVar4 + 0x139) = 1;
      puVar4[0x2a] = puVar4 + 0x17;
      func_0x006ad7d8(puVar4 + 0x17);
      *puVar4 = &UNK_00a1a2f8;
      *unaff_x19 = puVar4;
      goto joined_r0x00047e04;
    }
    iVar3 = func_0x00022dd0(&uStack0000000000000010,"sha3-256");
    if (iVar3 == 0) {
      iVar3 = func_0x00022dd0(&uStack0000000000000010,"sha3-384");
      if (iVar3 == 0) {
        iVar3 = func_0x00022dd0(&uStack0000000000000010,"sha3-512");
        if (iVar3 == 0) {
          iVar3 = func_0x00022dd0(&uStack0000000000000010,"ripemd128");
          if (iVar3 == 0) {
            iVar3 = func_0x00022dd0(&uStack0000000000000010,"ripemd160");
            if (iVar3 == 0) {
              iVar3 = func_0x00022dd0(&uStack0000000000000010,"ripemd256");
              if (iVar3 == 0) {
                iVar3 = func_0x00022dd0(&uStack0000000000000010,"ripemd320");
                if (iVar3 == 0) {
                  iVar3 = func_0x00022dd0(&uStack0000000000000010,"md5");
                  if (iVar3 == 0) {
                    func_0x000483c8(&uStack0000000000000008);
                  }
                  else {
                    func_0x00048dc4(&uStack0000000000000008);
                  }
                }
                else {
                  func_0x00048c8c(&uStack0000000000000008);
                }
              }
              else {
                func_0x00048b54(&uStack0000000000000008);
              }
            }
            else {
              func_0x00048a1c(&uStack0000000000000008);
            }
          }
          else {
            func_0x000488e4(&uStack0000000000000008);
          }
        }
        else {
          func_0x000487ec(&uStack0000000000000008);
        }
      }
      else {
        func_0x000486f4(&uStack0000000000000008);
      }
    }
    else {
      func_0x000485fc(&uStack0000000000000008);
    }
  }
  *unaff_x19 = uStack0000000000000008;
joined_r0x00047e04:
  if (in_stack_00000020._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000010);
    return;
  }
  return;
}

