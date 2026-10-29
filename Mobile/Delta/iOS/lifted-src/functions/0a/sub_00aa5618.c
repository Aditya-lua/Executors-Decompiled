/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa5618..0xaa575c (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa5618_1 {
    char padding_0[8];
    long long field_8;
} st_aa5618_1;

typedef struct st_aa5618_0 {
    char padding_0[1];
    char field_1;
    char padding_2[6];
    long long field_8;
    long long field_10;
} st_aa5618_0;

extern long long g_aa575c;

st_aa5618_0 * sub_aa5618(st_aa5618_0 *a0, unsigned long long *a1, unsigned long a2)
{
    st_aa5618_0 *v2;  // x0
    st_aa5618_0 *v3;  // x0
    st_aa5618_0 *v4;  // x21
    unsigned int v5;  // w0
    st_aa5618_0 *v6;  // x23
    st_aa5618_1 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = sub_a7c17c(a0->field_10);
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_ad61e0(0, sub_a2cf88(a0->field_8));
    if (!v3)
        return sub_a7c1b4();
    v4 = v3;
    sub_a7b61c(a0->field_8, &g_aa575c, v4);
    sub_a7c1b4(a0->field_10);
    v5 = sub_ad69e4(v4);
    if ((int)v5 >= 1)
    {
        v6 = 0;
        do
        {
            v7 = sub_ad69f8(v4, v6);
            if ((int)sub_ad69e4(v7->field_8) >= 1)
            {
                sub_ad69f8(v7->field_8, 0);
                a1();
            }
        } while ((v6 = (unsigned int)v6 + 1, (unsigned int)v6 != v5));
    }
}
