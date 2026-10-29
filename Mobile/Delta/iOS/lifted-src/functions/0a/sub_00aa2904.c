/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa2904..0xaa2978 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_aa2904(long long a0, unsigned long a1, unsigned long a2)
{
    long long v2;  // x0
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9cf0ec();
    if (v2)
    {
        v3 = v2;
        if (sub_9c7770() && sub_aa3d38(a0, 0x33, 4, v3))
        {
            v2 = 1;
        }
        else
        {
            sub_9cf0f4(v3);
            v2 = 0;
        }
    }
    return v2;
}
