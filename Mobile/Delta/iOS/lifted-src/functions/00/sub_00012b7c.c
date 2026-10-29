/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12b7c..0x12fe8 (1132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_12b7c_1 {
    unsigned long long field_0;
    long long field_8;
} st_12b7c_1;

typedef struct st_12b7c_0 {
    char field_0;
} st_12b7c_0;

typedef struct st_12b7c_3 {
    long long field_0;
} st_12b7c_3;

extern unsigned int g_9;
extern st_12b7c_3 *g_21;
extern unsigned long long g_29;
extern char g_31;
extern unsigned int g_f00e40;
extern unsigned int g_f010c0;

unsigned long long sub_12b7c(void* a0, unsigned long long a1, unsigned long long idx, unsigned long long a3)
{
    unsigned long v15;  // x24
    void* v16;  // x22
    long long v17;  // x0
    unsigned long long v18;  // x0
    unsigned long long v19;  // x8
    unsigned long long v20;  // x0
    unsigned int v21;  // w0
    unsigned long v22;  // x8
    unsigned long long v23;  // x0
    unsigned long v0;  // [bp-0xc8]
    st_12b7c_0 **v1;  // [bp-0xc0], Other Possible Types: char
    st_12b7c_0 *v2;  // [bp-0xb8]
    st_12b7c_0 **v3;  // [bp-0xb0], Other Possible Types: unsigned long long, unsigned long
    unsigned long v4;  // [bp-0xa8], Other Possible Types: unsigned long long
    uint128_t v5;  // [bp-0xa0], Other Possible Types: unsigned long long *, unsigned int, unsigned long, unsigned long long
    unsigned long v6;  // [bp-0x9c]
    unsigned long long v7;  // [bp-0x98]
    st_12b7c_1 *v8;  // [bp-0x88]
    long long v9;  // [bp-0x80]
    unsigned long long v10;  // [bp-0x78]
    st_12b7c_0 *v11;  // [bp-0x70]
    st_12b7c_0 **v12;  // [bp-0x68]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v2 = &v1;
    v1 = &v2;
    v8 = a0 + 872;
    v9 = (long long)a0[880] - (long long)a0[872] >> 4;
    v10 = 0;
    if ((int)a0[128] == 60)
    {
        v15 = (long long)a0[132];
        v16 = a0 + 132;
        if (a1)
            *(unsigned long *)a1 = v15;
        sub_f8d0(a0);
        while (1)
        {
            if (sub_19920(a0 + 96))
            {
                v5 = 0;
                v7 = sub_223d4(a0);
                v3 = &v12;
                v12 = &v3;
                sub_15cac(v8, &v5);
            }
            else if ((int)a0[128] != 62)
            {
                if ((int)a0[128] != 40)
                    goto LABEL_12d88;
                v5 = *(int128_t *)v16;
                v17 = sub_15068(a0, 1, 0);
                if (g_9 == g_f00e40 && !*(long long *)&g_31 && g_29 == 1 && sub_1af6c((int)a0[128]))
                {
                    v15 = v15;
                    v0 = sub_404c((long long)a0[216], 40);
                    sub_5478(v0, *(long long *)g_21 + 12, *(long long *)g_21);
                    if ((char)a0[88] == 1)
                    {
                        v3 = 1;
                        v18 = sub_158b8(a0 + 1184, &v3);
                        if (v18)
                        {
                            v19 = *(long long *)(v18 + 8);
                            if (v19 && *(int *)v19 == g_f010c0)
                            {
                                v20 = sub_1031c((long long)a0[216], v19 + 12);
                                v3 = v0;
                                sub_1c9f0(a0 + 1184, &v3);
                                *(unsigned long long *)(sub_12484(a0 + 1184, &v3) + 8) = v20;
                            }
                        }
                    }
                    v3 = sub_1615c(a0);
                    v4 = 0;
                    v12 = &v11;
                    v11 = &v12;
                    sub_15cac(v8, &v3);
                }
                else
                {
                    v3 = 0;
                    v4 = 1;
                    v12 = &v11;
                    v11 = &v12;
                    sub_15cac(v8, &v3);
                }
            }
            else
            {
                if (!v10)
                    break;
LABEL_12d88:
                v5 = sub_12740(a0, 0);
                v7 = 0;
                v3 = &v12;
                v12 = &v3;
                sub_15cac(v8, &v5);
            }
            v10 += 1;
            if ((int)a0[128] != 44)
                break;
            if (idx)
            {
                v5 = &v3;
                v3 = &v5;
                sub_f2b8(*(long long *)idx, v16);
                *(long long *)(idx + 16) = *(long long *)(idx + 16) + 1;
            }
            sub_f8d0(a0);
        }
        v5 = 60;
        v6 = v15;
        v21 = sub_1ef30(a0, 62, &v5, 0);
        if (a3)
            v22 = v21 ^ 1;
        else
            v22 = 1;
        if (!(v22 & 1))
            *(long long *)a3 = (long long)a0[160];
    }
    v23 = sub_1f2b8(a0, &v8);
    sub_212c4(v8, v8->field_0 + v9 * 16, v8->field_8);
    return v23;
}
