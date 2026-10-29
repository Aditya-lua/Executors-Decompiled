/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabcb00..0xabcbe0 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_abcb00(unsigned long long *a0, void* a1, unsigned long long a2, unsigned long long a3, unsigned int a4)
{
    void* iter;  // x20
    unsigned long long v3;  // x21
    unsigned long long v12;  // x21
    char *v13;  // x20
    unsigned long long v14;  // x4
    unsigned long long v15;  // x21
    char *v16;  // x20
    unsigned long long v17;  // x4
    unsigned long long v18;  // x21
    char *v19;  // x20
    unsigned long long v20;  // x4
    unsigned long long v21;  // x21
    unsigned long long *v4;  // x0
    char *v22;  // x20
    unsigned long long v23;  // x4
    unsigned long long v5;  // x3
    unsigned long long v6;  // x21
    unsigned long long i;  // x3
    unsigned long v8;  // x4
    char *v10;  // x20
    unsigned long long v11;  // x4
    char *v0;  // [bp-0x30]
    char v1;  // [bp+0x0]

    v0 = &v1;
    iter = a1;
    v3 = a2;
    v4 = a0;
    v5 = a3;
    if (a4)
        goto LABEL_abcb48;
    while (1)
    {
        do
        {
            i = v5;
            v8 = *v4;
            if (v3 < 8)
            {
                *(char *)iter = v8;
                v10 = iter + 1;
                v11 = v8 >> 8;
                v12 = v3 - 1;
                if (v3 == 1)
                    return (char *)v4 + 1;
                *v10 = v11;
                v13 = v10 + 1;
                v14 = v11 >> 8;
                v15 = v12 - 1;
                if (v12 != 1)
                {
                    *v13 = v14;
                    v16 = v13 + 1;
                    v17 = v14 >> 8;
                    v18 = v15 - 1;
                    if (v15 != 1)
                    {
                        *v16 = v17;
                        v19 = v16 + 1;
                        v20 = v17 >> 8;
                        v21 = v18 - 1;
                        if (v18 != 1)
                        {
                            *v19 = v20;
                            v22 = v19 + 1;
                            v23 = v20 >> 8;
                            if (v21 != 1)
                            {
                                *v22 = v23;
                                if (v21 != 2)
                                    v22[1] = v23 >> 8;
                            }
                        }
                    }
                }
                return (char *)v4 + 1;
            }
            *(unsigned long *)iter = v8;
            iter += 8;
            v6 = v3 - 8;
            if (v3 == 8)
                return v4 + 1;
            v5 = i - 8;
            v4 += 1;
        } while (8 < i);
LABEL_abcb48:
        sub_abc7e0(a0);
        v4 = a0;
        v5 = a3;
    }
}
