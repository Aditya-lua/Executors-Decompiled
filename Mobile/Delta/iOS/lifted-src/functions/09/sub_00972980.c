/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x972980..0x972a64 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_972980(char *a0, char *a1, long long a2)
{
    char *v2;  // x20
    unsigned long long v3;  // x0
    char *i;  // x20
    unsigned int v5;  // w24
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = sub_972498();
    if (!(unsigned int)v3)
        return v3;
    sub_9721c8(a0, 0x22);
    if (a2 >= 1)
    {
        i = v2;
        do
        {
            v5 = *i;
            i += 1;
            sub_9721c8();
            sub_9721c8();
        } while (i < &v2[a2]);
    }
    v6 = sub_9721c8(a0, 0x22);
    if (!a0[5] && !*(long long *)&a0[72])
    {
        a0[6] = 2;
        if (*a0 & 1)
            return sub_9721c8();
        return v6;
    }
    a0[6] = 2;
    return v6;
}
