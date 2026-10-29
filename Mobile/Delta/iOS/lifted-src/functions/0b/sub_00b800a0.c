/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb800a0..0xb800f8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

int sub_b800a0(long long a0)
{
    unsigned int v4;  // w0
    char v0;  // [bp-0xa0]
    char v1;  // [bp-0x60]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    sub_b80120(&v1, a0);
    sub_b7dad4(&v0, &v1);
    v4 = sub_b806e8(&v0, a0);
    sub_b7f370(&v0);
    return v4 ^ 1;
}
