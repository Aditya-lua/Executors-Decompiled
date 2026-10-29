/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c57b0..0x1c580c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

long long sub_1c57b0(long long a0, long long a1, long long a2)
{
    long long i;  // x0
    long long v3;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = sub_1a6a48();
    if (i != a1)
    {
        do
        {
            v3 = i;
            i = sub_1a6a48(a0, v3, a2);
        } while (i != v3);
        return v3;
    }
    sub_1a3d88();
}
