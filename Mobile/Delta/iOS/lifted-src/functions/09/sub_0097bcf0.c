/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97bcf0..0x97be94 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_97bcf0(void* a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long v2;  // x8
    unsigned long v3;  // x22
    unsigned long long v4;  // x9
    unsigned long v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(long long)a0[56])
        (long long)a0[64]();
    v2 = (long long)a0[16] + a1;
    *(unsigned long *)&a0[16] = v2;
    v3 = (long long)a0[40];
    if (v3 * 3 > 0xffffffffffffffff)
        v4 = (v3 >> 2) * 3 + ((v3 & 3) * 3 >> 2);
    else
        v4 = v3 * 3 >> 2;
    if ((char)a0[90])
    {
        return;
    }
    else if (v4 < *(long long *)a0 - v2)
    {
        return;
    }
    else if (v2 != (long long)a0[24])
    {
        (long long)a0[64]();
    }
    else
    {
        if (a2 < v3)
            v5 = v3;
        else
            v5 = a2;
        if (v5 >= (unsigned long long)(long long)a0[48])
            v5 = (long long)a0[48];
        *(unsigned long *)&a0[40] = v5;
        (long long)a0[64]();
    }
}
