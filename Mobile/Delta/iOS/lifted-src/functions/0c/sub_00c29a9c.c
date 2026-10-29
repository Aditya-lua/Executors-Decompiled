/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc29a9c..0xc2a634 (2968 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c29a9c_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c29a9c_0;

typedef struct st_c29a9c_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_c29a9c_1;

typedef struct st_c29a9c_2 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_c29a9c_2;

extern st_c29a9c_2 g_e06bd4;

double sub_c29a9c(st_c29a9c_0 *a0, st_c29a9c_1 *a1, unsigned long long a2)
{
    unsigned long long v11;  // x1
    unsigned long long v12;  // x19
    unsigned long long ptr;  // x0
    unsigned long v14;  // x9
    unsigned long long v0;  // [bp-0x320]
    st_c29a9c_0 *v1;  // [bp-0x318]
    unsigned long long v2;  // [bp-0x308]
    unsigned long long v3;  // [bp-0x2b8]
    long long v4;  // [bp-0x2b0]
    unsigned long v5;  // [bp-0x2a8]
    unsigned long long v6;  // [bp-0x2a0]
    uint128_t v7;  // [bp-0x298]
    unsigned long long v8;  // [bp-0x288]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a2 * 264;
    if (a2 > 34937015291116575)
        a0 = sub_c6b970(0);
    v12 = a2;
    v1 = a0;
    if (v11)
    {
        v0 = v12;
        ptr = _malloc(v11);
        if (!ptr)
        {
            sub_c6b970(8, v11);
            sub_c6b970(1, a1);
            __debugbreak();
        }
        v12 = v0;
        v7 = CONCAT(ptr, v12);
        v2 = ptr;
        v8 = 0;
        if (v12 && a1 != (char *)a1 + 264 * v12)
        {
            v5 = &a1[8].padding_0[8];
            v6 = 0;
            v3 = v12 - 1;
            v4 = 1;
            v14 = a1->field_18 - 12;
            if (11 >= a1->field_18)
                v14 = 9;
            goto *((void *)(sub_c29b74 + (&g_e06bd4.field_0)[v14] * 4));
        }
    }
    else
    {
        v7 = CONCAT(8, 0);
        v8 = 0;
    }
    v1->field_0 = v7;
    v1->field_10 = v12;
    return (unsigned long long)v7;
}
