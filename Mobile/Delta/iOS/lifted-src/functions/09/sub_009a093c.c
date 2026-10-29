/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a093c..0x9a0ba8 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a093c_1 {
    char padding_0[128];
    unsigned long long field_80;
    unsigned long long field_88;
} st_9a093c_1;

typedef struct st_9a093c_0 {
    char padding_0[2176];
    struct st_9a093c_1 *field_880;
} st_9a093c_0;

typedef struct st_9a093c_5 {
    char padding_0[24];
    struct st_9a093c_4 *field_18;
} st_9a093c_5;

typedef struct st_9a093c_3 {
    char padding_0[12];
    unsigned int field_c;
    char padding_10[8];
    struct st_9a093c_4 *field_18;
} st_9a093c_3;

typedef struct st_9a093c_4 {
    unsigned long long field_0;
} st_9a093c_4;

typedef struct st_9a093c_2 {
    unsigned short field_0;
    char padding_2[6];
    unsigned int field_8;
} st_9a093c_2;


unsigned long long sub_9a093c(st_9a093c_0 *a0, unsigned long long a1, long long a2, unsigned long long a3, unsigned long long a4, long long a5)
{
    unsigned long long *v7;  // x26
    unsigned long long v8;  // x25
    unsigned long long v9;  // x27
    unsigned long v10;  // x22
    st_9a093c_2 *v11;  // x23
    unsigned long long v12;  // x8
    st_9a093c_3 *v13;  // x8
    unsigned long v14;  // x9
    st_9a093c_5 *v15;  // x9
    st_9a093c_5 *v16;  // x9
    unsigned long v0;  // [bp-0x90]
    unsigned long long v1;  // [bp-0x88]
    unsigned long long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x78]
    unsigned long long v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = a3;
    v2 = a4;
    v7 = a0->field_880;
    if (!v7[0x11])
        return 1;
    v8 = 0;
    v9 = 0;
    do
    {
        v3 = 0;
        v4 = 0;
        v10 = v7[16];
        v11 = v10 + v8;
        if (sub_99b118(a0, v11->field_8, a1, a5) && (!((unsigned int)a1 & 0x11f00) || *(char *)(v10 + v8 + 12) & 1))
        {
            v12 = *(long long *)(v10 + v8 + 16);
            if (!(a1 >> 7 & 1))
            {
                if (v12)
                {
                    v0 = *(long long *)(v10 + v8 + 32);
                    v12();
                }
            }
            else
            {
                if (v12)
                {
                    v0 = *(long long *)(v10 + v8 + 32);
                    v12();
                }
                else if (sub_c68d5c(a2, v11->field_0, 2) && sub_c6876c(a2, 2) && (!v3 || sub_a6ebd4(a2, v4)) && sub_a6e970(a2))
                {
                    if (a1 >> 7 & 1)
                    {
                        v13 = v10 + v8;
                        v14 = v13->field_c;
                        if (!(v14 >> 1 & 1))
                        {
                            v13->field_c = (unsigned int)v14 | 2;
                        }
                        else if (v13->field_18)
                        {
                            v13->field_18();
                        }
                        else if (a1 >> 15 & 1)
                        {
                            return 0;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/extensions_cust.c", 0xee, "custom_ext_add");
                            sub_9a58a4(a0, 80, 0xc0103, 0);
                            return 0;
                        }
                    }
                    v15 = v10 + v8;
                    if (v15->field_18)
                        v15->field_18();
                }
                else
                {
                    v16 = v10 + v8;
                    if (v16->field_18)
                    {
                        v16->field_18();
                    }
                    else if (!(a1 >> 15 & 1))
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/extensions_cust.c", 226, "custom_ext_add");
                        sub_9a58a4(a0, 80, 0xc0103, 0);
                        return 0;
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
        }
    } while ((v9 += 1, v8 += 56, v7[0x11] > v9));
    return 1;
}
