/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7204
 */

undefined ** SRP_get_default_gN(char *param_1)

{
  int iVar1;
  undefined **ppuVar2;
  long lVar3;
  
  if (param_1 == (char *)0x0) {
    ppuVar2 = &PTR_DAT_00cc9340;
  }
  else {
    iVar1 = strcmp(PTR_DAT_00cc9340,param_1);
    if (iVar1 == 0) {
      lVar3 = 0;
    }
    else {
      iVar1 = strcmp(PTR_DAT_00cc9358,param_1);
      if (iVar1 == 0) {
        lVar3 = 1;
      }
      else {
        iVar1 = strcmp(PTR_DAT_00cc9370,param_1);
        if (iVar1 == 0) {
          lVar3 = 2;
        }
        else {
          iVar1 = strcmp(PTR_DAT_00cc9388,param_1);
          if (iVar1 == 0) {
            lVar3 = 3;
          }
          else {
            iVar1 = strcmp(PTR_DAT_00cc93a0,param_1);
            if (iVar1 == 0) {
              lVar3 = 4;
            }
            else {
              iVar1 = strcmp(PTR_DAT_00cc93b8,param_1);
              if (iVar1 == 0) {
                lVar3 = 5;
              }
              else {
                iVar1 = strcmp(PTR_DAT_00cc93d0,param_1);
                if (iVar1 != 0) {
                  return (undefined **)0x0;
                }
                lVar3 = 6;
              }
            }
          }
        }
      }
    }
    ppuVar2 = &PTR_DAT_00cc9340 + lVar3 * 3;
  }
  return ppuVar2;
}

