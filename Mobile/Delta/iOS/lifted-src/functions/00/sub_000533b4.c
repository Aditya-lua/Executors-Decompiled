/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x533b4..0x5346c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_533b4_0 {
    char field_0;
} st_533b4_0;


int sub_533b4(long long *a0, unsigned long a1)
{
    st_533b4_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_533b4_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x38]
    st_533b4_0 **v4;  // [bp-0x30], Other Possible Types: char
    st_533b4_0 *v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v3 = a1;
    sub_539c0(a1, a0 + 11, a0[4], a0[5], a0[10]);
    v5 = &v4;
    v4 = &v5;
    if (!sub_6b08(&v2))
        return 1;
    sub_5346c(a0[1], &v3);
    sub_5ccc(sub_52ef4(a0[1], &v3) + 8, &v2);
    return 1;
}
