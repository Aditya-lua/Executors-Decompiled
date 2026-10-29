/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x84b04..0x84bc8 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_84b04_0 {
    char field_0;
} st_84b04_0;


long long sub_84b04(long long a0, long long a1, long long a2, void* a3, long long a4, unsigned long a5, unsigned int a6)
{
    long long v5;  // x19
    unsigned int v6;  // w8
    unsigned long v7;  // x9
    unsigned long long v8;  // 4106
    long long v9;  // x0
    st_84b04_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_84b04_0 *v1;  // [bp-0x50]
    unsigned int v2;  // [bp-0x44]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1;
    v1 = &v0;
    v0 = &v1;
    v2 = 0xff;
    v6 = *(int *)a3;
    if (v6 - 2 >= 2)
    {
        v7 = 1;
        if (v6 != 1)
            v7 = 0;
        if (!v6)
            v7 = v5;
        return v7;
    }
    else
    {
        v8 = arm64g_calculate_condition(130, sub_794c0(a4, &v2, a0, v5), 120, 0);
        if (v8 & 1)
            return v5;
        v9 = sub_79df8(a2, a4, v2);
        if (a6)
            v9 += (long long)a3[0x88];
        return v9 + 3;
    }
}
