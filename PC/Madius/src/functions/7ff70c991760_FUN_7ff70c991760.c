/* 7ff70c991760 FUN_7ff70c991760 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1 * FUN_7ff70c991760(int param_1,undefined1 *param_2,longlong param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  char *pcVar5;
  undefined8 uVar6;
  undefined1 *puVar7;
  undefined2 **ppuVar8;
  undefined2 **ppuVar9;
  undefined *puVar10;
  undefined *apuStack_3e8 [3];
  longlong lStack_3d0;
  undefined2 *puStack_3c8;
  undefined1 *apuStack_3c0 [3];
  char *pcStack_3a8;
  undefined2 *puStack_3a0;
  undefined4 uStack_398;
  undefined8 uStack_390;
  undefined1 auStack_388 [8];
  undefined1 auStack_380 [72];
  char acStack_338 [8];
  undefined1 uStack_330;
  undefined1 auStack_238 [8];
  undefined2 auStack_230 [260];
  
  ppuVar8 = (undefined2 **)apuStack_3c0;
  ppuVar9 = (undefined2 **)apuStack_3c0;
  puStack_3c8 = (undefined2 *)0x7ff70c99177c;
  apuStack_3c0[0] = param_2;
  iVar2 = func_0x7ff70d68e2a3();
  puStack_3c8 = (undefined2 *)0x7ff70c991784;
  piVar4 = (int *)(*_DAT_7ff70cb964a0)();
  if (param_3 == 0) {
    return (undefined1 *)0x0;
  }
  iVar1 = *piVar4;
  *param_2 = 0;
  puVar7 = param_2;
  if (param_1 < -0x7ff6dff0) {
    switch(param_1) {
    case -0x7ff6fd00:
      puVar10 = &UNK_7ff70cb895b9;
      break;
    case -0x7ff6fcff:
      puVar10 = &UNK_7ff70cb8a5f4;
      break;
    case -0x7ff6fcfe:
      puVar10 = &UNK_7ff70cb89de6;
      break;
    case -0x7ff6fcfd:
      puVar10 = &UNK_7ff70cb89cf9;
      break;
    case -0x7ff6fcfc:
      puVar10 = &UNK_7ff70cb89c08;
      break;
    case -0x7ff6fcfb:
      puVar10 = &UNK_7ff70cb8a6f7;
      break;
    case -0x7ff6fcfa:
      puVar10 = &UNK_7ff70cb89c7f;
      break;
    case -0x7ff6fcf9:
      puVar10 = &UNK_7ff70cb8a12e;
      break;
    case -0x7ff6fcf8:
      puVar10 = &UNK_7ff70cb89f43;
      break;
    case -0x7ff6fcf7:
      puVar10 = &UNK_7ff70cb8a1cc;
      break;
    case -0x7ff6fcf6:
      puVar10 = &UNK_7ff70cb8a7d9;
      break;
    case -0x7ff6fcf5:
      puVar10 = &UNK_7ff70cb89e01;
      break;
    case -0x7ff6fcf4:
      puVar10 = &UNK_7ff70cb8a9e3;
      break;
    case -0x7ff6fcf3:
      puVar10 = &UNK_7ff70cb89b34;
      break;
    case -0x7ff6fcf2:
      puVar10 = &UNK_7ff70cb89b1f;
      break;
    case -0x7ff6fcf1:
      puVar10 = &UNK_7ff70cb8a8f9;
      break;
    case -0x7ff6fcf0:
      puVar10 = &UNK_7ff70cb8a648;
      break;
    case -0x7ff6fcef:
      puVar10 = &UNK_7ff70cb89597;
      break;
    default:
LAB_7ff70c991bb4:
      puVar10 = &UNK_7ff70cb8335c;
      break;
    case -0x7ff6fcea:
      puVar10 = &UNK_7ff70cb8a78d;
      break;
    case -0x7ff6fce9:
      puVar10 = &UNK_7ff70cb8a89c;
      break;
    case -0x7ff6fce8:
      puVar10 = &UNK_7ff70cb8a620;
      break;
    case -0x7ff6fce0:
      puVar10 = &UNK_7ff70cb89b6b;
      break;
    case -0x7ff6fcdf:
      puVar10 = &UNK_7ff70cb8a143;
      break;
    case -0x7ff6fcde:
      puVar10 = &UNK_7ff70cb8a15a;
      break;
    case -0x7ff6fcdc:
      puVar10 = &UNK_7ff70cb898a8;
      break;
    case -0x7ff6fcdb:
      puVar10 = &UNK_7ff70cb899da;
      break;
    case -0x7ff6fcda:
      puStack_3c8 = (undefined2 *)&UNK_7ff70c991b50;
      FUN_7ff70c95c190(param_2,param_3,&UNK_7ff70cb8cefd,0x80090326);
      puStack_3c8 = (undefined2 *)&UNK_7ff70c991b56;
      piVar4 = (int *)(*_DAT_7ff70cb964a0)();
      iVar3 = *piVar4;
      goto joined_r0x7ff70c991d09;
    case -0x7ff6fcd9:
      puVar10 = &UNK_7ff70cb89ce6;
      break;
    case -0x7ff6fcd8:
      puVar10 = &UNK_7ff70cb8a8b2;
      break;
    case -0x7ff6fcd7:
      puVar10 = &UNK_7ff70cb8a4f3;
      break;
    case -0x7ff6fcd0:
      puVar10 = &UNK_7ff70cb8a509;
      break;
    case -0x7ff6fccf:
      puVar10 = &UNK_7ff70cb8a267;
      break;
    case -0x7ff6fcce:
      puVar10 = &UNK_7ff70cb8a90f;
      break;
    case -0x7ff6fccd:
      puVar10 = &UNK_7ff70cb8a813;
      break;
    case -0x7ff6fccc:
      puVar10 = &UNK_7ff70cb895e6;
      break;
    case -0x7ff6fccb:
      puVar10 = &UNK_7ff70cb89b9b;
      break;
    case -0x7ff6fcca:
      puVar10 = &UNK_7ff70cb8a5d6;
      break;
    case -0x7ff6fcc9:
      puVar10 = &UNK_7ff70cb8a771;
      break;
    case -0x7ff6fcc8:
      puVar10 = &UNK_7ff70cb8aa39;
      break;
    case -0x7ff6fcc7:
      puVar10 = &UNK_7ff70cb8ab0e;
      break;
    case -0x7ff6fcc6:
      puVar10 = &UNK_7ff70cb8a7f1;
      break;
    case -0x7ff6fcc5:
      puVar10 = &UNK_7ff70cb89b05;
      break;
    case -0x7ff6fcc4:
      puVar10 = &UNK_7ff70cb8ac5b;
      break;
    case -0x7ff6fcc3:
      puVar10 = &UNK_7ff70cb8a280;
      break;
    case -0x7ff6fcc2:
      puVar10 = &UNK_7ff70cb8a867;
      break;
    case -0x7ff6fcc1:
      puVar10 = &UNK_7ff70cb89aa1;
      break;
    case -0x7ff6fcc0:
      puVar10 = &UNK_7ff70cb89914;
      break;
    case -0x7ff6fcbf:
      puVar10 = &UNK_7ff70cb89c8f;
      break;
    case -0x7ff6fcbe:
      puVar10 = &UNK_7ff70cb8a55f;
      break;
    case -0x7ff6fcbd:
      puVar10 = &UNK_7ff70cb8a21d;
      break;
    case -0x7ff6fcbb:
      puVar10 = &UNK_7ff70cb8a84d;
      break;
    case -0x7ff6fcba:
      puVar10 = &UNK_7ff70cb89b88;
      break;
    case -0x7ff6fcb9:
      puVar10 = &UNK_7ff70cb89a79;
      break;
    case -0x7ff6fcb8:
      puVar10 = &UNK_7ff70cb8964c;
      break;
    case -0x7ff6fcb7:
      puVar10 = &UNK_7ff70cb8a609;
      break;
    case -0x7ff6fcb0:
      puVar10 = &UNK_7ff70cb8a834;
      break;
    case -0x7ff6fcaf:
      puVar10 = &UNK_7ff70cb8a95b;
      break;
    case -0x7ff6fcae:
      puVar10 = &UNK_7ff70cb8a7be;
      break;
    case -0x7ff6fcad:
      puVar10 = &UNK_7ff70cb8aacb;
      break;
    case -0x7ff6fcac:
      puVar10 = &UNK_7ff70cb8a51f;
      break;
    case -0x7ff6fcab:
      puVar10 = &UNK_7ff70cb8a8c5;
      break;
    case -0x7ff6fcaa:
      puVar10 = &UNK_7ff70cb8992e;
      break;
    case -0x7ff6fca9:
      puVar10 = &UNK_7ff70cb8a53b;
      break;
    case -0x7ff6fca8:
      puVar10 = &UNK_7ff70cb8aaf1;
      break;
    case -0x7ff6fca7:
      puVar10 = &UNK_7ff70cb8ab20;
      break;
    case -0x7ff6fca6:
      puVar10 = &UNK_7ff70cb8a8e2;
      break;
    case -0x7ff6fca5:
      puVar10 = &UNK_7ff70cb8a978;
      break;
    case -0x7ff6fca3:
      puVar10 = &UNK_7ff70cb89c67;
      break;
    case -0x7ff6fca2:
      puVar10 = &UNK_7ff70cb8965e;
      break;
    case -0x7ff6fca1:
      puVar10 = &UNK_7ff70cb895f9;
    }
  }
  else {
    switch(param_1) {
    case 0x90312:
      puVar10 = &UNK_7ff70cb8a9f6;
      break;
    case 0x90313:
      puVar10 = &UNK_7ff70cb8aa0c;
      break;
    case 0x90314:
      puVar10 = &UNK_7ff70cb8a489;
      break;
    case 0x90315:
      puVar10 = &UNK_7ff70cb89ebe;
      break;
    case 0x90316:
    case 0x90318:
    case 0x90319:
    case 0x9031a:
    case 0x9031b:
    case 0x9031c:
    case 0x9031d:
    case 0x9031e:
    case 0x9031f:
    case 0x90322:
    case 0x90324:
    case 0x90325:
    case 0x90326:
    case 0x90327:
    case 0x90328:
    case 0x90329:
    case 0x9032a:
    case 0x9032b:
    case 0x9032c:
    case 0x9032d:
    case 0x9032e:
    case 0x9032f:
    case 0x90330:
    case 0x90331:
    case 0x90332:
    case 0x90333:
    case 0x90334:
    case 0x90335:
    case 0x90336:
    case 0x90337:
    case 0x90338:
    case 0x90339:
    case 0x9033a:
    case 0x9033b:
    case 0x9033c:
    case 0x9033d:
    case 0x9033e:
    case 0x9033f:
    case 0x90340:
    case 0x90341:
    case 0x90342:
    case 0x90343:
    case 0x90344:
    case 0x90345:
    case 0x90346:
    case 0x90347:
    case 0x90348:
    case 0x90349:
    case 0x9034a:
    case 0x9034b:
    case 0x9034c:
    case 0x9034d:
    case 0x9034e:
    case 0x9034f:
    case 0x90350:
    case 0x90351:
    case 0x90352:
    case 0x90353:
    case 0x90354:
    case 0x90355:
    case 0x90356:
    case 0x90357:
    case 0x90358:
    case 0x90359:
    case 0x9035a:
    case 0x9035b:
      goto LAB_7ff70c991bb4;
    case 0x90317:
      puVar10 = &UNK_7ff70cb8a886;
      break;
    case 0x90320:
      puVar10 = &UNK_7ff70cb89b4e;
      break;
    case 0x90321:
      puVar10 = &UNK_7ff70cb8a4ca;
      break;
    case 0x90323:
      puVar10 = &UNK_7ff70cb898d6;
      break;
    case 0x9035c:
      puVar10 = &UNK_7ff70cb8aa22;
      break;
    default:
      if (param_1 == 0) {
        puVar10 = &UNK_7ff70cb83345;
      }
      else {
        if (param_1 != -0x7ff6dff0) goto LAB_7ff70c991bb4;
        puVar10 = &UNK_7ff70cb8a9d3;
      }
    }
  }
  puStack_3a0 = (undefined2 *)CONCAT44(puStack_3a0._4_4_,param_1);
  puStack_3c8 = (undefined2 *)0x7ff70c991bdf;
  FUN_7ff70c95c190(auStack_380,0x50,&UNK_7ff70cb8f0e8,puVar10);
  uStack_330 = 0;
  auStack_230[0] = 0;
  puStack_3c8 = auStack_230;
  uStack_390 = 0;
  uStack_398 = 0x100;
  ppuVar8 = &puStack_3c8;
  ppuVar9 = &puStack_3c8;
  lStack_3d0 = 0x7ff70c991c22;
  puStack_3a0 = puStack_3c8;
  iVar3 = func_0x7ff70d5cfe16(0x1200,0,param_1,0);
  if (iVar3 != 0) {
    lStack_3d0 = (longlong)&UNK_7ff70c991c41;
    func_0x7ff70cc5510b(acStack_338,auStack_238,0xff);
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  lStack_3d0 = 0x7ff70c991c6f;
  pcVar5 = (char *)FUN_7ff70cb12b90(acStack_338,10);
  if (pcVar5 != (char *)0x0) {
    if ((acStack_338 < pcVar5) && (pcVar5[-1] == '\r')) {
      pcVar5[-1] = '\0';
    }
    else {
      *pcVar5 = '\0';
    }
  }
  if (acStack_338[0] == '\0') {
    ppuVar8 = (undefined2 **)&lStack_3d0;
    ppuVar9 = (undefined2 **)&lStack_3d0;
    lStack_3d0 = param_3;
    func_0x7ff70d7619af(param_2,auStack_388,param_3);
    param_2[param_3 + -1] = 0;
    piVar4 = (int *)(*_DAT_7ff70cb964a0)();
    iVar3 = *piVar4;
  }
  else {
    lStack_3d0 = 0x7ff70c991ca9;
    pcStack_3a8 = acStack_338;
    FUN_7ff70c95c190(param_2,param_3,&UNK_7ff70cb831a1,auStack_388);
    lStack_3d0 = 0x7ff70c991caf;
    piVar4 = (int *)(*_DAT_7ff70cb964a0)();
    iVar3 = *piVar4;
  }
joined_r0x7ff70c991d09:
  if (iVar3 != iVar1) {
    *(undefined8 *)((longlong)ppuVar8 + -8) = 0x7ff70c991cb9;
    piVar4 = (int *)(*_DAT_7ff70cb964a0)();
    *piVar4 = iVar1;
    ppuVar9 = ppuVar8;
  }
  *(undefined1 **)((longlong)ppuVar9 + -8) = puVar7;
  *(undefined8 *)((longlong)ppuVar9 + -0x10) = 0x7ff70c991cc1;
  uVar6 = func_0x7ff70da7dbc1();
  if (iVar2 != (int)uVar6) {
    *(undefined8 *)((longlong)ppuVar9 + -0x10) = uVar6;
    *(undefined8 *)((longlong)ppuVar9 + -0x18) = 0x7ff70c991ccd;
    func_0x7ff70d963cdb(iVar2);
  }
  return param_2;
}


