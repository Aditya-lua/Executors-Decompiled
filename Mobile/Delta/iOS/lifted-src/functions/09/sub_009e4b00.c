/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4b00..0x9e4c34 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_9e4b00(void* a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long idx;  // x0
    unsigned long long v13;  // x8
    unsigned long v14;  // x21
    unsigned long v15;  // x9
    int v16;  // w8
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
    idx = sub_a6bffc(24, "crypto/bn/bn_lib.c", 246);
    if (idx)
    {
        *(unsigned int *)(idx + 20) = (int)a0[20] & 8 | 1;
        v13 = 12;
        if (!((char)a0[20] & 4))
            v13 = 8;
        if (idx != a0)
        {
            v14 = *(int *)((char *)a0 + v13);
            if ((int)v14 <= *(int *)(idx + 12) || (idx = idx, sub_9e49b8()))
            {
                v16 = (int)a0[8];
                if ((int)a0[8] >= 1)
                {
                    _memcpy(*(long long *)idx, *(long long *)a0, v14 * 8);
                    v16 = (int)a0[8];
                }
                *(int *)(idx + 16) = (int)a0[16];
                *(int *)(idx + 8) = v16;
            }
            else
            {
                v15 = *(int *)(idx + 20);
                if (!(v15 >> 1 & 1))
                {
                    if (!(v15 >> 3 & 1))
                        sub_a6c2e4(*(long long *)idx, "crypto/bn/bn_lib.c", 209);
                    else
                        sub_a6d4c0(*(long long *)idx, *(int *)(idx + 12) * 8, "crypto/bn/bn_lib.c", 205);
                }
                if (*(char *)(idx + 20) & 1)
                    sub_a6c2e4();
                idx = 0;
            }
        }
    }
    return idx;
}
