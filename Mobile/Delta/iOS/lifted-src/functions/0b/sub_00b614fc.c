/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb614fc..0xb616c4 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern void g_b659ec;
extern void g_b65a28;

unsigned int sub_b614fc(void* a0, unsigned int a1, void* a2, unsigned int a3)
{
    unsigned int v0;  // [bp-0x24]
    unsigned int v1;  // [bp-0x14]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a1;
    if (a2 && *(char *)a2 == 49 && a3 == 112)
    {
        if (!a0)
        {
            v1 = 0xfffffffe;
            return v1;
        }
        *(unsigned long long *)&a0[48] = 0;
        if (!(long long)a0[64])
        {
            *(void **)&a0[64] = &g_b659ec;
            *(unsigned long long *)&a0[80] = 0;
        }
        if (!(long long)a0[72])
            *(void **)&a0[72] = &g_b65a28;
        (long long)a0[64]();
    }
    v1 = 0xfffffffa;
    return v1;
}
