/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbda618..0xbda994 (892 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bda618_1 {
    long long field_0;
    unsigned long long field_8;
} st_bda618_1;

typedef struct st_bda618_2 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_bda618_2;

typedef struct st_bda618_3 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_bda618_3;

typedef struct st_bda618_0 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    void* field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    long long field_38;
    long long field_40;
} st_bda618_0;


unsigned long long sub_bda618(st_bda618_0 *a0, long long a1, unsigned long long a2)
{
    unsigned long long v4;  // x22
    unsigned long long v5;  // x9
    unsigned long long v14;  // x8
    unsigned long long v15;  // x15
    unsigned long long v16;  // x15
    unsigned long long v17;  // 4128
    unsigned long long v18;  // 4130
    unsigned long long v19;  // x8
    unsigned long long v20;  // x8
    long long v21;  // x8
    st_bda618_1 *v22;  // x8
    unsigned long long v23;  // x8
    void* v6;  // x23
    unsigned long long v24;  // x0
    unsigned long long v25;  // 4102
    unsigned long long v26;  // x8
    unsigned long long v27;  // x9
    unsigned long long v28;  // x10
    unsigned long long v29;  // 4128
    unsigned long long v30;  // 4130
    unsigned long long v31;  // x9
    unsigned long long v32;  // x9
    unsigned long long v33;  // x8
    st_bda618_3 *v7;  // x0
    unsigned long v34;  // x26
    unsigned long v35;  // x9
    unsigned long long v36;  // x8
    unsigned long long v37;  // 4135
    unsigned long long v38;  // 4137
    unsigned long long v39;  // x8
    unsigned long long v40;  // x8
    long long v41;  // x23
    long long v42;  // x24
    long long v43;  // x23
    long long v8;  // x1
    unsigned long long v44;  // x0
    st_bda618_2 *v45;  // x8
    unsigned long v9;  // x24
    unsigned long long v10;  // x25
    unsigned long long v11;  // x8
    unsigned long long v12;  // x13
    unsigned long v13;  // x14
    char v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_bda14c(a0->field_38, a0->field_40, a1);
    v5 = 0;
    v6 = a0->field_18;
    v7 = &a0->field_18;
    v8 = *(long long *)((char *)v7 - 8);
    v9 = v7->field_8;
    v10 = v4 >> 57;
    v11 = v4;
    while (1)
    {
        v12 = v11 & v9;
        v13 = *(long long *)((char *)v6 + v12);
        v14 = (v13 ^ 0x101010101010101 * v10) + 0xfefefefefefefeff & ~(v13 ^ 0x101010101010101 * v10);
        v15 = v14 & 0x8080808080808080;
        if (v14 & 0x8080808080808080)
        {
            do
            {
                v16 = v15;
                v17 = ((((((v16 & 0xaaaaaaaaaaaaaaaa) >> 1 | v16 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v16 & 0xaaaaaaaaaaaaaaaa) >> 1 | v16 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v16 & 0xaaaaaaaaaaaaaaaa) >> 1 | v16 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v16 & 0xaaaaaaaaaaaaaaaa) >> 1 | v16 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v18 = (((((((v16 & 0xaaaaaaaaaaaaaaaa) >> 1 | v16 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v16 & 0xaaaaaaaaaaaaaaaa) >> 1 | v16 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v16 & 0xaaaaaaaaaaaaaaaa) >> 1 | v16 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v16 & 0xaaaaaaaaaaaaaaaa) >> 1 | v16 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v19 = ((((v18 | v17) & 0xffff0000ffff0000) >> 16 | (v18 | v17) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v18 | v17) & 0xffff0000ffff0000) >> 16 | (v18 | v17) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v19)
                    v20 = 64;
                else
                    v20 = Clz(v19);
                v21 = *(long long *)((char *)v6 + -8 * (v12 + (v20 >> 3) & v9) - 8);
                if ((unsigned long long)v8 <= (unsigned long long)v21)
                {
                    sub_c73c94(v21);
                    __debugbreak();
                }
                v22 = *(long long *)((char *)v7 - 16) + 24 * v21;
                if (a1 == v22->field_0)
                {
                    v24 = v22->field_8;
                    v22->field_8 = a2;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v25 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (v25 & 1)
                        return v24;
                    /* unsupported instruction */;
                    sub_b86a90(a1);
                    return v24;
                }
                v23 = v16 - 1;
                v15 = v23 & v16;
            } while (v23 & v16);
        }
        if (v13 & v13 * 2 & 0x8080808080808080)
            break;
        v5 += 8;
        v11 = v12 + v5;
    }
    v26 = v9 & v4;
    v27 = *(long long *)((char *)v6 + v26) & 0x8080808080808080;
    if (!(*(long long *)((char *)v6 + v26) & 0x8080808080808080))
    {
        v28 = 8;
        do
        {
            v26 = v26 + v28 & v9;
            v28 += 8;
            v27 = *(long long *)((char *)v6 + v26) & 0x8080808080808080;
        } while (!(*(long long *)((char *)v6 + v26) & 0x8080808080808080));
    }
    v29 = ((((((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
    v30 = (((((((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v27 & 0xaaaaaaaaaaaaaaaa) >> 1 | v27 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
    v31 = ((((v30 | v29) & 0xffff0000ffff0000) >> 16 | (v30 | v29) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v30 | v29) & 0xffff0000ffff0000) >> 16 | (v30 | v29) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
    if (!v31)
        v32 = 64;
    else
        v32 = Clz(v31);
    v33 = v26 + (v32 >> 3) & v9;
    v34 = *((char *)v6 + v33);
    if (v34 >> 31 & 1)
    {
        v35 = a0->field_28;
        if (!v35)
            goto LABEL_bda778;
    }
    else
    {
        v36 = *(long long *)v6 & 0x8080808080808080;
        v37 = ((((((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v38 = (((((((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v36 & 0xaaaaaaaaaaaaaaaa) >> 1 | v36 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v39 = ((((v38 | v37) & 0xffff0000ffff0000) >> 16 | (v38 | v37) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v38 | v37) & 0xffff0000ffff0000) >> 16 | (v38 | v37) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v39)
            v40 = 64;
        else
            v40 = Clz(v39);
        v33 = v40 >> 3;
        v34 = *((char *)v6 + v33);
        v35 = a0->field_28;
        if (!v35)
        {
LABEL_bda778:
            if (v34 & 1)
            {
                sub_c72e14();
                v6 = a0->field_18;
                v9 = a0->field_20;
                v33 = sub_bd72f8(a0->field_18, a0->field_20, v4);
                v35 = a0->field_28;
            }
        }
    }
    a0->field_28 = v35 - (v34 & 1);
    *((char *)v6 + v33) = v10;
    *((char *)a0->field_18 + (v9 & v33 - 8) + 8) = v10;
    a0->field_30 = a0->field_30 + 1;
    *(long long *)((char *)a0->field_18 + -8 * v33 - 8) = v8;
    v41 = a0->field_0;
    v42 = a0->field_10;
    if (v8 == a0->field_0)
    {
        v43 = a0->field_28 + a0->field_30;
        if ((unsigned long long)(v8 - v42) >= (unsigned long long)(v43 - v42))
        {
            v41 = v8;
        }
        else
        {
            if ((unsigned long long)v43 >= (unsigned long long)v42)
            {
                sub_c6c158(&v0);
                if (v0 != 1)
                {
                    a0->field_0 = v43;
                    a0->field_8 = v1;
                    v42 = a0->field_10;
                    if (v42 != v43)
                    {
                        v45 = a0->field_8 + 24 * v42;
                        v45->field_0 = a1;
                        v45->field_8 = a2;
                        v45->field_10 = v4;
                        a0->field_10 = v42 + 1;
                        return 0;
                    }
                    sub_c6c3c4(a0);
                    v45 = a0->field_8 + 24 * v42;
                    v45->field_0 = a1;
                    v45->field_8 = a2;
                    v45->field_10 = v4;
                    a0->field_10 = v42 + 1;
                    return 0;
                }
                v44 = v1;
            }
            else
            {
                v44 = 0;
            }
            sub_c6b970(v44);
            __debugbreak();
        }
    }
    if (v42 != v41)
    {
        v45 = a0->field_8 + 24 * v42;
        v45->field_0 = a1;
        v45->field_8 = a2;
        v45->field_10 = v4;
        a0->field_10 = v42 + 1;
        return 0;
    }
    sub_c6c3c4(a0);
    v45 = a0->field_8 + 24 * v42;
    v45->field_0 = a1;
    v45->field_8 = a2;
    v45->field_10 = v4;
    a0->field_10 = v42 + 1;
    return 0;
}
