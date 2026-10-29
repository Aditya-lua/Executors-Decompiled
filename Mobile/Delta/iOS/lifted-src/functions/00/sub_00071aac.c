/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x71aac..0x71b68 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_71aac_0 {
    char field_0;
} st_71aac_0;


long long sub_71aac(long long a0, long long a1)
{
    long long v8;  // x0
    long long v9;  // x20
    unsigned long v10;  // x0
    unsigned long long v11;  // x0
    long long v12;  // x0
    st_71aac_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_71aac_0 *v1;  // [bp-0x68]
    st_71aac_0 **v2;  // [bp-0x60], Other Possible Types: char
    st_71aac_0 *v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = sub_71db4();
    if (a0 + 8 == v8)
        return a0 + 8;
    v9 = v8;
    v10 = sub_a0c8(a1);
    v11 = sub_6b08(a1);
    v12 = sub_a0c8(v9 + 32);
    v3 = &v2;
    v4 = v10;
    v2 = &v3;
    v5 = v11;
    if (!(sub_2a304(&v4, v12, sub_6b08(v9 + 32)) >> 31 & 1))
        return v9;
    return a0 + 8;
}
