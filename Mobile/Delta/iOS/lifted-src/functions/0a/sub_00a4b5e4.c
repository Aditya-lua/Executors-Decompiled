/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4b5e4..0xa4b87c (664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4b5e4_0 {
    char padding_0[92];
    char field_5c;
} st_a4b5e4_0;

extern char g_def180;
extern char g_def200;

unsigned int sub_a4b5e4(st_a4b5e4_0 *a0, char *a1, char *iter, unsigned int a3, unsigned int a4)
{
    char *v0;  // x8
    char *v1;  // x9
    unsigned long long v10;  // w13
    unsigned int v11;  // x14
    unsigned long long v12;  // w14
    unsigned int v13;  // x15
    unsigned long long v14;  // w15
    unsigned int v15;  // x16
    unsigned long long v16;  // w16
    unsigned int v17;  // w14
    unsigned int v18;  // w15
    char *v19;  // x13
    unsigned int v2;  // w3
    unsigned int v20;  // x11
    unsigned long long v21;  // w11
    unsigned int v22;  // x12
    unsigned long long v23;  // x12
    unsigned int v24;  // x13
    unsigned long long v25;  // w13
    unsigned int v26;  // x9
    unsigned long long v27;  // w9
    unsigned long long v28;  // x8
    unsigned long long v29;  // x11
    unsigned int v3;  // x10
    unsigned long long v30;  // 4156
    unsigned int v31;  // w12
    unsigned long long v32;  // x9
    char v33;  // x8
    unsigned long v4;  // x11
    unsigned int v5;  // x14
    unsigned int v6;  // w10
    unsigned int i;  // w11
    unsigned int v8;  // w10
    unsigned int v9;  // x13

    if (!a0 || !(a0->field_5c >> 1 & 1))
    {
        v0 = &g_def200;
        if (1 <= (int)a3)
            goto LABEL_a4b614;
    }
    else
    {
        v0 = &g_def180;
        if ((int)a3 >= 1)
        {
LABEL_a4b614:
            v1 = &iter[a3];
            while (1)
            {
                v2 = a3;
                v3 = *iter;
                if (v3 < 0 || (a3 = v2, v0[v3] != 224))
                    break;
                iter += 1;
                a3 = v2 - 1;
                if (1 >= (int)v2)
                {
                    a3 = 0;
                    iter = v1;
                    goto LABEL_a4b644;
                }
            }
        }
    }
LABEL_a4b644:
    v4 = a3;
    if ((int)a3 >= 3)
        a3 = 3;
    do
    {
        if ((int)v4 >= 4)
        {
            v5 = *(&iter[v4] - 1);
            if (v5 < 0)
            {
                v6 = v4;
                if (v6 & 3)
                    return 0xffffffff;
            }
        }
        else
        {
            v6 = a3;
            if (v6 & 3)
                return 0xffffffff;
        }
    } while ((v6 = v4, v4 -= 1, (v0[v5] & 236) == 224));
    if (v6 & 3)
        return 0xffffffff;
    if (!v6)
        return 0;
    if ((int)v6 >= 5)
    {
        i = 0;
        v8 = 3;
        do
        {
            v9 = *iter;
            if (v9 >= 0)
            {
                v10 = v0[v9];
                v11 = iter[1];
                if (v11 < 0)
                    goto LABEL_a4b704;
                goto LABEL_a4b6d8;
            }
            else
            {
                v10 = 0xff;
                v11 = iter[1];
                if (v11 >= 0)
                {
LABEL_a4b6d8:
                    v12 = v0[v11];
                    v13 = iter[2];
                    if (v13 < 0)
                        goto LABEL_a4b710;
                    goto LABEL_a4b6e4;
                }
                else
                {
LABEL_a4b704:
                    v12 = 0xff;
                    v13 = iter[2];
                    if (v13 >= 0)
                    {
LABEL_a4b6e4:
                        v14 = v0[v13];
                        v15 = iter[3];
                        if (v15 < 0)
                            goto LABEL_a4b71c;
                        goto LABEL_a4b6f0;
                    }
                    else
                    {
LABEL_a4b710:
                        v14 = 0xff;
                        v15 = iter[3];
                        if (v15 >= 0)
                        {
LABEL_a4b6f0:
                            v16 = v0[v15];
                            continue;
                        }
                        else
                        {
LABEL_a4b71c:
                            v16 = 0xff;
                        }
                    }
                }
            }
            if ((v12 | v10 | v14 | v16) >> 7 & 1)
                return 0xffffffff;
            iter += 4;
            v17 = v12 * 0x1000;
            v18 = v14 * 64;
            *a1 = (v17 | v10 * 0x40000) >> 16;
            a1[1] = (v18 | v17) >> 8;
            v19 = a1 + 3;
            a1[2] = (char)v16 | (char)v18;
            i += 4;
            v8 += 3;
            a1 = v19;
        } while ((int)i < (int)(v6 - 4));
        a1 = v19;
        v20 = *iter;
        if (v20 >= 0)
            goto LABEL_a4b7c0;
LABEL_a4b780:
        v21 = 0xff;
        v22 = iter[1];
        if (v22 >= 0)
            goto LABEL_a4b7cc;
LABEL_a4b78c:
        v23 = 0xff;
        v24 = iter[2];
        if (v24 >= 0)
            goto LABEL_a4b7d8;
LABEL_a4b798:
        v25 = 0xff;
        v26 = iter[3];
        if (v26 >= 0)
            goto LABEL_a4b7e4;
        goto LABEL_a4b7a4;
    }
    else
    {
        v8 = 3;
        v20 = *iter;
        if (v20 < 0)
            goto LABEL_a4b780;
LABEL_a4b7c0:
        v21 = v0[v20];
        v22 = iter[1];
        if (v22 < 0)
            goto LABEL_a4b78c;
LABEL_a4b7cc:
        v23 = v0[v22];
        v24 = iter[2];
        if (v24 < 0)
            goto LABEL_a4b798;
LABEL_a4b7d8:
        v25 = v0[v24];
        v26 = iter[3];
        if (v26 < 0)
        {
LABEL_a4b7a4:
            v27 = 0xff;
        }
        else
        {
LABEL_a4b7e4:
            v27 = v0[v26];
        }
    }
    if (((unsigned int)v23 | v21 | v25 | v27) >> 7 & 1)
        return 0xffffffff;
    v28 = (v23 * 0x1000 | v23 >> 52) & 0xffffffff000 & 0xfffffffffff | v21 * 0x40000;
    v29 = v27 | v25 * 64;
    v30 = arm64g_calculate_condition(0x11, a4, 1, 0);
    if (!(v30 & 1))
    {
        v31 = v25 == 61;
        if (v27 != 61)
            a4 = v31 & 1;
        else
            a4 = v31 + 1;
    }
    v32 = v29 | v28;
    v33 = v28 >> 16;
    if (!a4)
    {
        *a1 = v33;
        a1[1] = v32 >> 8;
        a1[2] = v29;
        return v8 - a4;
    }
    else if (a4 == 1)
    {
        *a1 = v33;
        a1[1] = v32 >> 8;
        return v8 - a4;
    }
    else
    {
        *a1 = v33;
        return v8 - a4;
    }
}
