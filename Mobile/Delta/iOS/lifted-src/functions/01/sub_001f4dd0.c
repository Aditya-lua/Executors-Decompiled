/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f4dd0..0x1f51c4 (1012 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f4dd0_1 {
    char padding_0[4];
    unsigned int field_4;
} st_1f4dd0_1;

typedef struct st_1f4dd0_0 {
    char field_0;
} st_1f4dd0_0;

extern unsigned long long g_e79148;
extern unsigned long long g_e79158;
extern unsigned long long g_e791a8;
extern unsigned long long g_e791d8;
extern unsigned long long g_e79208;
extern unsigned long long g_e79210;
extern unsigned long long g_e79218;
extern unsigned long long g_e79220;
extern unsigned long long g_e79230;
extern char g_10002b0;

void sub_1f4dd0(unsigned long long *a0, long long a1, unsigned long a2, unsigned long long *a3, unsigned int a4, unsigned int a5)
{
    unsigned long long v17;  // x28
    unsigned long long v18;  // x27
    unsigned long long v27;  // x30
    st_1f4dd0_1 *v28;  // x19
    unsigned int v29;  // x9
    unsigned int v30;  // w8
    unsigned long long *v31;  // x9
    unsigned long v32;  // cc_op
    unsigned long v33;  // cc_dep1
    unsigned long v34;  // cc_dep2
    unsigned long long v35;  // 4112
    unsigned long long v36;  // 4105
    unsigned long long v19;  // x26
    unsigned long long v37;  // 4112
    unsigned long long v38;  // 4105
    unsigned long long *v39;  // x8
    unsigned long long *v40;  // x8
    unsigned long long v20;  // x25
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned long long v26;  // x19
    unsigned int v0;  // [bp-0x9c]
    st_1f4dd0_0 **v1;  // [bp-0x98], Other Possible Types: char
    st_1f4dd0_0 *v2;  // [bp-0x90]
    unsigned long v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = &v16;
    v15 = v27;
    v0 = 0;
    v3 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    if (*(char *)(*a3 + a2))
    {
        goto *((void *)(g_e79218));
    }
    else
    {
        v28 = *a0 + 40 * a2;
        *(char *)(*a3 + a2) = 1;
        v29 = *(long long *)&v28[4];
        v30 = (unsigned int)v28->padding_0;
        if (v29)
        {
            if (16 < v30)
            {
LABEL_1f4ee0:
                sub_1f4dd0(a0, a1, v29 + a2, a3, a4, a5); /* do not return */
            }
            if (1 << ((char)v30 & 31) & 70304)
            {
                v31 = &g_e79220;
                v32 = 3;
                v33 = v30;
                v34 = 15;
                if (v30 != 15)
                    goto LABEL_1f4f38;
            }
            else
            {
                switch (v30)
                {
                case 11:
                    if (v28->field_4 == a4)
                    {
                        v30 = 11;
                        goto LABEL_1f4f74;
                    }
                    goto LABEL_1f4ee0;
                case 15:
                    v32 = 4;
                    v33 = *(long long *)&v28[3];
                    v34 = v29;
                    if (*(long long *)&v28[3] != v29)
                        goto LABEL_1f4ee0;
                    v30 = 15;
                    break;
                default:
                    goto LABEL_1f4ee0;
                }
            }
        }
        else
        {
            v31 = &g_e79220;
            if (!v30)
                v31 = &g_e79148;
            if (v30 == 2)
                v31 = &g_e791d8;
            v32 = 3;
            v33 = v30;
            v34 = 15;
            if (v30 != 15)
                goto LABEL_1f4f38;
        }
        v31 = &g_e79208;
LABEL_1f4f38:
        if ((v30 & 0xfffffffe) != 18)
        {
            v35 = arm64g_calculate_condition(v32 | 16, v33, v34, 0);
            v36 = arm64g_calculate_condition(3, (v35 & 1 ? v30 : 0x40000000), (v35 & 1 ? 20 : 0), 0);
            if (!(v36 & 1))
                goto LABEL_1f4f46;
LABEL_1f4f45:
            v31 = &g_e791a8;
        }
        else
        {
            v37 = arm64g_calculate_condition(v32 | 16, v33, v34, 0);
            v38 = arm64g_calculate_condition(0, (v37 & 1 ? v30 : 0x40000000), (v37 & 1 ? 20 : 0), 0);
            if (v38 & 1)
                goto LABEL_1f4f45;
LABEL_1f4f46:
        }
        if (v30 == 16)
            v31 = &g_e79210;
        switch (v30)
        {
        case 11:
LABEL_1f4f74:
            v40 = &g_e79158;
            if (v30 != 21)
                v40 = &g_e79230;
            goto *((void *)(*v40));
        case 21:
            v39 = &g_e79158;
            break;
        default:
            v39 = &g_e79158;
            v39 = v31;
            break;
        }
        goto *((void *)(*v39));
    }
}
