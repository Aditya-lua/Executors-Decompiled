/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2fa0..0x1b3054 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b2fa0_0 {
    char field_0;
} st_1b2fa0_0;

long long sub_1b2fa0(long long a0, long long a1, long long a2)
{
    long long v4;  // x0
    st_1b2fa0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1b2fa0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1c7324();
    if (v4 != a1)
    {
        return v4;
    }
    else if (sub_1bf5c0(a0, a1, a2) == a1)
    {
        return a1;
    }
    else
    {
        return sub_1c3e08(a0);
    }
}
