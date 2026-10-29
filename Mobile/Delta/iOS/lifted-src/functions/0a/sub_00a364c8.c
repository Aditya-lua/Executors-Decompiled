/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa364c8..0xa366d8 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a364c8_1 {
    char padding_0[384];
    unsigned int field_180;
} st_a364c8_1;

typedef struct st_a364c8_0 {
    char padding_0[256];
    char field_100;
    char padding_101[255];
    unsigned int field_200;
    char padding_204[380];
    int field_380;
} st_a364c8_0;


st_a364c8_0 * sub_a364c8(unsigned int a0, unsigned long long a1)
{
    st_a364c8_0 *v3;  // x0
    unsigned long idx;  // x8
    unsigned long long v13;  // x8
    long long v14;  // x23
    unsigned long v15;  // x20
    unsigned int v16;  // x0
    unsigned int v19;  // x0
    unsigned long index;  // x23
    st_a364c8_1 *v21;  // x8
    unsigned int *v22;  // x21
    unsigned int *v5;  // x9
    void* v23;  // x22
    unsigned int v24;  // w9
    unsigned long long v25;  // x10
    unsigned long long v26;  // x8
    unsigned int *v6;  // x10
    unsigned int v7;  // x19
    unsigned long long v8;  // x11
    unsigned int v9;  // w24
    unsigned int v10;  // x0
    unsigned int v11;  // w0
    unsigned int i;  // w25
    unsigned long long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    v3 = sub_a35bc0();
    if (!v3)
        return v3;
    idx = v3->field_380;
    v5 = &v3->field_200;
    if (!~(v5[idx] & 3) && (v6 = &v3->field_100, v7 = *(long long *)&v6[2 * idx], v7))
    {
        v8 = idx * 8;
        v9 = *(int *)&v3->padding_101[127 + v8];
        *(unsigned long long *)((char *)v6 + v8) = 0;
        v5[idx] = 0;
        if ((int)a0 <= 0)
            goto LABEL_a365f8;
LABEL_a36534:
        v11 = _strlen(v7);
        i = a0 + 1;
        do
        {
            v13 = v0;
            v0 = v13 + 8;
            if (!*(long long *)v13)
                v14 = "<NULL>";
            else
                v14 = *(long long *)v13;
            v11 += _strlen();
            if ((int)v11 < (int)v9)
            {
                v15 = v9;
            }
            else
            {
                v9 = v11 + 20;
                v15 = v9;
                v16 = sub_a6c1b4(v7, v15, "crypto/err/err.c", 867);
                if (!v16)
                    return sub_a6c2e4(v7, "crypto/err/err.c", 869);
                v7 = v16;
            }
            sub_a6db94(v7, v14, v15);
            i -= 1;
        } while (i > 1);
    }
    else
    {
        v10 = sub_a6bf4c(81, "crypto/err/err.c", 851);
        if (!v10)
            return v10;
        v7 = v10;
        *(char *)v10 = 0;
        v9 = 81;
        if (0 < (int)a0)
            goto LABEL_a36534;
LABEL_a365f8:
        v15 = v9;
    }
    v19 = sub_a35bc0();
    if (!v19)
        return sub_a6c2e4(v7, "crypto/err/err.c", 877);
    index = *(int *)(v19 + 896);
    v21 = v19 + 0x200;
    v22 = &v21->padding_0[4 * index];
    v23 = v19 + 0x100;
    if (!(*v22 & 1))
    {
        v24 = 0;
        v25 = index * 8;
        *(unsigned long long *)((char *)v23 + v25) = 0;
        *(unsigned long long *)(v19 + v25 + 384) = 0;
    }
    else if (*(long long *)((char *)v23 + 8 * index))
    {
        *(char *)*(long long *)((char *)v23 + 8 * index) = 0;
        v24 = 1;
    }
    else
    {
        sub_a6c2e4(*(long long *)((char *)v23 + 8 * index), "crypto/err/err_local.h", 79);
        v26 = index * 8;
        *(unsigned long long *)((char *)v23 + v26) = v7;
        *(unsigned long *)(v19 + v26 + 384) = v15;
        *v22 = 3;
        return v19;
    }
    *v22 = v24;
    index = *(int *)(v19 + 896);
    v22 = &v21->padding_0[4 * index];
    if (!(*v22 & 1))
    {
        v26 = index * 8;
        *(unsigned long long *)((char *)v23 + v26) = v7;
        *(unsigned long *)(v19 + v26 + 384) = v15;
        *v22 = 3;
        return v19;
    }
    sub_a6c2e4(*(long long *)((char *)v23 + 8 * index), "crypto/err/err_local.h", 79);
    v26 = index * 8;
    *(unsigned long long *)((char *)v23 + v26) = v7;
    *(unsigned long *)(v19 + v26 + 384) = v15;
    *v22 = 3;
    return v19;
}
