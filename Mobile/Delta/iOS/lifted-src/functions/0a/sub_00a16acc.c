/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa16acc..0xa16b20 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a16acc(void* a0, unsigned int a1, unsigned int a2)
{
    unsigned int v7;  // w0
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = 0;
    if (!a1)
        return 0;
    v0 = v8;
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = &v6;
    v5 = v12;
    if (a2)
    {
        sub_9e4838(*(long long *)a0);
        sub_9e4838((long long)a0[8]);
        *(unsigned long long *)a0 = a1;
        *(unsigned long long *)&a0[8] = a2;
        v7 = 1;
    }
    return v7;
}
