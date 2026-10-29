/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2d338..0xb2d398 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2d338_0 {
    struct st_b2d338_0 *field_0;
} st_b2d338_0;


unsigned long long sub_b2d338(long long a0, st_b2d338_0 **a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
    {
        return 1;
    }
    else if (*a1)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_b2da4c();
        if (!(unsigned int)v8)
            return v8;
        return sub_a71994(a1, "info", a0 + 120, a0 + 128, "(x") != 0;
    }
    else
    {
        return 1;
    }
}
