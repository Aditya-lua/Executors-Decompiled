/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967e0c..0x967eec (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_967e0c_1 {
    unsigned int field_0;
    unsigned long long field_4;
} st_967e0c_1;

typedef struct st_967e0c_0 {
    long long field_0;
    char padding_8[344];
    long long field_160;
    char padding_168[1312];
    unsigned long long field_688;
    long long field_690;
} st_967e0c_0;

extern long long g_967eec;

unsigned long long sub_967e0c(st_967e0c_0 *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x20
    unsigned long long v5;  // x21
    unsigned long long i;  // x22
    unsigned long long *v7;  // x9
    unsigned long long v8;  // x0
    unsigned int v9;  // w0
    st_967e0c_1 *v10;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a77648(a0->field_0, &g_967eec, a0);
    if (!(unsigned int)v2)
        return v2;
    if (!a0->field_690)
        return 1;
    sub_a6c2e4(a0->field_160, "ssl/t1_lib.c", 686);
    v3 = sub_a6bffc(a0->field_690 * 8, "ssl/t1_lib.c", 687);
    a0->field_160 = v3;
    if (!v3)
    {
        return v3;
    }
    else if (a0->field_690)
    {
        v4 = 0;
        v5 = 0;
        i = 0;
        do
        {
            v7 = a0->field_688 + v4;
            v8 = v7[8];
            if (!v7[8])
            {
                v8 = v7[4];
                if (!v8)
                    v8 = *(long long *)(a0->field_688 + v4 + 16);
            }
            v9 = sub_a99eb4(v8);
            v10 = a0->field_160 + v5;
            v10->field_0 = v9;
            (&v10->field_0)[1] = 0;
            i += 1;
            v5 += 8;
            v4 += 104;
        } while ((unsigned long long)a0->field_690 > i);
    }
    return 1;
}
