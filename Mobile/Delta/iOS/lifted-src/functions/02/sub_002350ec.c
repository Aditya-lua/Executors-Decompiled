/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2350ec..0x235194 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2350ec_0 {
    char field_0;
} st_2350ec_0;


long long sub_2350ec(long long a0)
{
    unsigned long long *v6;  // x0
    unsigned long v7;  // x20
    st_2350ec_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_2350ec_0 *v1;  // [bp-0x48]
    char v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    sub_2349a8();
    v6 = sub_620ac(a0, &v2, v3 + 32);
    v7 = *v6;
    if (!*v6)
    {
        sub_626e0(a0, v2);
        v7 = v3;
        v3 = 0;
    }
    sub_62a84(&v3, 0);
    return v7;
}
