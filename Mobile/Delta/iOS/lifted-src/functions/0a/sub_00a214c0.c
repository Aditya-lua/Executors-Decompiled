/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa214c0..0xa216a0 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a214c0(long long a0, unsigned long a1)
{
    char v0;  // [bp-0xe0]
    char v1;  // [bp-0xc0]
    char v2;  // [bp-0xa0]
    char v3;  // [bp-0x80]
    char *v4;  // [bp-0x60]
    char v5;  // [bp+0x0]

    v4 = &v5;
    sub_a21360(&v0);
    sub_a211f0(&v2);
    sub_a21360(&v1);
    sub_a21400(&v2);
    sub_a211f0(&v0);
    sub_a21010(&v3);
    sub_a21360(a0 + 64);
    sub_a211f0(&v3);
    sub_a21450(a0 + 32);
    sub_a21010(&v1);
    sub_a21360(sub_a21360(&v1));
    sub_a21010(&v0);
    sub_a21360(&v3);
    sub_a213b0(sub_a211f0(a0));
    sub_a21010(sub_a21400(&v0));
    return sub_a213b0(a0 + 32);
}
