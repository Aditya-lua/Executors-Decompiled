/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b01e8..0x1b0298 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b01e8_0 {
    char field_0;
} st_1b01e8_0;


long long sub_1b01e8(long long a0, long long a1)
{
    unsigned long long v5;  // x0
    long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    st_1b01e8_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1b01e8_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x31]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_6b08();
    if (v5 != sub_6b08(a1))
        return 0;
    v6 = sub_a0c8(a0);
    v7 = sub_a0c8(a0);
    v8 = sub_6b08(a0);
    return sub_1b32fc(v6, v7 + v8, sub_a0c8(a1), &v2);
}
