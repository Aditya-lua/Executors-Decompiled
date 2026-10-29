/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fa588..0x1fa874 (748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fa588_1 {
    int field_0;
    unsigned int field_4;
} st_1fa588_1;

typedef struct st_1fa588_0 {
    char field_0;
} st_1fa588_0;

extern unsigned long long g_e78c00;
extern unsigned long long g_e78cf8;

unsigned long long sub_1fa588(unsigned long long *a0, unsigned long long a1, long long a2)
{
    st_1fa588_1 *v13;  // x25
    int v14;  // w8
    unsigned long long v15;  // x23
    unsigned long long v16;  // x27
    unsigned long long v17;  // x0
    unsigned long long v18;  // w0
    unsigned long long v19;  // 4116
    unsigned int v20;  // w0
    unsigned int *v21;  // x8
    unsigned long long v22;  // x0
    unsigned long long v0;  // [bp-0xb8]
    unsigned long v1;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned int v2;  // [bp-0xac]
    unsigned int v3;  // [bp-0xa8]
    unsigned long long v4;  // [bp-0xa4]
    st_1fa588_0 **v5;  // [bp-0xa0], Other Possible Types: char
    st_1fa588_0 *v6;  // [bp-0x98]
    unsigned long long v7;  // [bp-0x90]
    unsigned long long v8;  // [bp-0x88]
    unsigned long long v9;  // [bp-0x80]
    char v10;  // [bp-0x78]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v0 = 0;
    v1 = 0;
    v6 = &v5;
    v7 = 0;
    v5 = &v6;
    v8 = 0;
    v9 = 0;
    v3 = 0xffffffff;
    v4 = 0;
    if (a0[1] > a1)
    {
        v13 = *a0 + 40 * a1;
        v14 = v13->field_0;
        if (v14 <= 14)
        {
            switch (v14)
            {
            case 3:
                if (!*(long long *)&v13[4] && v13->field_4 != 43)
                    goto *((void *)(g_e78cf8));
                break;
            case 9:
                goto *((void *)(g_e78cf8));
            case 11:
                goto *((void *)(g_e78cf8));
            default:
                break;
            }
        }
        else if (3 > (unsigned int)(v14 - 18))
        {
            goto *((void *)(g_e78cf8));
        }
        else if (2 > (unsigned int)(v14 - 15))
        {
            goto *((void *)(g_e78c00));
        }
        v15 = sub_1f3a30(a0, a0, a1);
        if (v15 && v15 != a1)
        {
            v8 = 0;
            sub_1ecbe0(&v10, a0[1]);
            sub_1f2330(&v10);
            v17 = sub_1f4dd0(a0, &v7, a1, &v10, 0, 0);
            sub_1eccac(&v10);
            if (!(v17 & 1))
            {
                v18 = (unsigned int)sub_1f349c(a0, a1, v15);
                v19 = arm64g_calculate_condition(0x11, v18, 1, 0);
                if (v19 & 1)
                {
LABEL_1fa72c:
                    v20 = sub_1ed9a0(&v7);
                    if (v3 >= v20 + (unsigned int)v1)
                    {
                        v3 = v20;
                        v4 += 1;
                        v2 = *(unsigned int *)((void*)&v1 + 4);
                        v0 = a1;
                    }
                    if (v18 != 1)
                    {
                        switch (v16)
                        {
                        case 6:
                            v21 = *a0 + 40 * a1;
                            if (v21[20] == 4)
                            {
                                if (v21[22] == v21[23] && sub_1fd084(v21 + 50) & 1)
                                    goto *((void *)(g_e78cf8));
                            }
                            else
                            {
                                goto *((void *)(g_e78cf8));
                            }
                            goto LABEL_1fa7cc;
                        case 1:
                            if (sub_1fd084(v13) & 1)
                                goto *((void *)(g_e78cf8));
                        default:
LABEL_1fa7cc:
                            goto *((void *)(g_e78cf8));
                        }
                    }
                }
                else if (v3 >= 5)
                {
                    *(unsigned int *)&v1 = (unsigned int)v1 + 1;
                    goto LABEL_1fa72c;
                }
            }
        }
        goto *((void *)(g_e78c00));
    }
    else
    {
        if (v4 >= 2)
            v22 = sub_1f9868(a0, v0, *(unsigned int *)((void*)&v1 + 4), a2);
        else
            v22 = 0;
        sub_1eccac(&v7);
        return v22;
    }
}
