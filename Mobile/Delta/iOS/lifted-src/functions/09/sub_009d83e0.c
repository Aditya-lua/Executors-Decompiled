/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d83e0..0x9d8440 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9d83e0(long long *a0, long long a1)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        return 0;
    }
    else if ((int)a0[5])
    {
        v2 = _strlen(a1);
        if (_fwrite(a1, v2, 1, a0[8]))
            return v2;
        return 0;
    }
    else
    {
        return 0;
    }
}
