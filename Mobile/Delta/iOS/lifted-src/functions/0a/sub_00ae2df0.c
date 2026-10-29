/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae2df0..0xae2f58 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae2df0_0 {
    struct st_ae2df0_0 *field_0;
    struct st_ae2df0_0 *field_8;
} st_ae2df0_0;

extern long long g_ae2f58;
extern long long g_eb5700;
extern long long g_eb5788;
extern long long g_eb5810;

int sub_ae2df0(st_ae2df0_0 *a0, st_ae2df0_0 *a1, st_ae2df0_0 *a2, st_ae2df0_0 *a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_ae2df0_0 *v17;  // x20
    st_ae2df0_0 *v18;  // x0
    st_ae2df0_0 *v19;  // x8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_ae2df0_0 *iter;  // x19
    st_ae2df0_0 *v13;  // x0
    st_ae2df0_0 *v14;  // x0
    st_ae2df0_0 *v15;  // x22
    st_ae2df0_0 *v16;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        iter = a0;
        if (a1)
        {
            if (a1 == 1)
            {
                iter = &iter->field_8;
                goto LABEL_ae2e18;
            }
            goto LABEL_ae2f44;
        }
LABEL_ae2e18:
        if (iter->field_0)
        {
            if ((int)iter->field_0->field_0 == 1)
                goto LABEL_ae2e7c;
            goto LABEL_ae2f44;
        }
        else
        {
            a0 = sub_9cde20(&g_eb5810);
            iter->field_0 = a0;
            if (a0)
            {
                v13 = sub_ad6270(&g_ae2f58);
                iter->field_0->field_8 = v13;
                v14 = iter->field_0;
                if (v14->field_8)
                {
                    *(unsigned int *)&v14->field_0 = 1;
LABEL_ae2e7c:
                    v15 = a2;
                    v16 = a3;
                    a0 = sub_9cde20(&g_eb5788);
                    if (a0)
                    {
                        v17 = a0;
                        if (!sub_ad6458(iter->field_0->field_8, 1))
                        {
LABEL_ae2f34:
                            sub_9cd960(v17, &g_eb5788);
LABEL_ae2f44:
                            a0 = 0;
                        }
                        else if (v16)
                        {
                            *(unsigned int *)&v17->field_0 = 1;
                            v18 = sub_9cde20(&g_eb5700);
                            v17->field_8 = v18;
                            if (v18)
                            {
                                sub_9cf124(v18->field_0);
                                v17->field_8->field_0 = v15;
                                sub_9cf124(v17->field_8->field_8);
                                v19 = v17->field_8;
                                goto LABEL_ae2f14;
                            }
                            goto LABEL_ae2f34;
                        }
                        else
                        {
                            *(unsigned int *)&v17->field_0 = 0;
                            v19 = v17;
                            v16 = v15;
LABEL_ae2f14:
                            v19->field_8 = v16;
                            if (!sub_ad68a0(iter->field_0->field_8, v17))
                                goto LABEL_ae2f34;
                            a0 = 1;
                        }
                    }
                }
                else
                {
                    sub_9cd960(v14, &g_eb5810);
                    a0 = 0;
                    iter->field_0 = 0;
                }
            }
        }
    }
    return (unsigned int)a0;
}
