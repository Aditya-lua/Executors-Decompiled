/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e48d4..0x9e4958 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_9e48d4(void* a0)
{
    unsigned long v5;  // x9
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v5 = (int)a0[20];
    if (!(v5 >> 1 & 1))
    {
        v0 = v6;
        v1 = v7;
        v2 = &v4;
        v3 = v8;
        if (!(v5 >> 3 & 1))
            sub_a6c2e4(*(long long *)a0, "crypto/bn/bn_lib.c", 209);
        else
            sub_a6d4c0(*(long long *)a0, (int)a0[12] * 8, "crypto/bn/bn_lib.c", 205);
    }
    if ((char)a0[20] & 1)
        return sub_a6c2e4();
    return a0;
}
