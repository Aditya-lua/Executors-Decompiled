/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99a5b8..0x99a5f8 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_99a5b8(void* a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // d0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (*(int *)a0 < 0)
        return v8;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_9d66cc((int)a0[4]);
    sub_9d66cc(*(int *)a0);
    *(unsigned long *)a0 = 0xffffffffffffffff;
    return 0xffffffffffffffff;
}
