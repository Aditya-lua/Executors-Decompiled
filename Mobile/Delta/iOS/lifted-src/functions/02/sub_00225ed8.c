/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x225ed8..0x227020 (4424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_225ed8_9 {
    char padding_0[2];
    char field_2;
    char padding_3[69];
    unsigned long long field_48;
    struct st_225ed8_8 *field_50;
    unsigned long long field_58;
    char padding_60[24];
    unsigned long long field_78;
} st_225ed8_9;

typedef struct st_225ed8_8 {
    char padding_0[32];
    struct st_225ed8_9 *field_20;
} st_225ed8_8;

typedef struct st_225ed8_3 {
    char padding_0[40];
    unsigned long long field_28;
} st_225ed8_3;

typedef struct st_225ed8_1 {
    struct st_225ed8_0 *field_0;
} st_225ed8_1;

typedef struct st_225ed8_2 {
    char padding_0[80];
    unsigned long long field_50;
} st_225ed8_2;

typedef struct st_225ed8_4 {
    char padding_0[64];
    unsigned int field_40;
    char padding_44[4];
    struct st_225ed8_2 *field_48;
    unsigned long long field_50;
    char padding_58[16];
    struct st_225ed8_3 *field_68;
} st_225ed8_4;

typedef struct st_225ed8_0 {
    char field_0;
} st_225ed8_0;

typedef struct st_225ed8_11 {
    unsigned long long field_0;
} st_225ed8_11;

typedef struct st_225ed8_5 {
    char padding_0[1664];
    unsigned long long field_680;
} st_225ed8_5;

typedef struct st_225ed8_10 {
    char padding_0[64];
    struct st_225ed8_11 *field_40;
    char padding_48[136];
    struct st_225ed8_11 *field_d0;
    char padding_d8[160];
    struct st_225ed8_11 *field_178;
} st_225ed8_10;

typedef struct st_225ed8_6 {
    char padding_0[96];
    struct st_225ed8_5 *field_60;
} st_225ed8_6;

extern st_225ed8_6 *g_f0d198;
extern st_225ed8_10 *g_f0d3d8;

unsigned long long sub_225ed8(st_225ed8_4 *a0, st_225ed8_9 *a1)
{
    unsigned long long v10;  // x0
    unsigned long long v11;  // x20
    unsigned long long v12;  // x0
    unsigned long v13;  // x8
    st_225ed8_8 *v14;  // x9
    unsigned long long v15;  // w23
    unsigned long long v16;  // x0
    st_225ed8_0 **v0;  // [bp-0xe8], Other Possible Types: char
    st_225ed8_0 *v1;  // [bp-0xe0]
    st_225ed8_0 **v2;  // [bp-0xc0], Other Possible Types: st_225ed8_1 **, char
    st_225ed8_0 *v3;  // [bp-0xb8], Other Possible Types: st_225ed8_1 **
    st_225ed8_4 *v4;  // [bp-0xb0]
    int v5;  // [bp-0xa8]
    st_225ed8_0 **v6;  // [bp-0x88], Other Possible Types: st_225ed8_1 **, char
    st_225ed8_0 *v7;  // [bp-0x80], Other Possible Types: st_225ed8_1 **
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v4 = a0;
    v2 = &v3;
    v7 = &v6;
    v6 = &v7;
    v5 = 1;
    std::__1::mutex::lock();
    if (sub_60768(a0 + 1, 2) && *(long long *)&a0->padding_58[8])
    {
        v10 = sub_63c20(&v4);
        if (!*(long long *)(*(long long *)&a0->padding_58[8] + 32))
            return v10;
        v7 = &v6;
        v6 = &v7;
        v4 = a0;
        v5 = 1;
        std::__1::mutex::lock(a0);
        if (sub_60768(a0 + 1, 2))
        {
            v11 = a0->field_48;
            if (v11)
            {
                v12 = sub_63c20(&v4);
                goto LABEL_225fb8;
            }
            else if (a0->field_68)
            {
                v11 = a0->field_68->field_28;
                a0->field_48 = v11;
                v12 = sub_63c20(&v4);
                if (!v11)
                    return v12;
LABEL_225fb8:
                if (*(long long *)(v11 + 80) == g_f0d198->field_60->field_680)
                {
                    return v12;
                }
                else if (a0->field_40 != 3)
                {
                    v3 = &v2;
                    v4 = a0;
                    v2 = &v3;
                    v7 = &v6;
                    v6 = &v7;
                    v5 = 1;
                    std::__1::mutex::lock(a0);
                    if (sub_60768(a0 + 1, 2))
                    {
                        if ((int)a0->field_50)
                        {
                            sub_63c20(&v4);
                            g_f0d3d8->field_40();
                        }
                        if (a0->field_68)
                        {
                            v15 = *(int *)&a0->field_68[1].padding_0[4];
                            *(unsigned int *)&a0->field_50 = v15;
                            v16 = sub_63c20(&v4);
                            if (!v15)
                                return v16;
                            g_f0d3d8->field_40();
                        }
                    }
                }
                else if ((int)(a1->field_58 - a1->field_48 >> 4) >= 1)
                {
                    v13 = a1->field_2;
                    if (v13 >> 2 & 1)
                    {
                        v14 = a1->field_50;
                        a1->field_2 = (char)v13 & 251;
                        a1->field_78 = v14->field_20;
                        v14->field_20 = a1;
                    }
                    g_f0d3d8->field_178();
                }
                else
                {
                    g_f0d3d8->field_d0();
                }
            }
        }
    }
    return sub_63c20(&v4);
}
