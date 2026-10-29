/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5a00..0x1a5aec (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5a00_0 {
    char field_0;
} st_1a5a00_0;


long long sub_1a5a00(long long a0, long long a1, long long a2)
{
    unsigned long v0;  // [bp-0x58]
    long long v1;  // [bp-0x58]
    long long v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    char v4;  // [bp-0x47]
    st_1a5a00_0 **v5;  // [bp-0x40], Other Possible Types: char
    st_1a5a00_0 *v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = &v5;
    v5 = &v6;
    v1 = sub_1a5184();
    v2 = a0;
    v3 = 0;
    sub_16f34(&v4);
    sub_1b3054(v1 + 32, a2);
    v3 = 1;
    sub_626e0(a0, v6, sub_1a2c2c(a0, a1, &v6, v1 + 32), v1);
    v0 = 0;
    sub_1b5ac4(&v0, 0);
    return v1;
}
