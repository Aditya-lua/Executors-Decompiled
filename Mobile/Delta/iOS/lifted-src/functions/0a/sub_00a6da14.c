/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6da14..0xa6da94 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6da14_0 {
    struct st_a6da14_0 *field_0;
} st_a6da14_0;


st_a6da14_0 ** sub_a6da14(st_a6da14_0 **a0, st_a6da14_0 **a1, long long a2, long long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a6da14_0 **v12;  // x19
    st_a6da14_0 **v13;  // x1
    st_a6da14_0 **v14;  // x1
    st_a6da14_0 **v15;  // x20
    st_a6da14_0 **v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0;
    if (a1)
    {
        a0 = v12;
        v13 = a1;
        while (1)
        {
            v14 = v13;
            if (!*(char *)a0)
                break;
            a0 = (char *)a0 + 1;
            v13 = (char *)v14 - 1;
            if (v14 == 1)
            {
                a0 = v12 + a1;
                break;
            }
        }
    }
    v15 = a0 - v12;
    v16 = sub_a6bf4c((char *)v15 + 1, a2, a3);
    if (v16)
    {
        _memcpy();
        *(char *)(v16 + v15) = 0;
    }
    return v16;
}
