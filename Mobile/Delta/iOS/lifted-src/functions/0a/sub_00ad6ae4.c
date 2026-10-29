/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad6ae4..0xad6b40 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad6ae4_0 {
    int field_0;
    char padding_4[4];
    long long field_8;
    struct st_ad6ae4_0 *field_10;
    struct st_ad6ae4_0 *field_18;
} st_ad6ae4_0;


st_ad6ae4_0 * sub_ad6ae4(st_ad6ae4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if ((int)a0->field_10)
    {
        return a0;
    }
    else if (!a0->field_18)
    {
        return a0;
    }
    else
    {
        if (a0->field_0 >= 2)
        {
            v0 = v5;
            v1 = v6;
            v2 = &v4;
            v3 = v7;
            _qsort(a0->field_8);
        }
        *(unsigned int *)&a0->field_10 = 1;
        return a0;
    }
}
