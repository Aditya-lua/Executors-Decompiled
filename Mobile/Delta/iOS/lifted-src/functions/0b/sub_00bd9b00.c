/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd9b00..0xbd9d64 (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd9b00_1 {
    struct st_bd9b00_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_bd9b00_1;

typedef struct st_bd9b00_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned int field_20;
} st_bd9b00_2;

typedef struct st_bd9b00_0 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    void* field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_bd9b00_0;


long long sub_bd9b00(st_bd9b00_1 *a0, unsigned long long *a1)
{
    st_bd9b00_0 *v4;  // x19
    unsigned long long v5;  // x20
    unsigned long long v14;  // x10
    unsigned long long v15;  // x10
    unsigned long long v16;  // x9
    unsigned long v17;  // x26
    unsigned int v18;  // w24
    unsigned long v19;  // x8
    unsigned long long v20;  // x9
    unsigned long long v21;  // 4135
    unsigned long long v22;  // 4137
    unsigned long long v23;  // x9
    void* v6;  // x22
    unsigned long long v24;  // x9
    char v25;  // x8
    long long v26;  // x8
    long long v27;  // x23
    long long v28;  // x22
    unsigned long long *v29;  // x25
    unsigned long long v30;  // x25
    unsigned long long v31;  // x22
    unsigned long long v32;  // x26
    unsigned long long v33;  // x0
    unsigned long v7;  // x23
    st_bd9b00_2 *v34;  // x8
    long long v35;  // x1
    unsigned long long v8;  // x9
    unsigned long long v9;  // x10
    long long v10;  // x11
    long long v11;  // x21
    unsigned long long v12;  // 4132
    unsigned long long v13;  // 4134
    char v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x60]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_0;
    v5 = a0->field_8;
    v6 = v4->field_18;
    v7 = v4->field_20;
    v8 = v7 & v5;
    v9 = *(long long *)((char *)v6 + v8) & 0x8080808080808080;
    if (!(*(long long *)((char *)v6 + v8) & 0x8080808080808080))
    {
        v10 = 8;
        do
        {
            v8 = v8 + v10 & v7;
            v10 += 8;
            v9 = *(long long *)((char *)v6 + v8) & 0x8080808080808080;
        } while (!(*(long long *)((char *)v6 + v8) & 0x8080808080808080));
    }
    v11 = v4->field_10;
    v12 = ((((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
    v13 = (((((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v9 & 0xaaaaaaaaaaaaaaaa) >> 1 | v9 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
    v14 = ((((v13 | v12) & 0xffff0000ffff0000) >> 16 | (v13 | v12) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v13 | v12) & 0xffff0000ffff0000) >> 16 | (v13 | v12) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
    if (!v14)
        v15 = 64;
    else
        v15 = Clz(v14);
    v16 = v8 + (v15 >> 3) & v7;
    v17 = *((char *)v6 + v16);
    if (v17 >> 31 & 1)
    {
        v18 = a0->field_10;
        v19 = v4->field_28;
        if (!v19)
            goto LABEL_bd9b84;
    }
    else
    {
        v20 = *(long long *)v6 & 0x8080808080808080;
        v21 = ((((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v22 = (((((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v20 & 0xaaaaaaaaaaaaaaaa) >> 1 | v20 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v23 = ((((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v23)
            v24 = 64;
        else
            v24 = Clz(v23);
        v16 = v24 >> 3;
        v17 = *((char *)v6 + v16);
        v18 = a0->field_10;
        v19 = v4->field_28;
        if (!v19)
        {
LABEL_bd9b84:
            if (v17 & 1)
            {
                sub_c728b8();
                v6 = v4->field_18;
                v7 = v4->field_20;
                v16 = sub_bd72f8(v4->field_18, v4->field_20, v5);
                v19 = v4->field_28;
            }
        }
    }
    v4->field_28 = v19 - (v17 & 1);
    v25 = v5 >> 57;
    *((char *)v6 + v16) = v25;
    *((char *)v4->field_18 + (v7 & v16 - 8) + 8) = v25;
    v4->field_30 = v4->field_30 + 1;
    *(long long *)((char *)v4->field_18 + -8 * v16 - 8) = v11;
    v26 = v4->field_0;
    v27 = v4->field_10;
    if (v11 != v4->field_0 || !(v28 = v4->field_28 + v4->field_30, v26 = v11, (unsigned long long)(v11 - v27) < (unsigned long long)(v28 - v27)))
    {
        v30 = *a1;
        v31 = a1[1];
        v32 = a1[2];
        if (v27 == v26)
            goto LABEL_bd9c04;
        goto LABEL_bd9c0c;
    }
    else
    {
        v29 = a1;
        if ((unsigned long long)v28 < (unsigned long long)v27)
            goto LABEL_bd9d24;
        sub_c6c158(&v0, v11, v4->field_8, v28, 8, 40);
        if (v0 != 1)
        {
            v4->field_0 = v28;
            v4->field_8 = v1;
            v27 = v4->field_10;
            v30 = *v29;
            v31 = v29[1];
            v32 = v29[2];
            if (v27 == v28)
            {
LABEL_bd9c04:
                sub_c73748(v4);
            }
LABEL_bd9c0c:
            v34 = v4->field_8 + 40 * v27;
            v34->field_0 = v30;
            v34->field_8 = v31;
            v34->field_10 = v32;
            v34->field_18 = v5;
            v34->field_20 = v18;
            v35 = v27 + 1;
            v4->field_10 = v35;
            if ((unsigned long long)v35 > (unsigned long long)v11)
                return v4->field_8 + 40 * v11;
            sub_c73c94(v11);
LABEL_bd9d24:
            v33 = 0;
        }
        else
        {
            v33 = v1;
        }
        sub_c6b970(v33);
        __debugbreak();
    }
}
