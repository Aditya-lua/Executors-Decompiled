/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc52410..0xc524ac (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char ** sub_c52410(char **a0)
{
    char *v2;  // x20
    char *v3;  // x21
    char **v4;  // x0
    char **v5;  // x22
    char *v6;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (!v2)
        return a0;
    v3 = a0[1];
    v4 = a0;
    if (v4[1])
    {
        v5 = v2 + 16;
        do
        {
            v6 = v3;
            if (*(long long *)((char *)v5 - 16) && *(long long *)((char *)v5 - 8))
            {
                if (*v5)
                    _free();
                if (v5[2])
                    _free(v5[1]);
            }
        } while ((v5 += 9, v3 = v6 - 1, v6 != 1));
        v4 = _free(v2);
    }
    if (!a0[3])
        return v4;
    return _free();
}
