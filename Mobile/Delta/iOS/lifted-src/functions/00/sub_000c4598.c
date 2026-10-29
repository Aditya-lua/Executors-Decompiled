/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4598..0xc4714 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4598_0 {
    char field_0;
} st_c4598_0;


unsigned long long sub_c4598(unsigned long long a0, unsigned int a1, char *a2, int *a3, unsigned int *a4, long long a5, unsigned long long a6)
{
    long long v9;  // x12
    long long i;  // x9
    unsigned int v19;  // w10
    unsigned long v20;  // x19
    long long j;  // w23
    long long v22;  // w23
    unsigned long long v11;  // x6
    unsigned int v12;  // w1
    long long v13;  // x12
    unsigned long long v14;  // x0
    int *v15;  // x3
    unsigned long v16;  // x20
    unsigned long v17;  // x8
    unsigned long long v18;  // x26
    unsigned int v0;  // [bp-0xb0]
    unsigned short v1;  // [bp-0xac]
    unsigned int v2;  // [bp-0x9c]
    unsigned int v3;  // [bp-0x8c]
    long long v4;  // [bp-0x88]
    st_c4598_0 **v5;  // [bp-0x70], Other Possible Types: char
    st_c4598_0 *v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = &v5;
    v5 = &v6;
    if (a5 < 1)
        return a0;
    v2 = a6 - a1;
    v3 = a6 - a5;
    v9 = a5 + 1;
    i = 1;
    v11 = a6;
    v12 = a1;
    v13 = v9;
    v14 = a0;
    v15 = a3;
    do
    {
        v16 = v15[i];
        v4 = i + 1;
        v17 = v15[v4];
        v18 = v11 - i;
        v19 = v12 - v18;
        if (v19 < v3)
        {
            v14 = sub_bfccc(a0 + a4[i] * 4, &a2[v16], &a2[v17], v18, a1, 0, 1);
            v11 = a6 & 0xffffffff;
            v12 = a1;
            v13 = v9;
            v15 = a3;
        }
        else if ((unsigned int)v17 != (unsigned int)v16)
        {
            v20 = a4[i];
            j = (unsigned int)(v17 - v16);
            do
            {
                v22 = j;
                v1 = a2[v16];
                v0 = v11;
                v14 = sub_bfb58(a0 + (int)v20 * 4);
                v11 = a6 & 0xffffffff;
                v16 += 1;
                v20 += 1 << ((char)v19 & 31);
                j = v22 - 1;
                v12 = a1;
                v13 = v9;
                v15 = a3;
            } while (j);
        }
        i = v4;
    } while (i != v13);
    return v14;
}
