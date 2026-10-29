/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc667a0..0xc66824 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_c667a0(unsigned long long *a0, unsigned int a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 == 10)
    {
        v2 = sub_a5af48();
        if (v2)
            v2 = sub_9ff4b4();
    }
    else if (a1 != 9)
    {
        v2 = 0xfffffffe;
    }
    else if (*(int *)a0 && !a0[12])
    {
        v2 = sub_a5af48();
    }
    else
    {
        v2 = 0;
    }
    return v2;
}
