/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be2b0..0x1be410 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1be2b0_1 {
    char padding_0[16];
    long long field_10;
} st_1be2b0_1;

typedef struct st_1be2b0_0 {
    char field_0;
} st_1be2b0_0;


unsigned long long sub_1be2b0(st_1be2b0_1 *a0, long long a1, long long a2)
{
    unsigned long long v5;  // x22
    unsigned long long v6;  // w23
    unsigned long long v7;  // x22
    unsigned int v8;  // w0
    st_1be2b0_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1be2b0_0 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if ((int)sub_95fa60(a0->field_10) >= 1)
        return sub_9602d0(a0->field_10, a1, a2);
    if (sub_1aa6d0(a0))
    {
        v5 = sub_9602d0(a0->field_10, a1, a2);
        if (!(v5 >> 31 & 1))
        {
            return (int)v5;
        }
        else if (sub_9625a4(a0->field_10, v5) == 2)
        {
            v6 = 0xfffffc19;
            while (1 > (int)sub_95fa60(a0->field_10))
            {
                if (sub_1aa6d0(a0))
                {
                    v2 = 10;
                    sub_1adc88(&v2);
                    v7 = sub_9602d0(a0->field_10, a1, a2);
                    if (!(v7 >> 31 & 1))
                        return v7 & 0xffffffff;
                    v8 = sub_9625a4(a0->field_10, v7);
                    if (!v6)
                        return (int)v7;
                    v6 += 1;
                    if (v8 != 2)
                        return (int)v7;
                }
                else
                {
                    return 0xffffffffffffffff;
                }
            }
        }
        else
        {
            return (int)v5;
        }
    }
    else
    {
        return 0xffffffffffffffff;
    }
    return sub_9602d0(a0->field_10, a1, a2);
}
