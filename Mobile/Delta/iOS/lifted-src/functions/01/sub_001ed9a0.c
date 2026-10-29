/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ed9a0..0x1eda40 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ed9a0_1 {
    unsigned long long field_0;
    unsigned long long field_4;
} st_1ed9a0_1;

typedef struct st_1ed9a0_0 {
    char field_0;
} st_1ed9a0_0;


unsigned long long sub_1ed9a0(unsigned long long *a0)
{
    unsigned long long i;  // x10
    unsigned long long v3;  // x0
    unsigned long long v4;  // x12
    st_1ed9a0_1 *v5;  // x13
    unsigned long long v6;  // w15
    unsigned long long v7;  // x14
    unsigned long long j;  // w16
    unsigned int v9;  // w17
    unsigned long long v10;  // w15
    unsigned long v11;  // x14
    st_1ed9a0_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1ed9a0_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a0[1])
        return 0;
    i = 0;
    v3 = 0;
    v4 = 0xffffffff;
    do
    {
        v5 = *a0 + i * 8;
        v6 = (int)v5->field_0;
        v7 = v4;
        do
        {
            v4 = v7;
            if (0xff < v6)
                break;
            j = *(int *)((char *)&v5->field_0 + 4);
            if (j < 0xff)
                v7 = j;
            else
                v7 = 0xff;
            v9 = v3 - v6;
            v10 = (unsigned int)v7 + 1;
            if ((unsigned int)v4 == v6)
                v11 = v9;
            else
                v11 = v9 + 1;
            v3 = v11 + v7;
            v4 = v7;
            v6 = v10;
        } while (0x100 <= j);
        i += 1;
    } while (i != a0[1]);
    return v3;
}
