/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb340b8..0xb34330 (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b340b8_0 {
    char padding_0[8];
    char field_8;
    char padding_9[23];
    unsigned long long field_20;
    long long field_28;
    unsigned long long field_30;
    char padding_38[8];
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    unsigned long long field_80;
    unsigned long long field_88;
    unsigned long long field_90;
    unsigned int field_98;
} st_b340b8_0;


long long sub_b340b8(st_b340b8_0 *a0, long long a1, long long a2, long long a3)
{
    long long v13;  // x1
    unsigned long v14;  // x0
    unsigned long v15;  // x0
    unsigned long v16;  // x19
    unsigned long v0;  // [bp-0x90]
    unsigned long v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x80]
    unsigned long v3;  // [bp-0x78]
    unsigned long v4;  // [bp-0x70]
    char *v5;  // [bp-0x68]
    char *v6;  // [bp-0x60]
    char *v7;  // [bp-0x58]
    unsigned long v8;  // [bp-0x48]
    unsigned long v9;  // [bp-0x40]
    long long v10;  // [bp-0x38]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v8 = 0;
    v9 = 0;
    if (!sub_a2f9e0() || !sub_b3433c(a0, a3))
        return 0;
    if (a0->field_98 && a0->field_50)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/x942kdf.c", 473, "x942kdf_derive");
        v13 = 198;
    }
    else if (a0->field_30 && (a0->field_40 || a0->field_48 || a0->field_50 || a0->field_58))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/x942kdf.c", 485, "x942kdf_derive");
        v13 = 115;
    }
    else if (a0->field_20)
    {
        v14 = sub_954340(&a0->field_8);
        if (!v14)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/x942kdf.c", 494, "x942kdf_derive");
            v13 = 129;
        }
        else if (!a0->field_88 || !a0->field_90)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/x942kdf.c", 498, "x942kdf_derive");
            v13 = 144;
        }
        else if (a0->field_40 && a0->field_60 > 0x3fffffff)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/x942kdf.c", 506, "x942kdf_derive");
            v13 = 200;
        }
        else
        {
            if (a0->field_98)
                v15 = a0->field_80;
            else
                v15 = 0;
            v6 = &v8;
            v7 = &v10;
            v4 = a0->field_78;
            v5 = &v9;
            v2 = a0->field_70;
            v3 = a0->field_58;
            v0 = a0->field_68;
            v1 = a0->field_50;
            if (sub_b3477c(v15))
            {
                v16 = sub_b34924(v14, a0->field_20, a0->field_28, v9, v8, v10, a1, a2);
                sub_a6c2e4(v9, "providers/implementations/kdfs/x942kdf.c", 523);
                return v16;
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/x942kdf.c", 518, "x942kdf_derive");
            v13 = 141;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/x942kdf.c", 489, "x942kdf_derive");
        v13 = 132;
    }
    sub_a36abc(57, v13, 0);
    return 0;
}
