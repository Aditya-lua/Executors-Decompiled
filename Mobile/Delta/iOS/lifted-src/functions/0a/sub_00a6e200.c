/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e200..0xa6e258 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a6e200(char *a0, char *a1)
{
    char *v2;  // x20
    unsigned int v3;  // w21
    unsigned int v4;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    while (1)
    {
        v2 = a0;
        v3 = sub_a69994(*v2);
        v4 = sub_a69994(*a1);
        if (v3 != v4)
            break;
        a1 += 1;
        a0 = v2 + 1;
        if (!*v2)
        {
            v4 = v3;
            break;
        }
    }
    return v3 - v4;
}
