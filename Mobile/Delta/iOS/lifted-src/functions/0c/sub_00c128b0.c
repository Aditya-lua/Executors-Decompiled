/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc128b0..0xc12a00 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c128b0_0 {
    char padding_0[16];
    unsigned int field_10;
} st_c128b0_0;

extern char g_e0eb50;

long long sub_c128b0(char *a0, st_c128b0_0 *a1)
{
    unsigned long v5;  // x8
    unsigned long v6;  // x10
    long long v15;  // x12
    long long v16;  // x8
    unsigned long v17;  // x13
    long long v18;  // x9
    char *v19;  // x10
    unsigned long v20;  // x11
    long long v21;  // x12
    unsigned long v22;  // x13
    unsigned long long v7;  // x11
    long long v8;  // x8
    long long v9;  // x5
    char *v10;  // x4
    st_c128b0_0 *v11;  // x0
    long long v12;  // x2
    unsigned long long v13;  // x3
    unsigned long v14;  // x11
    unsigned short v0;  // [bp-0x17]
    uint24_t v1;  // [bp-0x15]
    unsigned short v2;  // [bp-0x12]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1->field_10;
    if (v5 >> 25 & 1)
    {
        v20 = *a0;
        v21 = 1;
        do
        {
            v16 = v21;
            v22 = (unsigned int)v20 >> 4;
            *((char *)&v0 + v21) = (&g_e0eb50)[v20 & 15];
            v21 -= 1;
            v20 = v22;
        } while ((unsigned int)v20);
        v18 = v16 + 1;
        v19 = &v0;
        goto LABEL_c12984;
    }
    else if (!(v5 >> 26 & 1))
    {
        v6 = *a0;
        if ((unsigned int)v6 >= 10)
        {
            v7 = 41 * (unsigned int)v6 >> 12;
            *(short *)((char *)&v1 + 1) = *(short *)(2 * ((unsigned int)v6 - 100 * (unsigned int)v7 & 0xff) + 14721940);
            v8 = 1;
            if ((unsigned int)v6)
                goto LABEL_c129b4;
        }
        else
        {
            v8 = 3;
            v7 = v6;
            if ((unsigned int)v6)
            {
LABEL_c129b4:
                if (!(unsigned int)v7)
                    goto LABEL_c129d0;
            }
        }
        v8 -= 1;
        *((char *)&v1 + v8) = *(char *)(((v7 * 2 | v7 >> 63) & 254 & 0xff) + 14721941);
LABEL_c129d0:
        v9 = 3 - v8;
        v10 = (char *)&v1 + v8;
        v11 = a1;
        v12 = 1;
        v13 = 0;
    }
    else
    {
        v14 = *a0;
        v15 = 1;
        do
        {
            v16 = v15;
            v17 = (unsigned int)v14 >> 4;
            *((char *)&v2 + v15) = *(char *)((v14 & 15) + 14740256);
            v15 -= 1;
            v14 = v17;
        } while ((unsigned int)v14);
        v18 = v16 + 1;
        v19 = &v2;
LABEL_c12984:
        v9 = 3 - v18;
        v12 = "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
        v10 = &v19[v16];
        v11 = a1;
        v13 = 2;
    }
    return sub_be8310(v11, 1, v12, v13, v10, v9);
}
