/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d6a80..0x1d80a8 (5672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d6a80_4 {
} st_1d6a80_4;

typedef struct st_1d6a80_6 {
    char padding_0[2];
    char field_2;
    char padding_3[61];
    struct st_1d6a80_3 *field_40;
    struct st_1d6a80_7 *field_48;
    struct st_1d6a80_5 *field_50;
    struct st_1d6a80_7 *field_58;
    char padding_60[24];
    unsigned long long field_78;
} st_1d6a80_6;

typedef struct st_1d6a80_9 {
    char padding_0[2];
    char field_2;
    char padding_3[61];
    struct st_1d6a80_3 *field_40;
    struct st_1d6a80_7 *field_48;
    struct st_1d6a80_8 *field_50;
    struct st_1d6a80_7 *field_58;
    char padding_60[24];
    unsigned long long field_78;
} st_1d6a80_9;

typedef struct st_1d6a80_3 {
    char padding_0[24];
    unsigned long long field_18;
} st_1d6a80_3;

typedef struct st_1d6a80_5 {
    char padding_0[32];
    struct st_1d6a80_6 *field_20;
} st_1d6a80_5;

typedef struct st_1d6a80_8 {
    char padding_0[32];
    struct st_1d6a80_6 *field_20;
} st_1d6a80_8;

typedef struct st_1d6a80_7 {
    struct st_1d6a80_4 *field_0;
} st_1d6a80_7;

typedef struct st_1d6a80_0 {
    char field_0;
} st_1d6a80_0;

typedef struct st_1d6a80_11 {
    struct st_1d6a80_9 *field_0;
    char padding_8[60];
    unsigned int field_44;
    unsigned int field_48;
    char padding_4c[36];
    char field_70;
} st_1d6a80_11;

typedef struct st_1d6a80_1 {
    char padding_0[24];
    struct st_1d6a80_2 *field_18;
    char padding_20[344];
    struct st_1d6a80_2 *field_178;
} st_1d6a80_1;

typedef struct st_1d6a80_2 {
    unsigned long long field_0;
} st_1d6a80_2;

extern st_1d6a80_2 *g_f0b0d8;
extern st_1d6a80_1 *g_f0d3d8;
extern unsigned long long g_f0d528;

unsigned long long sub_1d6a80(void* a0, st_1d6a80_6 *a1)
{
    unsigned long v15;  // x25
    st_1d6a80_11 **v16;  // x8
    unsigned long v25;  // x9
    st_1d6a80_11 **v26;  // x8
    unsigned long long v27;  // x9
    st_1d6a80_11 **v28;  // x10
    unsigned long long j;  // x11
    st_1d6a80_11 **iter;  // x12
    st_1d6a80_11 **v31;  // x13
    unsigned long long v32;  // x11
    st_1d6a80_11 **v33;  // x13
    st_1d6a80_11 **i;  // x9
    unsigned int v18;  // w8
    st_1d6a80_6 *v19;  // x9
    st_1d6a80_11 **v20;  // x8
    st_1d6a80_11 **v21;  // x9
    st_1d6a80_11 **v22;  // x8
    st_1d6a80_6 *v23;  // x21
    st_1d6a80_5 *v24;  // x8
    unsigned long long v0;  // [bp-0x108]
    void* v1;  // [bp-0x100]
    unsigned int v2;  // [bp-0xf4]
    st_1d6a80_0 **v3;  // [bp-0xf0], Other Possible Types: char
    st_1d6a80_0 *v4;  // [bp-0xe8]
    st_1d6a80_0 **v5;  // [bp-0xe0], Other Possible Types: char
    st_1d6a80_0 *v6;  // [bp-0xd8]
    st_1d6a80_0 **v7;  // [bp-0xd0], Other Possible Types: char
    st_1d6a80_0 *v8;  // [bp-0xc8]
    st_1d6a80_0 *v9;  // [bp-0xc0]
    st_1d6a80_0 **v10;  // [bp-0xb8], Other Possible Types: char
    st_1d6a80_0 *v11;  // [bp-0xb0]
    st_1d6a80_0 **v12;  // [bp-0x80], Other Possible Types: char
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v4 = &v3;
    v3 = &v4;
    if (!(sub_1e54a0() & 1))
    {
        sub_1e4cec(a0);
        return 0;
    }
    else if (sub_1dd82c(a0) & 1)
    {
        v15 = (int)a0[0x44];
        if (v15 >> 31 & 1)
            goto LABEL_1d6b2c;
        if ((int)(v16 - a1->field_48 >> 4) >= (int)v15)
        {
            v18 = (int)a0[72];
            v19 = *(long long *)a0;
            if ((unsigned int)v15 + 1 > (long long)(v19->field_40->field_18 - (char *)v19->field_58 >> 4))
            {
                v20 = a1->field_58;
                v21 = a1->field_48;
                if (v21 > a1->field_58)
                {
                    do
                    {
                        a1->field_58 = v20 + 2;
                        *(unsigned int *)((char *)&v20[1] + 4) = 0;
                        v20 = a1->field_58;
                        v21 = a1->field_48;
                    } while (a1->field_58 < a1->field_48);
                }
                a1->field_58 = v21;
                _strlen(g_f0d528 + 2242);
                g_f0d3d8->field_18();
            }
            else
            {
                *(unsigned int *)&a0[0x44] = v15;
                *(unsigned int *)&a0[72] = v18;
                *(char *)&a0[112] = 4;
                v22 = v19->field_58;
                *v22 = a0;
                *(double *)&v22[1] = 4.243991582e-314;
                v19->field_58 = v19->field_58 + 2;
                v23 = *(long long *)a0;
                if ((unsigned int)v15)
                {
                    v6 = &v5;
                    v5 = &v6;
                    if (v23 != a1)
                    {
                        v24 = v23->field_50;
                        if (a1->field_50 != v24)
                        {
                            v1 = a0;
                            v8 = &v7;
                            v7 = &v8;
                            v0 = (a1->field_58 - a1->field_48 >> 4) - v15;
                            v2 = (unsigned int)v0 + 1;
                            v9 = &v10;
                            v10 = &v9;
                            g_f0d3d8->field_178();
                        }
                        v11 = &v12;
                        v12 = &v11;
                        v25 = v23->field_2;
                        if (v25 >> 2 & 1)
                        {
                            v23->field_2 = (char)v25 & 251;
                            v23->field_78 = v24->field_20;
                            v24->field_20 = v23;
                        }
                        v26 = v23->field_58;
                        v27 = v15 & 0xffffffff;
                        v28 = &a1->field_58[-2 * (v15 & 0xffffffff)];
                        j = v27;
                        iter = v26;
                        v31 = v28;
                        do
                        {
                            v32 = j;
                            v33 = v31 + 2;
                            *(int128_t *)iter = *(int128_t *)v31;
                            iter += 2;
                            j = v32 - 1;
                            v31 = v33;
                        } while (j);
                        a1->field_58 = v28;
                        v23->field_58 = &v26[2 * v27];
                    }
                }
                g_f0b0d8();
            }
        }
        else
        {
            for (v16 = a1->field_58; v16 < i; i = a1->field_48)
            {
                a1->field_58 = v16 + 2;
                *(unsigned int *)((char *)&v16[1] + 4) = 0;
LABEL_1d6b2c:
                v16 = a1->field_58;
            }
            a1->field_58 = i;
            _strlen(g_f0d528 + 2242);
            g_f0d3d8->field_18();
        }
    }
    else
    {
        sub_1e095c(a0);
        return 0;
    }
}
