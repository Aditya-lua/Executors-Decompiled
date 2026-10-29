/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e6584..0x9e65d8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9e6584(long long a0, unsigned long a1, long long a2)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ea45c();
    if (!v2)
    {
        return v2;
    }
    else if (sub_9e5528(a0, a2) >> 31 & 1)
    {
        return 1;
    }
}
