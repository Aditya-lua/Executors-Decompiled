/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d8b4..0xa2d974 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d8b4_0 {
    struct st_a2d8b4_0 *field_0;
    char field_1;
    char padding_2[22];
    struct st_a2d8b4_0 *field_18;
} st_a2d8b4_0;

typedef struct st_a2d8b4_1 {
    char padding_0[80];
    struct st_a2d8b4_0 *field_50;
} st_a2d8b4_1;


st_a2d8b4_0 * sub_a2d8b4(st_a2d8b4_0 *a0, unsigned long a1)
{
    st_a2d8b4_0 *v2;  // w0
    st_a2d8b4_0 *v3;  // x22
    st_a2d8b4_0 *v4;  // x1
    long long v5;  // x0
    st_a2d8b4_1 *v6;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_c66c30();
        return 0;
    }
    if (!*(long long *)&a0->padding_2[15])
        return 1;
    v2 = (st_a2d8b4_0 *)(unsigned int)sub_a2c0c0(a0);
    if (v2)
    {
        v3 = 0;
        while (1)
        {
            v4 = v3;
            v5 = sub_ad69f8(*(long long *)&a0->padding_2[15], v4);
            v6 = sub_a2d030(v5, v4);
            if (sub_9f2aec(v5) && v6->field_50)
                v6->field_50();
            v3 = (char *)&v3->field_0 + 1;
            if (v2 == v3)
                return 1;
        }
    }
    return 1;
}
