/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d994..0x7d9cc (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_7d994(long long *a0)
{
    long long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v2 = a0[4];
    if ((unsigned long long)a0[3] > (unsigned long long)v2)
    {
        v0 = &v1;
        _bzero(v2, a0[3] - v2);
    }
}
