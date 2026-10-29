/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb49ad4..0xb49c6c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b49ad4_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[104];
    unsigned int field_78;
    char padding_7c[12];
    unsigned long long field_88;
    char padding_90[8];
    unsigned long long field_98;
    char padding_a0[64];
    unsigned long long field_e0;
    char padding_e8[8];
    struct st_b49ad4_0 *field_f0;
} st_b49ad4_1;

typedef struct st_b49ad4_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_b49ad4_0;

typedef struct st_b49ad4_2 {
    char padding_0[8];
    unsigned int field_8;
} st_b49ad4_2;


unsigned int sub_b49ad4(st_b49ad4_1 *a0, long long a1)
{
    st_b49ad4_0 *v2;  // x21
    long long v3;  // x22
    unsigned int v12;  // w8
    unsigned int v13;  // w8
    unsigned long long v14;  // x9
    unsigned long long v15;  // x8
    st_b49ad4_2 *v4;  // x23
    unsigned int v5;  // x8
    unsigned int v6;  // x0
    unsigned int v7;  // x0
    unsigned int v9;  // x0
    long long v10;  // x23
    unsigned int v11;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_f0;
    v3 = sub_9f2aec(a0->field_8);
    v4 = sub_a6fbc4(a1, "properties");
    sub_a36c8c(v4, "properties");
    if (v4 && v4->field_8 == 4)
        v5 = *(long long *)&v4[1].padding_0[4];
    else
        v5 = 0;
    if (!v5)
        v5 = (unsigned int)"provider=default";
    v6 = sub_a6fbc4();
    if (!v6)
    {
        sub_a36e70();
    }
    else if (*(int *)(v6 + 8) == 4 && !(v7 = sub_a40ca8(v3, *(long long *)(v6 + 16), v5), !v7))
    {
        sub_a36e70(sub_a3f52c(0));
        sub_afe214(v2, v7);
    }
    else
    {
        sub_a36cd4();
        sub_a3f52c(0);
        if (!sub_afe114(v2, a1, v3))
            return 0;
    }
    v9 = sub_954340(v2);
    if (v9)
    {
        v10 = v9;
        if (!sub_b47104(a0, v3, v10))
            return 0;
        v11 = sub_a50ac8(v10);
        if ((int)v11 < 1)
            return 0;
        v2->field_20 = v11;
        v12 = v11 * 8;
        if (!(v12 & 0xffffff00))
            v13 = v12 & 0xffffffc0;
        else
            v13 = 0x100;
        a0->field_78 = v13;
        v14 = 55;
        if (32 < v11)
            v14 = 111;
        a0->field_e0 = v14;
        v15 = v13 >> 3;
        a0->field_88 = v15;
        a0->field_98 = v15 >> 1;
    }
}
