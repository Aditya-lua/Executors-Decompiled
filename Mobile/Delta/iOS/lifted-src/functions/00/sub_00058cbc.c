/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x58cbc..0x58d38 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_58cbc_0 {
    char field_0;
} st_58cbc_0;


unsigned long long sub_58cbc(long long a0, char *a1)
{
    unsigned long long v4;  // x0
    char *v5;  // x21
    char *v6;  // x21
    st_58cbc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_58cbc_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_5d170();
    if (!*a1)
        return v4;
    v5 = a1 + 1;
    do
    {
        v6 = v5;
        sub_5d170(a0);
        v5 = v6 + 1;
    } while (*v6);
    return v4;
}
