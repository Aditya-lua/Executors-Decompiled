/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb117c..0xb12d4 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b117c_0 {
    char field_0;
} st_b117c_0;


void* sub_b117c(void* a0, unsigned int a1)
{
    unsigned int v6;  // w8
    char v7;  // x8
    unsigned long long v16;  // x6
    unsigned long long v17;  // x5
    unsigned long v18;  // x6
    char *v19;  // x6
    unsigned int v20;  // w19
    unsigned long v21;  // x20
    unsigned long long idx;  // x19
    unsigned int v8;  // w10
    unsigned long i;  // x10
    void* v10;  // x12
    unsigned int v11;  // w11
    unsigned int v12;  // w13
    unsigned long long v13;  // x14
    char v14;  // x17
    unsigned long long v15;  // x16
    st_b117c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_b117c_0 *v1;  // [bp-0x38]
    st_b117c_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_b117c_0 *v3;  // [bp-0x28]
    st_b117c_0 **v4;  // [bp-0x20], Other Possible Types: char
    st_b117c_0 *v5;  // [bp-0x18]

    v1 = &v0;
    v0 = &v1;
    v6 = (int)a0[268];
    if ((unsigned int)(int)a0[268] >= 6)
        v6 = 6;
    if (4 < v6)
        v7 = v6;
    else
        v7 = 4;
    v8 = (int)a0[272];
    if ((unsigned int)(int)a0[272] >= 6)
        v8 = 6;
    v3 = &v2;
    v2 = &v3;
    i = (int)a0[44];
    v10 = (long long)a0[8];
    v11 = (unsigned int)(a1 - v10);
    v5 = &v4;
    v4 = &v5;
    if (v11 > (unsigned int)i)
    {
        v12 = ~(0xffffffff << (v7 & 31));
        v13 = (long long)a0[112];
        v14 = (int)a0[52];
        v15 = (long long)a0[56];
        do
        {
            if (v8 == 5)
            {
                v16 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v10 + i);
                goto LABEL_b1248;
            }
            else if (v8 == 6)
            {
                v16 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v10 + i);
LABEL_b1248:
                v17 = (v16 ^ (long long)a0[96]) >> ((char)(56 - v14) & 63);
                continue;
            }
            else
            {
                v17 = (2654435761 * *(int *)((char *)v10 + i) ^ (int)(long long)a0[96]) >> ((char)(24 - v14) & 31);
            }
            v18 = ((v17 * 0x100000000000000 | v17 >> 8) & 0xff00000000ffffff & 0xffffff & 0xffffffff) << (v7 & 63);
            v19 = v15 + v18;
            v20 = *v19 + 127;
            if (!(v20 & v12))
                v21 = v12;
            else
                v21 = 0;
            idx = v21 + (v20 & v12);
            *v19 = idx;
            v19[idx] = v17;
            *(unsigned int *)(v13 + v18 * 4 + idx * 4) = i;
            i += 1;
        } while (v11 > i);
    }
    *(unsigned int *)&a0[44] = v11;
    return a0;
}
