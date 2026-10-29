/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6b984..0xc6b9fc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6b984_0 {
    unsigned long long field_0;
    long long field_8;
} st_c6b984_0;


unsigned long long sub_c6b984(st_c6b984_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v5;  // x8
    unsigned long long v6;  // 4129
    unsigned long long v7;  // x9
    unsigned long long v8;  // x0
    unsigned long v0;  // [bp-0x38]
    long long v1;  // [bp-0x30]
    long long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2 + a1;
    v6 = arm64g_calculate_condition(0x22, a2, a1, 0);
    if (!(v6 & 1))
    {
        v7 = a0->field_0 * 2;
        if (v7 >= v5)
            v5 = v7;
        if (8 >= v5)
            v5 = 8;
        v8 = sub_c6b9fc();
        if (v0 != 1)
        {
            a0->field_0 = v5;
            a0->field_8 = v1;
            return v8;
        }
    }
    else
    {
        sub_c6b970(0);
    }
    sub_c6b970(v1, v2);
}
