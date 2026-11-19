/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086060c
 */

undefined8 FUN_0086060c(long param_1,uint param_2)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  uint uVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  long lVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  ulong uVar14;
  undefined8 local_80;
  undefined8 uStack_78;
  long local_68;
  
  uVar5 = DAT_00d1eba0;
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  iVar2 = *(int *)(param_1 + 0x124);
  uVar1 = iVar2 + 1;
  *(uint *)(param_1 + 0x124) = uVar1;
  lVar6 = lVar4;
  if (uVar1 <= uVar5) {
    puVar10 = (undefined8 *)(param_1 + 0x94);
    uVar11 = *puVar10;
    iVar3 = *(int *)(param_1 + 0x90);
    if (iVar3 < 0x2d) {
      if (iVar3 == 0x21) {
        uStack_78 = *(undefined8 *)(param_1 + 0x9c);
        local_80 = *puVar10;
        FUN_00860ecc(param_1,&local_80,"Unexpected \'!\'; did you mean \'not\'?");
LAB_008606d4:
        uVar13 = 0;
      }
      else {
        if (iVar3 != 0x23) goto LAB_008606a8;
        uVar13 = 2;
      }
LAB_008606d8:
      uVar12 = *(undefined8 *)(param_1 + 0x94);
      FUN_00858f2c(param_1);
      lVar6 = FUN_0086060c(param_1,8);
      uStack_78 = *(undefined8 *)(lVar6 + 0x14);
      local_80 = uVar11;
      uVar7 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
      FUN_0084f298(uVar7,&local_80,uVar13,lVar6);
      if (*(char *)(param_1 + 0x68) == '\x01') {
        uVar13 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
        FUN_00851e70(uVar13,uVar12);
        local_80 = uVar7;
        puVar8 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_80);
        *puVar8 = uVar13;
      }
    }
    else {
      if (iVar3 == 0x130) goto LAB_008606d4;
      if (iVar3 == 0x2d) {
        uVar13 = 1;
        goto LAB_008606d8;
      }
LAB_008606a8:
      uVar7 = FUN_0086b358(param_1);
    }
    iVar3 = *(int *)(param_1 + 0x90);
    if (iVar3 < 0x101) {
      if (iVar3 < 0x2f) {
        if (iVar3 < 0x2b) {
          if (iVar3 == 0x25) {
            uVar14 = 0x100000005;
          }
          else {
            uVar14 = 0x100000002;
            if (iVar3 != 0x2a) {
LAB_008608a0:
              uVar14 = FUN_0086b148(param_1,&DAT_00363253,param_2);
            }
          }
        }
        else if (iVar3 == 0x2b) {
          uVar14 = 0x100000000;
        }
        else {
          if (iVar3 != 0x2d) goto LAB_008608a0;
          uVar14 = 0x100000001;
        }
      }
      else if (iVar3 < 0x3e) {
        if (iVar3 == 0x2f) {
          uVar14 = 0x100000003;
        }
        else {
          if (iVar3 != 0x3c) goto LAB_008608a0;
          uVar14 = 0x10000000a;
        }
      }
      else if (iVar3 == 0x3e) {
        uVar14 = 0x10000000c;
      }
      else {
        if (iVar3 != 0x5e) goto LAB_008608a0;
        uVar14 = 0x100000006;
      }
    }
    else if (iVar3 < 0x105) {
      if (iVar3 < 0x103) {
        if (iVar3 == 0x101) {
          uVar14 = 0x100000009;
        }
        else {
          if (iVar3 != 0x102) goto LAB_008608a0;
          uVar14 = 0x10000000b;
        }
      }
      else if (iVar3 == 0x103) {
        uVar14 = 0x10000000d;
      }
      else {
        if (iVar3 != 0x104) goto LAB_008608a0;
        uVar14 = 0x100000008;
      }
    }
    else if (iVar3 < 0x123) {
      if (iVar3 == 0x105) {
        uVar14 = 0x100000007;
      }
      else {
        if (iVar3 != 0x109) goto LAB_008608a0;
        uVar14 = 0x100000004;
      }
    }
    else if (iVar3 == 0x123) {
      uVar14 = 0x10000000e;
    }
    else {
      if (iVar3 != 0x131) goto LAB_008608a0;
      uVar14 = 0x10000000f;
    }
    do {
      if (((uVar14 >> 0x20 & 1) == 0) ||
         ((byte)(&DAT_00363253)[(uVar14 & 0xffffffff) * 2] <= param_2)) {
        *(int *)(param_1 + 0x124) = iVar2;
        if (*(long *)(lVar4 + 0x28) == local_68) {
          return uVar7;
        }
        goto LAB_00860b68;
      }
      lVar6 = *(long *)(param_1 + 0x94);
      FUN_00858f2c(param_1);
      lVar9 = FUN_0086060c(param_1,(&DAT_00363254)[(uVar14 & 0xffffffff) * 2]);
      uStack_78 = *(undefined8 *)(lVar9 + 0x14);
      local_80 = uVar11;
      uVar13 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
      FUN_0084f324(uVar13,&local_80,uVar14 & 0xffffffff,uVar7,lVar9);
      if (*(char *)(param_1 + 0x68) == '\x01') {
        uVar7 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
        FUN_00851e70(uVar7,lVar6);
        local_80 = uVar13;
        puVar8 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_80);
        *puVar8 = uVar7;
      }
      iVar3 = *(int *)(param_1 + 0x90);
      if (iVar3 < 0x101) {
        if (iVar3 < 0x2f) {
          if (iVar3 < 0x2b) {
            if (iVar3 == 0x25) {
              uVar14 = 0x100000005;
            }
            else {
              uVar14 = 0x100000002;
              if (iVar3 != 0x2a) {
LAB_00860abc:
                uVar14 = FUN_0086b148(param_1,&DAT_00363253,param_2);
              }
            }
          }
          else if (iVar3 == 0x2b) {
            uVar14 = 0x100000000;
          }
          else {
            if (iVar3 != 0x2d) goto LAB_00860abc;
            uVar14 = 0x100000001;
          }
        }
        else if (iVar3 < 0x3e) {
          if (iVar3 == 0x2f) {
            uVar14 = 0x100000003;
          }
          else {
            if (iVar3 != 0x3c) goto LAB_00860abc;
            uVar14 = 0x10000000a;
          }
        }
        else if (iVar3 == 0x3e) {
          uVar14 = 0x10000000c;
        }
        else {
          if (iVar3 != 0x5e) goto LAB_00860abc;
          uVar14 = 0x100000006;
        }
      }
      else if (iVar3 < 0x105) {
        if (iVar3 < 0x103) {
          if (iVar3 == 0x101) {
            uVar14 = 0x100000009;
          }
          else {
            if (iVar3 != 0x102) goto LAB_00860abc;
            uVar14 = 0x10000000b;
          }
        }
        else if (iVar3 == 0x103) {
          uVar14 = 0x10000000d;
        }
        else {
          if (iVar3 != 0x104) goto LAB_00860abc;
          uVar14 = 0x100000008;
        }
      }
      else if (iVar3 < 0x123) {
        if (iVar3 == 0x105) {
          uVar14 = 0x100000007;
        }
        else {
          if (iVar3 != 0x109) goto LAB_00860abc;
          uVar14 = 0x100000004;
        }
      }
      else if (iVar3 == 0x123) {
        uVar14 = 0x10000000e;
      }
      else {
        if (iVar3 != 0x131) goto LAB_00860abc;
        uVar14 = 0x10000000f;
      }
      uVar5 = DAT_00d1eba0;
      uVar1 = *(int *)(param_1 + 0x124) + 1;
      *(uint *)(param_1 + 0x124) = uVar1;
      uVar7 = uVar13;
    } while (uVar1 <= uVar5);
    if (*(long *)(lVar4 + 0x28) != local_68) goto LAB_00860b68;
    FUN_008578f8(puVar10,
                 "Exceeded allowed recursion depth; simplify your %s to make the code compile",
                 "expression");
  }
  if (*(long *)(lVar6 + 0x28) == local_68) {
    FUN_008578f8(param_1 + 0x94,
                 "Exceeded allowed recursion depth; simplify your %s to make the code compile",
                 "expression");
  }
LAB_00860b68:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

