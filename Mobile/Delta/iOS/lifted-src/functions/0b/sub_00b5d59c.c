/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5d59c..0xb5d610 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b5d59c(void* a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, long long a5)
{
    unsigned int v2;  // w0
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((long long)a0[0x88])
        v2 = sub_a93a14(a0 + 80);
    else
        v2 = sub_a9352c(a0 + 80);
    v3 = !v2;
    if (!a4)
    {
        return v3;
    }
    else if (!v2)
    {
        return sub_a94058(a0 + 80, a4, a5) != 0;
    }
    else
    {
        return v3;
    }
}
