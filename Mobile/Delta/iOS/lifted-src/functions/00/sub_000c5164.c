/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5164..0xc5208 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5164_0 {
    char field_0;
} st_c5164_0;

extern long long g_cc0ec0;

unsigned long long sub_c5164(long long a0, long long a1, long long a2, long long a3)
{
    long long v4;  // x0
    long long v5;  // x23
    unsigned long long v6;  // x0
    st_c5164_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_c5164_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_c505c(&g_cc0ec0);
    if (!v4)
        return 0xffffffffffffffc0;
    v5 = v4;
    v6 = sub_c599c(v5, a0, a1, a2, a3, 0, 0, sub_c5704());
    sub_c5208(v5);
    return v6;
}
