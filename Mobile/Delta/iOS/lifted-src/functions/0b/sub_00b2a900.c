/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2a900..0xb2abf8 (760 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2a900_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    unsigned long long field_20;
    unsigned int field_28;
    char padding_2c[32];
    unsigned int field_4c;
    unsigned int field_50;
    unsigned int field_54;
    unsigned int field_58;
    char padding_5c[8];
    unsigned int field_64;
    unsigned long long field_68;
    unsigned int field_70;
    unsigned int field_74;
    unsigned int field_78;
    unsigned int field_7c;
    long long field_80;
    unsigned long long field_88;
    unsigned long long field_90;
    long long field_98;
} st_b2a900_0;


unsigned long long sub_b2a900(st_b2a900_0 *a0, long long a1, unsigned long a2, long long a3)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long v14;  // x9
    unsigned long long v15;  // x8
    unsigned int v16;  // w9
    unsigned long long v17;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x2
    long long v8;  // x1
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long v11;  // x21
    unsigned long long v12;  // x0
    unsigned int v13;  // w8
    unsigned long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38], Other Possible Types: unsigned long long
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a2f9e0();
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_b2ac04(a0, a3);
    if (!(unsigned int)v5)
        return v5;
    if (!a0->field_90 && (v6 = sub_a58724(a0->field_80, "blake2bmac", a0->field_98), a0->field_90 = v6, !v6))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/argon2.c", 0x400, "kdf_argon2_derive");
        v7 = "cannot fetch blake2bmac";
        v8 = 150;
    }
    else if (a0->field_88 || !(v9 = sub_a40ca8(a0->field_80, "blake2b512", a0->field_98), a0->field_88 = v9, !v9))
    {
        if (!a0->field_20 || !a0->field_28)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/argon2.c", 1038, "kdf_argon2_derive");
            v8 = 131;
            goto LABEL_b2aa24;
        }
        if (a0->field_8 == a2)
        {
LABEL_b2a9a0:
            if (3 > a0->field_64)
            {
                v11 = a0->field_58;
                if ((unsigned int)v11 <= 1)
                {
                    v13 = a0->field_54;
                    goto LABEL_b2ab10;
                }
                if (v11 > sub_ad979c(a0->field_80))
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/argon2.c", 1069, "kdf_argon2_derive");
                    v12 = sub_ad979c(a0->field_80);
                    v0 = a0->field_58;
                    v1 = v12;
                    v7 = "requested %u threads, available: %u";
                    goto LABEL_b2abd4;
                }
                else
                {
                    v13 = a0->field_54;
                    if (a0->field_58 <= v13)
                    {
LABEL_b2ab10:
                        v14 = a0->field_50;
                        if (v13 * 8 > (unsigned int)v14)
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/kdfs/argon2.c", 1084, "kdf_argon2_derive");
                            v7 = "m_cost must be greater or equal than 8 times the number of lanes";
                            v8 = 235;
                        }
                        else
                        {
                            v15 = v13 * 4;
                            v16 = v14 / v15;
                            a0->field_68 = 0;
                            a0->field_70 = a0->field_4c;
                            a0->field_74 = (unsigned int)v15 * v16;
                            a0->field_78 = v16;
                            a0->field_7c = v16 * 4;
                            v17 = sub_b2b37c(a0);
                            if (!(unsigned int)v17)
                                return v17;
                            if (sub_b2b8e8(a0) == 1)
                            {
                                sub_b2bc00(a0, a1);
                                return 1;
                            }
                            goto LABEL_b2abe0;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kdfs/argon2.c", 1076, "kdf_argon2_derive");
                        v0 = a0->field_58;
                        v1 = a0->field_54;
                        v7 = "requested more threads (%u) than lanes (%u)";
LABEL_b2abd4:
                        v8 = 234;
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/argon2.c", 1057, "kdf_argon2_derive");
                v7 = "invalid Argon2 type";
                v8 = 125;
            }
        }
        else if (sub_a6fbc4(a3, "size"))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/argon2.c", 1044, "kdf_argon2_derive");
            v8 = 106;
LABEL_b2aa24:
            v7 = 0;
        }
        else
        {
            v10 = sub_b2b314(a0, a2);
            if (!(unsigned int)v10)
                return v10;
            goto LABEL_b2a9a0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/argon2.c", 1032, "kdf_argon2_derive");
        v7 = "cannot fetch blake2b512";
        v8 = 129;
    }
    sub_a36abc(57, v8, v7);
LABEL_b2abe0:
    return 0;
}
