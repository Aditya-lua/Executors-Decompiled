/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6116c..0xa61364 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6116c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned int field_30;
    unsigned int field_34;
    unsigned int field_38;
    unsigned int field_3c;
    unsigned int field_40;
    char padding_44[4];
    unsigned long long field_48;
    unsigned long long field_50;
} st_a6116c_0;


unsigned long long sub_a6116c(st_a6116c_0 *a0, long long a1, long long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long v10;  // x0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0)
    {
        v2 = sub_a6fa7c(a1, a2, "p");
        if (!(unsigned int)v2)
            return v2;
    }
    if (a0->field_8)
    {
        v3 = sub_a6fa7c(a1, a2, "q");
        if (!(unsigned int)v3)
            return v3;
    }
    if (a0->field_10)
    {
        v4 = sub_a6fa7c(a1, a2, "g");
        if (!(unsigned int)v4)
            return v4;
    }
    if (a0->field_18)
    {
        v5 = sub_a6fa7c(a1, a2, "j");
        if (!(unsigned int)v5)
            return v5;
    }
    v6 = sub_a6f85c(a1, a2, "gindex", a0->field_38);
    if (!(unsigned int)v6)
        return v6;
    v7 = sub_a6f85c(a1, a2, "pcounter", a0->field_30);
    if (!(unsigned int)v7)
        return v7;
    v8 = sub_a6f85c(a1, a2, "hindex", a0->field_3c);
    if (!(unsigned int)v8)
        return v8;
    if (a0->field_20)
    {
        v9 = sub_a6f968(a1, a2, "seed");
        if (!(unsigned int)v9)
            return v9;
    }
    v10 = a0->field_34;
    if ((unsigned int)v10)
    {
        v11 = sub_a2d030(sub_a60658(v10));
        if (!v11)
            return v11;
        v12 = sub_a6f90c(a1, a2, "group", v11);
        if (!(unsigned int)v12)
            return v12;
    }
    v13 = sub_a6f85c(a1, a2, "validate-pq", a0->field_40 & 1);
    if (!(unsigned int)v13)
        return v13;
    v14 = sub_a6f85c(a1, a2, "validate-g", __ROL__(a0->field_40, 31) & 0x80000001 & 1);
    if (!(unsigned int)v14)
        return v14;
    v15 = sub_a6f85c(a1, a2, "validate-legacy", __ROL__(a0->field_40, 30) & 0xc0000001 & 1);
    if (!(unsigned int)v15)
        return v15;
    if (a0->field_48)
    {
        v16 = sub_a6f90c(a1, a2, "digest");
        if (!(unsigned int)v16)
            return v16;
    }
    if (!a0->field_50)
        return 1;
    v17 = sub_a6f90c(a1, a2, "properties");
    if (!(unsigned int)v17)
        return v17;
    return 1;
}
