/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2b584..0xc2b638 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c2b584(unsigned long a0, unsigned long long *a1, unsigned long a2)
{
    void* v0;  // x10
    void* v1;  // x9
    unsigned long long iter;  // x10
    unsigned long long v3;  // x11
    void* v4;  // x9
    void* v5;  // x9

    v0 = *a1 + -(24 * a2);
    v1 = *(long long *)((char *)v0 - 16);
    iter = *(long long *)((char *)v0 - 8);
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
            goto LABEL_c2b608;
LABEL_c2b5d4:
        v5 = v1;
        if (1 < iter)
            goto LABEL_c2b620;
LABEL_c2b5dc:
        if (iter)
            goto LABEL_c2b5e0;
    }
    else
    {
        v3 = 0;
        v4 = v1;
        if (iter <= 3)
            goto LABEL_c2b5d4;
LABEL_c2b608:
        v1 = v4 + 4;
        v3 = 5871781006564002453 * (*(int *)v4 ^ __ROL__(v3, 5));
        iter -= 4;
        v5 = v1;
        if (iter <= 1)
            goto LABEL_c2b5dc;
LABEL_c2b620:
        v1 = v5 + 2;
        v3 = 5871781006564002453 * (*(short *)v5 ^ __ROL__(v3, 5));
        if (iter != 2)
        {
LABEL_c2b5e0:
            v3 = 5871781006564002453 * (*(char *)v1 ^ __ROL__(v3, 5));
        }
    }
    return 5871781006564002453 * (__ROL__(v3, 5) ^ 0xff);
}
