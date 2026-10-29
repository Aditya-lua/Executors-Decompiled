/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2b1b0..0xc2b25c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c2b1b0(unsigned long a0, unsigned long long *a1, unsigned long a2)
{
    void* v0;  // x10
    void* v1;  // x9
    unsigned long long iter;  // x10
    unsigned long long v3;  // x11
    void* v4;  // x9
    void* v5;  // x9

    v0 = *a1 - a2 * 32;
    v1 = *(long long *)((char *)v0 - 24);
    iter = *(long long *)((char *)v0 - 16);
    if (iter >= 8)
    {
        v3 = 0;
        do
        {
            v4 = v1 + 8;
            v3 = 5871781006564002453 * (*(long long *)v1 ^ __ROL__(v3, 5));
            iter -= 8;
            v1 = v4;
        } while (7 < iter);
        v1 = v4;
        if (3 < iter)
            goto LABEL_c2b22c;
LABEL_c2b1f8:
        v5 = v1;
        if (1 < iter)
            goto LABEL_c2b244;
LABEL_c2b200:
        if (iter)
            goto LABEL_c2b204;
    }
    else
    {
        v3 = 0;
        v4 = v1;
        if (iter <= 3)
            goto LABEL_c2b1f8;
LABEL_c2b22c:
        v1 = v4 + 4;
        v3 = 5871781006564002453 * (*(int *)v4 ^ __ROL__(v3, 5));
        iter -= 4;
        v5 = v1;
        if (iter <= 1)
            goto LABEL_c2b200;
LABEL_c2b244:
        v1 = v5 + 2;
        v3 = 5871781006564002453 * (*(short *)v5 ^ __ROL__(v3, 5));
        if (iter != 2)
        {
LABEL_c2b204:
            v3 = 5871781006564002453 * (*(char *)v1 ^ __ROL__(v3, 5));
        }
    }
    return 5871781006564002453 * (__ROL__(v3, 5) ^ 0xff);
}
