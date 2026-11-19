/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b2e4c
 */

undefined8 FUN_008b2e4c(long param_1)

{
  uint uVar1;
  undefined8 *puVar2;
  long lVar3;
  int iVar4;
  char *pcVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  undefined8 uVar12;
  long local_68;
  undefined4 local_5c;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  lVar10 = *(long *)(**(long **)(*(long *)(param_1 + 0x50) + 8) + 0x30);
  if (*(char *)(lVar10 + 0x6a) == '\x01') {
    lVar9 = *(long *)(lVar10 + 0x10);
    if (*(long *)(lVar3 + 0x28) == local_58) {
      pcVar5 = 
      "Class %s must define a constructor because it is derived from a class that defines one";
      goto LAB_008b3098;
    }
  }
  else if (*(int *)(lVar10 + 0x60) == 0) {
    iVar4 = FUN_008aa984(param_1);
    if (iVar4 == 2) {
      if (*(int *)((long)*(long **)(param_1 + 0x70) + 0xc) == 0xc) {
        lVar9 = **(long **)(param_1 + 0x70);
        if (*(long *)(lVar9 + 0x10) == lVar10) {
          lVar7 = *(long *)(param_1 + 0x68);
          uVar1 = *(uint *)(lVar10 + 0x58);
          uVar6 = (ulong)uVar1;
          *(undefined4 *)(lVar7 + 0xc) = 0;
          lVar7 = lVar7 + 0x10;
          *(long *)(param_1 + 0x68) = lVar7;
          if (uVar1 != 0) {
            lVar7 = 0;
            uVar11 = 0;
            do {
              lVar8 = *(long *)(*(long *)(lVar10 + 0x40) + uVar11 * 8);
              if (lVar8 != 0) {
                local_5c = 5;
                local_68 = lVar8;
                FUN_008cadd4(param_1,*(long *)(param_1 + 0x70) + 0x10,&local_68,
                             *(long *)(param_1 + 0x68) + -0x10);
                uVar12 = *(undefined8 *)(*(long *)(param_1 + 0x68) + -0x10);
                puVar2 = (undefined8 *)(*(long *)(lVar9 + 0x20) + lVar7);
                puVar2[1] = *(undefined8 *)(*(long *)(param_1 + 0x68) + -8);
                *puVar2 = uVar12;
                if ((4 < *(int *)(*(long *)(lVar9 + 0x20) + lVar7 + 0xc)) &&
                   ((*(byte *)(lVar9 + 2) >> 2 & 1) != 0)) {
                  if ((*(byte *)(*(long *)(*(long *)(lVar9 + 0x20) + lVar7) + 2) & 3) != 0) {
                    FUN_008b6188(param_1,lVar9);
                  }
                }
                uVar6 = (ulong)*(uint *)(lVar10 + 0x58);
              }
              uVar11 = uVar11 + 1;
              lVar7 = lVar7 + 0x10;
            } while (uVar11 < uVar6);
            lVar7 = *(long *)(param_1 + 0x68);
          }
          *(long *)(param_1 + 0x68) = lVar7 + -0x10;
          if (*(long *)(lVar3 + 0x28) == local_58) {
            return 0;
          }
        }
        else if (*(long *)(lVar3 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
          FUN_008aecb4(param_1,"Cannot call %s.__init on an instance of class %s",
                       *(long *)(lVar10 + 0x10) + 0x18,
                       *(long *)(*(long *)(lVar9 + 0x10) + 0x10) + 0x18);
        }
      }
      else {
        lVar9 = *(long *)(lVar10 + 0x10);
        if (*(long *)(lVar3 + 0x28) == local_58) {
          pcVar5 = "%s.__init must be called with an instance of the class as its first argument";
          goto LAB_008b3098;
        }
      }
    }
    else if (*(long *)(lVar3 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
      FUN_008aecb4(param_1,"The constructor of %s must be called with 2 arguments.  Got %d",
                   *(long *)(lVar10 + 0x10) + 0x18,iVar4);
    }
  }
  else {
    lVar9 = *(long *)(lVar10 + 0x10);
    if (*(long *)(lVar10 + 0x20) == 0) {
      if (*(long *)(lVar3 + 0x28) == local_58) {
        pcVar5 = "Class %s must define a constructor because it has private fields";
LAB_008b3098:
                    /* WARNING: Subroutine does not return */
        FUN_008aecb4(param_1,pcVar5,lVar9 + 0x18);
      }
    }
    else if (*(long *)(lVar3 + 0x28) == local_58) {
      pcVar5 = 
      "Class %s must define a constructor because it or a class it inherits from has private fields"
      ;
      goto LAB_008b3098;
    }
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

