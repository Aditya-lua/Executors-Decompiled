/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95a828..0x95a97c (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95a828_0 {
    char padding_0[36];
    unsigned int field_24;
    char padding_28[24];
    char field_40;
} st_95a828_0;

extern long long g_96123c;
extern unsigned int g_d27c58[4];

long long sub_95a828(unsigned int *a0, long long *a1, long long *a2, long long a3)
{
    long long v2;  // x0
    long long v3;  // x20
    long long v4;  // w0
    long long v5;  // w24
    st_95a828_0 *v6;  // x0
    unsigned int v7;  // x0
    long long v8;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad5f4c(*a1);
    if (!v2)
        return v2;
    v3 = v2;
    if ((int)sub_ad69e4() >= 1)
    {
        do
        { } while (*(int *)(sub_ad69f8(v3, 0) + 44) == 772 && (sub_ad664c(v3, 0), 0 < (int)sub_ad69e4(v3)));
    }
    v4 = (unsigned int)sub_ad69e4(a3);
    if (v4 >= 1)
    {
        v5 = v4 + 1;
        do
        {
            v6 = sub_ad69f8(a3, v5 - 2);
            if (!(a0[424] & v6->field_24) && !(a0[425] & g_d27c58[2 * v6->field_40]))
                sub_ad68b0(v3);
        } while ((v5 -= 1, v5 > 1));
    }
    v7 = sub_ad5f4c(v3);
    if (!v7)
    {
        sub_ad6020(v3);
        return 0;
    }
    v8 = v7;
    sub_ad6020(*a2);
    *a2 = v8;
    sub_ad5f30(v8, &g_96123c);
    sub_ad6ae4(*a2);
    sub_ad6020(*a1);
    *a1 = v3;
    return 1;
}
