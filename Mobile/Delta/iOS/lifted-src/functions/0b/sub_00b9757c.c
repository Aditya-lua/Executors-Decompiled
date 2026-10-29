/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9757c..0xb97608 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9757c_0 {
    char padding_0[8];
    long long field_8;
    unsigned long long field_10;
    long long field_18;
} st_b9757c_0;


unsigned long long sub_b9757c(st_b9757c_0 *a0, st_b9757c_0 *a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x8
    long long v4;  // x19
    long long v5;  // x20
    unsigned long long v6;  // x21
    unsigned long long v7;  // x21
    unsigned long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b971e0(a0->field_18, a1->field_18);
    if (!(unsigned int)v2)
        return v2;
    v3 = a0->field_10;
    if (v3 != a1->field_10)
    {
        return 0;
    }
    else if (v3)
    {
        v4 = a1->field_8;
        v5 = a0->field_8;
        v6 = v3 - 1;
        while (1)
        {
            v7 = v6;
            v8 = sub_b7e470(v5, v4);
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
