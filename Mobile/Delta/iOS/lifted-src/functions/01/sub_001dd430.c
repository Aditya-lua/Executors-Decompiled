/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dd430..0x1dd48c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dd430_0 {
    char field_0;
} st_1dd430_0;


int sub_1dd430(long long a0)
{
    long long v5;  // x0
    st_1dd430_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1dd430_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_1dd6a4();
    if (v5)
    {
        sub_1be52c(a0, v5);
        sub_3b024(&v2, 0);
        v5 = 1;
    }
    return v5;
}
