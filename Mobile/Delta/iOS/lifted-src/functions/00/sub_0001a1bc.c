/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1bc..0x1a5d0 (1044 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a1bc_0 {
    char field_0;
} st_1a1bc_0;


unsigned long long sub_1a1bc(unsigned long a0, unsigned long long *a1, long long a2)
{
    unsigned long long v10;  // x22
    unsigned long long *v11;  // x8
    unsigned long long v20;  // x8
    unsigned long long v21;  // x9
    unsigned long long v22;  // x24
    unsigned long long v23;  // x28
    unsigned long long v24;  // x0
    long long v25;  // x21
    unsigned long long v26;  // x26
    unsigned long long v27;  // x28
    unsigned long long v28;  // x0
    long long v29;  // x21
    unsigned long long v12;  // x19
    unsigned long long v30;  // x0
    unsigned long long v31;  // x21
    unsigned long long v32;  // x12
    unsigned long long *iter;  // x19
    unsigned long long v34;  // x22
    unsigned long long v35;  // x28
    unsigned long long v36;  // x0
    unsigned long long v37;  // x20
    unsigned long long v38;  // x0
    unsigned long long v39;  // x23
    unsigned long long v13;  // x0
    unsigned long long v40;  // x27
    unsigned long long v41;  // x0
    long long v42;  // x21
    unsigned long long v43;  // x0
    unsigned long long v44;  // x27
    unsigned long long v45;  // x0
    long long v46;  // x21
    unsigned long long v47;  // x0
    unsigned long long v49;  // 4129
    unsigned long long v14;  // x0
    unsigned long long v50;  // x8
    unsigned long long v51;  // x9
    unsigned long long v52;  // x8
    unsigned long long v15;  // x8
    unsigned long long v16;  // x9
    unsigned long long *v17;  // x27
    unsigned long long v18;  // x20
    unsigned long long v19;  // x23
    unsigned long long v0;  // [bp-0xa0]
    unsigned long v1;  // [bp-0x98], Other Possible Types: unsigned long long
    long long v2;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x88]
    st_1a1bc_0 **v4;  // [bp-0x80], Other Possible Types: char
    st_1a1bc_0 *v5;  // [bp-0x78]
    st_1a1bc_0 **v6;  // [bp-0x70], Other Possible Types: char
    st_1a1bc_0 *v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v5 = &v4;
    v4 = &v5;
    if (32 >= (unsigned long long)a2)
    {
        if (16 >= (unsigned long long)a2)
            return sub_1d4a8(a1, a2);
        v7 = &v6;
        v6 = &v7;
        v10 = 13011662864482103923 * *a1;
        v11 = (char *)a1 + a2;
        v12 = 11160318154034397263 * *(long long *)((char *)v11 - 8);
        v13 = sub_16f2c(v10 - a1[1], 43);
        v14 = sub_16f2c(v12, 30);
        v15 = v10 + a2 - v12 + sub_16f2c(a1[1] ^ 14504361325974414679, 20);
        v16 = 0x9ddfea08eb382d69 * (v15 ^ v13 + 14097894508562428199 * *(long long *)((char *)v11 - 16) + v14);
        return 0x9ddfea08eb382d69 * (0x9ddfea08eb382d69 * (v15 ^ v16 >> 47 ^ v16) ^ 0x9ddfea08eb382d69 * (v15 ^ v16 >> 47 ^ v16) >> 47);
    }
    else
    {
        if (64 >= (unsigned long long)a2)
            return sub_1b120(a1, a2);
        v17 = (char *)a1 + a2;
        v18 = *(long long *)((char *)v17 - 56) + *(long long *)((char *)v17 - 16);
        v19 = *(long long *)((char *)v17 - 40);
        v20 = 0x9ddfea08eb382d69 * (*(long long *)((char *)v17 - 24) ^ *(long long *)((char *)v17 - 48) + a2);
        v21 = *(long long *)((char *)v17 - 24) ^ v20 >> 47;
        v22 = 0x9ddfea08eb382d69 * (0x9ddfea08eb382d69 * (v21 ^ v20) ^ 0x9ddfea08eb382d69 * (v21 ^ v20) >> 47);
        v23 = *(long long *)((char *)v17 - 64) + a2;
        v2 = a2;
        v24 = sub_16f2c(v19 + v23 + v22, 21);
        v25 = v23 + *(long long *)((char *)v17 - 56) + *(long long *)((char *)v17 - 48);
        v26 = v25 + v19;
        v3 = v24 + v23 + sub_16f2c(v25, 44);
        v1 = *(long long *)((char *)v17 - 24);
        v27 = v18 + *(long long *)((char *)v17 - 32) + 13011662864482103923;
        v28 = sub_16f2c(v27 + v19 + *(long long *)((char *)v17 - 8), 21);
        v29 = v27 + v1 + *(long long *)((char *)v17 - 16);
        v30 = sub_16f2c(v29, 44);
        v31 = v29 + *(long long *)((char *)v17 - 8);
        v32 = v28 + v27 + v30;
        iter = a1 + 4;
        v34 = *a1 + 13011662864482103923 * v19;
        v35 = -(v2 - 1 & 0xffffffffffffffc0);
        do
        {
            v1 = v32;
            v36 = sub_16f2c(v34 + v26 + v18 + *(long long *)((char *)iter - 24), 37);
            v37 = v3;
            v38 = sub_16f2c(v18 + v37 + iter[2], 42);
            v39 = 13011662864482103923 * v36 ^ v32;
            v2 = iter[1] + v26 + 13011662864482103923 * v38;
            v34 = 13011662864482103923 * sub_16f2c(v22 + v31, 33);
            v40 = *(long long *)((char *)iter - 32) + 13011662864482103923 * v37;
            v41 = sub_16f2c(v39 + v31 + v40 + *(long long *)((char *)iter - 8), 21);
            v42 = v40 + *(long long *)((char *)iter - 24) + *(long long *)((char *)iter - 16);
            v43 = sub_16f2c(v42, 44);
            v0 = v42 + *(long long *)((char *)iter - 8);
            v3 = v41 + v40 + v43;
            v18 = v2;
            v44 = v34 + v1 + *iter;
            v45 = sub_16f2c(*(long long *)((char *)iter - 16) + v44 + iter[3] + v18, 21);
            v46 = v44 + iter[1] + iter[2];
            v47 = sub_16f2c(v46, 44);
            v31 = v46 + iter[3];
            v26 = v0;
            v32 = v45 + v44 + v47;
            iter += 8;
            v49 = arm64g_calculate_condition(18, v35, 64, 0);
            v35 += 64;
            v22 = v39;
        } while (v49 & 1);
        v50 = 0x9ddfea08eb382d69 * (v31 ^ 0x9ddfea08eb382d69 * (v31 ^ v26) >> 47 ^ 0x9ddfea08eb382d69 * (v31 ^ v26));
        v51 = v34 + 0x9ddfea08eb382d69 * (0x9ddfea08eb382d69 * (v32 ^ 0x9ddfea08eb382d69 * (v32 ^ v3) >> 47 ^ 0x9ddfea08eb382d69 * (v32 ^ v3)) ^ 0x9ddfea08eb382d69 * (v32 ^ 0x9ddfea08eb382d69 * (v32 ^ v3) >> 47 ^ 0x9ddfea08eb382d69 * (v32 ^ v3)) >> 47);
        v52 = 0x9ddfea08eb382d69 * (v51 ^ v39 + 13011662864482103923 * (v18 ^ v18 >> 47) + 0x9ddfea08eb382d69 * (v50 ^ v50 >> 47));
        return 0x9ddfea08eb382d69 * (0x9ddfea08eb382d69 * (v51 ^ v52 >> 47 ^ v52) ^ 0x9ddfea08eb382d69 * (v51 ^ v52 >> 47 ^ v52) >> 47);
    }
}
