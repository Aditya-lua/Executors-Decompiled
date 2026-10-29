/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c5334..0x1c5450 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c5334_1 {
    char padding_0[16];
    long long field_10;
} st_1c5334_1;

typedef struct st_1c5334_0 {
    char field_0;
} st_1c5334_0;


unsigned long long sub_1c5334(st_1c5334_1 *a0, long long a1, long long a2)
{
    long long v5;  // x21
    unsigned long long v6;  // x22
    unsigned long long v7;  // w23
    unsigned long long v8;  // x22
    unsigned int v9;  // w0
    st_1c5334_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1c5334_0 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2;
    v1 = &v0;
    v0 = &v1;
    if (!sub_1b287c())
        return 0xffffffffffffffff;
    if ((unsigned long long)v5 >= 0x7fffffff)
        v5 = 0x7fffffff;
    v6 = sub_960734();
    if (!(v6 >> 31 & 1))
    {
        return (int)v6;
    }
    else if (sub_9625a4(a0->field_10, v6) == 3)
    {
        v7 = 0xfffffc19;
        while (sub_1b287c(a0))
        {
            v2 = 10;
            sub_1adc88(&v2);
            v8 = sub_960734(a0->field_10, a1, v5);
            if (!(v8 >> 31 & 1))
                return v8 & 0xffffffff;
            v9 = sub_9625a4(a0->field_10, v8);
            if (!v7)
                return (int)v8;
            v7 += 1;
            if (v9 != 3)
                return (int)v8;
        }
        return 0xffffffffffffffff;
    }
    else
    {
        return (int)v6;
    }
}
