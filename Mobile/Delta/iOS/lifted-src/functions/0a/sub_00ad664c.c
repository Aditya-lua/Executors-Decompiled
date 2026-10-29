/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad664c..0xad66d4 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad664c_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_ad664c_0;


unsigned long long sub_ad664c(st_ad664c_0 *a0, unsigned long long a1)
{
    st_ad664c_0 *v5;  // x8
    unsigned long v6;  // x10
    unsigned long long *ptr;  // x9
    unsigned long long v8;  // x0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a0;
    if (!v5)
    {
        return 0;
    }
    else if (!(a1 >> 31 & 1))
    {
        v6 = v5->field_0;
        if ((int)v6 <= (int)a1)
            return 0;
        ptr = v5->field_8 + (a1 & 0xffffffff) * 8;
        v8 = *ptr;
        if ((unsigned int)v6 - 1 != (unsigned int)a1)
        {
            v0 = v9;
            v1 = v10;
            v2 = &v4;
            v3 = v11;
            _memmove(ptr, ptr + 1, (long long)((v6 + ~(unsigned int)a1) * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v6 + ~(unsigned int)a1, 3) & 0x7fffffff8 & 0x7ffffffff);
            a1 = v5->field_0 - 1;
        }
        v5->field_0 = a1;
        return v8;
    }
    else
    {
        return 0;
    }
}
