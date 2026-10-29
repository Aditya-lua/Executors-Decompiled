/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971c5c..0x971cd0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_971c5c(void* ptr, unsigned long a1, unsigned int a2)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned long long *)&ptr[80] = 0;
    memset(ptr, 0, 80);
    *(unsigned int *)ptr = a2;
    *(char *)&ptr[4] = 0;
    v2 = sub_a6bf4c(0x1000, "ssl/quic/json_enc.c", 23);
    *(unsigned long *)&ptr[48] = v2;
    if (!v2)
        return 0;
    *(uint128_t *)&ptr[56] = 0x1000;
    *(unsigned long *)&ptr[40] = a1;
    *(char *)&ptr[6] = 2;
    return 0x1000;
}
