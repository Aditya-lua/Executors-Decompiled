/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa43ab4..0xa43c84 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a43ab4_0 {
    char padding_0[248];
    char field_f8;
    char padding_f9[247];
    unsigned long long field_1f0;
    unsigned long long field_1f4;
    char field_1f8;
    char padding_1f9[239];
    int field_2e8;
    int field_2ec;
} st_a43ab4_0;

extern unsigned int g_f0d568;

unsigned long long sub_a43ab4(long long a0, unsigned int a1, long long a2)
{
    long long v2;  // x20
    st_a43ab4_0 *v3;  // x0
    st_a43ab4_0 *v4;  // x19
    unsigned int v5;  // w0
    long long v6;  // x22
    long long v7;  // x1
    st_a43ab4_0 *v8;  // x2
    unsigned long long v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = sub_9ffdd8();
    if (!a1 && !v2)
        return 1;
    v4 = v3;
    if (a1)
    {
        v5 = sub_a50904(a0);
        if ((int)v5 <= 0)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/e_aes.c", 3924, "aes_ocb_init_key");
            sub_a36abc(6, 130, 0);
            return 0;
        }
        v6 = v5 * 8;
        if (!(g_f0d568 >> 2 & 1))
        {
            v7 = v6;
            v8 = v4;
            if (!(g_f0d568 & 1))
            {
                sub_9b8880(a1, v7, v8);
                sub_9b8ba4(a1, v7, &v4->field_f8);
            }
            else
            {
                sub_9bf0e0(a1, v7, v8);
                sub_9bf120(a1, v7, &v4->field_f8);
            }
        }
        else
        {
            sub_9b9440(a1, v6, v4);
            sub_9b9660(a1, v6, &v4->field_f8);
        }
        v9 = sub_a96854(&v4->field_1f4, v4, &v4->field_f8);
        if (!(unsigned int)v9)
            return v9;
        if (v2 || *(int *)((char *)&v4->field_1f0 + 4) && !(v2 = *(long long *)&v4->padding_1f9[167], !*(long long *)&v4->padding_1f9[167]))
        {
            if (sub_a96ab0(&v4->field_1f4, v2, *(int *)&v4->padding_1f9[231], *(int *)&v4->padding_1f9[235]) != 1)
                return 0;
            *(unsigned int *)((char *)&v4->field_1f0 + 4) = 1;
        }
        *(unsigned int *)&v4->field_1f0 = 1;
        return 1;
    }
    else
    {
        if ((int)v4->field_1f0)
            sub_a96ab0(&v4->field_1f4, v2, *(int *)&v4->padding_1f9[231], *(int *)&v4->padding_1f9[235]);
        else
            _memcpy(*(long long *)&v4->padding_1f9[167], v2, *(int *)&v4->padding_1f9[231]);
        *(unsigned int *)((char *)&v4->field_1f0 + 4) = 1;
        return 1;
    }
}
