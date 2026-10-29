/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c536c..0x9c53f0 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_9c536c(void* a0, unsigned int a1, unsigned long a2)
{
    unsigned int v3;  // w8
    void* v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    if ((*(int *)a0 | 4) != 5 && (long long)a0[8])
    {
        sub_9cdd00(&v0, 0, 0);
        a0 = v0;
    }
    *(unsigned int *)a0 = a1;
    if (a1 != 1)
    {
        *(unsigned long *)&a0[8] = a2;
        return a0;
    }
    if (!a2)
        v3 = 0;
    else
        v3 = 0xff;
    *(unsigned int *)&a0[8] = v3;
    return a0;
}
