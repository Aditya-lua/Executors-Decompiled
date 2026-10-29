/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbda264..0xbda350 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bda264_0 {
    char padding_0[8];
    struct st_bda264_1 *field_8;
    long long field_10;
    struct st_bda264_1 *field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    long long field_38;
    long long field_40;
} st_bda264_0;

typedef struct st_bda264_1 {
    long long field_0;
} st_bda264_1;


unsigned long long sub_bda264(st_bda264_0 *a0, unsigned long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x9
    unsigned long long v12;  // x8
    unsigned long long v13;  // x8
    long long v14;  // x8
    unsigned long long v15;  // x8
    unsigned long long v4;  // x8
    unsigned long long v5;  // x16
    unsigned long v6;  // x17
    unsigned long long v7;  // x8
    unsigned long long v8;  // x2
    unsigned long long v9;  // x2
    unsigned long long v10;  // 4128
    unsigned long long v11;  // 4130
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_30)
        return 0;
    v2 = sub_bda14c(a0->field_38, a0->field_40, a1);
    v3 = 0;
    v4 = v2;
    while (1)
    {
        v5 = v4 & a0->field_20;
        v6 = *(long long *)((char *)a0->field_18 + v5);
        v7 = (v6 ^ 0x101010101010101 * (v2 >> 57)) + 0xfefefefefefefeff & ~(v6 ^ 0x101010101010101 * (v2 >> 57));
        v8 = v7 & 0x8080808080808080;
        if (v7 & 0x8080808080808080)
        {
            do
            {
                v9 = v8;
                v10 = ((((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v11 = (((((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v12 = ((((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v12)
                    v13 = 64;
                else
                    v13 = Clz(v12);
                v14 = *(long long *)((char *)&a0->field_18[-1 * (v5 + (v13 >> 3) & a0->field_20)].field_0 - 8);
                if ((unsigned long long)a0->field_10 <= (unsigned long long)v14)
                    sub_c73c94(v14);
                if (a1 == *(long long *)&a0->field_8[6 * v14])
                    return 1;
                v15 = v9 - 1;
                v8 = v15 & v9;
            } while (v15 & v9);
        }
        if (v6 & v6 * 2 & 0x8080808080808080)
            break;
        v3 += 8;
        v4 = v5 + v3;
    }
    return 0;
}
