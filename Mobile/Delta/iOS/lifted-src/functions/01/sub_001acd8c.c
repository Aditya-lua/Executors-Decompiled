/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1acd8c..0x1acdd4 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_1acd8c(void* a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    void* v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!*(long long *)a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_c84c();
    v8 = sub_4e14(*(long long *)a0, (long long)a0[16] - *(long long *)a0 >> 4, 8);
    memset(a0, 0, 24);
    return v8;
}
