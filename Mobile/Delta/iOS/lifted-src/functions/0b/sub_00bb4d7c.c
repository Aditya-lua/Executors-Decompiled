/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb4d7c..0xbb4e28 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb4d7c_0 {
    char padding_0[8];
    long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    long long field_20;
    unsigned long long field_28;
    long long field_30;
} st_bb4d7c_0;


unsigned long long sub_bb4d7c(st_bb4d7c_0 *a0, st_bb4d7c_0 *a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x8
    long long v4;  // x20
    long long v5;  // x19
    unsigned long long v6;  // x21
    unsigned long long v7;  // x21
    unsigned long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_bb4954(a0->field_30, a1->field_30);
    if (!(unsigned int)v2)
        return v2;
    if (a0->field_10 != a1->field_10 || _memcmp(a0->field_8, a1->field_8))
        return 0;
    v3 = a0->field_28;
    if (v3 == a1->field_28)
    {
        if (v3)
        {
            v4 = a1->field_20;
            v5 = a0->field_20;
            v6 = v3 - 1;
            while (1)
            {
                v7 = v6;
                v8 = sub_be18b4(v5, v4);
                v6 = v7 - 1;
                if (!(unsigned int)v8)
                    return v8;
                v4 += 64;
                v5 += 64;
                if (v7 < 1)
                    return v8;
            }
        }
        else
        {
            return 1;
        }
    }
    return 0;
}
