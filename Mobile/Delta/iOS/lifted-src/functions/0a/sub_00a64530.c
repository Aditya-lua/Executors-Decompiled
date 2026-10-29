/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa64530..0xa645ec (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a64530(void* a0, void* a1)
{
    unsigned long v2;  // x0
    unsigned long v3;  // x0
    unsigned long v4;  // x0
    unsigned long v5;  // x8
    unsigned int v6;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (((long long)a0[16] || (v2 = sub_a3f728(), *(unsigned long *)&a0[16] = v2, v2)) && ((long long)a0[24] || (v3 = sub_a3f728(), *(unsigned long *)&a0[24] = v3, v3)) && ((long long)a0[8] || (v4 = sub_a3f728(), *(unsigned long *)&a0[8] = v4, v4)) && sub_a40520((long long)a0[16], (long long)a1[16]) && sub_a40520((long long)a0[24], (long long)a1[24]) && sub_a40520((long long)a0[8], (long long)a1[8]))
    {
        v5 = *(long long *)a1;
        v6 = 1;
    }
    else
    {
        sub_a3f568((long long)a0[16]);
        sub_a3f568((long long)a0[24]);
        sub_a3f568((long long)a0[8]);
        v5 = 0;
        v6 = 0;
    }
    *(unsigned long *)a0 = v5;
    return v6;
}
