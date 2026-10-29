/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc633b8..0xc634a0 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c633b8_0 {
    char padding_0[64];
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
} st_c633b8_0;


unsigned long long sub_c633b8(st_c633b8_0 *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3)
{
    unsigned long v3;  // x8
    unsigned long v4;  // x1
    unsigned long long v5;  // x0
    unsigned long long v6;  // x9
    unsigned long long v7;  // x10
    unsigned long long v8;  // x11
    unsigned long long v9;  // x12
    unsigned long long v10;  // x11
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (sub_988040())
    {
        v3 = a0->field_40;
        v4 = a0->field_48;
        if (a0->field_48 == a0->field_40)
        {
            if (*(int *)a3)
            {
                v5 = sub_c63580(a0);
                if (!(unsigned int)v5)
                    return v5;
                v3 = a0->field_40;
                v4 = a0->field_48;
            }
            else
            {
                return 0;
            }
        }
        v6 = v4 - v3;
        v7 = v0;
        if (!v7 && v6)
        {
            if (a0->field_60 <= v3 || a0->field_68 > v3 || !a0->field_50)
                return 0;
            v8 = a0->field_58;
            v9 = v3 - v8 * v3 / v8;
            v10 = v8 - v9;
            v7 = a0->field_50 + v9;
            if (v6 > v10)
            {
                a0->field_48 = v10 + v3;
                v6 = v10;
            }
        }
        *a2 = v6;
        *a1 = v7;
    }
    else
    {
        *a1 = 0;
        *a2 = 0;
    }
    return 1;
}
