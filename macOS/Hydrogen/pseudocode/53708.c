
byte thunk_FUN_00053720(undefined8 param_1)

{
  byte *pbVar1;
  int iVar2;
  byte *pbVar3;
  byte bVar4;
  ulong uVar5;
  byte *pbVar6;
  byte *pbVar7;
  ulong uVar8;
  byte *pbVar9;
  byte *pbVar10;
  byte *pbVar11;
  byte *pbVar12;
  undefined8 in_stack_00000010;
  long in_stack_00000020;
  
  if (in_stack_00000020 < 0) {
    __ZdlPv(in_stack_00000010);
  }
  pbVar3 = (byte *)__Unwind_Resume(param_1);
  if ((*pbVar3 & 0xf) != 0) {
    return *pbVar3 & 0xf;
  }
  pbVar12 = pbVar3 + 8;
  bVar4 = pbVar3[0x1f];
  uVar5 = (ulong)bVar4;
  if ((char)bVar4 < '\0') {
    uVar8 = *(ulong *)(pbVar3 + 0x10);
    if (uVar8 != 0) {
      pbVar6 = *(byte **)pbVar12;
      goto LAB_000537a0;
    }
  }
  else if (bVar4 != 0) {
    pbVar6 = pbVar12;
    uVar8 = uVar5;
LAB_000537a0:
    if (2 < uVar8) {
      uVar8 = 3;
    }
    pbVar7 = pbVar6 + uVar8;
    pbVar9 = pbVar7;
    pbVar11 = pbVar6;
code_r0x000537b8:
    pbVar10 = pbVar11 + 2;
    do {
      pbVar11 = pbVar10 + -1;
      if (pbVar10[-2] == 0x72) {
        if (pbVar11 == pbVar7) goto code_r0x0005380c;
        if (*pbVar11 == 0x62) goto code_r0x000537f0;
      }
      else if (pbVar11 == pbVar7) goto code_r0x0005380c;
      pbVar10 = pbVar10 + 1;
    } while( true );
  }
  bVar4 = 2;
  goto LAB_00053b94;
code_r0x000537f0:
  if (pbVar10 == pbVar7) goto code_r0x0005380c;
  pbVar1 = pbVar10 + -2;
  if (*pbVar10 != 0x78) {
    pbVar1 = pbVar9;
  }
  pbVar9 = pbVar1;
  goto code_r0x000537b8;
code_r0x0005380c:
  if ((pbVar9 != pbVar7) && (pbVar9 == pbVar6)) {
    if ((char)bVar4 < '\0') {
      if (3 < *(ulong *)(pbVar3 + 0x10)) {
        bVar4 = *(byte *)(*(long *)pbVar12 + 3);
        if (bVar4 == 0x74) goto code_r0x000538a4;
code_r0x00053838:
        if (bVar4 == 0x61) {
          uVar5 = func_0x00053bb8(pbVar12,4,"ssethash://");
          if ((uVar5 & 1) != 0) {
            bVar4 = 0xd;
            goto LAB_00053b94;
          }
          uVar5 = func_0x00053bb8(pbVar12,4,"sset://");
          if ((uVar5 & 1) != 0) {
            bVar4 = 3;
            goto LAB_00053b94;
          }
          uVar5 = func_0x00053bb8(pbVar12,4,"ssetid://");
          if ((uVar5 & 1) != 0) {
            bVar4 = 5;
            goto LAB_00053b94;
          }
          uVar5 = func_0x00053bb8(pbVar12,4,"pp://");
          if ((uVar5 & 1) != 0) {
            bVar4 = 10;
            goto LAB_00053b94;
          }
        }
      }
    }
    else if (3 < bVar4) {
      bVar4 = pbVar3[0xb];
      if (bVar4 != 0x74) goto code_r0x00053838;
code_r0x000538a4:
      bVar4 = 4;
      uVar5 = func_0x00053bb8(pbVar12,4,"emp://");
      if ((uVar5 & 1) != 0) goto LAB_00053b94;
      uVar5 = func_0x00053bb8(pbVar12,4,"humb://");
      if ((uVar5 & 1) != 0) {
        bVar4 = 0xb;
        goto LAB_00053b94;
      }
    }
    if ((char)pbVar3[0x1f] < '\0') {
      if (0x15 < *(ulong *)(pbVar3 + 0x10)) {
        pbVar6 = *(byte **)pbVar12;
        goto code_r0x00053b00;
      }
    }
    else {
      pbVar6 = pbVar12;
      if (0x15 < pbVar3[0x1f]) {
code_r0x00053b00:
        if ((*(long *)(pbVar6 + 3) == 0x6574707972636e65 &&
            *(long *)(pbVar6 + 0xb) == 0x6469746573736164) &&
            *(long *)(pbVar6 + 0xe) == 0x2f2f3a6469746573) {
          bVar4 = 6;
          goto LAB_00053b94;
        }
      }
    }
    uVar5 = func_0x00053bb8(pbVar12,3,"http://");
    if ((uVar5 & 1) == 0) {
      iVar2 = func_0x00053bb8(pbVar12,3,"gameasset://");
      bVar4 = 0xc;
      if (iVar2 == 0) {
        bVar4 = 1;
      }
    }
    else {
      bVar4 = 9;
    }
    goto LAB_00053b94;
  }
  if ((char)bVar4 < '\0') {
    pbVar6 = *(byte **)(pbVar3 + 8);
    uVar8 = *(ulong *)(pbVar3 + 0x10);
    if (3 < *(ulong *)(pbVar3 + 0x10)) {
      uVar8 = 4;
    }
  }
  else {
    pbVar6 = pbVar12;
    uVar8 = uVar5;
    if (3 < uVar5) {
      uVar8 = 4;
    }
  }
  if (uVar8 != 0) {
    pbVar7 = pbVar6 + uVar8;
    pbVar9 = pbVar7;
    pbVar11 = pbVar6;
code_r0x00053900:
    pbVar10 = pbVar11 + 3;
    do {
      pbVar11 = pbVar10 + -2;
      if (pbVar10[-3] == 0x68) {
        if (pbVar11 == pbVar7) goto code_r0x0005396c;
        if (*pbVar11 == 0x74) {
          if (pbVar10 + -1 == pbVar7) goto code_r0x0005396c;
          if (pbVar10[-1] == 0x74) goto code_r0x00053950;
        }
      }
      else if (pbVar11 == pbVar7) goto code_r0x0005396c;
      pbVar10 = pbVar10 + 1;
    } while( true );
  }
  goto code_r0x00053984;
code_r0x00053950:
  if (pbVar10 == pbVar7) goto code_r0x0005396c;
  pbVar1 = pbVar10 + -3;
  if (*pbVar10 != 0x70) {
    pbVar1 = pbVar9;
  }
  pbVar9 = pbVar1;
  goto code_r0x00053900;
code_r0x00053a40:
  if (pbVar11 == pbVar6) goto code_r0x00053a60;
  pbVar10 = pbVar11 + -6;
  if (*pbVar11 != 0x2f) {
    pbVar10 = pbVar7;
  }
  pbVar7 = pbVar10;
  goto code_r0x000539a8;
code_r0x0005396c:
  if ((pbVar9 != pbVar7) && (pbVar9 == pbVar6)) {
    bVar4 = 7;
    goto LAB_00053b94;
  }
code_r0x00053984:
  if ((char)bVar4 < '\0') {
    pbVar12 = *(byte **)(pbVar3 + 8);
    uVar5 = *(ulong *)(pbVar3 + 0x10);
  }
  if (6 < uVar5) {
    uVar5 = 7;
  }
  pbVar6 = pbVar12 + uVar5;
  pbVar7 = pbVar6;
  if (uVar5 != 0) {
    pbVar9 = pbVar12;
code_r0x000539a8:
    pbVar11 = pbVar9 + 6;
    do {
      pbVar9 = pbVar11 + -5;
      if (pbVar11[-6] == 0x66) {
        if (pbVar9 == pbVar6) break;
        if (*pbVar9 == 0x69) {
          if (pbVar11 + -4 == pbVar6) break;
          if (pbVar11[-4] == 0x6c) {
            if (pbVar11 + -3 == pbVar6) break;
            if (pbVar11[-3] == 0x65) {
              if (pbVar11 + -2 == pbVar6) break;
              if (pbVar11[-2] == 0x3a) {
                if (pbVar11 + -1 == pbVar6) break;
                if (pbVar11[-1] == 0x2f) goto code_r0x00053a40;
              }
            }
          }
        }
      }
      else if (pbVar9 == pbVar6) break;
      pbVar11 = pbVar11 + 1;
    } while( true );
  }
code_r0x00053a60:
  bVar4 = 8;
  if (pbVar7 != pbVar12 || pbVar7 == pbVar6) {
    bVar4 = 1;
  }
LAB_00053b94:
  *pbVar3 = *pbVar3 & 0xf0 | bVar4;
  return bVar4;
}

