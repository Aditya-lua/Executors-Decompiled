/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc374..0x1bc408 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc374_0 {
    char field_0;
} st_1bc374_0;


long long sub_1bc374(unsigned long a0, long long a1, long long a2)
{
    st_1bc374_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1bc374_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    char v3;  // [bp-0x38], Other Possible Types: long long
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    memset(a0, 0, 24);
    v3 = 0;
    if (a1)
    {
        sub_2be1c(a0);
        sub_2a038(a0, a1, a2);
    }
    v3 = 1;
    sub_cecf4(&v2);
    return a0;
}
