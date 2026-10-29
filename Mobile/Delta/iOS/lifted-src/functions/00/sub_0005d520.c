/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5d520..0x5d550 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5d520_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_5d520_0;

extern long long g_f011d0;

st_5d520_0 * sub_5d520(unsigned long a0, long long a1, unsigned long a2)
{
    st_5d520_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_5a99c(a1, &g_f011d0);
    v2->field_8 = a2;
    return v2;
}
