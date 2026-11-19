/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5bbe8
 */

void ossl_pool_acquire_entropy(undefined8 param_1)

{
  int iVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  int *piVar5;
  long lVar6;
  size_t __nbytes;
  void *__buf;
  int *piVar7;
  ssize_t sVar8;
  ulong uVar9;
  stat local_170;
  long local_e0;
  uint local_d8;
  long local_c8;
  
  lVar3 = ossl_rand_pool_bytes_needed(param_1,1);
  if (lVar3 != 0) {
    iVar2 = 3;
    do {
      while( true ) {
        if (iVar2 < 1) goto LAB_00b5bcc0;
        uVar4 = ossl_rand_pool_add_begin(param_1,lVar3);
        iVar1 = getentropy(uVar4,lVar3);
        lVar6 = lVar3;
        if (iVar1 == 0) break;
        piVar5 = (int *)__errno();
        iVar1 = *piVar5;
        if (iVar1 == 0x26) {
          lVar6 = syscall(0x116,uVar4,lVar3,0);
          break;
        }
LAB_00b5bcb4:
        if (iVar1 != 4) goto LAB_00b5bcc0;
LAB_00b5bcbc:
        iVar2 = iVar2 + -1;
        if (lVar3 == 0) goto LAB_00b5bcc0;
      }
      if (lVar6 < 1) {
        if (lVar6 < 0) {
          piVar5 = (int *)__errno();
          iVar1 = *piVar5;
          goto LAB_00b5bcb4;
        }
        goto LAB_00b5bcbc;
      }
      ossl_rand_pool_add_end(param_1,lVar6,lVar6 << 3);
      lVar3 = lVar3 - lVar6;
      iVar2 = 3;
    } while (lVar3 != 0);
  }
LAB_00b5bcc0:
  lVar3 = ossl_rand_pool_entropy_available(param_1);
  if (lVar3 == 0) {
    __nbytes = ossl_rand_pool_bytes_needed(param_1,1);
    if (__nbytes != 0) {
      uVar9 = 0;
      do {
        piVar5 = &DAT_00d23828 + uVar9 * 10;
        if (((((*piVar5 == -1) ||
              (iVar2 = fstat(*piVar5,(stat *)(local_170.__unused + 2)), iVar2 == -1)) ||
             ((&DAT_00d23830)[uVar9 * 5] != local_170.__unused[2])) ||
            (((&DAT_00d23838)[uVar9 * 5] != local_e0 ||
             (0x1ff < (local_d8 ^ (&DAT_00d23840)[uVar9 * 10]))))) ||
           ((&DAT_00d23848)[uVar9 * 5] != local_c8)) {
          iVar2 = open((&PTR_s__dev_urandom_00ca4f58)[uVar9],0);
          *piVar5 = iVar2;
          if (iVar2 != -1) {
            iVar2 = fstat(iVar2,&local_170);
            if (iVar2 != -1) {
              (&DAT_00d23838)[uVar9 * 5] = local_170.st_ino;
              (&DAT_00d23830)[uVar9 * 5] = local_170.st_dev;
              (&DAT_00d23840)[uVar9 * 10] = (undefined4)local_170.st_nlink;
              (&DAT_00d23848)[uVar9 * 5] = local_170._32_8_;
              goto LAB_00b5bdb4;
            }
            close(*piVar5);
            *piVar5 = -1;
          }
        }
        else {
LAB_00b5bdb4:
          iVar2 = *piVar5;
          if (iVar2 != -1) {
            sVar8 = 0;
            iVar1 = 3;
            do {
              while( true ) {
                if (iVar1 < 1) goto LAB_00b5be30;
                __buf = (void *)ossl_rand_pool_add_begin(param_1,__nbytes);
                sVar8 = read(iVar2,__buf,__nbytes);
                if (sVar8 < 1) break;
                ossl_rand_pool_add_end(param_1,sVar8,sVar8 << 3);
                __nbytes = __nbytes - sVar8;
                iVar1 = 3;
                if (__nbytes == 0) goto LAB_00b5be30;
              }
              if ((sVar8 < 0) && (piVar7 = (int *)__errno(), *piVar7 != 4)) goto LAB_00b5be40;
              iVar1 = iVar1 + -1;
            } while (__nbytes != 0);
LAB_00b5be30:
            if ((sVar8 < 0) || (DAT_00cca448 == 0)) {
LAB_00b5be40:
              if (((*piVar5 != -1) &&
                  (((iVar2 = fstat(*piVar5,(stat *)(local_170.__unused + 2)), iVar2 != -1 &&
                    ((&DAT_00d23830)[uVar9 * 5] == local_170.__unused[2])) &&
                   ((&DAT_00d23838)[uVar9 * 5] == local_e0)))) &&
                 (((local_d8 ^ (&DAT_00d23840)[uVar9 * 10]) < 0x200 &&
                  ((&DAT_00d23848)[uVar9 * 5] == local_c8)))) {
                close(*piVar5);
              }
              *piVar5 = -1;
            }
            __nbytes = ossl_rand_pool_bytes_needed(param_1,1);
          }
        }
      } while ((__nbytes != 0) && (uVar9 = uVar9 + 1, uVar9 < 4));
    }
    lVar3 = ossl_rand_pool_entropy_available(param_1);
    if (lVar3 == 0) {
      ossl_rand_pool_entropy_available(param_1);
      return;
    }
  }
  return;
}

