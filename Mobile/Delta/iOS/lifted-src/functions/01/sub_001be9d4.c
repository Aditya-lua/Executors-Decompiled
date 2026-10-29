/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be9d4..0x1bea80 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1be9d4_1 {
    struct st_1be9d4_1 *field_0;
} st_1be9d4_1;

typedef struct st_1be9d4_0 {
    char field_0;
} st_1be9d4_0;


unsigned long long sub_1be9d4(long long a0, long long a1)
{
    st_1be9d4_1 **v5;  // x0
    unsigned long long v6;  // x8
    unsigned long long v7;  // x8
    st_1be9d4_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1be9d4_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_1a296c();
    if (!v5)
        return 0;
    v6 = 1;
    while (1)
    {
        v7 = v6;
        v5 = *v5;
        sub_1be52c(a0);
        sub_1adcd8(&v2, 0);
        if (!v5)
            return v7;
        v6 = v7 + 1;
        if (!(sub_1b01e8(v5 + 2, a1) & 1))
            return v7;
    }
}
