/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c0270..0x9c03b8 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c0270_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    unsigned long long field_10;
} st_9c0270_0;


unsigned int sub_9c0270(st_9c0270_0 *a0, unsigned int a1)
{
    unsigned int v2;  // w9
    unsigned int v3;  // w9
    unsigned long v4;  // x11
    unsigned long v5;  // x20
    unsigned long iter;  // x20
    unsigned int v7;  // x19
    unsigned long v8;  // x8
    unsigned int v9;  // x14
    unsigned long v10;  // x20
    unsigned long n;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = a0->field_0;
    v3 = v2;
    if ((int)v3 >= 1)
    {
        if (!(a0->field_10 >> 3 & 1))
        {
            do
            {
                v3 = v2;
                v4 = v3;
                if (*(char *)(a0->field_8 - 1 + v4))
                {
                    v8 = *(char *)(a0->field_8 + v4 - 1);
                    if (!(v8 & 1))
                    {
                        if (v8 >> 1 & 1)
                        {
                            v9 = 1;
                            goto LABEL_9c0334;
                        }
                        else if (!(v8 >> 2 & 1))
                        {
                            if (!(unsigned int)v8)
                                v9 = 0;
                            else
                                v9 = 7;
                            if ((unsigned int)v8 & 64)
                                v9 = 6;
                            if ((unsigned int)v8 & 32)
                                v9 = 5;
                            if ((unsigned int)v8 & 16)
                                v9 = 4;
                            if ((unsigned int)v8 & 8)
                                v9 = 3;
                            goto LABEL_9c0334;
                        }
                        else
                        {
                            v9 = 2;
                            goto LABEL_9c0334;
                        }
                    }
                    goto LABEL_9c0330;
                }
            } while ((v2 = v3 - 1, 1 < (int)v3));
            if (!a1)
                return 1;
            v5 = *(long long *)a1;
            *(char *)v5 = 0;
            iter = v5 + 1;
            v7 = 1;
        }
        else
        {
            v9 = (char)a0->field_10 & 7;
            v3 = v2;
LABEL_9c0334:
            v7 = v3 + 1;
            if (!a1)
                return v3 + 1;
            v10 = *(long long *)a1;
            *(char *)v10 = v9;
            iter = v10 + 1;
            if ((int)v3 >= 1)
            {
                n = v3;
                _memcpy(iter, a0->field_8, n);
                iter += n;
                *(char *)(iter - 1) = *(char *)(iter - 1) & (char)(0xff << (v9 & 31));
            }
        }
        *(unsigned long *)a1 = iter;
        return v7;
    }
LABEL_9c0330:
    v9 = 0;
    goto LABEL_9c0334;
}
