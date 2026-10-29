/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97fd74..0x97fe00 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97fd74_0 {
    char padding_0[120];
    long long field_78;
    char padding_80[32];
    long long field_a0;
    char padding_a8[168];
    unsigned short field_150;
} st_97fd74_0;

extern unsigned int g_d284dc[4];

unsigned int sub_97fd74(st_97fd74_0 **a0)
{
    st_97fd74_0 *v2;  // x20
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (!(v2->field_150 >> 5 & 1) && !sub_977368(v2->field_a0) && sub_97733c(v2->field_a0))
    {
        if (sub_977384(*a0->field_a0))
            return 1;
        v3 = sub_962858(*a0->field_78) - 4;
        if (4 < v3)
            return 0;
        return g_d284dc[v3];
    }
    return 0xffffffff;
}
