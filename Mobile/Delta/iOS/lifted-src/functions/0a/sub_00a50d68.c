/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50d68..0xa50db0 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_a50d68(void* a0, char a1)
{
    void* v2;  // x0
    void* v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (!((char)((char)v2[25]) >> 2 & 1))
        v2 = sub_a5d6b0((long long)a0[40]);
    v3 = v2;
    *(unsigned long long *)&a0[40] = a1;
    *(unsigned long long *)&a0[24] = (long long)a0[24] & 0xfffffffffffff800 | ((long long)a0[24] & 0xfffffffffffffbff | ((a1 != 0) * 0x400 | (char)(a1 != 0) >> 54) & 0x400) & 0x7ff;
    return v3;
}
