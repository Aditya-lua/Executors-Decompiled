/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa79674..0xa79700 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a79674(void* a0, long long a1)
{
    unsigned long v2;  // x21
    unsigned int v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((long long)a0[72] && (int)sub_ad69e4((long long)a0[72]) >= 1)
    {
        v2 = 0;
        do
        {
            if (sub_a6fbc4(a1, *(long long *)sub_ad69f8((long long)a0[72], v2)))
            {
                v3 = sub_a71744();
                if (!v3)
                    return v3;
            }
        } while ((v2 = (unsigned int)v2 + 1, (int)sub_ad69e4((long long)a0[72]) > (int)v2));
    }
    return 1;
}
