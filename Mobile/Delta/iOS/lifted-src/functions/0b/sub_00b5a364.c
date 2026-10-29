/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5a364..0xb5a4e8 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5a364_0 {
    long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
} st_b5a364_0;


unsigned long long sub_b5a364(st_b5a364_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    st_b5a364_0 *v12;  // x21
    unsigned long long *v13;  // x23
    unsigned long long *v14;  // x23
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long *v4;  // x22
    st_b5a364_0 *v5;  // x21
    unsigned long long *v6;  // x23
    unsigned long long *v7;  // x23
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long *v11;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_afe114(&a0->field_8, a1, sub_9f2aec(a0->field_0));
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_a6fbc4(a1, "pass");
    if (v3)
    {
        v4 = v3;
        v5 = a0;
        v6 = &v5->field_20;
        v7 = v6 + 1;
        sub_a6c4e8(v5->field_20, v6[1], "providers/implementations/kdfs/pbkdf1.c", 163);
        *v7 = 0;
        *v6 = 0;
        if (!v4[3])
        {
            v9 = sub_a6bf4c(1, "providers/implementations/kdfs/pbkdf1.c", 168);
            *v6 = v9;
            if (!v9)
                return v9;
        }
        else if (v4[2])
        {
            v8 = sub_a71440(v4, v6, 0, v7);
            if (!(unsigned int)v8)
                return v8;
        }
    }
    v10 = sub_a6fbc4(a1, "salt");
    if (v10)
    {
        v11 = v10;
        v12 = a0;
        v13 = &v12->field_30;
        v14 = v13 + 1;
        sub_a6c4e8(v12->field_30, v13[1], "providers/implementations/kdfs/pbkdf1.c", 163);
        *v14 = 0;
        *v13 = 0;
        if (!v11[3])
        {
            v16 = sub_a6bf4c(1, "providers/implementations/kdfs/pbkdf1.c", 168);
            *v13 = v16;
            if (!v16)
                return v16;
        }
        else if (v11[2])
        {
            v15 = sub_a71440(v11, v13, 0, v14);
            if (!(unsigned int)v15)
                return v15;
        }
    }
    if (!sub_a6fbc4(a1, "iter"))
        return 1;
    v17 = sub_a707f4();
    if (!(unsigned int)v17)
        return v17;
    return 1;
}
