/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bf170..0x9bf1d0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9bf170(long long a0, uint128_t *iter, unsigned long long a2, unsigned long a3, uint128_t *a4, unsigned long long a5)
{
    unsigned long long v3;  // x30
    unsigned long long v4;  // x17
    uint128_t v5;  // q0
    long long v6;  // x0
    unsigned long long i;  // x17
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a2)
        return a0;
    if (!a5)
        goto LABEL_0x9bf1d0;
    v0 = &v2;
    v1 = v3;
    v4 = a2;
    v5 = *a4;
    v6 = sub_9be840();
    do
    {
        i = v4;
        v6 = sub_9be860(v6 + 16);
        *iter = v5;
        iter += 1;
        v4 = i - 16;
    } while (16 < i);
    *a4 = v5;
    return v6;
}
