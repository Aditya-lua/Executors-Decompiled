/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c1dc4
 */

/* WARNING: Removing unreachable block (ram,0x009c2058) */
/* WARNING: Removing unreachable block (ram,0x009c2014) */
/* WARNING: Removing unreachable block (ram,0x009c2098) */
/* WARNING: Removing unreachable block (ram,0x009c1f70) */
/* WARNING: Removing unreachable block (ram,0x009c1fe4) */

undefined ** FUN_009c1dc4(long param_1,uint param_2)

{
  undefined **ppuVar1;
  int iVar2;
  undefined **ppuVar3;
  long lVar4;
  
  if (param_2 == 0xffffffff) {
    if (*(int *)(param_1 + 0x38) == 0) {
      param_2 = (int)((ulong)(**(long **)(param_1 + 0x898) - (long)(*(long **)(param_1 + 0x898) + 4)
                             ) >> 3) * -0x33333333;
    }
    else {
      lVar4 = ssl_cert_lookup_by_idx(0);
      if ((lVar4 == 0) ||
         (param_2 = 0, (*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & *(uint *)(lVar4 + 4)) == 0))
      {
        lVar4 = ssl_cert_lookup_by_idx(1);
        if ((lVar4 == 0) ||
           ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & *(uint *)(lVar4 + 4)) == 0)) {
          lVar4 = ssl_cert_lookup_by_idx(2);
          if ((lVar4 == 0) ||
             ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & *(uint *)(lVar4 + 4)) == 0)) {
            lVar4 = ssl_cert_lookup_by_idx(3);
            if ((lVar4 == 0) ||
               ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & *(uint *)(lVar4 + 4)) == 0)) {
              lVar4 = ssl_cert_lookup_by_idx(4);
              if ((lVar4 != 0) &&
                 ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & *(uint *)(lVar4 + 4)) != 0)) {
LAB_009c1f2c:
                if (*(int *)(*(long *)(param_1 + 0x2e0) + 0x20) == 0x20) {
                  param_2 = 4;
                }
                else if (*(long *)(*(long *)(param_1 + 0x898) + 0x118) == 0) {
                  param_2 = 4;
                  if (*(long *)(*(long *)(param_1 + 0x898) + 0xf0) != 0) {
                    param_2 = 5;
                  }
                }
                else {
                  param_2 = 6;
                }
                goto LAB_009c1de8;
              }
              lVar4 = ssl_cert_lookup_by_idx(5);
              if ((lVar4 == 0) ||
                 ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & *(uint *)(lVar4 + 4)) == 0)) {
                lVar4 = ssl_cert_lookup_by_idx(6);
                if ((lVar4 == 0) ||
                   ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & *(uint *)(lVar4 + 4)) == 0)) {
                  lVar4 = ssl_cert_lookup_by_idx(7);
                  if ((lVar4 == 0) ||
                     ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & *(uint *)(lVar4 + 4)) == 0)) {
                    lVar4 = ssl_cert_lookup_by_idx(8);
                    if (lVar4 == 0) {
                      param_2 = 0xffffffff;
                    }
                    else {
                      param_2 = 8;
                      if ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & *(uint *)(lVar4 + 4)) == 0
                         ) {
                        param_2 = 0xffffffff;
                      }
                      if (param_2 == 4) goto LAB_009c1f2c;
                    }
                  }
                  else {
                    param_2 = 7;
                  }
                }
                else {
                  param_2 = 6;
                }
              }
              else {
                param_2 = 5;
              }
            }
            else {
              param_2 = 3;
            }
          }
          else {
            param_2 = 2;
          }
        }
        else {
          param_2 = 1;
        }
        if (param_2 == 5) {
          param_2 = 5;
          if (*(long *)(*(long *)(param_1 + 0x898) + 0x118) != 0) {
            param_2 = 6;
          }
          goto LAB_009c1de8;
        }
      }
    }
  }
  if (8 < param_2) {
    return (undefined **)0x0;
  }
LAB_009c1de8:
  if ((*(uint *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) & 2) == 0 && param_2 == 0) {
    ppuVar3 = &PTR_s_rsa_pkcs1_md5_sha1_00c58180;
  }
  else {
    ppuVar3 = (undefined **)FUN_009c21e4(param_1,(&DAT_0074cdc8)[(int)param_2]);
    if (ppuVar3 == (undefined **)0x0) {
      return (undefined **)0x0;
    }
    if ((*(int *)((long)ppuVar3 + 0xc) != 0) &&
       (lVar4 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),*(undefined4 *)(ppuVar3 + 2)), lVar4 == 0))
    {
      return (undefined **)0x0;
    }
  }
  iVar2 = FUN_009c3c60(param_1,0x5000b,ppuVar3);
  ppuVar1 = (undefined **)0x0;
  if (iVar2 != 0) {
    ppuVar1 = ppuVar3;
  }
  return ppuVar1;
}

