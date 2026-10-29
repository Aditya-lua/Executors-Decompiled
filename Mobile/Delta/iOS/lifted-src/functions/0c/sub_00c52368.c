/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc52368..0xc52410 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char ** sub_c52368(char **a0)
{
    char *v2;  // x19
    char *v3;  // x21
    char **v4;  // x22
    char *v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*a0)
        return a0;
    v2 = a0[1];
    if (!v2)
        return a0;
    v3 = a0[2];
    if (a0[2])
    {
        v4 = v2 + 16;
        do
        {
            v5 = v3;
            if (*(long long *)((char *)v4 - 16) && *(long long *)((char *)v4 - 8))
            {
                if (*v4)
                    _free();
                if (v4[2])
                    _free(v4[1]);
            }
        } while ((v4 += 9, v3 = v5 - 1, v5 != 1));
        _free(v2);
    }
    if (!a0[4])
        return a0;
    return _free();
}
