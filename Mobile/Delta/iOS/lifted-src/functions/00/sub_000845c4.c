/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x845c4..0x846d4 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_845c4_1 {
    unsigned short field_0;
    char field_2;
} st_845c4_1;

typedef struct st_845c4_0 {
    char field_0;
} st_845c4_0;


unsigned long long sub_845c4(long long a0, long long a1, long long a2, long long a3, unsigned long a4, unsigned long a5, long long a6, long long a7, unsigned long a8, long long a9, st_845c4_1 *a10, unsigned long a11, unsigned int a12, unsigned int a13, unsigned long long a14, long long a15, unsigned int a16)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4106
    long long v6;  // x26
    unsigned long long v7;  // x0
    unsigned long long v8;  // 4106
    unsigned int v9;  // w8
    unsigned long long v0;  // [bp-0x90]
    st_845c4_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_845c4_0 *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]

    v3 = &a8;
    v2 = &v1;
    v1 = &v2;
    v0 = a14;
    v4 = sub_846d4();
    v5 = arm64g_calculate_condition(130, v4, 120, 0);
    if (v5 & 1)
    {
        return v4;
    }
    else if (v4)
    {
        v6 = (char *)a10 + v4 + 1;
        v7 = sub_84bc8(a0 + 2064, a1 + 144, a2, a3, a6, a7, a8, a9, v6, (char *)a10 + a11 - v6, CONCAT(a13, a12), a15);
        v8 = arm64g_calculate_condition(130, v7, 120, 0);
        if (v8 & 1)
        {
            return v7;
        }
        else if (v7)
        {
            v9 = a16 + (unsigned int)(struct st_845c4_1 *)(v6 + v7 - (char *)a10) * 8 - 20;
            a10->field_0 = v9;
            a10->field_2 = v9 >> 16;
            return v6 + v7 - (char *)a10;
        }
        else
        {
            return v7;
        }
    }
    else
    {
        return v4;
    }
}
