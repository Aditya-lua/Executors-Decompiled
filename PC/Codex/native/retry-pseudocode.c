/* Longer-timeout retries for functions that failed the primary export. */

/* ==================================================================== */
/* 180002ad0 / FUN_180002ad0 */
/* RETRY FAILED: Exception while decompiling 180002ad0: process: timeout
 */

/* ==================================================================== */
/* 18000fed0 / FUN_18000fed0 */
/* RETRY FAILED: Exception while decompiling 18000fed0: process: timeout
 */

/* ==================================================================== */
/* 1800295e0 / FUN_1800295e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_1800295e0(void)

{
  longlong lVar1;
  uint uVar2;
  undefined8 uVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  longlong lVar6;
  ulonglong uVar7;
  undefined local_res8 [8];
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined local_48;
  undefined local_47;
  undefined local_46;
  undefined local_45;
  undefined local_44;
  undefined local_43;
  undefined local_42;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined local_30;
  undefined local_2f;
  undefined local_2e;
  undefined local_2d;
  undefined local_2c;
  undefined local_2b;
  undefined local_2a;
  undefined local_29;
  undefined local_28;
  
  uVar2 = _tls_index;
  local_68 = 0xb839d3bcfab4821c;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x4dd8aafca19338);
  uVar5 = (ulonglong)_tls_index;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + uVar5 * 8);
  uVar7 = 0;
  if ((*(uint *)(lVar1 + 0x11928) & 1) == 0) {
    *(uint *)(lVar1 + 0x11928) = *(uint *)(lVar1 + 0x11928) | 1;
    *(undefined *)(lVar1 + 0x17617) = 1;
    uVar4 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x17608 + uVar4) = *(undefined *)((longlong)&local_68 + uVar4);
      uVar4 = uVar4 + 1;
    } while (uVar4 < 0xf);
    FUN_180505120(&LAB_1806138e0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + uVar5 * 8);
  lVar6 = lVar1 + 0x17608;
  if (*(char *)(lVar1 + 0x17617) != '\0') {
    FUN_180054820(lVar6,0xf,0xeb4dbdc995d7e15d);
    *(undefined *)(lVar1 + 0x17617) = 0;
  }
  local_68 = 0xd6e89d9254d548e0;
  uStack_60 = 0xd2fb99926ec945c4;
  local_58 = CONCAT53(local_58._3_5_,0xbd4ec2);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d580 = lVar6;
  if ((*(uint *)(lVar1 + 0xfc4c) & 1) == 0) {
    *(uint *)(lVar1 + 0xfc4c) = *(uint *)(lVar1 + 0xfc4c) | 1;
    *(undefined *)(lVar1 + 0x2ab93) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2ab80 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_1806138b0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2ab80;
  if (*(char *)(lVar1 + 0x2ab93) != '\0') {
    FUN_180054820(lVar6,0x13,0xbb8debf73dbd2ba1);
    *(undefined *)(lVar1 + 0x2ab93) = 0;
  }
  local_68 = 0x282f78e96aeba8e0;
  uStack_60 = 0x142263f077eca2e9;
  local_58 = 0x272974cc77f1aed7;
  uStack_50 = CONCAT44(uStack_50._4_4_,0x3faa8c8);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d588 = lVar6;
  if ((*(uint *)(lVar1 + 0x113f8) & 1) == 0) {
    *(uint *)(lVar1 + 0x113f8) = *(uint *)(lVar1 + 0x113f8) | 1;
    *(undefined *)(lVar1 + 0xfaa4) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xfa88 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1c);
    FUN_180505120(&LAB_180613880);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xfa88;
  if (*(char *)(lVar1 + 0xfaa4) != '\0') {
    FUN_180054820(lVar6,0x1c,0x515b119f039fcba1);
    *(undefined *)(lVar1 + 0xfaa4) = 0;
  }
  local_68 = 0x86989f496e3e11cc;
  uStack_60 = CONCAT62(uStack_60._2_6_,0x75e8);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d590 = lVar6;
  if ((*(uint *)(lVar1 + 0x16430) & 1) == 0) {
    *(uint *)(lVar1 + 0x16430) = *(uint *)(lVar1 + 0x16430) | 1;
    *(undefined *)(lVar1 + 0x19e0a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x19e00 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 10);
    FUN_180505120(&LAB_180613850);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x19e00;
  if (*(char *)(lVar1 + 0x19e0a) != '\0') {
    FUN_180054820(lVar6,10,0xe5f1e93b0b6d758d);
    *(undefined *)(lVar1 + 0x19e0a) = 0;
  }
  local_68 = 0xda90cf1025282130;
  uStack_60 = 0xdc9ad21f3b2c1c02;
  local_58 = CONCAT71(local_58._1_7_,0x71);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d598 = lVar6;
  if ((*(uint *)(lVar1 + 0x12d08) & 1) == 0) {
    *(uint *)(lVar1 + 0x12d08) = *(uint *)(lVar1 + 0x12d08) | 1;
    *(undefined *)(lVar1 + 0x22221) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x22210 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_180613820);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x22210;
  if (*(char *)(lVar1 + 0x22221) != '\0') {
    FUN_180054820(lVar6,0x11,0xb9f9bb6949494f71);
    *(undefined *)(lVar1 + 0x22221) = 0;
  }
  local_68 = 0xb86ccf865ab4bf6c;
  uStack_60 = 0xb877eb975eb19243;
  local_58 = CONCAT26(local_58._6_2_,0xbb9552b9b85b);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5a0 = lVar6;
  if ((*(uint *)(lVar1 + 0x28a5c) & 1) == 0) {
    *(uint *)(lVar1 + 0x28a5c) = *(uint *)(lVar1 + 0x28a5c) | 1;
    *(undefined *)(lVar1 + 0x160b6) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x160a0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_1806137f0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x160a0;
  if (*(char *)(lVar1 + 0x160b6) != '\0') {
    FUN_180054820(lVar6,0x16,0xd705bbe737ddd12d);
    *(undefined *)(lVar1 + 0x160b6) = 0;
  }
  local_68 = 0x20887d4a3034efce;
  uStack_60 = 0x2b885f46322fc7e1;
  local_58 = 0x2095684e2f1eeeea;
  uStack_50 = 0x2a82605d2f38d2fd;
  local_48 = 0x8f;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5a8 = lVar6;
  if ((*(uint *)(lVar1 + 0x1c448) & 1) == 0) {
    *(uint *)(lVar1 + 0x1c448) = *(uint *)(lVar1 + 0x1c448) | 1;
    *(undefined *)(lVar1 + 0x2b2b1) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2b290 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x21);
    FUN_180505120(&LAB_1806137c0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2b290;
  if (*(char *)(lVar1 + 0x2b2b1) != '\0') {
    FUN_180054820(lVar6,0x21,0x4fe1092b5d5d818f);
    *(undefined *)(lVar1 + 0x2b2b1) = 0;
  }
  local_68 = 0xbc8ca7c0d4306f54;
  uStack_60 = 0xb78c85ccd62b477b;
  local_58 = 0xbc91b2c4cb1a6e70;
  uStack_50 = 0x808abac5cc2d5267;
  local_48 = 0x70;
  local_47 = 0x73;
  local_46 = 0x2f;
  local_45 = 0xd0;
  local_44 = 0xc2;
  local_43 = 0xb6;
  local_42 = 0xe5;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5b0 = lVar6;
  if ((*(uint *)(lVar1 + 0x9504) & 1) == 0) {
    *(uint *)(lVar1 + 0x9504) = *(uint *)(lVar1 + 0x9504) | 1;
    *(undefined *)(lVar1 + 0x14a87) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x14a60 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x27);
    FUN_180505120(&LAB_180613790);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x14a60;
  if (*(char *)(lVar1 + 0x14a87) != '\0') {
    FUN_180054820(lVar6,0x27,0xd3e5d3a1b9590115);
    *(undefined *)(lVar1 + 0x14a87) = 0;
  }
  local_68 = 0x68f5585d78e75734;
  uStack_60 = 0x68f74b4c44fa571a;
  local_58 = CONCAT53(local_58._3_5_,0x895c16);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5b8 = lVar6;
  if ((*(uint *)(lVar1 + 0x2906c) & 1) == 0) {
    *(uint *)(lVar1 + 0x2906c) = *(uint *)(lVar1 + 0x2906c) | 1;
    *(undefined *)(lVar1 + 0x2610b) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x260f8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180613760);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x260f8;
  if (*(char *)(lVar1 + 0x2610b) != '\0') {
    FUN_180054820(lVar6,0x13,0x181392917893975);
    *(undefined *)(lVar1 + 0x2610b) = 0;
  }
  local_68 = 0xa301c30a62d6178;
  uStack_60 = 0x11062a248b3c7f5e;
  local_58 = CONCAT35(local_58._5_3_,0x57823e784f);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5c0 = lVar6;
  if ((*(uint *)(lVar1 + 0x2c024) & 1) == 0) {
    *(uint *)(lVar1 + 0x2c024) = *(uint *)(lVar1 + 0x2c024) | 1;
    *(undefined *)(lVar1 + 0x13bed) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x13bd8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180613730);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x13bd8;
  if (*(char *)(lVar1 + 0x13bed) != '\0') {
    FUN_180054820(lVar6,0x15,0x63637957e75d1139);
    *(undefined *)(lVar1 + 0x13bed) = 0;
  }
  local_68 = 0xea1651d2413d4d9a;
  uStack_60 = 0xec0055f468215ea2;
  local_58 = 0xff0152e87f284ba9;
  uStack_50 = CONCAT44(uStack_50._4_4_,0xd285eb2);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5c8 = lVar6;
  if ((*(uint *)(lVar1 + 0x282ec) & 1) == 0) {
    *(uint *)(lVar1 + 0x282ec) = *(uint *)(lVar1 + 0x282ec) | 1;
    *(undefined *)(lVar1 + 0x1c16c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1c150 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1c);
    FUN_180505120(&LAB_180613700);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1c150;
  if (*(char *)(lVar1 + 0x1c16c) != '\0') {
    FUN_180054820(lVar6,0x1c,0x897337bb0d4d3ddb);
    *(undefined *)(lVar1 + 0x1c16c) = 0;
  }
  local_68 = 0xe7fe03784155d534;
  uStack_60 = 0xdae307747c57f512;
  local_58 = CONCAT17(local_58._7_1_,0x97127a7a53d710);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5d0 = lVar6;
  if ((*(uint *)(lVar1 + 0x1adc8) & 1) == 0) {
    *(uint *)(lVar1 + 0x1adc8) = *(uint *)(lVar1 + 0x1adc8) | 1;
    *(undefined *)(lVar1 + 0xc377) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xc360 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x17);
    FUN_180505120(&LAB_1806136d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xc360;
  if (*(char *)(lVar1 + 0xc377) != '\0') {
    FUN_180054820(lVar6,0x17,0x899777191325a575);
    *(undefined *)(lVar1 + 0xc377) = 0;
  }
  local_68 = 0xace164832249db56;
  uStack_60 = 0xaefa7d85146ace70;
  local_58 = CONCAT62(local_58._2_6_,0xab72);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5d8 = lVar6;
  if ((*(uint *)(lVar1 + 0x26c4c) & 1) == 0) {
    *(uint *)(lVar1 + 0x26c4c) = *(uint *)(lVar1 + 0x26c4c) | 1;
    *(undefined *)(lVar1 + 0x21962) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x21950) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_1806136a0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x21950;
  if (*(char *)(lVar1 + 0x21962) != '\0') {
    FUN_180054820(lVar6,0x12,0xcd930bf77139ab17);
    *(undefined *)(lVar1 + 0x21962) = 0;
  }
  local_68 = 0xb13a1db3aaede9d6;
  uStack_60 = 0xa03810b58df8caf2;
  local_58 = CONCAT71(local_58._1_7_,0x97);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5e0 = lVar6;
  if ((*(uint *)(lVar1 + 0x9d54) & 1) == 0) {
    *(uint *)(lVar1 + 0x9d54) = *(uint *)(lVar1 + 0x9d54) | 1;
    *(undefined *)(lVar1 + 0x2dd19) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2dd08 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_180613670);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2dd08;
  if (*(char *)(lVar1 + 0x2dd19) != '\0') {
    FUN_180054820(lVar6,0x11,0xc55b79c3ff9d9997);
    *(undefined *)(lVar1 + 0x2dd19) = 0;
  }
  local_68 = 0x20b0ec2728beaa7a;
  uStack_60 = 0x23adca003fa8ad55;
  local_58 = CONCAT44(local_58._4_4_,0x4da8ba52);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5e8 = lVar6;
  if ((*(uint *)(lVar1 + 0xb3c4) & 1) == 0) {
    *(uint *)(lVar1 + 0xb3c4) = *(uint *)(lVar1 + 0xb3c4) | 1;
    *(undefined *)(lVar1 + 0x1740c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x173f8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180613640);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x173f8;
  if (*(char *)(lVar1 + 0x1740c) != '\0') {
    FUN_180054820(lVar6,0x14,0x55dfaf534dcdd93b);
    *(undefined *)(lVar1 + 0x1740c) = 0;
  }
  local_68 = 0xf93847e7c0845c64;
  uStack_60 = 0xfa2f53ead792594c;
  local_58 = CONCAT53(local_58._3_5_,0xf7565d);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5f0 = lVar6;
  if ((*(uint *)(lVar1 + 0x223e4) & 1) == 0) {
    *(uint *)(lVar1 + 0x223e4) = *(uint *)(lVar1 + 0x223e4) | 1;
    *(undefined *)(lVar1 + 0x23f13) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x23f00 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180613610);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x23f00;
  if (*(char *)(lVar1 + 0x23f13) != '\0') {
    FUN_180054820(lVar6,0x13,0x955d0393a5f72f25);
    *(undefined *)(lVar1 + 0x23f13) = 0;
  }
  local_68 = 0xf548f8e398b822e2;
  uStack_60 = 0xec53c3f2aebf23cc;
  local_58 = CONCAT53(local_58._3_5_,0xcb34c0);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d5f8 = lVar6;
  if ((*(uint *)(lVar1 + 0x8298) & 1) == 0) {
    *(uint *)(lVar1 + 0x8298) = *(uint *)(lVar1 + 0x8298) | 1;
    *(undefined *)(lVar1 + 0x16aa3) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x16a90 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_1806135e0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x16a90;
  if (*(char *)(lVar1 + 0x16aa3) != '\0') {
    FUN_180054820(lVar6,0x13,0x8525b197fdcb51a3);
    *(undefined *)(lVar1 + 0x16aa3) = 0;
  }
  local_68 = 0xade65689589eca94;
  uStack_60 = 0xb5f57eae4f88deb4;
  local_58 = CONCAT44(local_58._4_4_,0x3d88dabc);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d600 = lVar6;
  if ((*(uint *)(lVar1 + 0x242f0) & 1) == 0) {
    *(uint *)(lVar1 + 0x242f0) = *(uint *)(lVar1 + 0x242f0) | 1;
    *(undefined *)(lVar1 + 0x11834) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x11820 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_1806135b0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x11820;
  if (*(char *)(lVar1 + 0x11834) != '\0') {
    FUN_180054820(lVar6,0x14,0xc3871bfd3dedb9d5);
    *(undefined *)(lVar1 + 0x11834) = 0;
  }
  local_68 = 0x6e80200b5eb660a0;
  uStack_60 = 0x7987142c42b17a8d;
  local_58 = CONCAT44(local_58._4_4_,0x3ba07088);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d608 = lVar6;
  if ((*(uint *)(lVar1 + 0x29000) & 1) == 0) {
    *(uint *)(lVar1 + 0x29000) = *(uint *)(lVar1 + 0x29000) | 1;
    *(undefined *)(lVar1 + 0x12664) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x12650 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180613580);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x12650;
  if (*(char *)(lVar1 + 0x12664) != '\0') {
    FUN_180054820(lVar6,0x14,0xff5717f3bc513e1);
    *(undefined *)(lVar1 + 0x12664) = 0;
  }
  local_68 = 0x6f6820453aa86a18;
  uStack_60 = CONCAT35(uStack_60._5_3_,0x313ab8702f);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d610 = lVar6;
  if ((*(uint *)(lVar1 + 0x8f38) & 1) == 0) {
    *(uint *)(lVar1 + 0x8f38) = *(uint *)(lVar1 + 0x8f38) | 1;
    *(undefined *)(lVar1 + 0x12905) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x128f8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xd);
    FUN_180505120(&LAB_180613550);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x128f8;
  if (*(char *)(lVar1 + 0x12905) != '\0') {
    FUN_180054820(lVar6,0xd,0x1d0d73315fdb1959);
    *(undefined *)(lVar1 + 0x12905) = 0;
  }
  local_68 = 0x2a5e432ee2b5e874;
  uStack_60 = 0x2a587333ee82ee40;
  local_58 = CONCAT62(local_58._2_6_,0x9d50);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d618 = lVar6;
  if ((*(uint *)(lVar1 + 0x1ba54) & 1) == 0) {
    *(uint *)(lVar1 + 0x1ba54) = *(uint *)(lVar1 + 0x1ba54) | 1;
    *(undefined *)(lVar1 + 0x1703a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x17028 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180613520);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x17028;
  if (*(char *)(lVar1 + 0x1703a) != '\0') {
    FUN_180054820(lVar6,0x12,0x493105418bd19d35);
    *(undefined *)(lVar1 + 0x1703a) = 0;
  }
  local_68 = 0xcde04b24050a21ec;
  uStack_60 = 0xc6ca4f37143823cc;
  local_58 = CONCAT62(local_58._2_6_,0x57c8);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d620 = lVar6;
  if ((*(uint *)(lVar1 + 0x12818) & 1) == 0) {
    *(uint *)(lVar1 + 0x12818) = *(uint *)(lVar1 + 0x12818) | 1;
    *(undefined *)(lVar1 + 0x25b9a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x25b88 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_1806134f0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x25b88;
  if (*(char *)(lVar1 + 0x25b9a) != '\0') {
    FUN_180054820(lVar6,0x12,0xa5a33945716b57ad);
    *(undefined *)(lVar1 + 0x25b9a) = 0;
  }
  local_68 = 0xfbfaff4241b01fba;
  uStack_60 = 0xeceae34c5ca5089e;
  local_58 = CONCAT26(local_58._6_2_,0x8d4656b81f89);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d628 = lVar6;
  if ((*(uint *)(lVar1 + 0x1f828) & 1) == 0) {
    *(uint *)(lVar1 + 0x1f828) = *(uint *)(lVar1 + 0x1f828) | 1;
    *(undefined *)(lVar1 + 0xf8b6) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xf8a0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_1806134c0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xf8a0;
  if (*(char *)(lVar1 + 0xf8b6) != '\0') {
    FUN_180054820(lVar6,0x16,0x89b98d2335d169fb);
    *(undefined *)(lVar1 + 0xf8b6) = 0;
  }
  local_68 = 0x8d6afd8095c49da4;
  uStack_60 = 0x9f5deab293ca9f8c;
  local_58 = CONCAT44(local_58._4_4_,0xe1c0888c);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d630 = lVar6;
  if ((*(uint *)(lVar1 + 0x2557c) & 1) == 0) {
    *(uint *)(lVar1 + 0x2557c) = *(uint *)(lVar1 + 0x2557c) | 1;
    *(undefined *)(lVar1 + 0x103ac) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x10398 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180613490);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x10398;
  if (*(char *)(lVar1 + 0x103ac) != '\0') {
    FUN_180054820(lVar6,0x14,0xe92f8fe1e1a5ebe5);
    *(undefined *)(lVar1 + 0x103ac) = 0;
  }
  local_68 = 0x9c7ad7d6e1266ff6;
  uStack_60 = 0x8741c0e4e13576c7;
  local_58 = CONCAT44(local_58._4_4_,0x95227ade);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d638 = lVar6;
  if ((*(uint *)(lVar1 + 0xd590) & 1) == 0) {
    *(uint *)(lVar1 + 0xd590) = *(uint *)(lVar1 + 0xd590) | 1;
    *(undefined *)(lVar1 + 0x1ddc4) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x1ddb0) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180613460);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1ddb0;
  if (*(char *)(lVar1 + 0x1ddc4) != '\0') {
    FUN_180054820(lVar6,0x14,0xf133a5b7954719b7);
    *(undefined *)(lVar1 + 0x1ddc4) = 0;
  }
  local_68 = 0xb24c45900f36957a;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x1f4496153e974f);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d640 = lVar6;
  if ((*(uint *)(lVar1 + 0x10db8) & 1) == 0) {
    *(uint *)(lVar1 + 0x10db8) = *(uint *)(lVar1 + 0x10db8) | 1;
    *(undefined *)(lVar1 + 0x1408f) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x14080 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_180613430);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x14080;
  if (*(char *)(lVar1 + 0x1408f) != '\0') {
    FUN_180054820(lVar6,0xf,0xd71f37f17b57e33b);
    *(undefined *)(lVar1 + 0x1408f) = 0;
  }
  local_68 = 0x214616e8dc0b3af3;
  uStack_60 = CONCAT35(uStack_60._5_3_,0x8dde0c32c7);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d648 = lVar6;
  if ((*(uint *)(lVar1 + 0x9de0) & 1) == 0) {
    *(uint *)(lVar1 + 0x9de0) = *(uint *)(lVar1 + 0x9de0) | 1;
    *(undefined *)(lVar1 + 0x24a05) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x249f8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xd);
    FUN_180505120(&LAB_180613400);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x249f8;
  if (*(char *)(lVar1 + 0x24a05) != '\0') {
    FUN_180054820(lVar6,0xd,0x5323458dbb6f5bb1);
    *(undefined *)(lVar1 + 0x24a05) = 0;
  }
  local_68 = 0xc077e8ea1ac60f73;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x5e8fa04df0f54);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d650 = lVar6;
  if ((*(uint *)(lVar1 + 0x1ef34) & 1) == 0) {
    *(uint *)(lVar1 + 0x1ef34) = *(uint *)(lVar1 + 0x1ef34) | 1;
    *(undefined *)(lVar1 + 0x23927) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x23918 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_1806133d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x23918;
  if (*(char *)(lVar1 + 0x23927) != '\0') {
    FUN_180054820(lVar6,0xf,0x93058d996da97d31);
    *(undefined *)(lVar1 + 0x23927) = 0;
  }
  local_68 = 0xff96df40c1ca7411;
  uStack_60 = 0xe48fdd40c0df6427;
  local_58 = CONCAT53(local_58._3_5_,0xad6430);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d658 = lVar6;
  if ((*(uint *)(lVar1 + 0x19a38) & 1) == 0) {
    *(uint *)(lVar1 + 0x19a38) = *(uint *)(lVar1 + 0x19a38) | 1;
    *(undefined *)(lVar1 + 0x2840b) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x283f8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_1806133a0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x283f8;
  if (*(char *)(lVar1 + 0x2840b) != '\0') {
    FUN_180054820(lVar6,0x13,0x8df9af2593ad0153);
    *(undefined *)(lVar1 + 0x2840b) = 0;
  }
  local_68 = 0x7241ae12ac436441;
  uStack_60 = 0x7e58b529a27c6571;
  local_58 = CONCAT62(local_58._2_6_,0x1166);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d660 = lVar6;
  if ((*(uint *)(lVar1 + 0x198e0) & 1) == 0) {
    *(uint *)(lVar1 + 0x198e0) = *(uint *)(lVar1 + 0x198e0) | 1;
    *(undefined *)(lVar1 + 0x251e2) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x251d0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180613370);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x251d0;
  if (*(char *)(lVar1 + 0x251e2) != '\0') {
    FUN_180054820(lVar6,0x12,0x1d31c35bc72f1103);
    *(undefined *)(lVar1 + 0x251e2) = 0;
  }
  local_68 = 0x8a0320c06b825ebc;
  uStack_60 = 0x911210d05da46390;
  local_58 = CONCAT35(local_58._5_3_,0xa94aa66489);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d668 = lVar6;
  if ((*(uint *)(lVar1 + 0x1f170) & 1) == 0) {
    *(uint *)(lVar1 + 0x1f170) = *(uint *)(lVar1 + 0x1f170) | 1;
    *(undefined *)(lVar1 + 0x26cad) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x26c98 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180613340);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x26c98;
  if (*(char *)(lVar1 + 0x26cad) != '\0') {
    FUN_180054820(lVar6,0x15,0xe37743a92fc50dff);
    *(undefined *)(lVar1 + 0x26cad) = 0;
  }
  local_68 = 0x95a5e85c9fe64626;
  uStack_60 = 0x8da9ec4d99ea6400;
  local_58 = 0x8ba2ed5081ea5535;
  uStack_50 = CONCAT71(uStack_50._1_7_,0x65);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d670 = lVar6;
  if ((*(uint *)(lVar1 + 0x1d9d8) & 1) == 0) {
    *(uint *)(lVar1 + 0x1d9d8) = *(uint *)(lVar1 + 0x1d9d8) | 1;
    *(undefined *)(lVar1 + 0x1be91) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1be78 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x19);
    FUN_180505120(&LAB_180613310);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1be78;
  if (*(char *)(lVar1 + 0x1be91) != '\0') {
    FUN_180054820(lVar6,0x19,0xf9c78939f7852765);
    *(undefined *)(lVar1 + 0x1be91) = 0;
  }
  local_68 = 0xd69dc642fbf9f210;
  uStack_60 = CONCAT17(uStack_60._7_1_,0xe9d64efee3e136);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d678 = lVar6;
  if ((*(uint *)(lVar1 + 0xe6fc) & 1) == 0) {
    *(uint *)(lVar1 + 0xe6fc) = *(uint *)(lVar1 + 0xe6fc) | 1;
    *(undefined *)(lVar1 + 0x1a8cf) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1a8c0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_1806132e0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1a8c0;
  if (*(char *)(lVar1 + 0x1a8cf) != '\0') {
    FUN_180054820(lVar6,0xf,0x85e9b32d97959353);
    *(undefined *)(lVar1 + 0x1a8cf) = 0;
  }
  local_68 = 0xa28597055399c5a;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x4d4e66483f8f7c);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d680 = lVar6;
  if ((*(uint *)(lVar1 + 0xab88) & 1) == 0) {
    *(uint *)(lVar1 + 0xab88) = *(uint *)(lVar1 + 0xab88) | 1;
    *(undefined *)(lVar1 + 0x2b17f) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2b170 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_1806132b0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2b170;
  if (*(char *)(lVar1 + 0x2b17f) != '\0') {
    FUN_180054820(lVar6,0xf,0x594d2b052149fd19);
    *(undefined *)(lVar1 + 0x2b17f) = 0;
  }
  local_68 = 0x871a8145976f3a4;
  uStack_60 = 0x135c9e0a4578ef94;
  local_58 = CONCAT35(local_58._5_3_,0x735274f291);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d688 = lVar6;
  if ((*(uint *)(lVar1 + 0x18bf4) & 1) == 0) {
    *(uint *)(lVar1 + 0x18bf4) = *(uint *)(lVar1 + 0x18bf4) | 1;
    *(undefined *)(lVar1 + 0x26e05) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x26df0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180613280);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x26df0;
  if (*(char *)(lVar1 + 0x26e05) != '\0') {
    FUN_180054820(lVar6,0x15,0x6139cd7337179be7);
    *(undefined *)(lVar1 + 0x26e05) = 0;
  }
  local_68 = 0x94890eaacbc27360;
  uStack_60 = 0x8fb538b4d7cc6f50;
  local_58 = 0x98920ca3ccce7a46;
  uStack_50 = CONCAT26(uStack_50._6_2_,0x6ba8c6ca6d51);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d690 = lVar6;
  if ((*(uint *)(lVar1 + 0x26fbc) & 1) == 0) {
    *(uint *)(lVar1 + 0x26fbc) = *(uint *)(lVar1 + 0x26fbc) | 1;
    *(undefined *)(lVar1 + 0xe96e) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xe950 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1e);
    FUN_180505120(&LAB_180613250);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xe950;
  if (*(char *)(lVar1 + 0xe96e) != '\0') {
    FUN_180054820(lVar6,0x1e,0xfdc16bcda5a31b23);
    *(undefined *)(lVar1 + 0xe96e) = 0;
  }
  local_res8[0] = 0xfa;
  local_res8[1] = 0x87;
  local_res8[2] = 0xd0;
  local_res8[3] = 0x6d;
  local_res8[4] = 0x83;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d698 = lVar6;
  if ((*(uint *)(lVar1 + 0x2c1dc) & 1) == 0) {
    *(uint *)(lVar1 + 0x2c1dc) = *(uint *)(lVar1 + 0x2c1dc) | 1;
    *(undefined *)(lVar1 + 0x9de9) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x9de4 + uVar5) = local_res8[uVar5];
      uVar5 = uVar5 + 1;
    } while (uVar5 < 5);
    FUN_180505120(&LAB_180613220);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6a0 = lVar1 + 0x9de4;
  uVar5 = uVar7;
  if (*(char *)(lVar1 + 0x9de9) != '\0') {
    do {
      *(byte *)(uVar5 + _DAT_18087d6a0) =
           (byte)(0xa919b78319b1efb9 >> (((byte)uVar5 & 7) << 3)) ^
           *(byte *)(uVar5 + _DAT_18087d6a0);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 5);
    *(undefined *)(lVar1 + 0x9de9) = 0;
  }
  local_68 = 0xde3fbe27a8ec17e4;
  uStack_60 = 0xee0e9435afe628e3;
  local_58 = CONCAT71(local_58._1_7_,0xa7);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  if ((*(uint *)(lVar1 + 0x13afc) & 1) == 0) {
    *(uint *)(lVar1 + 0x13afc) = *(uint *)(lVar1 + 0x13afc) | 1;
    *(undefined *)(lVar1 + 0x24ff9) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x24fe8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_1806131f0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x24fe8;
  if (*(char *)(lVar1 + 0x24ff9) != '\0') {
    FUN_180054820(lVar6,0x11,0x8b6dfd43dd837ba7);
    *(undefined *)(lVar1 + 0x24ff9) = 0;
  }
  local_68 = 0xf1f9a176216a960;
  uStack_60 = 0x3c0cbc177408a642;
  local_58 = CONCAT53(local_58._3_5_,0x63a04b);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6a8 = lVar6;
  if ((*(uint *)(lVar1 + 0xe9a4) & 1) == 0) {
    *(uint *)(lVar1 + 0xe9a4) = *(uint *)(lVar1 + 0xe9a4) | 1;
    *(undefined *)(lVar1 + 0x2aaa3) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2aa90 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_1806131c0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2aa90;
  if (*(char *)(lVar1 + 0x2aaa3) != '\0') {
    FUN_180054820(lVar6,0x13,0x5f6dff631163c523);
    *(undefined *)(lVar1 + 0x2aaa3) = 0;
  }
  local_68 = 0xfbbc39689d53a8e6;
  uStack_60 = 0xfbb6087a8350b3c4;
  local_58 = CONCAT35(local_58._5_3_,0x9945caed3);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6b0 = lVar6;
  if ((*(uint *)(lVar1 + 0xf660) & 1) == 0) {
    *(uint *)(lVar1 + 0xf660) = *(uint *)(lVar1 + 0xf660) | 1;
    *(undefined *)(lVar1 + 0x2806d) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x28058 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180613190);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x28058;
  if (*(char *)(lVar1 + 0x2806d) != '\0') {
    FUN_180054820(lVar6,0x15,0x89d35b09f13fc7a5);
    *(undefined *)(lVar1 + 0x2806d) = 0;
  }
  local_68 = 0x1875747ebfbfaa12;
  uStack_60 = 0x12686169b680ab3e;
  local_58 = CONCAT62(local_58._2_6_,0xc534);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6b8 = lVar6;
  if ((*(uint *)(lVar1 + 0x12eec) & 1) == 0) {
    *(uint *)(lVar1 + 0x12eec) = *(uint *)(lVar1 + 0x12eec) | 1;
    *(undefined *)(lVar1 + 0xdba2) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xdb90 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180613160);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xdb90;
  if (*(char *)(lVar1 + 0xdba2) != '\0') {
    FUN_180054820(lVar6,0x12,0x7101171bd3d3c551);
    *(undefined *)(lVar1 + 0xdba2) = 0;
  }
  local_68 = 0xec0213b618325eb8;
  uStack_60 = 0x890402ba032d54a8;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6c0 = lVar6;
  if ((*(uint *)(lVar1 + 0x2da4c) & 1) == 0) {
    *(uint *)(lVar1 + 0x2da4c) = *(uint *)(lVar1 + 0x2da4c) | 1;
    *(undefined *)(lVar1 + 0x23e98) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x23e88 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180613130);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x23e88;
  if (*(char *)(lVar1 + 0x23e98) != '\0') {
    FUN_180054820(lVar6,0x10,0x896161d3755f31fb);
    *(undefined *)(lVar1 + 0x23e98) = 0;
  }
  local_68 = 0xce48ac459cd1a52;
  uStack_60 = CONCAT26(uStack_60._6_2_,0xedc85cca0363);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6c8 = lVar6;
  if ((*(uint *)(lVar1 + 0x1010c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1010c) = *(uint *)(lVar1 + 0x1010c) | 1;
    *(undefined *)(lVar1 + 0x2b926) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2b918 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180613100);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2b918;
  if (*(char *)(lVar1 + 0x2b926) != '\0') {
    FUN_180054820(lVar6,0xe,0x69b7edad3fa37511);
    *(undefined *)(lVar1 + 0x2b926) = 0;
  }
  local_68 = 0x5fd86a480977e2be;
  uStack_60 = 0x7edf68571d7cde98;
  local_58 = CONCAT17(local_58._7_1_,0xad6842066fff98);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6d0 = lVar6;
  if ((*(uint *)(lVar1 + 0x8324) & 1) == 0) {
    *(uint *)(lVar1 + 0x8324) = *(uint *)(lVar1 + 0x8324) | 1;
    *(undefined *)(lVar1 + 0x27547) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x27530 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x17);
    FUN_180505120(&LAB_1806130d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x27530;
  if (*(char *)(lVar1 + 0x27547) != '\0') {
    FUN_180054820(lVar6,0x17,0x2dad0d216f198dfd);
    *(undefined *)(lVar1 + 0x27547) = 0;
  }
  local_68 = 0xd09d2c00b5cfaae0;
  uStack_60 = 0xcf9b2a36a2d5acd5;
  local_58 = CONCAT44(local_58._4_4_,0xdbc4a6ca);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6d8 = lVar6;
  if ((*(uint *)(lVar1 + 0x2543c) & 1) == 0) {
    *(uint *)(lVar1 + 0x2543c) = *(uint *)(lVar1 + 0x2543c) | 1;
    *(undefined *)(lVar1 + 0x1986c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x19858 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_1806130a0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x19858;
  if (*(char *)(lVar1 + 0x1986c) != '\0') {
    FUN_180054820(lVar6,0x14,0xb9e94f65dba1c5a3);
    *(undefined *)(lVar1 + 0x1986c) = 0;
  }
  local_68 = 0x777f573c3d799c30;
  uStack_60 = 0x27795c3d20619c01;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6e0 = lVar6;
  if ((*(uint *)(lVar1 + 0x178a8) & 1) == 0) {
    *(uint *)(lVar1 + 0x178a8) = *(uint *)(lVar1 + 0x178a8) | 1;
    *(undefined *)(lVar1 + 0x1cc70) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1cc60 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180613070);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1cc60;
  if (*(char *)(lVar1 + 0x1cc70) != '\0') {
    FUN_180054820(lVar6,0x10,0x270b39594917f373);
    *(undefined *)(lVar1 + 0x1cc70) = 0;
  }
  local_68 = 0x522101482169400e;
  uStack_60 = 0x61302a433a6e5b2e;
  local_58 = CONCAT35(local_58._5_3_,0x2d3064463b);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6e8 = lVar6;
  if ((*(uint *)(lVar1 + 0xb33c) & 1) == 0) {
    *(uint *)(lVar1 + 0xb33c) = *(uint *)(lVar1 + 0xb33c) | 1;
    *(undefined *)(lVar1 + 0x1fd35) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1fd20 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180613040);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1fd20;
  if (*(char *)(lVar1 + 0x1fd35) != '\0') {
    FUN_180054820(lVar6,0x15,0x1355792d55072f4d);
    *(undefined *)(lVar1 + 0x1fd35) = 0;
  }
  local_68 = 0x9ff1b0e5a11df600;
  uStack_60 = 0x90f4a9e5b020eb26;
  local_58 = CONCAT62(local_58._2_6_,0x9926);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6f0 = lVar6;
  if ((*(uint *)(lVar1 + 0x1db04) & 1) == 0) {
    *(uint *)(lVar1 + 0x1db04) = *(uint *)(lVar1 + 0x1db04) | 1;
    *(undefined *)(lVar1 + 0x7f52) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x7f40) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180613010);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x7f40;
  if (*(char *)(lVar1 + 0x7f52) != '\0') {
    FUN_180054820(lVar6,0x12,0xf39ddf97d5739943);
    *(undefined *)(lVar1 + 0x7f52) = 0;
  }
  local_68 = 0x1a363cd22486ccea;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x453cd8269fd1cc);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d6f8 = lVar6;
  if ((*(uint *)(lVar1 + 0x1d2cc) & 1) == 0) {
    *(uint *)(lVar1 + 0x1d2cc) = *(uint *)(lVar1 + 0x1d2cc) | 1;
    *(undefined *)(lVar1 + 0xe79f) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xe790 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_180612fe0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xe790;
  if (*(char *)(lVar1 + 0xe79f) != '\0') {
    FUN_180054820(lVar6,0xf,0x494559bb4fe9a3a9);
    *(undefined *)(lVar1 + 0xe79f) = 0;
  }
  local_res8[0] = 6;
  local_res8[1] = 0xd4;
  local_res8[2] = 5;
  local_res8[3] = 0xd4;
  local_res8[4] = 0x1a;
  local_res8[5] = 0x80;
  local_res8[6] = 0xba;
  local_res8[7] = 0x4d;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d700 = lVar6;
  if ((*(uint *)(lVar1 + 0x1728c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1728c) = *(uint *)(lVar1 + 0x1728c) | 1;
    *(undefined *)(lVar1 + 0x169f8) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x169f0 + uVar5) = local_res8[uVar5];
      uVar5 = uVar5 + 1;
    } while (uVar5 < 8);
    FUN_180505120(&LAB_180612fb0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x169f0;
  if (*(char *)(lVar1 + 0x169f8) != '\0') {
    FUN_180054820(lVar6,8,0x4dd3f55db177bb45);
    *(undefined *)(lVar1 + 0x169f8) = 0;
  }
  local_68 = 0xcc3ca286286bfecc;
  uStack_60 = 0xee27a2a6247fffe0;
  local_58 = CONCAT35(local_58._5_3_,0xc12376f8fb);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d708 = lVar6;
  if ((*(uint *)(lVar1 + 0x171ac) & 1) == 0) {
    *(uint *)(lVar1 + 0x171ac) = *(uint *)(lVar1 + 0x171ac) | 1;
    *(undefined *)(lVar1 + 0x18f9d) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x18f88 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180612f80);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x18f88;
  if (*(char *)(lVar1 + 0x18f9d) != '\0') {
    FUN_180054820(lVar6,0x15,0x8f55d7c14d19918f);
    *(undefined *)(lVar1 + 0x18f9d) = 0;
  }
  local_68 = 0x422efa0b9ced68a8;
  uStack_60 = CONCAT35(uStack_60._5_3_,0x5b8afa608a);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d710 = lVar6;
  if ((*(uint *)(lVar1 + 0x14758) & 1) == 0) {
    *(uint *)(lVar1 + 0x14758) = *(uint *)(lVar1 + 0x14758) | 1;
    *(undefined *)(lVar1 + 0xb50d) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xb500 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xd);
    FUN_180505120(&LAB_180612f50);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xb500;
  if (*(char *)(lVar1 + 0xb50d) != '\0') {
    FUN_180054820(lVar6,0xd,0x294d9b5bf99f07eb);
    *(undefined *)(lVar1 + 0xb50d) = 0;
  }
  local_68 = 0x4459ced0ea1d5af4;
  uStack_60 = 0x4a4cd8e1ea2b41c7;
  local_58 = 0x4a4ac3e2c2085bde;
  uStack_50 = 0x5f4eddefea2747d2;
  local_48 = 0xb7;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d718 = lVar6;
  if ((*(uint *)(lVar1 + 0xd720) & 1) == 0) {
    *(uint *)(lVar1 + 0xd720) = *(uint *)(lVar1 + 0xd720) | 1;
    *(undefined *)(lVar1 + 0x18e19) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x18df8) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x21);
    FUN_180505120(&LAB_180612f20);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x18df8;
  if (*(char *)(lVar1 + 0x18e19) != '\0') {
    FUN_180054820(lVar6,0x21,0x2d2bad838f6f35b7);
    *(undefined *)(lVar1 + 0x18e19) = 0;
  }
  local_68 = 0x1a95ec045e618060;
  uStack_60 = 0x16b4ec3942409b53;
  local_58 = CONCAT26(local_58._6_2_,0x8f32587a9951);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d720 = lVar6;
  if ((*(uint *)(lVar1 + 0x1ebe0) & 1) == 0) {
    *(uint *)(lVar1 + 0x1ebe0) = *(uint *)(lVar1 + 0x1ebe0) | 1;
    *(undefined *)(lVar1 + 0x2834e) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x28338 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_180612ef0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x28338;
  if (*(char *)(lVar1 + 0x2834e) != '\0') {
    FUN_180054820(lVar6,0x16,0x73e78f573b13ef23);
    *(undefined *)(lVar1 + 0x2834e) = 0;
  }
  local_68 = 0xd78444edfcb2df7e;
  uStack_60 = 0xda825bebf884ef79;
  local_58 = CONCAT62(local_58._2_6_,0xad58);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d728 = lVar6;
  if ((*(uint *)(lVar1 + 0x2dcec) & 1) == 0) {
    *(uint *)(lVar1 + 0x2dcec) = *(uint *)(lVar1 + 0x2dcec) | 1;
    *(undefined *)(lVar1 + 0x2aafa) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2aae8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180612ec0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2aae8;
  if (*(char *)(lVar1 + 0x2aafa) != '\0') {
    FUN_180054820(lVar6,0x12,0xb9eb2d999dd7ad3d);
    *(undefined *)(lVar1 + 0x2aafa) = 0;
  }
  local_68 = 0xf4f59cc33086d75a;
  uStack_60 = 0xd1f596e43491ca6d;
  local_58 = CONCAT44(local_58._4_4_,0x5186c670);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d730 = lVar6;
  if ((*(uint *)(lVar1 + 0x2b734) & 1) == 0) {
    *(uint *)(lVar1 + 0x2b734) = *(uint *)(lVar1 + 0x2b734) | 1;
    *(undefined *)(lVar1 + 0x21c6c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x21c58 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180612e90);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x21c58;
  if (*(char *)(lVar1 + 0x21c6c) != '\0') {
    FUN_180054820(lVar6,0x14,0xa787f3b751e3a519);
    *(undefined *)(lVar1 + 0x21c6c) = 0;
  }
  local_68 = 0x406cc79c76788d0e;
  uStack_60 = 0x7249c09b757e8d2e;
  local_58 = 0x7655f08649729823;
  uStack_50 = CONCAT44(uStack_50._4_4_,0x5659a23);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d738 = lVar6;
  if ((*(uint *)(lVar1 + 0x14454) & 1) == 0) {
    *(uint *)(lVar1 + 0x14454) = *(uint *)(lVar1 + 0x14454) | 1;
    *(undefined *)(lVar1 + 0x1a084) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1a068 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1c);
    FUN_180505120(&LAB_180612e60);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1a068;
  if (*(char *)(lVar1 + 0x1a084) != '\0') {
    FUN_180054820(lVar6,0x1c,0x132183ef0517ff4d);
    *(undefined *)(lVar1 + 0x1a084) = 0;
  }
  local_68 = 0x2c0b3a8486d798d5;
  uStack_60 = 0x2c3c3daa93c2a9fd;
  local_58 = CONCAT26(local_58._6_2_,0x55ac84ca8fe3);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d740 = lVar6;
  if ((*(uint *)(lVar1 + 0x22950) & 1) == 0) {
    *(uint *)(lVar1 + 0x22950) = *(uint *)(lVar1 + 0x22950) | 1;
    *(undefined *)(lVar1 + 0x2847e) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x28468 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_180612e30);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x28468;
  if (*(char *)(lVar1 + 0x2847e) != '\0') {
    FUN_180054820(lVar6,0x16,0x496f55c9e7a3f991);
    *(undefined *)(lVar1 + 0x2847e) = 0;
  }
  local_68 = 0xb9c6cd06de11482b;
  uStack_60 = 0xaecad023cd007a0a;
  local_58 = CONCAT71(local_58._1_7_,0x6f);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d748 = lVar6;
  if ((*(uint *)(lVar1 + 0x1e7ac) & 1) == 0) {
    *(uint *)(lVar1 + 0x1e7ac) = *(uint *)(lVar1 + 0x1e7ac) | 1;
    *(undefined *)(lVar1 + 0x2bc51) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2bc40 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_180612e00);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2bc40;
  if (*(char *)(lVar1 + 0x2bc51) != '\0') {
    FUN_180054820(lVar6,0x11,0xcba9b955bf65296f);
    *(undefined *)(lVar1 + 0x2bc51) = 0;
  }
  local_res8[0] = 0x51;
  local_res8[1] = 0x4e;
  local_res8[2] = 0xb3;
  local_res8[3] = 0x9d;
  local_res8[4] = 0x9e;
  local_res8[5] = 0x46;
  local_res8[6] = 0xc5;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d750 = lVar6;
  if ((*(uint *)(lVar1 + 0xb17c) & 1) == 0) {
    *(uint *)(lVar1 + 0xb17c) = *(uint *)(lVar1 + 0xb17c) | 1;
    *(undefined *)(lVar1 + 0xa157) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xa150 + uVar5) = local_res8[uVar5];
      uVar5 = uVar5 + 1;
    } while (uVar5 < 7);
    FUN_180505120(&LAB_180612dd0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d758 = lVar1 + 0xa150;
  uVar5 = uVar7;
  if (*(char *)(lVar1 + 0xa157) != '\0') {
    do {
      *(byte *)(uVar5 + _DAT_18087d758) =
           (byte)(0xdc535f7efd12b15 >> (((byte)uVar5 & 7) << 3)) ^ *(byte *)(uVar5 + _DAT_18087d758)
      ;
      uVar5 = uVar5 + 1;
    } while (uVar5 < 7);
    *(undefined *)(lVar1 + 0xa157) = 0;
  }
  local_68 = 0xd9eacc402e23a299;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x9f543c2faea9);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  if ((*(uint *)(lVar1 + 0x1630c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1630c) = *(uint *)(lVar1 + 0x1630c) | 1;
    *(undefined *)(lVar1 + 0xb776) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xb768 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180612da0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xb768;
  if (*(char *)(lVar1 + 0xb776) != '\0') {
    FUN_180054820(lVar6,0xe,0xad8f9f275b41c7dd);
    *(undefined *)(lVar1 + 0xb776) = 0;
  }
  local_68 = 0x57b248f054cdf2ef;
  uStack_60 = 0x5bba48e24dfff2c7;
  local_58 = 0x35a14aff42dbf6fc;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d760 = lVar6;
  if ((*(uint *)(lVar1 + 0x2a57c) & 1) == 0) {
    *(uint *)(lVar1 + 0x2a57c) = *(uint *)(lVar1 + 0x2a57c) | 1;
    *(undefined *)(lVar1 + 0x15160) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x15148 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x18);
    FUN_180505120(&LAB_180612d70);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x15148;
  if (*(char *)(lVar1 + 0x15160) != '\0') {
    FUN_180054820(lVar6,0x18,0x35d32f9721af97ab);
    *(undefined *)(lVar1 + 0x15160) = 0;
  }
  local_68 = 0x570c50f8cc0b1073;
  uStack_60 = 0x4c1d54fad7071a74;
  local_58 = 0x400e56f1d8241b58;
  uStack_50 = CONCAT62(uStack_50._2_6_,0x7545);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d768 = lVar6;
  if ((*(uint *)(lVar1 + 0x26844) & 1) == 0) {
    *(uint *)(lVar1 + 0x26844) = *(uint *)(lVar1 + 0x26844) | 1;
    *(undefined *)(lVar1 + 0xbdc2) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0xbda8) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180612d40);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xbda8;
  if (*(char *)(lVar1 + 0xbdc2) != '\0') {
    FUN_180054820(lVar6,0x1a,0x2569379fb9697537);
    *(undefined *)(lVar1 + 0xbdc2) = 0;
  }
  local_68 = 0x5d9eec560023ce77;
  uStack_60 = 0x2f89ee56142fca7e;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d770 = lVar6;
  if ((*(uint *)(lVar1 + 0x12668) & 1) == 0) {
    *(uint *)(lVar1 + 0x12668) = *(uint *)(lVar1 + 0x12668) | 1;
    *(undefined *)(lVar1 + 0x20948) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x20938 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180612d10);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x20938;
  if (*(char *)(lVar1 + 0x20948) != '\0') {
    FUN_180054820(lVar6,0x10,0x2ffb8b317541ab33);
    *(undefined *)(lVar1 + 0x20948) = 0;
  }
  local_68 = 0x7b8cdc5498edc60f;
  uStack_60 = 0x6a80cd4188dcea1e;
  local_58 = CONCAT62(local_58._2_6_,0xa32e);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d778 = lVar6;
  if ((*(uint *)(lVar1 + 0x1aeb8) & 1) == 0) {
    *(uint *)(lVar1 + 0x1aeb8) = *(uint *)(lVar1 + 0x1aeb8) | 1;
    *(undefined *)(lVar1 + 0x1c5a2) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1c590 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180612ce0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1c590;
  if (*(char *)(lVar1 + 0x1c5a2) != '\0') {
    FUN_180054820(lVar6,0x12,0x9e9bb33ed8fa34b);
    *(undefined *)(lVar1 + 0x1c5a2) = 0;
  }
  local_68 = 0x1f8447c32aa79e91;
  uStack_60 = 0x158078c52ab28894;
  local_58 = 0xd9350e23da49cb4;
  uStack_50 = CONCAT44(uStack_50._4_4_,0x4fa498bc);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d780 = lVar6;
  if ((*(uint *)(lVar1 + 0x2d688) & 1) == 0) {
    *(uint *)(lVar1 + 0x2d688) = *(uint *)(lVar1 + 0x2d688) | 1;
    *(undefined *)(lVar1 + 0x16ce4) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x16cc8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1c);
    FUN_180505120(&LAB_180612cb0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x16cc8;
  if (*(char *)(lVar1 + 0x16ce4) != '\0') {
    FUN_180054820(lVar6,0x1c,0x7be135b14fc1fbd5);
    *(undefined *)(lVar1 + 0x16ce4) = 0;
  }
  local_68 = 0xa700b4383e33da05;
  uStack_60 = 0xc32cb2322137da12;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d788 = lVar6;
  if ((*(uint *)(lVar1 + 0x28678) & 1) == 0) {
    *(uint *)(lVar1 + 0x28678) = *(uint *)(lVar1 + 0x28678) | 1;
    *(undefined *)(lVar1 + 0xe190) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xe180 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180612c80);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xe180;
  if (*(char *)(lVar1 + 0xe190) != '\0') {
    FUN_180054820(lVar6,0x10,0xc349d15b5745bf41);
    *(undefined *)(lVar1 + 0xe190) = 0;
  }
  local_68 = 0x608048cb635cf1ed;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x3bda6654f5db);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d790 = lVar6;
  if ((*(uint *)(lVar1 + 0x1f4b4) & 1) == 0) {
    *(uint *)(lVar1 + 0x1f4b4) = *(uint *)(lVar1 + 0x1f4b4) | 1;
    *(undefined *)(lVar1 + 0x1c8d6) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1c8c8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180612c50);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1c8c8;
  if (*(char *)(lVar1 + 0x1c8d6) != '\0') {
    FUN_180054820(lVar6,0xe,0x5d33bbf053d83a9);
    *(undefined *)(lVar1 + 0x1c8d6) = 0;
  }
  local_68 = 0x7621c244c880e513;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x53c240c697e532);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d798 = lVar6;
  if ((*(uint *)(lVar1 + 0x297b4) & 1) == 0) {
    *(uint *)(lVar1 + 0x297b4) = *(uint *)(lVar1 + 0x297b4) | 1;
    *(undefined *)(lVar1 + 0x28bc7) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x28bb8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_180612c20);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x28bb8;
  if (*(char *)(lVar1 + 0x28bc7) != '\0') {
    FUN_180054820(lVar6,0xf,0x2553a723afe19757);
    *(undefined *)(lVar1 + 0x28bc7) = 0;
  }
  local_68 = 0x3a57db26cd9a051e;
  uStack_60 = 0x5f5eda2ecf810408;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7a0 = lVar6;
  if ((*(uint *)(lVar1 + 0x2d8a0) & 1) == 0) {
    *(uint *)(lVar1 + 0x2d8a0) = *(uint *)(lVar1 + 0x2d8a0) | 1;
    *(undefined *)(lVar1 + 0x1a7f0) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1a7e0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180612bf0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1a7e0;
  if (*(char *)(lVar1 + 0x1a7f0) != '\0') {
    FUN_180054820(lVar6,0x10,0x5f3bb947b9f3615b);
    *(undefined *)(lVar1 + 0x1a7f0) = 0;
  }
  local_68 = 0x49f700512bcc3d4;
  uStack_60 = 0x63947a080badc8c2;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7a8 = lVar6;
  if ((*(uint *)(lVar1 + 98000) & 1) == 0) {
    *(uint *)(lVar1 + 98000) = *(uint *)(lVar1 + 98000) | 1;
    *(undefined *)(lVar1 + 0x1fc80) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1fc70 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180612bc0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1fc70;
  if (*(char *)(lVar1 + 0x1fc80) != '\0') {
    FUN_180054820(lVar6,0x10,0x63f119617ddfad91);
    *(undefined *)(lVar1 + 0x1fc80) = 0;
  }
  local_68 = 0xfe2f2a3113c65f74;
  uStack_60 = 0xf03711202ed75a54;
  local_58 = CONCAT53(local_58._3_5_,0xa34c52);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7b0 = lVar6;
  if ((*(uint *)(lVar1 + 0x10314) & 1) == 0) {
    *(uint *)(lVar1 + 0x10314) = *(uint *)(lVar1 + 0x10314) | 1;
    *(undefined *)(lVar1 + 0x2a3a3) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2a390 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180612b90);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2a390;
  if (*(char *)(lVar1 + 0x2a3a3) != '\0') {
    FUN_180054820(lVar6,0x13,0x994163457da32931);
    *(undefined *)(lVar1 + 0x2a3a3) = 0;
  }
  local_68 = 0xa5fee37f34aa17e8;
  uStack_60 = 0x96f8e6792bae3c9f;
  local_58 = CONCAT71(local_58._1_7_,0xad);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7b8 = lVar6;
  if ((*(uint *)(lVar1 + 0x29c20) & 1) == 0) {
    *(uint *)(lVar1 + 0x29c20) = *(uint *)(lVar1 + 0x29c20) | 1;
    *(undefined *)(lVar1 + 0x14f09) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x14ef8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_180612b60);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x14ef8;
  if (*(char *)(lVar1 + 0x14f09) != '\0') {
    FUN_180054820(lVar6,0x11,0xf39b8f0f59cb6fad);
    *(undefined *)(lVar1 + 0x14f09) = 0;
  }
  local_68 = 0xd15a3403dcad8db8;
  uStack_60 = 0xda6c3505cc9c909e;
  local_58 = CONCAT26(local_58._6_2_,0x5d14dab4838f);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7c0 = lVar6;
  if ((*(uint *)(lVar1 + 0x2b184) & 1) == 0) {
    *(uint *)(lVar1 + 0x2b184) = *(uint *)(lVar1 + 0x2b184) | 1;
    *(undefined *)(lVar1 + 0x1f7e6) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x1f7d0) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_180612b30);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1f7d0;
  if (*(char *)(lVar1 + 0x1f7e6) != '\0') {
    FUN_180054820(lVar6,0x16,0xbf3f5d71b9ddf5fd);
    *(undefined *)(lVar1 + 0x1f7e6) = 0;
  }
  local_68 = 0x69008eb5e4f34bb2;
  uStack_60 = 0x6e038eb3eecd5694;
  local_58 = 0x623689a8e8f75294;
  uStack_50 = CONCAT26(uStack_50._6_2_,0xe7a2e2ea4585);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7c8 = lVar6;
  if ((*(uint *)(lVar1 + 0x1ac28) & 1) == 0) {
    *(uint *)(lVar1 + 0x1ac28) = *(uint *)(lVar1 + 0x1ac28) | 1;
    *(undefined *)(lVar1 + 0x2b576) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2b558 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1e);
    FUN_180505120(&LAB_180612b00);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2b558;
  if (*(char *)(lVar1 + 0x2b576) != '\0') {
    FUN_180054820(lVar6,0x1e,0x765e7c7818333f7);
    *(undefined *)(lVar1 + 0x2b576) = 0;
  }
  local_68 = 0x1748c679fab5d79e;
  uStack_60 = 0x1a44d979fa96cab8;
  local_58 = CONCAT62(local_58._2_6_,0xafbe);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7d0 = lVar6;
  if ((*(uint *)(lVar1 + 0xea30) & 1) == 0) {
    *(uint *)(lVar1 + 0xea30) = *(uint *)(lVar1 + 0xea30) | 1;
    *(undefined *)(lVar1 + 0xa40a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xa3f8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180612ad0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xa3f8;
  if (*(char *)(lVar1 + 0xa40a) != '\0') {
    FUN_180054820(lVar6,0x12,0x792daf0b9fc5afdb);
    *(undefined *)(lVar1 + 0xa40a) = 0;
  }
  local_68 = 0x6ba69c7d6c71eddc;
  uStack_60 = 0x46a6816e7d52f0fa;
  local_58 = 0x6090907d7c75e5f8;
  uStack_50 = CONCAT26(uStack_50._6_2_,0xf56a6a68e3eb);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7d8 = lVar6;
  if ((*(uint *)(lVar1 + 0xb800) & 1) == 0) {
    *(uint *)(lVar1 + 0xb800) = *(uint *)(lVar1 + 0xb800) | 1;
    *(undefined *)(lVar1 + 0x907e) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x9060 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1e);
    FUN_180505120(&LAB_180612aa0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x9060;
  if (*(char *)(lVar1 + 0x907e) != '\0') {
    FUN_180054820(lVar6,0x1e,0x5c3f50f09019599);
    *(undefined *)(lVar1 + 0x907e) = 0;
  }
  local_68 = 0x2d9eec79840db5d0;
  uStack_60 = 0x119ef16a952ea8f6;
  local_58 = 0x2495ec6f9312aef0;
  uStack_50 = 0x439ee662970fa8c6;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7e0 = lVar6;
  if ((*(uint *)(lVar1 + 0x1df90) & 1) == 0) {
    *(uint *)(lVar1 + 0x1df90) = *(uint *)(lVar1 + 0x1df90) | 1;
    *(undefined *)(lVar1 + 0x14ee8) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x14ec8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x20);
    FUN_180505120(&LAB_180612a60);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x14ec8;
  if (*(char *)(lVar1 + 0x14ee8) != '\0') {
    FUN_180054820(lVar6,0x20,0x43fb850be17dcd95);
    *(undefined *)(lVar1 + 0x14ee8) = 0;
  }
  local_68 = 0x919683887db91f96;
  uStack_60 = 0xb596928e67bb0280;
  local_58 = 0x979a9d8e73a014ba;
  uStack_50 = 0x8690989163ac34aa;
  local_48 = 0xd3;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7e8 = lVar6;
  if ((*(uint *)(lVar1 + 0x12c90) & 1) == 0) {
    *(uint *)(lVar1 + 0x12c90) = *(uint *)(lVar1 + 0x12c90) | 1;
    *(undefined *)(lVar1 + 0x2af21) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2af00 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x21);
    FUN_180505120(&LAB_180612a30);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2af00;
  if (*(char *)(lVar1 + 0x2af21) != '\0') {
    FUN_180054820(lVar6,0x21,0xe3f3f1e711c967d3);
    *(undefined *)(lVar1 + 0x2af21) = 0;
  }
  local_68 = 0x38a471e0c0501099;
  uStack_60 = 0x23bf7af2d75c05be;
  local_58 = CONCAT44(local_58._4_4_,0xa55612b6);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7f0 = lVar6;
  if ((*(uint *)(lVar1 + 0x18394) & 1) == 0) {
    *(uint *)(lVar1 + 0x18394) = *(uint *)(lVar1 + 0x18394) | 1;
    *(undefined *)(lVar1 + 0x2776c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x27758) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180612a00);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x27758;
  if (*(char *)(lVar1 + 0x2776c) != '\0') {
    FUN_180054820(lVar6,0x14,0x55cd1fa1a53371df);
    *(undefined *)(lVar1 + 0x2776c) = 0;
  }
  local_68 = 0x6214add036301ab1;
  uStack_60 = 0x7134acd82b203e92;
  local_58 = 0x6c23b3d40c3d149e;
  uStack_50 = CONCAT53(uStack_50._3_5_,0x531e94);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d7f8 = lVar6;
  if ((*(uint *)(lVar1 + 0x21d00) & 1) == 0) {
    *(uint *)(lVar1 + 0x21d00) = *(uint *)(lVar1 + 0x21d00) | 1;
    *(undefined *)(lVar1 + 0x22c2b) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x22c10) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1b);
    FUN_180505120(&LAB_1806129d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x22c10;
  if (*(char *)(lVar1 + 0x22c2b) != '\0') {
    FUN_180054820(lVar6,0x1b,0x555c1b15f537bf7);
    *(undefined *)(lVar1 + 0x22c2b) = 0;
  }
  local_68 = 0x5be6efc2dab26ef3;
  uStack_60 = 0x67c9eccac7b062dc;
  local_58 = 0x52c9eac7c1be6cd0;
  uStack_50 = 0x35c2e0cac5a36ae6;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d800 = lVar6;
  if ((*(uint *)(lVar1 + 0x19bb0) & 1) == 0) {
    *(uint *)(lVar1 + 0x19bb0) = *(uint *)(lVar1 + 0x19bb0) | 1;
    *(undefined *)(lVar1 + 0x20168) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x20148 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x20);
    FUN_180505120(&LAB_180612990);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x20148;
  if (*(char *)(lVar1 + 0x20168) != '\0') {
    FUN_180054820(lVar6,0x20,0x35a783a3b3d10fb5);
    *(undefined *)(lVar1 + 0x20168) = 0;
  }
  local_68 = 0xe36ac562bc2a80b3;
  uStack_60 = 0xde45c66aa1288c9c;
  local_58 = 0xea45c06eb42c9381;
  uStack_50 = 0xdb4eca6aa33b84a6;
  local_48 = 199;
  local_47 = 0xe1;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d808 = lVar6;
  if ((*(uint *)(lVar1 + 0xcab0) & 1) == 0) {
    *(uint *)(lVar1 + 0xcab0) = *(uint *)(lVar1 + 0xcab0) | 1;
    *(undefined *)(lVar1 + 0xe0a2) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xe080 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x22);
    FUN_180505120(&LAB_180612960);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xe080;
  if (*(char *)(lVar1 + 0xe0a2) != '\0') {
    FUN_180054820(lVar6,0x22,0x8d2ba903d549e1f5);
    *(undefined *)(lVar1 + 0xe0a2) = 0;
  }
  local_68 = 0xb7b607462f703025;
  uStack_60 = 0x8ca7165a29652606;
  local_58 = 0x80b4145d3a5c3b0c;
  uStack_50 = CONCAT62(uStack_50._2_6_,0x5511);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d810 = lVar6;
  if ((*(uint *)(lVar1 + 0x1ff18) & 1) == 0) {
    *(uint *)(lVar1 + 0x1ff18) = *(uint *)(lVar1 + 0x1ff18) | 1;
    *(undefined *)(lVar1 + 0x1ae62) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1ae48 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180612930);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1ae48;
  if (*(char *)(lVar1 + 0x1ae62) != '\0') {
    FUN_180054820(lVar6,0x1a,0xe5d375335b115563);
    *(undefined *)(lVar1 + 0x1ae62) = 0;
  }
  local_68 = 0x24c92ece1eebda45;
  uStack_60 = 0x2cd13de628f5d664;
  local_58 = CONCAT53(local_58._3_5_,0x87d660);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d818 = lVar6;
  if ((*(uint *)(lVar1 + 0x186d4) & 1) == 0) {
    *(uint *)(lVar1 + 0x186d4) = *(uint *)(lVar1 + 0x186d4) | 1;
    *(undefined *)(lVar1 + 0x26ffb) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x26fe8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180612900);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x26fe8;
  if (*(char *)(lVar1 + 0x26ffb) != '\0') {
    FUN_180054820(lVar6,0x13,0x45a74f837b87b303);
    *(undefined *)(lVar1 + 0x26ffb) = 0;
  }
  local_68 = 0xf3f0ab24e8f091cd;
  uStack_60 = 0xf8f2b601fdf4aeef;
  local_58 = CONCAT71(local_58._1_7_,0x8b);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d820 = lVar6;
  if ((*(uint *)(lVar1 + 0x24888) & 1) == 0) {
    *(uint *)(lVar1 + 0x24888) = *(uint *)(lVar1 + 0x24888) | 1;
    *(undefined *)(lVar1 + 0x28d21) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x28d10 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_1806128d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x28d10;
  if (*(char *)(lVar1 + 0x28d21) != '\0') {
    FUN_180054820(lVar6,0x11,0x9d91df778f91fd8b);
    *(undefined *)(lVar1 + 0x28d21) = 0;
  }
  local_68 = 0xfdaca686ac2ac17f;
  uStack_60 = 0xf0a8a695a936fe4d;
  local_58 = CONCAT71(local_58._1_7_,0x39);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d828 = lVar6;
  if ((*(uint *)(lVar1 + 0xe2f4) & 1) == 0) {
    *(uint *)(lVar1 + 0xe2f4) = *(uint *)(lVar1 + 0xe2f4) | 1;
    *(undefined *)(lVar1 + 0x16621) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x16610) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_1806128a0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x16610;
  if (*(char *)(lVar1 + 0x16621) != '\0') {
    FUN_180054820(lVar6,0x11,0x95cbcfe3db53ad39);
    *(undefined *)(lVar1 + 0x16621) = 0;
  }
  local_68 = 0x40f20dcdbab4eb21;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x69c6bcb4ef15);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d830 = lVar6;
  if ((*(uint *)(lVar1 + 0x264a0) & 1) == 0) {
    *(uint *)(lVar1 + 0x264a0) = *(uint *)(lVar1 + 0x264a0) | 1;
    *(undefined *)(lVar1 + 0xda5e) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0xda50) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180612870);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xda50;
  if (*(char *)(lVar1 + 0xda5e) != '\0') {
    FUN_180054820(lVar6,0xe,0x25a169a3dfdd9967);
    *(undefined *)(lVar1 + 0xda5e) = 0;
  }
  local_68 = 0xf234542584d660fa;
  uStack_60 = 0x8122561c97c964ee;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d838 = lVar6;
  if ((*(uint *)(lVar1 + 0x1a5e8) & 1) == 0) {
    *(uint *)(lVar1 + 0x1a5e8) = *(uint *)(lVar1 + 0x1a5e8) | 1;
    *(undefined *)(lVar1 + 0x1f620) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1f610 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180612840);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1f610;
  if (*(char *)(lVar1 + 0x1f620) != '\0') {
    FUN_180054820(lVar6,0x10,0x81473575e1bb01bd);
    *(undefined *)(lVar1 + 0x1f620) = 0;
  }
  local_68 = 0x490d607e9eb8220c;
  uStack_60 = CONCAT35(uStack_60._5_3_,0x2d88b22d22);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d840 = lVar6;
  if ((*(uint *)(lVar1 + 0x11d54) & 1) == 0) {
    *(uint *)(lVar1 + 0x11d54) = *(uint *)(lVar1 + 0x11d54) | 1;
    *(undefined *)(lVar1 + 0xad2d) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xad20 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xd);
    FUN_180505120(&LAB_180612810);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xad20;
  if (*(char *)(lVar1 + 0xad2d) != '\0') {
    FUN_180054820(lVar6,0xd,0x3d79052dfbd5434b);
    *(undefined *)(lVar1 + 0xad2d) = 0;
  }
  local_68 = 0xbc496cf1bc945c5a;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x2d68e2b08f4f78);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d848 = lVar6;
  if ((*(uint *)(lVar1 + 0x21254) & 1) == 0) {
    *(uint *)(lVar1 + 0x21254) = *(uint *)(lVar1 + 0x21254) | 1;
    *(undefined *)(lVar1 + 0x19c27) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x19c18 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_1806127e0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x19c18;
  if (*(char *)(lVar1 + 0x19c27) != '\0') {
    FUN_180054820(lVar6,0xf,0xef2d0d81d9f93d1d);
    *(undefined *)(lVar1 + 0x19c27) = 0;
  }
  local_68 = 0xbc4b4e6974358ca8;
  uStack_60 = 0xb656596974088780;
  local_58 = CONCAT62(local_58._2_6_,0xe98a);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d850 = lVar6;
  if ((*(uint *)(lVar1 + 0x1fccc) & 1) == 0) {
    *(uint *)(lVar1 + 0x1fccc) = *(uint *)(lVar1 + 0x1fccc) | 1;
    *(undefined *)(lVar1 + 0x115b2) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x115a0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_1806127b0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x115a0;
  if (*(char *)(lVar1 + 0x115b2) != '\0') {
    FUN_180054820(lVar6,0x12,0xd53f2f1b115be9ef);
    *(undefined *)(lVar1 + 0x115b2) = 0;
  }
  local_68 = 0xbecc4ea562798276;
  uStack_60 = 0x98c849b26b7b8659;
  local_58 = 0xfdca44be71658262;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d858 = lVar6;
  if ((*(uint *)(lVar1 + 0x87e8) & 1) == 0) {
    *(uint *)(lVar1 + 0x87e8) = *(uint *)(lVar1 + 0x87e8) | 1;
    *(undefined *)(lVar1 + 0x114c8) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x114b0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x18);
    FUN_180505120(&LAB_180612780);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x114b0;
  if (*(char *)(lVar1 + 0x114c8) != '\0') {
    FUN_180054820(lVar6,0x18,0xfdaf27d70717e731);
    *(undefined *)(lVar1 + 0x114c8) = 0;
  }
  local_68 = 0xca4f11b86ca6a2e0;
  uStack_60 = CONCAT71(uStack_60._1_7_,0xa7);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d860 = lVar6;
  if ((*(uint *)(lVar1 + 0x2704c) & 1) == 0) {
    *(uint *)(lVar1 + 0x2704c) = *(uint *)(lVar1 + 0x2704c) | 1;
    *(undefined *)(lVar1 + 0x2b229) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2b220 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 9);
    FUN_180505120(&LAB_180612750);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2b220;
  if (*(char *)(lVar1 + 0x2b229) != '\0') {
    FUN_180054820(lVar6,9,0xb33d65dd01c9c7a7);
    *(undefined *)(lVar1 + 0x2b229) = 0;
  }
  local_68 = 0x7a49d7a82c3282b0;
  uStack_60 = 0x35ec0a4372f82a4;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d868 = lVar6;
  if ((*(uint *)(lVar1 + 0x29f70) & 1) == 0) {
    *(uint *)(lVar1 + 0x29f70) = *(uint *)(lVar1 + 0x29f70) | 1;
    *(undefined *)(lVar1 + 0x26928) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x26918 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180612720);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x26918;
  if (*(char *)(lVar1 + 0x26928) != '\0') {
    FUN_180054820(lVar6,0x10,0x33ba3cd415de7f7);
    *(undefined *)(lVar1 + 0x26928) = 0;
  }
  local_68 = 0x5b3ff88eb081da76;
  uStack_60 = CONCAT44(uStack_60._4_4_,0xd78ad658);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d870 = lVar6;
  if ((*(uint *)(lVar1 + 0x105f4) & 1) == 0) {
    *(uint *)(lVar1 + 0x105f4) = *(uint *)(lVar1 + 0x105f4) | 1;
    *(undefined *)(lVar1 + 0x21144) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x21138 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xc);
    FUN_180505120(&LAB_1806126f0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x21138;
  if (*(char *)(lVar1 + 0x21144) != '\0') {
    FUN_180054820(lVar6,0xc,0x2d4d9dddd7efb531);
    *(undefined *)(lVar1 + 0x21144) = 0;
  }
  local_68 = 0x8d3ab04b96186184;
  uStack_60 = CONCAT35(uStack_60._5_3_,0x3b86147ab5);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d878 = lVar6;
  if ((*(uint *)(lVar1 + 0x2bcdc) & 1) == 0) {
    *(uint *)(lVar1 + 0x2bcdc) = *(uint *)(lVar1 + 0x2bcdc) | 1;
    *(undefined *)(lVar1 + 0x105dd) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x105d0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xd);
    FUN_180505120(&LAB_1806126c0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x105d0;
  if (*(char *)(lVar1 + 0x105dd) != '\0') {
    FUN_180054820(lVar6,0xd,0xff5fe33be37713c3);
    *(undefined *)(lVar1 + 0x105dd) = 0;
  }
  local_68 = 0x1cadcfb65ce0fc9a;
  uStack_60 = CONCAT53(uStack_60._3_5_,0x89ecbe);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d880 = lVar6;
  if ((*(uint *)(lVar1 + 0xd4b0) & 1) == 0) {
    *(uint *)(lVar1 + 0xd4b0) = *(uint *)(lVar1 + 0xd4b0) | 1;
    *(undefined *)(lVar1 + 0x2743b) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x27430 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xb);
    FUN_180505120(&LAB_180612690);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x27430;
  if (*(char *)(lVar1 + 0x2743b) != '\0') {
    FUN_180054820(lVar6,0xb,0x75dbbdd30f8989dd);
    *(undefined *)(lVar1 + 0x2743b) = 0;
  }
  local_68 = 0xbc56e8b3174876f2;
  uStack_60 = 0xa343e8b20a5377c6;
  local_58 = CONCAT44(local_58._4_4_,0x734460dc);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d888 = lVar6;
  if ((*(uint *)(lVar1 + 0x27248) & 1) == 0) {
    *(uint *)(lVar1 + 0x27248) = *(uint *)(lVar1 + 0x27248) | 1;
    *(undefined *)(lVar1 + 0x2c2bc) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2c2a8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180612660);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2c2a8;
  if (*(char *)(lVar1 + 0x2c2bc) != '\0') {
    FUN_180054820(lVar6,0x14,0xd5318de1732103b5);
    *(undefined *)(lVar1 + 0x2c2bc) = 0;
  }
  local_68 = 0xc00c1982ff89d693;
  uStack_60 = 0xf13d198ddeafebb4;
  local_58 = CONCAT17(local_58._7_1_,0x6d1f86dfb2f3b4);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d890 = lVar6;
  if ((*(uint *)(lVar1 + 0x23008) & 1) == 0) {
    *(uint *)(lVar1 + 0x23008) = *(uint *)(lVar1 + 0x23008) | 1;
    *(undefined *)(lVar1 + 0x1ef6f) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1ef58 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x17);
    FUN_180505120(&LAB_180612630);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1ef58;
  if (*(char *)(lVar1 + 0x1ef6f) != '\0') {
    FUN_180054820(lVar6,0x17,0x836d6de3bbdb85db);
    *(undefined *)(lVar1 + 0x1ef6f) = 0;
  }
  local_68 = 0x6e12ae9a7d596223;
  uStack_60 = CONCAT26(uStack_60._6_2_,0xcd966a407519);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d898 = lVar6;
  if ((*(uint *)(lVar1 + 0x296f0) & 1) == 0) {
    *(uint *)(lVar1 + 0x296f0) = *(uint *)(lVar1 + 0x296f0) | 1;
    *(undefined *)(lVar1 + 0x150c6) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x150b8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180612600);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x150b8;
  if (*(char *)(lVar1 + 0x150c6) != '\0') {
    FUN_180054820(lVar6,0xe,0xb41cdf30929036b);
    *(undefined *)(lVar1 + 0x150c6) = 0;
  }
  local_68 = 0x2628355e3ea3c2f1;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x513e523aa7d1dc);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8a0 = lVar6;
  if ((*(uint *)(lVar1 + 0x1ba2c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1ba2c) = *(uint *)(lVar1 + 0x1ba2c) | 1;
    *(undefined *)(lVar1 + 0x19a7f) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x19a70 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_1806125d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x19a70;
  if (*(char *)(lVar1 + 0x19a7f) != '\0') {
    FUN_180054820(lVar6,0xf,0x75515b3153d1a3b9);
    *(undefined *)(lVar1 + 0x19a7f) = 0;
  }
  local_68 = 0xff92dd6983809cad;
  uStack_60 = 0xef8fca6a8184958c;
  local_58 = CONCAT44(local_58._4_4_,0xf3849a8c);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8a8 = lVar6;
  if ((*(uint *)(lVar1 + 0x2dc5c) & 1) == 0) {
    *(uint *)(lVar1 + 0x2dc5c) = *(uint *)(lVar1 + 0x2dc5c) | 1;
    *(undefined *)(lVar1 + 0x1754c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x17538 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_1806125a0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x17538;
  if (*(char *)(lVar1 + 0x1754c) != '\0') {
    FUN_180054820(lVar6,0x14,0x99fdaf39f3e1f9e5);
    *(undefined *)(lVar1 + 0x1754c) = 0;
  }
  local_68 = 0xa4670480a75222b9;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x17008eba453594);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8b0 = lVar6;
  if ((*(uint *)(lVar1 + 0x22b38) & 1) == 0) {
    *(uint *)(lVar1 + 0x22b38) = *(uint *)(lVar1 + 0x22b38) | 1;
    *(undefined *)(lVar1 + 0x21adf) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x21ad0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_180612570);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x21ad0;
  if (*(char *)(lVar1 + 0x21adf) != '\0') {
    FUN_180054820(lVar6,0xf,0xf71765edd33347f1);
    *(undefined *)(lVar1 + 0x21adf) = 0;
  }
  local_68 = 0x7842a99f7690c0c5;
  uStack_60 = 0x7c5baf986194ecfd;
  local_58 = 0x7c4cb481639cf6ff;
  uStack_50 = CONCAT71(uStack_50._1_7_,0x8d);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8b8 = lVar6;
  if ((*(uint *)(lVar1 + 0x10e08) & 1) == 0) {
    *(uint *)(lVar1 + 0x10e08) = *(uint *)(lVar1 + 0x10e08) | 1;
    *(undefined *)(lVar1 + 0x13939) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x13920 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x19);
    FUN_180505120(&LAB_180612540);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x13920;
  if (*(char *)(lVar1 + 0x13939) != '\0') {
    FUN_180054820(lVar6,0x19,0x192fddf711f9a58d);
    *(undefined *)(lVar1 + 0x13939) = 0;
  }
  local_res8[0] = 0xf;
  local_res8[1] = 0xd6;
  local_res8[2] = 0x49;
  local_res8[3] = 0xf9;
  local_res8[4] = 0xb2;
  local_res8[5] = 0x11;
  local_res8[6] = 0xb7;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8c0 = lVar6;
  if ((*(uint *)(lVar1 + 0x1fad4) & 1) == 0) {
    *(uint *)(lVar1 + 0x1fad4) = *(uint *)(lVar1 + 0x1fad4) | 1;
    *(undefined *)(lVar1 + 0x10c67) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x10c60 + uVar5) = local_res8[uVar5];
      uVar5 = uVar5 + 1;
    } while (uVar5 < 7);
    FUN_180505120(&LAB_180612510);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8c8 = lVar1 + 0x10c60;
  uVar5 = uVar7;
  if (*(char *)(lVar1 + 0x10c67) != '\0') {
    do {
      *(byte *)(uVar5 + _DAT_18087d8c8) =
           (byte)(0x9db763d78939b947 >> (((byte)uVar5 & 7) << 3)) ^
           *(byte *)(uVar5 + _DAT_18087d8c8);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 7);
    *(undefined *)(lVar1 + 0x10c67) = 0;
  }
  local_68 = 0x467fc3e787c55b49;
  uStack_60 = 0x646ed7c792e24671;
  local_58 = CONCAT62(local_58._2_6_,0x2f64);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  if ((*(uint *)(lVar1 + 0x1917c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1917c) = *(uint *)(lVar1 + 0x1917c) | 1;
    *(undefined *)(lVar1 + 0x947a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x9468 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_1806124e0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x9468;
  if (*(char *)(lVar1 + 0x947a) != '\0') {
    FUN_180054820(lVar6,0x12,0x707a1b5f7b12f01);
    *(undefined *)(lVar1 + 0x947a) = 0;
  }
  local_68 = 0xcbcf527ab57b13f9;
  uStack_60 = CONCAT44(uStack_60._4_4_,0xc56a04d8);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8d0 = lVar6;
  if ((*(uint *)(lVar1 + 0xcb38) & 1) == 0) {
    *(uint *)(lVar1 + 0xcb38) = *(uint *)(lVar1 + 0xcb38) | 1;
    *(undefined *)(lVar1 + 0x132bc) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x132b0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xc);
    FUN_180505120(&LAB_1806124b0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x132b0;
  if (*(char *)(lVar1 + 0x132bc) != '\0') {
    FUN_180054820(lVar6,0xc,0xbdbd3729c50f67b1);
    *(undefined *)(lVar1 + 0x132bc) = 0;
  }
  local_68 = 0x58e08ce0d8007350;
  uStack_60 = 0x62ebadeed6014a6d;
  local_58 = CONCAT44(local_58._4_4_,0xbf00587d);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8d8 = lVar6;
  if ((*(uint *)(lVar1 + 0x20184) & 1) == 0) {
    *(uint *)(lVar1 + 0x20184) = *(uint *)(lVar1 + 0x20184) | 1;
    *(undefined *)(lVar1 + 0x2009c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x20088 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180612480);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x20088;
  if (*(char *)(lVar1 + 0x2009c) != '\0') {
    FUN_180054820(lVar6,0x14,0xb99ef81bf653f19);
    *(undefined *)(lVar1 + 0x2009c) = 0;
  }
  local_68 = 0xb47375a2b6b5a7e0;
  uStack_60 = CONCAT53(uStack_60._3_5_,0xe59aca);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8e0 = lVar6;
  if ((*(uint *)(lVar1 + 0x10d2c) & 1) == 0) {
    *(uint *)(lVar1 + 0x10d2c) = *(uint *)(lVar1 + 0x10d2c) | 1;
    *(undefined *)(lVar1 + 0x21a7b) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x21a70 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xb);
    FUN_180505120(&LAB_180612450);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x21a70;
  if (*(char *)(lVar1 + 0x21a7b) != '\0') {
    FUN_180054820(lVar6,0xb,0xdd0507c7e5e5ffa9);
    *(undefined *)(lVar1 + 0x21a7b) = 0;
  }
  local_68 = 0x45b4943a166ce408;
  uStack_60 = 0x42a3b73e3263ec24;
  local_58 = 0x54beb12d145eec33;
  uStack_50 = CONCAT62(uStack_50._2_6_,0x8924);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8e8 = lVar6;
  if ((*(uint *)(lVar1 + 0x16750) & 1) == 0) {
    *(uint *)(lVar1 + 0x16750) = *(uint *)(lVar1 + 0x16750) | 1;
    *(undefined *)(lVar1 + 0x20e3a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x20e20) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180612420);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x20e20;
  if (*(char *)(lVar1 + 0x20e3a) != '\0') {
    FUN_180054820(lVar6,0x1a,0x37d7c75f710d8941);
    *(undefined *)(lVar1 + 0x20e3a) = 0;
  }
  local_68 = 0x7b44ac489d600d9e;
  uStack_60 = 0x7d42b54cbf6f02a3;
  local_58 = 0x1553a449836a1695;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8f0 = lVar6;
  if ((*(uint *)(lVar1 + 0x15b44) & 1) == 0) {
    *(uint *)(lVar1 + 0x15b44) = *(uint *)(lVar1 + 0x15b44) | 1;
    *(undefined *)(lVar1 + 0xc4e0) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xc4c8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x18);
    FUN_180505120(&LAB_1806123f0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xc4c8;
  if (*(char *)(lVar1 + 0xc4e0) != '\0') {
    FUN_180054820(lVar6,0x18,0x1521c12def0363d7);
    *(undefined *)(lVar1 + 0xc4e0) = 0;
  }
  local_68 = 0x4ad27d73441ea574;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x9644204bd4f);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d8f8 = lVar6;
  if ((*(uint *)(lVar1 + 0x284a4) & 1) == 0) {
    *(uint *)(lVar1 + 0x284a4) = *(uint *)(lVar1 + 0x284a4) | 1;
    *(undefined *)(lVar1 + 0x18726) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x18718 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_1806123c0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x18718;
  if (*(char *)(lVar1 + 0x18726) != '\0') {
    FUN_180054820(lVar6,0xe,0x2f810901216dcb3d);
    *(undefined *)(lVar1 + 0x18726) = 0;
  }
  local_68 = 0xa0d45f26a78c11bc;
  uStack_60 = 0xaade4229b68b07b0;
  local_58 = 0xa6de4735b6ac0c9b;
  uStack_50 = CONCAT62(uStack_50._2_6_,0x7f90);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d900 = lVar6;
  if ((*(uint *)(lVar1 + 0x1d5e4) & 1) == 0) {
    *(uint *)(lVar1 + 0x1d5e4) = *(uint *)(lVar1 + 0x1d5e4) | 1;
    *(undefined *)(lVar1 + 0x29842) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x29828 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180612390);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x29828;
  if (*(char *)(lVar1 + 0x29842) != '\0') {
    FUN_180054820(lVar6,0x1a,0xc5b73147d3ff7ff5);
    *(undefined *)(lVar1 + 0x29842) = 0;
  }
  local_68 = 0x3626493c2d7ae564;
  uStack_60 = 0x302b5e0e3c65e26b;
  local_58 = 0x532044342f7bee7e;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d908 = lVar6;
  if ((*(uint *)(lVar1 + 0xba30) & 1) == 0) {
    *(uint *)(lVar1 + 0xba30) = *(uint *)(lVar1 + 0xba30) | 1;
    *(undefined *)(lVar1 + 0x18408) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x183f0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x18);
    FUN_180505120(&LAB_180612360);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x183f0;
  if (*(char *)(lVar1 + 0x18408) != '\0') {
    FUN_180054820(lVar6,0x18,0x5345275d59098b2d);
    *(undefined *)(lVar1 + 0x18408) = 0;
  }
  local_68 = 0x43084101c26d755c;
  uStack_60 = 0x41004812d46a7e58;
  local_58 = 0x4a0a4605d57c4872;
  uStack_50 = CONCAT71(uStack_50._1_7_,0x15);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d910 = lVar6;
  if ((*(uint *)(lVar1 + 0x2e164) & 1) == 0) {
    *(uint *)(lVar1 + 0x2e164) = *(uint *)(lVar1 + 0x2e164) | 1;
    *(undefined *)(lVar1 + 0x27209) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x271f0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x19);
    FUN_180505120(&LAB_180612330);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x271f0;
  if (*(char *)(lVar1 + 0x27209) != '\0') {
    FUN_180054820(lVar6,0x19,0x2f692f73a7191b15);
    *(undefined *)(lVar1 + 0x27209) = 0;
  }
  local_68 = 0x2dd069f90c7b499c;
  uStack_60 = 0x2fd860ea1a7c4298;
  local_58 = 0x24d26efd1b6a74b2;
  uStack_50 = 0x33d46eed007d4283;
  local_48 = 0xd5;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d918 = lVar6;
  if ((*(uint *)(lVar1 + 0x1259c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1259c) = *(uint *)(lVar1 + 0x1259c) | 1;
    *(undefined *)(lVar1 + 0x2c3f9) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2c3d8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x21);
    FUN_180505120(&LAB_180612300);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2c3d8;
  if (*(char *)(lVar1 + 0x2c3f9) != '\0') {
    FUN_180054820(lVar6,0x21,0x41b1078b690f27d5);
    *(undefined *)(lVar1 + 0x2c3f9) = 0;
  }
  local_68 = 0xae0e92377760e049;
  uStack_60 = CONCAT26(uStack_60._6_2_,0xe1267a60f971);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d920 = lVar6;
  if ((*(uint *)(lVar1 + 0x2b068) & 1) == 0) {
    *(uint *)(lVar1 + 0x2b068) = *(uint *)(lVar1 + 0x2b068) | 1;
    *(undefined *)(lVar1 + 0x1cd06) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1ccf8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_1806122d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1ccf8;
  if (*(char *)(lVar1 + 0x1cd06) != '\0') {
    FUN_180054820(lVar6,0xe,0xcb5de14319098f03);
    *(undefined *)(lVar1 + 0x1cd06) = 0;
  }
  local_68 = 0x6bf5aaba3bbabc76;
  uStack_60 = 0xfe2a8bc2fb1bc6e;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d928 = lVar6;
  if ((*(uint *)(lVar1 + 0xe2e8) & 1) == 0) {
    *(uint *)(lVar1 + 0xe2e8) = *(uint *)(lVar1 + 0xe2e8) | 1;
    *(undefined *)(lVar1 + 0x23218) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x23208 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_1806122a0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x23208;
  if (*(char *)(lVar1 + 0x23218) != '\0') {
    FUN_180054820(lVar6,0x10,0xf87cbd559c3d93d);
    *(undefined *)(lVar1 + 0x23218) = 0;
  }
  local_68 = 0x1adef499c55e9816;
  uStack_60 = 0x1ad0fb8ed656980e;
  local_58 = 0xdd6f182d5488f0d;
  uStack_50 = CONCAT71(uStack_50._1_7_,0x5d);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d930 = lVar6;
  if ((*(uint *)(lVar1 + 0xc4e4) & 1) == 0) {
    *(uint *)(lVar1 + 0xc4e4) = *(uint *)(lVar1 + 0xc4e4) | 1;
    *(undefined *)(lVar1 + 0x18269) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x18250 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x19);
    FUN_180505120(&LAB_180612270);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x18250;
  if (*(char *)(lVar1 + 0x18269) != '\0') {
    FUN_180054820(lVar6,0x19,0x7fb395eba327fd5d);
    *(undefined *)(lVar1 + 0x18269) = 0;
  }
  local_68 = 0x8c80ffe6a5bd40df;
  uStack_60 = 0xb693e1eab08e7dea;
  local_58 = CONCAT53(local_58._3_5_,0xed76f0);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d938 = lVar6;
  if ((*(uint *)(lVar1 + 0xdba4) & 1) == 0) {
    *(uint *)(lVar1 + 0xdba4) = *(uint *)(lVar1 + 0xdba4) | 1;
    *(undefined *)(lVar1 + 0x10b33) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x10b20 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180612240);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x10b20;
  if (*(char *)(lVar1 + 0x10b33) != '\0') {
    FUN_180054820(lVar6,0x13,0xdfe5938fe3ed1393);
    *(undefined *)(lVar1 + 0x10b33) = 0;
  }
  local_68 = 0xa0096ca8617901d;
  uStack_60 = 0x6f0294d6970b9402;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d940 = lVar6;
  if ((*(uint *)(lVar1 + 0xcfd0) & 1) == 0) {
    *(uint *)(lVar1 + 0xcfd0) = *(uint *)(lVar1 + 0xcfd0) | 1;
    *(undefined *)(lVar1 + 0x9218) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x9208 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180612210);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x9208;
  if (*(char *)(lVar1 + 0x9218) != '\0') {
    FUN_180054820(lVar6,0x10,0x6f67f7bfe179f151);
    *(undefined *)(lVar1 + 0x9218) = 0;
  }
  local_68 = 0xd7e2383ea2e2a8c9;
  uStack_60 = 0xc7d8331faceca9f0;
  local_58 = CONCAT53(local_58._3_5_,0x85a8e2);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d948 = lVar6;
  if ((*(uint *)(lVar1 + 0xfbb8) & 1) == 0) {
    *(uint *)(lVar1 + 0xfbb8) = *(uint *)(lVar1 + 0xfbb8) | 1;
    *(undefined *)(lVar1 + 0x25f63) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x25f50 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_1806121e0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x25f50;
  if (*(char *)(lVar1 + 0x25f63) != '\0') {
    FUN_180054820(lVar6,0x13,0xa3b1415dc385cd85);
    *(undefined *)(lVar1 + 0x25f63) = 0;
  }
  local_68 = 0x128b580549ca56a1;
  uStack_60 = CONCAT71(uStack_60._1_7_,0xed);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d950 = lVar6;
  if ((*(uint *)(lVar1 + 0x25aa8) & 1) == 0) {
    *(uint *)(lVar1 + 0x25aa8) = *(uint *)(lVar1 + 0x25aa8) | 1;
    *(undefined *)(lVar1 + 0x17511) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x17508 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 9);
    FUN_180505120(&LAB_1806121b0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x17508;
  if (*(char *)(lVar1 + 0x17511) != '\0') {
    FUN_180054820(lVar6,9,0x75e5317121ad3fed);
    *(undefined *)(lVar1 + 0x17511) = 0;
  }
  local_68 = 0xe480c912fa8f9019;
  uStack_60 = CONCAT17(uStack_60._7_1_,0xe7c218f8978b30);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d958 = lVar6;
  if ((*(uint *)(lVar1 + 0x13e00) & 1) == 0) {
    *(uint *)(lVar1 + 0x13e00) = *(uint *)(lVar1 + 0x13e00) | 1;
    *(undefined *)(lVar1 + 0x8b27) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x8b18 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_180612180);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x8b18;
  if (*(char *)(lVar1 + 0x8b27) != '\0') {
    FUN_180054820(lVar6,0xf,0xb7e7a77b91e1f955);
    *(undefined *)(lVar1 + 0x8b27) = 0;
  }
  local_68 = 0xb48ff47ca2b1d621;
  uStack_60 = 0xaf98c448a9aecb1d;
  local_58 = CONCAT35(local_58._5_3_,0x2fa2a4d61b);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d960 = lVar6;
  if ((*(uint *)(lVar1 + 0x10f50) & 1) == 0) {
    *(uint *)(lVar1 + 0x10f50) = *(uint *)(lVar1 + 0x10f50) | 1;
    *(undefined *)(lVar1 + 0x2c6a5) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2c690 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180612150);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2c690;
  if (*(char *)(lVar1 + 0x2c6a5) != '\0') {
    FUN_180054820(lVar6,0x15,0xddfd972fc7c7bf6d);
    *(undefined *)(lVar1 + 0x2c6a5) = 0;
  }
  local_68 = 0x9c930e2e1ec778ad;
  uStack_60 = 0xff9814140dc374b2;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d968 = lVar6;
  if ((*(uint *)(lVar1 + 0x17fe0) & 1) == 0) {
    *(uint *)(lVar1 + 0x17fe0) = *(uint *)(lVar1 + 0x17fe0) | 1;
    *(undefined *)(lVar1 + 0x1c298) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1c288 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180612120);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1c288;
  if (*(char *)(lVar1 + 0x1c298) != '\0') {
    FUN_180054820(lVar6,0x10,0xfffd777d7bb111e1);
    *(undefined *)(lVar1 + 0x1c298) = 0;
  }
  local_68 = 0x440fee5336a042c3;
  uStack_60 = 0x5d09d86c32a44cfd;
  local_58 = CONCAT44(local_58._4_4_,0x57a64ee6);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d970 = lVar6;
  if ((*(uint *)(lVar1 + 0x1386c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1386c) = *(uint *)(lVar1 + 0x1386c) | 1;
    *(undefined *)(lVar1 + 0x2b964) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2b950 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_1806120f0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2b950;
  if (*(char *)(lVar1 + 0x2b964) != '\0') {
    FUN_180054820(lVar6,0x14,0x2b7bbd3f57c32d8f);
    *(undefined *)(lVar1 + 0x2b964) = 0;
  }
  local_68 = 0x566d7019604a909b;
  uStack_60 = 0x41657c266f4696a3;
  local_58 = CONCAT44(local_58._4_4_,0x14c9cbe);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d978 = lVar6;
  if ((*(uint *)(lVar1 + 0xf77c) & 1) == 0) {
    *(uint *)(lVar1 + 0xf77c) = *(uint *)(lVar1 + 0xf77c) | 1;
    *(undefined *)(lVar1 + 0x1f254) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1f240 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_1806120c0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1f240;
  if (*(char *)(lVar1 + 0x1f254) != '\0') {
    FUN_180054820(lVar6,0x14,0x371719750129ffd7);
    *(undefined *)(lVar1 + 0x1f254) = 0;
  }
  local_68 = 0xc46c53ca87c550bf;
  uStack_60 = CONCAT17(uStack_60._7_1_,0xd42c8aad74d96);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d980 = lVar6;
  if ((*(uint *)(lVar1 + 0x19fa8) & 1) == 0) {
    *(uint *)(lVar1 + 0x19fa8) = *(uint *)(lVar1 + 0x19fa8) | 1;
    *(undefined *)(lVar1 + 0x7c7f) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x7c70) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_180612090);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x7c70;
  if (*(char *)(lVar1 + 0x7c7f) != '\0') {
    FUN_180054820(lVar6,0xf,0x970d27abc3a13ff3);
    *(undefined *)(lVar1 + 0x7c7f) = 0;
  }
  local_68 = 0x2d02bb3a1bf6a4b1;
  uStack_60 = 0x361bb93a1ae3ae89;
  local_58 = CONCAT53(local_58._3_5_,0x91ae9e);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d988 = lVar6;
  if ((*(uint *)(lVar1 + 0xb7a8) & 1) == 0) {
    *(uint *)(lVar1 + 0xb7a8) = *(uint *)(lVar1 + 0xb7a8) | 1;
    *(undefined *)(lVar1 + 0xec3b) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xec28 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180612060);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xec28;
  if (*(char *)(lVar1 + 0xec3b) != '\0') {
    FUN_180054820(lVar6,0x13,0x5f6dcb5f4991cbfd);
    *(undefined *)(lVar1 + 0xec3b) = 0;
  }
  local_68 = 0xdccb339e8ae2dc6d;
  uStack_60 = CONCAT53(uStack_60._3_5_,0x85d642);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d990 = lVar6;
  if ((*(uint *)(lVar1 + 0x1ec8c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1ec8c) = *(uint *)(lVar1 + 0x1ec8c) | 1;
    *(undefined *)(lVar1 + 0x93d3) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x93c8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xb);
    FUN_180505120(&LAB_180612030);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x93c8;
  if (*(char *)(lVar1 + 0x93d3) != '\0') {
    FUN_180054820(lVar6,0xb,0xb5bd41fbd985b321);
    *(undefined *)(lVar1 + 0x93d3) = 0;
  }
  local_68 = 0xb36058d948a82cf7;
  uStack_60 = CONCAT35(uStack_60._5_3_,0xb744ac2acd);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d998 = lVar6;
  if ((*(uint *)(lVar1 + 0x23d30) & 1) == 0) {
    *(uint *)(lVar1 + 0x23d30) = *(uint *)(lVar1 + 0x23d30) | 1;
    *(undefined *)(lVar1 + 0x171ed) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x171e0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xd);
    FUN_180505120(&LAB_180612000);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x171e0;
  if (*(char *)(lVar1 + 0x171ed) != '\0') {
    FUN_180054820(lVar6,0xd,0xc1050bb721cf43bb);
    *(undefined *)(lVar1 + 0x171ed) = 0;
  }
  local_68 = 0x22dfa3aeb430aaf3;
  uStack_60 = CONCAT44(uStack_60._4_4_,0xe722b8d1);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9a0 = lVar6;
  if ((*(uint *)(lVar1 + 0xfe48) & 1) == 0) {
    *(uint *)(lVar1 + 0xfe48) = *(uint *)(lVar1 + 0xfe48) | 1;
    *(undefined *)(lVar1 + 0x23084) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x23078 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xc);
    FUN_180505120(&LAB_180611fd0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x23078;
  if (*(char *)(lVar1 + 0x23084) != '\0') {
    FUN_180054820(lVar6,0xc,0x4babd7cbe751dfbf);
    *(undefined *)(lVar1 + 0x23084) = 0;
  }
  local_68 = 0xc0ea5b6da685edb;
  uStack_60 = CONCAT26(uStack_60._6_2_,0xc7b6ee605de5);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9a8 = lVar6;
  if ((*(uint *)(lVar1 + 0x15ba0) & 1) == 0) {
    *(uint *)(lVar1 + 0x15ba0) = *(uint *)(lVar1 + 0x15ba0) | 1;
    *(undefined *)(lVar1 + 0x1a566) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1a558 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180611fa0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1a558;
  if (*(char *)(lVar1 + 0x1a566) != '\0') {
    FUN_180054820(lVar6,0xe,0x695dc7d38d092b97);
    *(undefined *)(lVar1 + 0x1a566) = 0;
  }
  local_68 = 0x7a39e0a00c665851;
  uStack_60 = 0x6932ef921746596d;
  local_58 = 0x7022f5811c545f78;
  uStack_50 = CONCAT62(uStack_50._2_6_,0x2d78);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9b0 = lVar6;
  if ((*(uint *)(lVar1 + 0x169fc) & 1) == 0) {
    *(uint *)(lVar1 + 0x169fc) = *(uint *)(lVar1 + 0x169fc) | 1;
    *(undefined *)(lVar1 + 0x1d152) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x1d138) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180611f70);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1d138;
  if (*(char *)(lVar1 + 0x1d152) != '\0') {
    FUN_180054820(lVar6,0x1a,0x134b83f379072d1d);
    *(undefined *)(lVar1 + 0x1d152) = 0;
  }
  local_68 = 0xf5339cadcec619d8;
  uStack_60 = 0xe2268bacd7e239f0;
  local_58 = CONCAT17(local_58._7_1_,0x5f9caac8fd27f0);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9b8 = lVar6;
  if ((*(uint *)(lVar1 + 0x8960) & 1) == 0) {
    *(uint *)(lVar1 + 0x8960) = *(uint *)(lVar1 + 0x8960) | 1;
    *(undefined *)(lVar1 + 0x9767) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x9750 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x17);
    FUN_180505120(&LAB_180611f40);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x9750;
  if (*(char *)(lVar1 + 0x9767) != '\0') {
    FUN_180054820(lVar6,0x17,0xb15ff9c9a18b5595);
    *(undefined *)(lVar1 + 0x9767) = 0;
  }
  local_68 = 0x6ab8cfffa0e2ab24;
  uStack_60 = CONCAT62(uStack_60._2_6_,0xe70c);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9c0 = lVar6;
  if ((*(uint *)(lVar1 + 0x2a424) & 1) == 0) {
    *(uint *)(lVar1 + 0x2a424) = *(uint *)(lVar1 + 0x2a424) | 1;
    *(undefined *)(lVar1 + 0x1e58a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1e580 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 10);
    FUN_180505120(&LAB_180611f10);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1e580;
  if (*(char *)(lVar1 + 0x1e58a) != '\0') {
    FUN_180054820(lVar6,10,0x9d1b98dc5b1e769);
    *(undefined *)(lVar1 + 0x1e58a) = 0;
  }
  local_68 = 0x35dd5d88223bae60;
  uStack_60 = 0x30db5b881a2cac4c;
  local_58 = CONCAT53(local_58._3_5_,0x49aa4e);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9c8 = lVar6;
  if ((*(uint *)(lVar1 + 0x17574) & 1) == 0) {
    *(uint *)(lVar1 + 0x17574) = *(uint *)(lVar1 + 0x17574) | 1;
    *(undefined *)(lVar1 + 0x1ce53) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1ce40 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180611ee0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1ce40;
  if (*(char *)(lVar1 + 0x1ce53) != '\0') {
    FUN_180054820(lVar6,0x13,0x59ad29ed4949cf2d);
    *(undefined *)(lVar1 + 0x1ce53) = 0;
  }
  local_68 = 0x16f412cbb81bf804;
  uStack_60 = 0x14e30dc68808f720;
  local_58 = CONCAT53(local_58._3_5_,0x6ffc2a);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9d0 = lVar6;
  if ((*(uint *)(lVar1 + 0x23e7c) & 1) == 0) {
    *(uint *)(lVar1 + 0x23e7c) = *(uint *)(lVar1 + 0x23e7c) | 1;
    *(undefined *)(lVar1 + 0x28f83) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x28f70 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180611eb0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x28f70;
  if (*(char *)(lVar1 + 0x28f83) != '\0') {
    FUN_180054820(lVar6,0x13,0x7d957fa3db6f9949);
    *(undefined *)(lVar1 + 0x28f83) = 0;
  }
  local_68 = 0xb34c82ebfe2b80fc;
  uStack_60 = 0xb6598aebfe3184f6;
  local_58 = 0xbc449debfe0c8fde;
  uStack_50 = CONCAT62(uStack_50._2_6_,0xe1d4);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9d8 = lVar6;
  if ((*(uint *)(lVar1 + 0x13aa4) & 1) == 0) {
    *(uint *)(lVar1 + 0x13aa4) = *(uint *)(lVar1 + 0x13aa4) | 1;
    *(undefined *)(lVar1 + 0x26142) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x26128 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180611e80);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x26128;
  if (*(char *)(lVar1 + 0x26142) != '\0') {
    FUN_180054820(lVar6,0x1a,0xdf2deb999b5fe1b1);
    *(undefined *)(lVar1 + 0x26142) = 0;
  }
  local_68 = 0x6b1e4e21d6355a66;
  uStack_60 = 0x71a443ac5335e78;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9e0 = lVar6;
  if ((*(uint *)(lVar1 + 0x80dc) & 1) == 0) {
    *(uint *)(lVar1 + 0x80dc) = *(uint *)(lVar1 + 0x80dc) | 1;
    *(undefined *)(lVar1 + 0x89b0) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x89a0) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180611e50);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x89a0;
  if (*(char *)(lVar1 + 0x89b0) != '\0') {
    FUN_180054820(lVar6,0x10,0x77f2753b3413b2b);
    *(undefined *)(lVar1 + 0x89b0) = 0;
  }
  local_68 = 0x4ab374a7f0847c22;
  uStack_60 = 0x48a86da1c6ba7c08;
  local_58 = CONCAT62(local_58._2_6_,0x190a);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9e8 = lVar6;
  if ((*(uint *)(lVar1 + 0x21dfc) & 1) == 0) {
    *(uint *)(lVar1 + 0x21dfc) = *(uint *)(lVar1 + 0x21dfc) | 1;
    *(undefined *)(lVar1 + 0x1d0da) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1d0c8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180611e20);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1d0c8;
  if (*(char *)(lVar1 + 0x1d0da) != '\0') {
    FUN_180054820(lVar6,0x12,0x2bc11bd3a3e9196f);
    *(undefined *)(lVar1 + 0x1d0da) = 0;
  }
  local_68 = 0xf1247a4358ea2e08;
  uStack_60 = 0xec01715464e2392a;
  local_58 = CONCAT53(local_58._3_5_,0x872e26);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9f0 = lVar6;
  if ((*(uint *)(lVar1 + 0xae94) & 1) == 0) {
    *(uint *)(lVar1 + 0xae94) = *(uint *)(lVar1 + 0xae94) | 1;
    *(undefined *)(lVar1 + 0x1b01b) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1b008 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180611df0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1b008;
  if (*(char *)(lVar1 + 0x1b01b) != '\0') {
    FUN_180054820(lVar6,0x13,0x8577033137874b45);
    *(undefined *)(lVar1 + 0x1b01b) = 0;
  }
  local_68 = 0xa9bd72a8c5824ef0;
  uStack_60 = 0xb4a57299fd8545d8;
  local_58 = CONCAT44(local_58._4_4_,0xad834ed9);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087d9f8 = lVar6;
  if ((*(uint *)(lVar1 + 51000) & 1) == 0) {
    *(uint *)(lVar1 + 51000) = *(uint *)(lVar1 + 51000) | 1;
    *(undefined *)(lVar1 + 0x1e5b4) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1e5a0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180611dc0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1e5a0;
  if (*(char *)(lVar1 + 0x1e5b4) != '\0') {
    FUN_180054820(lVar6,0x14,0xddd31debadf12bbd);
    *(undefined *)(lVar1 + 0x1e5b4) = 0;
  }
  local_68 = 0xdfee1a6eb600545c;
  uStack_60 = 0xfee20b7da0204264;
  local_58 = CONCAT62(local_58._2_6_,0x3174);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da00 = lVar6;
  if ((*(uint *)(lVar1 + 0x18328) & 1) == 0) {
    *(uint *)(lVar1 + 0x18328) = *(uint *)(lVar1 + 0x18328) | 1;
    *(undefined *)(lVar1 + 0x2c75a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2c748 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180611d90);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2c748;
  if (*(char *)(lVar1 + 0x2c75a) != '\0') {
    FUN_180054820(lVar6,0x12,0x9d8b7d0fc5733111);
    *(undefined *)(lVar1 + 0x2c75a) = 0;
  }
  local_68 = 0x3336ba26008858ac;
  uStack_60 = 0x383cb431019e6e86;
  local_58 = CONCAT71(local_58._1_7_,0xe1);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da08 = lVar6;
  if ((*(uint *)(lVar1 + 0x20318) & 1) == 0) {
    *(uint *)(lVar1 + 0x20318) = *(uint *)(lVar1 + 0x20318) | 1;
    *(undefined *)(lVar1 + 0x1ea11) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x1ea00) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_180611d60);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1ea00;
  if (*(char *)(lVar1 + 0x1ea11) != '\0') {
    FUN_180054820(lVar6,0x11,0x5d5fdd4773fb3de1);
    *(undefined *)(lVar1 + 0x1ea11) = 0;
  }
  local_68 = 0x1e1e47d50cbff836;
  uStack_60 = 0x1e3641f904a4ed10;
  local_58 = CONCAT26(local_58._6_2_,0x35e508acfc15);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da10 = lVar6;
  if ((*(uint *)(lVar1 + 0x2ab14) & 1) == 0) {
    *(uint *)(lVar1 + 0x2ab14) = *(uint *)(lVar1 + 0x2ab14) | 1;
    *(undefined *)(lVar1 + 0x23abe) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x23aa8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_180611d30);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x23aa8;
  if (*(char *)(lVar1 + 0x23abe) != '\0') {
    FUN_180054820(lVar6,0x16,0x7f7b35976dcb9d7b);
    *(undefined *)(lVar1 + 0x23abe) = 0;
  }
  local_68 = 0x149db3e4071c5e7c;
  uStack_60 = 0x98ab0f910135e57;
  local_58 = CONCAT35(local_58._5_3_,0x8b101c5e47);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da18 = lVar6;
  if ((*(uint *)(lVar1 + 0x29580) & 1) == 0) {
    *(uint *)(lVar1 + 0x29580) = *(uint *)(lVar1 + 0x29580) | 1;
    *(undefined *)(lVar1 + 0x238ed) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x238d8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180611d00);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x238d8;
  if (*(char *)(lVar1 + 0x238ed) != '\0') {
    FUN_180054820(lVar6,0x15,0x7befe38b757f3731);
    *(undefined *)(lVar1 + 0x238ed) = 0;
  }
  local_68 = 0xd485e8574e055c74;
  uStack_60 = 0xde98ff574e325d56;
  local_58 = CONCAT62(local_58._2_6_,0x335c);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da20 = lVar6;
  if ((*(uint *)(lVar1 + 0x29f60) & 1) == 0) {
    *(uint *)(lVar1 + 0x29f60) = *(uint *)(lVar1 + 0x29f60) | 1;
    *(undefined *)(lVar1 + 0xb25a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xb248 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180611cd0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xb248;
  if (*(char *)(lVar1 + 0xb25a) != '\0') {
    FUN_180054820(lVar6,0x12,0xbdf189252b613339);
    *(undefined *)(lVar1 + 0xb25a) = 0;
  }
  local_68 = 0xcfe884b0fa009408;
  uStack_60 = CONCAT35(uStack_60._5_3_,0xd5ec169233);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da28 = lVar6;
  if ((*(uint *)(lVar1 + 0x1e448) & 1) == 0) {
    *(uint *)(lVar1 + 0x1e448) = *(uint *)(lVar1 + 0x1e448) | 1;
    *(undefined *)(lVar1 + 0x25ec5) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x25eb8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xd);
    FUN_180505120(&LAB_180611ca0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x25eb8;
  if (*(char *)(lVar1 + 0x25ec5) != '\0') {
    FUN_180054820(lVar6,0xd,0xbd8dd7d58975fb45);
    *(undefined *)(lVar1 + 0x25ec5) = 0;
  }
  local_68 = 0x3e8c012eb42b1edb;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x7335ad3a12f9);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da30 = lVar6;
  if ((*(uint *)(lVar1 + 0x1dd70) & 1) == 0) {
    *(uint *)(lVar1 + 0x1dd70) = *(uint *)(lVar1 + 0x1dd70) | 1;
    *(undefined *)(lVar1 + 0x2361e) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x23610 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180611c70);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x23610;
  if (*(char *)(lVar1 + 0x2361e) != '\0') {
    FUN_180054820(lVar6,0xe,0x7de77341c35f7b95);
    *(undefined *)(lVar1 + 0x2361e) = 0;
  }
  local_68 = 0x26326bf60a87eca3;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x19eb1885fb88);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da38 = lVar6;
  if ((*(uint *)(lVar1 + 0x219c8) & 1) == 0) {
    *(uint *)(lVar1 + 0x219c8) = *(uint *)(lVar1 + 0x219c8) | 1;
    *(undefined *)(lVar1 + 0x1a3e6) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1a3d8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180611c40);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1a3d8;
  if (*(char *)(lVar1 + 0x1a3e6) != '\0') {
    FUN_180054820(lVar6,0xe,0x755919997df389ed);
    *(undefined *)(lVar1 + 0x1a3e6) = 0;
  }
  local_68 = 0xf0ac79e61649c655;
  uStack_60 = 0xa3b46ce70849d77e;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da40 = lVar6;
  if ((*(uint *)(lVar1 + 0x1b4f0) & 1) == 0) {
    *(uint *)(lVar1 + 0x1b4f0) = *(uint *)(lVar1 + 0x1b4f0) | 1;
    *(undefined *)(lVar1 + 0x2ad40) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x2ad30) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_180611c10);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2ad30;
  if (*(char *)(lVar1 + 0x2ad40) != '\0') {
    FUN_180054820(lVar6,0x10,0xa3c70b89613da31b);
    *(undefined *)(lVar1 + 0x2ad40) = 0;
  }
  local_68 = 0x366123bc3d11da89;
  uStack_60 = 0x185e10bd0a0bd4a4;
  local_58 = 0x3e633cb01b1cdc83;
  uStack_50 = 0x3c6425ab0a2cccb5;
  local_48 = 0xa2;
  local_47 = 0xb5;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da48 = lVar6;
  if ((*(uint *)(lVar1 + 0xa764) & 1) == 0) {
    *(uint *)(lVar1 + 0xa764) = *(uint *)(lVar1 + 0xa764) | 1;
    *(undefined *)(lVar1 + 0x2de1a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2ddf8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x22);
    FUN_180505120(&LAB_180611be0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2ddf8;
  if (*(char *)(lVar1 + 0x2de1a) != '\0') {
    FUN_180054820(lVar6,0x22,0x5f0d53d96f7fb5c7);
    *(undefined *)(lVar1 + 0x2de1a) = 0;
  }
  local_68 = 0x5efe5043ead94295;
  uStack_60 = 0x49ef5c76edc244af;
  local_58 = CONCAT44(local_58._4_4_,0x83c84eb2);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da50 = lVar6;
  if ((*(uint *)(lVar1 + 0x1be9c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1be9c) = *(uint *)(lVar1 + 0x1be9c) | 1;
    *(undefined *)(lVar1 + 0x1d47c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1d468 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180611bb0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1d468;
  if (*(char *)(lVar1 + 0x1d47c) != '\0') {
    FUN_180054820(lVar6,0x14,0x3f9d392583ad2ddb);
    *(undefined *)(lVar1 + 0x1d47c) = 0;
  }
  local_68 = 0xd6aaf64718c5f4c8;
  uStack_60 = 0xd0bdf2711fcef4ea;
  local_58 = 0xd0bfe17022d8f7e8;
  uStack_50 = CONCAT53(uStack_50._3_5_,0xabfce4);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da58 = lVar6;
  if ((*(uint *)(lVar1 + 0xb9d0) & 1) == 0) {
    *(uint *)(lVar1 + 0xb9d0) = *(uint *)(lVar1 + 0xb9d0) | 1;
    *(undefined *)(lVar1 + 0x141f3) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x141d8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1b);
    FUN_180505120(&LAB_180611b80);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x141d8;
  if (*(char *)(lVar1 + 0x141f3) != '\0') {
    FUN_180054820(lVar6,0x1b,0xb9c9931571ab9987);
    *(undefined *)(lVar1 + 0x141f3) = 0;
  }
  local_68 = 0x96ce2992df4061f4;
  uStack_60 = 0x86c22ca7c34042df;
  local_58 = CONCAT71(local_58._1_7_,0xbb);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da60 = lVar6;
  if ((*(uint *)(lVar1 + 0x9a14) & 1) == 0) {
    *(uint *)(lVar1 + 0x9a14) = *(uint *)(lVar1 + 0x9a14) | 1;
    *(undefined *)(lVar1 + 0x2e041) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2e030 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_180611b50);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2e030;
  if (*(char *)(lVar1 + 0x2e041) != '\0') {
    FUN_180054820(lVar6,0x11,0xe3a145d1b12511bb);
    *(undefined *)(lVar1 + 0x2e041) = 0;
  }
  local_68 = 0x622ace441cb256b5;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x4fcc461ea74580);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da68 = lVar6;
  if ((*(uint *)(lVar1 + 0x7994) & 1) == 0) {
    *(uint *)(lVar1 + 0x7994) = *(uint *)(lVar1 + 0x7994) | 1;
    *(undefined *)(lVar1 + 0xd657) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xd648 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_180611b20);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xd648;
  if (*(char *)(lVar1 + 0xd657) != '\0') {
    FUN_180054820(lVar6,0xf,0x314fa92577d137e5);
    *(undefined *)(lVar1 + 0xd657) = 0;
  }
  local_68 = 0x9650840218e0f2cd;
  uStack_60 = 0xa6568a1501e6c0d4;
  local_58 = CONCAT71(local_58._1_7_,0x9d);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da70 = lVar6;
  if ((*(uint *)(lVar1 + 0x1553c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1553c) = *(uint *)(lVar1 + 0x1553c) | 1;
    *(undefined *)(lVar1 + 0x2cec9) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2ceb8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_180611af0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2ceb8;
  if (*(char *)(lVar1 + 0x2cec9) != '\0') {
    FUN_180054820(lVar6,0x11,0xc335e3637383939d);
    *(undefined *)(lVar1 + 0x2cec9) = 0;
  }
  local_68 = 0xae743c94c7ffb6df;
  uStack_60 = 0xa97c2a9fdcf9b6e3;
  local_58 = CONCAT35(local_58._5_3_,0xedd6eebef9);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da78 = lVar6;
  if ((*(uint *)(lVar1 + 0x18534) & 1) == 0) {
    *(uint *)(lVar1 + 0x18534) = *(uint *)(lVar1 + 0x18534) | 1;
    *(undefined *)(lVar1 + 0x10375) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x10360 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180611ac0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x10360;
  if (*(char *)(lVar1 + 0x10375) != '\0') {
    FUN_180054820(lVar6,0x15,0xdb1979edb38dd78f);
    *(undefined *)(lVar1 + 0x10375) = 0;
  }
  local_68 = 0xef88c93daaab6423;
  uStack_60 = 0xe491e213bbba6917;
  local_58 = CONCAT26(local_58._6_2_,0x8b3daaab6424);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da80 = lVar6;
  if ((*(uint *)(lVar1 + 0x1ca4c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1ca4c) = *(uint *)(lVar1 + 0x1ca4c) | 1;
    *(undefined *)(lVar1 + 0x24f76) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x24f60 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_180611a90);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x24f60;
  if (*(char *)(lVar1 + 0x24f76) != '\0') {
    FUN_180054820(lVar6,0x16,0x81fd8b55c9df0573);
    *(undefined *)(lVar1 + 0x24f76) = 0;
  }
  local_68 = 0x333ff8d739259449;
  uStack_60 = 0x3e27e3d402369b70;
  local_58 = CONCAT53(local_58._3_5_,0x51907a);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da88 = lVar6;
  if ((*(uint *)(lVar1 + 0x8858) & 1) == 0) {
    *(uint *)(lVar1 + 0x8858) = *(uint *)(lVar1 + 0x8858) | 1;
    *(undefined *)(lVar1 + 0x1c223) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1c210 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180611a60);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1c210;
  if (*(char *)(lVar1 + 0x1c223) != '\0') {
    FUN_180054820(lVar6,0x13,0x575191b15151f519);
    *(undefined *)(lVar1 + 0x1c223) = 0;
  }
  local_68 = 0xf65eb91869995c59;
  uStack_60 = 0xe547a5184c8e5a67;
  local_58 = 0xf45abd056ab85566;
  uStack_50 = CONCAT62(uStack_50._2_6_,0x396c);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da90 = lVar6;
  if ((*(uint *)(lVar1 + 0x1a5f4) & 1) == 0) {
    *(uint *)(lVar1 + 0x1a5f4) = *(uint *)(lVar1 + 0x1a5f4) | 1;
    *(undefined *)(lVar1 + 0x167c2) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x167a8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180611a30);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x167a8;
  if (*(char *)(lVar1 + 0x167c2) != '\0') {
    FUN_180054820(lVar6,0x1a,0x9733cb770feb3909);
    *(undefined *)(lVar1 + 0x167c2) = 0;
  }
  local_68 = 0x2aea2e42b823c637;
  uStack_60 = 0x2aef2f4e8622cd08;
  local_58 = CONCAT53(local_58._3_5_,0x51c604);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087da98 = lVar6;
  if ((*(uint *)(lVar1 + 0x23980) & 1) == 0) {
    *(uint *)(lVar1 + 0x23980) = *(uint *)(lVar1 + 0x23980) | 1;
    *(undefined *)(lVar1 + 0x21113) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x21100 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180611a00);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x21100;
  if (*(char *)(lVar1 + 0x21113) != '\0') {
    FUN_180054820(lVar6,0x13,0x43995d2bd551a367);
    *(undefined *)(lVar1 + 0x21113) = 0;
  }
  local_68 = 0x6678bc9af4462fa5;
  uStack_60 = CONCAT17(uStack_60._7_1_,0xbba90ee493590);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087daa0 = lVar6;
  if ((*(uint *)(lVar1 + 0x9e28) & 1) == 0) {
    *(uint *)(lVar1 + 0x9e28) = *(uint *)(lVar1 + 0x9e28) | 1;
    *(undefined *)(lVar1 + 0x2186f) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x21860 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_1806119d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x21860;
  if (*(char *)(lVar1 + 0x2186f) != '\0') {
    FUN_180054820(lVar6,0xf,0x350bdff3873f47f5);
    *(undefined *)(lVar1 + 0x2186f) = 0;
  }
  local_68 = 0xd68c8828ce6aebfd;
  uStack_60 = 0x858c8c2fd467f7c8;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087daa8 = lVar6;
  if ((*(uint *)(lVar1 + 0x1d3d0) & 1) == 0) {
    *(uint *)(lVar1 + 0x1d3d0) = *(uint *)(lVar1 + 0x1d3d0) | 1;
    *(undefined *)(lVar1 + 0x91d0) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x91c0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_1806119a0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x91c0;
  if (*(char *)(lVar1 + 0x91d0) != '\0') {
    FUN_180054820(lVar6,0x10,0x85ffeb41bd1383ad);
    *(undefined *)(lVar1 + 0x91d0) = 0;
  }
  local_68 = 0xc8864cd47684d95f;
  uStack_60 = 0xc9905ec271acc16a;
  local_58 = CONCAT35(local_58._5_3_,0xb17086dc79);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dab0 = lVar6;
  if ((*(uint *)(lVar1 + 0xccf0) & 1) == 0) {
    *(uint *)(lVar1 + 0xccf0) = *(uint *)(lVar1 + 0xccf0) | 1;
    *(undefined *)(lVar1 + 0xa275) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xa260 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180611970);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xa260;
  if (*(char *)(lVar1 + 0xa275) != '\0') {
    FUN_180054820(lVar6,0x15,0xbbf50db115e5b50f);
    *(undefined *)(lVar1 + 0xa275) = 0;
  }
  local_68 = 0x343d2cda1a64c531;
  uStack_60 = 0x362009cd1c56da15;
  local_58 = CONCAT62(local_58._2_6_,0xa904);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dab8 = lVar6;
  if ((*(uint *)(lVar1 + 0x1e5f0) & 1) == 0) {
    *(uint *)(lVar1 + 0x1e5f0) = *(uint *)(lVar1 + 0x1e5f0) | 1;
    *(undefined *)(lVar1 + 0x12e82) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x12e70 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180611940);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x12e70;
  if (*(char *)(lVar1 + 0x12e82) != '\0') {
    FUN_180054820(lVar6,0x12,0x55497fbf7905a961);
    *(undefined *)(lVar1 + 0x12e82) = 0;
  }
  local_68 = 0x48981ae062f6ff73;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x69e062fee551);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dac0 = lVar6;
  if ((*(uint *)(lVar1 + 0x1b054) & 1) == 0) {
    *(uint *)(lVar1 + 0x1b054) = *(uint *)(lVar1 + 0x1b054) | 1;
    *(undefined *)(lVar1 + 0x2d296) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2d288 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180611910);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2d288;
  if (*(char *)(lVar1 + 0x2d296) != '\0') {
    FUN_180054820(lVar6,0xe,0x2dcb698501979323);
    *(undefined *)(lVar1 + 0x2d296) = 0;
  }
  local_68 = 0x7c7d5ad55d1eab21;
  uStack_60 = 0x7e7b66d75c10ab32;
  local_58 = 0x677d50e04c18a603;
  uStack_50 = CONCAT44(uStack_50._4_4_,0x291aa418);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dac8 = lVar6;
  if ((*(uint *)(lVar1 + 0xa6d0) & 1) == 0) {
    *(uint *)(lVar1 + 0xa6d0) = *(uint *)(lVar1 + 0xa6d0) | 1;
    *(undefined *)(lVar1 + 0x2cb7c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2cb60 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1c);
    FUN_180505120(&LAB_1806118e0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2cb60;
  if (*(char *)(lVar1 + 0x2cb7c) != '\0') {
    FUN_180054820(lVar6,0x1c,0x110f35b3297fc771);
    *(undefined *)(lVar1 + 0x2cb7c) = 0;
  }
  local_68 = 0xd0cd0ed335468101;
  uStack_60 = 0xeecc05db244e9f17;
  local_58 = CONCAT17(local_58._7_1_,0xbf04d628519f34);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dad0 = lVar6;
  if ((*(uint *)(lVar1 + 0x22224) & 1) == 0) {
    *(uint *)(lVar1 + 0x22224) = *(uint *)(lVar1 + 0x22224) | 1;
    *(undefined *)(lVar1 + 0x2059f) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x20588 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x17);
    FUN_180505120(&LAB_1806118b0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x20588;
  if (*(char *)(lVar1 + 0x2059f) != '\0') {
    FUN_180054820(lVar6,0x17,0xbdbf61b54127ed51);
    *(undefined *)(lVar1 + 0x2059f) = 0;
  }
  local_68 = 0x82218e8f937aed2f;
  uStack_60 = 0x8a3a93889579e833;
  local_58 = CONCAT62(local_58._2_6_,0x810c);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dad8 = lVar6;
  if ((*(uint *)(lVar1 + 0x29eac) & 1) == 0) {
    *(uint *)(lVar1 + 0x29eac) = *(uint *)(lVar1 + 0x29eac) | 1;
    *(undefined *)(lVar1 + 0x26c2a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x26c18 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180611880);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x26c18;
  if (*(char *)(lVar1 + 0x26c2a) != '\0') {
    FUN_180054820(lVar6,0x12,0xef53e1e9e71b817f);
    *(undefined *)(lVar1 + 0x26c2a) = 0;
  }
  local_68 = 0xbc956fd8307c3b7b;
  uStack_60 = 0xbeb86bcf2c4e365f;
  local_58 = CONCAT62(local_58._2_6_,0x574e);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dae0 = lVar6;
  if ((*(uint *)(lVar1 + 0x249d8) & 1) == 0) {
    *(uint *)(lVar1 + 0x249d8) = *(uint *)(lVar1 + 0x249d8) | 1;
    *(undefined *)(lVar1 + 0x11502) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x114f0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_180611850);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x114f0;
  if (*(char *)(lVar1 + 0x11502) != '\0') {
    FUN_180054820(lVar6,0x12,0xddd11dbd491d572b);
    *(undefined *)(lVar1 + 0x11502) = 0;
  }
  local_68 = 0x5e143f98e8e01d7b;
  uStack_60 = 0x56023f92e5e01d5e;
  local_58 = CONCAT26(local_58._6_2_,0x4d98f2e80759);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dae8 = lVar6;
  if ((*(uint *)(lVar1 + 0xbf10) & 1) == 0) {
    *(uint *)(lVar1 + 0xbf10) = *(uint *)(lVar1 + 0xbf10) | 1;
    *(undefined *)(lVar1 + 0x1c6c6) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1c6b0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_180611820);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1c6b0;
  if (*(char *)(lVar1 + 0x1c6c6) != '\0') {
    FUN_180054820(lVar6,0x16,0x33514dfd9181712b);
    *(undefined *)(lVar1 + 0x1c6c6) = 0;
  }
  local_68 = 0x6a73135adcd055c1;
  uStack_60 = 0x40550e56d1d04bf5;
  local_58 = CONCAT17(local_58._7_1_,0x3b045cccc74bf4);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087daf0 = lVar6;
  if ((*(uint *)(lVar1 + 0x162f4) & 1) == 0) {
    *(uint *)(lVar1 + 0x162f4) = *(uint *)(lVar1 + 0x162f4) | 1;
    *(undefined *)(lVar1 + 0x1a1ef) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1a1d8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x17);
    FUN_180505120(&LAB_1806117f0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1a1d8;
  if (*(char *)(lVar1 + 0x1a1ef) != '\0') {
    FUN_180054820(lVar6,0x17,0x133b613fa5b13991);
    *(undefined *)(lVar1 + 0x1a1ef) = 0;
  }
  local_68 = 0xb007a150d6d2f11d;
  uStack_60 = 0xba38a547cae0ea28;
  local_58 = CONCAT62(local_58._2_6_,0x9d28);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087daf8 = lVar6;
  if ((*(uint *)(lVar1 + 0x13b00) & 1) == 0) {
    *(uint *)(lVar1 + 0x13b00) = *(uint *)(lVar1 + 0x13b00) | 1;
    *(undefined *)(lVar1 + 0x27782) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x27770 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_1806117c0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x27770;
  if (*(char *)(lVar1 + 0x27782) != '\0') {
    FUN_180054820(lVar6,0x12,0xd951d335afb39d4d);
    *(undefined *)(lVar1 + 0x27782) = 0;
  }
  local_res8[0] = 3;
  local_res8[1] = 0xbd;
  local_res8[2] = 0x86;
  local_res8[3] = 0x24;
  local_res8[4] = 0xd0;
  local_res8[5] = 0xdb;
  local_res8[6] = 0xac;
  local_res8[7] = 0xcf;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db00 = lVar6;
  if ((*(uint *)(lVar1 + 0x247b8) & 1) == 0) {
    *(uint *)(lVar1 + 0x247b8) = *(uint *)(lVar1 + 0x247b8) | 1;
    *(undefined *)(lVar1 + 0x10e98) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x10e90 + uVar5) = local_res8[uVar5];
      uVar5 = uVar5 + 1;
    } while (uVar5 < 8);
    FUN_180505120(&LAB_180611790);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x10e90;
  if (*(char *)(lVar1 + 0x10e98) != '\0') {
    FUN_180054820(lVar6,8,0xcfdfa9b55de7d153);
    *(undefined *)(lVar1 + 0x10e98) = 0;
  }
  local_68 = 0xc49a17069c42d3b7;
  uStack_60 = 0xc5b6101b9852d189;
  local_58 = 0xabbc1a068d45dab4;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db08 = lVar6;
  if ((*(uint *)(lVar1 + 0x15e64) & 1) == 0) {
    *(uint *)(lVar1 + 0x15e64) = *(uint *)(lVar1 + 0x15e64) | 1;
    *(undefined *)(lVar1 + 0xa2f8) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xa2e0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x18);
    FUN_180505120(&LAB_180611760);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xa2e0;
  if (*(char *)(lVar1 + 0xa2f8) != '\0') {
    FUN_180054820(lVar6,0x18,0xabd9796ffb37bfe7);
    *(undefined *)(lVar1 + 0xa2f8) = 0;
  }
  local_68 = 0x5cab4316e034e90d;
  uStack_60 = 0x50995f1ad426f03f;
  local_58 = CONCAT53(local_58._3_5_,0x41e03e);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db10 = lVar6;
  if ((*(uint *)(lVar1 + 0x16fe4) & 1) == 0) {
    *(uint *)(lVar1 + 0x16fe4) = *(uint *)(lVar1 + 0x16fe4) | 1;
    *(undefined *)(lVar1 + 0x15f23) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x15f10) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180611730);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x15f10;
  if (*(char *)(lVar1 + 0x15f23) != '\0') {
    FUN_180054820(lVar6,0x13,0x39ef2d7f8741855d);
    *(undefined *)(lVar1 + 0x15f23) = 0;
  }
  local_68 = 0x247859323048b3bf;
  uStack_60 = 0x345c5e2d25588c86;
  local_58 = CONCAT71(local_58._1_7_,0xef);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db18 = lVar6;
  if ((*(uint *)(lVar1 + 0x95f0) & 1) == 0) {
    *(uint *)(lVar1 + 0x95f0) = *(uint *)(lVar1 + 0x95f0) | 1;
    *(undefined *)(lVar1 + 0xc5d9) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xc5c8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x11);
    FUN_180505120(&LAB_180611700);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xc5c8;
  if (*(char *)(lVar1 + 0xc5d9) != '\0') {
    FUN_180054820(lVar6,0x11,0x513f375b573ddfef);
    *(undefined *)(lVar1 + 0xc5d9) = 0;
  }
  local_68 = 0xd818814eb6ecf51f;
  uStack_60 = 0xcd3b8a4ab4fef821;
  local_58 = 0xb9308c4ea7ebfc1c;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db20 = lVar6;
  if ((*(uint *)(lVar1 + 0x2a428) & 1) == 0) {
    *(uint *)(lVar1 + 0x2a428) = *(uint *)(lVar1 + 0x2a428) | 1;
    *(undefined *)(lVar1 + 0x1ae10) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1adf8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x18);
    FUN_180505120(&LAB_1806116d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1adf8;
  if (*(char *)(lVar1 + 0x1ae10) != '\0') {
    FUN_180054820(lVar6,0x18,0xb955ef27d199994f);
    *(undefined *)(lVar1 + 0x1ae10) = 0;
  }
  local_68 = 0x86edc70ac452bbdd;
  uStack_60 = 0x9fcfcc30da44bee1;
  local_58 = CONCAT44(local_58._4_4_,0xa342b4e4);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db28 = lVar6;
  if ((*(uint *)(lVar1 + 0x1e3d0) & 1) == 0) {
    *(uint *)(lVar1 + 0x1e3d0) = *(uint *)(lVar1 + 0x1e3d0) | 1;
    *(undefined *)(lVar1 + 0xdd94) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0xdd80) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_1806116a0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xdd80;
  if (*(char *)(lVar1 + 0xdd94) != '\0') {
    FUN_180054820(lVar6,0x14,0xe9bda963a327d78d);
    *(undefined *)(lVar1 + 0xdd94) = 0;
  }
  local_68 = 0x28a602ff0126ecb3;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x71ee0c26f591);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db30 = lVar6;
  if ((*(uint *)(lVar1 + 0x1aca0) & 1) == 0) {
    *(uint *)(lVar1 + 0x1aca0) = *(uint *)(lVar1 + 0x1aca0) | 1;
    *(undefined *)(lVar1 + 0x1bda6) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x1bd98) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180611670);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1bd98;
  if (*(char *)(lVar1 + 0x1bda6) != '\0') {
    FUN_180054820(lVar6,0xe,0x4df5718b6f4f83e3);
    *(undefined *)(lVar1 + 0x1bda6) = 0;
  }
  local_68 = 0x7c5eeaac5edb40d9;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x93aa54de59fb);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db38 = lVar6;
  if ((*(uint *)(lVar1 + 0x1b654) & 1) == 0) {
    *(uint *)(lVar1 + 0x1b654) = *(uint *)(lVar1 + 0x1b654) | 1;
    *(undefined *)(lVar1 + 0x16766) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x16758 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180611640);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x16758;
  if (*(char *)(lVar1 + 0x16766) != '\0') {
    FUN_180054820(lVar6,0xe,0x190d93cf37b72f89);
    *(undefined *)(lVar1 + 0x16766) = 0;
  }
  local_68 = 0xdefd9c486bf6b153;
  uStack_60 = CONCAT62(uStack_60._2_6_,0xc367);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db40 = lVar6;
  if ((*(uint *)(lVar1 + 0x232dc) & 1) == 0) {
    *(uint *)(lVar1 + 0x232dc) = *(uint *)(lVar1 + 0x232dc) | 1;
    *(undefined *)(lVar1 + 0x27b5a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x27b50 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 10);
    FUN_180505120(&LAB_180611610);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x27b50;
  if (*(char *)(lVar1 + 0x27b5a) != '\0') {
    FUN_180054820(lVar6,10,0xbb99fd270793c303);
    *(undefined *)(lVar1 + 0x27b5a) = 0;
  }
  local_68 = 0x8386c5ea56d863ef;
  uStack_60 = 0x9885c0e750f57dde;
  local_58 = 0x8497c4e756e463d0;
  uStack_50 = 0x9885d3ea66c574d3;
  local_48 = 0xdc;
  local_47 = 0x74;
  local_46 = 0xb7;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db48 = lVar6;
  if ((*(uint *)(lVar1 + 0xf224) & 1) == 0) {
    *(uint *)(lVar1 + 0xf224) = *(uint *)(lVar1 + 0xf224) | 1;
    *(undefined *)(lVar1 + 0x2a66b) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2a648 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x23);
    FUN_180505120(&LAB_1806115e0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2a648;
  if (*(char *)(lVar1 + 0x2a66b) != '\0') {
    FUN_180054820(lVar6,0x23,0xf1f3a18f35b711bf);
    *(undefined *)(lVar1 + 0x2a66b) = 0;
  }
  local_68 = 0xc0921e767214f9e3;
  uStack_60 = 0xd9840e7d700ff8dd;
  local_58 = 0xecb21e707808f2db;
  uStack_50 = CONCAT26(uStack_50._6_2_,0x6d767212fdc1);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db50 = lVar6;
  if ((*(uint *)(lVar1 + 0xfc04) & 1) == 0) {
    *(uint *)(lVar1 + 0xfc04) = *(uint *)(lVar1 + 0xfc04) | 1;
    *(undefined *)(lVar1 + 0x16476) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x16458 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1e);
    FUN_180505120(&LAB_1806115b0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x16458;
  if (*(char *)(lVar1 + 0x16476) != '\0') {
    FUN_180054820(lVar6,0x1e,0x89e16d13117b8bb3);
    *(undefined *)(lVar1 + 0x16476) = 0;
  }
  local_68 = 0xcf0e2cdcc3fc1bcd;
  uStack_60 = 0xe81331d8d4e139e4;
  local_58 = CONCAT17(local_58._7_1_,0x6724d6d2e51bf8);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db58 = lVar6;
  if ((*(uint *)(lVar1 + 0x1ab6c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1ab6c) = *(uint *)(lVar1 + 0x1ab6c) | 1;
    *(undefined *)(lVar1 + 0x2b4a7) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2b490 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x17);
    FUN_180505120(&LAB_180611580);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2b490;
  if (*(char *)(lVar1 + 0x2b4a7) != '\0') {
    FUN_180054820(lVar6,0x17,0xbb6741b5bb93699d);
    *(undefined *)(lVar1 + 0x2b4a7) = 0;
  }
  local_68 = 0xf2ebc8f619bbe0d3;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x83defc1cafe7e6);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db60 = lVar6;
  if ((*(uint *)(lVar1 + 0x1d794) & 1) == 0) {
    *(uint *)(lVar1 + 0x1d794) = *(uint *)(lVar1 + 0x1d794) | 1;
    *(undefined *)(lVar1 + 0xa41f) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 42000 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_180611550);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 42000;
  if (*(char *)(lVar1 + 0xa41f) != '\0') {
    FUN_180054820(lVar6,0xf,0xa183bb9f75d99583);
    *(undefined *)(lVar1 + 0xa41f) = 0;
  }
  local_68 = 0x64a9785998736375;
  uStack_60 = 0x6bb77c64aa686853;
  local_58 = CONCAT44(local_58._4_4_,0xd96e624e);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db68 = lVar6;
  if ((*(uint *)(lVar1 + 0xaa60) & 1) == 0) {
    *(uint *)(lVar1 + 0xaa60) = *(uint *)(lVar1 + 0xaa60) | 1;
    *(undefined *)(lVar1 + 0x28364) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x28350 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180611520);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x28350;
  if (*(char *)(lVar1 + 0x28364) != '\0') {
    FUN_180054820(lVar6,0x14,0x1dc51937d90b0127);
    *(undefined *)(lVar1 + 0x28364) = 0;
  }
  local_68 = 0xcb8012ae2a644281;
  uStack_60 = 0xc0b611ac2c7346b7;
  local_58 = CONCAT26(local_58._6_2_,0x7fa6266e51a1);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db70 = lVar6;
  if ((*(uint *)(lVar1 + 0x1eba0) & 1) == 0) {
    *(uint *)(lVar1 + 0x1eba0) = *(uint *)(lVar1 + 0x1eba0) | 1;
    *(undefined *)(lVar1 + 0x8656) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x8640 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_1806114f0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x8640;
  if (*(char *)(lVar1 + 0x8656) != '\0') {
    FUN_180054820(lVar6,0x16,0xa5e57fc3450727d3);
    *(undefined *)(lVar1 + 0x8656) = 0;
  }
  local_68 = 0xf479d03aa93376cf;
  uStack_60 = 0xfe64c52da0067df2;
  local_58 = CONCAT62(local_58._2_6_,0x13f8);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db78 = lVar6;
  if ((*(uint *)(lVar1 + 0xebb0) & 1) == 0) {
    *(uint *)(lVar1 + 0xebb0) = *(uint *)(lVar1 + 0xebb0) | 1;
    *(undefined *)(lVar1 + 0x19442) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x19430 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_1806114c0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x19430;
  if (*(char *)(lVar1 + 0x19442) != '\0') {
    FUN_180054820(lVar6,0x12,0x9d0db35fc555139d);
    *(undefined *)(lVar1 + 0x19442) = 0;
  }
  local_68 = 0xac46a80f30c2c46f;
  uStack_60 = 0xb1609e1f31cecc50;
  local_58 = CONCAT35(local_58._5_3_,0x7b3accc84b);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db80 = lVar6;
  if ((*(uint *)(lVar1 + 0xd6ac) & 1) == 0) {
    *(uint *)(lVar1 + 0xd6ac) = *(uint *)(lVar1 + 0xd6ac) | 1;
    *(undefined *)(lVar1 + 0x1e7c5) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1e7b0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180611490);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1e7b0;
  if (*(char *)(lVar1 + 0x1e7c5) != '\0') {
    FUN_180054820(lVar6,0x15,0xc305cd7b5fafa13d);
    *(undefined *)(lVar1 + 0x1e7c5) = 0;
  }
  local_68 = 0xd6008047b2a482d3;
  uStack_60 = 0xd5318060afa694f3;
  local_58 = CONCAT44(local_58._4_4_,0xddac84e8);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db88 = lVar6;
  if ((*(uint *)(lVar1 + 0xd870) & 1) == 0) {
    *(uint *)(lVar1 + 0xd870) = *(uint *)(lVar1 + 0xd870) | 1;
    *(undefined *)(lVar1 + 0x16964) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x16950) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180611460);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x16950;
  if (*(char *)(lVar1 + 0x16964) != '\0') {
    FUN_180054820(lVar6,0x14,0xa343e533ddc9e781);
    *(undefined *)(lVar1 + 0x16964) = 0;
  }
  local_68 = 0xd8df207fd8629831;
  uStack_60 = 0xd8c8376ed0688801;
  local_58 = CONCAT35(local_58._5_3_,0xbc56a8b11);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db90 = lVar6;
  if ((*(uint *)(lVar1 + 0xcaac) & 1) == 0) {
    *(uint *)(lVar1 + 0xcaac) = *(uint *)(lVar1 + 0xcaac) | 1;
    *(undefined *)(lVar1 + 0x898d) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x8978) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180611430);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x8978;
  if (*(char *)(lVar1 + 0x898d) != '\0') {
    FUN_180054820(lVar6,0x15,0xbd9b450bb70ffd63);
    *(undefined *)(lVar1 + 0x898d) = 0;
  }
  local_68 = 0x267c57cadb2d023b;
  uStack_60 = CONCAT17(uStack_60._7_1_,0x2f56c8d12a131d);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087db98 = lVar6;
  if ((*(uint *)(lVar1 + 0x1080c) & 1) == 0) {
    *(uint *)(lVar1 + 0x1080c) = *(uint *)(lVar1 + 0x1080c) | 1;
    *(undefined *)(lVar1 + 0x2dc6f) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2dc60 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xf);
    FUN_180505120(&LAB_180611400);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2dc60;
  if (*(char *)(lVar1 + 0x2dc6f) != '\0') {
    FUN_180054820(lVar6,0xf,0x432f25afbf436769);
    *(undefined *)(lVar1 + 0x2dc6f) = 0;
  }
  local_68 = 0xc1302438f78b2e0f;
  uStack_60 = 0xb5253423f2bd2f38;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dba0 = lVar6;
  if ((*(uint *)(lVar1 + 0x12b00) & 1) == 0) {
    *(uint *)(lVar1 + 0x12b00) = *(uint *)(lVar1 + 0x12b00) | 1;
    *(undefined *)(lVar1 + 0x18ee8) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x18ed8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x10);
    FUN_180505120(&LAB_1806113d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x18ed8;
  if (*(char *)(lVar1 + 0x18ee8) != '\0') {
    FUN_180054820(lVar6,0x10,0xb55147519bfb4b5d);
    *(undefined *)(lVar1 + 0x18ee8) = 0;
  }
  local_68 = 0x1b54da3a3783241f;
  uStack_60 = 0x854cb3c2fa02528;
  local_58 = CONCAT62(local_58._2_6_,0x4128);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dba8 = lVar6;
  if ((*(uint *)(lVar1 + 0x28e80) & 1) == 0) {
    *(uint *)(lVar1 + 0x28e80) = *(uint *)(lVar1 + 0x28e80) | 1;
    *(undefined *)(lVar1 + 0x2cf4a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x2cf38) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x12);
    FUN_180505120(&LAB_1806113a0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2cf38;
  if (*(char *)(lVar1 + 0x2cf4a) != '\0') {
    FUN_180054820(lVar6,0x12,0x6f35b9535bf3414d);
    *(undefined *)(lVar1 + 0x2cf4a) = 0;
  }
  local_68 = 0x861f1f4ac54d100b;
  uStack_60 = 0x80251046ce49102d;
  local_58 = 0x8a380757c27c1736;
  uStack_50 = CONCAT62(uStack_50._2_6_,0x793c);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dbb0 = lVar6;
  if ((*(uint *)(lVar1 + 0xdf80) & 1) == 0) {
    *(uint *)(lVar1 + 0xdf80) = *(uint *)(lVar1 + 0xdf80) | 1;
    *(undefined *)(lVar1 + 0x1216a) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x12150 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180611370);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x12150;
  if (*(char *)(lVar1 + 0x1216a) != '\0') {
    FUN_180054820(lVar6,0x1a,0xe9517125a72f7959);
    *(undefined *)(lVar1 + 0x1216a) = 0;
  }
  local_68 = 0x11e3c3a2f933ac3f;
  uStack_60 = 0x2edace8afb38a418;
  local_58 = CONCAT17(local_58._7_1_,0xb3deaefc27b108);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dbb8 = lVar6;
  if ((*(uint *)(lVar1 + 0x123c0) & 1) == 0) {
    *(uint *)(lVar1 + 0x123c0) = *(uint *)(lVar1 + 0x123c0) | 1;
    *(undefined *)(lVar1 + 0x18acf) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x18ab8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x17);
    FUN_180505120(&LAB_180611340);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x18ab8;
  if (*(char *)(lVar1 + 0x18acf) != '\0') {
    FUN_180054820(lVar6,0x17,0x7db3bbcd9551c36d);
    *(undefined *)(lVar1 + 0x18acf) = 0;
  }
  local_68 = 0x5ac92f7489330c97;
  uStack_60 = 0x5bfe237a86380fb5;
  local_58 = 0x3ffe307a973e1796;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dbc0 = lVar6;
  if ((*(uint *)(lVar1 + 0xf008) & 1) == 0) {
    *(uint *)(lVar1 + 0xf008) = *(uint *)(lVar1 + 0xf008) | 1;
    *(undefined *)(lVar1 + 0x29ab8) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x29aa0) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x18);
    FUN_180505120(&LAB_180611310);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x29aa0;
  if (*(char *)(lVar1 + 0x29ab8) != '\0') {
    FUN_180054820(lVar6,0x18,0x3f9b571be55163c5);
    *(undefined *)(lVar1 + 0x29ab8) = 0;
  }
  local_68 = 0x6a12e9e443077857;
  uStack_60 = 0x7d2ee5d85d006177;
  local_58 = CONCAT44(local_58._4_4_,0x2f007064);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dbc8 = lVar6;
  if ((*(uint *)(lVar1 + 0x16d4c) & 1) == 0) {
    *(uint *)(lVar1 + 0x16d4c) = *(uint *)(lVar1 + 0x16d4c) | 1;
    *(undefined *)(lVar1 + 0xf0cc) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xf0b8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_1806112e0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xf0b8;
  if (*(char *)(lVar1 + 0xf0cc) != '\0') {
    FUN_180054820(lVar6,0x14,0xf41918b2f651705);
    *(undefined *)(lVar1 + 0xf0cc) = 0;
  }
  local_68 = 0xfd73a852292d98b3;
  uStack_60 = 0xc46ea95c21289b80;
  local_58 = 0xce64b44b3724a48f;
  uStack_50 = CONCAT71(uStack_50._1_7_,0xe1);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dbd0 = lVar6;
  if ((*(uint *)(lVar1 + 0x2b4c0) & 1) == 0) {
    *(uint *)(lVar1 + 0x2b4c0) = *(uint *)(lVar1 + 0x2b4c0) | 1;
    *(undefined *)(lVar1 + 0xfd51) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xfd38 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x19);
    FUN_180505120(&LAB_1806112b0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xfd38;
  if (*(char *)(lVar1 + 0xfd51) != '\0') {
    FUN_180054820(lVar6,0x19,0xab07dd3d4541f7e1);
    *(undefined *)(lVar1 + 0xfd51) = 0;
  }
  local_68 = 0xdddf4075b84c42c7;
  uStack_60 = 0xd6f9526bb84f6ced;
  local_58 = 0xdce45d75bc725ef6;
  uStack_50 = CONCAT62(uStack_50._2_6_,0x2df0);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dbd8 = lVar6;
  if ((*(uint *)(lVar1 + 0x1e9c8) & 1) == 0) {
    *(uint *)(lVar1 + 0x1e9c8) = *(uint *)(lVar1 + 0x1e9c8) | 1;
    *(undefined *)(lVar1 + 0x1d8f2) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1d8d8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180611280);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1d8d8;
  if (*(char *)(lVar1 + 0x1d8f2) != '\0') {
    FUN_180054820(lVar6,0x1a,0xbf8d2b07d9212d95);
    *(undefined *)(lVar1 + 0x1d8f2) = 0;
  }
  local_68 = 0x94c6c445be34b2d5;
  uStack_60 = CONCAT26(uStack_60._6_2_,0xaf52bc30abf5);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dbe0 = lVar6;
  if ((*(uint *)(lVar1 + 0x9980) & 1) == 0) {
    *(uint *)(lVar1 + 0x9980) = *(uint *)(lVar1 + 0x9980) | 1;
    *(undefined *)(lVar1 + 0x22ef6) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x22ee8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180611250);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x22ee8;
  if (*(char *)(lVar1 + 0x22ef6) != '\0') {
    FUN_180054820(lVar6,0xe,0xf195af37df59dd87);
    *(undefined *)(lVar1 + 0x22ef6) = 0;
  }
  local_68 = 0x3a9ecce03a3a2df7;
  uStack_60 = 0x3489cdf60c1037cc;
  local_58 = CONCAT53(local_58._3_5_,0x773cc6);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dbe8 = lVar6;
  if ((*(uint *)(lVar1 + 0x265b8) & 1) == 0) {
    *(uint *)(lVar1 + 0x265b8) = *(uint *)(lVar1 + 0x265b8) | 1;
    *(undefined *)(lVar1 + 0x21c8b) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x21c78 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180611220);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x21c78;
  if (*(char *)(lVar1 + 0x21c8b) != '\0') {
    FUN_180054820(lVar6,0x13,0x5dffbf935f7759a5);
    *(undefined *)(lVar1 + 0x21c8b) = 0;
  }
  local_68 = 0x7ca9fb46cad19881;
  uStack_60 = CONCAT53(uStack_60._3_5_,0xbf88b0);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dbf0 = lVar6;
  if ((*(uint *)(lVar1 + 0xa33c) & 1) == 0) {
    *(uint *)(lVar1 + 0xa33c) = *(uint *)(lVar1 + 0xa33c) | 1;
    *(undefined *)(lVar1 + 0x16233) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x16228 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xb);
    FUN_180505120(&LAB_1806111f0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x16228;
  if (*(char *)(lVar1 + 0x16233) != '\0') {
    FUN_180054820(lVar6,0xb,0x15df892399bfedd3);
    *(undefined *)(lVar1 + 0x16233) = 0;
  }
  local_68 = 0xfcf89c1a4f519089;
  uStack_60 = 0xdace851d5e4b8bb4;
  local_58 = CONCAT26(local_58._6_2_,0xf116585693a9);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dbf8 = lVar6;
  if ((*(uint *)(lVar1 + 0x14d54) & 1) == 0) {
    *(uint *)(lVar1 + 0x14d54) = *(uint *)(lVar1 + 0x14d54) | 1;
    *(undefined *)(lVar1 + 0x25bf6) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x25be0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_1806111c0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x25be0;
  if (*(char *)(lVar1 + 0x25bf6) != '\0') {
    FUN_180054820(lVar6,0x16,0xbf9df1733b3fe5db);
    *(undefined *)(lVar1 + 0x25bf6) = 0;
  }
  local_68 = 0x8a2ee8202b9bf6c7;
  uStack_60 = 0xab2ed63d2f9cf1f6;
  local_58 = CONCAT35(local_58._5_3_,0x493a96eae3);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc00 = lVar6;
  if ((*(uint *)(lVar1 + 0x22be4) & 1) == 0) {
    *(uint *)(lVar1 + 0x22be4) = *(uint *)(lVar1 + 0x22be4) | 1;
    *(undefined *)(lVar1 + 0x2350d) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x234f8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180611190);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x234f8;
  if (*(char *)(lVar1 + 0x2350d) != '\0') {
    FUN_180054820(lVar6,0x15,0xd94b85495ff58395);
    *(undefined *)(lVar1 + 0x2350d) = 0;
  }
  local_68 = 0x364a9a835463ac80;
  uStack_60 = CONCAT26(uStack_60._6_2_,0xe392526cbba1);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc08 = lVar6;
  if ((*(uint *)(lVar1 + 0x24a7c) & 1) == 0) {
    *(uint *)(lVar1 + 0x24a7c) = *(uint *)(lVar1 + 0x24a7c) | 1;
    *(undefined *)(lVar1 + 0x16266) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x16258 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180611160);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x16258;
  if (*(char *)(lVar1 + 0x16266) != '\0') {
    FUN_180054820(lVar6,0xe,0x5319e3f73105cdd3);
    *(undefined *)(lVar1 + 0x16266) = 0;
  }
  local_68 = 0x5b7ae5c558697a9e;
  uStack_60 = 0x454bf4e6547c77ac;
  local_58 = CONCAT44(local_58._4_4_,0x317e7aa4);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc10 = lVar6;
  if ((*(uint *)(lVar1 + 0x28184) & 1) == 0) {
    *(uint *)(lVar1 + 0x28184) = *(uint *)(lVar1 + 0x28184) | 1;
    *(undefined *)(lVar1 + 0x10c0c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x10bf8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180611130);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x10bf8;
  if (*(char *)(lVar1 + 0x10c0c) != '\0') {
    FUN_180054820(lVar6,0x14,0x333991b5311b19cd);
    *(undefined *)(lVar1 + 0x10c0c) = 0;
  }
  local_68 = 0x7c20b21ce0d9ef4;
  uStack_60 = 0x3e20b30f01a93c8;
  local_58 = CONCAT53(local_58._3_5_,0x7f8fc2);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc18 = lVar6;
  if ((*(uint *)(lVar1 + 0x92f0) & 1) == 0) {
    *(uint *)(lVar1 + 0x92f0) = *(uint *)(lVar1 + 0x92f0) | 1;
    *(undefined *)(lVar1 + 0x94ab) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x9498 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x13);
    FUN_180505120(&LAB_180611100);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x9498;
  if (*(char *)(lVar1 + 0x94ab) != '\0') {
    FUN_180054820(lVar6,0x13,0x6b817f51a77ffda7);
    *(undefined *)(lVar1 + 0x94ab) = 0;
  }
  local_68 = 0x1b8a5b3fdc937430;
  uStack_60 = 0x1faa5b2ee284790c;
  local_58 = 0x5ac5f23d0a96506;
  uStack_50 = CONCAT71(uStack_50._1_7_,99);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc20 = lVar6;
  if ((*(uint *)(lVar1 + 0x16db0) & 1) == 0) {
    *(uint *)(lVar1 + 0x16db0) = *(uint *)(lVar1 + 0x16db0) | 1;
    *(undefined *)(lVar1 + 0x21a31) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x21a18 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x19);
    FUN_180505120(&LAB_1806110d0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x21a18;
  if (*(char *)(lVar1 + 0x21a31) != '\0') {
    FUN_180054820(lVar6,0x19,0x77c92f4fb5e11763);
    *(undefined *)(lVar1 + 0x21a31) = 0;
  }
  local_68 = 0x4c52572d921d9ce8;
  uStack_60 = 0x5563460e8f0692d6;
  local_58 = CONCAT44(local_58._4_4_,0xfb0a9cd2);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc28 = lVar6;
  if ((*(uint *)(lVar1 + 0x2899c) & 1) == 0) {
    *(uint *)(lVar1 + 0x2899c) = *(uint *)(lVar1 + 0x2899c) | 1;
    *(undefined *)(lVar1 + 0x13e44) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x13e30 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_1806110a0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x13e30;
  if (*(char *)(lVar1 + 0x13e44) != '\0') {
    FUN_180054820(lVar6,0x14,0x2311235dfb6fffbb);
    *(undefined *)(lVar1 + 0x13e44) = 0;
  }
  local_68 = 0xf6c077c1e6e15090;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x3c5f7f647ad);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc30 = lVar6;
  if ((*(uint *)(lVar1 + 0x18ca4) & 1) == 0) {
    *(uint *)(lVar1 + 0x18ca4) = *(uint *)(lVar1 + 0x18ca4) | 1;
    *(undefined *)(lVar1 + 0x15306) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x152f8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180611070);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x152f8;
  if (*(char *)(lVar1 + 0x15306) != '\0') {
    FUN_180054820(lVar6,0xe,0x998303b18f9333c3);
    *(undefined *)(lVar1 + 0x15306) = 0;
  }
  local_68 = 0x653093cd8c3132e4;
  uStack_60 = 0x770782ee972c25de;
  local_58 = CONCAT44(local_58._4_4_,0xe52632de);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc38 = lVar6;
  if ((*(uint *)(lVar1 + 0x1ee50) & 1) == 0) {
    *(uint *)(lVar1 + 0x1ee50) = *(uint *)(lVar1 + 0x1ee50) | 1;
    *(undefined *)(lVar1 + 0x2e40c) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x2e3f8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180611040);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x2e3f8;
  if (*(char *)(lVar1 + 0x2e40c) != '\0') {
    FUN_180054820(lVar6,0x14,0x175e7bde54351b7);
    *(undefined *)(lVar1 + 0x2e40c) = 0;
  }
  local_68 = 0x458319794c6fe41c;
  uStack_60 = 0x52801f6c4974e120;
  local_58 = CONCAT26(local_58._6_2_,0x6d6c4674f13d);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc40 = lVar6;
  if ((*(uint *)(lVar1 + 0x2d548) & 1) == 0) {
    *(uint *)(lVar1 + 0x2d548) = *(uint *)(lVar1 + 0x2d548) | 1;
    *(undefined *)(lVar1 + 0x816e) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(uVar5 + lVar1 + 0x8158) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x16);
    FUN_180505120(&LAB_180611010);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x8158;
  if (*(char *)(lVar1 + 0x816e) != '\0') {
    FUN_180054820(lVar6,0x16,0x37d36d09251d874f);
    *(undefined *)(lVar1 + 0x816e) = 0;
  }
  local_68 = 0xea9359f542f1e62e;
  uStack_60 = 0xe6b54cf75ff0ec1a;
  local_58 = 0xeca85bf74ed0eb12;
  uStack_50 = CONCAT62(uStack_50._2_6_,0x8518);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc48 = lVar6;
  if ((*(uint *)(lVar1 + 0xd920) & 1) == 0) {
    *(uint *)(lVar1 + 0xd920) = *(uint *)(lVar1 + 0xd920) | 1;
    *(undefined *)(lVar1 + 0xb242) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0xb228 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180610fe0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0xb228;
  if (*(char *)(lVar1 + 0xb242) != '\0') {
    FUN_180054820(lVar6,0x1a,0x8fc12d852b83857d);
    *(undefined *)(lVar1 + 0xb242) = 0;
  }
  local_68 = 0xde284dc518d38e08;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x39d012c89b29);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc50 = lVar6;
  if ((*(uint *)(lVar1 + 0x19008) & 1) == 0) {
    *(uint *)(lVar1 + 0x19008) = *(uint *)(lVar1 + 0x19008) | 1;
    *(undefined *)(lVar1 + 0x27f9e) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x27f90 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180610fb0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x27f90;
  if (*(char *)(lVar1 + 0x27f9e) != '\0') {
    FUN_180054820(lVar6,0xe,0xbb7b39b571a1ed5b);
    *(undefined *)(lVar1 + 0x27f9e) = 0;
  }
  local_68 = 0x8888f126e469eaa4;
  uStack_60 = CONCAT62(uStack_60._2_6_,0x8f99);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc58 = lVar6;
  if ((*(uint *)(lVar1 + 0xfc6c) & 1) == 0) {
    *(uint *)(lVar1 + 0xfc6c) = *(uint *)(lVar1 + 0xfc6c) | 1;
    *(undefined *)(lVar1 + 0x207fa) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x207f0 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 10);
    FUN_180505120(&LAB_180610f80);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x207f0;
  if (*(char *)(lVar1 + 0x207fa) != '\0') {
    FUN_180054820(lVar6,10,0xe7e1854581058ff7);
    *(undefined *)(lVar1 + 0x207fa) = 0;
  }
  local_68 = 0xd0b4d34ade2b6078;
  uStack_60 = 0xd8b4cb41dc2e4d45;
  local_58 = 0xdabac647da0a7143;
  uStack_50 = CONCAT62(uStack_50._2_6_,0x559);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc60 = lVar6;
  if ((*(uint *)(lVar1 + 0xcc78) & 1) == 0) {
    *(uint *)(lVar1 + 0xcc78) = *(uint *)(lVar1 + 0xcc78) | 1;
    *(undefined *)(lVar1 + 0x19222) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x19208 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x1a);
    FUN_180505120(&LAB_180610f50);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x19208;
  if (*(char *)(lVar1 + 0x19222) != '\0') {
    FUN_180054820(lVar6,0x1a,0xbfdda729bb47052b);
    *(undefined *)(lVar1 + 0x19222) = 0;
  }
  local_68 = 0x393c71aed6113ebe;
  uStack_60 = 0x31304ea1d00a2f8c;
  local_58 = CONCAT35(local_58._5_3_,0xcfda00329b);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc68 = lVar6;
  if ((*(uint *)(lVar1 + 0xffdc) & 1) == 0) {
    *(uint *)(lVar1 + 0xffdc) = *(uint *)(lVar1 + 0xffdc) | 1;
    *(undefined *)(lVar1 + 0x18685) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x18670 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x15);
    FUN_180505120(&LAB_180610f20);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x18670;
  if (*(char *)(lVar1 + 0x18685) != '\0') {
    FUN_180054820(lVar6,0x15,0x43551dcfbf635bed);
    *(undefined *)(lVar1 + 0x18685) = 0;
  }
  local_68 = 0xaa7231c6d1976ae6;
  uStack_60 = 0xbf5326f0d39566c7;
  local_58 = CONCAT44(local_58._4_4_,0xa7806cdc);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc70 = lVar6;
  if ((*(uint *)(lVar1 + 0x23c74) & 1) == 0) {
    *(uint *)(lVar1 + 0x23c74) = *(uint *)(lVar1 + 0x23c74) | 1;
    *(undefined *)(lVar1 + 0x145cc) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x145b8 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0x14);
    FUN_180505120(&LAB_180610ef0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x145b8;
  if (*(char *)(lVar1 + 0x145cc) != '\0') {
    FUN_180054820(lVar6,0x14,0xc92143a3a7e50fb5);
    *(undefined *)(lVar1 + 0x145cc) = 0;
  }
  local_68 = 0xdd32eb7aededb21c;
  uStack_60 = CONCAT26(uStack_60._6_2_,0x997afcfea520);
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc78 = lVar6;
  if ((*(uint *)(lVar1 + 0x257d0) & 1) == 0) {
    *(uint *)(lVar1 + 0x257d0) = *(uint *)(lVar1 + 0x257d0) | 1;
    *(undefined *)(lVar1 + 0x1d71e) = 1;
    uVar5 = uVar7;
    do {
      *(undefined *)(lVar1 + 0x1d710 + uVar5) = *(undefined *)((longlong)&local_68 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 0xe);
    FUN_180505120(&LAB_180610ec0);
  }
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  lVar6 = lVar1 + 0x1d710;
  if (*(char *)(lVar1 + 0x1d71e) != '\0') {
    FUN_180054820(lVar6,0xe,0xa961991f9b9fd74f);
    *(undefined *)(lVar1 + 0x1d71e) = 0;
  }
  local_40 = 0x5f74a420ef8b0e84;
  uStack_38 = 0x7d78ab20fb9018be;
  local_30 = 0xae;
  local_2f = 0x38;
  local_2e = 0x9c;
  local_2d = 0xeb;
  local_2c = 0x3f;
  local_2b = 0xae;
  local_2a = 0x72;
  local_29 = 0x6c;
  local_28 = 0xd7;
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8);
  _DAT_18087dc80 = lVar6;
  if ((*(uint *)(lVar1 + 0x267b8) & 1) == 0) {
    *(uint *)(lVar1 + 0x267b8) = *(uint *)(lVar1 + 0x267b8) | 1;
    FUN_1801a5860(lVar1 + 0x24c20,&local_40);
    FUN_180505120(&LAB_180610e90);
  }
  _DAT_18087dc88 =
       FUN_1801a5830(*(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)uVar2 * 8) +
                     0x24c20);
  uVar3 = FUN_18017b3f0();
  _DAT_18087dc90 = FUN_1801a5800(uVar3);
  uVar3 = FUN_18017b480();
  _DAT_18087dc98 = FUN_1801a57d0(uVar3);
  uVar3 = FUN_18017b4f0();
  _DAT_18087dca0 = FUN_1801a57a0(uVar3);
  uVar3 = FUN_18017b580();
  _DAT_18087dca8 = FUN_1801a5770(uVar3);
  uVar3 = FUN_18017b610();
  _DAT_18087dcb0 = FUN_1801a5740(uVar3);
  uVar3 = FUN_18017b6a0();
  _DAT_18087dcb8 = FUN_1801a5710(uVar3);
  uVar3 = FUN_18017b750();
  _DAT_18087dcc0 = FUN_1801a56e0(uVar3);
  uVar3 = FUN_18017b7c0();
  _DAT_18087dcc8 = FUN_1801a56b0(uVar3);
  uVar3 = FUN_18017b880();
  _DAT_18087dcd0 = FUN_1801a5680(uVar3);
  uVar3 = FUN_18017b8f0();
  _DAT_18087dcd8 = FUN_1801a5650(uVar3);
  uVar3 = FUN_18017b960();
  _DAT_18087dce0 = FUN_1801a5620(uVar3);
  uVar3 = FUN_18017ba20();
  _DAT_18087dce8 = FUN_1801a55f0(uVar3);
  uVar3 = FUN_18017ba90();
  _DAT_18087dcf0 = FUN_1801a55c0(uVar3);
  uVar3 = FUN_18017bb10();
  _DAT_18087dcf8 = FUN_1801a5590(uVar3);
  uVar3 = FUN_18017bb80();
  _DAT_18087dd00 = FUN_1801a5560(uVar3);
  uVar3 = FUN_18017bc00();
  _DAT_18087dd08 = FUN_1801a5530(uVar3);
  uVar3 = FUN_18017bc60();
  _DAT_18087dd10 = FUN_1801a5500(uVar3);
  uVar3 = FUN_18017bcd0();
  _DAT_18087dd18 = FUN_1801a54d0(uVar3);
  uVar3 = FUN_18017bd40();
  _DAT_18087dd20 = FUN_1801a54a0(uVar3);
  _DAT_18087dd28 = FUN_18017bdf0();
  uVar5 = uVar7;
  if (*(char *)(_DAT_18087dd28 + 6) != '\0') {
    do {
      *(byte *)(uVar5 + _DAT_18087dd28) =
           (byte)(0x21d7d3d7c5d99515 >> (((byte)uVar5 & 7) << 3)) ^
           *(byte *)(uVar5 + _DAT_18087dd28);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 6);
    *(undefined *)(_DAT_18087dd28 + 6) = 0;
  }
  uVar3 = FUN_18017be50();
  _DAT_18087dd30 = FUN_1801a5470(uVar3);
  uVar3 = FUN_18017bee0();
  _DAT_18087dd38 = FUN_1801a5440(uVar3);
  uVar3 = FUN_18017bf40();
  _DAT_18087dd40 = FUN_1801a5410(uVar3);
  uVar3 = FUN_18017bfe0();
  _DAT_18087dd48 = FUN_1801a53e0(uVar3);
  uVar3 = FUN_18017c070();
  _DAT_18087dd50 = FUN_1801a53b0(uVar3);
  uVar3 = FUN_18017c110();
  _DAT_18087dd58 = FUN_1801a5380(uVar3);
  uVar3 = FUN_18017c170();
  _DAT_18087dd60 = FUN_1801a5350(uVar3);
  uVar3 = FUN_18017c230();
  _DAT_18087dd68 = FUN_1801a5320(uVar3);
  uVar3 = FUN_18017c2f0();
  _DAT_18087dd70 = FUN_1801a52f0(uVar3);
  uVar3 = FUN_18017c390();
  _DAT_18087dd78 = FUN_1801a52c0(uVar3);
  uVar3 = FUN_18017c470();
  _DAT_18087dd80 = FUN_1801a5290(uVar3);
  uVar3 = FUN_18017c4f0();
  _DAT_18087dd88 = FUN_1801a5260(uVar3);
  uVar3 = FUN_18017c560();
  _DAT_18087dd90 = FUN_1801a5230(uVar3);
  uVar3 = FUN_18017c5f0();
  _DAT_18087dd98 = FUN_1801a5200(uVar3);
  uVar3 = FUN_18017c680();
  _DAT_18087dda0 = FUN_1801a51d0(uVar3);
  uVar3 = FUN_18017c720();
  _DAT_18087dda8 = FUN_1801a51a0(uVar3);
  uVar3 = FUN_18017c790();
  _DAT_18087ddb0 = FUN_1801a5170(uVar3);
  uVar3 = FUN_18017c830();
  _DAT_18087ddb8 = FUN_1801a5140(uVar3);
  uVar3 = FUN_18017c8a0();
  _DAT_18087ddc0 = FUN_1801a5110(uVar3);
  uVar3 = FUN_18017c910();
  _DAT_18087ddc8 = FUN_1801a50e0(uVar3);
  uVar3 = FUN_18017c9c0();
  _DAT_18087ddd0 = FUN_1801a50b0(uVar3);
  _DAT_18087ddd8 = FUN_18017ca50();
  uVar5 = uVar7;
  if (*(char *)(_DAT_18087ddd8 + 6) != '\0') {
    do {
      *(byte *)(uVar5 + _DAT_18087ddd8) =
           (byte)(0x2b079dcf130bc103 >> (((byte)uVar5 & 7) << 3)) ^
           *(byte *)(uVar5 + _DAT_18087ddd8);
      uVar5 = uVar5 + 1;
    } while (uVar5 < 6);
    *(undefined *)(_DAT_18087ddd8 + 6) = 0;
  }
  uVar3 = FUN_18017cab0();
  _DAT_18087dde0 = FUN_1801a5080(uVar3);
  uVar3 = FUN_18017cb30();
  _DAT_18087dde8 = FUN_1801a5050(uVar3);
  uVar3 = FUN_18017cbb0();
  _DAT_18087ddf0 = FUN_1801a5020(uVar3);
  uVar3 = FUN_18017cc70();
  _DAT_18087ddf8 = FUN_1801a4ff0(uVar3);
  uVar3 = FUN_18017cd20();
  _DAT_18087de00 = FUN_1801a4fc0(uVar3);
  uVar3 = FUN_18017cd90();
  _DAT_18087de08 = FUN_1801a4f90(uVar3);
  uVar3 = FUN_18017ce00();
  _DAT_18087de10 = FUN_1801a4f60(uVar3);
  uVar3 = FUN_18017ce80();
  _DAT_18087de18 = FUN_1801a4f30(uVar3);
  uVar3 = FUN_18017cef0();
  _DAT_18087de20 = FUN_1801a4f00(uVar3);
  uVar3 = FUN_18017cfa0();
  _DAT_18087de28 = FUN_1801a4ed0(uVar3);
  uVar3 = FUN_18017d050();
  _DAT_18087de30 = FUN_1801a4ea0(uVar3);
  uVar3 = FUN_18017d0c0();
  _DAT_18087de38 = FUN_1801a4e70(uVar3);
  uVar3 = FUN_18017d170();
  _DAT_18087de40 = FUN_1801a4e40(uVar3);
  uVar3 = FUN_18017d200();
  _DAT_18087de48 = FUN_1801a4e10(uVar3);
  uVar3 = FUN_18017d290();
  _DAT_18087de50 = FUN_1801a4de0(uVar3);
  uVar3 = FUN_18017d300();
  _DAT_18087de58 = FUN_1801a4db0(uVar3);
  uVar3 = FUN_18017d380();
  _DAT_18087de60 = FUN_1801a4d80(uVar3);
  uVar3 = FUN_18017d3f0();
  _DAT_18087de68 = FUN_1801a4d50(uVar3);
  uVar3 = FUN_18017d470();
  _DAT_18087de70 = FUN_1801a4d20(uVar3);
  uVar3 = FUN_18017d510();
  _DAT_18087de78 = FUN_1801a4cf0(uVar3);
  uVar3 = FUN_18017d5c0();
  _DAT_18087de80 = FUN_1801a4cc0(uVar3);
  uVar3 = FUN_18017d670();
  _DAT_18087de88 = FUN_1801a4c90(uVar3);
  uVar3 = FUN_18017d710();
  _DAT_18087de90 = FUN_1801a4c60(uVar3);
  uVar3 = FUN_18017d790();
  _DAT_18087de98 = FUN_1801a4c30(uVar3);
  uVar3 = FUN_18017d810();
  _DAT_18087dea0 = FUN_1801a4c00(uVar3);
  uVar3 = FUN_18017d880();
  _DAT_18087dea8 = FUN_1801a4bd0(uVar3);
  uVar3 = FUN_18017d920();
  _DAT_18087deb0 = FUN_1801a4ba0(uVar3);
  uVar3 = FUN_18017d980();
  _DAT_18087deb8 = FUN_1801a4b70(uVar3);
  uVar3 = FUN_18017da00();
  _DAT_18087dec0 = FUN_1801a4b40(uVar3);
  uVar3 = FUN_18017dab0();
  _DAT_18087dec8 = FUN_1801a4b10(uVar3);
  uVar3 = FUN_18017db40();
  _DAT_18087ded0 = FUN_1801a4ae0(uVar3);
  uVar3 = FUN_18017dc00();
  _DAT_18087ded8 = FUN_1801a4ab0(uVar3);
  uVar3 = FUN_18017dc70();
  _DAT_18087dee0 = FUN_1801a4a80(uVar3);
  uVar3 = FUN_18017dd00();
  _DAT_18087dee8 = FUN_1801a4a50(uVar3);
  uVar3 = FUN_18017dd70();
  _DAT_18087def0 = FUN_1801a4a20(uVar3);
  _DAT_18087def8 = FUN_18017de30();
  if (*(char *)(_DAT_18087def8 + 6) != '\0') {
    do {
      *(byte *)(uVar7 + _DAT_18087def8) =
           (byte)(0xcf5db91f51ebd799 >> (((byte)uVar7 & 7) << 3)) ^
           *(byte *)(uVar7 + _DAT_18087def8);
      uVar7 = uVar7 + 1;
    } while (uVar7 < 6);
    *(undefined *)(_DAT_18087def8 + 6) = 0;
  }
  uVar3 = FUN_18017de90();
  _DAT_18087df00 = FUN_1801a49f0(uVar3);
  uVar3 = FUN_18017df40();
  _DAT_18087df08 = FUN_1801a49c0(uVar3);
  uVar3 = FUN_18017dfd0();
  _DAT_18087df10 = FUN_1801a4990(uVar3);
  uVar3 = FUN_18017e050();
  _DAT_18087df18 = FUN_1801a4960(uVar3);
  uVar3 = FUN_18017e0d0();
  _DAT_18087df20 = FUN_1801a4930(uVar3);
  uVar3 = FUN_18017e140();
  _DAT_18087df28 = FUN_1801a4900(uVar3);
  uVar3 = FUN_18017e1a0();
  _DAT_18087df30 = FUN_1801a48d0(uVar3);
  return;
}



/* ==================================================================== */
/* 180034da0 / FUN_180034da0 */
/* RETRY FAILED: Exception while decompiling 180034da0: process: timeout
 */

/* ==================================================================== */
/* 180040d60 / FUN_180040d60 */
/* RETRY FAILED: Exception while decompiling 180040d60: process: timeout
 */

/* ==================================================================== */
/* 1800d2200 / FUN_1800d2200 */

/* WARNING: Function: __chkstk replaced with injection: alloca_probe */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined4 * FUN_1800d2200(void)

{
  void *pvVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  byte *pbVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  ulonglong uVar8;
  ushort *puVar9;
  longlong lVar10;
  undefined *puVar11;
  undefined auVar12 [16];
  undefined auVar13 [16];
  undefined4 local_res10 [2];
  undefined4 local_res18 [2];
  undefined4 local_res20 [2];
  undefined *local_28e8;
  undefined8 local_28e0;
  undefined2 local_28d8;
  undefined2 uStack_28d6;
  undefined2 uStack_28d4;
  undefined2 uStack_28d2;
  undefined4 local_28d0;
  undefined2 local_28cc;
  undefined2 local_28c8;
  undefined2 uStack_28c6;
  undefined2 uStack_28c4;
  undefined2 uStack_28c2;
  undefined4 local_28b8;
  undefined4 local_28b4;
  undefined4 local_28b0;
  undefined4 local_28ac;
  undefined4 local_28a8;
  undefined4 local_28a4;
  undefined4 local_28a0;
  undefined4 local_289c;
  undefined4 local_2898 [2];
  undefined local_2890 [16];
  undefined local_2880 [16];
  undefined local_2870 [16];
  undefined local_2860 [16];
  undefined local_2850 [16];
  undefined local_2840 [16];
  undefined local_2830 [16];
  undefined local_2820 [16];
  undefined local_2810 [16];
  undefined local_2800 [16];
  undefined local_27f0 [16];
  undefined local_27e0 [16];
  undefined local_27d0 [16];
  undefined local_27c0 [16];
  undefined local_27b0 [16];
  undefined local_27a0 [16];
  undefined local_2790 [16];
  undefined local_2780 [16];
  undefined local_2770 [16];
  undefined local_2760 [16];
  undefined local_2750 [16];
  undefined local_2740 [16];
  undefined local_2730 [16];
  undefined local_2720 [16];
  undefined local_2710 [16];
  undefined local_2700 [16];
  undefined local_26f0 [16];
  undefined local_26e0 [16];
  undefined local_26d0 [16];
  undefined local_26c0 [16];
  undefined local_26b0 [16];
  undefined local_26a0 [16];
  undefined local_2690 [16];
  undefined local_2680 [16];
  undefined local_2668 [16];
  undefined local_2658 [16];
  undefined local_2648 [16];
  undefined local_2638 [16];
  undefined local_2628 [16];
  undefined local_2618 [16];
  undefined local_2608 [16];
  undefined local_25f8 [16];
  undefined local_25e8 [32];
  undefined local_25c8 [32];
  undefined local_25a8 [32];
  undefined local_2588 [32];
  undefined local_2568 [32];
  undefined local_2548 [16];
  undefined local_2538 [16];
  undefined local_2528 [16];
  undefined local_2518 [16];
  undefined local_2508 [16];
  undefined local_24f8 [16];
  undefined local_24e8 [16];
  undefined local_24d8 [16];
  undefined local_24c8 [16];
  undefined local_24b8 [16];
  undefined local_24a8 [16];
  undefined local_2498 [16];
  undefined local_2488 [16];
  undefined local_2478 [16];
  undefined local_2468 [16];
  undefined local_2458 [16];
  undefined local_2448 [16];
  undefined local_2438 [16];
  undefined local_2428 [16];
  undefined local_2418 [16];
  undefined local_2408 [16];
  undefined local_23f8 [16];
  undefined local_23e8 [16];
  undefined local_23d8 [16];
  undefined local_23c8 [16];
  undefined local_23b8 [16];
  undefined local_23a8 [16];
  undefined local_2398 [16];
  undefined local_2388 [16];
  undefined local_2378 [16];
  undefined local_2368 [16];
  undefined local_2358 [16];
  undefined local_2348 [16];
  undefined local_2338 [16];
  undefined local_2328 [16];
  undefined local_2318 [16];
  undefined local_2308 [16];
  undefined local_22f8 [16];
  undefined local_22e8 [16];
  undefined local_22d8 [16];
  undefined local_22c8 [16];
  undefined local_22b8 [16];
  undefined local_22a8 [16];
  undefined local_2298 [16];
  undefined local_2288 [16];
  undefined local_2278 [16];
  undefined local_2268 [16];
  undefined local_2258 [16];
  undefined local_2248 [16];
  undefined local_2238 [16];
  undefined local_2228 [16];
  undefined local_2218 [16];
  undefined local_2208 [16];
  undefined local_21f8 [16];
  undefined local_21e8 [16];
  undefined local_21d8 [16];
  undefined local_21c8 [16];
  undefined local_21b8 [16];
  undefined local_21a8 [16];
  undefined local_2198 [16];
  undefined local_2188 [16];
  undefined local_2178 [16];
  undefined local_2168 [16];
  undefined local_2158 [16];
  undefined local_2148 [16];
  undefined local_2138 [16];
  undefined local_2128 [16];
  undefined local_2118 [16];
  undefined local_2108 [16];
  undefined local_20f8 [16];
  undefined local_20e8 [16];
  undefined local_20d8 [16];
  undefined local_20c8 [16];
  undefined local_20b8 [16];
  undefined local_20a8 [16];
  undefined local_2098 [16];
  undefined local_2088 [16];
  undefined local_2078 [16];
  undefined local_2068 [16];
  undefined local_2058 [16];
  undefined local_2048 [16];
  undefined local_2038 [16];
  undefined local_2028 [16];
  undefined local_2018 [16];
  undefined local_2008 [16];
  undefined local_1ff8 [16];
  undefined local_1fe8 [16];
  undefined local_1fd8 [16];
  undefined local_1fc8 [16];
  undefined local_1fb8 [16];
  undefined local_1fa8 [16];
  undefined local_1f98 [16];
  undefined local_1f88 [16];
  undefined local_1f78 [16];
  undefined local_1f68 [16];
  undefined local_1f58 [16];
  undefined local_1f48 [16];
  undefined local_1f38 [16];
  undefined local_1f28 [16];
  undefined local_1f18 [16];
  undefined local_1f08 [16];
  undefined local_1ef8 [16];
  undefined local_1ee8 [16];
  undefined local_1ed8 [16];
  undefined local_1ec8 [16];
  undefined local_1eb8 [16];
  undefined local_1ea8 [16];
  undefined local_1e98 [16];
  undefined local_1e88 [16];
  undefined local_1e78 [16];
  undefined local_1e68 [16];
  undefined local_1e58 [16];
  undefined local_1e48 [16];
  undefined local_1e38 [16];
  undefined local_1e28 [16];
  undefined local_1e18 [16];
  undefined local_1e08 [16];
  undefined local_1df8 [16];
  undefined local_1de8 [16];
  undefined local_1dd8 [16];
  undefined local_1dc8 [16];
  undefined local_1db8 [16];
  undefined local_1da8 [16];
  undefined local_1d98 [16];
  undefined local_1d88 [16];
  undefined local_1d78 [16];
  undefined local_1d68 [16];
  undefined local_1d58 [16];
  undefined local_1d48 [16];
  undefined local_1d38 [16];
  undefined local_1d28 [16];
  undefined local_1d18 [16];
  undefined local_1d08 [16];
  undefined local_1cf8 [16];
  undefined local_1ce8 [16];
  undefined local_1cd8 [16];
  undefined local_1cc8 [16];
  undefined local_1cb8 [16];
  undefined local_1ca8 [32];
  undefined local_1c88 [32];
  undefined local_1c68 [32];
  undefined local_1c48 [32];
  undefined local_1c28 [32];
  undefined local_1c08 [32];
  undefined local_1be8 [32];
  undefined local_1bc8 [32];
  undefined local_1ba8 [64];
  undefined local_1b68 [64];
  undefined local_1b28 [64];
  undefined local_1ae8 [64];
  undefined local_1aa8 [64];
  undefined local_1a68 [64];
  undefined local_1a28 [64];
  undefined local_19e8 [64];
  undefined local_19a8 [64];
  undefined local_1968 [64];
  undefined local_1928 [64];
  undefined local_18e8 [64];
  undefined local_18a8 [32];
  undefined local_1888 [32];
  undefined local_1868 [32];
  undefined local_1848 [32];
  undefined local_1828 [32];
  undefined local_1808 [32];
  undefined local_17e8 [32];
  undefined local_17c8 [32];
  undefined local_17a8 [32];
  undefined local_1788 [32];
  undefined local_1768 [32];
  undefined local_1748 [32];
  undefined local_1728 [32];
  undefined local_1708 [32];
  undefined local_16e8 [32];
  undefined local_16c8 [32];
  undefined local_16a8 [32];
  undefined local_1688 [32];
  undefined local_1668 [32];
  undefined local_1648 [32];
  undefined local_1628 [32];
  undefined local_1608 [32];
  undefined local_15e8 [32];
  undefined local_15c8 [64];
  undefined local_1588 [64];
  undefined local_1548 [64];
  undefined local_1508 [64];
  undefined local_14c8 [64];
  undefined local_1488 [64];
  undefined local_1448 [64];
  undefined local_1408 [64];
  undefined local_13c8 [64];
  undefined local_1388 [64];
  undefined local_1348 [64];
  undefined local_1308 [64];
  undefined local_12c8 [64];
  undefined local_1288 [64];
  undefined local_1248 [32];
  undefined local_1228 [32];
  undefined local_1208 [32];
  undefined local_11e8 [32];
  undefined local_11c8 [32];
  undefined local_11a8 [32];
  undefined local_1188 [32];
  undefined local_1168 [32];
  undefined local_1148 [32];
  undefined local_1128 [32];
  undefined local_1108 [32];
  undefined local_10e8 [32];
  undefined local_10c8 [32];
  undefined local_10a8 [32];
  undefined local_1088 [32];
  undefined local_1068 [32];
  undefined local_1048 [32];
  undefined local_1028 [32];
  undefined local_1008 [32];
  undefined local_fe8 [32];
  undefined local_fc8 [32];
  undefined local_fa8 [32];
  undefined local_f88 [32];
  undefined local_f68 [32];
  undefined local_f48 [32];
  undefined local_f28 [32];
  undefined local_f08 [32];
  undefined local_ee8 [32];
  undefined local_ec8 [32];
  undefined local_ea8 [32];
  undefined local_e88 [32];
  undefined local_e68 [32];
  undefined local_e48 [32];
  undefined local_e28 [32];
  undefined local_e08 [32];
  undefined local_de8 [32];
  undefined local_dc8 [32];
  undefined local_da8 [32];
  undefined local_d88 [32];
  undefined local_d68 [32];
  undefined local_d48 [32];
  undefined local_d28 [32];
  undefined local_d08 [32];
  undefined local_ce8 [32];
  undefined local_cc8 [32];
  undefined local_ca8 [32];
  undefined local_c88 [32];
  undefined local_c68 [32];
  undefined local_c48 [32];
  undefined local_c28 [32];
  undefined local_c08 [32];
  undefined local_be8 [32];
  undefined local_bc8 [32];
  undefined local_ba8 [32];
  undefined local_b88 [32];
  undefined local_b68 [32];
  undefined local_b48 [32];
  undefined local_b28 [32];
  undefined local_b08 [32];
  undefined local_ae8 [32];
  undefined local_ac8 [32];
  undefined local_aa8 [32];
  undefined local_a88 [32];
  undefined local_a68 [32];
  undefined local_a48 [32];
  undefined local_a28 [32];
  undefined local_a08 [32];
  undefined local_9e8 [96];
  undefined local_988 [96];
  undefined local_928 [96];
  undefined local_8c8 [96];
  undefined local_868 [96];
  undefined local_808 [96];
  undefined local_7a8 [96];
  undefined local_748 [96];
  undefined local_6e8 [96];
  undefined local_688 [96];
  undefined local_628 [96];
  undefined local_5c8 [96];
  undefined local_568 [96];
  undefined local_508 [96];
  undefined local_4a8 [96];
  undefined local_448 [96];
  undefined local_3e8 [96];
  undefined local_388 [96];
  undefined local_328 [96];
  undefined local_2c8 [96];
  undefined local_268 [96];
  undefined local_208 [96];
  undefined local_1a8 [96];
  undefined local_148 [96];
  undefined local_e8 [96];
  undefined local_88 [88];
  undefined8 uStack_30;
  
  pvVar1 = ThreadLocalStoragePointer;
  uStack_30 = 0x1800d2219;
  uVar5 = (ulonglong)_tls_index;
  if ((*(int *)(*(longlong *)((longlong)ThreadLocalStoragePointer + uVar5 * 8) + 0x130) <
       DAT_18088a1f8) && (FUN_1805055cc(&DAT_18088a1f8), DAT_18088a1f8 == -1)) {
    _DAT_18088a200 = ZEXT816(0);
    lVar6 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    _DAT_18088a210 = _DAT_18088a200;
    _DAT_18088a220 = _DAT_18088a200;
    _DAT_18088a230 = _DAT_18088a200;
    if ((*(uint *)(lVar6 + 0x6e0c) & 1) == 0) {
      *(uint *)(lVar6 + 0x6e0c) = *(uint *)(lVar6 + 0x6e0c) | 1;
      *(undefined2 *)(lVar6 + 0x6d99) = 0x1f1;
      *(undefined4 *)(lVar6 + 0x6d90) = 0x96819091;
      *(undefined4 *)(lVar6 + 0x6d94) = 0xf445f452;
      *(undefined *)(lVar6 + 0x6d98) = 0xb9;
      FUN_180505120(&LAB_1805d51e0);
    }
    lVar6 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar10 = lVar6 + 0x6d90;
    if (*(char *)(lVar6 + 0x6d9a) != '\0') {
      FUN_180054820(lVar10,10,0x91219b1ff7f5f1d5);
      *(undefined *)(lVar6 + 0x6d9a) = 0;
    }
    local_2690 = ZEXT816(0);
    local_2680 = ZEXT816(0);
    lVar6 = -1;
    lVar7 = -1;
    do {
      lVar7 = lVar7 + 1;
    } while (*(char *)(lVar10 + lVar7) != '\0');
    FUN_180059160(local_2690,lVar10);
    local_28d8 = 0xbf62;
    uStack_28d6 = 0x402d;
    uStack_28d4 = 0x7337;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x77a4) & 1) == 0) {
      *(uint *)(lVar10 + 0x77a4) = *(uint *)(lVar10 + 0x77a4) | 1;
      *(undefined *)(lVar10 + 0x719e) = 1;
      *(undefined8 *)(lVar10 + 0x7188) = 0x1310164b2ca342;
      *(undefined8 *)(lVar10 + 0x7190) = 0x2312072a4d3abd68;
      *(undefined4 *)(lVar10 + 0x7198) = 0x402dbf62;
      *(undefined2 *)(lVar10 + 0x719c) = 0x7337;
      FUN_180505120(&LAB_1805d51b0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7188;
    if (*(char *)(lVar10 + 0x719e) != '\0') {
      FUN_180054820(lVar7,0x16,0x656173452549d30d);
      *(undefined *)(lVar10 + 0x719e) = 0;
    }
    local_2448 = ZEXT816(0);
    local_2438 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2448,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x723c) & 1) == 0) {
      *(uint *)(lVar10 + 0x723c) = *(uint *)(lVar10 + 0x723c) | 1;
      *(undefined2 *)(lVar10 + 0x6710) = 0x1c5;
      *(undefined8 *)(lVar10 + 0x6700) = 0x8aa3d6d7cfb0038a;
      *(undefined8 *)(lVar10 + 0x6708) = 0x9da2dbedce9300aa;
      FUN_180505120(&LAB_1805d5180);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6700;
    if (*(char *)(lVar10 + 0x6711) != '\0') {
      FUN_180054820(lVar7,0x11,0xefc7bf81a1d573c5);
      *(undefined *)(lVar10 + 0x6711) = 0;
    }
    local_2428 = ZEXT816(0);
    local_2418 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2428,lVar7);
    local_28e8 = (undefined *)0xfa9244752bccc17a;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0x595c21c5de73);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6614) & 1) == 0) {
      *(uint *)(lVar10 + 0x6614) = *(uint *)(lVar10 + 0x6614) | 1;
      *(undefined2 *)(lVar10 + 0x650e) = 0x1f5;
      *(undefined8 *)(lVar10 + 0x6500) = 0xfa9244752bccc17a;
      *(undefined4 *)(lVar10 + 0x6508) = 0x21c5de73;
      *(undefined2 *)(lVar10 + 0x650c) = 0x595c;
      FUN_180505120(&LAB_1805d5150);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6500;
    if (*(char *)(lVar10 + 0x650f) != '\0') {
      FUN_180054820(lVar7,0xf,0x89f52b3945a9b135);
      *(undefined *)(lVar10 + 0x650f) = 0;
    }
    local_2408 = ZEXT816(0);
    local_23f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2408,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x64c4) & 1) == 0) {
      *(uint *)(lVar10 + 0x64c4) = *(uint *)(lVar10 + 0x64c4) | 1;
      *(undefined2 *)(lVar10 + 0x6e94) = 0x127;
      *(undefined4 *)(lVar10 + 0x6e90) = 0xbd5c5e09;
      FUN_180505120(&LAB_1805d5120);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    pbVar4 = (byte *)(lVar10 + 0x6e90);
    if (*(char *)(lVar10 + 0x6e95) != '\0') {
      *pbVar4 = *pbVar4 ^ 0x45;
      *(byte *)(lVar10 + 0x6e91) = *(byte *)(lVar10 + 0x6e91) ^ 0x31;
      *(byte *)(lVar10 + 0x6e92) = *(byte *)(lVar10 + 0x6e92) ^ 0x3d;
      *(byte *)(lVar10 + 0x6e93) = *(byte *)(lVar10 + 0x6e93) ^ 0xd9;
      *(byte *)(lVar10 + 0x6e94) = *(byte *)(lVar10 + 0x6e94) ^ 0x27;
      *(undefined *)(lVar10 + 0x6e95) = 0;
    }
    local_23e8 = ZEXT816(0);
    local_23d8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (pbVar4[lVar10] != 0);
    FUN_180059160(local_23e8);
    local_res10[0] = 0;
    FUN_1800ddc70(local_18e8,local_res10);
    puVar11 = local_2448;
    do {
      FUN_1800ddd60(local_18e8,&local_28e8,puVar11);
      puVar11 = puVar11 + 0x20;
    } while (puVar11 != local_23c8);
    FUN_1800dc3f0(local_9e8,local_2690,local_18e8);
    local_28d8 = 0xec26;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6784) & 1) == 0) {
      *(uint *)(lVar10 + 0x6784) = *(uint *)(lVar10 + 0x6784) | 1;
      *(undefined2 *)(lVar10 + 0x65ca) = 0x1c7;
      *(undefined8 *)(lVar10 + 0x65b8) = 0x33193d16b8b5e808;
      *(undefined8 *)(lVar10 + 0x65c0) = 0x361f3b1680a2ea24;
      *(undefined2 *)(lVar10 + 0x65c8) = 0xec26;
      FUN_180505120(&LAB_1805d50f0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x65b8;
    if (*(char *)(lVar10 + 0x65cb) != '\0') {
      FUN_180054820(lVar7,0x13,0x5f694973d3c78945);
      *(undefined *)(lVar10 + 0x65cb) = 0;
    }
    local_26b0 = ZEXT816(0);
    local_26a0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_26b0,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x66f8) & 1) == 0) {
      *(uint *)(lVar10 + 0x66f8) = *(uint *)(lVar10 + 0x66f8) | 1;
      *(undefined *)(lVar10 + 0x7000) = 1;
      *(undefined8 *)(lVar10 + 0x6ff0) = 0x9352f9064d879e70;
      *(undefined8 *)(lVar10 + 0x6ff8) = 0xeb42f8077e9f9a75;
      FUN_180505120(&LAB_1805d50c0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6ff0;
    if (*(char *)(lVar10 + 0x7000) != '\0') {
      FUN_180054820(lVar7,0x10,0xeb279b691ff3fb37);
      *(undefined *)(lVar10 + 0x7000) = 0;
    }
    local_1fc8 = ZEXT816(0);
    local_1fb8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1fc8,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x64fc) & 1) == 0) {
      *(uint *)(lVar10 + 0x64fc) = *(uint *)(lVar10 + 0x64fc) | 1;
      *(undefined *)(lVar10 + 0x6218) = 1;
      *(undefined8 *)(lVar10 + 0x6208) = 0xa53e970805157065;
      *(undefined8 *)(lVar10 + 0x6210) = 0xf53696060b046740;
      FUN_180505120(&LAB_1805d5090);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6208;
    if (*(char *)(lVar10 + 0x6218) != '\0') {
      FUN_180054820(lVar7,0x10,0xf553e56763671535);
      *(undefined *)(lVar10 + 0x6218) = 0;
    }
    local_1fa8 = ZEXT816(0);
    local_1f98 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1fa8,lVar7);
    local_28d8 = 0x53ab;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7410) & 1) == 0) {
      *(uint *)(lVar10 + 0x7410) = *(uint *)(lVar10 + 0x7410) | 1;
      *(undefined *)(lVar10 + 0x6eea) = 1;
      *(undefined8 *)(lVar10 + 0x6ed8) = 0xafaee5e4affd36c9;
      *(undefined8 *)(lVar10 + 0x6ee0) = 0xa9a6e4eaa1ec21ec;
      *(undefined2 *)(lVar10 + 0x6ee8) = 0x53ab;
      FUN_180505120(&LAB_1805d5060);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6ed8;
    if (*(char *)(lVar10 + 0x6eea) != '\0') {
      FUN_180054820(lVar7,0x12,0xffc3978bc98f5399);
      *(undefined *)(lVar10 + 0x6eea) = 0;
    }
    local_1f88 = ZEXT816(0);
    local_1f78 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1f88,lVar7);
    local_28d8 = 0xf886;
    uStack_28d6 = 0x8578;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6220) & 1) == 0) {
      *(uint *)(lVar10 + 0x6220) = *(uint *)(lVar10 + 0x6220) | 1;
      *(undefined *)(lVar10 + 0x64f4) = 1;
      *(undefined8 *)(lVar10 + 0x64e0) = 0xd9b8e7c0e36feeb7;
      *(undefined8 *)(lVar10 + 0x64e8) = 0xf3b6e7dad576e792;
      *(undefined4 *)(lVar10 + 0x64f0) = 0x8578f886;
      FUN_180505120(&LAB_1805d5030);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x64e0;
    if (*(char *)(lVar10 + 0x64f4) != '\0') {
      FUN_180054820(lVar7,0x14,0x9bd595af851d8be7);
      *(undefined *)(lVar10 + 0x64f4) = 0;
    }
    local_1f68 = ZEXT816(0);
    local_1f58 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1f68,lVar7);
    local_28d8 = 0x3c1a;
    uStack_28d6 = 0xebfd;
    uStack_28d4 = 0xb3ee;
    uStack_28d2 = 0x5180;
    local_28d0 = 0xbbf62012;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6864) & 1) == 0) {
      *(uint *)(lVar10 + 0x6864) = *(uint *)(lVar10 + 0x6864) | 1;
      *(undefined *)(lVar10 + 0x634c) = 1;
      *(undefined8 *)(lVar10 + 0x6330) = 0x6a8eb3f4dde13623;
      *(undefined8 *)(lVar10 + 0x6338) = 0x4d93a8e9d8e03106;
      *(undefined8 *)(lVar10 + 0x6340) = 0x5180b3eeebfd3c1a;
      *(undefined4 *)(lVar10 + 0x6348) = 0xbbf62012;
      FUN_180505120(&LAB_1805d5000);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6330;
    if (*(char *)(lVar10 + 0x634c) != '\0') {
      FUN_180054820(lVar7,0x1c,0x39e3c19bbb935373);
      *(undefined *)(lVar10 + 0x634c) = 0;
    }
    local_1f48 = ZEXT816(0);
    local_1f38 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1f48,lVar7);
    local_28d8 = 0x885e;
    uStack_28d6 = 0x5d11;
    uStack_28d4 = 0x33ac;
    uStack_28d2 = 0xff7a;
    local_28d0 = 0x5b1a9456;
    local_28cc = 0x41eb;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x70ac) & 1) == 0) {
      *(uint *)(lVar10 + 0x70ac) = *(uint *)(lVar10 + 0x70ac) | 1;
      *(undefined *)(lVar10 + 0x629e) = 1;
      *(undefined8 *)(lVar10 + 0x6280) = 0xc47433b66b0d8267;
      *(undefined8 *)(lVar10 + 0x6288) = 0xe36928ab6e0c8542;
      *(undefined8 *)(lVar10 + 0x6290) = 0xff7a33ac5d11885e;
      *(undefined4 *)(lVar10 + 0x6298) = 0x5b1a9456;
      *(undefined2 *)(lVar10 + 0x629c) = 0x41eb;
      FUN_180505120(&LAB_1805d4fd0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6280;
    if (*(char *)(lVar10 + 0x629e) != '\0') {
      FUN_180054820(lVar7,0x1e,0x971941d90d7fe737);
      *(undefined *)(lVar10 + 0x629e) = 0;
    }
    local_1f28 = ZEXT816(0);
    local_1f18 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1f28,lVar7);
    local_28d8 = 0x24ea;
    uStack_28d6 = 0x2df;
    uStack_28d4 = 0x353;
    uStack_28d2 = 0xa816;
    local_28d0 = CONCAT22(local_28d0._2_2_,0x47f7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 28000) & 1) == 0) {
      *(uint *)(lVar10 + 28000) = *(uint *)(lVar10 + 28000) | 1;
      *(undefined *)(lVar10 + 0x7142) = 1;
      *(undefined8 *)(lVar10 + 0x7128) = 0x8412054c0ddf22c9;
      *(undefined8 *)(lVar10 + 0x7130) = 0xa50a244f0ece29f8;
      *(undefined8 *)(lVar10 + 0x7138) = 0xa816035302df24ea;
      *(undefined2 *)(lVar10 + 0x7140) = 0x47f7;
      FUN_180505120(&LAB_1805d4fa0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7128;
    if (*(char *)(lVar10 + 0x7142) != '\0') {
      FUN_180054820(lVar7,0x1a,0xc77f77236bad4799);
      *(undefined *)(lVar10 + 0x7142) = 0;
    }
    local_1f08 = ZEXT816(0);
    local_1ef8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1f08,lVar7);
    local_28e8 = (undefined *)0xbc276f3594fe49d7;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0x7e3698f958f5);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7558) & 1) == 0) {
      *(uint *)(lVar10 + 0x7558) = *(uint *)(lVar10 + 0x7558) | 1;
      *(undefined2 *)(lVar10 + 0x71de) = 0x177;
      *(undefined8 *)(lVar10 + 0x71d0) = 0xbc276f3594fe49d7;
      *(undefined4 *)(lVar10 + 0x71d8) = 0x98f958f5;
      *(undefined2 *)(lVar10 + 0x71dc) = 0x7e36;
      FUN_180505120(&LAB_1805d4f70);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x71d0;
    if (*(char *)(lVar10 + 0x71df) != '\0') {
      FUN_180054820(lVar7,0xf,0xc9771b45f9913b87);
      *(undefined *)(lVar10 + 0x71df) = 0;
    }
    local_1ee8 = ZEXT816(0);
    local_1ed8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1ee8,lVar7);
    local_28d8 = 0x3be;
    uStack_28d6 = 0xd864;
    uStack_28d4 = 0x49ca;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x68f8) & 1) == 0) {
      *(uint *)(lVar10 + 0x68f8) = *(uint *)(lVar10 + 0x68f8) | 1;
      *(undefined *)(lVar10 + 0x70fe) = 1;
      *(undefined8 *)(lVar10 + 0x70e8) = 0xf513ddfc66a198d;
      *(undefined8 *)(lVar10 + 0x70f0) = 0xf7419dbc8700fb2;
      *(undefined4 *)(lVar10 + 0x70f8) = 0xd86403be;
      *(undefined2 *)(lVar10 + 0x70fc) = 0x49ca;
      FUN_180505120(&LAB_1805d4f40);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x70e8;
    if (*(char *)(lVar10 + 0x70fe) != '\0') {
      FUN_180054820(lVar7,0x16,0x7d0149afab056bdd);
      *(undefined *)(lVar10 + 0x70fe) = 0;
    }
    local_1ec8 = ZEXT816(0);
    local_1eb8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1ec8,lVar7);
    local_28d8 = 0xd69d;
    uStack_28d6 = 0xd0a1;
    uStack_28d4 = 0xb850;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6980) & 1) == 0) {
      *(uint *)(lVar10 + 0x6980) = *(uint *)(lVar10 + 0x6980) | 1;
      *(undefined2 *)(lVar10 + 0x6576) = 0x107;
      *(undefined8 *)(lVar10 + 0x6560) = 0xe640a953dca6c7bf;
      *(undefined8 *)(lVar10 + 0x6568) = 0xf257ae50d099d082;
      *(undefined4 *)(lVar10 + 0x6570) = 0xd0a1d69d;
      *(undefined2 *)(lVar10 + 0x6574) = 0xb850;
      FUN_180505120(&LAB_1805d4f10);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6560;
    if (*(char *)(lVar10 + 0x6577) != '\0') {
      FUN_180054820(lVar7,0x17,0x8707dd23b1c9b5ef);
      *(undefined *)(lVar10 + 0x6577) = 0;
    }
    local_1ea8 = ZEXT816(0);
    local_1e98 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1ea8,lVar7);
    local_28d8 = 0x3a85;
    uStack_28d6 = 0xe492;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6414) & 1) == 0) {
      *(uint *)(lVar10 + 0x6414) = *(uint *)(lVar10 + 0x6414) | 1;
      *(undefined2 *)(lVar10 + 0x711c) = 0x1b1;
      *(undefined8 *)(lVar10 + 0x7108) = 0xa91d9c1ec8e29bd;
      *(undefined8 *)(lVar10 + 0x7110) = 0x1ca1d8e1e48d3f83;
      *(undefined4 *)(lVar10 + 0x7118) = 0xe4923a85;
      FUN_180505120(&LAB_1805d4ee0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7108;
    if (*(char *)(lVar10 + 0x711d) != '\0') {
      FUN_180054820(lVar7,0x15,0x7fd3adb181e15bed);
      *(undefined *)(lVar10 + 0x711d) = 0;
    }
    local_1e88 = ZEXT816(0);
    local_1e78 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1e88,lVar7);
    local_28d8 = 0xf620;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x679c) & 1) == 0) {
      *(uint *)(lVar10 + 0x679c) = *(uint *)(lVar10 + 0x679c) | 1;
      *(undefined2 *)(lVar10 + 0x6ae2) = 0x179;
      *(undefined8 *)(lVar10 + 0x6ad0) = 0xf4c189d90216e103;
      *(undefined8 *)(lVar10 + 0x6ad8) = 0xe0eb9edb1a29f83f;
      *(undefined2 *)(lVar10 + 0x6ae0) = 0xf620;
      FUN_180505120(&LAB_1805d4eb0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6ad0;
    if (*(char *)(lVar10 + 0x6ae3) != '\0') {
      FUN_180054820(lVar7,0x13,0x8183fda96f799353);
      *(undefined *)(lVar10 + 0x6ae3) = 0;
    }
    local_1e68 = ZEXT816(0);
    local_1e58 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1e68,lVar7);
    local_28d8 = 0xdcf7;
    uStack_28d6 = 0xfe3e;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x72b0) & 1) == 0) {
      *(uint *)(lVar10 + 0x72b0) = *(uint *)(lVar10 + 0x72b0) | 1;
      *(undefined2 *)(lVar10 + 0x68a4) = 0x1cd;
      *(undefined8 *)(lVar10 + 0x6890) = 0x761fcdbdf622cfcf;
      *(undefined8 *)(lVar10 + 0x6898) = 0x7a3fcc9de322d1fd;
      *(undefined4 *)(lVar10 + 0x68a0) = 0xfe3edcf7;
      FUN_180505120(&LAB_1805d4e80);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6890;
    if (*(char *)(lVar10 + 0x68a5) != '\0') {
      FUN_180054820(lVar7,0x15,0x194db9cd9b4dbd9f);
      *(undefined *)(lVar10 + 0x68a5) = 0;
    }
    local_1e48 = ZEXT816(0);
    local_1e38 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1e48,lVar7);
    local_28d8 = 0x3661;
    uStack_28d6 = 0x6a49;
    uStack_28d4 = 0xb2c9;
    uStack_28d2 = 0xa41a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7394) & 1) == 0) {
      *(uint *)(lVar10 + 0x7394) = *(uint *)(lVar10 + 0x7394) | 1;
      *(undefined2 *)(lVar10 + 0x7230) = 0x131;
      *(undefined8 *)(lVar10 + 0x7218) = 0xa93da7d164543161;
      *(undefined8 *)(lVar10 + 0x7220) = 0xb81da1c0595f3158;
      *(undefined8 *)(lVar10 + 0x7228) = 0xa41ab2c96a493661;
      FUN_180505120(&LAB_1805d4e50);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7218;
    if (*(char *)(lVar10 + 0x7231) != '\0') {
      FUN_180054820(lVar7,0x19,0xc169d3a1093b4331);
      *(undefined *)(lVar10 + 0x7231) = 0;
    }
    local_1e28 = ZEXT816(0);
    local_1e18 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1e28,lVar7);
    local_28d8 = 0xc1ca;
    uStack_28d6 = 0x38b0;
    uStack_28d4 = 0xc910;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x632c) & 1) == 0) {
      *(uint *)(lVar10 + 0x632c) = *(uint *)(lVar10 + 0x632c) | 1;
      *(undefined *)(lVar10 + 0x64be) = 1;
      *(undefined8 *)(lVar10 + 0x64a8) = 0x1d7bbd0526bedbf9;
      *(undefined8 *)(lVar10 + 0x64b0) = 0x1d5e99183eb8c4cc;
      *(undefined4 *)(lVar10 + 0x64b8) = 0x38b0c1ca;
      *(undefined2 *)(lVar10 + 0x64bc) = 0xc910;
      FUN_180505120(&LAB_1805d4e20);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x64a8;
    if (*(char *)(lVar10 + 0x64be) != '\0') {
      FUN_180054820(lVar7,0x16,0x6f2bc9754bd1a9a9);
      *(undefined *)(lVar10 + 0x64be) = 0;
    }
    local_1e08 = ZEXT816(0);
    local_1df8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1e08,lVar7);
    local_28d8 = 0xf112;
    uStack_28d6 = 0x6abf;
    uStack_28d4 = 0xea7d;
    uStack_28d2 = 0xac7d;
    local_28d0 = CONCAT22(local_28d0._2_2_,0xfa0e);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x66a0) & 1) == 0) {
      *(uint *)(lVar10 + 0x66a0) = *(uint *)(lVar10 + 0x66a0) | 1;
      *(undefined2 *)(lVar10 + 0x6b1a) = 0x1ef;
      *(undefined8 *)(lVar10 + 0x6b00) = 0xb846fd7f7280ed2d;
      *(undefined8 *)(lVar10 + 0x6b08) = 0xa461f9666d8cec1f;
      *(undefined8 *)(lVar10 + 0x6b10) = 0xac7dea7d6abff112;
      *(undefined2 *)(lVar10 + 0x6b18) = 0xfa0e;
      FUN_180505120(&LAB_1805d4df0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6b00;
    if (*(char *)(lVar10 + 0x6b1b) != '\0') {
      FUN_180054820(lVar7,0x1b,0xcd15890f1fef9f7d);
      *(undefined *)(lVar10 + 0x6b1b) = 0;
    }
    local_1de8 = ZEXT816(0);
    local_1dd8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1de8,lVar7);
    local_28d8 = 0x2b6c;
    uStack_28d6 = 0xbca;
    uStack_28d4 = 0xa4e1;
    uStack_28d2 = 0x13a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6328) & 1) == 0) {
      *(uint *)(lVar10 + 0x6328) = *(uint *)(lVar10 + 0x6328) | 1;
      *(undefined2 *)(lVar10 + 0x75c0) = 0x10f;
      *(undefined8 *)(lVar10 + 0x75a8) = 0xe16b9e516cc2b5f;
      *(undefined8 *)(lVar10 + 0x75b0) = 0x1c37b8c617c63a61;
      *(undefined8 *)(lVar10 + 0x75b8) = 0x13aa4e10bca2b6c;
      FUN_180505120(&LAB_1805d4dc0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x75a8;
    if (*(char *)(lVar10 + 0x75c1) != '\0') {
      FUN_180054820(lVar7,0x19,0x6f55cd957ba3590f);
      *(undefined *)(lVar10 + 0x75c1) = 0;
    }
    local_1dc8 = ZEXT816(0);
    local_1db8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1dc8,lVar7);
    local_28d8 = 0x1a13;
    uStack_28d6 = 0x407a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6d64) & 1) == 0) {
      *(uint *)(lVar10 + 0x6d64) = *(uint *)(lVar10 + 0x6d64) | 1;
      *(undefined2 *)(lVar10 + 0x71b4) = 0x1fd;
      *(undefined8 *)(lVar10 + 0x71a0) = 0x82df598d4866092b;
      *(undefined8 *)(lVar10 + 0x71a8) = 0x80e358ad407f120f;
      *(undefined4 *)(lVar10 + 0x71b0) = 0x407a1a13;
      FUN_180505120(&LAB_1805d4d90);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x71a0;
    if (*(char *)(lVar10 + 0x71b5) != '\0') {
      FUN_180054820(lVar7,0x15,0xe3912dfd25097b7b);
      *(undefined *)(lVar10 + 0x71b5) = 0;
    }
    local_1da8 = ZEXT816(0);
    local_1d98 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1da8,lVar7);
    local_28c8 = 0x64d0;
    uStack_28c6 = 0x7b17;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x621c) & 1) == 0) {
      *(uint *)(lVar10 + 0x621c) = *(uint *)(lVar10 + 0x621c) | 1;
      *(undefined *)(lVar10 + 0x738c) = 1;
      *(undefined8 *)(lVar10 + 0x7368) = 0x36b5559d160a73f9;
      *(undefined8 *)(lVar10 + 0x7370) = 0x348954bd1e1368dd;
      *(undefined4 *)(lVar10 + 0x7378) = 0x1e1660c1;
      *(undefined4 *)(lVar10 + 0x737c) = 0x3f8f48ba;
      *(undefined4 *)(lVar10 + 0x7380) = 0x1a066ee5;
      *(undefined4 *)(lVar10 + 0x7384) = 0x36977181;
      *(undefined4 *)(lVar10 + 0x7388) = 0x7b1764d0;
      FUN_180505120(&LAB_1805d4d60);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7368;
    if (*(char *)(lVar10 + 0x738c) != '\0') {
      FUN_180054820(lVar7,0x24,0x57fb21ed7b6501a9);
      *(undefined *)(lVar10 + 0x738c) = 0;
    }
    local_1d88 = ZEXT816(0);
    local_1d78 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1d88,lVar7);
    local_28d8 = 0xd638;
    uStack_28d6 = 0xaa7f;
    uStack_28d4 = 0xb0d7;
    uStack_28d2 = 0xba0b;
    local_28d0 = CONCAT22(local_28d0._2_2_,0xc02e);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x65d0) & 1) == 0) {
      *(uint *)(lVar10 + 0x65d0) = *(uint *)(lVar10 + 0x65d0) | 1;
      *(undefined2 *)(lVar10 + 0x691a) = 0x12f;
      *(undefined8 *)(lVar10 + 0x6900) = 0xb420a7d5b240d70d;
      *(undefined8 *)(lVar10 + 0x6908) = 0xb701bad1bc4ac931;
      *(undefined8 *)(lVar10 + 0x6910) = 0xba0bb0d7aa7fd638;
      *(undefined2 *)(lVar10 + 0x6918) = 0xc02e;
      FUN_180505120(&LAB_1805d4d30);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6900;
    if (*(char *)(lVar10 + 0x691b) != '\0') {
      FUN_180054820(lVar7,0x1b,0xdb63d3a5df2fa55d);
      *(undefined *)(lVar10 + 0x691b) = 0;
    }
    local_1d68 = ZEXT816(0);
    local_1d58 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1d68,lVar7);
    local_28d8 = 0x2685;
    uStack_28d6 = 0xffcc;
    uStack_28d4 = 0xbfe4;
    uStack_28d2 = 0x3db6;
    local_28d0 = 0xafda3088;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7748) & 1) == 0) {
      *(uint *)(lVar10 + 0x7748) = *(uint *)(lVar10 + 0x7748) | 1;
      *(undefined *)(lVar10 + 0x61e4) = 1;
      *(undefined8 *)(lVar10 + 0x61c8) = 0x16b0bff0dfda31b9;
      *(undefined8 *)(lVar10 + 0x61d0) = 0x37bcb9f2cad32f86;
      *(undefined8 *)(lVar10 + 0x61d8) = 0x3db6bfe4ffcc2685;
      *(undefined4 *)(lVar10 + 0x61e0) = 0xafda3088;
      FUN_180505120(&LAB_1805d4d00);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x61c8;
    if (*(char *)(lVar10 + 0x61e4) != '\0') {
      FUN_180054820(lVar7,0x1c,0x55d5cd91afbf43e9);
      *(undefined *)(lVar10 + 0x61e4) = 0;
    }
    local_1d48 = ZEXT816(0);
    local_1d38 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1d48,lVar7);
    local_28c8 = 0x6eb6;
    uStack_28c6 = 0xec8c;
    uStack_28c4 = 0x5a83;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6640) & 1) == 0) {
      *(uint *)(lVar10 + 0x6640) = *(uint *)(lVar10 + 0x6640) | 1;
      *(undefined2 *)(lVar10 + 0x707e) = 0x143;
      *(undefined8 *)(lVar10 + 0x7058) = 0xa2315c9ec08b4a88;
      *(undefined8 *)(lVar10 + 0x7060) = 0x8533509ff68c4dba;
      *(undefined4 *)(lVar10 + 0x7068) = 0xc59140a6;
      *(undefined4 *)(lVar10 + 0x706c) = 0x942e408c;
      *(undefined4 *)(lVar10 + 0x7070) = 0xfcb75ba1;
      *(undefined4 *)(lVar10 + 0x7074) = 0x832c4d9e;
      *(undefined4 *)(lVar10 + 0x7078) = 0xec8c6eb6;
      *(undefined2 *)(lVar10 + 0x707c) = 0x5a83;
      FUN_180505120(&LAB_1805d4cd0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7058;
    if (*(char *)(lVar10 + 0x707f) != '\0') {
      FUN_180054820(lVar7,0x27,0xf14339ed95ff2fcf);
      *(undefined *)(lVar10 + 0x707f) = 0;
    }
    local_1d28 = ZEXT816(0);
    local_1d18 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1d28,lVar7);
    local_28c8 = 0x890c;
    uStack_28c6 = 0x6d8;
    uStack_28c4 = 0xa3f6;
    uStack_28c2 = 0x1b64;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7600) & 1) == 0) {
      *(uint *)(lVar10 + 0x7600) = *(uint *)(lVar10 + 0x7600) | 1;
      *(undefined *)(lVar10 + 0x6fe8) = 1;
      *(undefined8 *)(lVar10 + 0x6fc0) = 0x4875a8fc20ed802a;
      *(undefined8 *)(lVar10 + 0x6fc8) = 0x6f77a4fd16ea8718;
      *(undefined4 *)(lVar10 + 0x6fd0) = 0x31f78a04;
      *(undefined4 *)(lVar10 + 0x6fd4) = 0x7266b9ea;
      *(undefined4 *)(lVar10 + 0x6fd8) = 0x1bd09601;
      *(undefined4 *)(lVar10 + 0x6fdc) = 0x7575a8fb;
      *(undefined8 *)(lVar10 + 0x6fe0) = 0x1b64a3f606d8890c;
      FUN_180505120(&LAB_1805d4ca0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6fc0;
    if (*(char *)(lVar10 + 0x6fe8) != '\0') {
      FUN_180054820(lVar7,0x28,0x1b07cd8f7599e56d);
      *(undefined *)(lVar10 + 0x6fe8) = 0;
    }
    local_1d08 = ZEXT816(0);
    local_1cf8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1d08,lVar7);
    local_28d8 = 0xf690;
    uStack_28d6 = 0x54b1;
    uStack_28d4 = 0x5243;
    uStack_28d2 = 0x5c13;
    local_28d0 = 0x7eacd88a;
    local_28cc = 0x5059;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6cc0) & 1) == 0) {
      *(uint *)(lVar10 + 0x6cc0) = *(uint *)(lVar10 + 0x6cc0) | 1;
      *(undefined2 *)(lVar10 + 0x74ae) = 0x167;
      *(undefined8 *)(lVar10 + 0x7490) = 0x7a15564452abfcbe;
      *(undefined8 *)(lVar10 + 0x7498) = 0x5d175a4564acfb8c;
      *(undefined8 *)(lVar10 + 0x74a0) = 0x5c13524354b1f690;
      *(undefined4 *)(lVar10 + 0x74a8) = 0x7eacd88a;
      *(undefined2 *)(lVar10 + 0x74ac) = 0x5059;
      FUN_180505120(&LAB_1805d4c70);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7490;
    if (*(char *)(lVar10 + 0x74af) != '\0') {
      FUN_180054820(lVar7,0x1f,0x2967333707df99f9);
      *(undefined *)(lVar10 + 0x74af) = 0;
    }
    local_1ce8 = ZEXT816(0);
    local_1cd8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1ce8,lVar7);
    local_28d8 = 0x6da6;
    uStack_28d6 = 0xcb1e;
    uStack_28d4 = 0x82dc;
    uStack_28d2 = 0xfd2a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6a3c) & 1) == 0) {
      *(uint *)(lVar10 + 0x6a3c) = *(uint *)(lVar10 + 0x6a3c) | 1;
      *(undefined *)(lVar10 + 0x7518) = 1;
      *(undefined8 *)(lVar10 + 0x7500) = 0xb41985cdce126d83;
      *(undefined8 *)(lVar10 + 0x7508) = 0xad3d94cbd1184c83;
      *(undefined8 *)(lVar10 + 0x7510) = 0xfd2a82dccb1e6da6;
      FUN_180505120(&LAB_1805d4c40);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7500;
    if (*(char *)(lVar10 + 0x7518) != '\0') {
      FUN_180054820(lVar7,0x18,0xfd4ff1bda37d1fd3);
      *(undefined *)(lVar10 + 0x7518) = 0;
    }
    local_1cc8 = ZEXT816(0);
    local_1cb8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1cc8,lVar7);
    local_res18[0] = 0;
    FUN_1800ddc70(local_1928,local_res18);
    puVar11 = local_1fc8;
    do {
      FUN_1800ddd60(local_1928,&local_28e8,puVar11);
      puVar11 = puVar11 + 0x20;
    } while (puVar11 != local_1ca8);
    FUN_1800dc3f0(local_988,local_26b0,local_1928);
    local_28e8 = (undefined *)0x574dc09671e8b241;
    local_28e0 = (undefined *)CONCAT44(local_28e0._4_4_,0x5feb47c);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6754) & 1) == 0) {
      *(uint *)(lVar10 + 0x6754) = *(uint *)(lVar10 + 0x6754) | 1;
      *(undefined *)(lVar10 + 0x7014) = 1;
      *(undefined8 *)(lVar10 + 0x7008) = 0x574dc09671e8b241;
      *(undefined4 *)(lVar10 + 0x7010) = 0x5feb47c;
      FUN_180505120(&LAB_1805d4c10);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7008;
    if (*(char *)(lVar10 + 0x7014) != '\0') {
      FUN_180054820(lVar7,0xc,0x213fa5c5059bd715);
      *(undefined *)(lVar10 + 0x7014) = 0;
    }
    local_26d0 = ZEXT816(0);
    local_26c0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_26d0,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x72e0) & 1) == 0) {
      *(uint *)(lVar10 + 0x72e0) = *(uint *)(lVar10 + 0x72e0) | 1;
      *(undefined *)(lVar10 + 0x6c58) = 1;
      *(undefined4 *)(lVar10 + 0x6c54) = 0x11314029;
      FUN_180505120(&LAB_1805d4bf0);
    }
    auVar13 = _DAT_180782f50;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    puVar9 = (ushort *)(lVar10 + 0x6c54);
    if (*(char *)(lVar10 + 0x6c58) != '\0') {
      uVar8 = 0;
      if (DAT_18083c740 < 5) {
        do {
          *(byte *)((longlong)puVar9 + uVar8) =
               *(byte *)((longlong)puVar9 + uVar8) ^
               (byte)(0x3b7577db115f355b >> (((byte)uVar8 & 7) << 3));
          uVar8 = uVar8 + 1;
        } while (uVar8 < 4);
      }
      else {
        auVar12 = vpsrlvq_avx2(_DAT_180782f50,ZEXT816(8) << 0x40);
        auVar12 = pshufb(auVar12,_DAT_18077e970);
        *puVar9 = auVar12._0_2_ ^ *puVar9;
        auVar12._8_8_ = 0x18;
        auVar12._0_8_ = 0x10;
        auVar13 = vpsrlvq_avx2(auVar13,auVar12);
        auVar13 = pshufb(auVar13,_DAT_18077e970);
        *(ushort *)(lVar10 + 0x6c56) = auVar13._0_2_ ^ *(ushort *)(lVar10 + 0x6c56);
      }
      *(undefined *)(lVar10 + 0x6c58) = 0;
    }
    local_26f0 = ZEXT816(0);
    local_26e0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)((longlong)puVar9 + lVar10) != '\0');
    FUN_180059160(local_26f0,puVar9);
    local_res20[0] = 0;
    FUN_1800ddc70(local_1968,local_res20);
    FUN_1800ddd60(local_1968,&local_28e8,local_26f0);
    FUN_1800dc3f0(local_928,local_26d0,local_1968);
    local_28d8 = 0x556;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6ccc) & 1) == 0) {
      *(uint *)(lVar10 + 0x6ccc) = *(uint *)(lVar10 + 0x6ccc) | 1;
      *(undefined *)(lVar10 + 0x67d2) = 1;
      *(undefined8 *)(lVar10 + 0x67c0) = 0x73626e40f438607e;
      *(undefined8 *)(lVar10 + 0x67c8) = 0x526e7f53e2187646;
      *(undefined2 *)(lVar10 + 0x67d0) = 0x556;
      FUN_180505120(&LAB_1805d4bc0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x67c0;
    if (*(char *)(lVar10 + 0x67d2) != '\0') {
      FUN_180054820(lVar7,0x12,0x31070921874b0533);
      *(undefined *)(lVar10 + 0x67d2) = 0;
    }
    local_2710 = ZEXT816(0);
    local_2700 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2710,lVar7);
    local_28e8 = (undefined *)0xc05c58d6a4379e54;
    local_28e0 = (undefined *)CONCAT44(local_28e0._4_4_,0x8d0a9e74);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7720) & 1) == 0) {
      *(uint *)(lVar10 + 0x7720) = *(uint *)(lVar10 + 0x7720) | 1;
      *(undefined2 *)(lVar10 + 0x6f0c) = 0x1b3;
      *(undefined8 *)(lVar10 + 0x6f00) = 0xc05c58d6a4379e54;
      *(undefined4 *)(lVar10 + 0x6f08) = 0x8d0a9e74;
      FUN_180505120(&LAB_1805d4b90);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6f00;
    if (*(char *)(lVar10 + 0x6f0d) != '\0') {
      FUN_180054820(lVar7,0xd,0xa12f2bb3e943fb13);
      *(undefined *)(lVar10 + 0x6f0d) = 0;
    }
    local_2148 = ZEXT816(0);
    local_2138 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2148,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6440) & 1) == 0) {
      *(uint *)(lVar10 + 0x6440) = *(uint *)(lVar10 + 0x6440) | 1;
      *(undefined *)(lVar10 + 0x74f8) = 1;
      *(undefined8 *)(lVar10 + 0x74f0) = 0xcfe788e05b19e8e1;
      FUN_180505120(&LAB_1805d4b60);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x74f0;
    if (*(char *)(lVar10 + 0x74f8) != '\0') {
      FUN_180054820(lVar7,8,0xcf8ffb89377b9db1);
      *(undefined *)(lVar10 + 0x74f8) = 0;
    }
    local_2128 = ZEXT816(0);
    local_2118 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2128,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x62a0) & 1) == 0) {
      *(uint *)(lVar10 + 0x62a0) = *(uint *)(lVar10 + 0x62a0) | 1;
      *(undefined2 *)(lVar10 + 0x6244) = 0x135;
      *(undefined4 *)(lVar10 + 0x6240) = 0xb13930cc;
      FUN_180505120(&LAB_1805d4b30);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    pbVar4 = (byte *)(lVar10 + 0x6240);
    if (*(char *)(lVar10 + 0x6245) != '\0') {
      *pbVar4 = *pbVar4 ^ 0x8f;
      *(byte *)(lVar10 + 0x6241) = *(byte *)(lVar10 + 0x6241) ^ 0x51;
      *(byte *)(lVar10 + 0x6242) = *(byte *)(lVar10 + 0x6242) ^ 0x55;
      *(byte *)(lVar10 + 0x6243) = *(byte *)(lVar10 + 0x6243) ^ 0xdd;
      *(byte *)(lVar10 + 0x6244) = *(byte *)(lVar10 + 0x6244) ^ 0x35;
      *(undefined *)(lVar10 + 0x6245) = 0;
    }
    local_2108 = ZEXT816(0);
    local_20f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (pbVar4[lVar10] != 0);
    FUN_180059160(local_2108);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6cc8) & 1) == 0) {
      *(uint *)(lVar10 + 0x6cc8) = *(uint *)(lVar10 + 0x6cc8) | 1;
      *(undefined *)(lVar10 + 0x6860) = 1;
      *(undefined8 *)(lVar10 + 0x6858) = 0xdbdb30e289eb7c88;
      FUN_180505120(&LAB_1805d4b00);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6858;
    if (*(char *)(lVar10 + 0x6860) != '\0') {
      FUN_180054820(lVar7,8,0xdbaf4383c59f19cf);
      *(undefined *)(lVar10 + 0x6860) = 0;
    }
    local_20e8 = ZEXT816(0);
    local_20d8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_20e8,lVar7);
    local_28c8 = 0xd595;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6f48) & 1) == 0) {
      *(uint *)(lVar10 + 0x6f48) = *(uint *)(lVar10 + 0x6f48) | 1;
      *(undefined *)(lVar10 + 0x6c9a) = 1;
      *(undefined8 *)(lVar10 + 0x6c78) = 0x6eb9ac6d3587b0b6;
      *(undefined8 *)(lVar10 + 0x6c80) = 0x6ea5b77a289fba92;
      *(undefined4 *)(lVar10 + 0x6c88) = 0x14968795;
      *(undefined4 *)(lVar10 + 0x6c8c) = 0x75bea66a;
      *(undefined4 *)(lVar10 + 0x6c90) = 0x1680b0bc;
      *(undefined4 *)(lVar10 + 0x6c94) = 0x48a8a47e;
      *(undefined2 *)(lVar10 + 0x6c98) = 0xd595;
      FUN_180505120(&LAB_1805d4ad0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6c78;
    if (*(char *)(lVar10 + 0x6c9a) != '\0') {
      FUN_180054820(lVar7,0x22,0x1cdc31f65f3d5f1);
      *(undefined *)(lVar10 + 0x6c9a) = 0;
    }
    local_20c8 = ZEXT816(0);
    local_20b8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_20c8,lVar7);
    local_28c8 = 0xa3c6;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7484) & 1) == 0) {
      *(uint *)(lVar10 + 0x7484) = *(uint *)(lVar10 + 0x7484) | 1;
      *(undefined2 *)(lVar10 + 0x6a22) = 0x10f;
      *(undefined8 *)(lVar10 + 0x6a00) = 0xa8a7b48f077ba2c8;
      *(undefined8 *)(lVar10 + 0x6a08) = 0xa8bbaf981a63a8ec;
      *(undefined4 *)(lVar10 + 0x6a10) = 0x246a95eb;
      *(undefined4 *)(lVar10 + 0x6a14) = 0xb4bdb48d;
      *(undefined4 *)(lVar10 + 0x6a18) = 0x246a8aea;
      *(undefined4 *)(lVar10 + 0x6a1c) = 0xa2b4ba8e;
      *(undefined2 *)(lVar10 + 0x6a20) = 0xa3c6;
      FUN_180505120(&LAB_1805d4aa0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6a00;
    if (*(char *)(lVar10 + 0x6a23) != '\0') {
      FUN_180054820(lVar7,0x23,0xc7d3dbfd570fc78f);
      *(undefined *)(lVar10 + 0x6a23) = 0;
    }
    local_20a8 = ZEXT816(0);
    local_2098 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_20a8,lVar7);
    local_28e8 = (undefined *)0x84140065e0484abe;
    local_28e0 = (undefined *)CONCAT44(local_28e0._4_4_,0x85575896);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x77ac) & 1) == 0) {
      *(uint *)(lVar10 + 0x77ac) = *(uint *)(lVar10 + 0x77ac) | 1;
      *(undefined *)(lVar10 + 0x6404) = 1;
      *(undefined8 *)(lVar10 + 0x63f8) = 0x84140065e0484abe;
      *(undefined4 *)(lVar10 + 0x6400) = 0x85575896;
      FUN_180505120(&LAB_1805d4a70);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x63f8;
    if (*(char *)(lVar10 + 0x6404) != '\0') {
      FUN_180054820(lVar7,0xc,0xf165653785232bf3);
      *(undefined *)(lVar10 + 0x6404) = 0;
    }
    local_2088 = ZEXT816(0);
    local_2078 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2088,lVar7);
    local_28d8 = 0xed7c;
    uStack_28d6 = 0x4c39;
    uStack_28d4 = 0x7bcb;
    uStack_28d2 = 0xbe40;
    local_28d0 = 0x5722fc6c;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6644) & 1) == 0) {
      *(uint *)(lVar10 + 0x6644) = *(uint *)(lVar10 + 0x6644) | 1;
      *(undefined2 *)(lVar10 + 0x70cc) = 0x1af;
      *(undefined8 *)(lVar10 + 0x70b0) = 0x9f4d5ac64f33ec49;
      *(undefined8 *)(lVar10 + 0x70b8) = 0x824946cc4c25f66b;
      *(undefined8 *)(lVar10 + 0x70c0) = 0xbe407bcb4c39ed7c;
      *(undefined4 *)(lVar10 + 0x70c8) = 0x5722fc6c;
      FUN_180505120(&LAB_1805d4a40);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x70b0;
    if (*(char *)(lVar10 + 0x70cd) != '\0') {
      FUN_180054820(lVar7,0x1d,0xcf2529af23519919);
      *(undefined *)(lVar10 + 0x70cd) = 0;
    }
    local_2068 = ZEXT816(0);
    local_2058 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2068,lVar7);
    local_28d8 = 0x6780;
    uStack_28d6 = 0xf215;
    uStack_28d4 = 0xf913;
    uStack_28d2 = 0xa672;
    local_28d0 = 0xee137c95;
    local_28cc = 0xab12;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x61ec) & 1) == 0) {
      *(uint *)(lVar10 + 0x61ec) = *(uint *)(lVar10 + 0x61ec) | 1;
      *(undefined *)(lVar10 + 0x7556) = 1;
      *(undefined8 *)(lVar10 + 0x7538) = 0x857fd81ef11f66b5;
      *(undefined8 *)(lVar10 + 0x7540) = 0x987bc414f2097c97;
      *(undefined8 *)(lVar10 + 0x7548) = 0xa672f913f2156780;
      *(undefined4 *)(lVar10 + 0x7550) = 0xee137c95;
      *(undefined2 *)(lVar10 + 0x7554) = 0xab12;
      FUN_180505120(&LAB_1805d4a10);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7538;
    if (*(char *)(lVar10 + 0x7556) != '\0') {
      FUN_180054820(lVar7,0x1e,0xd517ab779d7d13e5);
      *(undefined *)(lVar10 + 0x7556) = 0;
    }
    local_2048 = ZEXT816(0);
    local_2038 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2048,lVar7);
    local_28e8 = (undefined *)0xb33269745a1fe41c;
    local_28e0 = (undefined *)CONCAT62(local_28e0._2_6_,0x912a);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6544) & 1) == 0) {
      *(uint *)(lVar10 + 0x6544) = *(uint *)(lVar10 + 0x6544) | 1;
      *(undefined *)(lVar10 + 0x6732) = 1;
      *(undefined8 *)(lVar10 + 0x6728) = 0xb33269745a1fe41c;
      *(undefined2 *)(lVar10 + 0x6730) = 0x912a;
      FUN_180505120(&LAB_1805d49e0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6728;
    if (*(char *)(lVar10 + 0x6732) != '\0') {
      FUN_180054820(lVar7,10,0xd15b1b17297d914f);
      *(undefined *)(lVar10 + 0x6732) = 0;
    }
    local_2028 = ZEXT816(0);
    local_2018 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2028,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x63d8) & 1) == 0) {
      *(uint *)(lVar10 + 0x63d8) = *(uint *)(lVar10 + 0x63d8) | 1;
      *(undefined2 *)(lVar10 + 0x69c8) = 0x1a5;
      *(undefined8 *)(lVar10 + 0x69a8) = 0x67c451a0b86948f6;
      *(undefined8 *)(lVar10 + 0x69b0) = 0x6ad94cb19b6469c0;
      *(undefined4 *)(lVar10 + 0x69b8) = 0x866752c6;
      *(undefined4 *)(lVar10 + 0x69bc) = 0x6ac557a6;
      *(undefined4 *)(lVar10 + 0x69c0) = 0xba6e6fc1;
      *(undefined4 *)(lVar10 + 0x69c4) = 0x71de46b6;
      FUN_180505120(&LAB_1805d49b0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x69a8;
    if (*(char *)(lVar10 + 0x69c9) != '\0') {
      FUN_180054820(lVar7,0x21,0x5ad23c3cb0b3da5);
      *(undefined *)(lVar10 + 0x69c9) = 0;
    }
    local_2008 = ZEXT816(0);
    local_1ff8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2008,lVar7);
    local_28c8 = 0xdbe;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x61c4) & 1) == 0) {
      *(uint *)(lVar10 + 0x61c4) = *(uint *)(lVar10 + 0x61c4) | 1;
      *(undefined *)(lVar10 + 0x75fa) = 1;
      *(undefined8 *)(lVar10 + 0x75d8) = 0xbdc6c722ec2b7888;
      *(undefined8 *)(lVar10 + 0x75e0) = 0xb0dbda33cf2659be;
      *(undefined4 *)(lVar10 + 0x75e8) = 0xd22562b8;
      *(undefined4 *)(lVar10 + 0x75ec) = 0xb0c7c124;
      *(undefined4 *)(lVar10 + 0x75f0) = 0xec2c5fbf;
      *(undefined4 *)(lVar10 + 0x75f4) = 0xacc1da31;
      *(undefined2 *)(lVar10 + 0x75f8) = 0xdbe;
      FUN_180505120(&LAB_1805d4980);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x75d8;
    if (*(char *)(lVar10 + 0x75fa) != '\0') {
      FUN_180054820(lVar7,0x22,0xdfafb5419f490ddb);
      *(undefined *)(lVar10 + 0x75fa) = 0;
    }
    local_1fe8 = ZEXT816(0);
    local_1fd8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_1fe8,lVar7);
    local_28b8 = 0;
    FUN_1800ddc70(local_19a8,&local_28b8);
    puVar11 = local_2148;
    do {
      FUN_1800ddd60(local_19a8,&local_28e8,puVar11);
      puVar11 = puVar11 + 0x20;
    } while (puVar11 != local_1fc8);
    FUN_1800dc3f0(local_8c8,local_2710,local_19a8);
    local_28e8 = (undefined *)0xc09132cea8905d65;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0x32deb6895d42);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x61e8) & 1) == 0) {
      *(uint *)(lVar10 + 0x61e8) = *(uint *)(lVar10 + 0x61e8) | 1;
      *(undefined2 *)(lVar10 + 0x696e) = 0x1e3;
      *(undefined8 *)(lVar10 + 0x6960) = 0xc09132cea8905d65;
      *(undefined4 *)(lVar10 + 0x6968) = 0xb6895d42;
      *(undefined2 *)(lVar10 + 0x696c) = 0x32de;
      FUN_180505120(&LAB_1805d4950);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6960;
    if (*(char *)(lVar10 + 0x696f) != '\0') {
      FUN_180054820(lVar7,0xf,0x93e357bddfff2f27);
      *(undefined *)(lVar10 + 0x696f) = 0;
    }
    local_2730 = ZEXT816(0);
    local_2720 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2730,lVar7);
    local_28d8 = 0xd52a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6764) & 1) == 0) {
      *(uint *)(lVar10 + 0x6764) = *(uint *)(lVar10 + 0x6764) | 1;
      *(undefined *)(lVar10 + 0x73da) = 1;
      *(undefined8 *)(lVar10 + 0x73c8) = 0x700cf577e75ea512;
      *(undefined8 *)(lVar10 + 0x73d0) = 0x6807e95cde49b02e;
      *(undefined2 *)(lVar10 + 0x73d8) = 0xd52a;
      FUN_180505120(&LAB_1805d4920);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x73c8;
    if (*(char *)(lVar10 + 0x73da) != '\0') {
      FUN_180054820(lVar7,0x12,0x7638735893bd55d);
      *(undefined *)(lVar10 + 0x73da) = 0;
    }
    local_23c8 = ZEXT816(0);
    local_23b8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_23c8,lVar7);
    local_28d8 = 0xcfc6;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6f4c) & 1) == 0) {
      *(uint *)(lVar10 + 0x6f4c) = *(uint *)(lVar10 + 0x6f4c) | 1;
      *(undefined *)(lVar10 + 0x70aa) = 1;
      *(undefined8 *)(lVar10 + 0x7098) = 0x26c3b4bdc5f0bff0;
      *(undefined8 *)(lVar10 + 0x70a0) = 0x2edba796dddaaac9;
      *(undefined2 *)(lVar10 + 0x70a8) = 0xcfc6;
      FUN_180505120(&LAB_1805d48f0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7098;
    if (*(char *)(lVar10 + 0x70aa) != '\0') {
      FUN_180054820(lVar7,0x12,0x4fb7d5f3ab95cfbf);
      *(undefined *)(lVar10 + 0x70aa) = 0;
    }
    local_23a8 = ZEXT816(0);
    local_2398 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_23a8,lVar7);
    local_28d8 = 0x234b;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7124) & 1) == 0) {
      *(uint *)(lVar10 + 0x7124) = *(uint *)(lVar10 + 0x7124) | 1;
      *(undefined *)(lVar10 + 0x7212) = 1;
      *(undefined8 *)(lVar10 + 0x7200) = 0xe1baafd014fc5b7a;
      *(undefined8 *)(lVar10 + 0x7208) = 0xdbb6a9c624f8555e;
      *(undefined2 *)(lVar10 + 0x7210) = 0x234b;
      FUN_180505120(&LAB_1805d48c0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7200;
    if (*(char *)(lVar10 + 0x7212) != '\0') {
      FUN_180054820(lVar7,0x12,0xabdfdba57799233f);
      *(undefined *)(lVar10 + 0x7212) = 0;
    }
    local_2388 = ZEXT816(0);
    local_2378 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2388,lVar7);
    local_28d8 = 0xb1d3;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6ef4) & 1) == 0) {
      *(uint *)(lVar10 + 0x6ef4) = *(uint *)(lVar10 + 0x6ef4) | 1;
      *(undefined2 *)(lVar10 + 0x72da) = 0x18d;
      *(undefined8 *)(lVar10 + 0x72c8) = 0xfa61338f0cf9a0f1;
      *(undefined8 *)(lVar10 + 0x72d0) = 0xfc473eae18fba4e9;
      *(undefined2 *)(lVar10 + 0x72d8) = 0xb1d3;
      FUN_180505120(&LAB_1805d4890);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x72c8;
    if (*(char *)(lVar10 + 0x72db) != '\0') {
      FUN_180054820(lVar7,0x13,0x95355dfd798dc5a3);
      *(undefined *)(lVar10 + 0x72db) = 0;
    }
    local_2368 = ZEXT816(0);
    local_2358 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2368,lVar7);
    local_28e8 = (undefined *)0x44162ae417956c12;
    local_28e0 = (undefined *)CONCAT44(local_28e0._4_4_,0x739f6720);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6720) & 1) == 0) {
      *(uint *)(lVar10 + 0x6720) = *(uint *)(lVar10 + 0x6720) | 1;
      *(undefined *)(lVar10 + 0x6ed4) = 1;
      *(undefined8 *)(lVar10 + 0x6ec8) = 0x44162ae417956c12;
      *(undefined4 *)(lVar10 + 0x6ed0) = 0x739f6720;
      FUN_180505120(&LAB_1805d4860);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6ec8;
    if (*(char *)(lVar10 + 0x6ed4) != '\0') {
      FUN_180054820(lVar7,0xc,0x297b45a773fb0941);
      *(undefined *)(lVar10 + 0x6ed4) = 0;
    }
    local_2348 = ZEXT816(0);
    local_2338 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2348,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x771c) & 1) == 0) {
      *(uint *)(lVar10 + 0x771c) = *(uint *)(lVar10 + 0x771c) | 1;
      *(undefined *)(lVar10 + 0x6658) = 1;
      *(undefined8 *)(lVar10 + 0x6648) = 0xdcf64850f36a4f8;
      *(undefined8 *)(lVar10 + 0x6650) = 0x7fd973a80d1aadd4;
      FUN_180505120(&LAB_1805d4830);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6648;
    if (*(char *)(lVar10 + 0x6658) != '\0') {
      FUN_180054820(lVar7,0x10,0x7fad1dcd7b5fc9bd);
      *(undefined *)(lVar10 + 0x6658) = 0;
    }
    local_2328 = ZEXT816(0);
    local_2318 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2328,lVar7);
    local_28d8 = 0x8385;
    uStack_28d6 = 0x307e;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6734) & 1) == 0) {
      *(uint *)(lVar10 + 0x6734) = *(uint *)(lVar10 + 0x6734) | 1;
      *(undefined2 *)(lVar10 + 0x72fc) = 0x1c7;
      *(undefined8 *)(lVar10 + 0x72e8) = 0x6f7a5890297497a4;
      *(undefined8 *)(lVar10 + 0x72f0) = 0x6e6e55b33250938a;
      *(undefined4 *)(lVar10 + 0x72f8) = 0x307e8385;
      FUN_180505120(&LAB_1805d4800);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x72e8;
    if (*(char *)(lVar10 + 0x72fd) != '\0') {
      FUN_180054820(lVar7,0x15,0x7393dc74711e7eb);
      *(undefined *)(lVar10 + 0x72fd) = 0;
    }
    local_2308 = ZEXT816(0);
    local_22f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2308,lVar7);
    local_28e8 = (undefined *)0xe973804004cb9a52;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0x906816d49a52);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6718) & 1) == 0) {
      *(uint *)(lVar10 + 0x6718) = *(uint *)(lVar10 + 0x6718) | 1;
      *(undefined2 *)(lVar10 + 0x6f2e) = 0x107;
      *(undefined8 *)(lVar10 + 0x6f20) = 0xe973804004cb9a52;
      *(undefined4 *)(lVar10 + 0x6f28) = 0x16d49a52;
      *(undefined2 *)(lVar10 + 0x6f2c) = 0x9068;
      FUN_180505120(&LAB_1805d47d0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6f20;
    if (*(char *)(lVar10 + 0x6f2f) != '\0') {
      FUN_180054820(lVar7,0xf,0x8107f5017dbbf511);
      *(undefined *)(lVar10 + 0x6f2f) = 0;
    }
    local_22e8 = ZEXT816(0);
    local_22d8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_22e8,lVar7);
    local_28d8 = 0x50a8;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7620) & 1) == 0) {
      *(uint *)(lVar10 + 0x7620) = *(uint *)(lVar10 + 0x7620) | 1;
      *(undefined2 *)(lVar10 + 0x6802) = 0x193;
      *(undefined8 *)(lVar10 + 0x67f0) = 0x60093fd4cefc4b84;
      *(undefined8 *)(lVar10 + 0x67f8) = 0x6b1514e6cff654b0;
      *(undefined2 *)(lVar10 + 0x6800) = 0x50a8;
      FUN_180505120(&LAB_1805d47a0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x67f0;
    if (*(char *)(lVar10 + 0x6803) != '\0') {
      FUN_180054820(lVar7,0x13,0xf7b7db1bd9327c7);
      *(undefined *)(lVar10 + 0x6803) = 0;
    }
    local_22c8 = ZEXT816(0);
    local_22b8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_22c8,lVar7);
    local_28b4 = 0;
    FUN_1800ddc70(local_19e8,&local_28b4);
    puVar11 = local_23c8;
    do {
      FUN_1800ddd60(local_19e8,&local_28e8,puVar11);
      puVar11 = puVar11 + 0x20;
    } while (puVar11 != local_22a8);
    FUN_1800dc3f0(local_868,local_2730,local_19e8);
    local_28e8 = (undefined *)0x24ea661699e1da9c;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0x661ca6f5cdae);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7480) & 1) == 0) {
      *(uint *)(lVar10 + 0x7480) = *(uint *)(lVar10 + 0x7480) | 1;
      *(undefined2 *)(lVar10 + 0x7636) = 0x19d;
      *(undefined8 *)(lVar10 + 0x7628) = 0x24ea661699e1da9c;
      *(undefined4 *)(lVar10 + 0x7630) = 0xa6f5cdae;
      *(undefined2 *)(lVar10 + 0x7634) = 0x661c;
      FUN_180505120(&LAB_1805d4770);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7628;
    if (*(char *)(lVar10 + 0x7637) != '\0') {
      FUN_180054820(lVar7,0xf,0x779d037fcf83bfcb);
      *(undefined *)(lVar10 + 0x7637) = 0;
    }
    local_2750 = ZEXT816(0);
    local_2740 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2750,lVar7);
    local_28e8 = (undefined *)0x19d3201ef394e17e;
    local_28e0 = (undefined *)CONCAT62(local_28e0._2_6_,0xe65e);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6ef8) & 1) == 0) {
      *(uint *)(lVar10 + 0x6ef8) = *(uint *)(lVar10 + 0x6ef8) | 1;
      *(undefined2 *)(lVar10 + 0x65e2) = 0x1f1;
      *(undefined8 *)(lVar10 + 0x65d8) = 0x19d3201ef394e17e;
      *(undefined2 *)(lVar10 + 0x65e0) = 0xe65e;
      FUN_180505120(&LAB_1805d4740);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x65d8;
    if (*(char *)(lVar10 + 0x65e3) != '\0') {
      FUN_180054820(lVar7,0xb,0x7dbd49499df19131);
      *(undefined *)(lVar10 + 0x65e3) = 0;
    }
    local_2770 = ZEXT816(0);
    local_2760 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2770,lVar7);
    local_28b0 = 0;
    FUN_1800ddc70(local_1a28,&local_28b0);
    FUN_1800ddd60(local_1a28,&local_28e8,local_2770);
    FUN_1800dc3f0(local_808,local_2750,local_1a28);
    local_28e8 = (undefined *)0x46f00795e6930a50;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0x7391f7841d6d);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7604) & 1) == 0) {
      *(uint *)(lVar10 + 0x7604) = *(uint *)(lVar10 + 0x7604) | 1;
      *(undefined *)(lVar10 + 0x72c6) = 1;
      *(undefined8 *)(lVar10 + 0x72b8) = 0x46f00795e6930a50;
      *(undefined4 *)(lVar10 + 0x72c0) = 0xf7841d6d;
      *(undefined2 *)(lVar10 + 0x72c4) = 0x7391;
      FUN_180505120(&LAB_1805d4710);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x72b8;
    if (*(char *)(lVar10 + 0x72c6) != '\0') {
      FUN_180054820(lVar7,0xe,0x29b373e58fe16903);
      *(undefined *)(lVar10 + 0x72c6) = 0;
    }
    local_2790 = ZEXT816(0);
    local_2780 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2790,lVar7);
    local_28d8 = 0x33b0;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7018) & 1) == 0) {
      *(uint *)(lVar10 + 0x7018) = *(uint *)(lVar10 + 0x7018) | 1;
      *(undefined2 *)(lVar10 + 0x6a3a) = 0x171;
      *(undefined8 *)(lVar10 + 0x6a28) = 0xb8fc2f9ebc153b90;
      *(undefined8 *)(lVar10 + 0x6a30) = 0x88f611858f182db2;
      *(undefined2 *)(lVar10 + 0x6a38) = 0x33b0;
      FUN_180505120(&LAB_1805d46e0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6a28;
    if (*(char *)(lVar10 + 0x6a3b) != '\0') {
      FUN_180054820(lVar7,0x13,0xeb995df1ff715fd1);
      *(undefined *)(lVar10 + 0x6a3b) = 0;
    }
    local_2628 = ZEXT816(0);
    local_2618 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2628,lVar7);
    local_28d8 = 0x6518;
    uStack_28d6 = 0xf9ae;
    uStack_28d4 = 0xd92c;
    uStack_28d2 = 0x8312;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7414) & 1) == 0) {
      *(uint *)(lVar10 + 0x7414) = *(uint *)(lVar10 + 0x7414) | 1;
      *(undefined *)(lVar10 + 0x66d8) = 1;
      *(undefined8 *)(lVar10 + 0x66c0) = 0xea01ce1ed8bf6a22;
      *(undefined8 *)(lVar10 + 0x66c8) = 0xef1acb22cf997f01;
      *(undefined8 *)(lVar10 + 0x66d0) = 0x8312d92cf9ae6518;
      FUN_180505120(&LAB_1805d46b0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x66c0;
    if (*(char *)(lVar10 + 0x66d8) != '\0') {
      FUN_180054820(lVar7,0x18,0x8373ad4dbdc90b71);
      *(undefined *)(lVar10 + 0x66d8) = 0;
    }
    local_2608 = ZEXT816(0);
    local_25f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2608,lVar7);
    local_28ac = 0;
    FUN_1800ddc70(local_1a68,&local_28ac);
    puVar11 = local_2628;
    do {
      FUN_1800ddd60(local_1a68,&local_28e8,puVar11);
      puVar11 = puVar11 + 0x20;
    } while (puVar11 != local_25e8);
    FUN_1800dc3f0(local_7a8,local_2790,local_1a68);
    local_28d8 = 0x1db9;
    uStack_28d6 = 0x6846;
    uStack_28d4 = 0xa72a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x65cc) & 1) == 0) {
      *(uint *)(lVar10 + 0x65cc) = *(uint *)(lVar10 + 0x65cc) | 1;
      *(undefined *)(lVar10 + 0x6e06) = 1;
      *(undefined8 *)(lVar10 + 0x6df0) = 0xc379d33f625d0898;
      *(undefined8 *)(lVar10 + 0x6df8) = 0xd47ad52a67460da4;
      *(undefined4 *)(lVar10 + 0x6e00) = 0x68461db9;
      *(undefined2 *)(lVar10 + 0x6e04) = 0xa72a;
      FUN_180505120(&LAB_1805d4680);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6df0;
    if (*(char *)(lVar10 + 0x6e06) != '\0') {
      FUN_180054820(lVar7,0x16,0xb129a74f0b2f6bcb);
      *(undefined *)(lVar10 + 0x6e06) = 0;
    }
    local_27b0 = ZEXT816(0);
    local_27a0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_27b0,lVar7);
    local_28d8 = 0xd124;
    uStack_28d6 = 0xf1c4;
    uStack_28d4 = 0x59d2;
    uStack_28d2 = 0xc92a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6c70) & 1) == 0) {
      *(uint *)(lVar10 + 0x6c70) = *(uint *)(lVar10 + 0x6c70) | 1;
      *(undefined *)(lVar10 + 0x67b8) = 1;
      *(undefined8 *)(lVar10 + 0x67a0) = 0xa0394ee0d0d5de1e;
      *(undefined8 *)(lVar10 + 0x67a8) = 0xa5224bdcc7f3cb3d;
      *(undefined8 *)(lVar10 + 0x67b0) = 0xc92a59d2f1c4d124;
      FUN_180505120(&LAB_1805d4650);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x67a0;
    if (*(char *)(lVar10 + 0x67b8) != '\0') {
      FUN_180054820(lVar7,0x18,0xc94b2db3b5a3bf4d);
      *(undefined *)(lVar10 + 0x67b8) = 0;
    }
    local_27d0 = ZEXT816(0);
    local_27c0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_27d0,lVar7);
    local_28a8 = 0;
    FUN_1800ddc70(local_1aa8,&local_28a8);
    FUN_1800ddd60(local_1aa8,&local_28e8,local_27d0);
    FUN_1800dc3f0(local_748,local_27b0,local_1aa8);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6e70) & 1) == 0) {
      *(uint *)(lVar10 + 0x6e70) = *(uint *)(lVar10 + 0x6e70) | 1;
      *(undefined *)(lVar10 + 0x6928) = 1;
      *(undefined8 *)(lVar10 + 0x6920) = 0x4db24dd6f68a7b67;
      FUN_180505120(&LAB_1805d4620);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6920;
    if (*(char *)(lVar10 + 0x6928) != '\0') {
      FUN_180054820(lVar7,8,0x4dc13fb38feb1737);
      *(undefined *)(lVar10 + 0x6928) = 0;
    }
    local_27f0 = ZEXT816(0);
    local_27e0 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_27f0,lVar7);
    local_28e8 = (undefined *)0x9be8338dea9ff8ed;
    local_28e0 = (undefined *)CONCAT44(local_28e0._4_4_,0x858aeeca);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6e10) & 1) == 0) {
      *(uint *)(lVar10 + 0x6e10) = *(uint *)(lVar10 + 0x6e10) | 1;
      *(undefined *)(lVar10 + 0x64a4) = 1;
      *(undefined8 *)(lVar10 + 0x6498) = 0x9be8338dea9ff8ed;
      *(undefined4 *)(lVar10 + 0x64a0) = 0x858aeeca;
      FUN_180505120(&LAB_1805d45f0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6498;
    if (*(char *)(lVar10 + 0x64a4) != '\0') {
      FUN_180054820(lVar7,0xc,0xf9a947ff85ef9dbf);
      *(undefined *)(lVar10 + 0x64a4) = 0;
    }
    local_2668 = ZEXT816(0);
    local_2658 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2668,lVar7);
    local_28e8 = (undefined *)0xe76c91afb6af8ad1;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0xe5ee8fba9cf6);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7214) & 1) == 0) {
      *(uint *)(lVar10 + 0x7214) = *(uint *)(lVar10 + 0x7214) | 1;
      *(undefined *)(lVar10 + 0x72ae) = 1;
      *(undefined8 *)(lVar10 + 0x72a0) = 0xe76c91afb6af8ad1;
      *(undefined4 *)(lVar10 + 0x72a8) = 0x8fba9cf6;
      *(undefined2 *)(lVar10 + 0x72ac) = 0xe5ee;
      FUN_180505120(&LAB_1805d45c0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x72a0;
    if (*(char *)(lVar10 + 0x72ae) != '\0') {
      FUN_180054820(lVar7,0xe,0x852de5ddd9dfef83);
      *(undefined *)(lVar10 + 0x72ae) = 0;
    }
    local_2648 = ZEXT816(0);
    local_2638 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2648,lVar7);
    local_28a4 = 0;
    FUN_1800ddc70(local_1ae8,&local_28a4);
    puVar11 = local_2668;
    do {
      FUN_1800ddd60(local_1ae8,&local_28e8,puVar11);
      puVar11 = puVar11 + 0x20;
    } while (puVar11 != local_2628);
    FUN_1800dc3f0(local_6e8,local_27f0,local_1ae8);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6444) & 1) == 0) {
      *(uint *)(lVar10 + 0x6444) = *(uint *)(lVar10 + 0x6444) | 1;
      *(undefined *)(lVar10 + 0x76b8) = 1;
      *(undefined8 *)(lVar10 + 0x76b0) = 0x9b1e9ae07ad7547c;
      FUN_180505120(&LAB_1805d4590);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x76b0;
    if (*(char *)(lVar10 + 0x76b8) != '\0') {
      FUN_180054820(lVar7,8,0x9b77efa71fa53b3f);
      *(undefined *)(lVar10 + 0x76b8) = 0;
    }
    local_2810 = ZEXT816(0);
    local_2800 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2810,lVar7);
    local_28e8 = (undefined *)0x4e4face6d0b8f42f;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0xbbdadda0fb1e);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x75fc) & 1) == 0) {
      *(uint *)(lVar10 + 0x75fc) = *(uint *)(lVar10 + 0x75fc) | 1;
      *(undefined2 *)(lVar10 + 0x740e) = 0x13d;
      *(undefined8 *)(lVar10 + 0x7400) = 0x4e4face6d0b8f42f;
      *(undefined4 *)(lVar10 + 0x7408) = 0xdda0fb1e;
      *(undefined2 *)(lVar10 + 0x740c) = 0xbbda;
      FUN_180505120(&LAB_1805d4560);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7400;
    if (*(char *)(lVar10 + 0x740f) != '\0') {
      FUN_180054820(lVar7,0xf,0x2b3dcfb5b5d3957b);
      *(undefined *)(lVar10 + 0x740f) = 0;
    }
    local_24c8 = ZEXT816(0);
    local_24b8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_24c8,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6da0) & 1) == 0) {
      *(uint *)(lVar10 + 0x6da0) = *(uint *)(lVar10 + 0x6da0) | 1;
      *(undefined *)(lVar10 + 0x6278) = 1;
      *(undefined8 *)(lVar10 + 0x6268) = 0xf4dfdc8d5ee03eb7;
      *(undefined8 *)(lVar10 + 0x6270) = 0x91ead7885df53e80;
      FUN_180505120(&LAB_1805d4530);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6268;
    if (*(char *)(lVar10 + 0x6278) != '\0') {
      FUN_180054820(lVar7,0x10,0x918db9e1398751e3);
      *(undefined *)(lVar10 + 0x6278) = 0;
    }
    local_24a8 = ZEXT816(0);
    local_2498 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_24a8,lVar7);
    local_28d8 = 0xe322;
    uStack_28d6 = 0xf093;
    uStack_28d4 = 0x1b65;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6e68) & 1) == 0) {
      *(uint *)(lVar10 + 0x6e68) = *(uint *)(lVar10 + 0x6e68) | 1;
      *(undefined *)(lVar10 + 0x7536) = 1;
      *(undefined8 *)(lVar10 + 0x7520) = 0x30bb7844fb92ff02;
      *(undefined8 *)(lVar10 + 0x7528) = 0x13ba6f78fd84e128;
      *(undefined4 *)(lVar10 + 30000) = 0xf093e322;
      *(undefined2 *)(lVar10 + 0x7534) = 0x1b65;
      FUN_180505120(&LAB_1805d4500);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7520;
    if (*(char *)(lVar10 + 0x7536) != '\0') {
      FUN_180054820(lVar7,0x16,0x55c91b1795f78f4d);
      *(undefined *)(lVar10 + 0x7536) = 0;
    }
    local_2488 = ZEXT816(0);
    local_2478 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2488,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7580) & 1) == 0) {
      *(uint *)(lVar10 + 0x7580) = *(uint *)(lVar10 + 0x7580) | 1;
      *(undefined2 *)(lVar10 + 0x6e28) = 0x11d;
      *(undefined8 *)(lVar10 + 0x6e18) = 0xf6efc29fdbbcab52;
      *(undefined8 *)(lVar10 + 0x6e20) = 0xe1eecfa5da9fa872;
      FUN_180505120(&LAB_1805d44d0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6e18;
    if (*(char *)(lVar10 + 0x6e29) != '\0') {
      FUN_180054820(lVar7,0x11,0x938babc9b5d9db1d);
      *(undefined *)(lVar10 + 0x6e29) = 0;
    }
    local_2468 = ZEXT816(0);
    local_2458 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2468,lVar7);
    local_28a0 = 0;
    FUN_1800ddc70(local_1b28,&local_28a0);
    puVar11 = local_24c8;
    do {
      FUN_1800ddd60(local_1b28,&local_28e8,puVar11);
      puVar11 = puVar11 + 0x20;
    } while (puVar11 != local_2448);
    FUN_1800dc3f0(local_688,local_2810,local_1b28);
    local_28e8 = (undefined *)0xc8309449102fd626;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0xed581620c107);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6e34) & 1) == 0) {
      *(uint *)(lVar10 + 0x6e34) = *(uint *)(lVar10 + 0x6e34) | 1;
      *(undefined *)(lVar10 + 0x6d5e) = 1;
      *(undefined8 *)(lVar10 + 0x6d50) = 0xc8309449102fd626;
      *(undefined4 *)(lVar10 + 0x6d58) = 0x1620c107;
      *(undefined2 *)(lVar10 + 0x6d5c) = 0xed58;
      FUN_180505120(&LAB_1805d44a0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6d50;
    if (*(char *)(lVar10 + 0x6d5e) != '\0') {
      FUN_180054820(lVar7,0xe,0xad63ed3d7549b775);
      *(undefined *)(lVar10 + 0x6d5e) = 0;
    }
    local_2830 = ZEXT816(0);
    local_2820 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2830,lVar7);
    local_28e8 = (undefined *)0x285ca1616660a33;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0xdd2a1b7e0502);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7488) & 1) == 0) {
      *(uint *)(lVar10 + 0x7488) = *(uint *)(lVar10 + 0x7488) | 1;
      *(undefined2 *)(lVar10 + 0x639e) = 0x1f7;
      *(undefined8 *)(lVar10 + 0x6390) = 0x285ca1616660a33;
      *(undefined4 *)(lVar10 + 0x6398) = 0x1b7e0502;
      *(undefined2 *)(lVar10 + 0x639c) = 0xdd2a;
      FUN_180505120(&LAB_1805d4470);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6390;
    if (*(char *)(lVar10 + 0x639f) != '\0') {
      FUN_180054820(lVar7,0xf,0x67f7a945730d6b67);
      *(undefined *)(lVar10 + 0x639f) = 0;
    }
    local_2850 = ZEXT816(0);
    local_2840 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2850,lVar7);
    local_289c = 0;
    FUN_1800ddc70(local_1b68,&local_289c);
    FUN_1800ddd60(local_1b68,&local_28e8,local_2850);
    FUN_1800dc3f0(local_628,local_2830,local_1b68);
    local_28e8 = (undefined *)0xace90f54e2b6b8c0;
    local_28e0 = (undefined *)CONCAT62(local_28e0._2_6_,0xa8e4);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x677c) & 1) == 0) {
      *(uint *)(lVar10 + 0x677c) = *(uint *)(lVar10 + 0x677c) | 1;
      *(undefined2 *)(lVar10 + 0x7672) = 0x1df;
      *(undefined8 *)(lVar10 + 0x7668) = 0xace90f54e2b6b8c0;
      *(undefined2 *)(lVar10 + 0x7670) = 0xa8e4;
      FUN_180505120(&LAB_1805d4440);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7668;
    if (*(char *)(lVar10 + 0x7673) != '\0') {
      FUN_180054820(lVar7,0xb,0xc59f7d31b1dfcd87);
      *(undefined *)(lVar10 + 0x7673) = 0;
    }
    local_2870 = ZEXT816(0);
    local_2860 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2870,lVar7);
    local_28d8 = 0xe170;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x76ec) & 1) == 0) {
      *(uint *)(lVar10 + 0x76ec) = *(uint *)(lVar10 + 0x76ec) | 1;
      *(undefined *)(lVar10 + 0x6752) = 1;
      *(undefined8 *)(lVar10 + 0x6740) = 0x64d0ab6f4b329148;
      *(undefined8 *)(lVar10 + 0x6748) = 0x7cdbb74472258474;
      *(undefined2 *)(lVar10 + 0x6750) = 0xe170;
      FUN_180505120(&LAB_1805d4410);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6740;
    if (*(char *)(lVar10 + 0x6752) != '\0') {
      FUN_180054820(lVar7,0x12,0x13bfd92d2557e107);
      *(undefined *)(lVar10 + 0x6752) = 0;
    }
    local_2548 = ZEXT816(0);
    local_2538 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2548,lVar7);
    local_28d8 = 0x2d8c;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6fa0) & 1) == 0) {
      *(uint *)(lVar10 + 0x6fa0) = *(uint *)(lVar10 + 0x6fa0) | 1;
      *(undefined *)(lVar10 + 0x6882) = 1;
      *(undefined8 *)(lVar10 + 0x6870) = 0x9c23ee5d5d665dba;
      *(undefined8 *)(lVar10 + 0x6878) = 0x943bfd76454c4883;
      *(undefined2 *)(lVar10 + 0x6880) = 0x2d8c;
      FUN_180505120(&LAB_1805d43e0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6870;
    if (*(char *)(lVar10 + 0x6882) != '\0') {
      FUN_180054820(lVar7,0x12,0xf5578f1333032df5);
      *(undefined *)(lVar10 + 0x6882) = 0;
    }
    local_2528 = ZEXT816(0);
    local_2518 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2528,lVar7);
    local_28d8 = 0xafb2;
    uStack_28d6 = 0x8430;
    uStack_28d4 = 0xf785;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x74e8) & 1) == 0) {
      *(uint *)(lVar10 + 0x74e8) = *(uint *)(lVar10 + 0x74e8) | 1;
      *(undefined *)(lVar10 + 0x6ab6) = 1;
      *(undefined8 *)(lVar10 + 0x6aa0) = 0x7408948f8a36a991;
      *(undefined8 *)(lVar10 + 0x6aa8) = 0x640091829f3695a7;
      *(undefined4 *)(lVar10 + 0x6ab0) = 0x8430afb2;
      *(undefined2 *)(lVar10 + 0x6ab4) = 0xf785;
      FUN_180505120(&LAB_1805d43b0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6aa0;
    if (*(char *)(lVar10 + 0x6ab6) != '\0') {
      FUN_180054820(lVar7,0x16,0x769f7ebeb59dbd3);
      *(undefined *)(lVar10 + 0x6ab6) = 0;
    }
    local_2508 = ZEXT816(0);
    local_24f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2508,lVar7);
    local_28d8 = 0x7c71;
    uStack_28d6 = 0xfa8e;
    uStack_28d4 = 0xaea7;
    uStack_28d2 = 0xef12;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6838) & 1) == 0) {
      *(uint *)(lVar10 + 0x6838) = *(uint *)(lVar10 + 0x6838) | 1;
      *(undefined2 *)(lVar10 + 0x6468) = 0x105;
      *(undefined8 *)(lVar10 + 0x6450) = 0xe906b3baf9895056;
      *(undefined8 *)(lVar10 + 0x6458) = 0xf108aebdf9984664;
      *(undefined8 *)(lVar10 + 0x6460) = 0xef12aea7fa8e7c71;
      FUN_180505120(&LAB_1805d4380);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6450;
    if (*(char *)(lVar10 + 0x6469) != '\0') {
      FUN_180054820(lVar7,0x19,0x8165c1cfa9fd3505);
      *(undefined *)(lVar10 + 0x6469) = 0;
    }
    local_24e8 = ZEXT816(0);
    local_24d8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_24e8,lVar7);
    local_2898[0] = 0;
    FUN_1800ddc70(local_1ba8,local_2898);
    puVar11 = local_2548;
    do {
      FUN_1800ddd60(local_1ba8,&local_28e8,puVar11);
      puVar11 = puVar11 + 0x20;
    } while (puVar11 != local_24c8);
    FUN_1800dc3f0(local_5c8,local_2870,local_1ba8);
    local_28e8 = (undefined *)0xb8862f10ee470693;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0x241aec5f1dba);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x66dc) & 1) == 0) {
      *(uint *)(lVar10 + 0x66dc) = *(uint *)(lVar10 + 0x66dc) | 1;
      *(undefined2 *)(lVar10 + 0x6c6e) = 0x1e1;
      *(undefined8 *)(lVar10 + 0x6c60) = 0xb8862f10ee470693;
      *(undefined4 *)(lVar10 + 0x6c68) = 0xec5f1dba;
      *(undefined2 *)(lVar10 + 0x6c6c) = 0x241a;
      FUN_180505120(&LAB_1805d4350);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6c60;
    if (*(char *)(lVar10 + 0x6c6f) != '\0') {
      FUN_180054820(lVar7,0xf,0xebe1417985296fdf);
      *(undefined *)(lVar10 + 0x6c6f) = 0;
    }
    local_2890 = ZEXT816(0);
    local_2880 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2890,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6888) & 1) == 0) {
      *(uint *)(lVar10 + 0x6888) = *(uint *)(lVar10 + 0x6888) | 1;
      *(undefined *)(lVar10 + 0x73e8) = 1;
      *(undefined8 *)(lVar10 + 0x73e0) = 0x6f3173d07d407762;
      FUN_180505120(&LAB_1805d4320);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x73e0;
    if (*(char *)(lVar10 + 0x73e8) != '\0') {
      FUN_180054820(lVar7,8,0x6f5d01851325072d);
      *(undefined *)(lVar10 + 0x73e8) = 0;
    }
    local_22a8 = ZEXT816(0);
    local_2298 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_22a8,lVar7);
    local_28e8 = (undefined *)0x29bcfd3eb045502f;
    local_28e0 = (undefined *)CONCAT62(local_28e0._2_6_,0x3507);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6e30) & 1) == 0) {
      *(uint *)(lVar10 + 0x6e30) = *(uint *)(lVar10 + 0x6e30) | 1;
      *(undefined *)(lVar10 + 0x7092) = 1;
      *(undefined8 *)(lVar10 + 0x7088) = 0x29bcfd3eb045502f;
      *(undefined2 *)(lVar10 + 0x7090) = 0x3507;
      FUN_180505120(&LAB_1805d42f0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7088;
    if (*(char *)(lVar10 + 0x7092) != '\0') {
      FUN_180054820(lVar7,10,0x5be9895dd531356b);
      *(undefined *)(lVar10 + 0x7092) = 0;
    }
    local_2288 = ZEXT816(0);
    local_2278 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2288,lVar7);
    local_28e8 = (undefined *)0xf247364dc329cc9;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0x6b65e0348cd7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x76bc) & 1) == 0) {
      *(uint *)(lVar10 + 0x76bc) = *(uint *)(lVar10 + 0x76bc) | 1;
      *(undefined2 *)(lVar10 + 0x68e6) = 0x141;
      *(undefined8 *)(lVar10 + 0x68d8) = 0xf247364dc329cc9;
      *(undefined4 *)(lVar10 + 0x68e0) = 0xe0348cd7;
      *(undefined2 *)(lVar10 + 0x68e4) = 0x6b65;
      FUN_180505120(&LAB_1805d42c0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x68d8;
    if (*(char *)(lVar10 + 0x68e7) != '\0') {
      FUN_180054820(lVar7,0xf,0x7d410717b555f99b);
      *(undefined *)(lVar10 + 0x68e7) = 0;
    }
    local_2268 = ZEXT816(0);
    local_2258 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2268,lVar7);
    local_28d8 = 0xa1f4;
    uStack_28d6 = 0x4de8;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x75c8) & 1) == 0) {
      *(uint *)(lVar10 + 0x75c8) = *(uint *)(lVar10 + 0x75c8) | 1;
      *(undefined *)(lVar10 + 0x6a7c) = 1;
      *(undefined8 *)(lVar10 + 0x6a68) = 0x6848a9093ff0a7c2;
      *(undefined8 *)(lVar10 + 0x6a70) = 0x7f54891809fda1c4;
      *(undefined4 *)(lVar10 + 0x6a78) = 0x4de8a1f4;
      FUN_180505120(&LAB_1805d4290);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6a68;
    if (*(char *)(lVar10 + 0x6a7c) != '\0') {
      FUN_180054820(lVar7,0x14,0x93de57d4d91d391);
      *(undefined *)(lVar10 + 0x6a7c) = 0;
    }
    local_2248 = ZEXT816(0);
    local_2238 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2248,lVar7);
    local_28d8 = 0xae83;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x747c) & 1) == 0) {
      *(uint *)(lVar10 + 0x747c) = *(uint *)(lVar10 + 0x747c) | 1;
      *(undefined2 *)(lVar10 + 0x69e2) = 0x145;
      *(undefined8 *)(lVar10 + 0x69d0) = 0x26a4901b552aa3a2;
      *(undefined8 *)(lVar10 + 0x69d8) = 0x16b38c3b4001bb83;
      *(undefined2 *)(lVar10 + 0x69e0) = 0xae83;
      FUN_180505120(&LAB_1805d4260);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x69d0;
    if (*(char *)(lVar10 + 0x69e3) != '\0') {
      FUN_180054820(lVar7,0x13,0x73c5e5572545d7f1);
      *(undefined *)(lVar10 + 0x69e3) = 0;
    }
    local_2228 = ZEXT816(0);
    local_2218 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2228,lVar7);
    local_28d8 = 0x8ba2;
    uStack_28d6 = 0x5fd1;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x7390) & 1) == 0) {
      *(uint *)(lVar10 + 0x7390) = *(uint *)(lVar10 + 0x7390) | 1;
      *(undefined *)(lVar10 + 0x6dbc) = 1;
      *(undefined8 *)(lVar10 + 0x6da8) = 0x729f15d42bc88cb0;
      *(undefined8 *)(lVar10 + 0x6db0) = 0x6eac13de2bd59eb0;
      *(undefined4 *)(lVar10 + 0x6db8) = 0x5fd18ba2;
      FUN_180505120(&LAB_1805d4230);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6da8;
    if (*(char *)(lVar10 + 0x6dbc) != '\0') {
      FUN_180054820(lVar7,0x14,0x1dcb7db75fa1fbe3);
      *(undefined *)(lVar10 + 0x6dbc) = 0;
    }
    local_2208 = ZEXT816(0);
    local_21f8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2208,lVar7);
    local_28d8 = 0xd858;
    uStack_28d6 = 0x33ff;
    uStack_28d4 = 0x99c4;
    uStack_28d2 = 0xa80c;
    local_28d0 = 0x47fbcd4a;
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x73dc) & 1) == 0) {
      *(uint *)(lVar10 + 0x73dc) = *(uint *)(lVar10 + 0x73dc) | 1;
      *(undefined *)(lVar10 + 0x75a4) = 1;
      *(undefined8 *)(lVar10 + 0x7588) = 0xa81f85c237fbc858;
      *(undefined8 *)(lVar10 + 0x7590) = 0xb43f9fce33e2ca58;
      *(undefined8 *)(lVar10 + 0x7598) = 0xa80c99c433ffd858;
      *(undefined4 *)(lVar10 + 0x75a0) = 0x47fbcd4a;
      FUN_180505120(&LAB_1805d4200);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7588;
    if (*(char *)(lVar10 + 0x75a4) != '\0') {
      FUN_180054820(lVar7,0x1c,0xdb6bf7ad478bbd0b);
      *(undefined *)(lVar10 + 0x75a4) = 0;
    }
    local_21e8 = ZEXT816(0);
    local_21d8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_21e8,lVar7);
    local_28e8 = (undefined *)0x4dcd72aa71c15a30;
    local_28e0 = (undefined *)CONCAT26(local_28e0._6_2_,0x1a74fe05e02);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x77a0) & 1) == 0) {
      *(uint *)(lVar10 + 0x77a0) = *(uint *)(lVar10 + 0x77a0) | 1;
      *(undefined *)(lVar10 + 0x6cfe) = 1;
      *(undefined8 *)(lVar10 + 0x6cf0) = 0x4dcd72aa71c15a30;
      *(undefined4 *)(lVar10 + 0x6cf8) = 0x4fe05e02;
      *(undefined2 *)(lVar10 + 0x6cfc) = 0x1a7;
      FUN_180505120(&LAB_1805d41d0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6cf0;
    if (*(char *)(lVar10 + 0x6cfe) != '\0') {
      FUN_180054820(lVar7,0xe,0x1b901cb3db53f77);
      *(undefined *)(lVar10 + 0x6cfe) = 0;
    }
    local_21c8 = ZEXT816(0);
    local_21b8 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_21c8,lVar7);
    local_28d8 = 0x610e;
    uStack_28d6 = 0x2ed5;
    uStack_28d4 = 0x4837;
    uStack_28d2 = 0x7be;
    local_28d0 = CONCAT22(local_28d0._2_2_,0xf07);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x76f4) & 1) == 0) {
      *(uint *)(lVar10 + 0x76f4) = *(uint *)(lVar10 + 0x76f4) | 1;
      *(undefined *)(lVar10 + 0x6a62) = 1;
      *(undefined8 *)(lVar10 + 0x6a48) = 0x19a84b3706c56a2c;
      *(undefined8 *)(lVar10 + 0x6a50) = 0x259f5c380bc36e0e;
      *(undefined8 *)(lVar10 + 0x6a58) = 0x7be48372ed5610e;
      *(undefined2 *)(lVar10 + 0x6a60) = 0xf07;
      FUN_180505120(&LAB_1805d41a0);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6a48;
    if (*(char *)(lVar10 + 0x6a62) != '\0') {
      FUN_180054820(lVar7,0x1a,0x75eb2f5947b10f6b);
      *(undefined *)(lVar10 + 0x6a62) = 0;
    }
    local_21a8 = ZEXT816(0);
    local_2198 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_21a8,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6cc4) & 1) == 0) {
      *(uint *)(lVar10 + 0x6cc4) = *(uint *)(lVar10 + 0x6cc4) | 1;
      *(undefined *)(lVar10 + 0x6558) = 1;
      *(undefined8 *)(lVar10 + 0x6548) = 0x32eeabc9fde81ef6;
      *(undefined8 *)(lVar10 + 0x6550) = 0x55ef9cd7eac91ed6;
      FUN_180505120(&LAB_1805d4170);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x6548;
    if (*(char *)(lVar10 + 0x6558) != '\0') {
      FUN_180054820(lVar7,0x10,0x558bf9a58fbd6dbf);
      *(undefined *)(lVar10 + 0x6558) = 0;
    }
    local_2188 = ZEXT816(0);
    local_2178 = ZEXT816(0);
    lVar10 = -1;
    do {
      lVar10 = lVar10 + 1;
    } while (*(char *)(lVar7 + lVar10) != '\0');
    FUN_180059160(local_2188,lVar7);
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    if ((*(uint *)(lVar10 + 0x6f9c) & 1) == 0) {
      *(uint *)(lVar10 + 0x6f9c) = *(uint *)(lVar10 + 0x6f9c) | 1;
      *(undefined *)(lVar10 + 0x7260) = 1;
      *(undefined8 *)(lVar10 + 0x7258) = 0x5d1f21f02f023944;
      FUN_180505120(&LAB_1805d4140);
    }
    lVar10 = *(longlong *)((longlong)pvVar1 + uVar5 * 8);
    lVar7 = lVar10 + 0x7258;
    if (*(char *)(lVar10 + 0x7260) != '\0') {
      FUN_180054820(lVar7,8,0x5d5373a54167492b);
      *(undefined *)(lVar10 + 0x7260) = 0;
    }
    local_2168 = ZEXT816(0);
    local_2158 = ZEXT816(0);
    do {
      lVar6 = lVar6 + 1;
    } while (*(char *)(lVar7 + lVar6) != '\0');
    FUN_180059160(local_2168,lVar7,lVar6);
    local_28e8 = local_22a8;
    local_28e0 = local_2148;
    FUN_1800dd910(local_1448,&local_28e8);
    FUN_1800dc3f0(local_568,local_2890,local_1448);
    uVar2 = FUN_1800d7d20();
    uVar2 = FUN_1800dd7d0(uVar2);
    uVar2 = FUN_180059120(local_1c28,uVar2);
    uVar3 = FUN_1800d7d90();
    uVar3 = FUN_1800dd7a0(uVar3);
    FUN_180059120(local_16c8,uVar3);
    uVar3 = FUN_1800d7e10();
    uVar3 = FUN_1800dd770(uVar3);
    FUN_180059120(local_16a8,uVar3);
    uVar3 = FUN_1800d7e80();
    uVar3 = FUN_1800dd740(uVar3);
    FUN_180059120(local_1688,uVar3);
    uVar3 = FUN_1800d7ee0();
    uVar3 = FUN_1800dd710(uVar3);
    FUN_180059120(local_1668,uVar3);
    local_28e8 = local_16c8;
    local_28e0 = local_1648;
    FUN_1800dd910(local_1488,&local_28e8);
    FUN_1800dc3f0(local_508,uVar2,local_1488);
    uVar2 = FUN_1800d7f40();
    uVar2 = FUN_1800dd6e0(uVar2);
    uVar2 = FUN_180059120(local_1c48,uVar2);
    uVar3 = FUN_1800d7fd0();
    uVar3 = FUN_1800dd6b0(uVar3);
    FUN_180059120(local_1248,uVar3);
    uVar3 = FUN_1800d8050();
    uVar3 = FUN_1800dd680(uVar3);
    FUN_180059120(local_1228,uVar3);
    uVar3 = FUN_1800d80b0();
    uVar3 = FUN_1800dd650(uVar3);
    FUN_180059120(local_1208,uVar3);
    uVar3 = FUN_1800d8130();
    uVar3 = FUN_1800dd620(uVar3);
    FUN_180059120(local_11e8,uVar3);
    uVar3 = FUN_1800d8190();
    uVar3 = FUN_1800dd5f0(uVar3);
    FUN_180059120(local_11c8,uVar3);
    uVar3 = FUN_1800d8210();
    uVar3 = FUN_1800dd5c0(uVar3);
    FUN_180059120(local_11a8,uVar3);
    uVar3 = FUN_1800d8280();
    uVar3 = FUN_1800dd590(uVar3);
    FUN_180059120(local_1188,uVar3);
    local_28e8 = local_1248;
    local_28e0 = local_1168;
    FUN_1800dd910(local_14c8,&local_28e8);
    FUN_1800dc3f0(local_4a8,uVar2,local_14c8);
    uVar2 = FUN_1800d8310();
    uVar2 = FUN_1800dd560(uVar2);
    uVar2 = FUN_180059120(local_1c68,uVar2);
    uVar3 = FUN_1800d8390();
    uVar3 = FUN_1800dd530(uVar3);
    FUN_180059120(local_1748,uVar3);
    uVar3 = FUN_1800d8410();
    uVar3 = FUN_1800a70e0(uVar3);
    FUN_180059120(local_1728,uVar3);
    uVar3 = FUN_1800d8470();
    uVar3 = FUN_1800dd500(uVar3);
    FUN_180059120(local_1708,uVar3);
    uVar3 = FUN_1800d84e0();
    uVar3 = FUN_1800dd4d0(uVar3);
    FUN_180059120(local_16e8,uVar3);
    local_28e8 = local_1748;
    local_28e0 = local_16c8;
    FUN_1800dd910(local_1508,&local_28e8);
    FUN_1800dc3f0(local_448,uVar2,local_1508);
    uVar2 = FUN_1800d8570();
    uVar2 = FUN_1800dd4a0(uVar2);
    uVar2 = FUN_180059120(local_17e8,uVar2);
    uVar3 = FUN_1800d8630();
    uVar3 = FUN_1800c6c00(uVar3);
    FUN_180059120(local_2568,uVar3);
    local_28e8 = local_2568;
    local_28e0 = local_2548;
    FUN_1800dd910(local_1548,&local_28e8);
    FUN_1800dc3f0(local_3e8,uVar2,local_1548);
    uVar2 = FUN_1800d86a0();
    uVar2 = FUN_1800dd470(uVar2);
    uVar2 = FUN_180059120(local_1808,uVar2);
    uVar3 = FUN_1800d8710();
    uVar3 = FUN_1800dd440(uVar3);
    FUN_180059120(local_1168,uVar3);
    uVar3 = FUN_1800d87a0();
    uVar3 = FUN_1800dd410(uVar3);
    FUN_180059120(local_1148,uVar3);
    uVar3 = FUN_1800d8820();
    uVar3 = FUN_1800dd3e0(uVar3);
    FUN_180059120(local_1128,uVar3);
    uVar3 = FUN_1800d8890();
    uVar3 = FUN_1800dd3b0(uVar3);
    FUN_180059120(local_1108,uVar3);
    uVar3 = FUN_1800d8920();
    uVar3 = FUN_1800dd380(uVar3);
    FUN_180059120(local_10e8,uVar3);
    uVar3 = FUN_1800d89c0();
    uVar3 = FUN_1800dd350(uVar3);
    FUN_180059120(local_10c8,uVar3);
    uVar3 = FUN_1800d8a60();
    uVar3 = FUN_1800dd320(uVar3);
    FUN_180059120(local_10a8,uVar3);
    uVar3 = FUN_1800d8b20();
    uVar3 = FUN_1800dd2f0(uVar3);
    FUN_180059120(local_1088,uVar3);
    uVar3 = FUN_1800d8bb0();
    uVar3 = FUN_1800dd2c0(uVar3);
    FUN_180059120(local_1068,uVar3);
    uVar3 = FUN_1800d8c70();
    uVar3 = FUN_1800dd290(uVar3);
    FUN_180059120(local_1048,uVar3);
    uVar3 = FUN_1800d8cf0();
    uVar3 = FUN_1800a3140(uVar3);
    FUN_180059120(local_1028,uVar3);
    uVar3 = FUN_1800d8d60();
    uVar3 = FUN_1800dd260(uVar3);
    FUN_180059120(local_1008,uVar3);
    uVar3 = FUN_1800d8dd0();
    uVar3 = FUN_1800dd230(uVar3);
    FUN_180059120(local_fe8,uVar3);
    uVar3 = FUN_1800d8e50();
    uVar3 = FUN_1800dd200(uVar3);
    FUN_180059120(local_fc8,uVar3);
    uVar3 = FUN_1800d8ef0();
    uVar3 = FUN_1800dd1d0(uVar3);
    FUN_180059120(local_fa8,uVar3);
    uVar3 = FUN_1800d8fa0();
    uVar3 = FUN_1800dd1a0(uVar3);
    FUN_180059120(local_f88,uVar3);
    uVar3 = FUN_1800d9040();
    uVar3 = FUN_1800dd170(uVar3);
    FUN_180059120(local_f68,uVar3);
    uVar3 = FUN_1800d9100();
    uVar3 = FUN_1800dd140(uVar3);
    FUN_180059120(local_f48,uVar3);
    uVar3 = FUN_1800d91a0();
    uVar3 = FUN_1800bda30(uVar3);
    FUN_180059120(local_f28,uVar3);
    uVar3 = FUN_1800d9220();
    uVar3 = FUN_1800dd110(uVar3);
    FUN_180059120(local_f08,uVar3);
    uVar3 = FUN_1800d92e0();
    uVar3 = FUN_1800dd0e0(uVar3);
    FUN_180059120(local_ee8,uVar3);
    uVar3 = FUN_1800d9390();
    uVar3 = FUN_1800dd0b0(uVar3);
    FUN_180059120(local_ec8,uVar3);
    uVar3 = FUN_1800d9440();
    uVar3 = FUN_1800dd080(uVar3);
    FUN_180059120(local_ea8,uVar3);
    uVar3 = FUN_1800d94e0();
    uVar3 = FUN_1800dd050(uVar3);
    FUN_180059120(local_e88,uVar3);
    uVar3 = FUN_1800d9590();
    uVar3 = FUN_1800dd020(uVar3);
    FUN_180059120(local_e68,uVar3);
    uVar3 = FUN_1800d9670();
    uVar3 = FUN_1800dcff0(uVar3);
    FUN_180059120(local_e48,uVar3);
    uVar3 = FUN_1800d96f0();
    uVar3 = FUN_1800dcfc0(uVar3);
    FUN_180059120(local_e28,uVar3);
    uVar3 = FUN_1800d97a0();
    uVar3 = FUN_1800dcf90(uVar3);
    FUN_180059120(local_e08,uVar3);
    local_28e8 = local_1168;
    local_28e0 = local_de8;
    FUN_1800dd910(local_1588,&local_28e8);
    FUN_1800dc3f0(local_388,uVar2,local_1588);
    uVar2 = FUN_1800d9810();
    uVar2 = FUN_1800dcf60(uVar2);
    uVar2 = FUN_180059120(local_1828,uVar2);
    uVar3 = FUN_1800d9880();
    uVar3 = FUN_1800dcf30(uVar3);
    FUN_180059120(local_17c8,uVar3);
    uVar3 = FUN_1800d9930();
    uVar3 = FUN_1800dcf00(uVar3);
    FUN_180059120(local_17a8,uVar3);
    uVar3 = FUN_1800d99d0();
    uVar3 = FUN_1800dced0(uVar3);
    FUN_180059120(local_1788,uVar3);
    uVar3 = FUN_1800d9a70();
    uVar3 = FUN_1800dcea0(uVar3);
    FUN_180059120(local_1768,uVar3);
    local_28e8 = local_17c8;
    local_28e0 = local_1748;
    FUN_1800dd910(local_15c8,&local_28e8);
    FUN_1800dc3f0(local_328,uVar2,local_15c8);
    uVar2 = FUN_1800d9b30();
    uVar2 = FUN_1800dce70(uVar2);
    uVar2 = FUN_180059120(local_1848,uVar2);
    uVar3 = FUN_1800d9bc0();
    uVar3 = FUN_1800dce40(uVar3);
    FUN_180059120(local_de8,uVar3);
    uVar3 = FUN_1800d9c60();
    uVar3 = FUN_1800dce10(uVar3);
    FUN_180059120(local_dc8,uVar3);
    uVar3 = FUN_1800d9d00();
    uVar3 = FUN_1800dcde0(uVar3);
    FUN_180059120(local_da8,uVar3);
    uVar3 = FUN_1800d9da0();
    uVar3 = FUN_1800dcdb0(uVar3);
    FUN_180059120(local_d88,uVar3);
    uVar3 = FUN_1800d9e40();
    uVar3 = FUN_1800b8010(uVar3);
    FUN_180059120(local_d68,uVar3);
    uVar3 = FUN_1800d9f00();
    uVar3 = FUN_1800dcd80(uVar3);
    FUN_180059120(local_d48,uVar3);
    uVar3 = FUN_1800d9f90();
    uVar3 = FUN_1800dcd50(uVar3);
    FUN_180059120(local_d28,uVar3);
    uVar3 = FUN_1800da030();
    uVar3 = FUN_1800dcd20(uVar3);
    FUN_180059120(local_d08,uVar3);
    uVar3 = FUN_1800da0e0();
    uVar3 = FUN_1800dccf0(uVar3);
    FUN_180059120(local_ce8,uVar3);
    uVar3 = FUN_1800da170();
    uVar3 = FUN_1800630d0(uVar3);
    FUN_180059120(local_cc8,uVar3);
    uVar3 = FUN_1800da200();
    uVar3 = FUN_1800dccc0(uVar3);
    FUN_180059120(local_ca8,uVar3);
    uVar3 = FUN_1800da290();
    uVar3 = FUN_1800dcc90(uVar3);
    FUN_180059120(local_c88,uVar3);
    uVar3 = FUN_1800da330();
    uVar3 = FUN_1800dcc60(uVar3);
    FUN_180059120(local_c68,uVar3);
    uVar3 = FUN_1800da3c0();
    uVar3 = FUN_1800dcc30(uVar3);
    FUN_180059120(local_c48,uVar3);
    uVar3 = FUN_1800da460();
    uVar3 = FUN_1800dcc00(uVar3);
    FUN_180059120(local_c28,uVar3);
    uVar3 = FUN_1800da500();
    uVar3 = FUN_1800dcbd0(uVar3);
    FUN_180059120(local_c08,uVar3);
    uVar3 = FUN_1800da5a0();
    uVar3 = FUN_1800dcba0(uVar3);
    FUN_180059120(local_be8,uVar3);
    uVar3 = FUN_1800da620();
    uVar3 = FUN_1800dcb70(uVar3);
    FUN_180059120(local_bc8,uVar3);
    uVar3 = FUN_1800da6b0();
    uVar3 = FUN_1800dcb40(uVar3);
    FUN_180059120(local_ba8,uVar3);
    uVar3 = FUN_1800da750();
    uVar3 = FUN_1800dcb10(uVar3);
    FUN_180059120(local_b88,uVar3);
    uVar3 = FUN_1800da810();
    uVar3 = FUN_1800dcae0(uVar3);
    FUN_180059120(local_b68,uVar3);
    uVar3 = FUN_1800da8f0();
    uVar3 = FUN_1800dcab0(uVar3);
    FUN_180059120(local_b48,uVar3);
    uVar3 = FUN_1800da9a0();
    uVar3 = FUN_1800dca80(uVar3);
    FUN_180059120(local_b28,uVar3);
    uVar3 = FUN_1800daa50();
    uVar3 = FUN_1800dca50(uVar3);
    FUN_180059120(local_b08,uVar3);
    uVar3 = FUN_1800dab00();
    uVar3 = FUN_1800dca20(uVar3);
    FUN_180059120(local_ae8,uVar3);
    uVar3 = FUN_1800dabb0();
    uVar3 = FUN_1800dc9f0(uVar3);
    FUN_180059120(local_ac8,uVar3);
    uVar3 = FUN_1800dac60();
    uVar3 = FUN_1800dc9c0(uVar3);
    FUN_180059120(local_aa8,uVar3);
    uVar3 = FUN_1800dad10();
    uVar3 = FUN_1800dc990(uVar3);
    FUN_180059120(local_a88,uVar3);
    uVar3 = FUN_1800dada0();
    uVar3 = FUN_1800dc960(uVar3);
    FUN_180059120(local_a68,uVar3);
    uVar3 = FUN_1800dae40();
    uVar3 = FUN_1800dc930(uVar3);
    FUN_180059120(local_a48,uVar3);
    uVar3 = FUN_1800daee0();
    uVar3 = FUN_1800dc900(uVar3);
    FUN_180059120(local_a28,uVar3);
    uVar3 = FUN_1800daf90();
    uVar3 = FUN_1800dc8d0(uVar3);
    FUN_180059120(local_a08,uVar3);
    local_28e8 = local_de8;
    local_28e0 = local_9e8;
    FUN_1800dd910(local_1348,&local_28e8);
    FUN_1800dc3f0(local_2c8,uVar2,local_1348);
    uVar2 = FUN_1800db040();
    uVar2 = FUN_1800dc8a0(uVar2);
    uVar2 = FUN_180059120(local_1868,uVar2);
    uVar3 = FUN_1800db0b0();
    uVar3 = FUN_1800dc870(uVar3);
    FUN_180059120(local_2588,uVar3);
    local_28e8 = local_2588;
    local_28e0 = local_2568;
    FUN_1800dd910(local_1288,&local_28e8);
    FUN_1800dc3f0(local_268,uVar2,local_1288);
    uVar2 = FUN_1800db150();
    uVar2 = FUN_1800dc840(uVar2);
    uVar2 = FUN_180059120(local_1888,uVar2);
    uVar3 = FUN_1800db1d0();
    uVar3 = FUN_1800dc810(uVar3);
    FUN_180059120(local_25a8,uVar3);
    local_28e8 = local_25a8;
    local_28e0 = local_2588;
    FUN_1800dd910(local_12c8,&local_28e8);
    FUN_1800dc3f0(local_208,uVar2,local_12c8);
    uVar2 = FUN_1800db230();
    uVar2 = FUN_1800dc7e0(uVar2);
    uVar2 = FUN_180059120(local_18a8,uVar2);
    uVar3 = FUN_1800db2d0();
    uVar3 = FUN_1800dc7b0(uVar3);
    FUN_180059120(local_1ca8,uVar3);
    uVar3 = FUN_1800db370();
    uVar3 = FUN_1800dc780(uVar3);
    FUN_180059120(local_1c88,uVar3);
    local_28e8 = local_1ca8;
    local_28e0 = local_1c68;
    FUN_1800dd910(local_1308,&local_28e8);
    FUN_1800dc3f0(local_1a8,uVar2,local_1308);
    uVar2 = FUN_1800db440();
    uVar2 = FUN_1800dc750(uVar2);
    uVar2 = FUN_180059120(local_1bc8,uVar2);
    uVar3 = FUN_1800db4c0();
    uVar3 = FUN_1800dc720(uVar3);
    FUN_180059120(local_25c8,uVar3);
    local_28e8 = local_25c8;
    local_28e0 = local_25a8;
    FUN_1800dd910(local_1388,&local_28e8);
    FUN_1800dc3f0(local_148,uVar2,local_1388);
    uVar2 = FUN_1800db560();
    uVar2 = FUN_1800dc6f0(uVar2);
    uVar2 = FUN_180059120(local_1be8,uVar2);
    uVar3 = FUN_1800db600();
    uVar3 = FUN_1800dc6c0(uVar3);
    FUN_180059120(local_1648,uVar3);
    uVar3 = FUN_1800db6b0();
    uVar3 = FUN_1800dc690(uVar3);
    FUN_180059120(local_1628,uVar3);
    uVar3 = FUN_1800db750();
    uVar3 = FUN_1800dc660(uVar3);
    FUN_180059120(local_1608,uVar3);
    uVar3 = FUN_1800db7b0();
    uVar3 = FUN_1800dc630(uVar3);
    FUN_180059120(local_15e8,uVar3);
    local_28e8 = local_1648;
    local_28e0 = local_15c8;
    FUN_1800dd910(local_13c8,&local_28e8);
    FUN_1800dc3f0(local_e8,uVar2,local_13c8);
    uVar2 = FUN_1800db850();
    uVar2 = FUN_1800dc600(uVar2);
    uVar2 = FUN_180059120(local_1c08,uVar2);
    uVar3 = FUN_1800db8f0();
    uVar3 = FUN_1800dc5d0(uVar3);
    FUN_180059120(local_25e8,uVar3);
    local_28e8 = local_25e8;
    local_28e0 = local_25c8;
    FUN_1800dd910(local_1408,&local_28e8);
    uVar2 = FUN_1800dc3f0(local_88,uVar2,local_1408);
    local_28e8 = local_9e8;
    local_28e0 = &stack0xffffffffffffffd8;
    FUN_1800dd830(uVar2,&local_28e8);
    _eh_vector_destructor_iterator_(local_9e8,0x60,0x1a,(_func_void_void_ptr *)&LAB_1800db990);
    FUN_1800db970(local_1408);
    _eh_vector_destructor_iterator_(local_25e8,0x20,1,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1c08);
    FUN_1800db970(local_13c8);
    _eh_vector_destructor_iterator_(local_1648,0x20,4,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1be8);
    FUN_1800db970(local_1388);
    _eh_vector_destructor_iterator_(local_25c8,0x20,1,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1bc8);
    FUN_1800db970(local_1308);
    _eh_vector_destructor_iterator_(local_1ca8,0x20,2,thunk_FUN_1800597a0);
    FUN_1800597a0(local_18a8);
    FUN_1800db970(local_12c8);
    _eh_vector_destructor_iterator_(local_25a8,0x20,1,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1888);
    FUN_1800db970(local_1288);
    _eh_vector_destructor_iterator_(local_2588,0x20,1,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1868);
    FUN_1800db970(local_1348);
    _eh_vector_destructor_iterator_(local_de8,0x20,0x20,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1848);
    FUN_1800db970(local_15c8);
    _eh_vector_destructor_iterator_(local_17c8,0x20,4,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1828);
    FUN_1800db970(local_1588);
    _eh_vector_destructor_iterator_(local_1168,0x20,0x1c,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1808);
    FUN_1800db970(local_1548);
    _eh_vector_destructor_iterator_(local_2568,0x20,1,thunk_FUN_1800597a0);
    FUN_1800597a0(local_17e8);
    FUN_1800db970(local_1508);
    _eh_vector_destructor_iterator_(local_1748,0x20,4,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1c68);
    FUN_1800db970(local_14c8);
    _eh_vector_destructor_iterator_(local_1248,0x20,7,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1c48);
    FUN_1800db970(local_1488);
    _eh_vector_destructor_iterator_(local_16c8,0x20,4,thunk_FUN_1800597a0);
    FUN_1800597a0(local_1c28);
    FUN_1800db970(local_1448);
    _eh_vector_destructor_iterator_(local_22a8,0x20,0xb,thunk_FUN_1800597a0);
    FUN_1800597a0(local_2890);
    FUN_1800db970(local_1ba8);
    _eh_vector_destructor_iterator_(local_2548,0x20,4,thunk_FUN_1800597a0);
    FUN_1800597a0(local_2870);
    FUN_1800db970(local_1b68);
    _eh_vector_destructor_iterator_(local_2850,0x20,1,thunk_FUN_1800597a0);
    FUN_1800597a0(local_2830);
    FUN_1800db970(local_1b28);
    _eh_vector_destructor_iterator_(local_24c8,0x20,4,thunk_FUN_1800597a0);
    FUN_1800597a0(local_2810);
    FUN_1800db970(local_1ae8);
    _eh_vector_destructor_iterator_(local_2668,0x20,2,thunk_FUN_1800597a0);
    FUN_1800597a0(local_27f0);
    FUN_1800db970(local_1aa8);
    _eh_vector_destructor_iterator_(local_27d0,0x20,1,thunk_FUN_1800597a0);
    FUN_1800597a0(local_27b0);
    FUN_1800db970(local_1a68);
    _eh_vector_destructor_iterator_(local_2628,0x20,2,thunk_FUN_1800597a0);
    FUN_1800597a0(local_2790);
    FUN_1800db970(local_1a28);
    _eh_vector_destructor_iterator_(local_2770,0x20,1,thunk_FUN_1800597a0);
    FUN_1800597a0(local_2750);
    FUN_1800db970(local_19e8);
    _eh_vector_destructor_iterator_(local_23c8,0x20,9,thunk_FUN_1800597a0);
    FUN_1800597a0(local_2730);
    FUN_1800db970(local_19a8);
    _eh_vector_destructor_iterator_(local_2148,0x20,0xc,thunk_FUN_1800597a0);
    FUN_1800597a0(local_2710);
    FUN_1800db970(local_1968);
    _eh_vector_destructor_iterator_(local_26f0,0x20,1,thunk_FUN_1800597a0);
    FUN_1800597a0(local_26d0);
    FUN_1800db970(local_1928);
    _eh_vector_destructor_iterator_(local_1fc8,0x20,0x19,thunk_FUN_1800597a0);
    FUN_1800597a0(local_26b0);
    FUN_1800db970(local_18e8);
    _eh_vector_destructor_iterator_(local_2448,0x20,4,thunk_FUN_1800597a0);
    FUN_1800597a0(local_2690);
    atexit(FUN_1805d2db0);
    _Init_thread_footer(&DAT_18088a1f8);
  }
  return &DAT_18088a200;
}



/* ==================================================================== */
/* 18018e670 / FUN_18018e670 */
/* RETRY FAILED: Exception while decompiling 18018e670: Decompiler process died
 */

/* Retry summary: recovered=2, attempted=7 */
