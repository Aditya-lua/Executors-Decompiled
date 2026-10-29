/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6a8d0..0xc6aa00 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c6a8d0(void* a0, void* a1, long long a2, unsigned long long n, void* a4, void* n1, unsigned long a6)
{
    unsigned long v2;  // x25
    void* iter;  // x22
    unsigned int v4;  // w8
    unsigned int v5;  // w20
    unsigned long v6;  // x8
    void* v7;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (0xff >= a6)
        {
            *(char *)a0 = 1;
            v2 = a0 + 2;
            *(char *)&a0[1] = a6;
            _memcpy(v2, a2, n);
            iter = v2 + n;
            if (a4 && n1)
            {
                _memcpy(iter, a4, n1);
                iter += n1;
            }
            v4 = iter - a0;
            v5 = (unsigned int)a6 * (unsigned int)((a6 + v4 - 1) / a6);
            if (v5 != v4)
                _bzero(iter, v5 - v4);
            if (!a1)
                return 1;
            v6 = v5;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        if (a1)
        {
            if (!a4)
                v7 = (void*)0;
            else
                v7 = (void*)(unsigned int)n1;
            v6 = a6 * (a6 + (long long)((unsigned int)n + v7 + 2) - 1) / a6;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/macs/kmac_prov.c", 608, "bytepad");
            sub_a36abc(57, 0xc0102, 0);
            return 0;
        }
    }
    *(unsigned long *)a1 = v6;
    return 1;
}
