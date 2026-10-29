/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f4104..0x1f41a8 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f4104_0 {
    char field_0;
} st_1f4104_0;


long long sub_1f4104(void* a0, unsigned int a1)
{
    unsigned long v2;  // x10
    void* v3;  // x11
    unsigned long v4;  // x15
    unsigned long idx;  // x13
    unsigned int v6;  // w14
    unsigned int *v7;  // x15
    unsigned int v8;  // w14
    unsigned int *v9;  // x15
    unsigned long v10;  // x15
    st_1f4104_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f4104_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if ((unsigned long long)(long long)a0[32] < 2)
        return 0;
    v2 = 0;
    v3 = (long long)a0[24];
    v4 = 1;
    do
    {
        idx = v4 + 1;
        v6 = *(int *)((char *)v3 + 4 * idx);
        if (v6)
        {
            idx = v4 + v6 - 1 + 2;
            v7 = v3 + 8 + v4 * 4;
            do
            {
                v8 = v6;
                v9 = v7 + 1;
                if (*v7 == a1)
                    return *(long long *)a0 + (v2 & 0xffffffff);
            } while ((v6 = v8 - 1, v7 = v9, v8 != 1));
        }
    } while ((v10 = idx + 1, v2 += *(int *)((char *)v3 + 4 * v4), v4 = idx + 1, (unsigned long long)(long long)a0[32] > v4));
    return 0;
}
