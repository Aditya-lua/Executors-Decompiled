/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9db70..0xa9dbe4 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a9db70(unsigned long a0, long long a1)
{
    unsigned int v2;  // w21
    unsigned int v3;  // w0
    char *v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = _strlen();
    v3 = _strlen(a1);
    if ((int)v2 > (int)(v3 + 1))
    {
        v4 = a0 + v2 - v3;
        if (!_strcmp(v4, a1) && *(v4 - 1) == 32)
            return (unsigned int)(v4 - a0 - 1);
    }
    return 0;
}
