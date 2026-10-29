/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcd8ac..0xcdbd0 (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cd8ac_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int field_10;
    char padding_14[12];
    long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    char padding_38[104];
    unsigned long long field_a0;
    unsigned long long field_a8;
    char padding_b0[16];
    unsigned long long field_c0;
    char padding_c8[8];
    struct st_cd8ac_1 *field_d0;
} st_cd8ac_0;

typedef struct st_cd8ac_3 {
    char padding_0[320];
    struct st_cd8ac_0 *field_140;
} st_cd8ac_3;

typedef struct st_cd8ac_1 {
    unsigned long long field_0;
} st_cd8ac_1;

typedef struct st_cd8ac_2 {
    char field_0;
} st_cd8ac_2;

extern unsigned long long g_e6d760;
extern unsigned long long g_e6d7c8;
extern unsigned long long g_e6d8a0;

unsigned long long sub_cd8ac(st_cd8ac_3 *a0, long long a1, unsigned long long a2)
{
    st_cd8ac_0 *v4;  // x23
    unsigned long long v5;  // x8
    unsigned long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // w20
    unsigned long long v17;  // x8
    unsigned long long v18;  // x22
    unsigned long long v19;  // x19
    unsigned long long v6;  // x9
    unsigned long v7;  // x10
    unsigned long long v8;  // x19
    unsigned int v9;  // w21
    unsigned long long v10;  // x8
    unsigned long long i;  // x21
    unsigned long long v12;  // x22
    unsigned long long v13;  // x8
    st_cd8ac_2 **v0;  // [bp-0x70], Other Possible Types: char
    st_cd8ac_2 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return 0xffffff9a;
    v4 = a0->field_140;
    if (v4)
    {
        if (!v4->padding_0)
        {
            return 0xffffff9c;
        }
        else if (a2)
        {
            v4->field_20 = a1;
            *(unsigned int *)&v4->field_28 = a2;
            v5 = a2;
            v6 = v4->field_c0;
            if (v5 > v6 && !*(int *)&v4[1].padding_38[40])
            {
                *(unsigned int *)&v4->field_28 = v6;
                a2 = (unsigned int)v6;
            }
            v7 = v4->field_10;
            if (v5 > *(long long *)&v4->padding_b0[8] + v7 && *(int *)&v4[1].padding_38[40])
            {
                a2 = (unsigned int)v7 + (int)*(long long *)&v4->padding_b0[8];
                *(unsigned int *)&v4->field_28 = a2;
            }
            v8 = 0;
            if (a2)
            {
                while (1)
                {
                    v9 = v4->field_10;
                    if (v9)
                    {
                        v10 = *(long long *)&v4[1].padding_38[24];
                        if (v10)
                            goto LABEL_cd9e8;
                    }
                    else
                    {
                        if (*(long long *)&v4->padding_b0[8])
                        {
                            if (!sub_cd068())
                                v4->field_d0();
                            return 0xffffffff;
                        }
                        v9 = 0;
                        v10 = *(long long *)&v4[1].padding_38[24];
                        if (v10)
                        {
LABEL_cd9e8:
                            if (!*(int *)&v4[1].padding_38[40])
                            {
                                if (v10 != 12)
                                {
                                    v15 = sub_b616c4(&v4->field_8, 2);
                                    v16 = (unsigned int)v15;
                                    if (!(v15 >> 31 & 1) && *(long long *)&v4->padding_38[0])
                                        v16 = 0xfffffffd;
                                    v17 = v4->field_30;
                                    if (v17 < v4->field_30)
                                        v17 += 0x100000000;
                                    v18 = v17 - v4->field_30;
                                    v4->field_a0 = v18 + v4->field_a0;
                                    v4->field_a8 = sub_b603e8();
                                    v4->field_c0 = v4->field_c0 - v18;
                                    if (!v16)
                                    {
                                        goto *((void *)(g_e6d8a0));
                                    }
                                    else if (v16 == 1)
                                    {
                                        goto *((void *)(g_e6d7c8));
                                    }
                                    else
                                    {
                                        goto *((void *)(g_e6d760));
                                    }
                                }
                                if (!(int)v4->field_28)
                                    break;
                                else
                                    continue;
                            }
                        }
                    }
                    if (!v9 && !*(long long *)&v4->padding_b0[8])
                        return v8;
                    if ((unsigned int)v4->field_28 < v9)
                        i = (unsigned int)v4->field_28;
                    else
                        i = v9;
                    if (!(unsigned int)i)
                    {
                        v12 = 0;
                    }
                    else
                    {
                        v13 = 0;
                        do
                        {
                            *(char *)(v4->field_20 + v13) = *(char *)(v4->field_8 + v13);
                            v13 += 1;
                        } while (i != v13);
                        v12 = i;
                    }
                    v14 = v4->field_a8;
                    v4->field_a0 = v4->field_a0 + v12;
                    v4->field_a8 = sub_b603e8(v14, v4->field_20, i);
                    v4->field_c0 = v4->field_c0 - v12;
                    v4->field_10 = v4->field_10 - i;
                    *(unsigned int *)&v4->field_28 = (unsigned int)v4->field_28 - i;
                    v4->field_20 = v4->field_20 + v12;
                    v4->field_8 = v4->field_8 + v12;
                    v8 += i;
                    v4->field_30 = v4->field_30 + v12;
                    if (!(int)v4->field_28)
                        break;
                }
            }
            v19 = v8 & 0xffffffff;
            return v19;
        }
        else
        {
            return 0;
        }
    }
    return 0xffffff9a;
}
