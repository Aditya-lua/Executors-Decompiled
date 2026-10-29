/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96b14c..0x96b360 (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96b14c_2 {
    unsigned int field_0;
    char padding_4[212];
    struct st_96b14c_1 *field_d8;
} st_96b14c_2;

typedef struct st_96b14c_4 {
    char padding_0[28];
    unsigned short field_1c;
} st_96b14c_4;

typedef struct st_96b14c_0 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[2];
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    int field_20;
} st_96b14c_0;

typedef struct st_96b14c_1 {
    char padding_0[80];
    char field_50;
} st_96b14c_1;

typedef struct st_96b14c_3 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    struct st_96b14c_2 *field_18;
    char padding_20[1016];
    int field_418;
    unsigned int field_41c;
} st_96b14c_3;


char sub_96b14c(st_96b14c_3 *a0, long long a1, st_96b14c_0 *a2)
{
    unsigned long long v12;  // x26
    unsigned long long v13;  // x25
    st_96b14c_0 *v22;  // x25
    st_96b14c_3 *v23;  // x8
    st_96b14c_3 *v24;  // x8
    st_96b14c_2 *v25;  // x9
    char v26;  // x0
    unsigned int v27;  // w21
    char v28;  // x23
    st_96b14c_4 *v29;  // x24
    long long v30;  // x0
    unsigned long v31;  // x8
    unsigned long long v14;  // x24
    unsigned long long v15;  // x23
    unsigned long long v16;  // x22
    unsigned long long v17;  // x21
    unsigned long long v18;  // x20
    unsigned long long v19;  // x19
    unsigned long long v20;  // x30
    st_96b14c_3 *v21;  // x20
    unsigned short v0;  // [bp-0x52]
    unsigned long long v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    if (!a2)
    {
        return 0;
    }
    else if (*(int *)&a2[1].padding_0[8])
    {
        v1 = v12;
        v2 = v13;
        v3 = v14;
        v4 = v15;
        v5 = v16;
        v6 = v17;
        v7 = v18;
        v8 = v19;
        v9 = &v11;
        v10 = v20;
        if (a0->field_18->field_d8->field_50 >> 3 & 1 || ((int)a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000 || a2->field_1c != 116) && (*(int *)&a0->padding_20[88] || a0->field_418 < 772 || a2->field_1c != 116 && (10 < a2->field_18 || !(1 << ((char)a2->field_18 & 31) & 1027))))
        {
            v21 = a0;
            v22 = a2;
            if (!sub_95c3fc(a0->field_8, a2->field_20))
            {
                v23 = v21;
                if (v22->field_1c - 979 >= 2)
                {
                    v24 = v23;
                    if (v22->field_1c != 811)
                    {
                        v30 = sub_969f28(v24->field_8);
                        v31 = v22->field_10;
                        v0 = (((((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        return sub_959e54(v24, a1, v30, v22->field_14, &v0);
                    }
                }
                v25 = v23->field_18;
                if (*(int *)&v23->padding_20[88])
                {
                    v24 = v23;
                    if (v25->field_d8->field_50 >> 3 & 1)
                    {
                        v30 = sub_969f28(v24->field_8);
                        v31 = v22->field_10;
                        v0 = (((((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        return sub_959e54(v24, a1, v30, v22->field_14, &v0);
                    }
                    v24 = v23;
                    if ((int)v25->field_0 < 772)
                    {
                        v30 = sub_969f28(v24->field_8);
                        v31 = v22->field_10;
                        v0 = (((((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        return sub_959e54(v24, a1, v30, v22->field_14, &v0);
                    }
                    v24 = v23;
                    if (v25->field_0 == 0x10000)
                    {
                        v30 = sub_969f28(v24->field_8);
                        v31 = v22->field_10;
                        v0 = (((((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        return sub_959e54(v24, a1, v30, v22->field_14, &v0);
                    }
                }
                else
                {
                    v24 = v23;
                    if (v25->field_0 != 0x10000)
                    {
                        v30 = sub_969f28(v24->field_8);
                        v31 = v22->field_10;
                        v0 = (((((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        return sub_959e54(v24, a1, v30, v22->field_14, &v0);
                    }
                    v24 = v23;
                    if ((int)v24->field_41c < 772)
                    {
                        v30 = sub_969f28(v24->field_8);
                        v31 = v22->field_10;
                        v0 = (((((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        return sub_959e54(v24, a1, v30, v22->field_14, &v0);
                    }
                    else if (0x303 >= v23->field_418)
                    {
                        v26 = sub_96125c(v23);
                        if (!v26)
                            return v26;
                        v27 = sub_ad69e4();
                        if ((int)v27 >= 1)
                        {
                            v28 = 0;
                            while (1)
                            {
                                v29 = sub_ad69f8(v26, v28);
                                if (!sub_96a23c(v21, v29, 0x10001, 0) && v29->field_1c & 528)
                                    break;
                                v28 += 1;
                                if (v27 == v28)
                                    return 0;
                            }
                        }
                        else
                        {
                            v28 = 0;
                        }
                        v24 = v21;
                        if (v28 != v27)
                        {
                            v30 = sub_969f28(v24->field_8);
                            v31 = v22->field_10;
                            v0 = (((((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v31 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v31 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                            return sub_959e54(v24, a1, v30, v22->field_14, &v0);
                        }
                    }
                }
            }
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
